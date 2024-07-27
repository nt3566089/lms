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
 * The abstract condition-query of e_shipping_inst.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEShippingInstCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEShippingInstCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "e_shipping_inst";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_Equal(Long shippingInstId) {
        doSetShippingInstId_Equal(shippingInstId);
    }

    protected void doSetShippingInstId_Equal(Long shippingInstId) {
        regShippingInstId(CK_EQ, shippingInstId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_NotEqual(Long shippingInstId) {
        doSetShippingInstId_NotEqual(shippingInstId);
    }

    protected void doSetShippingInstId_NotEqual(Long shippingInstId) {
        regShippingInstId(CK_NES, shippingInstId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_GreaterThan(Long shippingInstId) {
        regShippingInstId(CK_GT, shippingInstId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_LessThan(Long shippingInstId) {
        regShippingInstId(CK_LT, shippingInstId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_GreaterEqual(Long shippingInstId) {
        regShippingInstId(CK_GE, shippingInstId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstId The value of shippingInstId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstId_LessEqual(Long shippingInstId) {
        regShippingInstId(CK_LE, shippingInstId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstId(), "SHIPPING_INST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstIdList The collection of shippingInstId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstId_InScope(Collection<Long> shippingInstIdList) {
        doSetShippingInstId_InScope(shippingInstIdList);
    }

    protected void doSetShippingInstId_InScope(Collection<Long> shippingInstIdList) {
        regINS(CK_INS, cTL(shippingInstIdList), xgetCValueShippingInstId(), "SHIPPING_INST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingInstIdList The collection of shippingInstId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstId_NotInScope(Collection<Long> shippingInstIdList) {
        doSetShippingInstId_NotInScope(shippingInstIdList);
    }

    protected void doSetShippingInstId_NotInScope(Collection<Long> shippingInstIdList) {
        regINS(CK_NINS, cTL(shippingInstIdList), xgetCValueShippingInstId(), "SHIPPING_INST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstId_IsNull() { regShippingInstId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingInstId_IsNotNull() { regShippingInstId(CK_ISNN, DOBJ); }

    protected void regShippingInstId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstId(), "SHIPPING_INST_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstId();

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
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_Equal(String salesOrderNo) {
        doSetSalesOrderNo_Equal(fRES(salesOrderNo));
    }

    protected void doSetSalesOrderNo_Equal(String salesOrderNo) {
        regSalesOrderNo(CK_EQ, salesOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_NotEqual(String salesOrderNo) {
        doSetSalesOrderNo_NotEqual(fRES(salesOrderNo));
    }

    protected void doSetSalesOrderNo_NotEqual(String salesOrderNo) {
        regSalesOrderNo(CK_NES, salesOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_GreaterThan(String salesOrderNo) {
        regSalesOrderNo(CK_GT, fRES(salesOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_LessThan(String salesOrderNo) {
        regSalesOrderNo(CK_LT, fRES(salesOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_GreaterEqual(String salesOrderNo) {
        regSalesOrderNo(CK_GE, fRES(salesOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_LessEqual(String salesOrderNo) {
        regSalesOrderNo(CK_LE, fRES(salesOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNoList The collection of salesOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_InScope(Collection<String> salesOrderNoList) {
        doSetSalesOrderNo_InScope(salesOrderNoList);
    }

    protected void doSetSalesOrderNo_InScope(Collection<String> salesOrderNoList) {
        regINS(CK_INS, cTL(salesOrderNoList), xgetCValueSalesOrderNo(), "SALES_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNoList The collection of salesOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_NotInScope(Collection<String> salesOrderNoList) {
        doSetSalesOrderNo_NotInScope(salesOrderNoList);
    }

    protected void doSetSalesOrderNo_NotInScope(Collection<String> salesOrderNoList) {
        regINS(CK_NINS, cTL(salesOrderNoList), xgetCValueSalesOrderNo(), "SALES_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderNo The value of salesOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderNo_LikeSearch(String salesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderNo), xgetCValueSalesOrderNo(), "SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderNo_NotLikeSearch(String salesOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderNo), xgetCValueSalesOrderNo(), "SALES_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     * @param salesOrderNo The value of salesOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderNo_PrefixSearch(String salesOrderNo) {
        setSalesOrderNo_LikeSearch(salesOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNull() { regSalesOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNullOrEmpty() { regSalesOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_NO: {VARCHAR(30)}
     */
    public void setSalesOrderNo_IsNotNull() { regSalesOrderNo(CK_ISNN, DOBJ); }

    protected void regSalesOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderNo(), "SALES_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueSalesOrderNo();

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
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_Equal(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_EQ, salesOrderSlipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_NotEqual(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_NES, salesOrderSlipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_InScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_INS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_NotInScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_NINS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_LikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_NotLikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_PrefixSearch(String salesOrderSlipTypeCd) {
        setSalesOrderSlipTypeCd_LikeSearch(salesOrderSlipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNull() { regSalesOrderSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNullOrEmpty() { regSalesOrderSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNotNull() { regSalesOrderSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSalesOrderSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrderSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_Equal(String salesOrderSlipNo) {
        doSetSalesOrderSlipNo_Equal(fRES(salesOrderSlipNo));
    }

    protected void doSetSalesOrderSlipNo_Equal(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_EQ, salesOrderSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_NotEqual(String salesOrderSlipNo) {
        doSetSalesOrderSlipNo_NotEqual(fRES(salesOrderSlipNo));
    }

    protected void doSetSalesOrderSlipNo_NotEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_NES, salesOrderSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_GreaterThan(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_GT, fRES(salesOrderSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_LessThan(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_LT, fRES(salesOrderSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_GreaterEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_GE, fRES(salesOrderSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_LessEqual(String salesOrderSlipNo) {
        regSalesOrderSlipNo(CK_LE, fRES(salesOrderSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNoList The collection of salesOrderSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_InScope(Collection<String> salesOrderSlipNoList) {
        doSetSalesOrderSlipNo_InScope(salesOrderSlipNoList);
    }

    protected void doSetSalesOrderSlipNo_InScope(Collection<String> salesOrderSlipNoList) {
        regINS(CK_INS, cTL(salesOrderSlipNoList), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNoList The collection of salesOrderSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_NotInScope(Collection<String> salesOrderSlipNoList) {
        doSetSalesOrderSlipNo_NotInScope(salesOrderSlipNoList);
    }

    protected void doSetSalesOrderSlipNo_NotInScope(Collection<String> salesOrderSlipNoList) {
        regINS(CK_NINS, cTL(salesOrderSlipNoList), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderSlipNo The value of salesOrderSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderSlipNo_LikeSearch(String salesOrderSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderSlipNo), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderSlipNo_NotLikeSearch(String salesOrderSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderSlipNo), xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     * @param salesOrderSlipNo The value of salesOrderSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipNo_PrefixSearch(String salesOrderSlipNo) {
        setSalesOrderSlipNo_LikeSearch(salesOrderSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNull() { regSalesOrderSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNullOrEmpty() { regSalesOrderSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
     */
    public void setSalesOrderSlipNo_IsNotNull() { regSalesOrderSlipNo(CK_ISNN, DOBJ); }

    protected void regSalesOrderSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderSlipNo(), "SALES_ORDER_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueSalesOrderSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_Equal(String nizoroeNo) {
        doSetNizoroeNo_Equal(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_Equal(String nizoroeNo) {
        regNizoroeNo(CK_EQ, nizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotEqual(String nizoroeNo) {
        doSetNizoroeNo_NotEqual(fRES(nizoroeNo));
    }

    protected void doSetNizoroeNo_NotEqual(String nizoroeNo) {
        regNizoroeNo(CK_NES, nizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterThan(String nizoroeNo) {
        regNizoroeNo(CK_GT, fRES(nizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessThan(String nizoroeNo) {
        regNizoroeNo(CK_LT, fRES(nizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterEqual(String nizoroeNo) {
        regNizoroeNo(CK_GE, fRES(nizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessEqual(String nizoroeNo) {
        regNizoroeNo(CK_LE, fRES(nizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_InScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_InScope(Collection<String> nizoroeNoList) {
        regINS(CK_INS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNoList The collection of nizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        doSetNizoroeNo_NotInScope(nizoroeNoList);
    }

    protected void doSetNizoroeNo_NotInScope(Collection<String> nizoroeNoList) {
        regINS(CK_NINS, cTL(nizoroeNoList), xgetCValueNizoroeNo(), "NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo The value of nizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo_LikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo_NotLikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_PrefixSearch(String nizoroeNo) {
        setNizoroeNo_LikeSearch(nizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNull() { regNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNullOrEmpty() { regNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO: {VARCHAR(30)}
     */
    public void setNizoroeNo_IsNotNull() { regNizoroeNo(CK_ISNN, DOBJ); }

    protected void regNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo(), "NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueNizoroeNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_Equal(String shippingTypeCd) {
        doSetShippingTypeCd_Equal(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_Equal(String shippingTypeCd) {
        regShippingTypeCd(CK_EQ, shippingTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotEqual(String shippingTypeCd) {
        doSetShippingTypeCd_NotEqual(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_NotEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_NES, shippingTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterThan(String shippingTypeCd) {
        regShippingTypeCd(CK_GT, fRES(shippingTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessThan(String shippingTypeCd) {
        regShippingTypeCd(CK_LT, fRES(shippingTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_GE, fRES(shippingTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_LE, fRES(shippingTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_InScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        regINS(CK_INS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_NotInScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        regINS(CK_NINS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingTypeCd The value of shippingTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingTypeCd_LikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingTypeCd_NotLikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_PrefixSearch(String shippingTypeCd) {
        setShippingTypeCd_LikeSearch(shippingTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNull() { regShippingTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNullOrEmpty() { regShippingTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNotNull() { regShippingTypeCd(CK_ISNN, DOBJ); }

    protected void regShippingTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueShippingTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_Equal(String shippingReasonCd) {
        doSetShippingReasonCd_Equal(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_Equal(String shippingReasonCd) {
        regShippingReasonCd(CK_EQ, shippingReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotEqual(String shippingReasonCd) {
        doSetShippingReasonCd_NotEqual(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_NotEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_NES, shippingReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterThan(String shippingReasonCd) {
        regShippingReasonCd(CK_GT, fRES(shippingReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessThan(String shippingReasonCd) {
        regShippingReasonCd(CK_LT, fRES(shippingReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_GE, fRES(shippingReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_LE, fRES(shippingReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_InScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        regINS(CK_INS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_NotInScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        regINS(CK_NINS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingReasonCd The value of shippingReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingReasonCd_LikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingReasonCd_NotLikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_PrefixSearch(String shippingReasonCd) {
        setShippingReasonCd_LikeSearch(shippingReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNull() { regShippingReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNullOrEmpty() { regShippingReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNotNull() { regShippingReasonCd(CK_ISNN, DOBJ); }

    protected void regShippingReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD"); }
    protected abstract ConditionValue xgetCValueShippingReasonCd();

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
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_Equal(String shippingNum) {
        doSetShippingNum_Equal(fRES(shippingNum));
    }

    protected void doSetShippingNum_Equal(String shippingNum) {
        regShippingNum(CK_EQ, shippingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_NotEqual(String shippingNum) {
        doSetShippingNum_NotEqual(fRES(shippingNum));
    }

    protected void doSetShippingNum_NotEqual(String shippingNum) {
        regShippingNum(CK_NES, shippingNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterThan(String shippingNum) {
        regShippingNum(CK_GT, fRES(shippingNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_LessThan(String shippingNum) {
        regShippingNum(CK_LT, fRES(shippingNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_GreaterEqual(String shippingNum) {
        regShippingNum(CK_GE, fRES(shippingNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_LessEqual(String shippingNum) {
        regShippingNum(CK_LE, fRES(shippingNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNumList The collection of shippingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_InScope(Collection<String> shippingNumList) {
        doSetShippingNum_InScope(shippingNumList);
    }

    protected void doSetShippingNum_InScope(Collection<String> shippingNumList) {
        regINS(CK_INS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNumList The collection of shippingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_NotInScope(Collection<String> shippingNumList) {
        doSetShippingNum_NotInScope(shippingNumList);
    }

    protected void doSetShippingNum_NotInScope(Collection<String> shippingNumList) {
        regINS(CK_NINS, cTL(shippingNumList), xgetCValueShippingNum(), "SHIPPING_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingNum The value of shippingNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingNum_LikeSearch(String shippingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingNum), xgetCValueShippingNum(), "SHIPPING_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingNum_NotLikeSearch(String shippingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingNum), xgetCValueShippingNum(), "SHIPPING_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     * @param shippingNum The value of shippingNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingNum_PrefixSearch(String shippingNum) {
        setShippingNum_LikeSearch(shippingNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     */
    public void setShippingNum_IsNull() { regShippingNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     */
    public void setShippingNum_IsNullOrEmpty() { regShippingNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_NUM: {VARCHAR(30)}
     */
    public void setShippingNum_IsNotNull() { regShippingNum(CK_ISNN, DOBJ); }

    protected void regShippingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingNum(), "SHIPPING_NUM"); }
    protected abstract ConditionValue xgetCValueShippingNum();

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
     * UNIT_NM: {VARCHAR(30)}
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
     * UNIT_NM: {VARCHAR(30)}
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
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterThan(String unitNm) {
        regUnitNm(CK_GT, fRES(unitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessThan(String unitNm) {
        regUnitNm(CK_LT, fRES(unitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_GreaterEqual(String unitNm) {
        regUnitNm(CK_GE, fRES(unitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_LessEqual(String unitNm) {
        regUnitNm(CK_LE, fRES(unitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
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
     * UNIT_NM: {VARCHAR(30)}
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
     * UNIT_NM: {VARCHAR(30)} <br>
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
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitNm_NotLikeSearch(String unitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitNm), xgetCValueUnitNm(), "UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     * @param unitNm The value of unitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitNm_PrefixSearch(String unitNm) {
        setUnitNm_LikeSearch(unitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNull() { regUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNullOrEmpty() { regUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_NM: {VARCHAR(30)}
     */
    public void setUnitNm_IsNotNull() { regUnitNm(CK_ISNN, DOBJ); }

    protected void regUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitNm(), "UNIT_NM"); }
    protected abstract ConditionValue xgetCValueUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_Equal(String ecUnitNm) {
        doSetEcUnitNm_Equal(fRES(ecUnitNm));
    }

    protected void doSetEcUnitNm_Equal(String ecUnitNm) {
        regEcUnitNm(CK_EQ, ecUnitNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_NotEqual(String ecUnitNm) {
        doSetEcUnitNm_NotEqual(fRES(ecUnitNm));
    }

    protected void doSetEcUnitNm_NotEqual(String ecUnitNm) {
        regEcUnitNm(CK_NES, ecUnitNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_GreaterThan(String ecUnitNm) {
        regEcUnitNm(CK_GT, fRES(ecUnitNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_LessThan(String ecUnitNm) {
        regEcUnitNm(CK_LT, fRES(ecUnitNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_GreaterEqual(String ecUnitNm) {
        regEcUnitNm(CK_GE, fRES(ecUnitNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_LessEqual(String ecUnitNm) {
        regEcUnitNm(CK_LE, fRES(ecUnitNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNmList The collection of ecUnitNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_InScope(Collection<String> ecUnitNmList) {
        doSetEcUnitNm_InScope(ecUnitNmList);
    }

    protected void doSetEcUnitNm_InScope(Collection<String> ecUnitNmList) {
        regINS(CK_INS, cTL(ecUnitNmList), xgetCValueEcUnitNm(), "EC_UNIT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNmList The collection of ecUnitNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_NotInScope(Collection<String> ecUnitNmList) {
        doSetEcUnitNm_NotInScope(ecUnitNmList);
    }

    protected void doSetEcUnitNm_NotInScope(Collection<String> ecUnitNmList) {
        regINS(CK_NINS, cTL(ecUnitNmList), xgetCValueEcUnitNm(), "EC_UNIT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setEcUnitNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecUnitNm The value of ecUnitNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcUnitNm_LikeSearch(String ecUnitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecUnitNm), xgetCValueEcUnitNm(), "EC_UNIT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcUnitNm_NotLikeSearch(String ecUnitNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecUnitNm), xgetCValueEcUnitNm(), "EC_UNIT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     * @param ecUnitNm The value of ecUnitNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcUnitNm_PrefixSearch(String ecUnitNm) {
        setEcUnitNm_LikeSearch(ecUnitNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     */
    public void setEcUnitNm_IsNull() { regEcUnitNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     */
    public void setEcUnitNm_IsNullOrEmpty() { regEcUnitNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_UNIT_NM: {VARCHAR(30)}
     */
    public void setEcUnitNm_IsNotNull() { regEcUnitNm(CK_ISNN, DOBJ); }

    protected void regEcUnitNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcUnitNm(), "EC_UNIT_NM"); }
    protected abstract ConditionValue xgetCValueEcUnitNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_Equal(String sampleTypeCd) {
        doSetSampleTypeCd_Equal(fRES(sampleTypeCd));
    }

    protected void doSetSampleTypeCd_Equal(String sampleTypeCd) {
        regSampleTypeCd(CK_EQ, sampleTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_NotEqual(String sampleTypeCd) {
        doSetSampleTypeCd_NotEqual(fRES(sampleTypeCd));
    }

    protected void doSetSampleTypeCd_NotEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_NES, sampleTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_GreaterThan(String sampleTypeCd) {
        regSampleTypeCd(CK_GT, fRES(sampleTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_LessThan(String sampleTypeCd) {
        regSampleTypeCd(CK_LT, fRES(sampleTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_GreaterEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_GE, fRES(sampleTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_LessEqual(String sampleTypeCd) {
        regSampleTypeCd(CK_LE, fRES(sampleTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCdList The collection of sampleTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_InScope(Collection<String> sampleTypeCdList) {
        doSetSampleTypeCd_InScope(sampleTypeCdList);
    }

    protected void doSetSampleTypeCd_InScope(Collection<String> sampleTypeCdList) {
        regINS(CK_INS, cTL(sampleTypeCdList), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCdList The collection of sampleTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_NotInScope(Collection<String> sampleTypeCdList) {
        doSetSampleTypeCd_NotInScope(sampleTypeCdList);
    }

    protected void doSetSampleTypeCd_NotInScope(Collection<String> sampleTypeCdList) {
        regINS(CK_NINS, cTL(sampleTypeCdList), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSampleTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sampleTypeCd The value of sampleTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSampleTypeCd_LikeSearch(String sampleTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sampleTypeCd), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSampleTypeCd_NotLikeSearch(String sampleTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sampleTypeCd), xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     * @param sampleTypeCd The value of sampleTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSampleTypeCd_PrefixSearch(String sampleTypeCd) {
        setSampleTypeCd_LikeSearch(sampleTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNull() { regSampleTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNullOrEmpty() { regSampleTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAMPLE_TYPE_CD: {VARCHAR(30)}
     */
    public void setSampleTypeCd_IsNotNull() { regSampleTypeCd(CK_ISNN, DOBJ); }

    protected void regSampleTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSampleTypeCd(), "SAMPLE_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSampleTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_Equal(String logiWeightFlg) {
        doSetLogiWeightFlg_Equal(fRES(logiWeightFlg));
    }

    protected void doSetLogiWeightFlg_Equal(String logiWeightFlg) {
        regLogiWeightFlg(CK_EQ, logiWeightFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_NotEqual(String logiWeightFlg) {
        doSetLogiWeightFlg_NotEqual(fRES(logiWeightFlg));
    }

    protected void doSetLogiWeightFlg_NotEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_NES, logiWeightFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_GT, fRES(logiWeightFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessThan(String logiWeightFlg) {
        regLogiWeightFlg(CK_LT, fRES(logiWeightFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_GreaterEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_GE, fRES(logiWeightFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_LessEqual(String logiWeightFlg) {
        regLogiWeightFlg(CK_LE, fRES(logiWeightFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlgList The collection of logiWeightFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_InScope(Collection<String> logiWeightFlgList) {
        doSetLogiWeightFlg_InScope(logiWeightFlgList);
    }

    protected void doSetLogiWeightFlg_InScope(Collection<String> logiWeightFlgList) {
        regINS(CK_INS, cTL(logiWeightFlgList), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlgList The collection of logiWeightFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_NotInScope(Collection<String> logiWeightFlgList) {
        doSetLogiWeightFlg_NotInScope(logiWeightFlgList);
    }

    protected void doSetLogiWeightFlg_NotInScope(Collection<String> logiWeightFlgList) {
        regINS(CK_NINS, cTL(logiWeightFlgList), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)} <br>
     * <pre>e.g. setLogiWeightFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiWeightFlg The value of logiWeightFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiWeightFlg_LikeSearch(String logiWeightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiWeightFlg), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiWeightFlg_NotLikeSearch(String logiWeightFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiWeightFlg), xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     * @param logiWeightFlg The value of logiWeightFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiWeightFlg_PrefixSearch(String logiWeightFlg) {
        setLogiWeightFlg_LikeSearch(logiWeightFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNull() { regLogiWeightFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNullOrEmpty() { regLogiWeightFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_WEIGHT_FLG: {VARCHAR(30)}
     */
    public void setLogiWeightFlg_IsNotNull() { regLogiWeightFlg(CK_ISNN, DOBJ); }

    protected void regLogiWeightFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiWeightFlg(), "LOGI_WEIGHT_FLG"); }
    protected abstract ConditionValue xgetCValueLogiWeightFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_Equal(fRES(logiAttentionTypeCd));
    }

    protected void doSetLogiAttentionTypeCd_Equal(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_EQ, logiAttentionTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        doSetLogiAttentionTypeCd_NotEqual(fRES(logiAttentionTypeCd));
    }

    protected void doSetLogiAttentionTypeCd_NotEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_NES, logiAttentionTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_GreaterThan(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_GT, fRES(logiAttentionTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_LessThan(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_LT, fRES(logiAttentionTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_GreaterEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_GE, fRES(logiAttentionTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_LessEqual(String logiAttentionTypeCd) {
        regLogiAttentionTypeCd(CK_LE, fRES(logiAttentionTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_InScope(logiAttentionTypeCdList);
    }

    protected void doSetLogiAttentionTypeCd_InScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_INS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCdList The collection of logiAttentionTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        doSetLogiAttentionTypeCd_NotInScope(logiAttentionTypeCdList);
    }

    protected void doSetLogiAttentionTypeCd_NotInScope(Collection<String> logiAttentionTypeCdList) {
        regINS(CK_NINS, cTL(logiAttentionTypeCdList), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLogiAttentionTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiAttentionTypeCd_LikeSearch(String logiAttentionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiAttentionTypeCd), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiAttentionTypeCd_NotLikeSearch(String logiAttentionTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiAttentionTypeCd), xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     * @param logiAttentionTypeCd The value of logiAttentionTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiAttentionTypeCd_PrefixSearch(String logiAttentionTypeCd) {
        setLogiAttentionTypeCd_LikeSearch(logiAttentionTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNull() { regLogiAttentionTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNullOrEmpty() { regLogiAttentionTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiAttentionTypeCd_IsNotNull() { regLogiAttentionTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiAttentionTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiAttentionTypeCd(), "LOGI_ATTENTION_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiAttentionTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_Equal(fRES(logiSpecialTypeCd));
    }

    protected void doSetLogiSpecialTypeCd_Equal(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_EQ, logiSpecialTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        doSetLogiSpecialTypeCd_NotEqual(fRES(logiSpecialTypeCd));
    }

    protected void doSetLogiSpecialTypeCd_NotEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_NES, logiSpecialTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_GreaterThan(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_GT, fRES(logiSpecialTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_LessThan(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_LT, fRES(logiSpecialTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_GreaterEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_GE, fRES(logiSpecialTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_LessEqual(String logiSpecialTypeCd) {
        regLogiSpecialTypeCd(CK_LE, fRES(logiSpecialTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_InScope(logiSpecialTypeCdList);
    }

    protected void doSetLogiSpecialTypeCd_InScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_INS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCdList The collection of logiSpecialTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        doSetLogiSpecialTypeCd_NotInScope(logiSpecialTypeCdList);
    }

    protected void doSetLogiSpecialTypeCd_NotInScope(Collection<String> logiSpecialTypeCdList) {
        regINS(CK_NINS, cTL(logiSpecialTypeCdList), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLogiSpecialTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLogiSpecialTypeCd_LikeSearch(String logiSpecialTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(logiSpecialTypeCd), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLogiSpecialTypeCd_NotLikeSearch(String logiSpecialTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(logiSpecialTypeCd), xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     * @param logiSpecialTypeCd The value of logiSpecialTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLogiSpecialTypeCd_PrefixSearch(String logiSpecialTypeCd) {
        setLogiSpecialTypeCd_LikeSearch(logiSpecialTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNull() { regLogiSpecialTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNullOrEmpty() { regLogiSpecialTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setLogiSpecialTypeCd_IsNotNull() { regLogiSpecialTypeCd(CK_ISNN, DOBJ); }

    protected void regLogiSpecialTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLogiSpecialTypeCd(), "LOGI_SPECIAL_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLogiSpecialTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_Equal(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_EQ, directDeliveryTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_NotEqual(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_NES, directDeliveryTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GT, fRES(directDeliveryTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LT, fRES(directDeliveryTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GE, fRES(directDeliveryTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LE, fRES(directDeliveryTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_InScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_INS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_NotInScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_NINS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDirectDeliveryTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_LikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_NotLikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_PrefixSearch(String directDeliveryTypeCd) {
        setDirectDeliveryTypeCd_LikeSearch(directDeliveryTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNull() { regDirectDeliveryTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNullOrEmpty() { regDirectDeliveryTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNotNull() { regDirectDeliveryTypeCd(CK_ISNN, DOBJ); }

    protected void regDirectDeliveryTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDirectDeliveryTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_Equal(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_EQ, koguchiDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_NotEqual(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_NES, koguchiDeliveryFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GT, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LT, fRES(koguchiDeliveryFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GE, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LE, fRES(koguchiDeliveryFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_InScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_INS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_NotInScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_NINS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * <pre>e.g. setKoguchiDeliveryFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_LikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_NotLikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_PrefixSearch(String koguchiDeliveryFlg) {
        setKoguchiDeliveryFlg_LikeSearch(koguchiDeliveryFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryFlg_IsNull() { regKoguchiDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryFlg_IsNullOrEmpty() { regKoguchiDeliveryFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
     */
    public void setKoguchiDeliveryFlg_IsNotNull() { regKoguchiDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_Equal(String splitDeliveryTypeCd) {
        doSetSplitDeliveryTypeCd_Equal(fRES(splitDeliveryTypeCd));
    }

    protected void doSetSplitDeliveryTypeCd_Equal(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_EQ, splitDeliveryTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_NotEqual(String splitDeliveryTypeCd) {
        doSetSplitDeliveryTypeCd_NotEqual(fRES(splitDeliveryTypeCd));
    }

    protected void doSetSplitDeliveryTypeCd_NotEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_NES, splitDeliveryTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_GreaterThan(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_GT, fRES(splitDeliveryTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_LessThan(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_LT, fRES(splitDeliveryTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_GreaterEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_GE, fRES(splitDeliveryTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_LessEqual(String splitDeliveryTypeCd) {
        regSplitDeliveryTypeCd(CK_LE, fRES(splitDeliveryTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCdList The collection of splitDeliveryTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_InScope(Collection<String> splitDeliveryTypeCdList) {
        doSetSplitDeliveryTypeCd_InScope(splitDeliveryTypeCdList);
    }

    protected void doSetSplitDeliveryTypeCd_InScope(Collection<String> splitDeliveryTypeCdList) {
        regINS(CK_INS, cTL(splitDeliveryTypeCdList), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCdList The collection of splitDeliveryTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_NotInScope(Collection<String> splitDeliveryTypeCdList) {
        doSetSplitDeliveryTypeCd_NotInScope(splitDeliveryTypeCdList);
    }

    protected void doSetSplitDeliveryTypeCd_NotInScope(Collection<String> splitDeliveryTypeCdList) {
        regINS(CK_NINS, cTL(splitDeliveryTypeCdList), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSplitDeliveryTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSplitDeliveryTypeCd_LikeSearch(String splitDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(splitDeliveryTypeCd), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSplitDeliveryTypeCd_NotLikeSearch(String splitDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(splitDeliveryTypeCd), xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param splitDeliveryTypeCd The value of splitDeliveryTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSplitDeliveryTypeCd_PrefixSearch(String splitDeliveryTypeCd) {
        setSplitDeliveryTypeCd_LikeSearch(splitDeliveryTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNull() { regSplitDeliveryTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNullOrEmpty() { regSplitDeliveryTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setSplitDeliveryTypeCd_IsNotNull() { regSplitDeliveryTypeCd(CK_ISNN, DOBJ); }

    protected void regSplitDeliveryTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSplitDeliveryTypeCd(), "SPLIT_DELIVERY_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSplitDeliveryTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_Equal(String carrierTypeCd) {
        doSetCarrierTypeCd_Equal(fRES(carrierTypeCd));
    }

    protected void doSetCarrierTypeCd_Equal(String carrierTypeCd) {
        regCarrierTypeCd(CK_EQ, carrierTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_NotEqual(String carrierTypeCd) {
        doSetCarrierTypeCd_NotEqual(fRES(carrierTypeCd));
    }

    protected void doSetCarrierTypeCd_NotEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_NES, carrierTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_GreaterThan(String carrierTypeCd) {
        regCarrierTypeCd(CK_GT, fRES(carrierTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_LessThan(String carrierTypeCd) {
        regCarrierTypeCd(CK_LT, fRES(carrierTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_GreaterEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_GE, fRES(carrierTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_LessEqual(String carrierTypeCd) {
        regCarrierTypeCd(CK_LE, fRES(carrierTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCdList The collection of carrierTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_InScope(Collection<String> carrierTypeCdList) {
        doSetCarrierTypeCd_InScope(carrierTypeCdList);
    }

    protected void doSetCarrierTypeCd_InScope(Collection<String> carrierTypeCdList) {
        regINS(CK_INS, cTL(carrierTypeCdList), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCdList The collection of carrierTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_NotInScope(Collection<String> carrierTypeCdList) {
        doSetCarrierTypeCd_NotInScope(carrierTypeCdList);
    }

    protected void doSetCarrierTypeCd_NotInScope(Collection<String> carrierTypeCdList) {
        regINS(CK_NINS, cTL(carrierTypeCdList), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierTypeCd The value of carrierTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierTypeCd_LikeSearch(String carrierTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierTypeCd), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierTypeCd_NotLikeSearch(String carrierTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierTypeCd), xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     * @param carrierTypeCd The value of carrierTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierTypeCd_PrefixSearch(String carrierTypeCd) {
        setCarrierTypeCd_LikeSearch(carrierTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNull() { regCarrierTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNullOrEmpty() { regCarrierTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_TYPE_CD: {VARCHAR(30)}
     */
    public void setCarrierTypeCd_IsNotNull() { regCarrierTypeCd(CK_ISNN, DOBJ); }

    protected void regCarrierTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierTypeCd(), "CARRIER_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueCarrierTypeCd();

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
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_Equal(String expressCd) {
        doSetExpressCd_Equal(fRES(expressCd));
    }

    protected void doSetExpressCd_Equal(String expressCd) {
        regExpressCd(CK_EQ, expressCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_NotEqual(String expressCd) {
        doSetExpressCd_NotEqual(fRES(expressCd));
    }

    protected void doSetExpressCd_NotEqual(String expressCd) {
        regExpressCd(CK_NES, expressCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_GreaterThan(String expressCd) {
        regExpressCd(CK_GT, fRES(expressCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_LessThan(String expressCd) {
        regExpressCd(CK_LT, fRES(expressCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_GreaterEqual(String expressCd) {
        regExpressCd(CK_GE, fRES(expressCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_LessEqual(String expressCd) {
        regExpressCd(CK_LE, fRES(expressCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCdList The collection of expressCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_InScope(Collection<String> expressCdList) {
        doSetExpressCd_InScope(expressCdList);
    }

    protected void doSetExpressCd_InScope(Collection<String> expressCdList) {
        regINS(CK_INS, cTL(expressCdList), xgetCValueExpressCd(), "EXPRESS_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCdList The collection of expressCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_NotInScope(Collection<String> expressCdList) {
        doSetExpressCd_NotInScope(expressCdList);
    }

    protected void doSetExpressCd_NotInScope(Collection<String> expressCdList) {
        regINS(CK_NINS, cTL(expressCdList), xgetCValueExpressCd(), "EXPRESS_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setExpressCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param expressCd The value of expressCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setExpressCd_LikeSearch(String expressCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(expressCd), xgetCValueExpressCd(), "EXPRESS_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setExpressCd_NotLikeSearch(String expressCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(expressCd), xgetCValueExpressCd(), "EXPRESS_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     * @param expressCd The value of expressCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setExpressCd_PrefixSearch(String expressCd) {
        setExpressCd_LikeSearch(expressCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     */
    public void setExpressCd_IsNull() { regExpressCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     */
    public void setExpressCd_IsNullOrEmpty() { regExpressCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EXPRESS_CD: {VARCHAR(30)}
     */
    public void setExpressCd_IsNotNull() { regExpressCd(CK_ISNN, DOBJ); }

    protected void regExpressCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueExpressCd(), "EXPRESS_CD"); }
    protected abstract ConditionValue xgetCValueExpressCd();

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
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_Equal(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_Equal(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_EQ, specifyDeliveryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        doSetSpecifyDeliveryDt_NotEqual(fRES(specifyDeliveryDt));
    }

    protected void doSetSpecifyDeliveryDt_NotEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_NES, specifyDeliveryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GT, fRES(specifyDeliveryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessThan(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LT, fRES(specifyDeliveryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_GreaterEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_GE, fRES(specifyDeliveryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_LessEqual(String specifyDeliveryDt) {
        regSpecifyDeliveryDt(CK_LE, fRES(specifyDeliveryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_InScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_InScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_INS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDtList The collection of specifyDeliveryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        doSetSpecifyDeliveryDt_NotInScope(specifyDeliveryDtList);
    }

    protected void doSetSpecifyDeliveryDt_NotInScope(Collection<String> specifyDeliveryDtList) {
        regINS(CK_NINS, cTL(specifyDeliveryDtList), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setSpecifyDeliveryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryDt The value of specifyDeliveryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_LikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryDt_NotLikeSearch(String specifyDeliveryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryDt), xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     * @param specifyDeliveryDt The value of specifyDeliveryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryDt_PrefixSearch(String specifyDeliveryDt) {
        setSpecifyDeliveryDt_LikeSearch(specifyDeliveryDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryDt_IsNull() { regSpecifyDeliveryDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryDt_IsNullOrEmpty() { regSpecifyDeliveryDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryDt_IsNotNull() { regSpecifyDeliveryDt(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryDt(), "SPECIFY_DELIVERY_DT"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_Equal(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_Equal(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_EQ, specifyDeliveryTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        doSetSpecifyDeliveryTime_NotEqual(fRES(specifyDeliveryTime));
    }

    protected void doSetSpecifyDeliveryTime_NotEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_NES, specifyDeliveryTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GT, fRES(specifyDeliveryTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessThan(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LT, fRES(specifyDeliveryTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_GreaterEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_GE, fRES(specifyDeliveryTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_LessEqual(String specifyDeliveryTime) {
        regSpecifyDeliveryTime(CK_LE, fRES(specifyDeliveryTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_InScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_InScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_INS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTimeList The collection of specifyDeliveryTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        doSetSpecifyDeliveryTime_NotInScope(specifyDeliveryTimeList);
    }

    protected void doSetSpecifyDeliveryTime_NotInScope(Collection<String> specifyDeliveryTimeList) {
        regINS(CK_NINS, cTL(specifyDeliveryTimeList), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)} <br>
     * <pre>e.g. setSpecifyDeliveryTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param specifyDeliveryTime The value of specifyDeliveryTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_LikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpecifyDeliveryTime_NotLikeSearch(String specifyDeliveryTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(specifyDeliveryTime), xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     * @param specifyDeliveryTime The value of specifyDeliveryTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpecifyDeliveryTime_PrefixSearch(String specifyDeliveryTime) {
        setSpecifyDeliveryTime_LikeSearch(specifyDeliveryTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNull() { regSpecifyDeliveryTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNullOrEmpty() { regSpecifyDeliveryTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
     */
    public void setSpecifyDeliveryTime_IsNotNull() { regSpecifyDeliveryTime(CK_ISNN, DOBJ); }

    protected void regSpecifyDeliveryTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpecifyDeliveryTime(), "SPECIFY_DELIVERY_TIME"); }
    protected abstract ConditionValue xgetCValueSpecifyDeliveryTime();

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
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_Equal(String tenhanshaOrderNo) {
        doSetTenhanshaOrderNo_Equal(fRES(tenhanshaOrderNo));
    }

    protected void doSetTenhanshaOrderNo_Equal(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_EQ, tenhanshaOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_NotEqual(String tenhanshaOrderNo) {
        doSetTenhanshaOrderNo_NotEqual(fRES(tenhanshaOrderNo));
    }

    protected void doSetTenhanshaOrderNo_NotEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_NES, tenhanshaOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_GreaterThan(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_GT, fRES(tenhanshaOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_LessThan(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_LT, fRES(tenhanshaOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_GreaterEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_GE, fRES(tenhanshaOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_LessEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_LE, fRES(tenhanshaOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNoList The collection of tenhanshaOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_InScope(Collection<String> tenhanshaOrderNoList) {
        doSetTenhanshaOrderNo_InScope(tenhanshaOrderNoList);
    }

    protected void doSetTenhanshaOrderNo_InScope(Collection<String> tenhanshaOrderNoList) {
        regINS(CK_INS, cTL(tenhanshaOrderNoList), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNoList The collection of tenhanshaOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_NotInScope(Collection<String> tenhanshaOrderNoList) {
        doSetTenhanshaOrderNo_NotInScope(tenhanshaOrderNoList);
    }

    protected void doSetTenhanshaOrderNo_NotInScope(Collection<String> tenhanshaOrderNoList) {
        regINS(CK_NINS, cTL(tenhanshaOrderNoList), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaOrderNo_LikeSearch(String tenhanshaOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaOrderNo), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaOrderNo_NotLikeSearch(String tenhanshaOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaOrderNo), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_PrefixSearch(String tenhanshaOrderNo) {
        setTenhanshaOrderNo_LikeSearch(tenhanshaOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNull() { regTenhanshaOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNullOrEmpty() { regTenhanshaOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNotNull() { regTenhanshaOrderNo(CK_ISNN, DOBJ); }

    protected void regTenhanshaOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueTenhanshaOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_Equal(String kohaiContractorCd) {
        doSetKohaiContractorCd_Equal(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_Equal(String kohaiContractorCd) {
        regKohaiContractorCd(CK_EQ, kohaiContractorCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        doSetKohaiContractorCd_NotEqual(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_NES, kohaiContractorCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GT, fRES(kohaiContractorCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LT, fRES(kohaiContractorCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GE, fRES(kohaiContractorCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LE, fRES(kohaiContractorCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_InScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_INS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_NotInScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_NINS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKohaiContractorCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorCd The value of kohaiContractorCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorCd_LikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorCd_NotLikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_PrefixSearch(String kohaiContractorCd) {
        setKohaiContractorCd_LikeSearch(kohaiContractorCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNull() { regKohaiContractorCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNullOrEmpty() { regKohaiContractorCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNotNull() { regKohaiContractorCd(CK_ISNN, DOBJ); }

    protected void regKohaiContractorCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD"); }
    protected abstract ConditionValue xgetCValueKohaiContractorCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_Equal(String kohaiContractorNm) {
        doSetKohaiContractorNm_Equal(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_Equal(String kohaiContractorNm) {
        regKohaiContractorNm(CK_EQ, kohaiContractorNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        doSetKohaiContractorNm_NotEqual(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_NES, kohaiContractorNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GT, fRES(kohaiContractorNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LT, fRES(kohaiContractorNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GE, fRES(kohaiContractorNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LE, fRES(kohaiContractorNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_InScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_INS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_NotInScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_NINS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setKohaiContractorNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorNm The value of kohaiContractorNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorNm_LikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorNm_NotLikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_PrefixSearch(String kohaiContractorNm) {
        setKohaiContractorNm_LikeSearch(kohaiContractorNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNull() { regKohaiContractorNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNullOrEmpty() { regKohaiContractorNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNotNull() { regKohaiContractorNm(CK_ISNN, DOBJ); }

    protected void regKohaiContractorNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM"); }
    protected abstract ConditionValue xgetCValueKohaiContractorNm();

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
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
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
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
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
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterThan(String destinationZipCd) {
        regDestinationZipCd(CK_GT, fRES(destinationZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessThan(String destinationZipCd) {
        regDestinationZipCd(CK_LT, fRES(destinationZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_GreaterEqual(String destinationZipCd) {
        regDestinationZipCd(CK_GE, fRES(destinationZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_LessEqual(String destinationZipCd) {
        regDestinationZipCd(CK_LE, fRES(destinationZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
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
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
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
     * DESTINATION_ZIP_CD: {VARCHAR(30)} <br>
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
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationZipCd_NotLikeSearch(String destinationZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationZipCd), xgetCValueDestinationZipCd(), "DESTINATION_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     * @param destinationZipCd The value of destinationZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationZipCd_PrefixSearch(String destinationZipCd) {
        setDestinationZipCd_LikeSearch(destinationZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     */
    public void setDestinationZipCd_IsNull() { regDestinationZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
     */
    public void setDestinationZipCd_IsNullOrEmpty() { regDestinationZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_ZIP_CD: {VARCHAR(30)}
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
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_Equal(String destinationFax) {
        doSetDestinationFax_Equal(fRES(destinationFax));
    }

    protected void doSetDestinationFax_Equal(String destinationFax) {
        regDestinationFax(CK_EQ, destinationFax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotEqual(String destinationFax) {
        doSetDestinationFax_NotEqual(fRES(destinationFax));
    }

    protected void doSetDestinationFax_NotEqual(String destinationFax) {
        regDestinationFax(CK_NES, destinationFax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterThan(String destinationFax) {
        regDestinationFax(CK_GT, fRES(destinationFax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessThan(String destinationFax) {
        regDestinationFax(CK_LT, fRES(destinationFax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterEqual(String destinationFax) {
        regDestinationFax(CK_GE, fRES(destinationFax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessEqual(String destinationFax) {
        regDestinationFax(CK_LE, fRES(destinationFax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_InScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_InScope(destinationFaxList);
    }

    protected void doSetDestinationFax_InScope(Collection<String> destinationFaxList) {
        regINS(CK_INS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_NotInScope(destinationFaxList);
    }

    protected void doSetDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        regINS(CK_NINS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationFax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationFax The value of destinationFax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationFax_LikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationFax_NotLikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_PrefixSearch(String destinationFax) {
        setDestinationFax_LikeSearch(destinationFax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNull() { regDestinationFax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNullOrEmpty() { regDestinationFax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNotNull() { regDestinationFax(CK_ISNN, DOBJ); }

    protected void regDestinationFax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationFax(), "DESTINATION_FAX"); }
    protected abstract ConditionValue xgetCValueDestinationFax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_Equal(String kanjiMessage1) {
        doSetKanjiMessage1_Equal(fRES(kanjiMessage1));
    }

    protected void doSetKanjiMessage1_Equal(String kanjiMessage1) {
        regKanjiMessage1(CK_EQ, kanjiMessage1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_NotEqual(String kanjiMessage1) {
        doSetKanjiMessage1_NotEqual(fRES(kanjiMessage1));
    }

    protected void doSetKanjiMessage1_NotEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_NES, kanjiMessage1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_GreaterThan(String kanjiMessage1) {
        regKanjiMessage1(CK_GT, fRES(kanjiMessage1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_LessThan(String kanjiMessage1) {
        regKanjiMessage1(CK_LT, fRES(kanjiMessage1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_GreaterEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_GE, fRES(kanjiMessage1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_LessEqual(String kanjiMessage1) {
        regKanjiMessage1(CK_LE, fRES(kanjiMessage1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1List The collection of kanjiMessage1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_InScope(Collection<String> kanjiMessage1List) {
        doSetKanjiMessage1_InScope(kanjiMessage1List);
    }

    protected void doSetKanjiMessage1_InScope(Collection<String> kanjiMessage1List) {
        regINS(CK_INS, cTL(kanjiMessage1List), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1List The collection of kanjiMessage1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_NotInScope(Collection<String> kanjiMessage1List) {
        doSetKanjiMessage1_NotInScope(kanjiMessage1List);
    }

    protected void doSetKanjiMessage1_NotInScope(Collection<String> kanjiMessage1List) {
        regINS(CK_NINS, cTL(kanjiMessage1List), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage1 The value of kanjiMessage1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage1_LikeSearch(String kanjiMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage1), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage1_NotLikeSearch(String kanjiMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage1), xgetCValueKanjiMessage1(), "KANJI_MESSAGE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     * @param kanjiMessage1 The value of kanjiMessage1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage1_PrefixSearch(String kanjiMessage1) {
        setKanjiMessage1_LikeSearch(kanjiMessage1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNull() { regKanjiMessage1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNullOrEmpty() { regKanjiMessage1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanjiMessage1_IsNotNull() { regKanjiMessage1(CK_ISNN, DOBJ); }

    protected void regKanjiMessage1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage1(), "KANJI_MESSAGE1"); }
    protected abstract ConditionValue xgetCValueKanjiMessage1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_Equal(String kanjiMessage2) {
        doSetKanjiMessage2_Equal(fRES(kanjiMessage2));
    }

    protected void doSetKanjiMessage2_Equal(String kanjiMessage2) {
        regKanjiMessage2(CK_EQ, kanjiMessage2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_NotEqual(String kanjiMessage2) {
        doSetKanjiMessage2_NotEqual(fRES(kanjiMessage2));
    }

    protected void doSetKanjiMessage2_NotEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_NES, kanjiMessage2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_GreaterThan(String kanjiMessage2) {
        regKanjiMessage2(CK_GT, fRES(kanjiMessage2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_LessThan(String kanjiMessage2) {
        regKanjiMessage2(CK_LT, fRES(kanjiMessage2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_GreaterEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_GE, fRES(kanjiMessage2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_LessEqual(String kanjiMessage2) {
        regKanjiMessage2(CK_LE, fRES(kanjiMessage2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2List The collection of kanjiMessage2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_InScope(Collection<String> kanjiMessage2List) {
        doSetKanjiMessage2_InScope(kanjiMessage2List);
    }

    protected void doSetKanjiMessage2_InScope(Collection<String> kanjiMessage2List) {
        regINS(CK_INS, cTL(kanjiMessage2List), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2List The collection of kanjiMessage2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_NotInScope(Collection<String> kanjiMessage2List) {
        doSetKanjiMessage2_NotInScope(kanjiMessage2List);
    }

    protected void doSetKanjiMessage2_NotInScope(Collection<String> kanjiMessage2List) {
        regINS(CK_NINS, cTL(kanjiMessage2List), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage2 The value of kanjiMessage2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage2_LikeSearch(String kanjiMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage2), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage2_NotLikeSearch(String kanjiMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage2), xgetCValueKanjiMessage2(), "KANJI_MESSAGE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     * @param kanjiMessage2 The value of kanjiMessage2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage2_PrefixSearch(String kanjiMessage2) {
        setKanjiMessage2_LikeSearch(kanjiMessage2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNull() { regKanjiMessage2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNullOrEmpty() { regKanjiMessage2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanjiMessage2_IsNotNull() { regKanjiMessage2(CK_ISNN, DOBJ); }

    protected void regKanjiMessage2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage2(), "KANJI_MESSAGE2"); }
    protected abstract ConditionValue xgetCValueKanjiMessage2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_Equal(String kanjiMessage3) {
        doSetKanjiMessage3_Equal(fRES(kanjiMessage3));
    }

    protected void doSetKanjiMessage3_Equal(String kanjiMessage3) {
        regKanjiMessage3(CK_EQ, kanjiMessage3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_NotEqual(String kanjiMessage3) {
        doSetKanjiMessage3_NotEqual(fRES(kanjiMessage3));
    }

    protected void doSetKanjiMessage3_NotEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_NES, kanjiMessage3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_GreaterThan(String kanjiMessage3) {
        regKanjiMessage3(CK_GT, fRES(kanjiMessage3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_LessThan(String kanjiMessage3) {
        regKanjiMessage3(CK_LT, fRES(kanjiMessage3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_GreaterEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_GE, fRES(kanjiMessage3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_LessEqual(String kanjiMessage3) {
        regKanjiMessage3(CK_LE, fRES(kanjiMessage3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3List The collection of kanjiMessage3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_InScope(Collection<String> kanjiMessage3List) {
        doSetKanjiMessage3_InScope(kanjiMessage3List);
    }

    protected void doSetKanjiMessage3_InScope(Collection<String> kanjiMessage3List) {
        regINS(CK_INS, cTL(kanjiMessage3List), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3List The collection of kanjiMessage3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_NotInScope(Collection<String> kanjiMessage3List) {
        doSetKanjiMessage3_NotInScope(kanjiMessage3List);
    }

    protected void doSetKanjiMessage3_NotInScope(Collection<String> kanjiMessage3List) {
        regINS(CK_NINS, cTL(kanjiMessage3List), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage3 The value of kanjiMessage3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage3_LikeSearch(String kanjiMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage3), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage3_NotLikeSearch(String kanjiMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage3), xgetCValueKanjiMessage3(), "KANJI_MESSAGE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     * @param kanjiMessage3 The value of kanjiMessage3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage3_PrefixSearch(String kanjiMessage3) {
        setKanjiMessage3_LikeSearch(kanjiMessage3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNull() { regKanjiMessage3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNullOrEmpty() { regKanjiMessage3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanjiMessage3_IsNotNull() { regKanjiMessage3(CK_ISNN, DOBJ); }

    protected void regKanjiMessage3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage3(), "KANJI_MESSAGE3"); }
    protected abstract ConditionValue xgetCValueKanjiMessage3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_Equal(String kanjiMessage4) {
        doSetKanjiMessage4_Equal(fRES(kanjiMessage4));
    }

    protected void doSetKanjiMessage4_Equal(String kanjiMessage4) {
        regKanjiMessage4(CK_EQ, kanjiMessage4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_NotEqual(String kanjiMessage4) {
        doSetKanjiMessage4_NotEqual(fRES(kanjiMessage4));
    }

    protected void doSetKanjiMessage4_NotEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_NES, kanjiMessage4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_GreaterThan(String kanjiMessage4) {
        regKanjiMessage4(CK_GT, fRES(kanjiMessage4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_LessThan(String kanjiMessage4) {
        regKanjiMessage4(CK_LT, fRES(kanjiMessage4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_GreaterEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_GE, fRES(kanjiMessage4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_LessEqual(String kanjiMessage4) {
        regKanjiMessage4(CK_LE, fRES(kanjiMessage4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4List The collection of kanjiMessage4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_InScope(Collection<String> kanjiMessage4List) {
        doSetKanjiMessage4_InScope(kanjiMessage4List);
    }

    protected void doSetKanjiMessage4_InScope(Collection<String> kanjiMessage4List) {
        regINS(CK_INS, cTL(kanjiMessage4List), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4List The collection of kanjiMessage4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_NotInScope(Collection<String> kanjiMessage4List) {
        doSetKanjiMessage4_NotInScope(kanjiMessage4List);
    }

    protected void doSetKanjiMessage4_NotInScope(Collection<String> kanjiMessage4List) {
        regINS(CK_NINS, cTL(kanjiMessage4List), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage4 The value of kanjiMessage4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage4_LikeSearch(String kanjiMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage4), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage4_NotLikeSearch(String kanjiMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage4), xgetCValueKanjiMessage4(), "KANJI_MESSAGE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     * @param kanjiMessage4 The value of kanjiMessage4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage4_PrefixSearch(String kanjiMessage4) {
        setKanjiMessage4_LikeSearch(kanjiMessage4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNull() { regKanjiMessage4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNullOrEmpty() { regKanjiMessage4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanjiMessage4_IsNotNull() { regKanjiMessage4(CK_ISNN, DOBJ); }

    protected void regKanjiMessage4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage4(), "KANJI_MESSAGE4"); }
    protected abstract ConditionValue xgetCValueKanjiMessage4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_Equal(String kanjiMessage5) {
        doSetKanjiMessage5_Equal(fRES(kanjiMessage5));
    }

    protected void doSetKanjiMessage5_Equal(String kanjiMessage5) {
        regKanjiMessage5(CK_EQ, kanjiMessage5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_NotEqual(String kanjiMessage5) {
        doSetKanjiMessage5_NotEqual(fRES(kanjiMessage5));
    }

    protected void doSetKanjiMessage5_NotEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_NES, kanjiMessage5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_GreaterThan(String kanjiMessage5) {
        regKanjiMessage5(CK_GT, fRES(kanjiMessage5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_LessThan(String kanjiMessage5) {
        regKanjiMessage5(CK_LT, fRES(kanjiMessage5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_GreaterEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_GE, fRES(kanjiMessage5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_LessEqual(String kanjiMessage5) {
        regKanjiMessage5(CK_LE, fRES(kanjiMessage5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5List The collection of kanjiMessage5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_InScope(Collection<String> kanjiMessage5List) {
        doSetKanjiMessage5_InScope(kanjiMessage5List);
    }

    protected void doSetKanjiMessage5_InScope(Collection<String> kanjiMessage5List) {
        regINS(CK_INS, cTL(kanjiMessage5List), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5List The collection of kanjiMessage5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_NotInScope(Collection<String> kanjiMessage5List) {
        doSetKanjiMessage5_NotInScope(kanjiMessage5List);
    }

    protected void doSetKanjiMessage5_NotInScope(Collection<String> kanjiMessage5List) {
        regINS(CK_NINS, cTL(kanjiMessage5List), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage5 The value of kanjiMessage5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage5_LikeSearch(String kanjiMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage5), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage5_NotLikeSearch(String kanjiMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage5), xgetCValueKanjiMessage5(), "KANJI_MESSAGE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     * @param kanjiMessage5 The value of kanjiMessage5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage5_PrefixSearch(String kanjiMessage5) {
        setKanjiMessage5_LikeSearch(kanjiMessage5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNull() { regKanjiMessage5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNullOrEmpty() { regKanjiMessage5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanjiMessage5_IsNotNull() { regKanjiMessage5(CK_ISNN, DOBJ); }

    protected void regKanjiMessage5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage5(), "KANJI_MESSAGE5"); }
    protected abstract ConditionValue xgetCValueKanjiMessage5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_Equal(String kanjiMessage6) {
        doSetKanjiMessage6_Equal(fRES(kanjiMessage6));
    }

    protected void doSetKanjiMessage6_Equal(String kanjiMessage6) {
        regKanjiMessage6(CK_EQ, kanjiMessage6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_NotEqual(String kanjiMessage6) {
        doSetKanjiMessage6_NotEqual(fRES(kanjiMessage6));
    }

    protected void doSetKanjiMessage6_NotEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_NES, kanjiMessage6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_GreaterThan(String kanjiMessage6) {
        regKanjiMessage6(CK_GT, fRES(kanjiMessage6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_LessThan(String kanjiMessage6) {
        regKanjiMessage6(CK_LT, fRES(kanjiMessage6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_GreaterEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_GE, fRES(kanjiMessage6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_LessEqual(String kanjiMessage6) {
        regKanjiMessage6(CK_LE, fRES(kanjiMessage6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6List The collection of kanjiMessage6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_InScope(Collection<String> kanjiMessage6List) {
        doSetKanjiMessage6_InScope(kanjiMessage6List);
    }

    protected void doSetKanjiMessage6_InScope(Collection<String> kanjiMessage6List) {
        regINS(CK_INS, cTL(kanjiMessage6List), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6List The collection of kanjiMessage6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_NotInScope(Collection<String> kanjiMessage6List) {
        doSetKanjiMessage6_NotInScope(kanjiMessage6List);
    }

    protected void doSetKanjiMessage6_NotInScope(Collection<String> kanjiMessage6List) {
        regINS(CK_NINS, cTL(kanjiMessage6List), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage6 The value of kanjiMessage6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage6_LikeSearch(String kanjiMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage6), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage6_NotLikeSearch(String kanjiMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage6), xgetCValueKanjiMessage6(), "KANJI_MESSAGE6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     * @param kanjiMessage6 The value of kanjiMessage6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage6_PrefixSearch(String kanjiMessage6) {
        setKanjiMessage6_LikeSearch(kanjiMessage6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNull() { regKanjiMessage6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNullOrEmpty() { regKanjiMessage6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanjiMessage6_IsNotNull() { regKanjiMessage6(CK_ISNN, DOBJ); }

    protected void regKanjiMessage6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage6(), "KANJI_MESSAGE6"); }
    protected abstract ConditionValue xgetCValueKanjiMessage6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_Equal(String kanjiMessage7) {
        doSetKanjiMessage7_Equal(fRES(kanjiMessage7));
    }

    protected void doSetKanjiMessage7_Equal(String kanjiMessage7) {
        regKanjiMessage7(CK_EQ, kanjiMessage7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_NotEqual(String kanjiMessage7) {
        doSetKanjiMessage7_NotEqual(fRES(kanjiMessage7));
    }

    protected void doSetKanjiMessage7_NotEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_NES, kanjiMessage7);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_GreaterThan(String kanjiMessage7) {
        regKanjiMessage7(CK_GT, fRES(kanjiMessage7));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_LessThan(String kanjiMessage7) {
        regKanjiMessage7(CK_LT, fRES(kanjiMessage7));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_GreaterEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_GE, fRES(kanjiMessage7));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_LessEqual(String kanjiMessage7) {
        regKanjiMessage7(CK_LE, fRES(kanjiMessage7));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7List The collection of kanjiMessage7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_InScope(Collection<String> kanjiMessage7List) {
        doSetKanjiMessage7_InScope(kanjiMessage7List);
    }

    protected void doSetKanjiMessage7_InScope(Collection<String> kanjiMessage7List) {
        regINS(CK_INS, cTL(kanjiMessage7List), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7List The collection of kanjiMessage7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_NotInScope(Collection<String> kanjiMessage7List) {
        doSetKanjiMessage7_NotInScope(kanjiMessage7List);
    }

    protected void doSetKanjiMessage7_NotInScope(Collection<String> kanjiMessage7List) {
        regINS(CK_NINS, cTL(kanjiMessage7List), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage7_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage7 The value of kanjiMessage7 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage7_LikeSearch(String kanjiMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage7), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage7_NotLikeSearch(String kanjiMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage7), xgetCValueKanjiMessage7(), "KANJI_MESSAGE7", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     * @param kanjiMessage7 The value of kanjiMessage7 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage7_PrefixSearch(String kanjiMessage7) {
        setKanjiMessage7_LikeSearch(kanjiMessage7, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNull() { regKanjiMessage7(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNullOrEmpty() { regKanjiMessage7(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanjiMessage7_IsNotNull() { regKanjiMessage7(CK_ISNN, DOBJ); }

    protected void regKanjiMessage7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage7(), "KANJI_MESSAGE7"); }
    protected abstract ConditionValue xgetCValueKanjiMessage7();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_Equal(String kanjiMessage8) {
        doSetKanjiMessage8_Equal(fRES(kanjiMessage8));
    }

    protected void doSetKanjiMessage8_Equal(String kanjiMessage8) {
        regKanjiMessage8(CK_EQ, kanjiMessage8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_NotEqual(String kanjiMessage8) {
        doSetKanjiMessage8_NotEqual(fRES(kanjiMessage8));
    }

    protected void doSetKanjiMessage8_NotEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_NES, kanjiMessage8);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_GreaterThan(String kanjiMessage8) {
        regKanjiMessage8(CK_GT, fRES(kanjiMessage8));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_LessThan(String kanjiMessage8) {
        regKanjiMessage8(CK_LT, fRES(kanjiMessage8));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_GreaterEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_GE, fRES(kanjiMessage8));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_LessEqual(String kanjiMessage8) {
        regKanjiMessage8(CK_LE, fRES(kanjiMessage8));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8List The collection of kanjiMessage8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_InScope(Collection<String> kanjiMessage8List) {
        doSetKanjiMessage8_InScope(kanjiMessage8List);
    }

    protected void doSetKanjiMessage8_InScope(Collection<String> kanjiMessage8List) {
        regINS(CK_INS, cTL(kanjiMessage8List), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8List The collection of kanjiMessage8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_NotInScope(Collection<String> kanjiMessage8List) {
        doSetKanjiMessage8_NotInScope(kanjiMessage8List);
    }

    protected void doSetKanjiMessage8_NotInScope(Collection<String> kanjiMessage8List) {
        regINS(CK_NINS, cTL(kanjiMessage8List), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage8_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage8 The value of kanjiMessage8 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage8_LikeSearch(String kanjiMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage8), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage8_NotLikeSearch(String kanjiMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage8), xgetCValueKanjiMessage8(), "KANJI_MESSAGE8", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     * @param kanjiMessage8 The value of kanjiMessage8 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage8_PrefixSearch(String kanjiMessage8) {
        setKanjiMessage8_LikeSearch(kanjiMessage8, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNull() { regKanjiMessage8(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNullOrEmpty() { regKanjiMessage8(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanjiMessage8_IsNotNull() { regKanjiMessage8(CK_ISNN, DOBJ); }

    protected void regKanjiMessage8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage8(), "KANJI_MESSAGE8"); }
    protected abstract ConditionValue xgetCValueKanjiMessage8();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_Equal(String kanjiMessage9) {
        doSetKanjiMessage9_Equal(fRES(kanjiMessage9));
    }

    protected void doSetKanjiMessage9_Equal(String kanjiMessage9) {
        regKanjiMessage9(CK_EQ, kanjiMessage9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_NotEqual(String kanjiMessage9) {
        doSetKanjiMessage9_NotEqual(fRES(kanjiMessage9));
    }

    protected void doSetKanjiMessage9_NotEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_NES, kanjiMessage9);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_GreaterThan(String kanjiMessage9) {
        regKanjiMessage9(CK_GT, fRES(kanjiMessage9));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_LessThan(String kanjiMessage9) {
        regKanjiMessage9(CK_LT, fRES(kanjiMessage9));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_GreaterEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_GE, fRES(kanjiMessage9));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_LessEqual(String kanjiMessage9) {
        regKanjiMessage9(CK_LE, fRES(kanjiMessage9));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9List The collection of kanjiMessage9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_InScope(Collection<String> kanjiMessage9List) {
        doSetKanjiMessage9_InScope(kanjiMessage9List);
    }

    protected void doSetKanjiMessage9_InScope(Collection<String> kanjiMessage9List) {
        regINS(CK_INS, cTL(kanjiMessage9List), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9List The collection of kanjiMessage9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_NotInScope(Collection<String> kanjiMessage9List) {
        doSetKanjiMessage9_NotInScope(kanjiMessage9List);
    }

    protected void doSetKanjiMessage9_NotInScope(Collection<String> kanjiMessage9List) {
        regINS(CK_NINS, cTL(kanjiMessage9List), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage9_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage9 The value of kanjiMessage9 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage9_LikeSearch(String kanjiMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage9), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage9_NotLikeSearch(String kanjiMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage9), xgetCValueKanjiMessage9(), "KANJI_MESSAGE9", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     * @param kanjiMessage9 The value of kanjiMessage9 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage9_PrefixSearch(String kanjiMessage9) {
        setKanjiMessage9_LikeSearch(kanjiMessage9, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNull() { regKanjiMessage9(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNullOrEmpty() { regKanjiMessage9(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanjiMessage9_IsNotNull() { regKanjiMessage9(CK_ISNN, DOBJ); }

    protected void regKanjiMessage9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage9(), "KANJI_MESSAGE9"); }
    protected abstract ConditionValue xgetCValueKanjiMessage9();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_Equal(String kanjiMessage10) {
        doSetKanjiMessage10_Equal(fRES(kanjiMessage10));
    }

    protected void doSetKanjiMessage10_Equal(String kanjiMessage10) {
        regKanjiMessage10(CK_EQ, kanjiMessage10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_NotEqual(String kanjiMessage10) {
        doSetKanjiMessage10_NotEqual(fRES(kanjiMessage10));
    }

    protected void doSetKanjiMessage10_NotEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_NES, kanjiMessage10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_GreaterThan(String kanjiMessage10) {
        regKanjiMessage10(CK_GT, fRES(kanjiMessage10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_LessThan(String kanjiMessage10) {
        regKanjiMessage10(CK_LT, fRES(kanjiMessage10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_GreaterEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_GE, fRES(kanjiMessage10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_LessEqual(String kanjiMessage10) {
        regKanjiMessage10(CK_LE, fRES(kanjiMessage10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10List The collection of kanjiMessage10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_InScope(Collection<String> kanjiMessage10List) {
        doSetKanjiMessage10_InScope(kanjiMessage10List);
    }

    protected void doSetKanjiMessage10_InScope(Collection<String> kanjiMessage10List) {
        regINS(CK_INS, cTL(kanjiMessage10List), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10List The collection of kanjiMessage10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_NotInScope(Collection<String> kanjiMessage10List) {
        doSetKanjiMessage10_NotInScope(kanjiMessage10List);
    }

    protected void doSetKanjiMessage10_NotInScope(Collection<String> kanjiMessage10List) {
        regINS(CK_NINS, cTL(kanjiMessage10List), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)} <br>
     * <pre>e.g. setKanjiMessage10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanjiMessage10 The value of kanjiMessage10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanjiMessage10_LikeSearch(String kanjiMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanjiMessage10), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanjiMessage10_NotLikeSearch(String kanjiMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanjiMessage10), xgetCValueKanjiMessage10(), "KANJI_MESSAGE10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     * @param kanjiMessage10 The value of kanjiMessage10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanjiMessage10_PrefixSearch(String kanjiMessage10) {
        setKanjiMessage10_LikeSearch(kanjiMessage10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNull() { regKanjiMessage10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNullOrEmpty() { regKanjiMessage10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANJI_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanjiMessage10_IsNotNull() { regKanjiMessage10(CK_ISNN, DOBJ); }

    protected void regKanjiMessage10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanjiMessage10(), "KANJI_MESSAGE10"); }
    protected abstract ConditionValue xgetCValueKanjiMessage10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_Equal(String kanaMessage1) {
        doSetKanaMessage1_Equal(fRES(kanaMessage1));
    }

    protected void doSetKanaMessage1_Equal(String kanaMessage1) {
        regKanaMessage1(CK_EQ, kanaMessage1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_NotEqual(String kanaMessage1) {
        doSetKanaMessage1_NotEqual(fRES(kanaMessage1));
    }

    protected void doSetKanaMessage1_NotEqual(String kanaMessage1) {
        regKanaMessage1(CK_NES, kanaMessage1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_GreaterThan(String kanaMessage1) {
        regKanaMessage1(CK_GT, fRES(kanaMessage1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_LessThan(String kanaMessage1) {
        regKanaMessage1(CK_LT, fRES(kanaMessage1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_GreaterEqual(String kanaMessage1) {
        regKanaMessage1(CK_GE, fRES(kanaMessage1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_LessEqual(String kanaMessage1) {
        regKanaMessage1(CK_LE, fRES(kanaMessage1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1List The collection of kanaMessage1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_InScope(Collection<String> kanaMessage1List) {
        doSetKanaMessage1_InScope(kanaMessage1List);
    }

    protected void doSetKanaMessage1_InScope(Collection<String> kanaMessage1List) {
        regINS(CK_INS, cTL(kanaMessage1List), xgetCValueKanaMessage1(), "KANA_MESSAGE1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1List The collection of kanaMessage1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_NotInScope(Collection<String> kanaMessage1List) {
        doSetKanaMessage1_NotInScope(kanaMessage1List);
    }

    protected void doSetKanaMessage1_NotInScope(Collection<String> kanaMessage1List) {
        regINS(CK_NINS, cTL(kanaMessage1List), xgetCValueKanaMessage1(), "KANA_MESSAGE1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage1 The value of kanaMessage1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage1_LikeSearch(String kanaMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage1), xgetCValueKanaMessage1(), "KANA_MESSAGE1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage1_NotLikeSearch(String kanaMessage1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage1), xgetCValueKanaMessage1(), "KANA_MESSAGE1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     * @param kanaMessage1 The value of kanaMessage1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage1_PrefixSearch(String kanaMessage1) {
        setKanaMessage1_LikeSearch(kanaMessage1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNull() { regKanaMessage1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNullOrEmpty() { regKanaMessage1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE1: {VARCHAR(60)}
     */
    public void setKanaMessage1_IsNotNull() { regKanaMessage1(CK_ISNN, DOBJ); }

    protected void regKanaMessage1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage1(), "KANA_MESSAGE1"); }
    protected abstract ConditionValue xgetCValueKanaMessage1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_Equal(String kanaMessage2) {
        doSetKanaMessage2_Equal(fRES(kanaMessage2));
    }

    protected void doSetKanaMessage2_Equal(String kanaMessage2) {
        regKanaMessage2(CK_EQ, kanaMessage2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_NotEqual(String kanaMessage2) {
        doSetKanaMessage2_NotEqual(fRES(kanaMessage2));
    }

    protected void doSetKanaMessage2_NotEqual(String kanaMessage2) {
        regKanaMessage2(CK_NES, kanaMessage2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_GreaterThan(String kanaMessage2) {
        regKanaMessage2(CK_GT, fRES(kanaMessage2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_LessThan(String kanaMessage2) {
        regKanaMessage2(CK_LT, fRES(kanaMessage2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_GreaterEqual(String kanaMessage2) {
        regKanaMessage2(CK_GE, fRES(kanaMessage2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_LessEqual(String kanaMessage2) {
        regKanaMessage2(CK_LE, fRES(kanaMessage2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2List The collection of kanaMessage2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_InScope(Collection<String> kanaMessage2List) {
        doSetKanaMessage2_InScope(kanaMessage2List);
    }

    protected void doSetKanaMessage2_InScope(Collection<String> kanaMessage2List) {
        regINS(CK_INS, cTL(kanaMessage2List), xgetCValueKanaMessage2(), "KANA_MESSAGE2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2List The collection of kanaMessage2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_NotInScope(Collection<String> kanaMessage2List) {
        doSetKanaMessage2_NotInScope(kanaMessage2List);
    }

    protected void doSetKanaMessage2_NotInScope(Collection<String> kanaMessage2List) {
        regINS(CK_NINS, cTL(kanaMessage2List), xgetCValueKanaMessage2(), "KANA_MESSAGE2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage2 The value of kanaMessage2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage2_LikeSearch(String kanaMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage2), xgetCValueKanaMessage2(), "KANA_MESSAGE2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage2_NotLikeSearch(String kanaMessage2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage2), xgetCValueKanaMessage2(), "KANA_MESSAGE2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     * @param kanaMessage2 The value of kanaMessage2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage2_PrefixSearch(String kanaMessage2) {
        setKanaMessage2_LikeSearch(kanaMessage2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNull() { regKanaMessage2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNullOrEmpty() { regKanaMessage2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE2: {VARCHAR(60)}
     */
    public void setKanaMessage2_IsNotNull() { regKanaMessage2(CK_ISNN, DOBJ); }

    protected void regKanaMessage2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage2(), "KANA_MESSAGE2"); }
    protected abstract ConditionValue xgetCValueKanaMessage2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_Equal(String kanaMessage3) {
        doSetKanaMessage3_Equal(fRES(kanaMessage3));
    }

    protected void doSetKanaMessage3_Equal(String kanaMessage3) {
        regKanaMessage3(CK_EQ, kanaMessage3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_NotEqual(String kanaMessage3) {
        doSetKanaMessage3_NotEqual(fRES(kanaMessage3));
    }

    protected void doSetKanaMessage3_NotEqual(String kanaMessage3) {
        regKanaMessage3(CK_NES, kanaMessage3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_GreaterThan(String kanaMessage3) {
        regKanaMessage3(CK_GT, fRES(kanaMessage3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_LessThan(String kanaMessage3) {
        regKanaMessage3(CK_LT, fRES(kanaMessage3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_GreaterEqual(String kanaMessage3) {
        regKanaMessage3(CK_GE, fRES(kanaMessage3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_LessEqual(String kanaMessage3) {
        regKanaMessage3(CK_LE, fRES(kanaMessage3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3List The collection of kanaMessage3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_InScope(Collection<String> kanaMessage3List) {
        doSetKanaMessage3_InScope(kanaMessage3List);
    }

    protected void doSetKanaMessage3_InScope(Collection<String> kanaMessage3List) {
        regINS(CK_INS, cTL(kanaMessage3List), xgetCValueKanaMessage3(), "KANA_MESSAGE3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3List The collection of kanaMessage3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_NotInScope(Collection<String> kanaMessage3List) {
        doSetKanaMessage3_NotInScope(kanaMessage3List);
    }

    protected void doSetKanaMessage3_NotInScope(Collection<String> kanaMessage3List) {
        regINS(CK_NINS, cTL(kanaMessage3List), xgetCValueKanaMessage3(), "KANA_MESSAGE3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage3 The value of kanaMessage3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage3_LikeSearch(String kanaMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage3), xgetCValueKanaMessage3(), "KANA_MESSAGE3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage3_NotLikeSearch(String kanaMessage3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage3), xgetCValueKanaMessage3(), "KANA_MESSAGE3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     * @param kanaMessage3 The value of kanaMessage3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage3_PrefixSearch(String kanaMessage3) {
        setKanaMessage3_LikeSearch(kanaMessage3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNull() { regKanaMessage3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNullOrEmpty() { regKanaMessage3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE3: {VARCHAR(60)}
     */
    public void setKanaMessage3_IsNotNull() { regKanaMessage3(CK_ISNN, DOBJ); }

    protected void regKanaMessage3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage3(), "KANA_MESSAGE3"); }
    protected abstract ConditionValue xgetCValueKanaMessage3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_Equal(String kanaMessage4) {
        doSetKanaMessage4_Equal(fRES(kanaMessage4));
    }

    protected void doSetKanaMessage4_Equal(String kanaMessage4) {
        regKanaMessage4(CK_EQ, kanaMessage4);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_NotEqual(String kanaMessage4) {
        doSetKanaMessage4_NotEqual(fRES(kanaMessage4));
    }

    protected void doSetKanaMessage4_NotEqual(String kanaMessage4) {
        regKanaMessage4(CK_NES, kanaMessage4);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_GreaterThan(String kanaMessage4) {
        regKanaMessage4(CK_GT, fRES(kanaMessage4));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_LessThan(String kanaMessage4) {
        regKanaMessage4(CK_LT, fRES(kanaMessage4));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_GreaterEqual(String kanaMessage4) {
        regKanaMessage4(CK_GE, fRES(kanaMessage4));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_LessEqual(String kanaMessage4) {
        regKanaMessage4(CK_LE, fRES(kanaMessage4));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4List The collection of kanaMessage4 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_InScope(Collection<String> kanaMessage4List) {
        doSetKanaMessage4_InScope(kanaMessage4List);
    }

    protected void doSetKanaMessage4_InScope(Collection<String> kanaMessage4List) {
        regINS(CK_INS, cTL(kanaMessage4List), xgetCValueKanaMessage4(), "KANA_MESSAGE4");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4List The collection of kanaMessage4 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_NotInScope(Collection<String> kanaMessage4List) {
        doSetKanaMessage4_NotInScope(kanaMessage4List);
    }

    protected void doSetKanaMessage4_NotInScope(Collection<String> kanaMessage4List) {
        regINS(CK_NINS, cTL(kanaMessage4List), xgetCValueKanaMessage4(), "KANA_MESSAGE4");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage4_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage4 The value of kanaMessage4 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage4_LikeSearch(String kanaMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage4), xgetCValueKanaMessage4(), "KANA_MESSAGE4", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage4_NotLikeSearch(String kanaMessage4, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage4), xgetCValueKanaMessage4(), "KANA_MESSAGE4", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     * @param kanaMessage4 The value of kanaMessage4 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage4_PrefixSearch(String kanaMessage4) {
        setKanaMessage4_LikeSearch(kanaMessage4, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNull() { regKanaMessage4(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNullOrEmpty() { regKanaMessage4(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE4: {VARCHAR(60)}
     */
    public void setKanaMessage4_IsNotNull() { regKanaMessage4(CK_ISNN, DOBJ); }

    protected void regKanaMessage4(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage4(), "KANA_MESSAGE4"); }
    protected abstract ConditionValue xgetCValueKanaMessage4();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_Equal(String kanaMessage5) {
        doSetKanaMessage5_Equal(fRES(kanaMessage5));
    }

    protected void doSetKanaMessage5_Equal(String kanaMessage5) {
        regKanaMessage5(CK_EQ, kanaMessage5);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_NotEqual(String kanaMessage5) {
        doSetKanaMessage5_NotEqual(fRES(kanaMessage5));
    }

    protected void doSetKanaMessage5_NotEqual(String kanaMessage5) {
        regKanaMessage5(CK_NES, kanaMessage5);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_GreaterThan(String kanaMessage5) {
        regKanaMessage5(CK_GT, fRES(kanaMessage5));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_LessThan(String kanaMessage5) {
        regKanaMessage5(CK_LT, fRES(kanaMessage5));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_GreaterEqual(String kanaMessage5) {
        regKanaMessage5(CK_GE, fRES(kanaMessage5));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_LessEqual(String kanaMessage5) {
        regKanaMessage5(CK_LE, fRES(kanaMessage5));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5List The collection of kanaMessage5 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_InScope(Collection<String> kanaMessage5List) {
        doSetKanaMessage5_InScope(kanaMessage5List);
    }

    protected void doSetKanaMessage5_InScope(Collection<String> kanaMessage5List) {
        regINS(CK_INS, cTL(kanaMessage5List), xgetCValueKanaMessage5(), "KANA_MESSAGE5");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5List The collection of kanaMessage5 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_NotInScope(Collection<String> kanaMessage5List) {
        doSetKanaMessage5_NotInScope(kanaMessage5List);
    }

    protected void doSetKanaMessage5_NotInScope(Collection<String> kanaMessage5List) {
        regINS(CK_NINS, cTL(kanaMessage5List), xgetCValueKanaMessage5(), "KANA_MESSAGE5");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage5_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage5 The value of kanaMessage5 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage5_LikeSearch(String kanaMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage5), xgetCValueKanaMessage5(), "KANA_MESSAGE5", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage5_NotLikeSearch(String kanaMessage5, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage5), xgetCValueKanaMessage5(), "KANA_MESSAGE5", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     * @param kanaMessage5 The value of kanaMessage5 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage5_PrefixSearch(String kanaMessage5) {
        setKanaMessage5_LikeSearch(kanaMessage5, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNull() { regKanaMessage5(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNullOrEmpty() { regKanaMessage5(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE5: {VARCHAR(60)}
     */
    public void setKanaMessage5_IsNotNull() { regKanaMessage5(CK_ISNN, DOBJ); }

    protected void regKanaMessage5(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage5(), "KANA_MESSAGE5"); }
    protected abstract ConditionValue xgetCValueKanaMessage5();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_Equal(String kanaMessage6) {
        doSetKanaMessage6_Equal(fRES(kanaMessage6));
    }

    protected void doSetKanaMessage6_Equal(String kanaMessage6) {
        regKanaMessage6(CK_EQ, kanaMessage6);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_NotEqual(String kanaMessage6) {
        doSetKanaMessage6_NotEqual(fRES(kanaMessage6));
    }

    protected void doSetKanaMessage6_NotEqual(String kanaMessage6) {
        regKanaMessage6(CK_NES, kanaMessage6);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_GreaterThan(String kanaMessage6) {
        regKanaMessage6(CK_GT, fRES(kanaMessage6));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_LessThan(String kanaMessage6) {
        regKanaMessage6(CK_LT, fRES(kanaMessage6));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_GreaterEqual(String kanaMessage6) {
        regKanaMessage6(CK_GE, fRES(kanaMessage6));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_LessEqual(String kanaMessage6) {
        regKanaMessage6(CK_LE, fRES(kanaMessage6));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6List The collection of kanaMessage6 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_InScope(Collection<String> kanaMessage6List) {
        doSetKanaMessage6_InScope(kanaMessage6List);
    }

    protected void doSetKanaMessage6_InScope(Collection<String> kanaMessage6List) {
        regINS(CK_INS, cTL(kanaMessage6List), xgetCValueKanaMessage6(), "KANA_MESSAGE6");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6List The collection of kanaMessage6 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_NotInScope(Collection<String> kanaMessage6List) {
        doSetKanaMessage6_NotInScope(kanaMessage6List);
    }

    protected void doSetKanaMessage6_NotInScope(Collection<String> kanaMessage6List) {
        regINS(CK_NINS, cTL(kanaMessage6List), xgetCValueKanaMessage6(), "KANA_MESSAGE6");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage6_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage6 The value of kanaMessage6 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage6_LikeSearch(String kanaMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage6), xgetCValueKanaMessage6(), "KANA_MESSAGE6", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage6_NotLikeSearch(String kanaMessage6, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage6), xgetCValueKanaMessage6(), "KANA_MESSAGE6", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     * @param kanaMessage6 The value of kanaMessage6 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage6_PrefixSearch(String kanaMessage6) {
        setKanaMessage6_LikeSearch(kanaMessage6, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNull() { regKanaMessage6(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNullOrEmpty() { regKanaMessage6(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE6: {VARCHAR(60)}
     */
    public void setKanaMessage6_IsNotNull() { regKanaMessage6(CK_ISNN, DOBJ); }

    protected void regKanaMessage6(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage6(), "KANA_MESSAGE6"); }
    protected abstract ConditionValue xgetCValueKanaMessage6();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_Equal(String kanaMessage7) {
        doSetKanaMessage7_Equal(fRES(kanaMessage7));
    }

    protected void doSetKanaMessage7_Equal(String kanaMessage7) {
        regKanaMessage7(CK_EQ, kanaMessage7);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_NotEqual(String kanaMessage7) {
        doSetKanaMessage7_NotEqual(fRES(kanaMessage7));
    }

    protected void doSetKanaMessage7_NotEqual(String kanaMessage7) {
        regKanaMessage7(CK_NES, kanaMessage7);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_GreaterThan(String kanaMessage7) {
        regKanaMessage7(CK_GT, fRES(kanaMessage7));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_LessThan(String kanaMessage7) {
        regKanaMessage7(CK_LT, fRES(kanaMessage7));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_GreaterEqual(String kanaMessage7) {
        regKanaMessage7(CK_GE, fRES(kanaMessage7));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_LessEqual(String kanaMessage7) {
        regKanaMessage7(CK_LE, fRES(kanaMessage7));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7List The collection of kanaMessage7 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_InScope(Collection<String> kanaMessage7List) {
        doSetKanaMessage7_InScope(kanaMessage7List);
    }

    protected void doSetKanaMessage7_InScope(Collection<String> kanaMessage7List) {
        regINS(CK_INS, cTL(kanaMessage7List), xgetCValueKanaMessage7(), "KANA_MESSAGE7");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7List The collection of kanaMessage7 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_NotInScope(Collection<String> kanaMessage7List) {
        doSetKanaMessage7_NotInScope(kanaMessage7List);
    }

    protected void doSetKanaMessage7_NotInScope(Collection<String> kanaMessage7List) {
        regINS(CK_NINS, cTL(kanaMessage7List), xgetCValueKanaMessage7(), "KANA_MESSAGE7");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage7_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage7 The value of kanaMessage7 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage7_LikeSearch(String kanaMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage7), xgetCValueKanaMessage7(), "KANA_MESSAGE7", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage7_NotLikeSearch(String kanaMessage7, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage7), xgetCValueKanaMessage7(), "KANA_MESSAGE7", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     * @param kanaMessage7 The value of kanaMessage7 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage7_PrefixSearch(String kanaMessage7) {
        setKanaMessage7_LikeSearch(kanaMessage7, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNull() { regKanaMessage7(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNullOrEmpty() { regKanaMessage7(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE7: {VARCHAR(60)}
     */
    public void setKanaMessage7_IsNotNull() { regKanaMessage7(CK_ISNN, DOBJ); }

    protected void regKanaMessage7(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage7(), "KANA_MESSAGE7"); }
    protected abstract ConditionValue xgetCValueKanaMessage7();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_Equal(String kanaMessage8) {
        doSetKanaMessage8_Equal(fRES(kanaMessage8));
    }

    protected void doSetKanaMessage8_Equal(String kanaMessage8) {
        regKanaMessage8(CK_EQ, kanaMessage8);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_NotEqual(String kanaMessage8) {
        doSetKanaMessage8_NotEqual(fRES(kanaMessage8));
    }

    protected void doSetKanaMessage8_NotEqual(String kanaMessage8) {
        regKanaMessage8(CK_NES, kanaMessage8);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_GreaterThan(String kanaMessage8) {
        regKanaMessage8(CK_GT, fRES(kanaMessage8));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_LessThan(String kanaMessage8) {
        regKanaMessage8(CK_LT, fRES(kanaMessage8));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_GreaterEqual(String kanaMessage8) {
        regKanaMessage8(CK_GE, fRES(kanaMessage8));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_LessEqual(String kanaMessage8) {
        regKanaMessage8(CK_LE, fRES(kanaMessage8));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8List The collection of kanaMessage8 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_InScope(Collection<String> kanaMessage8List) {
        doSetKanaMessage8_InScope(kanaMessage8List);
    }

    protected void doSetKanaMessage8_InScope(Collection<String> kanaMessage8List) {
        regINS(CK_INS, cTL(kanaMessage8List), xgetCValueKanaMessage8(), "KANA_MESSAGE8");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8List The collection of kanaMessage8 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_NotInScope(Collection<String> kanaMessage8List) {
        doSetKanaMessage8_NotInScope(kanaMessage8List);
    }

    protected void doSetKanaMessage8_NotInScope(Collection<String> kanaMessage8List) {
        regINS(CK_NINS, cTL(kanaMessage8List), xgetCValueKanaMessage8(), "KANA_MESSAGE8");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage8_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage8 The value of kanaMessage8 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage8_LikeSearch(String kanaMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage8), xgetCValueKanaMessage8(), "KANA_MESSAGE8", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage8_NotLikeSearch(String kanaMessage8, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage8), xgetCValueKanaMessage8(), "KANA_MESSAGE8", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     * @param kanaMessage8 The value of kanaMessage8 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage8_PrefixSearch(String kanaMessage8) {
        setKanaMessage8_LikeSearch(kanaMessage8, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNull() { regKanaMessage8(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNullOrEmpty() { regKanaMessage8(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE8: {VARCHAR(60)}
     */
    public void setKanaMessage8_IsNotNull() { regKanaMessage8(CK_ISNN, DOBJ); }

    protected void regKanaMessage8(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage8(), "KANA_MESSAGE8"); }
    protected abstract ConditionValue xgetCValueKanaMessage8();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_Equal(String kanaMessage9) {
        doSetKanaMessage9_Equal(fRES(kanaMessage9));
    }

    protected void doSetKanaMessage9_Equal(String kanaMessage9) {
        regKanaMessage9(CK_EQ, kanaMessage9);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_NotEqual(String kanaMessage9) {
        doSetKanaMessage9_NotEqual(fRES(kanaMessage9));
    }

    protected void doSetKanaMessage9_NotEqual(String kanaMessage9) {
        regKanaMessage9(CK_NES, kanaMessage9);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_GreaterThan(String kanaMessage9) {
        regKanaMessage9(CK_GT, fRES(kanaMessage9));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_LessThan(String kanaMessage9) {
        regKanaMessage9(CK_LT, fRES(kanaMessage9));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_GreaterEqual(String kanaMessage9) {
        regKanaMessage9(CK_GE, fRES(kanaMessage9));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_LessEqual(String kanaMessage9) {
        regKanaMessage9(CK_LE, fRES(kanaMessage9));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9List The collection of kanaMessage9 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_InScope(Collection<String> kanaMessage9List) {
        doSetKanaMessage9_InScope(kanaMessage9List);
    }

    protected void doSetKanaMessage9_InScope(Collection<String> kanaMessage9List) {
        regINS(CK_INS, cTL(kanaMessage9List), xgetCValueKanaMessage9(), "KANA_MESSAGE9");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9List The collection of kanaMessage9 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_NotInScope(Collection<String> kanaMessage9List) {
        doSetKanaMessage9_NotInScope(kanaMessage9List);
    }

    protected void doSetKanaMessage9_NotInScope(Collection<String> kanaMessage9List) {
        regINS(CK_NINS, cTL(kanaMessage9List), xgetCValueKanaMessage9(), "KANA_MESSAGE9");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage9_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage9 The value of kanaMessage9 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage9_LikeSearch(String kanaMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage9), xgetCValueKanaMessage9(), "KANA_MESSAGE9", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage9_NotLikeSearch(String kanaMessage9, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage9), xgetCValueKanaMessage9(), "KANA_MESSAGE9", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     * @param kanaMessage9 The value of kanaMessage9 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage9_PrefixSearch(String kanaMessage9) {
        setKanaMessage9_LikeSearch(kanaMessage9, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNull() { regKanaMessage9(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNullOrEmpty() { regKanaMessage9(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE9: {VARCHAR(60)}
     */
    public void setKanaMessage9_IsNotNull() { regKanaMessage9(CK_ISNN, DOBJ); }

    protected void regKanaMessage9(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage9(), "KANA_MESSAGE9"); }
    protected abstract ConditionValue xgetCValueKanaMessage9();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_Equal(String kanaMessage10) {
        doSetKanaMessage10_Equal(fRES(kanaMessage10));
    }

    protected void doSetKanaMessage10_Equal(String kanaMessage10) {
        regKanaMessage10(CK_EQ, kanaMessage10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_NotEqual(String kanaMessage10) {
        doSetKanaMessage10_NotEqual(fRES(kanaMessage10));
    }

    protected void doSetKanaMessage10_NotEqual(String kanaMessage10) {
        regKanaMessage10(CK_NES, kanaMessage10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_GreaterThan(String kanaMessage10) {
        regKanaMessage10(CK_GT, fRES(kanaMessage10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_LessThan(String kanaMessage10) {
        regKanaMessage10(CK_LT, fRES(kanaMessage10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_GreaterEqual(String kanaMessage10) {
        regKanaMessage10(CK_GE, fRES(kanaMessage10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_LessEqual(String kanaMessage10) {
        regKanaMessage10(CK_LE, fRES(kanaMessage10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10List The collection of kanaMessage10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_InScope(Collection<String> kanaMessage10List) {
        doSetKanaMessage10_InScope(kanaMessage10List);
    }

    protected void doSetKanaMessage10_InScope(Collection<String> kanaMessage10List) {
        regINS(CK_INS, cTL(kanaMessage10List), xgetCValueKanaMessage10(), "KANA_MESSAGE10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10List The collection of kanaMessage10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_NotInScope(Collection<String> kanaMessage10List) {
        doSetKanaMessage10_NotInScope(kanaMessage10List);
    }

    protected void doSetKanaMessage10_NotInScope(Collection<String> kanaMessage10List) {
        regINS(CK_NINS, cTL(kanaMessage10List), xgetCValueKanaMessage10(), "KANA_MESSAGE10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)} <br>
     * <pre>e.g. setKanaMessage10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kanaMessage10 The value of kanaMessage10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKanaMessage10_LikeSearch(String kanaMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kanaMessage10), xgetCValueKanaMessage10(), "KANA_MESSAGE10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKanaMessage10_NotLikeSearch(String kanaMessage10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kanaMessage10), xgetCValueKanaMessage10(), "KANA_MESSAGE10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     * @param kanaMessage10 The value of kanaMessage10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKanaMessage10_PrefixSearch(String kanaMessage10) {
        setKanaMessage10_LikeSearch(kanaMessage10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNull() { regKanaMessage10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNullOrEmpty() { regKanaMessage10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KANA_MESSAGE10: {VARCHAR(60)}
     */
    public void setKanaMessage10_IsNotNull() { regKanaMessage10(CK_ISNN, DOBJ); }

    protected void regKanaMessage10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKanaMessage10(), "KANA_MESSAGE10"); }
    protected abstract ConditionValue xgetCValueKanaMessage10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_Equal(String deliveryNoteSummary) {
        doSetDeliveryNoteSummary_Equal(fRES(deliveryNoteSummary));
    }

    protected void doSetDeliveryNoteSummary_Equal(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_EQ, deliveryNoteSummary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_NotEqual(String deliveryNoteSummary) {
        doSetDeliveryNoteSummary_NotEqual(fRES(deliveryNoteSummary));
    }

    protected void doSetDeliveryNoteSummary_NotEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_NES, deliveryNoteSummary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_GreaterThan(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_GT, fRES(deliveryNoteSummary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_LessThan(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_LT, fRES(deliveryNoteSummary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_GreaterEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_GE, fRES(deliveryNoteSummary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_LessEqual(String deliveryNoteSummary) {
        regDeliveryNoteSummary(CK_LE, fRES(deliveryNoteSummary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummaryList The collection of deliveryNoteSummary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_InScope(Collection<String> deliveryNoteSummaryList) {
        doSetDeliveryNoteSummary_InScope(deliveryNoteSummaryList);
    }

    protected void doSetDeliveryNoteSummary_InScope(Collection<String> deliveryNoteSummaryList) {
        regINS(CK_INS, cTL(deliveryNoteSummaryList), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummaryList The collection of deliveryNoteSummary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_NotInScope(Collection<String> deliveryNoteSummaryList) {
        doSetDeliveryNoteSummary_NotInScope(deliveryNoteSummaryList);
    }

    protected void doSetDeliveryNoteSummary_NotInScope(Collection<String> deliveryNoteSummaryList) {
        regINS(CK_NINS, cTL(deliveryNoteSummaryList), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)} <br>
     * <pre>e.g. setDeliveryNoteSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryNoteSummary The value of deliveryNoteSummary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryNoteSummary_LikeSearch(String deliveryNoteSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryNoteSummary), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryNoteSummary_NotLikeSearch(String deliveryNoteSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryNoteSummary), xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     * @param deliveryNoteSummary The value of deliveryNoteSummary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryNoteSummary_PrefixSearch(String deliveryNoteSummary) {
        setDeliveryNoteSummary_LikeSearch(deliveryNoteSummary, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNull() { regDeliveryNoteSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNullOrEmpty() { regDeliveryNoteSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
     */
    public void setDeliveryNoteSummary_IsNotNull() { regDeliveryNoteSummary(CK_ISNN, DOBJ); }

    protected void regDeliveryNoteSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryNoteSummary(), "DELIVERY_NOTE_SUMMARY"); }
    protected abstract ConditionValue xgetCValueDeliveryNoteSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_Equal(String invoiceSummary) {
        doSetInvoiceSummary_Equal(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_Equal(String invoiceSummary) {
        regInvoiceSummary(CK_EQ, invoiceSummary);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotEqual(String invoiceSummary) {
        doSetInvoiceSummary_NotEqual(fRES(invoiceSummary));
    }

    protected void doSetInvoiceSummary_NotEqual(String invoiceSummary) {
        regInvoiceSummary(CK_NES, invoiceSummary);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterThan(String invoiceSummary) {
        regInvoiceSummary(CK_GT, fRES(invoiceSummary));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessThan(String invoiceSummary) {
        regInvoiceSummary(CK_LT, fRES(invoiceSummary));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_GreaterEqual(String invoiceSummary) {
        regInvoiceSummary(CK_GE, fRES(invoiceSummary));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_LessEqual(String invoiceSummary) {
        regInvoiceSummary(CK_LE, fRES(invoiceSummary));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummaryList The collection of invoiceSummary as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_InScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_InScope(Collection<String> invoiceSummaryList) {
        regINS(CK_INS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummaryList The collection of invoiceSummary as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        doSetInvoiceSummary_NotInScope(invoiceSummaryList);
    }

    protected void doSetInvoiceSummary_NotInScope(Collection<String> invoiceSummaryList) {
        regINS(CK_NINS, cTL(invoiceSummaryList), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)} <br>
     * <pre>e.g. setInvoiceSummary_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param invoiceSummary The value of invoiceSummary as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInvoiceSummary_LikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInvoiceSummary_NotLikeSearch(String invoiceSummary, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(invoiceSummary), xgetCValueInvoiceSummary(), "INVOICE_SUMMARY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     * @param invoiceSummary The value of invoiceSummary as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInvoiceSummary_PrefixSearch(String invoiceSummary) {
        setInvoiceSummary_LikeSearch(invoiceSummary, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNull() { regInvoiceSummary(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNullOrEmpty() { regInvoiceSummary(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVOICE_SUMMARY: {VARCHAR(60)}
     */
    public void setInvoiceSummary_IsNotNull() { regInvoiceSummary(CK_ISNN, DOBJ); }

    protected void regInvoiceSummary(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInvoiceSummary(), "INVOICE_SUMMARY"); }
    protected abstract ConditionValue xgetCValueInvoiceSummary();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_Equal(String unitPrice) {
        doSetUnitPrice_Equal(fRES(unitPrice));
    }

    protected void doSetUnitPrice_Equal(String unitPrice) {
        regUnitPrice(CK_EQ, unitPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotEqual(String unitPrice) {
        doSetUnitPrice_NotEqual(fRES(unitPrice));
    }

    protected void doSetUnitPrice_NotEqual(String unitPrice) {
        regUnitPrice(CK_NES, unitPrice);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterThan(String unitPrice) {
        regUnitPrice(CK_GT, fRES(unitPrice));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_LessThan(String unitPrice) {
        regUnitPrice(CK_LT, fRES(unitPrice));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_GreaterEqual(String unitPrice) {
        regUnitPrice(CK_GE, fRES(unitPrice));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_LessEqual(String unitPrice) {
        regUnitPrice(CK_LE, fRES(unitPrice));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPriceList The collection of unitPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_InScope(Collection<String> unitPriceList) {
        doSetUnitPrice_InScope(unitPriceList);
    }

    protected void doSetUnitPrice_InScope(Collection<String> unitPriceList) {
        regINS(CK_INS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPriceList The collection of unitPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_NotInScope(Collection<String> unitPriceList) {
        doSetUnitPrice_NotInScope(unitPriceList);
    }

    protected void doSetUnitPrice_NotInScope(Collection<String> unitPriceList) {
        regINS(CK_NINS, cTL(unitPriceList), xgetCValueUnitPrice(), "UNIT_PRICE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)} <br>
     * <pre>e.g. setUnitPrice_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param unitPrice The value of unitPrice as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUnitPrice_LikeSearch(String unitPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(unitPrice), xgetCValueUnitPrice(), "UNIT_PRICE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUnitPrice_NotLikeSearch(String unitPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(unitPrice), xgetCValueUnitPrice(), "UNIT_PRICE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     * @param unitPrice The value of unitPrice as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUnitPrice_PrefixSearch(String unitPrice) {
        setUnitPrice_LikeSearch(unitPrice, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     */
    public void setUnitPrice_IsNull() { regUnitPrice(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     */
    public void setUnitPrice_IsNullOrEmpty() { regUnitPrice(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNIT_PRICE: {VARCHAR(30)}
     */
    public void setUnitPrice_IsNotNull() { regUnitPrice(CK_ISNN, DOBJ); }

    protected void regUnitPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUnitPrice(), "UNIT_PRICE"); }
    protected abstract ConditionValue xgetCValueUnitPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_Equal(String ecOrderNo) {
        doSetEcOrderNo_Equal(fRES(ecOrderNo));
    }

    protected void doSetEcOrderNo_Equal(String ecOrderNo) {
        regEcOrderNo(CK_EQ, ecOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_NotEqual(String ecOrderNo) {
        doSetEcOrderNo_NotEqual(fRES(ecOrderNo));
    }

    protected void doSetEcOrderNo_NotEqual(String ecOrderNo) {
        regEcOrderNo(CK_NES, ecOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_GreaterThan(String ecOrderNo) {
        regEcOrderNo(CK_GT, fRES(ecOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_LessThan(String ecOrderNo) {
        regEcOrderNo(CK_LT, fRES(ecOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_GreaterEqual(String ecOrderNo) {
        regEcOrderNo(CK_GE, fRES(ecOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_LessEqual(String ecOrderNo) {
        regEcOrderNo(CK_LE, fRES(ecOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNoList The collection of ecOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_InScope(Collection<String> ecOrderNoList) {
        doSetEcOrderNo_InScope(ecOrderNoList);
    }

    protected void doSetEcOrderNo_InScope(Collection<String> ecOrderNoList) {
        regINS(CK_INS, cTL(ecOrderNoList), xgetCValueEcOrderNo(), "EC_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNoList The collection of ecOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_NotInScope(Collection<String> ecOrderNoList) {
        doSetEcOrderNo_NotInScope(ecOrderNoList);
    }

    protected void doSetEcOrderNo_NotInScope(Collection<String> ecOrderNoList) {
        regINS(CK_NINS, cTL(ecOrderNoList), xgetCValueEcOrderNo(), "EC_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setEcOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecOrderNo The value of ecOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcOrderNo_LikeSearch(String ecOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecOrderNo), xgetCValueEcOrderNo(), "EC_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcOrderNo_NotLikeSearch(String ecOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecOrderNo), xgetCValueEcOrderNo(), "EC_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     * @param ecOrderNo The value of ecOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderNo_PrefixSearch(String ecOrderNo) {
        setEcOrderNo_LikeSearch(ecOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNull() { regEcOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNullOrEmpty() { regEcOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_NO: {VARCHAR(30)}
     */
    public void setEcOrderNo_IsNotNull() { regEcOrderNo(CK_ISNN, DOBJ); }

    protected void regEcOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderNo(), "EC_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueEcOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_Equal(String ecOrderBranchNo) {
        doSetEcOrderBranchNo_Equal(fRES(ecOrderBranchNo));
    }

    protected void doSetEcOrderBranchNo_Equal(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_EQ, ecOrderBranchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_NotEqual(String ecOrderBranchNo) {
        doSetEcOrderBranchNo_NotEqual(fRES(ecOrderBranchNo));
    }

    protected void doSetEcOrderBranchNo_NotEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_NES, ecOrderBranchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_GreaterThan(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_GT, fRES(ecOrderBranchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_LessThan(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_LT, fRES(ecOrderBranchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_GreaterEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_GE, fRES(ecOrderBranchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_LessEqual(String ecOrderBranchNo) {
        regEcOrderBranchNo(CK_LE, fRES(ecOrderBranchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNoList The collection of ecOrderBranchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_InScope(Collection<String> ecOrderBranchNoList) {
        doSetEcOrderBranchNo_InScope(ecOrderBranchNoList);
    }

    protected void doSetEcOrderBranchNo_InScope(Collection<String> ecOrderBranchNoList) {
        regINS(CK_INS, cTL(ecOrderBranchNoList), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNoList The collection of ecOrderBranchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_NotInScope(Collection<String> ecOrderBranchNoList) {
        doSetEcOrderBranchNo_NotInScope(ecOrderBranchNoList);
    }

    protected void doSetEcOrderBranchNo_NotInScope(Collection<String> ecOrderBranchNoList) {
        regINS(CK_NINS, cTL(ecOrderBranchNoList), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setEcOrderBranchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecOrderBranchNo The value of ecOrderBranchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcOrderBranchNo_LikeSearch(String ecOrderBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecOrderBranchNo), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcOrderBranchNo_NotLikeSearch(String ecOrderBranchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecOrderBranchNo), xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     * @param ecOrderBranchNo The value of ecOrderBranchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcOrderBranchNo_PrefixSearch(String ecOrderBranchNo) {
        setEcOrderBranchNo_LikeSearch(ecOrderBranchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNull() { regEcOrderBranchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNullOrEmpty() { regEcOrderBranchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
     */
    public void setEcOrderBranchNo_IsNotNull() { regEcOrderBranchNo(CK_ISNN, DOBJ); }

    protected void regEcOrderBranchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcOrderBranchNo(), "EC_ORDER_BRANCH_NO"); }
    protected abstract ConditionValue xgetCValueEcOrderBranchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_Equal(String ecProductNmKanji) {
        doSetEcProductNmKanji_Equal(fRES(ecProductNmKanji));
    }

    protected void doSetEcProductNmKanji_Equal(String ecProductNmKanji) {
        regEcProductNmKanji(CK_EQ, ecProductNmKanji);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_NotEqual(String ecProductNmKanji) {
        doSetEcProductNmKanji_NotEqual(fRES(ecProductNmKanji));
    }

    protected void doSetEcProductNmKanji_NotEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_NES, ecProductNmKanji);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_GreaterThan(String ecProductNmKanji) {
        regEcProductNmKanji(CK_GT, fRES(ecProductNmKanji));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_LessThan(String ecProductNmKanji) {
        regEcProductNmKanji(CK_LT, fRES(ecProductNmKanji));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_GreaterEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_GE, fRES(ecProductNmKanji));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_LessEqual(String ecProductNmKanji) {
        regEcProductNmKanji(CK_LE, fRES(ecProductNmKanji));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanjiList The collection of ecProductNmKanji as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_InScope(Collection<String> ecProductNmKanjiList) {
        doSetEcProductNmKanji_InScope(ecProductNmKanjiList);
    }

    protected void doSetEcProductNmKanji_InScope(Collection<String> ecProductNmKanjiList) {
        regINS(CK_INS, cTL(ecProductNmKanjiList), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanjiList The collection of ecProductNmKanji as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_NotInScope(Collection<String> ecProductNmKanjiList) {
        doSetEcProductNmKanji_NotInScope(ecProductNmKanjiList);
    }

    protected void doSetEcProductNmKanji_NotInScope(Collection<String> ecProductNmKanjiList) {
        regINS(CK_NINS, cTL(ecProductNmKanjiList), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * <pre>e.g. setEcProductNmKanji_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ecProductNmKanji The value of ecProductNmKanji as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEcProductNmKanji_LikeSearch(String ecProductNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ecProductNmKanji), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEcProductNmKanji_NotLikeSearch(String ecProductNmKanji, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ecProductNmKanji), xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     * @param ecProductNmKanji The value of ecProductNmKanji as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEcProductNmKanji_PrefixSearch(String ecProductNmKanji) {
        setEcProductNmKanji_LikeSearch(ecProductNmKanji, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNull() { regEcProductNmKanji(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNullOrEmpty() { regEcProductNmKanji(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
     */
    public void setEcProductNmKanji_IsNotNull() { regEcProductNmKanji(CK_ISNN, DOBJ); }

    protected void regEcProductNmKanji(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEcProductNmKanji(), "EC_PRODUCT_NM_KANJI"); }
    protected abstract ConditionValue xgetCValueEcProductNmKanji();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_Equal(String orderDt) {
        doSetOrderDt_Equal(fRES(orderDt));
    }

    protected void doSetOrderDt_Equal(String orderDt) {
        regOrderDt(CK_EQ, orderDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotEqual(String orderDt) {
        doSetOrderDt_NotEqual(fRES(orderDt));
    }

    protected void doSetOrderDt_NotEqual(String orderDt) {
        regOrderDt(CK_NES, orderDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterThan(String orderDt) {
        regOrderDt(CK_GT, fRES(orderDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessThan(String orderDt) {
        regOrderDt(CK_LT, fRES(orderDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_GreaterEqual(String orderDt) {
        regOrderDt(CK_GE, fRES(orderDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_LessEqual(String orderDt) {
        regOrderDt(CK_LE, fRES(orderDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDtList The collection of orderDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_InScope(Collection<String> orderDtList) {
        doSetOrderDt_InScope(orderDtList);
    }

    protected void doSetOrderDt_InScope(Collection<String> orderDtList) {
        regINS(CK_INS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDtList The collection of orderDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_NotInScope(Collection<String> orderDtList) {
        doSetOrderDt_NotInScope(orderDtList);
    }

    protected void doSetOrderDt_NotInScope(Collection<String> orderDtList) {
        regINS(CK_NINS, cTL(orderDtList), xgetCValueOrderDt(), "ORDER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setOrderDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDt The value of orderDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDt_LikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDt_NotLikeSearch(String orderDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDt), xgetCValueOrderDt(), "ORDER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     * @param orderDt The value of orderDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDt_PrefixSearch(String orderDt) {
        setOrderDt_LikeSearch(orderDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     */
    public void setOrderDt_IsNull() { regOrderDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     */
    public void setOrderDt_IsNullOrEmpty() { regOrderDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DT: {VARCHAR(30)}
     */
    public void setOrderDt_IsNotNull() { regOrderDt(CK_ISNN, DOBJ); }

    protected void regOrderDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDt(), "ORDER_DT"); }
    protected abstract ConditionValue xgetCValueOrderDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_Equal(String kokyakuCd) {
        doSetKokyakuCd_Equal(fRES(kokyakuCd));
    }

    protected void doSetKokyakuCd_Equal(String kokyakuCd) {
        regKokyakuCd(CK_EQ, kokyakuCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_NotEqual(String kokyakuCd) {
        doSetKokyakuCd_NotEqual(fRES(kokyakuCd));
    }

    protected void doSetKokyakuCd_NotEqual(String kokyakuCd) {
        regKokyakuCd(CK_NES, kokyakuCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_GreaterThan(String kokyakuCd) {
        regKokyakuCd(CK_GT, fRES(kokyakuCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_LessThan(String kokyakuCd) {
        regKokyakuCd(CK_LT, fRES(kokyakuCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_GreaterEqual(String kokyakuCd) {
        regKokyakuCd(CK_GE, fRES(kokyakuCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_LessEqual(String kokyakuCd) {
        regKokyakuCd(CK_LE, fRES(kokyakuCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCdList The collection of kokyakuCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_InScope(Collection<String> kokyakuCdList) {
        doSetKokyakuCd_InScope(kokyakuCdList);
    }

    protected void doSetKokyakuCd_InScope(Collection<String> kokyakuCdList) {
        regINS(CK_INS, cTL(kokyakuCdList), xgetCValueKokyakuCd(), "KOKYAKU_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCdList The collection of kokyakuCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_NotInScope(Collection<String> kokyakuCdList) {
        doSetKokyakuCd_NotInScope(kokyakuCdList);
    }

    protected void doSetKokyakuCd_NotInScope(Collection<String> kokyakuCdList) {
        regINS(CK_NINS, cTL(kokyakuCdList), xgetCValueKokyakuCd(), "KOKYAKU_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKokyakuCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kokyakuCd The value of kokyakuCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKokyakuCd_LikeSearch(String kokyakuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kokyakuCd), xgetCValueKokyakuCd(), "KOKYAKU_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKokyakuCd_NotLikeSearch(String kokyakuCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kokyakuCd), xgetCValueKokyakuCd(), "KOKYAKU_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     * @param kokyakuCd The value of kokyakuCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKokyakuCd_PrefixSearch(String kokyakuCd) {
        setKokyakuCd_LikeSearch(kokyakuCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNull() { regKokyakuCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNullOrEmpty() { regKokyakuCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOKYAKU_CD: {VARCHAR(30)}
     */
    public void setKokyakuCd_IsNotNull() { regKokyakuCd(CK_ISNN, DOBJ); }

    protected void regKokyakuCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKokyakuCd(), "KOKYAKU_CD"); }
    protected abstract ConditionValue xgetCValueKokyakuCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_Equal(String paymentTypeCd) {
        doSetPaymentTypeCd_Equal(fRES(paymentTypeCd));
    }

    protected void doSetPaymentTypeCd_Equal(String paymentTypeCd) {
        regPaymentTypeCd(CK_EQ, paymentTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_NotEqual(String paymentTypeCd) {
        doSetPaymentTypeCd_NotEqual(fRES(paymentTypeCd));
    }

    protected void doSetPaymentTypeCd_NotEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_NES, paymentTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_GreaterThan(String paymentTypeCd) {
        regPaymentTypeCd(CK_GT, fRES(paymentTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_LessThan(String paymentTypeCd) {
        regPaymentTypeCd(CK_LT, fRES(paymentTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_GreaterEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_GE, fRES(paymentTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_LessEqual(String paymentTypeCd) {
        regPaymentTypeCd(CK_LE, fRES(paymentTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCdList The collection of paymentTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_InScope(Collection<String> paymentTypeCdList) {
        doSetPaymentTypeCd_InScope(paymentTypeCdList);
    }

    protected void doSetPaymentTypeCd_InScope(Collection<String> paymentTypeCdList) {
        regINS(CK_INS, cTL(paymentTypeCdList), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCdList The collection of paymentTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_NotInScope(Collection<String> paymentTypeCdList) {
        doSetPaymentTypeCd_NotInScope(paymentTypeCdList);
    }

    protected void doSetPaymentTypeCd_NotInScope(Collection<String> paymentTypeCdList) {
        regINS(CK_NINS, cTL(paymentTypeCdList), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPaymentTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentTypeCd The value of paymentTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentTypeCd_LikeSearch(String paymentTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentTypeCd), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentTypeCd_NotLikeSearch(String paymentTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentTypeCd), xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     * @param paymentTypeCd The value of paymentTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentTypeCd_PrefixSearch(String paymentTypeCd) {
        setPaymentTypeCd_LikeSearch(paymentTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNull() { regPaymentTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNullOrEmpty() { regPaymentTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_TYPE_CD: {VARCHAR(30)}
     */
    public void setPaymentTypeCd_IsNotNull() { regPaymentTypeCd(CK_ISNN, DOBJ); }

    protected void regPaymentTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentTypeCd(), "PAYMENT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValuePaymentTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_Equal(String totalPrice) {
        doSetTotalPrice_Equal(fRES(totalPrice));
    }

    protected void doSetTotalPrice_Equal(String totalPrice) {
        regTotalPrice(CK_EQ, totalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotEqual(String totalPrice) {
        doSetTotalPrice_NotEqual(fRES(totalPrice));
    }

    protected void doSetTotalPrice_NotEqual(String totalPrice) {
        regTotalPrice(CK_NES, totalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterThan(String totalPrice) {
        regTotalPrice(CK_GT, fRES(totalPrice));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_LessThan(String totalPrice) {
        regTotalPrice(CK_LT, fRES(totalPrice));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterEqual(String totalPrice) {
        regTotalPrice(CK_GE, fRES(totalPrice));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_LessEqual(String totalPrice) {
        regTotalPrice(CK_LE, fRES(totalPrice));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPriceList The collection of totalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_InScope(Collection<String> totalPriceList) {
        doSetTotalPrice_InScope(totalPriceList);
    }

    protected void doSetTotalPrice_InScope(Collection<String> totalPriceList) {
        regINS(CK_INS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPriceList The collection of totalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotInScope(Collection<String> totalPriceList) {
        doSetTotalPrice_NotInScope(totalPriceList);
    }

    protected void doSetTotalPrice_NotInScope(Collection<String> totalPriceList) {
        regINS(CK_NINS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)} <br>
     * <pre>e.g. setTotalPrice_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param totalPrice The value of totalPrice as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTotalPrice_LikeSearch(String totalPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(totalPrice), xgetCValueTotalPrice(), "TOTAL_PRICE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTotalPrice_NotLikeSearch(String totalPrice, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(totalPrice), xgetCValueTotalPrice(), "TOTAL_PRICE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     * @param totalPrice The value of totalPrice as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_PrefixSearch(String totalPrice) {
        setTotalPrice_LikeSearch(totalPrice, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     */
    public void setTotalPrice_IsNull() { regTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     */
    public void setTotalPrice_IsNullOrEmpty() { regTotalPrice(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {VARCHAR(30)}
     */
    public void setTotalPrice_IsNotNull() { regTotalPrice(CK_ISNN, DOBJ); }

    protected void regTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPrice(), "TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueTotalPrice();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_Equal(String shippingFee) {
        doSetShippingFee_Equal(fRES(shippingFee));
    }

    protected void doSetShippingFee_Equal(String shippingFee) {
        regShippingFee(CK_EQ, shippingFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_NotEqual(String shippingFee) {
        doSetShippingFee_NotEqual(fRES(shippingFee));
    }

    protected void doSetShippingFee_NotEqual(String shippingFee) {
        regShippingFee(CK_NES, shippingFee);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterThan(String shippingFee) {
        regShippingFee(CK_GT, fRES(shippingFee));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_LessThan(String shippingFee) {
        regShippingFee(CK_LT, fRES(shippingFee));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_GreaterEqual(String shippingFee) {
        regShippingFee(CK_GE, fRES(shippingFee));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_LessEqual(String shippingFee) {
        regShippingFee(CK_LE, fRES(shippingFee));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFeeList The collection of shippingFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_InScope(Collection<String> shippingFeeList) {
        doSetShippingFee_InScope(shippingFeeList);
    }

    protected void doSetShippingFee_InScope(Collection<String> shippingFeeList) {
        regINS(CK_INS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFeeList The collection of shippingFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_NotInScope(Collection<String> shippingFeeList) {
        doSetShippingFee_NotInScope(shippingFeeList);
    }

    protected void doSetShippingFee_NotInScope(Collection<String> shippingFeeList) {
        regINS(CK_NINS, cTL(shippingFeeList), xgetCValueShippingFee(), "SHIPPING_FEE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingFee_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingFee The value of shippingFee as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingFee_LikeSearch(String shippingFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingFee), xgetCValueShippingFee(), "SHIPPING_FEE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingFee_NotLikeSearch(String shippingFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingFee), xgetCValueShippingFee(), "SHIPPING_FEE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     * @param shippingFee The value of shippingFee as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingFee_PrefixSearch(String shippingFee) {
        setShippingFee_LikeSearch(shippingFee, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setShippingFee_IsNull() { regShippingFee(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setShippingFee_IsNullOrEmpty() { regShippingFee(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setShippingFee_IsNotNull() { regShippingFee(CK_ISNN, DOBJ); }

    protected void regShippingFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingFee(), "SHIPPING_FEE"); }
    protected abstract ConditionValue xgetCValueShippingFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_Equal(String separateShippingFee) {
        doSetSeparateShippingFee_Equal(fRES(separateShippingFee));
    }

    protected void doSetSeparateShippingFee_Equal(String separateShippingFee) {
        regSeparateShippingFee(CK_EQ, separateShippingFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_NotEqual(String separateShippingFee) {
        doSetSeparateShippingFee_NotEqual(fRES(separateShippingFee));
    }

    protected void doSetSeparateShippingFee_NotEqual(String separateShippingFee) {
        regSeparateShippingFee(CK_NES, separateShippingFee);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_GreaterThan(String separateShippingFee) {
        regSeparateShippingFee(CK_GT, fRES(separateShippingFee));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_LessThan(String separateShippingFee) {
        regSeparateShippingFee(CK_LT, fRES(separateShippingFee));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_GreaterEqual(String separateShippingFee) {
        regSeparateShippingFee(CK_GE, fRES(separateShippingFee));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_LessEqual(String separateShippingFee) {
        regSeparateShippingFee(CK_LE, fRES(separateShippingFee));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFeeList The collection of separateShippingFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_InScope(Collection<String> separateShippingFeeList) {
        doSetSeparateShippingFee_InScope(separateShippingFeeList);
    }

    protected void doSetSeparateShippingFee_InScope(Collection<String> separateShippingFeeList) {
        regINS(CK_INS, cTL(separateShippingFeeList), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFeeList The collection of separateShippingFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_NotInScope(Collection<String> separateShippingFeeList) {
        doSetSeparateShippingFee_NotInScope(separateShippingFeeList);
    }

    protected void doSetSeparateShippingFee_NotInScope(Collection<String> separateShippingFeeList) {
        regINS(CK_NINS, cTL(separateShippingFeeList), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)} <br>
     * <pre>e.g. setSeparateShippingFee_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param separateShippingFee The value of separateShippingFee as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSeparateShippingFee_LikeSearch(String separateShippingFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(separateShippingFee), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSeparateShippingFee_NotLikeSearch(String separateShippingFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(separateShippingFee), xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     * @param separateShippingFee The value of separateShippingFee as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSeparateShippingFee_PrefixSearch(String separateShippingFee) {
        setSeparateShippingFee_LikeSearch(separateShippingFee, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setSeparateShippingFee_IsNull() { regSeparateShippingFee(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setSeparateShippingFee_IsNullOrEmpty() { regSeparateShippingFee(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
     */
    public void setSeparateShippingFee_IsNotNull() { regSeparateShippingFee(CK_ISNN, DOBJ); }

    protected void regSeparateShippingFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSeparateShippingFee(), "SEPARATE_SHIPPING_FEE"); }
    protected abstract ConditionValue xgetCValueSeparateShippingFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_Equal(String codFee) {
        doSetCodFee_Equal(fRES(codFee));
    }

    protected void doSetCodFee_Equal(String codFee) {
        regCodFee(CK_EQ, codFee);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_NotEqual(String codFee) {
        doSetCodFee_NotEqual(fRES(codFee));
    }

    protected void doSetCodFee_NotEqual(String codFee) {
        regCodFee(CK_NES, codFee);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_GreaterThan(String codFee) {
        regCodFee(CK_GT, fRES(codFee));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_LessThan(String codFee) {
        regCodFee(CK_LT, fRES(codFee));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_GreaterEqual(String codFee) {
        regCodFee(CK_GE, fRES(codFee));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_LessEqual(String codFee) {
        regCodFee(CK_LE, fRES(codFee));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFeeList The collection of codFee as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_InScope(Collection<String> codFeeList) {
        doSetCodFee_InScope(codFeeList);
    }

    protected void doSetCodFee_InScope(Collection<String> codFeeList) {
        regINS(CK_INS, cTL(codFeeList), xgetCValueCodFee(), "COD_FEE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFeeList The collection of codFee as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_NotInScope(Collection<String> codFeeList) {
        doSetCodFee_NotInScope(codFeeList);
    }

    protected void doSetCodFee_NotInScope(Collection<String> codFeeList) {
        regINS(CK_NINS, cTL(codFeeList), xgetCValueCodFee(), "COD_FEE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE: {VARCHAR(30)} <br>
     * <pre>e.g. setCodFee_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param codFee The value of codFee as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCodFee_LikeSearch(String codFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(codFee), xgetCValueCodFee(), "COD_FEE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCodFee_NotLikeSearch(String codFee, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(codFee), xgetCValueCodFee(), "COD_FEE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     * @param codFee The value of codFee as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodFee_PrefixSearch(String codFee) {
        setCodFee_LikeSearch(codFee, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     */
    public void setCodFee_IsNull() { regCodFee(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     */
    public void setCodFee_IsNullOrEmpty() { regCodFee(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_FEE: {VARCHAR(30)}
     */
    public void setCodFee_IsNotNull() { regCodFee(CK_ISNN, DOBJ); }

    protected void regCodFee(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodFee(), "COD_FEE"); }
    protected abstract ConditionValue xgetCValueCodFee();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_Equal(String salesTaxRate) {
        doSetSalesTaxRate_Equal(fRES(salesTaxRate));
    }

    protected void doSetSalesTaxRate_Equal(String salesTaxRate) {
        regSalesTaxRate(CK_EQ, salesTaxRate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_NotEqual(String salesTaxRate) {
        doSetSalesTaxRate_NotEqual(fRES(salesTaxRate));
    }

    protected void doSetSalesTaxRate_NotEqual(String salesTaxRate) {
        regSalesTaxRate(CK_NES, salesTaxRate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_GreaterThan(String salesTaxRate) {
        regSalesTaxRate(CK_GT, fRES(salesTaxRate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_LessThan(String salesTaxRate) {
        regSalesTaxRate(CK_LT, fRES(salesTaxRate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_GreaterEqual(String salesTaxRate) {
        regSalesTaxRate(CK_GE, fRES(salesTaxRate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_LessEqual(String salesTaxRate) {
        regSalesTaxRate(CK_LE, fRES(salesTaxRate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRateList The collection of salesTaxRate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_InScope(Collection<String> salesTaxRateList) {
        doSetSalesTaxRate_InScope(salesTaxRateList);
    }

    protected void doSetSalesTaxRate_InScope(Collection<String> salesTaxRateList) {
        regINS(CK_INS, cTL(salesTaxRateList), xgetCValueSalesTaxRate(), "SALES_TAX_RATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRateList The collection of salesTaxRate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_NotInScope(Collection<String> salesTaxRateList) {
        doSetSalesTaxRate_NotInScope(salesTaxRateList);
    }

    protected void doSetSalesTaxRate_NotInScope(Collection<String> salesTaxRateList) {
        regINS(CK_NINS, cTL(salesTaxRateList), xgetCValueSalesTaxRate(), "SALES_TAX_RATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesTaxRate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesTaxRate The value of salesTaxRate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesTaxRate_LikeSearch(String salesTaxRate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesTaxRate), xgetCValueSalesTaxRate(), "SALES_TAX_RATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesTaxRate_NotLikeSearch(String salesTaxRate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesTaxRate), xgetCValueSalesTaxRate(), "SALES_TAX_RATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     * @param salesTaxRate The value of salesTaxRate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesTaxRate_PrefixSearch(String salesTaxRate) {
        setSalesTaxRate_LikeSearch(salesTaxRate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     */
    public void setSalesTaxRate_IsNull() { regSalesTaxRate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     */
    public void setSalesTaxRate_IsNullOrEmpty() { regSalesTaxRate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_TAX_RATE: {VARCHAR(30)}
     */
    public void setSalesTaxRate_IsNotNull() { regSalesTaxRate(CK_ISNN, DOBJ); }

    protected void regSalesTaxRate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesTaxRate(), "SALES_TAX_RATE"); }
    protected abstract ConditionValue xgetCValueSalesTaxRate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_Equal(String priceHiddenFlg) {
        doSetPriceHiddenFlg_Equal(fRES(priceHiddenFlg));
    }

    protected void doSetPriceHiddenFlg_Equal(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_EQ, priceHiddenFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_NotEqual(String priceHiddenFlg) {
        doSetPriceHiddenFlg_NotEqual(fRES(priceHiddenFlg));
    }

    protected void doSetPriceHiddenFlg_NotEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_NES, priceHiddenFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_GreaterThan(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_GT, fRES(priceHiddenFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_LessThan(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_LT, fRES(priceHiddenFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_GreaterEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_GE, fRES(priceHiddenFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_LessEqual(String priceHiddenFlg) {
        regPriceHiddenFlg(CK_LE, fRES(priceHiddenFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlgList The collection of priceHiddenFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_InScope(Collection<String> priceHiddenFlgList) {
        doSetPriceHiddenFlg_InScope(priceHiddenFlgList);
    }

    protected void doSetPriceHiddenFlg_InScope(Collection<String> priceHiddenFlgList) {
        regINS(CK_INS, cTL(priceHiddenFlgList), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlgList The collection of priceHiddenFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_NotInScope(Collection<String> priceHiddenFlgList) {
        doSetPriceHiddenFlg_NotInScope(priceHiddenFlgList);
    }

    protected void doSetPriceHiddenFlg_NotInScope(Collection<String> priceHiddenFlgList) {
        regINS(CK_NINS, cTL(priceHiddenFlgList), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)} <br>
     * <pre>e.g. setPriceHiddenFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param priceHiddenFlg The value of priceHiddenFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPriceHiddenFlg_LikeSearch(String priceHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(priceHiddenFlg), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPriceHiddenFlg_NotLikeSearch(String priceHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(priceHiddenFlg), xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     * @param priceHiddenFlg The value of priceHiddenFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPriceHiddenFlg_PrefixSearch(String priceHiddenFlg) {
        setPriceHiddenFlg_LikeSearch(priceHiddenFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPriceHiddenFlg_IsNull() { regPriceHiddenFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPriceHiddenFlg_IsNullOrEmpty() { regPriceHiddenFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRICE_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPriceHiddenFlg_IsNotNull() { regPriceHiddenFlg(CK_ISNN, DOBJ); }

    protected void regPriceHiddenFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePriceHiddenFlg(), "PRICE_HIDDEN_FLG"); }
    protected abstract ConditionValue xgetCValuePriceHiddenFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_Equal(String paymentHiddenFlg) {
        doSetPaymentHiddenFlg_Equal(fRES(paymentHiddenFlg));
    }

    protected void doSetPaymentHiddenFlg_Equal(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_EQ, paymentHiddenFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_NotEqual(String paymentHiddenFlg) {
        doSetPaymentHiddenFlg_NotEqual(fRES(paymentHiddenFlg));
    }

    protected void doSetPaymentHiddenFlg_NotEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_NES, paymentHiddenFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_GreaterThan(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_GT, fRES(paymentHiddenFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_LessThan(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_LT, fRES(paymentHiddenFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_GreaterEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_GE, fRES(paymentHiddenFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_LessEqual(String paymentHiddenFlg) {
        regPaymentHiddenFlg(CK_LE, fRES(paymentHiddenFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlgList The collection of paymentHiddenFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_InScope(Collection<String> paymentHiddenFlgList) {
        doSetPaymentHiddenFlg_InScope(paymentHiddenFlgList);
    }

    protected void doSetPaymentHiddenFlg_InScope(Collection<String> paymentHiddenFlgList) {
        regINS(CK_INS, cTL(paymentHiddenFlgList), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlgList The collection of paymentHiddenFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_NotInScope(Collection<String> paymentHiddenFlgList) {
        doSetPaymentHiddenFlg_NotInScope(paymentHiddenFlgList);
    }

    protected void doSetPaymentHiddenFlg_NotInScope(Collection<String> paymentHiddenFlgList) {
        regINS(CK_NINS, cTL(paymentHiddenFlgList), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)} <br>
     * <pre>e.g. setPaymentHiddenFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param paymentHiddenFlg The value of paymentHiddenFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPaymentHiddenFlg_LikeSearch(String paymentHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(paymentHiddenFlg), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPaymentHiddenFlg_NotLikeSearch(String paymentHiddenFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(paymentHiddenFlg), xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     * @param paymentHiddenFlg The value of paymentHiddenFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPaymentHiddenFlg_PrefixSearch(String paymentHiddenFlg) {
        setPaymentHiddenFlg_LikeSearch(paymentHiddenFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPaymentHiddenFlg_IsNull() { regPaymentHiddenFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPaymentHiddenFlg_IsNullOrEmpty() { regPaymentHiddenFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
     */
    public void setPaymentHiddenFlg_IsNotNull() { regPaymentHiddenFlg(CK_ISNN, DOBJ); }

    protected void regPaymentHiddenFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePaymentHiddenFlg(), "PAYMENT_HIDDEN_FLG"); }
    protected abstract ConditionValue xgetCValuePaymentHiddenFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_Equal(String orderNoDeliveryNote) {
        doSetOrderNoDeliveryNote_Equal(fRES(orderNoDeliveryNote));
    }

    protected void doSetOrderNoDeliveryNote_Equal(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_EQ, orderNoDeliveryNote);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_NotEqual(String orderNoDeliveryNote) {
        doSetOrderNoDeliveryNote_NotEqual(fRES(orderNoDeliveryNote));
    }

    protected void doSetOrderNoDeliveryNote_NotEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_NES, orderNoDeliveryNote);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_GreaterThan(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_GT, fRES(orderNoDeliveryNote));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_LessThan(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_LT, fRES(orderNoDeliveryNote));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_GreaterEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_GE, fRES(orderNoDeliveryNote));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_LessEqual(String orderNoDeliveryNote) {
        regOrderNoDeliveryNote(CK_LE, fRES(orderNoDeliveryNote));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNoteList The collection of orderNoDeliveryNote as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_InScope(Collection<String> orderNoDeliveryNoteList) {
        doSetOrderNoDeliveryNote_InScope(orderNoDeliveryNoteList);
    }

    protected void doSetOrderNoDeliveryNote_InScope(Collection<String> orderNoDeliveryNoteList) {
        regINS(CK_INS, cTL(orderNoDeliveryNoteList), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNoteList The collection of orderNoDeliveryNote as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_NotInScope(Collection<String> orderNoDeliveryNoteList) {
        doSetOrderNoDeliveryNote_NotInScope(orderNoDeliveryNoteList);
    }

    protected void doSetOrderNoDeliveryNote_NotInScope(Collection<String> orderNoDeliveryNoteList) {
        regINS(CK_NINS, cTL(orderNoDeliveryNoteList), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)} <br>
     * <pre>e.g. setOrderNoDeliveryNote_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderNoDeliveryNote_LikeSearch(String orderNoDeliveryNote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderNoDeliveryNote), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderNoDeliveryNote_NotLikeSearch(String orderNoDeliveryNote, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderNoDeliveryNote), xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     * @param orderNoDeliveryNote The value of orderNoDeliveryNote as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderNoDeliveryNote_PrefixSearch(String orderNoDeliveryNote) {
        setOrderNoDeliveryNote_LikeSearch(orderNoDeliveryNote, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNull() { regOrderNoDeliveryNote(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNullOrEmpty() { regOrderNoDeliveryNote(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
     */
    public void setOrderNoDeliveryNote_IsNotNull() { regOrderNoDeliveryNote(CK_ISNN, DOBJ); }

    protected void regOrderNoDeliveryNote(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderNoDeliveryNote(), "ORDER_NO_DELIVERY_NOTE"); }
    protected abstract ConditionValue xgetCValueOrderNoDeliveryNote();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_Equal(String point) {
        doSetPoint_Equal(fRES(point));
    }

    protected void doSetPoint_Equal(String point) {
        regPoint(CK_EQ, point);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_NotEqual(String point) {
        doSetPoint_NotEqual(fRES(point));
    }

    protected void doSetPoint_NotEqual(String point) {
        regPoint(CK_NES, point);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_GreaterThan(String point) {
        regPoint(CK_GT, fRES(point));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_LessThan(String point) {
        regPoint(CK_LT, fRES(point));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_GreaterEqual(String point) {
        regPoint(CK_GE, fRES(point));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_LessEqual(String point) {
        regPoint(CK_LE, fRES(point));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param pointList The collection of point as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_InScope(Collection<String> pointList) {
        doSetPoint_InScope(pointList);
    }

    protected void doSetPoint_InScope(Collection<String> pointList) {
        regINS(CK_INS, cTL(pointList), xgetCValuePoint(), "POINT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param pointList The collection of point as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_NotInScope(Collection<String> pointList) {
        doSetPoint_NotInScope(pointList);
    }

    protected void doSetPoint_NotInScope(Collection<String> pointList) {
        regINS(CK_NINS, cTL(pointList), xgetCValuePoint(), "POINT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT: {VARCHAR(30)} <br>
     * <pre>e.g. setPoint_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param point The value of point as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPoint_LikeSearch(String point, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(point), xgetCValuePoint(), "POINT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPoint_NotLikeSearch(String point, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(point), xgetCValuePoint(), "POINT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * POINT: {VARCHAR(30)}
     * @param point The value of point as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPoint_PrefixSearch(String point) {
        setPoint_LikeSearch(point, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     */
    public void setPoint_IsNull() { regPoint(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     */
    public void setPoint_IsNullOrEmpty() { regPoint(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * POINT: {VARCHAR(30)}
     */
    public void setPoint_IsNotNull() { regPoint(CK_ISNN, DOBJ); }

    protected void regPoint(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePoint(), "POINT"); }
    protected abstract ConditionValue xgetCValuePoint();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
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
     * STORE_PLANT_CD: {VARCHAR(30)}
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
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterThan(String storePlantCd) {
        regStorePlantCd(CK_GT, fRES(storePlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessThan(String storePlantCd) {
        regStorePlantCd(CK_LT, fRES(storePlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_GreaterEqual(String storePlantCd) {
        regStorePlantCd(CK_GE, fRES(storePlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_LessEqual(String storePlantCd) {
        regStorePlantCd(CK_LE, fRES(storePlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
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
     * STORE_PLANT_CD: {VARCHAR(30)}
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
     * STORE_PLANT_CD: {VARCHAR(30)} <br>
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
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorePlantCd_NotLikeSearch(String storePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storePlantCd), xgetCValueStorePlantCd(), "STORE_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     * @param storePlantCd The value of storePlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorePlantCd_PrefixSearch(String storePlantCd) {
        setStorePlantCd_LikeSearch(storePlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNull() { regStorePlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNullOrEmpty() { regStorePlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_PLANT_CD: {VARCHAR(30)}
     */
    public void setStorePlantCd_IsNotNull() { regStorePlantCd(CK_ISNN, DOBJ); }

    protected void regStorePlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorePlantCd(), "STORE_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueStorePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
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
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
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
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GT, fRES(storeStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessThan(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LT, fRES(storeStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_GreaterEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_GE, fRES(storeStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_LessEqual(String storeStorageSpaceCd) {
        regStoreStorageSpaceCd(CK_LE, fRES(storeStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
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
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
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
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
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
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStoreStorageSpaceCd_NotLikeSearch(String storeStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storeStorageSpaceCd), xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storeStorageSpaceCd The value of storeStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreStorageSpaceCd_PrefixSearch(String storeStorageSpaceCd) {
        setStoreStorageSpaceCd_LikeSearch(storeStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNull() { regStoreStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNullOrEmpty() { regStoreStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStoreStorageSpaceCd_IsNotNull() { regStoreStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStoreStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreStorageSpaceCd(), "STORE_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStoreStorageSpaceCd();

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
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_Equal(String dealTypeCd) {
        doSetDealTypeCd_Equal(fRES(dealTypeCd));
    }

    protected void doSetDealTypeCd_Equal(String dealTypeCd) {
        regDealTypeCd(CK_EQ, dealTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_NotEqual(String dealTypeCd) {
        doSetDealTypeCd_NotEqual(fRES(dealTypeCd));
    }

    protected void doSetDealTypeCd_NotEqual(String dealTypeCd) {
        regDealTypeCd(CK_NES, dealTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_GreaterThan(String dealTypeCd) {
        regDealTypeCd(CK_GT, fRES(dealTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_LessThan(String dealTypeCd) {
        regDealTypeCd(CK_LT, fRES(dealTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_GreaterEqual(String dealTypeCd) {
        regDealTypeCd(CK_GE, fRES(dealTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_LessEqual(String dealTypeCd) {
        regDealTypeCd(CK_LE, fRES(dealTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCdList The collection of dealTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_InScope(Collection<String> dealTypeCdList) {
        doSetDealTypeCd_InScope(dealTypeCdList);
    }

    protected void doSetDealTypeCd_InScope(Collection<String> dealTypeCdList) {
        regINS(CK_INS, cTL(dealTypeCdList), xgetCValueDealTypeCd(), "DEAL_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCdList The collection of dealTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_NotInScope(Collection<String> dealTypeCdList) {
        doSetDealTypeCd_NotInScope(dealTypeCdList);
    }

    protected void doSetDealTypeCd_NotInScope(Collection<String> dealTypeCdList) {
        regINS(CK_NINS, cTL(dealTypeCdList), xgetCValueDealTypeCd(), "DEAL_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDealTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dealTypeCd The value of dealTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDealTypeCd_LikeSearch(String dealTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dealTypeCd), xgetCValueDealTypeCd(), "DEAL_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDealTypeCd_NotLikeSearch(String dealTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dealTypeCd), xgetCValueDealTypeCd(), "DEAL_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     * @param dealTypeCd The value of dealTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDealTypeCd_PrefixSearch(String dealTypeCd) {
        setDealTypeCd_LikeSearch(dealTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNull() { regDealTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNullOrEmpty() { regDealTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEAL_TYPE_CD: {VARCHAR(30)}
     */
    public void setDealTypeCd_IsNotNull() { regDealTypeCd(CK_ISNN, DOBJ); }

    protected void regDealTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDealTypeCd(), "DEAL_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDealTypeCd();

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
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_Equal(String customerNm) {
        doSetCustomerNm_Equal(fRES(customerNm));
    }

    protected void doSetCustomerNm_Equal(String customerNm) {
        regCustomerNm(CK_EQ, customerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotEqual(String customerNm) {
        doSetCustomerNm_NotEqual(fRES(customerNm));
    }

    protected void doSetCustomerNm_NotEqual(String customerNm) {
        regCustomerNm(CK_NES, customerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterThan(String customerNm) {
        regCustomerNm(CK_GT, fRES(customerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessThan(String customerNm) {
        regCustomerNm(CK_LT, fRES(customerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterEqual(String customerNm) {
        regCustomerNm(CK_GE, fRES(customerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessEqual(String customerNm) {
        regCustomerNm(CK_LE, fRES(customerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNmList The collection of customerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_InScope(Collection<String> customerNmList) {
        doSetCustomerNm_InScope(customerNmList);
    }

    protected void doSetCustomerNm_InScope(Collection<String> customerNmList) {
        regINS(CK_INS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNmList The collection of customerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotInScope(Collection<String> customerNmList) {
        doSetCustomerNm_NotInScope(customerNmList);
    }

    protected void doSetCustomerNm_NotInScope(Collection<String> customerNmList) {
        regINS(CK_NINS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerNm The value of customerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerNm_LikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerNm_NotLikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     * @param customerNm The value of customerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_PrefixSearch(String customerNm) {
        setCustomerNm_LikeSearch(customerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNull() { regCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNullOrEmpty() { regCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {VARCHAR(60)}
     */
    public void setCustomerNm_IsNotNull() { regCustomerNm(CK_ISNN, DOBJ); }

    protected void regCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerNm(), "CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_Equal(String delivCd) {
        doSetDelivCd_Equal(fRES(delivCd));
    }

    protected void doSetDelivCd_Equal(String delivCd) {
        regDelivCd(CK_EQ, delivCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotEqual(String delivCd) {
        doSetDelivCd_NotEqual(fRES(delivCd));
    }

    protected void doSetDelivCd_NotEqual(String delivCd) {
        regDelivCd(CK_NES, delivCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterThan(String delivCd) {
        regDelivCd(CK_GT, fRES(delivCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessThan(String delivCd) {
        regDelivCd(CK_LT, fRES(delivCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_GreaterEqual(String delivCd) {
        regDelivCd(CK_GE, fRES(delivCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_LessEqual(String delivCd) {
        regDelivCd(CK_LE, fRES(delivCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_InScope(Collection<String> delivCdList) {
        doSetDelivCd_InScope(delivCdList);
    }

    protected void doSetDelivCd_InScope(Collection<String> delivCdList) {
        regINS(CK_INS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCdList The collection of delivCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_NotInScope(Collection<String> delivCdList) {
        doSetDelivCd_NotInScope(delivCdList);
    }

    protected void doSetDelivCd_NotInScope(Collection<String> delivCdList) {
        regINS(CK_NINS, cTL(delivCdList), xgetCValueDelivCd(), "DELIV_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCd The value of delivCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCd_LikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCd_NotLikeSearch(String delivCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCd), xgetCValueDelivCd(), "DELIV_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     * @param delivCd The value of delivCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCd_PrefixSearch(String delivCd) {
        setDelivCd_LikeSearch(delivCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNull() { regDelivCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNullOrEmpty() { regDelivCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CD: {VARCHAR(30)}
     */
    public void setDelivCd_IsNotNull() { regDelivCd(CK_ISNN, DOBJ); }

    protected void regDelivCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCd(), "DELIV_CD"); }
    protected abstract ConditionValue xgetCValueDelivCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_Equal(String empIdCd) {
        doSetEmpIdCd_Equal(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_Equal(String empIdCd) {
        regEmpIdCd(CK_EQ, empIdCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotEqual(String empIdCd) {
        doSetEmpIdCd_NotEqual(fRES(empIdCd));
    }

    protected void doSetEmpIdCd_NotEqual(String empIdCd) {
        regEmpIdCd(CK_NES, empIdCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterThan(String empIdCd) {
        regEmpIdCd(CK_GT, fRES(empIdCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessThan(String empIdCd) {
        regEmpIdCd(CK_LT, fRES(empIdCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_GreaterEqual(String empIdCd) {
        regEmpIdCd(CK_GE, fRES(empIdCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_LessEqual(String empIdCd) {
        regEmpIdCd(CK_LE, fRES(empIdCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_InScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_InScope(empIdCdList);
    }

    protected void doSetEmpIdCd_InScope(Collection<String> empIdCdList) {
        regINS(CK_INS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCdList The collection of empIdCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        doSetEmpIdCd_NotInScope(empIdCdList);
    }

    protected void doSetEmpIdCd_NotInScope(Collection<String> empIdCdList) {
        regINS(CK_NINS, cTL(empIdCdList), xgetCValueEmpIdCd(), "EMP_ID_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setEmpIdCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empIdCd The value of empIdCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpIdCd_LikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpIdCd_NotLikeSearch(String empIdCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empIdCd), xgetCValueEmpIdCd(), "EMP_ID_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     * @param empIdCd The value of empIdCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpIdCd_PrefixSearch(String empIdCd) {
        setEmpIdCd_LikeSearch(empIdCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNull() { regEmpIdCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNullOrEmpty() { regEmpIdCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_ID_CD: {VARCHAR(30)}
     */
    public void setEmpIdCd_IsNotNull() { regEmpIdCd(CK_ISNN, DOBJ); }

    protected void regEmpIdCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpIdCd(), "EMP_ID_CD"); }
    protected abstract ConditionValue xgetCValueEmpIdCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_Equal(String empNm) {
        doSetEmpNm_Equal(fRES(empNm));
    }

    protected void doSetEmpNm_Equal(String empNm) {
        regEmpNm(CK_EQ, empNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotEqual(String empNm) {
        doSetEmpNm_NotEqual(fRES(empNm));
    }

    protected void doSetEmpNm_NotEqual(String empNm) {
        regEmpNm(CK_NES, empNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterThan(String empNm) {
        regEmpNm(CK_GT, fRES(empNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessThan(String empNm) {
        regEmpNm(CK_LT, fRES(empNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_GreaterEqual(String empNm) {
        regEmpNm(CK_GE, fRES(empNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_LessEqual(String empNm) {
        regEmpNm(CK_LE, fRES(empNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_InScope(Collection<String> empNmList) {
        doSetEmpNm_InScope(empNmList);
    }

    protected void doSetEmpNm_InScope(Collection<String> empNmList) {
        regINS(CK_INS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNmList The collection of empNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_NotInScope(Collection<String> empNmList) {
        doSetEmpNm_NotInScope(empNmList);
    }

    protected void doSetEmpNm_NotInScope(Collection<String> empNmList) {
        regINS(CK_NINS, cTL(empNmList), xgetCValueEmpNm(), "EMP_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setEmpNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param empNm The value of empNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmpNm_LikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmpNm_NotLikeSearch(String empNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(empNm), xgetCValueEmpNm(), "EMP_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     * @param empNm The value of empNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmpNm_PrefixSearch(String empNm) {
        setEmpNm_LikeSearch(empNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNull() { regEmpNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNullOrEmpty() { regEmpNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMP_NM: {VARCHAR(60)}
     */
    public void setEmpNm_IsNotNull() { regEmpNm(CK_ISNN, DOBJ); }

    protected void regEmpNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmpNm(), "EMP_NM"); }
    protected abstract ConditionValue xgetCValueEmpNm();

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
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_Equal(String destinationPrefecture) {
        doSetDestinationPrefecture_Equal(fRES(destinationPrefecture));
    }

    protected void doSetDestinationPrefecture_Equal(String destinationPrefecture) {
        regDestinationPrefecture(CK_EQ, destinationPrefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_NotEqual(String destinationPrefecture) {
        doSetDestinationPrefecture_NotEqual(fRES(destinationPrefecture));
    }

    protected void doSetDestinationPrefecture_NotEqual(String destinationPrefecture) {
        regDestinationPrefecture(CK_NES, destinationPrefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_GreaterThan(String destinationPrefecture) {
        regDestinationPrefecture(CK_GT, fRES(destinationPrefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_LessThan(String destinationPrefecture) {
        regDestinationPrefecture(CK_LT, fRES(destinationPrefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_GreaterEqual(String destinationPrefecture) {
        regDestinationPrefecture(CK_GE, fRES(destinationPrefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_LessEqual(String destinationPrefecture) {
        regDestinationPrefecture(CK_LE, fRES(destinationPrefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefectureList The collection of destinationPrefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_InScope(Collection<String> destinationPrefectureList) {
        doSetDestinationPrefecture_InScope(destinationPrefectureList);
    }

    protected void doSetDestinationPrefecture_InScope(Collection<String> destinationPrefectureList) {
        regINS(CK_INS, cTL(destinationPrefectureList), xgetCValueDestinationPrefecture(), "DESTINATION_PREFECTURE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefectureList The collection of destinationPrefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_NotInScope(Collection<String> destinationPrefectureList) {
        doSetDestinationPrefecture_NotInScope(destinationPrefectureList);
    }

    protected void doSetDestinationPrefecture_NotInScope(Collection<String> destinationPrefectureList) {
        regINS(CK_NINS, cTL(destinationPrefectureList), xgetCValueDestinationPrefecture(), "DESTINATION_PREFECTURE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationPrefecture The value of destinationPrefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationPrefecture_LikeSearch(String destinationPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationPrefecture), xgetCValueDestinationPrefecture(), "DESTINATION_PREFECTURE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationPrefecture_NotLikeSearch(String destinationPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationPrefecture), xgetCValueDestinationPrefecture(), "DESTINATION_PREFECTURE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     * @param destinationPrefecture The value of destinationPrefecture as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationPrefecture_PrefixSearch(String destinationPrefecture) {
        setDestinationPrefecture_LikeSearch(destinationPrefecture, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     */
    public void setDestinationPrefecture_IsNull() { regDestinationPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     */
    public void setDestinationPrefecture_IsNullOrEmpty() { regDestinationPrefecture(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_PREFECTURE: {VARCHAR(30)}
     */
    public void setDestinationPrefecture_IsNotNull() { regDestinationPrefecture(CK_ISNN, DOBJ); }

    protected void regDestinationPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationPrefecture(), "DESTINATION_PREFECTURE"); }
    protected abstract ConditionValue xgetCValueDestinationPrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_Equal(String psam) {
        doSetPsam_Equal(fRES(psam));
    }

    protected void doSetPsam_Equal(String psam) {
        regPsam(CK_EQ, psam);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotEqual(String psam) {
        doSetPsam_NotEqual(fRES(psam));
    }

    protected void doSetPsam_NotEqual(String psam) {
        regPsam(CK_NES, psam);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterThan(String psam) {
        regPsam(CK_GT, fRES(psam));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessThan(String psam) {
        regPsam(CK_LT, fRES(psam));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_GreaterEqual(String psam) {
        regPsam(CK_GE, fRES(psam));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_LessEqual(String psam) {
        regPsam(CK_LE, fRES(psam));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_InScope(Collection<String> psamList) {
        doSetPsam_InScope(psamList);
    }

    protected void doSetPsam_InScope(Collection<String> psamList) {
        regINS(CK_INS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psamList The collection of psam as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_NotInScope(Collection<String> psamList) {
        doSetPsam_NotInScope(psamList);
    }

    protected void doSetPsam_NotInScope(Collection<String> psamList) {
        regINS(CK_NINS, cTL(psamList), xgetCValuePsam(), "PSAM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)} <br>
     * <pre>e.g. setPsam_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param psam The value of psam as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPsam_LikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPsam_NotLikeSearch(String psam, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(psam), xgetCValuePsam(), "PSAM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PSAM: {VARCHAR(30)}
     * @param psam The value of psam as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPsam_PrefixSearch(String psam) {
        setPsam_LikeSearch(psam, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNull() { regPsam(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNullOrEmpty() { regPsam(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PSAM: {VARCHAR(30)}
     */
    public void setPsam_IsNotNull() { regPsam(CK_ISNN, DOBJ); }

    protected void regPsam(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePsam(), "PSAM"); }
    protected abstract ConditionValue xgetCValuePsam();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_Equal(String floorCompFlg) {
        doSetFloorCompFlg_Equal(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_Equal(String floorCompFlg) {
        regFloorCompFlg(CK_EQ, floorCompFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotEqual(String floorCompFlg) {
        doSetFloorCompFlg_NotEqual(fRES(floorCompFlg));
    }

    protected void doSetFloorCompFlg_NotEqual(String floorCompFlg) {
        regFloorCompFlg(CK_NES, floorCompFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterThan(String floorCompFlg) {
        regFloorCompFlg(CK_GT, fRES(floorCompFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessThan(String floorCompFlg) {
        regFloorCompFlg(CK_LT, fRES(floorCompFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_GreaterEqual(String floorCompFlg) {
        regFloorCompFlg(CK_GE, fRES(floorCompFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_LessEqual(String floorCompFlg) {
        regFloorCompFlg(CK_LE, fRES(floorCompFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_InScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_InScope(Collection<String> floorCompFlgList) {
        regINS(CK_INS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlgList The collection of floorCompFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        doSetFloorCompFlg_NotInScope(floorCompFlgList);
    }

    protected void doSetFloorCompFlg_NotInScope(Collection<String> floorCompFlgList) {
        regINS(CK_NINS, cTL(floorCompFlgList), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)} <br>
     * <pre>e.g. setFloorCompFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param floorCompFlg The value of floorCompFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setFloorCompFlg_LikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setFloorCompFlg_NotLikeSearch(String floorCompFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(floorCompFlg), xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     * @param floorCompFlg The value of floorCompFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setFloorCompFlg_PrefixSearch(String floorCompFlg) {
        setFloorCompFlg_LikeSearch(floorCompFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNull() { regFloorCompFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNullOrEmpty() { regFloorCompFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * FLOOR_COMP_FLG: {CHAR(1)}
     */
    public void setFloorCompFlg_IsNotNull() { regFloorCompFlg(CK_ISNN, DOBJ); }

    protected void regFloorCompFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueFloorCompFlg(), "FLOOR_COMP_FLG"); }
    protected abstract ConditionValue xgetCValueFloorCompFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_Equal(String sapAddYyyy) {
        doSetSapAddYyyy_Equal(fRES(sapAddYyyy));
    }

    protected void doSetSapAddYyyy_Equal(String sapAddYyyy) {
        regSapAddYyyy(CK_EQ, sapAddYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_NotEqual(String sapAddYyyy) {
        doSetSapAddYyyy_NotEqual(fRES(sapAddYyyy));
    }

    protected void doSetSapAddYyyy_NotEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_NES, sapAddYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_GreaterThan(String sapAddYyyy) {
        regSapAddYyyy(CK_GT, fRES(sapAddYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_LessThan(String sapAddYyyy) {
        regSapAddYyyy(CK_LT, fRES(sapAddYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_GreaterEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_GE, fRES(sapAddYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_LessEqual(String sapAddYyyy) {
        regSapAddYyyy(CK_LE, fRES(sapAddYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyyList The collection of sapAddYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_InScope(Collection<String> sapAddYyyyList) {
        doSetSapAddYyyy_InScope(sapAddYyyyList);
    }

    protected void doSetSapAddYyyy_InScope(Collection<String> sapAddYyyyList) {
        regINS(CK_INS, cTL(sapAddYyyyList), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyyList The collection of sapAddYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_NotInScope(Collection<String> sapAddYyyyList) {
        doSetSapAddYyyy_NotInScope(sapAddYyyyList);
    }

    protected void doSetSapAddYyyy_NotInScope(Collection<String> sapAddYyyyList) {
        regINS(CK_NINS, cTL(sapAddYyyyList), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddYyyy The value of sapAddYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddYyyy_LikeSearch(String sapAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddYyyy), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddYyyy_NotLikeSearch(String sapAddYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddYyyy), xgetCValueSapAddYyyy(), "SAP_ADD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     * @param sapAddYyyy The value of sapAddYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddYyyy_PrefixSearch(String sapAddYyyy) {
        setSapAddYyyy_LikeSearch(sapAddYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNull() { regSapAddYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNullOrEmpty() { regSapAddYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_YYYY: {VARCHAR(30)}
     */
    public void setSapAddYyyy_IsNotNull() { regSapAddYyyy(CK_ISNN, DOBJ); }

    protected void regSapAddYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddYyyy(), "SAP_ADD_YYYY"); }
    protected abstract ConditionValue xgetCValueSapAddYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_Equal(String sapAddMm) {
        doSetSapAddMm_Equal(fRES(sapAddMm));
    }

    protected void doSetSapAddMm_Equal(String sapAddMm) {
        regSapAddMm(CK_EQ, sapAddMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_NotEqual(String sapAddMm) {
        doSetSapAddMm_NotEqual(fRES(sapAddMm));
    }

    protected void doSetSapAddMm_NotEqual(String sapAddMm) {
        regSapAddMm(CK_NES, sapAddMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_GreaterThan(String sapAddMm) {
        regSapAddMm(CK_GT, fRES(sapAddMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_LessThan(String sapAddMm) {
        regSapAddMm(CK_LT, fRES(sapAddMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_GreaterEqual(String sapAddMm) {
        regSapAddMm(CK_GE, fRES(sapAddMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_LessEqual(String sapAddMm) {
        regSapAddMm(CK_LE, fRES(sapAddMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMmList The collection of sapAddMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_InScope(Collection<String> sapAddMmList) {
        doSetSapAddMm_InScope(sapAddMmList);
    }

    protected void doSetSapAddMm_InScope(Collection<String> sapAddMmList) {
        regINS(CK_INS, cTL(sapAddMmList), xgetCValueSapAddMm(), "SAP_ADD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMmList The collection of sapAddMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_NotInScope(Collection<String> sapAddMmList) {
        doSetSapAddMm_NotInScope(sapAddMmList);
    }

    protected void doSetSapAddMm_NotInScope(Collection<String> sapAddMmList) {
        regINS(CK_NINS, cTL(sapAddMmList), xgetCValueSapAddMm(), "SAP_ADD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddMm The value of sapAddMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddMm_LikeSearch(String sapAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddMm), xgetCValueSapAddMm(), "SAP_ADD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddMm_NotLikeSearch(String sapAddMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddMm), xgetCValueSapAddMm(), "SAP_ADD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     * @param sapAddMm The value of sapAddMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMm_PrefixSearch(String sapAddMm) {
        setSapAddMm_LikeSearch(sapAddMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNull() { regSapAddMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNullOrEmpty() { regSapAddMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MM: {VARCHAR(30)}
     */
    public void setSapAddMm_IsNotNull() { regSapAddMm(CK_ISNN, DOBJ); }

    protected void regSapAddMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddMm(), "SAP_ADD_MM"); }
    protected abstract ConditionValue xgetCValueSapAddMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_Equal(String sapAddDd) {
        doSetSapAddDd_Equal(fRES(sapAddDd));
    }

    protected void doSetSapAddDd_Equal(String sapAddDd) {
        regSapAddDd(CK_EQ, sapAddDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_NotEqual(String sapAddDd) {
        doSetSapAddDd_NotEqual(fRES(sapAddDd));
    }

    protected void doSetSapAddDd_NotEqual(String sapAddDd) {
        regSapAddDd(CK_NES, sapAddDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_GreaterThan(String sapAddDd) {
        regSapAddDd(CK_GT, fRES(sapAddDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_LessThan(String sapAddDd) {
        regSapAddDd(CK_LT, fRES(sapAddDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_GreaterEqual(String sapAddDd) {
        regSapAddDd(CK_GE, fRES(sapAddDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_LessEqual(String sapAddDd) {
        regSapAddDd(CK_LE, fRES(sapAddDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDdList The collection of sapAddDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_InScope(Collection<String> sapAddDdList) {
        doSetSapAddDd_InScope(sapAddDdList);
    }

    protected void doSetSapAddDd_InScope(Collection<String> sapAddDdList) {
        regINS(CK_INS, cTL(sapAddDdList), xgetCValueSapAddDd(), "SAP_ADD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDdList The collection of sapAddDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_NotInScope(Collection<String> sapAddDdList) {
        doSetSapAddDd_NotInScope(sapAddDdList);
    }

    protected void doSetSapAddDd_NotInScope(Collection<String> sapAddDdList) {
        regINS(CK_NINS, cTL(sapAddDdList), xgetCValueSapAddDd(), "SAP_ADD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddDd The value of sapAddDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddDd_LikeSearch(String sapAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddDd), xgetCValueSapAddDd(), "SAP_ADD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddDd_NotLikeSearch(String sapAddDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddDd), xgetCValueSapAddDd(), "SAP_ADD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     * @param sapAddDd The value of sapAddDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddDd_PrefixSearch(String sapAddDd) {
        setSapAddDd_LikeSearch(sapAddDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNull() { regSapAddDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNullOrEmpty() { regSapAddDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_DD: {VARCHAR(30)}
     */
    public void setSapAddDd_IsNotNull() { regSapAddDd(CK_ISNN, DOBJ); }

    protected void regSapAddDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddDd(), "SAP_ADD_DD"); }
    protected abstract ConditionValue xgetCValueSapAddDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_Equal(String sapAddHh) {
        doSetSapAddHh_Equal(fRES(sapAddHh));
    }

    protected void doSetSapAddHh_Equal(String sapAddHh) {
        regSapAddHh(CK_EQ, sapAddHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_NotEqual(String sapAddHh) {
        doSetSapAddHh_NotEqual(fRES(sapAddHh));
    }

    protected void doSetSapAddHh_NotEqual(String sapAddHh) {
        regSapAddHh(CK_NES, sapAddHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_GreaterThan(String sapAddHh) {
        regSapAddHh(CK_GT, fRES(sapAddHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_LessThan(String sapAddHh) {
        regSapAddHh(CK_LT, fRES(sapAddHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_GreaterEqual(String sapAddHh) {
        regSapAddHh(CK_GE, fRES(sapAddHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_LessEqual(String sapAddHh) {
        regSapAddHh(CK_LE, fRES(sapAddHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHhList The collection of sapAddHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_InScope(Collection<String> sapAddHhList) {
        doSetSapAddHh_InScope(sapAddHhList);
    }

    protected void doSetSapAddHh_InScope(Collection<String> sapAddHhList) {
        regINS(CK_INS, cTL(sapAddHhList), xgetCValueSapAddHh(), "SAP_ADD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHhList The collection of sapAddHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_NotInScope(Collection<String> sapAddHhList) {
        doSetSapAddHh_NotInScope(sapAddHhList);
    }

    protected void doSetSapAddHh_NotInScope(Collection<String> sapAddHhList) {
        regINS(CK_NINS, cTL(sapAddHhList), xgetCValueSapAddHh(), "SAP_ADD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddHh The value of sapAddHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddHh_LikeSearch(String sapAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddHh), xgetCValueSapAddHh(), "SAP_ADD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddHh_NotLikeSearch(String sapAddHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddHh), xgetCValueSapAddHh(), "SAP_ADD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     * @param sapAddHh The value of sapAddHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddHh_PrefixSearch(String sapAddHh) {
        setSapAddHh_LikeSearch(sapAddHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNull() { regSapAddHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNullOrEmpty() { regSapAddHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_HH: {VARCHAR(30)}
     */
    public void setSapAddHh_IsNotNull() { regSapAddHh(CK_ISNN, DOBJ); }

    protected void regSapAddHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddHh(), "SAP_ADD_HH"); }
    protected abstract ConditionValue xgetCValueSapAddHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_Equal(String sapAddMi) {
        doSetSapAddMi_Equal(fRES(sapAddMi));
    }

    protected void doSetSapAddMi_Equal(String sapAddMi) {
        regSapAddMi(CK_EQ, sapAddMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_NotEqual(String sapAddMi) {
        doSetSapAddMi_NotEqual(fRES(sapAddMi));
    }

    protected void doSetSapAddMi_NotEqual(String sapAddMi) {
        regSapAddMi(CK_NES, sapAddMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_GreaterThan(String sapAddMi) {
        regSapAddMi(CK_GT, fRES(sapAddMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_LessThan(String sapAddMi) {
        regSapAddMi(CK_LT, fRES(sapAddMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_GreaterEqual(String sapAddMi) {
        regSapAddMi(CK_GE, fRES(sapAddMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_LessEqual(String sapAddMi) {
        regSapAddMi(CK_LE, fRES(sapAddMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMiList The collection of sapAddMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_InScope(Collection<String> sapAddMiList) {
        doSetSapAddMi_InScope(sapAddMiList);
    }

    protected void doSetSapAddMi_InScope(Collection<String> sapAddMiList) {
        regINS(CK_INS, cTL(sapAddMiList), xgetCValueSapAddMi(), "SAP_ADD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMiList The collection of sapAddMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_NotInScope(Collection<String> sapAddMiList) {
        doSetSapAddMi_NotInScope(sapAddMiList);
    }

    protected void doSetSapAddMi_NotInScope(Collection<String> sapAddMiList) {
        regINS(CK_NINS, cTL(sapAddMiList), xgetCValueSapAddMi(), "SAP_ADD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddMi The value of sapAddMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddMi_LikeSearch(String sapAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddMi), xgetCValueSapAddMi(), "SAP_ADD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddMi_NotLikeSearch(String sapAddMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddMi), xgetCValueSapAddMi(), "SAP_ADD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     * @param sapAddMi The value of sapAddMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddMi_PrefixSearch(String sapAddMi) {
        setSapAddMi_LikeSearch(sapAddMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNull() { regSapAddMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNullOrEmpty() { regSapAddMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_MI: {VARCHAR(30)}
     */
    public void setSapAddMi_IsNotNull() { regSapAddMi(CK_ISNN, DOBJ); }

    protected void regSapAddMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddMi(), "SAP_ADD_MI"); }
    protected abstract ConditionValue xgetCValueSapAddMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_Equal(String sapAddSs) {
        doSetSapAddSs_Equal(fRES(sapAddSs));
    }

    protected void doSetSapAddSs_Equal(String sapAddSs) {
        regSapAddSs(CK_EQ, sapAddSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_NotEqual(String sapAddSs) {
        doSetSapAddSs_NotEqual(fRES(sapAddSs));
    }

    protected void doSetSapAddSs_NotEqual(String sapAddSs) {
        regSapAddSs(CK_NES, sapAddSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_GreaterThan(String sapAddSs) {
        regSapAddSs(CK_GT, fRES(sapAddSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_LessThan(String sapAddSs) {
        regSapAddSs(CK_LT, fRES(sapAddSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_GreaterEqual(String sapAddSs) {
        regSapAddSs(CK_GE, fRES(sapAddSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_LessEqual(String sapAddSs) {
        regSapAddSs(CK_LE, fRES(sapAddSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSsList The collection of sapAddSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_InScope(Collection<String> sapAddSsList) {
        doSetSapAddSs_InScope(sapAddSsList);
    }

    protected void doSetSapAddSs_InScope(Collection<String> sapAddSsList) {
        regINS(CK_INS, cTL(sapAddSsList), xgetCValueSapAddSs(), "SAP_ADD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSsList The collection of sapAddSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_NotInScope(Collection<String> sapAddSsList) {
        doSetSapAddSs_NotInScope(sapAddSsList);
    }

    protected void doSetSapAddSs_NotInScope(Collection<String> sapAddSsList) {
        regINS(CK_NINS, cTL(sapAddSsList), xgetCValueSapAddSs(), "SAP_ADD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddSs The value of sapAddSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddSs_LikeSearch(String sapAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddSs), xgetCValueSapAddSs(), "SAP_ADD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddSs_NotLikeSearch(String sapAddSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddSs), xgetCValueSapAddSs(), "SAP_ADD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     * @param sapAddSs The value of sapAddSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddSs_PrefixSearch(String sapAddSs) {
        setSapAddSs_LikeSearch(sapAddSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNull() { regSapAddSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNullOrEmpty() { regSapAddSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_SS: {VARCHAR(30)}
     */
    public void setSapAddSs_IsNotNull() { regSapAddSs(CK_ISNN, DOBJ); }

    protected void regSapAddSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddSs(), "SAP_ADD_SS"); }
    protected abstract ConditionValue xgetCValueSapAddSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_Equal(String sapAddUserCd) {
        doSetSapAddUserCd_Equal(fRES(sapAddUserCd));
    }

    protected void doSetSapAddUserCd_Equal(String sapAddUserCd) {
        regSapAddUserCd(CK_EQ, sapAddUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_NotEqual(String sapAddUserCd) {
        doSetSapAddUserCd_NotEqual(fRES(sapAddUserCd));
    }

    protected void doSetSapAddUserCd_NotEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_NES, sapAddUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_GreaterThan(String sapAddUserCd) {
        regSapAddUserCd(CK_GT, fRES(sapAddUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_LessThan(String sapAddUserCd) {
        regSapAddUserCd(CK_LT, fRES(sapAddUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_GreaterEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_GE, fRES(sapAddUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_LessEqual(String sapAddUserCd) {
        regSapAddUserCd(CK_LE, fRES(sapAddUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCdList The collection of sapAddUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_InScope(Collection<String> sapAddUserCdList) {
        doSetSapAddUserCd_InScope(sapAddUserCdList);
    }

    protected void doSetSapAddUserCd_InScope(Collection<String> sapAddUserCdList) {
        regINS(CK_INS, cTL(sapAddUserCdList), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCdList The collection of sapAddUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_NotInScope(Collection<String> sapAddUserCdList) {
        doSetSapAddUserCd_NotInScope(sapAddUserCdList);
    }

    protected void doSetSapAddUserCd_NotInScope(Collection<String> sapAddUserCdList) {
        regINS(CK_NINS, cTL(sapAddUserCdList), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapAddUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapAddUserCd The value of sapAddUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapAddUserCd_LikeSearch(String sapAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapAddUserCd), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapAddUserCd_NotLikeSearch(String sapAddUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapAddUserCd), xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     * @param sapAddUserCd The value of sapAddUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapAddUserCd_PrefixSearch(String sapAddUserCd) {
        setSapAddUserCd_LikeSearch(sapAddUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNull() { regSapAddUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNullOrEmpty() { regSapAddUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_ADD_USER_CD: {VARCHAR(30)}
     */
    public void setSapAddUserCd_IsNotNull() { regSapAddUserCd(CK_ISNN, DOBJ); }

    protected void regSapAddUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapAddUserCd(), "SAP_ADD_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapAddUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_Equal(String sapUpdYyyy) {
        doSetSapUpdYyyy_Equal(fRES(sapUpdYyyy));
    }

    protected void doSetSapUpdYyyy_Equal(String sapUpdYyyy) {
        regSapUpdYyyy(CK_EQ, sapUpdYyyy);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_NotEqual(String sapUpdYyyy) {
        doSetSapUpdYyyy_NotEqual(fRES(sapUpdYyyy));
    }

    protected void doSetSapUpdYyyy_NotEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_NES, sapUpdYyyy);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_GreaterThan(String sapUpdYyyy) {
        regSapUpdYyyy(CK_GT, fRES(sapUpdYyyy));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_LessThan(String sapUpdYyyy) {
        regSapUpdYyyy(CK_LT, fRES(sapUpdYyyy));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_GreaterEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_GE, fRES(sapUpdYyyy));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_LessEqual(String sapUpdYyyy) {
        regSapUpdYyyy(CK_LE, fRES(sapUpdYyyy));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyyList The collection of sapUpdYyyy as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_InScope(Collection<String> sapUpdYyyyList) {
        doSetSapUpdYyyy_InScope(sapUpdYyyyList);
    }

    protected void doSetSapUpdYyyy_InScope(Collection<String> sapUpdYyyyList) {
        regINS(CK_INS, cTL(sapUpdYyyyList), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyyList The collection of sapUpdYyyy as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_NotInScope(Collection<String> sapUpdYyyyList) {
        doSetSapUpdYyyy_NotInScope(sapUpdYyyyList);
    }

    protected void doSetSapUpdYyyy_NotInScope(Collection<String> sapUpdYyyyList) {
        regINS(CK_NINS, cTL(sapUpdYyyyList), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdYyyy_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdYyyy The value of sapUpdYyyy as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdYyyy_LikeSearch(String sapUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdYyyy), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdYyyy_NotLikeSearch(String sapUpdYyyy, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdYyyy), xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     * @param sapUpdYyyy The value of sapUpdYyyy as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdYyyy_PrefixSearch(String sapUpdYyyy) {
        setSapUpdYyyy_LikeSearch(sapUpdYyyy, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNull() { regSapUpdYyyy(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNullOrEmpty() { regSapUpdYyyy(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_YYYY: {VARCHAR(30)}
     */
    public void setSapUpdYyyy_IsNotNull() { regSapUpdYyyy(CK_ISNN, DOBJ); }

    protected void regSapUpdYyyy(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdYyyy(), "SAP_UPD_YYYY"); }
    protected abstract ConditionValue xgetCValueSapUpdYyyy();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_Equal(String sapUpdMm) {
        doSetSapUpdMm_Equal(fRES(sapUpdMm));
    }

    protected void doSetSapUpdMm_Equal(String sapUpdMm) {
        regSapUpdMm(CK_EQ, sapUpdMm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_NotEqual(String sapUpdMm) {
        doSetSapUpdMm_NotEqual(fRES(sapUpdMm));
    }

    protected void doSetSapUpdMm_NotEqual(String sapUpdMm) {
        regSapUpdMm(CK_NES, sapUpdMm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_GreaterThan(String sapUpdMm) {
        regSapUpdMm(CK_GT, fRES(sapUpdMm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_LessThan(String sapUpdMm) {
        regSapUpdMm(CK_LT, fRES(sapUpdMm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_GreaterEqual(String sapUpdMm) {
        regSapUpdMm(CK_GE, fRES(sapUpdMm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_LessEqual(String sapUpdMm) {
        regSapUpdMm(CK_LE, fRES(sapUpdMm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMmList The collection of sapUpdMm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_InScope(Collection<String> sapUpdMmList) {
        doSetSapUpdMm_InScope(sapUpdMmList);
    }

    protected void doSetSapUpdMm_InScope(Collection<String> sapUpdMmList) {
        regINS(CK_INS, cTL(sapUpdMmList), xgetCValueSapUpdMm(), "SAP_UPD_MM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMmList The collection of sapUpdMm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_NotInScope(Collection<String> sapUpdMmList) {
        doSetSapUpdMm_NotInScope(sapUpdMmList);
    }

    protected void doSetSapUpdMm_NotInScope(Collection<String> sapUpdMmList) {
        regINS(CK_NINS, cTL(sapUpdMmList), xgetCValueSapUpdMm(), "SAP_UPD_MM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdMm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdMm The value of sapUpdMm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdMm_LikeSearch(String sapUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdMm), xgetCValueSapUpdMm(), "SAP_UPD_MM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdMm_NotLikeSearch(String sapUpdMm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdMm), xgetCValueSapUpdMm(), "SAP_UPD_MM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     * @param sapUpdMm The value of sapUpdMm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMm_PrefixSearch(String sapUpdMm) {
        setSapUpdMm_LikeSearch(sapUpdMm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNull() { regSapUpdMm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNullOrEmpty() { regSapUpdMm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MM: {VARCHAR(30)}
     */
    public void setSapUpdMm_IsNotNull() { regSapUpdMm(CK_ISNN, DOBJ); }

    protected void regSapUpdMm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdMm(), "SAP_UPD_MM"); }
    protected abstract ConditionValue xgetCValueSapUpdMm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_Equal(String sapUpdDd) {
        doSetSapUpdDd_Equal(fRES(sapUpdDd));
    }

    protected void doSetSapUpdDd_Equal(String sapUpdDd) {
        regSapUpdDd(CK_EQ, sapUpdDd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_NotEqual(String sapUpdDd) {
        doSetSapUpdDd_NotEqual(fRES(sapUpdDd));
    }

    protected void doSetSapUpdDd_NotEqual(String sapUpdDd) {
        regSapUpdDd(CK_NES, sapUpdDd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_GreaterThan(String sapUpdDd) {
        regSapUpdDd(CK_GT, fRES(sapUpdDd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_LessThan(String sapUpdDd) {
        regSapUpdDd(CK_LT, fRES(sapUpdDd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_GreaterEqual(String sapUpdDd) {
        regSapUpdDd(CK_GE, fRES(sapUpdDd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_LessEqual(String sapUpdDd) {
        regSapUpdDd(CK_LE, fRES(sapUpdDd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDdList The collection of sapUpdDd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_InScope(Collection<String> sapUpdDdList) {
        doSetSapUpdDd_InScope(sapUpdDdList);
    }

    protected void doSetSapUpdDd_InScope(Collection<String> sapUpdDdList) {
        regINS(CK_INS, cTL(sapUpdDdList), xgetCValueSapUpdDd(), "SAP_UPD_DD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDdList The collection of sapUpdDd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_NotInScope(Collection<String> sapUpdDdList) {
        doSetSapUpdDd_NotInScope(sapUpdDdList);
    }

    protected void doSetSapUpdDd_NotInScope(Collection<String> sapUpdDdList) {
        regINS(CK_NINS, cTL(sapUpdDdList), xgetCValueSapUpdDd(), "SAP_UPD_DD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdDd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdDd The value of sapUpdDd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdDd_LikeSearch(String sapUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdDd), xgetCValueSapUpdDd(), "SAP_UPD_DD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdDd_NotLikeSearch(String sapUpdDd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdDd), xgetCValueSapUpdDd(), "SAP_UPD_DD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     * @param sapUpdDd The value of sapUpdDd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdDd_PrefixSearch(String sapUpdDd) {
        setSapUpdDd_LikeSearch(sapUpdDd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNull() { regSapUpdDd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNullOrEmpty() { regSapUpdDd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_DD: {VARCHAR(30)}
     */
    public void setSapUpdDd_IsNotNull() { regSapUpdDd(CK_ISNN, DOBJ); }

    protected void regSapUpdDd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdDd(), "SAP_UPD_DD"); }
    protected abstract ConditionValue xgetCValueSapUpdDd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_Equal(String sapUpdHh) {
        doSetSapUpdHh_Equal(fRES(sapUpdHh));
    }

    protected void doSetSapUpdHh_Equal(String sapUpdHh) {
        regSapUpdHh(CK_EQ, sapUpdHh);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_NotEqual(String sapUpdHh) {
        doSetSapUpdHh_NotEqual(fRES(sapUpdHh));
    }

    protected void doSetSapUpdHh_NotEqual(String sapUpdHh) {
        regSapUpdHh(CK_NES, sapUpdHh);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_GreaterThan(String sapUpdHh) {
        regSapUpdHh(CK_GT, fRES(sapUpdHh));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_LessThan(String sapUpdHh) {
        regSapUpdHh(CK_LT, fRES(sapUpdHh));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_GreaterEqual(String sapUpdHh) {
        regSapUpdHh(CK_GE, fRES(sapUpdHh));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_LessEqual(String sapUpdHh) {
        regSapUpdHh(CK_LE, fRES(sapUpdHh));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHhList The collection of sapUpdHh as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_InScope(Collection<String> sapUpdHhList) {
        doSetSapUpdHh_InScope(sapUpdHhList);
    }

    protected void doSetSapUpdHh_InScope(Collection<String> sapUpdHhList) {
        regINS(CK_INS, cTL(sapUpdHhList), xgetCValueSapUpdHh(), "SAP_UPD_HH");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHhList The collection of sapUpdHh as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_NotInScope(Collection<String> sapUpdHhList) {
        doSetSapUpdHh_NotInScope(sapUpdHhList);
    }

    protected void doSetSapUpdHh_NotInScope(Collection<String> sapUpdHhList) {
        regINS(CK_NINS, cTL(sapUpdHhList), xgetCValueSapUpdHh(), "SAP_UPD_HH");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdHh_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdHh The value of sapUpdHh as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdHh_LikeSearch(String sapUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdHh), xgetCValueSapUpdHh(), "SAP_UPD_HH", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdHh_NotLikeSearch(String sapUpdHh, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdHh), xgetCValueSapUpdHh(), "SAP_UPD_HH", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     * @param sapUpdHh The value of sapUpdHh as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdHh_PrefixSearch(String sapUpdHh) {
        setSapUpdHh_LikeSearch(sapUpdHh, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNull() { regSapUpdHh(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNullOrEmpty() { regSapUpdHh(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_HH: {VARCHAR(30)}
     */
    public void setSapUpdHh_IsNotNull() { regSapUpdHh(CK_ISNN, DOBJ); }

    protected void regSapUpdHh(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdHh(), "SAP_UPD_HH"); }
    protected abstract ConditionValue xgetCValueSapUpdHh();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_Equal(String sapUpdMi) {
        doSetSapUpdMi_Equal(fRES(sapUpdMi));
    }

    protected void doSetSapUpdMi_Equal(String sapUpdMi) {
        regSapUpdMi(CK_EQ, sapUpdMi);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_NotEqual(String sapUpdMi) {
        doSetSapUpdMi_NotEqual(fRES(sapUpdMi));
    }

    protected void doSetSapUpdMi_NotEqual(String sapUpdMi) {
        regSapUpdMi(CK_NES, sapUpdMi);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_GreaterThan(String sapUpdMi) {
        regSapUpdMi(CK_GT, fRES(sapUpdMi));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_LessThan(String sapUpdMi) {
        regSapUpdMi(CK_LT, fRES(sapUpdMi));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_GreaterEqual(String sapUpdMi) {
        regSapUpdMi(CK_GE, fRES(sapUpdMi));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_LessEqual(String sapUpdMi) {
        regSapUpdMi(CK_LE, fRES(sapUpdMi));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMiList The collection of sapUpdMi as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_InScope(Collection<String> sapUpdMiList) {
        doSetSapUpdMi_InScope(sapUpdMiList);
    }

    protected void doSetSapUpdMi_InScope(Collection<String> sapUpdMiList) {
        regINS(CK_INS, cTL(sapUpdMiList), xgetCValueSapUpdMi(), "SAP_UPD_MI");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMiList The collection of sapUpdMi as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_NotInScope(Collection<String> sapUpdMiList) {
        doSetSapUpdMi_NotInScope(sapUpdMiList);
    }

    protected void doSetSapUpdMi_NotInScope(Collection<String> sapUpdMiList) {
        regINS(CK_NINS, cTL(sapUpdMiList), xgetCValueSapUpdMi(), "SAP_UPD_MI");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdMi_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdMi The value of sapUpdMi as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdMi_LikeSearch(String sapUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdMi), xgetCValueSapUpdMi(), "SAP_UPD_MI", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdMi_NotLikeSearch(String sapUpdMi, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdMi), xgetCValueSapUpdMi(), "SAP_UPD_MI", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     * @param sapUpdMi The value of sapUpdMi as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdMi_PrefixSearch(String sapUpdMi) {
        setSapUpdMi_LikeSearch(sapUpdMi, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNull() { regSapUpdMi(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNullOrEmpty() { regSapUpdMi(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_MI: {VARCHAR(30)}
     */
    public void setSapUpdMi_IsNotNull() { regSapUpdMi(CK_ISNN, DOBJ); }

    protected void regSapUpdMi(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdMi(), "SAP_UPD_MI"); }
    protected abstract ConditionValue xgetCValueSapUpdMi();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_Equal(String sapUpdSs) {
        doSetSapUpdSs_Equal(fRES(sapUpdSs));
    }

    protected void doSetSapUpdSs_Equal(String sapUpdSs) {
        regSapUpdSs(CK_EQ, sapUpdSs);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_NotEqual(String sapUpdSs) {
        doSetSapUpdSs_NotEqual(fRES(sapUpdSs));
    }

    protected void doSetSapUpdSs_NotEqual(String sapUpdSs) {
        regSapUpdSs(CK_NES, sapUpdSs);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_GreaterThan(String sapUpdSs) {
        regSapUpdSs(CK_GT, fRES(sapUpdSs));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_LessThan(String sapUpdSs) {
        regSapUpdSs(CK_LT, fRES(sapUpdSs));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_GreaterEqual(String sapUpdSs) {
        regSapUpdSs(CK_GE, fRES(sapUpdSs));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_LessEqual(String sapUpdSs) {
        regSapUpdSs(CK_LE, fRES(sapUpdSs));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSsList The collection of sapUpdSs as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_InScope(Collection<String> sapUpdSsList) {
        doSetSapUpdSs_InScope(sapUpdSsList);
    }

    protected void doSetSapUpdSs_InScope(Collection<String> sapUpdSsList) {
        regINS(CK_INS, cTL(sapUpdSsList), xgetCValueSapUpdSs(), "SAP_UPD_SS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSsList The collection of sapUpdSs as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_NotInScope(Collection<String> sapUpdSsList) {
        doSetSapUpdSs_NotInScope(sapUpdSsList);
    }

    protected void doSetSapUpdSs_NotInScope(Collection<String> sapUpdSsList) {
        regINS(CK_NINS, cTL(sapUpdSsList), xgetCValueSapUpdSs(), "SAP_UPD_SS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdSs_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdSs The value of sapUpdSs as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdSs_LikeSearch(String sapUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdSs), xgetCValueSapUpdSs(), "SAP_UPD_SS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdSs_NotLikeSearch(String sapUpdSs, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdSs), xgetCValueSapUpdSs(), "SAP_UPD_SS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     * @param sapUpdSs The value of sapUpdSs as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdSs_PrefixSearch(String sapUpdSs) {
        setSapUpdSs_LikeSearch(sapUpdSs, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNull() { regSapUpdSs(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNullOrEmpty() { regSapUpdSs(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_SS: {VARCHAR(30)}
     */
    public void setSapUpdSs_IsNotNull() { regSapUpdSs(CK_ISNN, DOBJ); }

    protected void regSapUpdSs(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdSs(), "SAP_UPD_SS"); }
    protected abstract ConditionValue xgetCValueSapUpdSs();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_Equal(String sapUpdUserCd) {
        doSetSapUpdUserCd_Equal(fRES(sapUpdUserCd));
    }

    protected void doSetSapUpdUserCd_Equal(String sapUpdUserCd) {
        regSapUpdUserCd(CK_EQ, sapUpdUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_NotEqual(String sapUpdUserCd) {
        doSetSapUpdUserCd_NotEqual(fRES(sapUpdUserCd));
    }

    protected void doSetSapUpdUserCd_NotEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_NES, sapUpdUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_GreaterThan(String sapUpdUserCd) {
        regSapUpdUserCd(CK_GT, fRES(sapUpdUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_LessThan(String sapUpdUserCd) {
        regSapUpdUserCd(CK_LT, fRES(sapUpdUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_GreaterEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_GE, fRES(sapUpdUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_LessEqual(String sapUpdUserCd) {
        regSapUpdUserCd(CK_LE, fRES(sapUpdUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCdList The collection of sapUpdUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_InScope(Collection<String> sapUpdUserCdList) {
        doSetSapUpdUserCd_InScope(sapUpdUserCdList);
    }

    protected void doSetSapUpdUserCd_InScope(Collection<String> sapUpdUserCdList) {
        regINS(CK_INS, cTL(sapUpdUserCdList), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCdList The collection of sapUpdUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_NotInScope(Collection<String> sapUpdUserCdList) {
        doSetSapUpdUserCd_NotInScope(sapUpdUserCdList);
    }

    protected void doSetSapUpdUserCd_NotInScope(Collection<String> sapUpdUserCdList) {
        regINS(CK_NINS, cTL(sapUpdUserCdList), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUpdUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUpdUserCd The value of sapUpdUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUpdUserCd_LikeSearch(String sapUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUpdUserCd), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUpdUserCd_NotLikeSearch(String sapUpdUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUpdUserCd), xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     * @param sapUpdUserCd The value of sapUpdUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUpdUserCd_PrefixSearch(String sapUpdUserCd) {
        setSapUpdUserCd_LikeSearch(sapUpdUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNull() { regSapUpdUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNullOrEmpty() { regSapUpdUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_UPD_USER_CD: {VARCHAR(30)}
     */
    public void setSapUpdUserCd_IsNotNull() { regSapUpdUserCd(CK_ISNN, DOBJ); }

    protected void regSapUpdUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUpdUserCd(), "SAP_UPD_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapUpdUserCd();

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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_Equal(String dataTransferOnlyStr02) {
        doSetDataTransferOnlyStr02_Equal(fRES(dataTransferOnlyStr02));
    }

    protected void doSetDataTransferOnlyStr02_Equal(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_EQ, dataTransferOnlyStr02);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_NotEqual(String dataTransferOnlyStr02) {
        doSetDataTransferOnlyStr02_NotEqual(fRES(dataTransferOnlyStr02));
    }

    protected void doSetDataTransferOnlyStr02_NotEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_NES, dataTransferOnlyStr02);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GT, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LT, fRES(dataTransferOnlyStr02));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GE, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LE, fRES(dataTransferOnlyStr02));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02List The collection of dataTransferOnlyStr02 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_InScope(Collection<String> dataTransferOnlyStr02List) {
        doSetDataTransferOnlyStr02_InScope(dataTransferOnlyStr02List);
    }

    protected void doSetDataTransferOnlyStr02_InScope(Collection<String> dataTransferOnlyStr02List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr02List), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02List The collection of dataTransferOnlyStr02 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_NotInScope(Collection<String> dataTransferOnlyStr02List) {
        doSetDataTransferOnlyStr02_NotInScope(dataTransferOnlyStr02List);
    }

    protected void doSetDataTransferOnlyStr02_NotInScope(Collection<String> dataTransferOnlyStr02List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr02List), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)} <br>
     * <pre>e.g. setDataTransferOnlyStr02_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr02_LikeSearch(String dataTransferOnlyStr02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr02), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr02_NotLikeSearch(String dataTransferOnlyStr02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr02), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_PrefixSearch(String dataTransferOnlyStr02) {
        setDataTransferOnlyStr02_LikeSearch(dataTransferOnlyStr02, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNull() { regDataTransferOnlyStr02(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNullOrEmpty() { regDataTransferOnlyStr02(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr02_IsNotNull() { regDataTransferOnlyStr02(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr02(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr02();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_Equal(String dataTransferOnlyStr03) {
        doSetDataTransferOnlyStr03_Equal(fRES(dataTransferOnlyStr03));
    }

    protected void doSetDataTransferOnlyStr03_Equal(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_EQ, dataTransferOnlyStr03);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_NotEqual(String dataTransferOnlyStr03) {
        doSetDataTransferOnlyStr03_NotEqual(fRES(dataTransferOnlyStr03));
    }

    protected void doSetDataTransferOnlyStr03_NotEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_NES, dataTransferOnlyStr03);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GT, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LT, fRES(dataTransferOnlyStr03));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GE, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LE, fRES(dataTransferOnlyStr03));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03List The collection of dataTransferOnlyStr03 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_InScope(Collection<String> dataTransferOnlyStr03List) {
        doSetDataTransferOnlyStr03_InScope(dataTransferOnlyStr03List);
    }

    protected void doSetDataTransferOnlyStr03_InScope(Collection<String> dataTransferOnlyStr03List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr03List), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03List The collection of dataTransferOnlyStr03 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_NotInScope(Collection<String> dataTransferOnlyStr03List) {
        doSetDataTransferOnlyStr03_NotInScope(dataTransferOnlyStr03List);
    }

    protected void doSetDataTransferOnlyStr03_NotInScope(Collection<String> dataTransferOnlyStr03List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr03List), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr03_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr03_LikeSearch(String dataTransferOnlyStr03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr03), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr03_NotLikeSearch(String dataTransferOnlyStr03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr03), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_PrefixSearch(String dataTransferOnlyStr03) {
        setDataTransferOnlyStr03_LikeSearch(dataTransferOnlyStr03, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNull() { regDataTransferOnlyStr03(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNullOrEmpty() { regDataTransferOnlyStr03(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr03_IsNotNull() { regDataTransferOnlyStr03(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr03(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr03();

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
    public HpSLCFunction<EShippingInstCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EShippingInstCB.class);
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
    public HpSLCFunction<EShippingInstCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EShippingInstCB.class);
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
    public HpSLCFunction<EShippingInstCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EShippingInstCB.class);
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
    public HpSLCFunction<EShippingInstCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EShippingInstCB.class);
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
    public HpSLCFunction<EShippingInstCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EShippingInstCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EShippingInstCB&gt;() {
     *     public void query(EShippingInstCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EShippingInstCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EShippingInstCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EShippingInstCQ sq);

    protected EShippingInstCB xcreateScalarConditionCB() {
        EShippingInstCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EShippingInstCB xcreateScalarConditionPartitionByCB() {
        EShippingInstCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EShippingInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstCB cb = new EShippingInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EShippingInstCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EShippingInstCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EShippingInstCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EShippingInstCB cb = new EShippingInstCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EShippingInstCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EShippingInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EShippingInstCB cb = new EShippingInstCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EShippingInstCQ sq);

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
    protected EShippingInstCB newMyCB() {
        return new EShippingInstCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EShippingInstCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
