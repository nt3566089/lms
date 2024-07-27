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
 * The abstract condition-query of es_receive_plan.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsEsReceivePlanCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsEsReceivePlanCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "es_receive_plan";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_Equal(Long receivePlanId) {
        doSetReceivePlanId_Equal(receivePlanId);
    }

    protected void doSetReceivePlanId_Equal(Long receivePlanId) {
        regReceivePlanId(CK_EQ, receivePlanId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_NotEqual(Long receivePlanId) {
        doSetReceivePlanId_NotEqual(receivePlanId);
    }

    protected void doSetReceivePlanId_NotEqual(Long receivePlanId) {
        regReceivePlanId(CK_NES, receivePlanId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_GreaterThan(Long receivePlanId) {
        regReceivePlanId(CK_GT, receivePlanId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_LessThan(Long receivePlanId) {
        regReceivePlanId(CK_LT, receivePlanId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_GreaterEqual(Long receivePlanId) {
        regReceivePlanId(CK_GE, receivePlanId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanId The value of receivePlanId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanId_LessEqual(Long receivePlanId) {
        regReceivePlanId(CK_LE, receivePlanId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of receivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanIdList The collection of receivePlanId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanId_InScope(Collection<Long> receivePlanIdList) {
        doSetReceivePlanId_InScope(receivePlanIdList);
    }

    protected void doSetReceivePlanId_InScope(Collection<Long> receivePlanIdList) {
        regINS(CK_INS, cTL(receivePlanIdList), xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     * @param receivePlanIdList The collection of receivePlanId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanId_NotInScope(Collection<Long> receivePlanIdList) {
        doSetReceivePlanId_NotInScope(receivePlanIdList);
    }

    protected void doSetReceivePlanId_NotInScope(Collection<Long> receivePlanIdList) {
        regINS(CK_NINS, cTL(receivePlanIdList), xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReceivePlanId_IsNull() { regReceivePlanId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setReceivePlanId_IsNotNull() { regReceivePlanId(CK_ISNN, DOBJ); }

    protected void regReceivePlanId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanId(), "RECEIVE_PLAN_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_Equal(String sendFlg) {
        doSetSendFlg_Equal(fRES(sendFlg));
    }

    protected void doSetSendFlg_Equal(String sendFlg) {
        regSendFlg(CK_EQ, sendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotEqual(String sendFlg) {
        doSetSendFlg_NotEqual(fRES(sendFlg));
    }

    protected void doSetSendFlg_NotEqual(String sendFlg) {
        regSendFlg(CK_NES, sendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterThan(String sendFlg) {
        regSendFlg(CK_GT, fRES(sendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessThan(String sendFlg) {
        regSendFlg(CK_LT, fRES(sendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_GreaterEqual(String sendFlg) {
        regSendFlg(CK_GE, fRES(sendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_LessEqual(String sendFlg) {
        regSendFlg(CK_LE, fRES(sendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlgList The collection of sendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_InScope(Collection<String> sendFlgList) {
        doSetSendFlg_InScope(sendFlgList);
    }

    protected void doSetSendFlg_InScope(Collection<String> sendFlgList) {
        regINS(CK_INS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlgList The collection of sendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_NotInScope(Collection<String> sendFlgList) {
        doSetSendFlg_NotInScope(sendFlgList);
    }

    protected void doSetSendFlg_NotInScope(Collection<String> sendFlgList) {
        regINS(CK_NINS, cTL(sendFlgList), xgetCValueSendFlg(), "SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * <pre>e.g. setSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sendFlg The value of sendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSendFlg_LikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSendFlg_NotLikeSearch(String sendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sendFlg), xgetCValueSendFlg(), "SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SEND_FLG: {NotNull, CHAR(1), default=[0]}
     * @param sendFlg The value of sendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSendFlg_PrefixSearch(String sendFlg) {
        setSendFlg_LikeSearch(sendFlg, xcLSOPPre());
    }

    protected void regSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSendFlg(), "SEND_FLG"); }
    protected abstract ConditionValue xgetCValueSendFlg();

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
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_Equal(String sanshaTypeCd) {
        doSetSanshaTypeCd_Equal(fRES(sanshaTypeCd));
    }

    protected void doSetSanshaTypeCd_Equal(String sanshaTypeCd) {
        regSanshaTypeCd(CK_EQ, sanshaTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_NotEqual(String sanshaTypeCd) {
        doSetSanshaTypeCd_NotEqual(fRES(sanshaTypeCd));
    }

    protected void doSetSanshaTypeCd_NotEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_NES, sanshaTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_GreaterThan(String sanshaTypeCd) {
        regSanshaTypeCd(CK_GT, fRES(sanshaTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_LessThan(String sanshaTypeCd) {
        regSanshaTypeCd(CK_LT, fRES(sanshaTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_GreaterEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_GE, fRES(sanshaTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_LessEqual(String sanshaTypeCd) {
        regSanshaTypeCd(CK_LE, fRES(sanshaTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCdList The collection of sanshaTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_InScope(Collection<String> sanshaTypeCdList) {
        doSetSanshaTypeCd_InScope(sanshaTypeCdList);
    }

    protected void doSetSanshaTypeCd_InScope(Collection<String> sanshaTypeCdList) {
        regINS(CK_INS, cTL(sanshaTypeCdList), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCdList The collection of sanshaTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_NotInScope(Collection<String> sanshaTypeCdList) {
        doSetSanshaTypeCd_NotInScope(sanshaTypeCdList);
    }

    protected void doSetSanshaTypeCd_NotInScope(Collection<String> sanshaTypeCdList) {
        regINS(CK_NINS, cTL(sanshaTypeCdList), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSanshaTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sanshaTypeCd The value of sanshaTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSanshaTypeCd_LikeSearch(String sanshaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sanshaTypeCd), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSanshaTypeCd_NotLikeSearch(String sanshaTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sanshaTypeCd), xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     * @param sanshaTypeCd The value of sanshaTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSanshaTypeCd_PrefixSearch(String sanshaTypeCd) {
        setSanshaTypeCd_LikeSearch(sanshaTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNull() { regSanshaTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNullOrEmpty() { regSanshaTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SANSHA_TYPE_CD: {VARCHAR(30)}
     */
    public void setSanshaTypeCd_IsNotNull() { regSanshaTypeCd(CK_ISNN, DOBJ); }

    protected void regSanshaTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSanshaTypeCd(), "SANSHA_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSanshaTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_Equal(String receiveReasonCd) {
        doSetReceiveReasonCd_Equal(fRES(receiveReasonCd));
    }

    protected void doSetReceiveReasonCd_Equal(String receiveReasonCd) {
        regReceiveReasonCd(CK_EQ, receiveReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_NotEqual(String receiveReasonCd) {
        doSetReceiveReasonCd_NotEqual(fRES(receiveReasonCd));
    }

    protected void doSetReceiveReasonCd_NotEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_NES, receiveReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_GreaterThan(String receiveReasonCd) {
        regReceiveReasonCd(CK_GT, fRES(receiveReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_LessThan(String receiveReasonCd) {
        regReceiveReasonCd(CK_LT, fRES(receiveReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_GreaterEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_GE, fRES(receiveReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_LessEqual(String receiveReasonCd) {
        regReceiveReasonCd(CK_LE, fRES(receiveReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCdList The collection of receiveReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_InScope(Collection<String> receiveReasonCdList) {
        doSetReceiveReasonCd_InScope(receiveReasonCdList);
    }

    protected void doSetReceiveReasonCd_InScope(Collection<String> receiveReasonCdList) {
        regINS(CK_INS, cTL(receiveReasonCdList), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCdList The collection of receiveReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_NotInScope(Collection<String> receiveReasonCdList) {
        doSetReceiveReasonCd_NotInScope(receiveReasonCdList);
    }

    protected void doSetReceiveReasonCd_NotInScope(Collection<String> receiveReasonCdList) {
        regINS(CK_NINS, cTL(receiveReasonCdList), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveReasonCd The value of receiveReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveReasonCd_LikeSearch(String receiveReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveReasonCd), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveReasonCd_NotLikeSearch(String receiveReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveReasonCd), xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     * @param receiveReasonCd The value of receiveReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonCd_PrefixSearch(String receiveReasonCd) {
        setReceiveReasonCd_LikeSearch(receiveReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     */
    public void setReceiveReasonCd_IsNull() { regReceiveReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     */
    public void setReceiveReasonCd_IsNullOrEmpty() { regReceiveReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_CD: {VARCHAR(30)}
     */
    public void setReceiveReasonCd_IsNotNull() { regReceiveReasonCd(CK_ISNN, DOBJ); }

    protected void regReceiveReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveReasonCd(), "RECEIVE_REASON_CD"); }
    protected abstract ConditionValue xgetCValueReceiveReasonCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_Equal(String receiveReasonNm) {
        doSetReceiveReasonNm_Equal(fRES(receiveReasonNm));
    }

    protected void doSetReceiveReasonNm_Equal(String receiveReasonNm) {
        regReceiveReasonNm(CK_EQ, receiveReasonNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_NotEqual(String receiveReasonNm) {
        doSetReceiveReasonNm_NotEqual(fRES(receiveReasonNm));
    }

    protected void doSetReceiveReasonNm_NotEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_NES, receiveReasonNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_GreaterThan(String receiveReasonNm) {
        regReceiveReasonNm(CK_GT, fRES(receiveReasonNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_LessThan(String receiveReasonNm) {
        regReceiveReasonNm(CK_LT, fRES(receiveReasonNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_GreaterEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_GE, fRES(receiveReasonNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_LessEqual(String receiveReasonNm) {
        regReceiveReasonNm(CK_LE, fRES(receiveReasonNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNmList The collection of receiveReasonNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_InScope(Collection<String> receiveReasonNmList) {
        doSetReceiveReasonNm_InScope(receiveReasonNmList);
    }

    protected void doSetReceiveReasonNm_InScope(Collection<String> receiveReasonNmList) {
        regINS(CK_INS, cTL(receiveReasonNmList), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNmList The collection of receiveReasonNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_NotInScope(Collection<String> receiveReasonNmList) {
        doSetReceiveReasonNm_NotInScope(receiveReasonNmList);
    }

    protected void doSetReceiveReasonNm_NotInScope(Collection<String> receiveReasonNmList) {
        regINS(CK_NINS, cTL(receiveReasonNmList), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveReasonNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveReasonNm The value of receiveReasonNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveReasonNm_LikeSearch(String receiveReasonNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveReasonNm), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveReasonNm_NotLikeSearch(String receiveReasonNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveReasonNm), xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     * @param receiveReasonNm The value of receiveReasonNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveReasonNm_PrefixSearch(String receiveReasonNm) {
        setReceiveReasonNm_LikeSearch(receiveReasonNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     */
    public void setReceiveReasonNm_IsNull() { regReceiveReasonNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     */
    public void setReceiveReasonNm_IsNullOrEmpty() { regReceiveReasonNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REASON_NM: {VARCHAR(30)}
     */
    public void setReceiveReasonNm_IsNotNull() { regReceiveReasonNm(CK_ISNN, DOBJ); }

    protected void regReceiveReasonNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveReasonNm(), "RECEIVE_REASON_NM"); }
    protected abstract ConditionValue xgetCValueReceiveReasonNm();

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
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_Equal(String orderDate) {
        doSetOrderDate_Equal(fRES(orderDate));
    }

    protected void doSetOrderDate_Equal(String orderDate) {
        regOrderDate(CK_EQ, orderDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotEqual(String orderDate) {
        doSetOrderDate_NotEqual(fRES(orderDate));
    }

    protected void doSetOrderDate_NotEqual(String orderDate) {
        regOrderDate(CK_NES, orderDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterThan(String orderDate) {
        regOrderDate(CK_GT, fRES(orderDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessThan(String orderDate) {
        regOrderDate(CK_LT, fRES(orderDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_GreaterEqual(String orderDate) {
        regOrderDate(CK_GE, fRES(orderDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_LessEqual(String orderDate) {
        regOrderDate(CK_LE, fRES(orderDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDateList The collection of orderDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_InScope(Collection<String> orderDateList) {
        doSetOrderDate_InScope(orderDateList);
    }

    protected void doSetOrderDate_InScope(Collection<String> orderDateList) {
        regINS(CK_INS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDateList The collection of orderDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_NotInScope(Collection<String> orderDateList) {
        doSetOrderDate_NotInScope(orderDateList);
    }

    protected void doSetOrderDate_NotInScope(Collection<String> orderDateList) {
        regINS(CK_NINS, cTL(orderDateList), xgetCValueOrderDate(), "ORDER_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)} <br>
     * <pre>e.g. setOrderDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderDate The value of orderDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderDate_LikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderDate_NotLikeSearch(String orderDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderDate), xgetCValueOrderDate(), "ORDER_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     * @param orderDate The value of orderDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderDate_PrefixSearch(String orderDate) {
        setOrderDate_LikeSearch(orderDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     */
    public void setOrderDate_IsNull() { regOrderDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     */
    public void setOrderDate_IsNullOrEmpty() { regOrderDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_DATE: {VARCHAR(30)}
     */
    public void setOrderDate_IsNotNull() { regOrderDate(CK_ISNN, DOBJ); }

    protected void regOrderDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderDate(), "ORDER_DATE"); }
    protected abstract ConditionValue xgetCValueOrderDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_Equal(String orderTime) {
        doSetOrderTime_Equal(fRES(orderTime));
    }

    protected void doSetOrderTime_Equal(String orderTime) {
        regOrderTime(CK_EQ, orderTime);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotEqual(String orderTime) {
        doSetOrderTime_NotEqual(fRES(orderTime));
    }

    protected void doSetOrderTime_NotEqual(String orderTime) {
        regOrderTime(CK_NES, orderTime);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterThan(String orderTime) {
        regOrderTime(CK_GT, fRES(orderTime));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessThan(String orderTime) {
        regOrderTime(CK_LT, fRES(orderTime));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_GreaterEqual(String orderTime) {
        regOrderTime(CK_GE, fRES(orderTime));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_LessEqual(String orderTime) {
        regOrderTime(CK_LE, fRES(orderTime));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTimeList The collection of orderTime as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_InScope(Collection<String> orderTimeList) {
        doSetOrderTime_InScope(orderTimeList);
    }

    protected void doSetOrderTime_InScope(Collection<String> orderTimeList) {
        regINS(CK_INS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTimeList The collection of orderTime as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_NotInScope(Collection<String> orderTimeList) {
        doSetOrderTime_NotInScope(orderTimeList);
    }

    protected void doSetOrderTime_NotInScope(Collection<String> orderTimeList) {
        regINS(CK_NINS, cTL(orderTimeList), xgetCValueOrderTime(), "ORDER_TIME");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)} <br>
     * <pre>e.g. setOrderTime_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param orderTime The value of orderTime as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOrderTime_LikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOrderTime_NotLikeSearch(String orderTime, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(orderTime), xgetCValueOrderTime(), "ORDER_TIME", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     * @param orderTime The value of orderTime as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOrderTime_PrefixSearch(String orderTime) {
        setOrderTime_LikeSearch(orderTime, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     */
    public void setOrderTime_IsNull() { regOrderTime(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     */
    public void setOrderTime_IsNullOrEmpty() { regOrderTime(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ORDER_TIME: {VARCHAR(30)}
     */
    public void setOrderTime_IsNotNull() { regOrderTime(CK_ISNN, DOBJ); }

    protected void regOrderTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOrderTime(), "ORDER_TIME"); }
    protected abstract ConditionValue xgetCValueOrderTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_Equal(String confirmedDeliveryDate) {
        doSetConfirmedDeliveryDate_Equal(fRES(confirmedDeliveryDate));
    }

    protected void doSetConfirmedDeliveryDate_Equal(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_EQ, confirmedDeliveryDate);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_NotEqual(String confirmedDeliveryDate) {
        doSetConfirmedDeliveryDate_NotEqual(fRES(confirmedDeliveryDate));
    }

    protected void doSetConfirmedDeliveryDate_NotEqual(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_NES, confirmedDeliveryDate);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_GreaterThan(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_GT, fRES(confirmedDeliveryDate));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_LessThan(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_LT, fRES(confirmedDeliveryDate));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_GreaterEqual(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_GE, fRES(confirmedDeliveryDate));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_LessEqual(String confirmedDeliveryDate) {
        regConfirmedDeliveryDate(CK_LE, fRES(confirmedDeliveryDate));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDateList The collection of confirmedDeliveryDate as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_InScope(Collection<String> confirmedDeliveryDateList) {
        doSetConfirmedDeliveryDate_InScope(confirmedDeliveryDateList);
    }

    protected void doSetConfirmedDeliveryDate_InScope(Collection<String> confirmedDeliveryDateList) {
        regINS(CK_INS, cTL(confirmedDeliveryDateList), xgetCValueConfirmedDeliveryDate(), "CONFIRMED_DELIVERY_DATE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDateList The collection of confirmedDeliveryDate as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_NotInScope(Collection<String> confirmedDeliveryDateList) {
        doSetConfirmedDeliveryDate_NotInScope(confirmedDeliveryDateList);
    }

    protected void doSetConfirmedDeliveryDate_NotInScope(Collection<String> confirmedDeliveryDateList) {
        regINS(CK_NINS, cTL(confirmedDeliveryDateList), xgetCValueConfirmedDeliveryDate(), "CONFIRMED_DELIVERY_DATE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)} <br>
     * <pre>e.g. setConfirmedDeliveryDate_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setConfirmedDeliveryDate_LikeSearch(String confirmedDeliveryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(confirmedDeliveryDate), xgetCValueConfirmedDeliveryDate(), "CONFIRMED_DELIVERY_DATE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setConfirmedDeliveryDate_NotLikeSearch(String confirmedDeliveryDate, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(confirmedDeliveryDate), xgetCValueConfirmedDeliveryDate(), "CONFIRMED_DELIVERY_DATE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     * @param confirmedDeliveryDate The value of confirmedDeliveryDate as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedDeliveryDate_PrefixSearch(String confirmedDeliveryDate) {
        setConfirmedDeliveryDate_LikeSearch(confirmedDeliveryDate, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     */
    public void setConfirmedDeliveryDate_IsNull() { regConfirmedDeliveryDate(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     */
    public void setConfirmedDeliveryDate_IsNullOrEmpty() { regConfirmedDeliveryDate(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CONFIRMED_DELIVERY_DATE: {VARCHAR(30)}
     */
    public void setConfirmedDeliveryDate_IsNotNull() { regConfirmedDeliveryDate(CK_ISNN, DOBJ); }

    protected void regConfirmedDeliveryDate(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfirmedDeliveryDate(), "CONFIRMED_DELIVERY_DATE"); }
    protected abstract ConditionValue xgetCValueConfirmedDeliveryDate();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterThan(String hinmokuText) {
        regHinmokuText(CK_GT, fRES(hinmokuText));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessThan(String hinmokuText) {
        regHinmokuText(CK_LT, fRES(hinmokuText));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_GreaterEqual(String hinmokuText) {
        regHinmokuText(CK_GE, fRES(hinmokuText));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_LessEqual(String hinmokuText) {
        regHinmokuText(CK_LE, fRES(hinmokuText));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * HINMOKU_TEXT: {VARCHAR(100)} <br>
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
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setHinmokuText_NotLikeSearch(String hinmokuText, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(hinmokuText), xgetCValueHinmokuText(), "HINMOKU_TEXT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     * @param hinmokuText The value of hinmokuText as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setHinmokuText_PrefixSearch(String hinmokuText) {
        setHinmokuText_LikeSearch(hinmokuText, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     */
    public void setHinmokuText_IsNull() { regHinmokuText(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
     */
    public void setHinmokuText_IsNullOrEmpty() { regHinmokuText(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * HINMOKU_TEXT: {VARCHAR(100)}
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
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_Equal(String receivePlanNum) {
        doSetReceivePlanNum_Equal(fRES(receivePlanNum));
    }

    protected void doSetReceivePlanNum_Equal(String receivePlanNum) {
        regReceivePlanNum(CK_EQ, receivePlanNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_NotEqual(String receivePlanNum) {
        doSetReceivePlanNum_NotEqual(fRES(receivePlanNum));
    }

    protected void doSetReceivePlanNum_NotEqual(String receivePlanNum) {
        regReceivePlanNum(CK_NES, receivePlanNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_GreaterThan(String receivePlanNum) {
        regReceivePlanNum(CK_GT, fRES(receivePlanNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_LessThan(String receivePlanNum) {
        regReceivePlanNum(CK_LT, fRES(receivePlanNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_GreaterEqual(String receivePlanNum) {
        regReceivePlanNum(CK_GE, fRES(receivePlanNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_LessEqual(String receivePlanNum) {
        regReceivePlanNum(CK_LE, fRES(receivePlanNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNumList The collection of receivePlanNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_InScope(Collection<String> receivePlanNumList) {
        doSetReceivePlanNum_InScope(receivePlanNumList);
    }

    protected void doSetReceivePlanNum_InScope(Collection<String> receivePlanNumList) {
        regINS(CK_INS, cTL(receivePlanNumList), xgetCValueReceivePlanNum(), "RECEIVE_PLAN_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNumList The collection of receivePlanNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_NotInScope(Collection<String> receivePlanNumList) {
        doSetReceivePlanNum_NotInScope(receivePlanNumList);
    }

    protected void doSetReceivePlanNum_NotInScope(Collection<String> receivePlanNumList) {
        regINS(CK_NINS, cTL(receivePlanNumList), xgetCValueReceivePlanNum(), "RECEIVE_PLAN_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setReceivePlanNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivePlanNum The value of receivePlanNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivePlanNum_LikeSearch(String receivePlanNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivePlanNum), xgetCValueReceivePlanNum(), "RECEIVE_PLAN_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivePlanNum_NotLikeSearch(String receivePlanNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivePlanNum), xgetCValueReceivePlanNum(), "RECEIVE_PLAN_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     * @param receivePlanNum The value of receivePlanNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanNum_PrefixSearch(String receivePlanNum) {
        setReceivePlanNum_LikeSearch(receivePlanNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     */
    public void setReceivePlanNum_IsNull() { regReceivePlanNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     */
    public void setReceivePlanNum_IsNullOrEmpty() { regReceivePlanNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_NUM: {VARCHAR(30)}
     */
    public void setReceivePlanNum_IsNotNull() { regReceivePlanNum(CK_ISNN, DOBJ); }

    protected void regReceivePlanNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanNum(), "RECEIVE_PLAN_NUM"); }
    protected abstract ConditionValue xgetCValueReceivePlanNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_Equal(String receiveRemainingNum) {
        doSetReceiveRemainingNum_Equal(fRES(receiveRemainingNum));
    }

    protected void doSetReceiveRemainingNum_Equal(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_EQ, receiveRemainingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_NotEqual(String receiveRemainingNum) {
        doSetReceiveRemainingNum_NotEqual(fRES(receiveRemainingNum));
    }

    protected void doSetReceiveRemainingNum_NotEqual(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_NES, receiveRemainingNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_GreaterThan(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_GT, fRES(receiveRemainingNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_LessThan(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_LT, fRES(receiveRemainingNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_GreaterEqual(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_GE, fRES(receiveRemainingNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_LessEqual(String receiveRemainingNum) {
        regReceiveRemainingNum(CK_LE, fRES(receiveRemainingNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNumList The collection of receiveRemainingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_InScope(Collection<String> receiveRemainingNumList) {
        doSetReceiveRemainingNum_InScope(receiveRemainingNumList);
    }

    protected void doSetReceiveRemainingNum_InScope(Collection<String> receiveRemainingNumList) {
        regINS(CK_INS, cTL(receiveRemainingNumList), xgetCValueReceiveRemainingNum(), "RECEIVE_REMAINING_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNumList The collection of receiveRemainingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_NotInScope(Collection<String> receiveRemainingNumList) {
        doSetReceiveRemainingNum_NotInScope(receiveRemainingNumList);
    }

    protected void doSetReceiveRemainingNum_NotInScope(Collection<String> receiveRemainingNumList) {
        regINS(CK_NINS, cTL(receiveRemainingNumList), xgetCValueReceiveRemainingNum(), "RECEIVE_REMAINING_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveRemainingNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveRemainingNum The value of receiveRemainingNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveRemainingNum_LikeSearch(String receiveRemainingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveRemainingNum), xgetCValueReceiveRemainingNum(), "RECEIVE_REMAINING_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveRemainingNum_NotLikeSearch(String receiveRemainingNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveRemainingNum), xgetCValueReceiveRemainingNum(), "RECEIVE_REMAINING_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     * @param receiveRemainingNum The value of receiveRemainingNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveRemainingNum_PrefixSearch(String receiveRemainingNum) {
        setReceiveRemainingNum_LikeSearch(receiveRemainingNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     */
    public void setReceiveRemainingNum_IsNull() { regReceiveRemainingNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     */
    public void setReceiveRemainingNum_IsNullOrEmpty() { regReceiveRemainingNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_REMAINING_NUM: {VARCHAR(30)}
     */
    public void setReceiveRemainingNum_IsNotNull() { regReceiveRemainingNum(CK_ISNN, DOBJ); }

    protected void regReceiveRemainingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveRemainingNum(), "RECEIVE_REMAINING_NUM"); }
    protected abstract ConditionValue xgetCValueReceiveRemainingNum();

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
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_Equal(String tenhanshaNm1) {
        doSetTenhanshaNm1_Equal(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_Equal(String tenhanshaNm1) {
        regTenhanshaNm1(CK_EQ, tenhanshaNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        doSetTenhanshaNm1_NotEqual(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_NES, tenhanshaNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GT, fRES(tenhanshaNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LT, fRES(tenhanshaNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GE, fRES(tenhanshaNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LE, fRES(tenhanshaNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_InScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_INS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_NotInScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_NINS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm1 The value of tenhanshaNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm1_LikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm1_NotLikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_PrefixSearch(String tenhanshaNm1) {
        setTenhanshaNm1_LikeSearch(tenhanshaNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNull() { regTenhanshaNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNullOrEmpty() { regTenhanshaNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNotNull() { regTenhanshaNm1(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm1(), "TENHANSHA_NM1"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_Equal(String tenhanshaNm2) {
        doSetTenhanshaNm2_Equal(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_Equal(String tenhanshaNm2) {
        regTenhanshaNm2(CK_EQ, tenhanshaNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        doSetTenhanshaNm2_NotEqual(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_NES, tenhanshaNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GT, fRES(tenhanshaNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LT, fRES(tenhanshaNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GE, fRES(tenhanshaNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LE, fRES(tenhanshaNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_InScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_INS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_NotInScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_NINS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm2 The value of tenhanshaNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm2_LikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm2_NotLikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_PrefixSearch(String tenhanshaNm2) {
        setTenhanshaNm2_LikeSearch(tenhanshaNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNull() { regTenhanshaNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNullOrEmpty() { regTenhanshaNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNotNull() { regTenhanshaNm2(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm2(), "TENHANSHA_NM2"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_Equal(String sapUserCd) {
        doSetSapUserCd_Equal(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_Equal(String sapUserCd) {
        regSapUserCd(CK_EQ, sapUserCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotEqual(String sapUserCd) {
        doSetSapUserCd_NotEqual(fRES(sapUserCd));
    }

    protected void doSetSapUserCd_NotEqual(String sapUserCd) {
        regSapUserCd(CK_NES, sapUserCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterThan(String sapUserCd) {
        regSapUserCd(CK_GT, fRES(sapUserCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessThan(String sapUserCd) {
        regSapUserCd(CK_LT, fRES(sapUserCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_GreaterEqual(String sapUserCd) {
        regSapUserCd(CK_GE, fRES(sapUserCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_LessEqual(String sapUserCd) {
        regSapUserCd(CK_LE, fRES(sapUserCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_InScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_InScope(sapUserCdList);
    }

    protected void doSetSapUserCd_InScope(Collection<String> sapUserCdList) {
        regINS(CK_INS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCdList The collection of sapUserCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        doSetSapUserCd_NotInScope(sapUserCdList);
    }

    protected void doSetSapUserCd_NotInScope(Collection<String> sapUserCdList) {
        regINS(CK_NINS, cTL(sapUserCdList), xgetCValueSapUserCd(), "SAP_USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserCd The value of sapUserCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserCd_LikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserCd_NotLikeSearch(String sapUserCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserCd), xgetCValueSapUserCd(), "SAP_USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     * @param sapUserCd The value of sapUserCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserCd_PrefixSearch(String sapUserCd) {
        setSapUserCd_LikeSearch(sapUserCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNull() { regSapUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNullOrEmpty() { regSapUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_CD: {VARCHAR(30)}
     */
    public void setSapUserCd_IsNotNull() { regSapUserCd(CK_ISNN, DOBJ); }

    protected void regSapUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserCd(), "SAP_USER_CD"); }
    protected abstract ConditionValue xgetCValueSapUserCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_Equal(String sapUserNm) {
        doSetSapUserNm_Equal(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_Equal(String sapUserNm) {
        regSapUserNm(CK_EQ, sapUserNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotEqual(String sapUserNm) {
        doSetSapUserNm_NotEqual(fRES(sapUserNm));
    }

    protected void doSetSapUserNm_NotEqual(String sapUserNm) {
        regSapUserNm(CK_NES, sapUserNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterThan(String sapUserNm) {
        regSapUserNm(CK_GT, fRES(sapUserNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessThan(String sapUserNm) {
        regSapUserNm(CK_LT, fRES(sapUserNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_GreaterEqual(String sapUserNm) {
        regSapUserNm(CK_GE, fRES(sapUserNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_LessEqual(String sapUserNm) {
        regSapUserNm(CK_LE, fRES(sapUserNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_InScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_InScope(sapUserNmList);
    }

    protected void doSetSapUserNm_InScope(Collection<String> sapUserNmList) {
        regINS(CK_INS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNmList The collection of sapUserNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        doSetSapUserNm_NotInScope(sapUserNmList);
    }

    protected void doSetSapUserNm_NotInScope(Collection<String> sapUserNmList) {
        regINS(CK_NINS, cTL(sapUserNmList), xgetCValueSapUserNm(), "SAP_USER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setSapUserNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapUserNm The value of sapUserNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapUserNm_LikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapUserNm_NotLikeSearch(String sapUserNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapUserNm), xgetCValueSapUserNm(), "SAP_USER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     * @param sapUserNm The value of sapUserNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapUserNm_PrefixSearch(String sapUserNm) {
        setSapUserNm_LikeSearch(sapUserNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNull() { regSapUserNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNullOrEmpty() { regSapUserNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_USER_NM: {VARCHAR(60)}
     */
    public void setSapUserNm_IsNotNull() { regSapUserNm(CK_ISNN, DOBJ); }

    protected void regSapUserNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapUserNm(), "SAP_USER_NM"); }
    protected abstract ConditionValue xgetCValueSapUserNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_Equal(String modTypeCd) {
        doSetModTypeCd_Equal(fRES(modTypeCd));
    }

    protected void doSetModTypeCd_Equal(String modTypeCd) {
        regModTypeCd(CK_EQ, modTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_NotEqual(String modTypeCd) {
        doSetModTypeCd_NotEqual(fRES(modTypeCd));
    }

    protected void doSetModTypeCd_NotEqual(String modTypeCd) {
        regModTypeCd(CK_NES, modTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_GreaterThan(String modTypeCd) {
        regModTypeCd(CK_GT, fRES(modTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_LessThan(String modTypeCd) {
        regModTypeCd(CK_LT, fRES(modTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_GreaterEqual(String modTypeCd) {
        regModTypeCd(CK_GE, fRES(modTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_LessEqual(String modTypeCd) {
        regModTypeCd(CK_LE, fRES(modTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCdList The collection of modTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_InScope(Collection<String> modTypeCdList) {
        doSetModTypeCd_InScope(modTypeCdList);
    }

    protected void doSetModTypeCd_InScope(Collection<String> modTypeCdList) {
        regINS(CK_INS, cTL(modTypeCdList), xgetCValueModTypeCd(), "MOD_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCdList The collection of modTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_NotInScope(Collection<String> modTypeCdList) {
        doSetModTypeCd_NotInScope(modTypeCdList);
    }

    protected void doSetModTypeCd_NotInScope(Collection<String> modTypeCdList) {
        regINS(CK_NINS, cTL(modTypeCdList), xgetCValueModTypeCd(), "MOD_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setModTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param modTypeCd The value of modTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setModTypeCd_LikeSearch(String modTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(modTypeCd), xgetCValueModTypeCd(), "MOD_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setModTypeCd_NotLikeSearch(String modTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(modTypeCd), xgetCValueModTypeCd(), "MOD_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     * @param modTypeCd The value of modTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setModTypeCd_PrefixSearch(String modTypeCd) {
        setModTypeCd_LikeSearch(modTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNull() { regModTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNullOrEmpty() { regModTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MOD_TYPE_CD: {VARCHAR(30)}
     */
    public void setModTypeCd_IsNotNull() { regModTypeCd(CK_ISNN, DOBJ); }

    protected void regModTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueModTypeCd(), "MOD_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueModTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_Equal(String depositJanCd) {
        doSetDepositJanCd_Equal(fRES(depositJanCd));
    }

    protected void doSetDepositJanCd_Equal(String depositJanCd) {
        regDepositJanCd(CK_EQ, depositJanCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_NotEqual(String depositJanCd) {
        doSetDepositJanCd_NotEqual(fRES(depositJanCd));
    }

    protected void doSetDepositJanCd_NotEqual(String depositJanCd) {
        regDepositJanCd(CK_NES, depositJanCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_GreaterThan(String depositJanCd) {
        regDepositJanCd(CK_GT, fRES(depositJanCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_LessThan(String depositJanCd) {
        regDepositJanCd(CK_LT, fRES(depositJanCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_GreaterEqual(String depositJanCd) {
        regDepositJanCd(CK_GE, fRES(depositJanCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_LessEqual(String depositJanCd) {
        regDepositJanCd(CK_LE, fRES(depositJanCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCdList The collection of depositJanCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_InScope(Collection<String> depositJanCdList) {
        doSetDepositJanCd_InScope(depositJanCdList);
    }

    protected void doSetDepositJanCd_InScope(Collection<String> depositJanCdList) {
        regINS(CK_INS, cTL(depositJanCdList), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCdList The collection of depositJanCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_NotInScope(Collection<String> depositJanCdList) {
        doSetDepositJanCd_NotInScope(depositJanCdList);
    }

    protected void doSetDepositJanCd_NotInScope(Collection<String> depositJanCdList) {
        regINS(CK_NINS, cTL(depositJanCdList), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDepositJanCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depositJanCd The value of depositJanCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepositJanCd_LikeSearch(String depositJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depositJanCd), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepositJanCd_NotLikeSearch(String depositJanCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depositJanCd), xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     * @param depositJanCd The value of depositJanCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositJanCd_PrefixSearch(String depositJanCd) {
        setDepositJanCd_LikeSearch(depositJanCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNull() { regDepositJanCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNullOrEmpty() { regDepositJanCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_JAN_CD: {VARCHAR(30)}
     */
    public void setDepositJanCd_IsNotNull() { regDepositJanCd(CK_ISNN, DOBJ); }

    protected void regDepositJanCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositJanCd(), "DEPOSIT_JAN_CD"); }
    protected abstract ConditionValue xgetCValueDepositJanCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_Equal(String timesNum) {
        doSetTimesNum_Equal(fRES(timesNum));
    }

    protected void doSetTimesNum_Equal(String timesNum) {
        regTimesNum(CK_EQ, timesNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_NotEqual(String timesNum) {
        doSetTimesNum_NotEqual(fRES(timesNum));
    }

    protected void doSetTimesNum_NotEqual(String timesNum) {
        regTimesNum(CK_NES, timesNum);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_GreaterThan(String timesNum) {
        regTimesNum(CK_GT, fRES(timesNum));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_LessThan(String timesNum) {
        regTimesNum(CK_LT, fRES(timesNum));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_GreaterEqual(String timesNum) {
        regTimesNum(CK_GE, fRES(timesNum));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_LessEqual(String timesNum) {
        regTimesNum(CK_LE, fRES(timesNum));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNumList The collection of timesNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_InScope(Collection<String> timesNumList) {
        doSetTimesNum_InScope(timesNumList);
    }

    protected void doSetTimesNum_InScope(Collection<String> timesNumList) {
        regINS(CK_INS, cTL(timesNumList), xgetCValueTimesNum(), "TIMES_NUM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNumList The collection of timesNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_NotInScope(Collection<String> timesNumList) {
        doSetTimesNum_NotInScope(timesNumList);
    }

    protected void doSetTimesNum_NotInScope(Collection<String> timesNumList) {
        regINS(CK_NINS, cTL(timesNumList), xgetCValueTimesNum(), "TIMES_NUM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)} <br>
     * <pre>e.g. setTimesNum_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param timesNum The value of timesNum as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTimesNum_LikeSearch(String timesNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(timesNum), xgetCValueTimesNum(), "TIMES_NUM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTimesNum_NotLikeSearch(String timesNum, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(timesNum), xgetCValueTimesNum(), "TIMES_NUM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     * @param timesNum The value of timesNum as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTimesNum_PrefixSearch(String timesNum) {
        setTimesNum_LikeSearch(timesNum, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     */
    public void setTimesNum_IsNull() { regTimesNum(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     */
    public void setTimesNum_IsNullOrEmpty() { regTimesNum(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TIMES_NUM: {VARCHAR(30)}
     */
    public void setTimesNum_IsNotNull() { regTimesNum(CK_ISNN, DOBJ); }

    protected void regTimesNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTimesNum(), "TIMES_NUM"); }
    protected abstract ConditionValue xgetCValueTimesNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_Equal(String accountOrderNo) {
        doSetAccountOrderNo_Equal(fRES(accountOrderNo));
    }

    protected void doSetAccountOrderNo_Equal(String accountOrderNo) {
        regAccountOrderNo(CK_EQ, accountOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_NotEqual(String accountOrderNo) {
        doSetAccountOrderNo_NotEqual(fRES(accountOrderNo));
    }

    protected void doSetAccountOrderNo_NotEqual(String accountOrderNo) {
        regAccountOrderNo(CK_NES, accountOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_GreaterThan(String accountOrderNo) {
        regAccountOrderNo(CK_GT, fRES(accountOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_LessThan(String accountOrderNo) {
        regAccountOrderNo(CK_LT, fRES(accountOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_GreaterEqual(String accountOrderNo) {
        regAccountOrderNo(CK_GE, fRES(accountOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_LessEqual(String accountOrderNo) {
        regAccountOrderNo(CK_LE, fRES(accountOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNoList The collection of accountOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_InScope(Collection<String> accountOrderNoList) {
        doSetAccountOrderNo_InScope(accountOrderNoList);
    }

    protected void doSetAccountOrderNo_InScope(Collection<String> accountOrderNoList) {
        regINS(CK_INS, cTL(accountOrderNoList), xgetCValueAccountOrderNo(), "ACCOUNT_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNoList The collection of accountOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_NotInScope(Collection<String> accountOrderNoList) {
        doSetAccountOrderNo_NotInScope(accountOrderNoList);
    }

    protected void doSetAccountOrderNo_NotInScope(Collection<String> accountOrderNoList) {
        regINS(CK_NINS, cTL(accountOrderNoList), xgetCValueAccountOrderNo(), "ACCOUNT_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setAccountOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountOrderNo The value of accountOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAccountOrderNo_LikeSearch(String accountOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountOrderNo), xgetCValueAccountOrderNo(), "ACCOUNT_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAccountOrderNo_NotLikeSearch(String accountOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountOrderNo), xgetCValueAccountOrderNo(), "ACCOUNT_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     * @param accountOrderNo The value of accountOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountOrderNo_PrefixSearch(String accountOrderNo) {
        setAccountOrderNo_LikeSearch(accountOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     */
    public void setAccountOrderNo_IsNull() { regAccountOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     */
    public void setAccountOrderNo_IsNullOrEmpty() { regAccountOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_ORDER_NO: {VARCHAR(30)}
     */
    public void setAccountOrderNo_IsNotNull() { regAccountOrderNo(CK_ISNN, DOBJ); }

    protected void regAccountOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountOrderNo(), "ACCOUNT_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueAccountOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_Equal(String sapSupplierCd) {
        doSetSapSupplierCd_Equal(fRES(sapSupplierCd));
    }

    protected void doSetSapSupplierCd_Equal(String sapSupplierCd) {
        regSapSupplierCd(CK_EQ, sapSupplierCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_NotEqual(String sapSupplierCd) {
        doSetSapSupplierCd_NotEqual(fRES(sapSupplierCd));
    }

    protected void doSetSapSupplierCd_NotEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_NES, sapSupplierCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_GreaterThan(String sapSupplierCd) {
        regSapSupplierCd(CK_GT, fRES(sapSupplierCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_LessThan(String sapSupplierCd) {
        regSapSupplierCd(CK_LT, fRES(sapSupplierCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_GreaterEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_GE, fRES(sapSupplierCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_LessEqual(String sapSupplierCd) {
        regSapSupplierCd(CK_LE, fRES(sapSupplierCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCdList The collection of sapSupplierCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_InScope(Collection<String> sapSupplierCdList) {
        doSetSapSupplierCd_InScope(sapSupplierCdList);
    }

    protected void doSetSapSupplierCd_InScope(Collection<String> sapSupplierCdList) {
        regINS(CK_INS, cTL(sapSupplierCdList), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCdList The collection of sapSupplierCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_NotInScope(Collection<String> sapSupplierCdList) {
        doSetSapSupplierCd_NotInScope(sapSupplierCdList);
    }

    protected void doSetSapSupplierCd_NotInScope(Collection<String> sapSupplierCdList) {
        regINS(CK_NINS, cTL(sapSupplierCdList), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapSupplierCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapSupplierCd The value of sapSupplierCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapSupplierCd_LikeSearch(String sapSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapSupplierCd), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapSupplierCd_NotLikeSearch(String sapSupplierCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapSupplierCd), xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     * @param sapSupplierCd The value of sapSupplierCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapSupplierCd_PrefixSearch(String sapSupplierCd) {
        setSapSupplierCd_LikeSearch(sapSupplierCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNull() { regSapSupplierCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNullOrEmpty() { regSapSupplierCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_SUPPLIER_CD: {VARCHAR(30)}
     */
    public void setSapSupplierCd_IsNotNull() { regSapSupplierCd(CK_ISNN, DOBJ); }

    protected void regSapSupplierCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapSupplierCd(), "SAP_SUPPLIER_CD"); }
    protected abstract ConditionValue xgetCValueSapSupplierCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_Equal(String sapVenderCd) {
        doSetSapVenderCd_Equal(fRES(sapVenderCd));
    }

    protected void doSetSapVenderCd_Equal(String sapVenderCd) {
        regSapVenderCd(CK_EQ, sapVenderCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_NotEqual(String sapVenderCd) {
        doSetSapVenderCd_NotEqual(fRES(sapVenderCd));
    }

    protected void doSetSapVenderCd_NotEqual(String sapVenderCd) {
        regSapVenderCd(CK_NES, sapVenderCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_GreaterThan(String sapVenderCd) {
        regSapVenderCd(CK_GT, fRES(sapVenderCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_LessThan(String sapVenderCd) {
        regSapVenderCd(CK_LT, fRES(sapVenderCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_GreaterEqual(String sapVenderCd) {
        regSapVenderCd(CK_GE, fRES(sapVenderCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_LessEqual(String sapVenderCd) {
        regSapVenderCd(CK_LE, fRES(sapVenderCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCdList The collection of sapVenderCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_InScope(Collection<String> sapVenderCdList) {
        doSetSapVenderCd_InScope(sapVenderCdList);
    }

    protected void doSetSapVenderCd_InScope(Collection<String> sapVenderCdList) {
        regINS(CK_INS, cTL(sapVenderCdList), xgetCValueSapVenderCd(), "SAP_VENDER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCdList The collection of sapVenderCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_NotInScope(Collection<String> sapVenderCdList) {
        doSetSapVenderCd_NotInScope(sapVenderCdList);
    }

    protected void doSetSapVenderCd_NotInScope(Collection<String> sapVenderCdList) {
        regINS(CK_NINS, cTL(sapVenderCdList), xgetCValueSapVenderCd(), "SAP_VENDER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSapVenderCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param sapVenderCd The value of sapVenderCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSapVenderCd_LikeSearch(String sapVenderCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(sapVenderCd), xgetCValueSapVenderCd(), "SAP_VENDER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSapVenderCd_NotLikeSearch(String sapVenderCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(sapVenderCd), xgetCValueSapVenderCd(), "SAP_VENDER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     * @param sapVenderCd The value of sapVenderCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSapVenderCd_PrefixSearch(String sapVenderCd) {
        setSapVenderCd_LikeSearch(sapVenderCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNull() { regSapVenderCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNullOrEmpty() { regSapVenderCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SAP_VENDER_CD: {VARCHAR(30)}
     */
    public void setSapVenderCd_IsNotNull() { regSapVenderCd(CK_ISNN, DOBJ); }

    protected void regSapVenderCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSapVenderCd(), "SAP_VENDER_CD"); }
    protected abstract ConditionValue xgetCValueSapVenderCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_Equal(String todayFlg) {
        doSetTodayFlg_Equal(fRES(todayFlg));
    }

    protected void doSetTodayFlg_Equal(String todayFlg) {
        regTodayFlg(CK_EQ, todayFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_NotEqual(String todayFlg) {
        doSetTodayFlg_NotEqual(fRES(todayFlg));
    }

    protected void doSetTodayFlg_NotEqual(String todayFlg) {
        regTodayFlg(CK_NES, todayFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_GreaterThan(String todayFlg) {
        regTodayFlg(CK_GT, fRES(todayFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_LessThan(String todayFlg) {
        regTodayFlg(CK_LT, fRES(todayFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_GreaterEqual(String todayFlg) {
        regTodayFlg(CK_GE, fRES(todayFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_LessEqual(String todayFlg) {
        regTodayFlg(CK_LE, fRES(todayFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlgList The collection of todayFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_InScope(Collection<String> todayFlgList) {
        doSetTodayFlg_InScope(todayFlgList);
    }

    protected void doSetTodayFlg_InScope(Collection<String> todayFlgList) {
        regINS(CK_INS, cTL(todayFlgList), xgetCValueTodayFlg(), "TODAY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlgList The collection of todayFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_NotInScope(Collection<String> todayFlgList) {
        doSetTodayFlg_NotInScope(todayFlgList);
    }

    protected void doSetTodayFlg_NotInScope(Collection<String> todayFlgList) {
        regINS(CK_NINS, cTL(todayFlgList), xgetCValueTodayFlg(), "TODAY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)} <br>
     * <pre>e.g. setTodayFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param todayFlg The value of todayFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTodayFlg_LikeSearch(String todayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(todayFlg), xgetCValueTodayFlg(), "TODAY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTodayFlg_NotLikeSearch(String todayFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(todayFlg), xgetCValueTodayFlg(), "TODAY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     * @param todayFlg The value of todayFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTodayFlg_PrefixSearch(String todayFlg) {
        setTodayFlg_LikeSearch(todayFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     */
    public void setTodayFlg_IsNull() { regTodayFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     */
    public void setTodayFlg_IsNullOrEmpty() { regTodayFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TODAY_FLG: {VARCHAR(30)}
     */
    public void setTodayFlg_IsNotNull() { regTodayFlg(CK_ISNN, DOBJ); }

    protected void regTodayFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTodayFlg(), "TODAY_FLG"); }
    protected abstract ConditionValue xgetCValueTodayFlg();

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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GT, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessThan(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LT, fRES(dataTransferOnlyStr02));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_GreaterEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_GE, fRES(dataTransferOnlyStr02));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_LessEqual(String dataTransferOnlyStr02) {
        regDataTransferOnlyStr02(CK_LE, fRES(dataTransferOnlyStr02));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
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
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr02_NotLikeSearch(String dataTransferOnlyStr02, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr02), xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     * @param dataTransferOnlyStr02 The value of dataTransferOnlyStr02 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr02_PrefixSearch(String dataTransferOnlyStr02) {
        setDataTransferOnlyStr02_LikeSearch(dataTransferOnlyStr02, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr02_IsNull() { regDataTransferOnlyStr02(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr02_IsNullOrEmpty() { regDataTransferOnlyStr02(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr02_IsNotNull() { regDataTransferOnlyStr02(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr02(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr02(), "DATA_TRANSFER_ONLY_STR02"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr02();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
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
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
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
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GT, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessThan(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LT, fRES(dataTransferOnlyStr03));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_GreaterEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_GE, fRES(dataTransferOnlyStr03));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_LessEqual(String dataTransferOnlyStr03) {
        regDataTransferOnlyStr03(CK_LE, fRES(dataTransferOnlyStr03));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
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
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
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
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
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
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr03_NotLikeSearch(String dataTransferOnlyStr03, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr03), xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     * @param dataTransferOnlyStr03 The value of dataTransferOnlyStr03 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr03_PrefixSearch(String dataTransferOnlyStr03) {
        setDataTransferOnlyStr03_LikeSearch(dataTransferOnlyStr03, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr03_IsNull() { regDataTransferOnlyStr03(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr03_IsNullOrEmpty() { regDataTransferOnlyStr03(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr03_IsNotNull() { regDataTransferOnlyStr03(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr03(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr03(), "DATA_TRANSFER_ONLY_STR03"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr03();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_Equal(String dataTransferOnlyStr04) {
        doSetDataTransferOnlyStr04_Equal(fRES(dataTransferOnlyStr04));
    }

    protected void doSetDataTransferOnlyStr04_Equal(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_EQ, dataTransferOnlyStr04);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_NotEqual(String dataTransferOnlyStr04) {
        doSetDataTransferOnlyStr04_NotEqual(fRES(dataTransferOnlyStr04));
    }

    protected void doSetDataTransferOnlyStr04_NotEqual(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_NES, dataTransferOnlyStr04);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_GreaterThan(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_GT, fRES(dataTransferOnlyStr04));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_LessThan(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_LT, fRES(dataTransferOnlyStr04));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_GreaterEqual(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_GE, fRES(dataTransferOnlyStr04));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_LessEqual(String dataTransferOnlyStr04) {
        regDataTransferOnlyStr04(CK_LE, fRES(dataTransferOnlyStr04));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04List The collection of dataTransferOnlyStr04 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_InScope(Collection<String> dataTransferOnlyStr04List) {
        doSetDataTransferOnlyStr04_InScope(dataTransferOnlyStr04List);
    }

    protected void doSetDataTransferOnlyStr04_InScope(Collection<String> dataTransferOnlyStr04List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr04List), xgetCValueDataTransferOnlyStr04(), "DATA_TRANSFER_ONLY_STR04");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04List The collection of dataTransferOnlyStr04 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_NotInScope(Collection<String> dataTransferOnlyStr04List) {
        doSetDataTransferOnlyStr04_NotInScope(dataTransferOnlyStr04List);
    }

    protected void doSetDataTransferOnlyStr04_NotInScope(Collection<String> dataTransferOnlyStr04List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr04List), xgetCValueDataTransferOnlyStr04(), "DATA_TRANSFER_ONLY_STR04");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * <pre>e.g. setDataTransferOnlyStr04_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr04_LikeSearch(String dataTransferOnlyStr04, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr04), xgetCValueDataTransferOnlyStr04(), "DATA_TRANSFER_ONLY_STR04", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr04_NotLikeSearch(String dataTransferOnlyStr04, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr04), xgetCValueDataTransferOnlyStr04(), "DATA_TRANSFER_ONLY_STR04", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     * @param dataTransferOnlyStr04 The value of dataTransferOnlyStr04 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr04_PrefixSearch(String dataTransferOnlyStr04) {
        setDataTransferOnlyStr04_LikeSearch(dataTransferOnlyStr04, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr04_IsNull() { regDataTransferOnlyStr04(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr04_IsNullOrEmpty() { regDataTransferOnlyStr04(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr04_IsNotNull() { regDataTransferOnlyStr04(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr04(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr04(), "DATA_TRANSFER_ONLY_STR04"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr04();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_Equal(String dataTransferOnlyStr05) {
        doSetDataTransferOnlyStr05_Equal(fRES(dataTransferOnlyStr05));
    }

    protected void doSetDataTransferOnlyStr05_Equal(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_EQ, dataTransferOnlyStr05);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_NotEqual(String dataTransferOnlyStr05) {
        doSetDataTransferOnlyStr05_NotEqual(fRES(dataTransferOnlyStr05));
    }

    protected void doSetDataTransferOnlyStr05_NotEqual(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_NES, dataTransferOnlyStr05);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_GreaterThan(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_GT, fRES(dataTransferOnlyStr05));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_LessThan(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_LT, fRES(dataTransferOnlyStr05));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_GreaterEqual(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_GE, fRES(dataTransferOnlyStr05));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_LessEqual(String dataTransferOnlyStr05) {
        regDataTransferOnlyStr05(CK_LE, fRES(dataTransferOnlyStr05));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05List The collection of dataTransferOnlyStr05 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_InScope(Collection<String> dataTransferOnlyStr05List) {
        doSetDataTransferOnlyStr05_InScope(dataTransferOnlyStr05List);
    }

    protected void doSetDataTransferOnlyStr05_InScope(Collection<String> dataTransferOnlyStr05List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr05List), xgetCValueDataTransferOnlyStr05(), "DATA_TRANSFER_ONLY_STR05");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05List The collection of dataTransferOnlyStr05 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_NotInScope(Collection<String> dataTransferOnlyStr05List) {
        doSetDataTransferOnlyStr05_NotInScope(dataTransferOnlyStr05List);
    }

    protected void doSetDataTransferOnlyStr05_NotInScope(Collection<String> dataTransferOnlyStr05List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr05List), xgetCValueDataTransferOnlyStr05(), "DATA_TRANSFER_ONLY_STR05");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * <pre>e.g. setDataTransferOnlyStr05_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr05_LikeSearch(String dataTransferOnlyStr05, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr05), xgetCValueDataTransferOnlyStr05(), "DATA_TRANSFER_ONLY_STR05", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr05_NotLikeSearch(String dataTransferOnlyStr05, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr05), xgetCValueDataTransferOnlyStr05(), "DATA_TRANSFER_ONLY_STR05", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     * @param dataTransferOnlyStr05 The value of dataTransferOnlyStr05 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr05_PrefixSearch(String dataTransferOnlyStr05) {
        setDataTransferOnlyStr05_LikeSearch(dataTransferOnlyStr05, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr05_IsNull() { regDataTransferOnlyStr05(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr05_IsNullOrEmpty() { regDataTransferOnlyStr05(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
     */
    public void setDataTransferOnlyStr05_IsNotNull() { regDataTransferOnlyStr05(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr05(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr05(), "DATA_TRANSFER_ONLY_STR05"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr05();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_Equal(String dataTransferOnlyStr06) {
        doSetDataTransferOnlyStr06_Equal(fRES(dataTransferOnlyStr06));
    }

    protected void doSetDataTransferOnlyStr06_Equal(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_EQ, dataTransferOnlyStr06);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_NotEqual(String dataTransferOnlyStr06) {
        doSetDataTransferOnlyStr06_NotEqual(fRES(dataTransferOnlyStr06));
    }

    protected void doSetDataTransferOnlyStr06_NotEqual(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_NES, dataTransferOnlyStr06);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_GreaterThan(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_GT, fRES(dataTransferOnlyStr06));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_LessThan(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_LT, fRES(dataTransferOnlyStr06));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_GreaterEqual(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_GE, fRES(dataTransferOnlyStr06));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_LessEqual(String dataTransferOnlyStr06) {
        regDataTransferOnlyStr06(CK_LE, fRES(dataTransferOnlyStr06));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06List The collection of dataTransferOnlyStr06 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_InScope(Collection<String> dataTransferOnlyStr06List) {
        doSetDataTransferOnlyStr06_InScope(dataTransferOnlyStr06List);
    }

    protected void doSetDataTransferOnlyStr06_InScope(Collection<String> dataTransferOnlyStr06List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr06List), xgetCValueDataTransferOnlyStr06(), "DATA_TRANSFER_ONLY_STR06");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06List The collection of dataTransferOnlyStr06 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_NotInScope(Collection<String> dataTransferOnlyStr06List) {
        doSetDataTransferOnlyStr06_NotInScope(dataTransferOnlyStr06List);
    }

    protected void doSetDataTransferOnlyStr06_NotInScope(Collection<String> dataTransferOnlyStr06List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr06List), xgetCValueDataTransferOnlyStr06(), "DATA_TRANSFER_ONLY_STR06");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr06_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr06_LikeSearch(String dataTransferOnlyStr06, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr06), xgetCValueDataTransferOnlyStr06(), "DATA_TRANSFER_ONLY_STR06", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr06_NotLikeSearch(String dataTransferOnlyStr06, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr06), xgetCValueDataTransferOnlyStr06(), "DATA_TRANSFER_ONLY_STR06", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     * @param dataTransferOnlyStr06 The value of dataTransferOnlyStr06 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr06_PrefixSearch(String dataTransferOnlyStr06) {
        setDataTransferOnlyStr06_LikeSearch(dataTransferOnlyStr06, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr06_IsNull() { regDataTransferOnlyStr06(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr06_IsNullOrEmpty() { regDataTransferOnlyStr06(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr06_IsNotNull() { regDataTransferOnlyStr06(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr06(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr06(), "DATA_TRANSFER_ONLY_STR06"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr06();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_Equal(String dataTransferOnlyStr07) {
        doSetDataTransferOnlyStr07_Equal(fRES(dataTransferOnlyStr07));
    }

    protected void doSetDataTransferOnlyStr07_Equal(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_EQ, dataTransferOnlyStr07);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_NotEqual(String dataTransferOnlyStr07) {
        doSetDataTransferOnlyStr07_NotEqual(fRES(dataTransferOnlyStr07));
    }

    protected void doSetDataTransferOnlyStr07_NotEqual(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_NES, dataTransferOnlyStr07);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_GreaterThan(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_GT, fRES(dataTransferOnlyStr07));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_LessThan(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_LT, fRES(dataTransferOnlyStr07));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_GreaterEqual(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_GE, fRES(dataTransferOnlyStr07));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_LessEqual(String dataTransferOnlyStr07) {
        regDataTransferOnlyStr07(CK_LE, fRES(dataTransferOnlyStr07));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07List The collection of dataTransferOnlyStr07 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_InScope(Collection<String> dataTransferOnlyStr07List) {
        doSetDataTransferOnlyStr07_InScope(dataTransferOnlyStr07List);
    }

    protected void doSetDataTransferOnlyStr07_InScope(Collection<String> dataTransferOnlyStr07List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr07List), xgetCValueDataTransferOnlyStr07(), "DATA_TRANSFER_ONLY_STR07");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07List The collection of dataTransferOnlyStr07 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_NotInScope(Collection<String> dataTransferOnlyStr07List) {
        doSetDataTransferOnlyStr07_NotInScope(dataTransferOnlyStr07List);
    }

    protected void doSetDataTransferOnlyStr07_NotInScope(Collection<String> dataTransferOnlyStr07List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr07List), xgetCValueDataTransferOnlyStr07(), "DATA_TRANSFER_ONLY_STR07");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr07_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr07_LikeSearch(String dataTransferOnlyStr07, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr07), xgetCValueDataTransferOnlyStr07(), "DATA_TRANSFER_ONLY_STR07", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr07_NotLikeSearch(String dataTransferOnlyStr07, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr07), xgetCValueDataTransferOnlyStr07(), "DATA_TRANSFER_ONLY_STR07", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     * @param dataTransferOnlyStr07 The value of dataTransferOnlyStr07 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr07_PrefixSearch(String dataTransferOnlyStr07) {
        setDataTransferOnlyStr07_LikeSearch(dataTransferOnlyStr07, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr07_IsNull() { regDataTransferOnlyStr07(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr07_IsNullOrEmpty() { regDataTransferOnlyStr07(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr07_IsNotNull() { regDataTransferOnlyStr07(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr07(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr07(), "DATA_TRANSFER_ONLY_STR07"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr07();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_Equal(String dataTransferOnlyStr08) {
        doSetDataTransferOnlyStr08_Equal(fRES(dataTransferOnlyStr08));
    }

    protected void doSetDataTransferOnlyStr08_Equal(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_EQ, dataTransferOnlyStr08);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_NotEqual(String dataTransferOnlyStr08) {
        doSetDataTransferOnlyStr08_NotEqual(fRES(dataTransferOnlyStr08));
    }

    protected void doSetDataTransferOnlyStr08_NotEqual(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_NES, dataTransferOnlyStr08);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_GreaterThan(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_GT, fRES(dataTransferOnlyStr08));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_LessThan(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_LT, fRES(dataTransferOnlyStr08));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_GreaterEqual(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_GE, fRES(dataTransferOnlyStr08));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_LessEqual(String dataTransferOnlyStr08) {
        regDataTransferOnlyStr08(CK_LE, fRES(dataTransferOnlyStr08));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08List The collection of dataTransferOnlyStr08 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_InScope(Collection<String> dataTransferOnlyStr08List) {
        doSetDataTransferOnlyStr08_InScope(dataTransferOnlyStr08List);
    }

    protected void doSetDataTransferOnlyStr08_InScope(Collection<String> dataTransferOnlyStr08List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr08List), xgetCValueDataTransferOnlyStr08(), "DATA_TRANSFER_ONLY_STR08");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08List The collection of dataTransferOnlyStr08 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_NotInScope(Collection<String> dataTransferOnlyStr08List) {
        doSetDataTransferOnlyStr08_NotInScope(dataTransferOnlyStr08List);
    }

    protected void doSetDataTransferOnlyStr08_NotInScope(Collection<String> dataTransferOnlyStr08List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr08List), xgetCValueDataTransferOnlyStr08(), "DATA_TRANSFER_ONLY_STR08");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr08_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr08_LikeSearch(String dataTransferOnlyStr08, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr08), xgetCValueDataTransferOnlyStr08(), "DATA_TRANSFER_ONLY_STR08", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr08_NotLikeSearch(String dataTransferOnlyStr08, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr08), xgetCValueDataTransferOnlyStr08(), "DATA_TRANSFER_ONLY_STR08", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     * @param dataTransferOnlyStr08 The value of dataTransferOnlyStr08 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr08_PrefixSearch(String dataTransferOnlyStr08) {
        setDataTransferOnlyStr08_LikeSearch(dataTransferOnlyStr08, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr08_IsNull() { regDataTransferOnlyStr08(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr08_IsNullOrEmpty() { regDataTransferOnlyStr08(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr08_IsNotNull() { regDataTransferOnlyStr08(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr08(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr08(), "DATA_TRANSFER_ONLY_STR08"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr08();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_Equal(String dataTransferOnlyStr09) {
        doSetDataTransferOnlyStr09_Equal(fRES(dataTransferOnlyStr09));
    }

    protected void doSetDataTransferOnlyStr09_Equal(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_EQ, dataTransferOnlyStr09);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_NotEqual(String dataTransferOnlyStr09) {
        doSetDataTransferOnlyStr09_NotEqual(fRES(dataTransferOnlyStr09));
    }

    protected void doSetDataTransferOnlyStr09_NotEqual(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_NES, dataTransferOnlyStr09);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_GreaterThan(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_GT, fRES(dataTransferOnlyStr09));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_LessThan(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_LT, fRES(dataTransferOnlyStr09));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_GreaterEqual(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_GE, fRES(dataTransferOnlyStr09));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_LessEqual(String dataTransferOnlyStr09) {
        regDataTransferOnlyStr09(CK_LE, fRES(dataTransferOnlyStr09));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09List The collection of dataTransferOnlyStr09 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_InScope(Collection<String> dataTransferOnlyStr09List) {
        doSetDataTransferOnlyStr09_InScope(dataTransferOnlyStr09List);
    }

    protected void doSetDataTransferOnlyStr09_InScope(Collection<String> dataTransferOnlyStr09List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr09List), xgetCValueDataTransferOnlyStr09(), "DATA_TRANSFER_ONLY_STR09");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09List The collection of dataTransferOnlyStr09 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_NotInScope(Collection<String> dataTransferOnlyStr09List) {
        doSetDataTransferOnlyStr09_NotInScope(dataTransferOnlyStr09List);
    }

    protected void doSetDataTransferOnlyStr09_NotInScope(Collection<String> dataTransferOnlyStr09List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr09List), xgetCValueDataTransferOnlyStr09(), "DATA_TRANSFER_ONLY_STR09");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr09_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr09_LikeSearch(String dataTransferOnlyStr09, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr09), xgetCValueDataTransferOnlyStr09(), "DATA_TRANSFER_ONLY_STR09", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr09_NotLikeSearch(String dataTransferOnlyStr09, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr09), xgetCValueDataTransferOnlyStr09(), "DATA_TRANSFER_ONLY_STR09", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     * @param dataTransferOnlyStr09 The value of dataTransferOnlyStr09 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr09_PrefixSearch(String dataTransferOnlyStr09) {
        setDataTransferOnlyStr09_LikeSearch(dataTransferOnlyStr09, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr09_IsNull() { regDataTransferOnlyStr09(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr09_IsNullOrEmpty() { regDataTransferOnlyStr09(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr09_IsNotNull() { regDataTransferOnlyStr09(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr09(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr09(), "DATA_TRANSFER_ONLY_STR09"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr09();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_Equal(String dataTransferOnlyStr10) {
        doSetDataTransferOnlyStr10_Equal(fRES(dataTransferOnlyStr10));
    }

    protected void doSetDataTransferOnlyStr10_Equal(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_EQ, dataTransferOnlyStr10);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_NotEqual(String dataTransferOnlyStr10) {
        doSetDataTransferOnlyStr10_NotEqual(fRES(dataTransferOnlyStr10));
    }

    protected void doSetDataTransferOnlyStr10_NotEqual(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_NES, dataTransferOnlyStr10);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_GreaterThan(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_GT, fRES(dataTransferOnlyStr10));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_LessThan(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_LT, fRES(dataTransferOnlyStr10));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_GreaterEqual(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_GE, fRES(dataTransferOnlyStr10));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_LessEqual(String dataTransferOnlyStr10) {
        regDataTransferOnlyStr10(CK_LE, fRES(dataTransferOnlyStr10));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10List The collection of dataTransferOnlyStr10 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_InScope(Collection<String> dataTransferOnlyStr10List) {
        doSetDataTransferOnlyStr10_InScope(dataTransferOnlyStr10List);
    }

    protected void doSetDataTransferOnlyStr10_InScope(Collection<String> dataTransferOnlyStr10List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr10List), xgetCValueDataTransferOnlyStr10(), "DATA_TRANSFER_ONLY_STR10");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10List The collection of dataTransferOnlyStr10 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_NotInScope(Collection<String> dataTransferOnlyStr10List) {
        doSetDataTransferOnlyStr10_NotInScope(dataTransferOnlyStr10List);
    }

    protected void doSetDataTransferOnlyStr10_NotInScope(Collection<String> dataTransferOnlyStr10List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr10List), xgetCValueDataTransferOnlyStr10(), "DATA_TRANSFER_ONLY_STR10");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr10_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr10_LikeSearch(String dataTransferOnlyStr10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr10), xgetCValueDataTransferOnlyStr10(), "DATA_TRANSFER_ONLY_STR10", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr10_NotLikeSearch(String dataTransferOnlyStr10, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr10), xgetCValueDataTransferOnlyStr10(), "DATA_TRANSFER_ONLY_STR10", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     * @param dataTransferOnlyStr10 The value of dataTransferOnlyStr10 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr10_PrefixSearch(String dataTransferOnlyStr10) {
        setDataTransferOnlyStr10_LikeSearch(dataTransferOnlyStr10, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr10_IsNull() { regDataTransferOnlyStr10(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr10_IsNullOrEmpty() { regDataTransferOnlyStr10(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr10_IsNotNull() { regDataTransferOnlyStr10(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr10(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr10(), "DATA_TRANSFER_ONLY_STR10"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr10();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_Equal(String dataTransferOnlyStr11) {
        doSetDataTransferOnlyStr11_Equal(fRES(dataTransferOnlyStr11));
    }

    protected void doSetDataTransferOnlyStr11_Equal(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_EQ, dataTransferOnlyStr11);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_NotEqual(String dataTransferOnlyStr11) {
        doSetDataTransferOnlyStr11_NotEqual(fRES(dataTransferOnlyStr11));
    }

    protected void doSetDataTransferOnlyStr11_NotEqual(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_NES, dataTransferOnlyStr11);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_GreaterThan(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_GT, fRES(dataTransferOnlyStr11));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_LessThan(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_LT, fRES(dataTransferOnlyStr11));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_GreaterEqual(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_GE, fRES(dataTransferOnlyStr11));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_LessEqual(String dataTransferOnlyStr11) {
        regDataTransferOnlyStr11(CK_LE, fRES(dataTransferOnlyStr11));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11List The collection of dataTransferOnlyStr11 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_InScope(Collection<String> dataTransferOnlyStr11List) {
        doSetDataTransferOnlyStr11_InScope(dataTransferOnlyStr11List);
    }

    protected void doSetDataTransferOnlyStr11_InScope(Collection<String> dataTransferOnlyStr11List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr11List), xgetCValueDataTransferOnlyStr11(), "DATA_TRANSFER_ONLY_STR11");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11List The collection of dataTransferOnlyStr11 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_NotInScope(Collection<String> dataTransferOnlyStr11List) {
        doSetDataTransferOnlyStr11_NotInScope(dataTransferOnlyStr11List);
    }

    protected void doSetDataTransferOnlyStr11_NotInScope(Collection<String> dataTransferOnlyStr11List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr11List), xgetCValueDataTransferOnlyStr11(), "DATA_TRANSFER_ONLY_STR11");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr11_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr11_LikeSearch(String dataTransferOnlyStr11, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr11), xgetCValueDataTransferOnlyStr11(), "DATA_TRANSFER_ONLY_STR11", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr11_NotLikeSearch(String dataTransferOnlyStr11, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr11), xgetCValueDataTransferOnlyStr11(), "DATA_TRANSFER_ONLY_STR11", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     * @param dataTransferOnlyStr11 The value of dataTransferOnlyStr11 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr11_PrefixSearch(String dataTransferOnlyStr11) {
        setDataTransferOnlyStr11_LikeSearch(dataTransferOnlyStr11, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr11_IsNull() { regDataTransferOnlyStr11(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr11_IsNullOrEmpty() { regDataTransferOnlyStr11(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr11_IsNotNull() { regDataTransferOnlyStr11(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr11(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr11(), "DATA_TRANSFER_ONLY_STR11"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr11();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_Equal(String dataTransferOnlyStr12) {
        doSetDataTransferOnlyStr12_Equal(fRES(dataTransferOnlyStr12));
    }

    protected void doSetDataTransferOnlyStr12_Equal(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_EQ, dataTransferOnlyStr12);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_NotEqual(String dataTransferOnlyStr12) {
        doSetDataTransferOnlyStr12_NotEqual(fRES(dataTransferOnlyStr12));
    }

    protected void doSetDataTransferOnlyStr12_NotEqual(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_NES, dataTransferOnlyStr12);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_GreaterThan(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_GT, fRES(dataTransferOnlyStr12));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_LessThan(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_LT, fRES(dataTransferOnlyStr12));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_GreaterEqual(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_GE, fRES(dataTransferOnlyStr12));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_LessEqual(String dataTransferOnlyStr12) {
        regDataTransferOnlyStr12(CK_LE, fRES(dataTransferOnlyStr12));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12List The collection of dataTransferOnlyStr12 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_InScope(Collection<String> dataTransferOnlyStr12List) {
        doSetDataTransferOnlyStr12_InScope(dataTransferOnlyStr12List);
    }

    protected void doSetDataTransferOnlyStr12_InScope(Collection<String> dataTransferOnlyStr12List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr12List), xgetCValueDataTransferOnlyStr12(), "DATA_TRANSFER_ONLY_STR12");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12List The collection of dataTransferOnlyStr12 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_NotInScope(Collection<String> dataTransferOnlyStr12List) {
        doSetDataTransferOnlyStr12_NotInScope(dataTransferOnlyStr12List);
    }

    protected void doSetDataTransferOnlyStr12_NotInScope(Collection<String> dataTransferOnlyStr12List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr12List), xgetCValueDataTransferOnlyStr12(), "DATA_TRANSFER_ONLY_STR12");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr12_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr12_LikeSearch(String dataTransferOnlyStr12, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr12), xgetCValueDataTransferOnlyStr12(), "DATA_TRANSFER_ONLY_STR12", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr12_NotLikeSearch(String dataTransferOnlyStr12, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr12), xgetCValueDataTransferOnlyStr12(), "DATA_TRANSFER_ONLY_STR12", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     * @param dataTransferOnlyStr12 The value of dataTransferOnlyStr12 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr12_PrefixSearch(String dataTransferOnlyStr12) {
        setDataTransferOnlyStr12_LikeSearch(dataTransferOnlyStr12, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr12_IsNull() { regDataTransferOnlyStr12(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr12_IsNullOrEmpty() { regDataTransferOnlyStr12(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr12_IsNotNull() { regDataTransferOnlyStr12(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr12(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr12(), "DATA_TRANSFER_ONLY_STR12"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr12();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_Equal(String dataTransferOnlyStr13) {
        doSetDataTransferOnlyStr13_Equal(fRES(dataTransferOnlyStr13));
    }

    protected void doSetDataTransferOnlyStr13_Equal(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_EQ, dataTransferOnlyStr13);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_NotEqual(String dataTransferOnlyStr13) {
        doSetDataTransferOnlyStr13_NotEqual(fRES(dataTransferOnlyStr13));
    }

    protected void doSetDataTransferOnlyStr13_NotEqual(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_NES, dataTransferOnlyStr13);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_GreaterThan(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_GT, fRES(dataTransferOnlyStr13));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_LessThan(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_LT, fRES(dataTransferOnlyStr13));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_GreaterEqual(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_GE, fRES(dataTransferOnlyStr13));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_LessEqual(String dataTransferOnlyStr13) {
        regDataTransferOnlyStr13(CK_LE, fRES(dataTransferOnlyStr13));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13List The collection of dataTransferOnlyStr13 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_InScope(Collection<String> dataTransferOnlyStr13List) {
        doSetDataTransferOnlyStr13_InScope(dataTransferOnlyStr13List);
    }

    protected void doSetDataTransferOnlyStr13_InScope(Collection<String> dataTransferOnlyStr13List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr13List), xgetCValueDataTransferOnlyStr13(), "DATA_TRANSFER_ONLY_STR13");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13List The collection of dataTransferOnlyStr13 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_NotInScope(Collection<String> dataTransferOnlyStr13List) {
        doSetDataTransferOnlyStr13_NotInScope(dataTransferOnlyStr13List);
    }

    protected void doSetDataTransferOnlyStr13_NotInScope(Collection<String> dataTransferOnlyStr13List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr13List), xgetCValueDataTransferOnlyStr13(), "DATA_TRANSFER_ONLY_STR13");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr13_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr13_LikeSearch(String dataTransferOnlyStr13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr13), xgetCValueDataTransferOnlyStr13(), "DATA_TRANSFER_ONLY_STR13", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr13_NotLikeSearch(String dataTransferOnlyStr13, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr13), xgetCValueDataTransferOnlyStr13(), "DATA_TRANSFER_ONLY_STR13", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     * @param dataTransferOnlyStr13 The value of dataTransferOnlyStr13 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr13_PrefixSearch(String dataTransferOnlyStr13) {
        setDataTransferOnlyStr13_LikeSearch(dataTransferOnlyStr13, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr13_IsNull() { regDataTransferOnlyStr13(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr13_IsNullOrEmpty() { regDataTransferOnlyStr13(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr13_IsNotNull() { regDataTransferOnlyStr13(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr13(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr13(), "DATA_TRANSFER_ONLY_STR13"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr13();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_Equal(String dataTransferOnlyStr14) {
        doSetDataTransferOnlyStr14_Equal(fRES(dataTransferOnlyStr14));
    }

    protected void doSetDataTransferOnlyStr14_Equal(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_EQ, dataTransferOnlyStr14);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_NotEqual(String dataTransferOnlyStr14) {
        doSetDataTransferOnlyStr14_NotEqual(fRES(dataTransferOnlyStr14));
    }

    protected void doSetDataTransferOnlyStr14_NotEqual(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_NES, dataTransferOnlyStr14);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_GreaterThan(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_GT, fRES(dataTransferOnlyStr14));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_LessThan(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_LT, fRES(dataTransferOnlyStr14));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_GreaterEqual(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_GE, fRES(dataTransferOnlyStr14));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_LessEqual(String dataTransferOnlyStr14) {
        regDataTransferOnlyStr14(CK_LE, fRES(dataTransferOnlyStr14));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14List The collection of dataTransferOnlyStr14 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_InScope(Collection<String> dataTransferOnlyStr14List) {
        doSetDataTransferOnlyStr14_InScope(dataTransferOnlyStr14List);
    }

    protected void doSetDataTransferOnlyStr14_InScope(Collection<String> dataTransferOnlyStr14List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr14List), xgetCValueDataTransferOnlyStr14(), "DATA_TRANSFER_ONLY_STR14");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14List The collection of dataTransferOnlyStr14 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_NotInScope(Collection<String> dataTransferOnlyStr14List) {
        doSetDataTransferOnlyStr14_NotInScope(dataTransferOnlyStr14List);
    }

    protected void doSetDataTransferOnlyStr14_NotInScope(Collection<String> dataTransferOnlyStr14List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr14List), xgetCValueDataTransferOnlyStr14(), "DATA_TRANSFER_ONLY_STR14");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr14_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr14_LikeSearch(String dataTransferOnlyStr14, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr14), xgetCValueDataTransferOnlyStr14(), "DATA_TRANSFER_ONLY_STR14", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr14_NotLikeSearch(String dataTransferOnlyStr14, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr14), xgetCValueDataTransferOnlyStr14(), "DATA_TRANSFER_ONLY_STR14", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     * @param dataTransferOnlyStr14 The value of dataTransferOnlyStr14 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr14_PrefixSearch(String dataTransferOnlyStr14) {
        setDataTransferOnlyStr14_LikeSearch(dataTransferOnlyStr14, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr14_IsNull() { regDataTransferOnlyStr14(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr14_IsNullOrEmpty() { regDataTransferOnlyStr14(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr14_IsNotNull() { regDataTransferOnlyStr14(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr14(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr14(), "DATA_TRANSFER_ONLY_STR14"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr14();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_Equal(String dataTransferOnlyStr15) {
        doSetDataTransferOnlyStr15_Equal(fRES(dataTransferOnlyStr15));
    }

    protected void doSetDataTransferOnlyStr15_Equal(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_EQ, dataTransferOnlyStr15);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_NotEqual(String dataTransferOnlyStr15) {
        doSetDataTransferOnlyStr15_NotEqual(fRES(dataTransferOnlyStr15));
    }

    protected void doSetDataTransferOnlyStr15_NotEqual(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_NES, dataTransferOnlyStr15);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_GreaterThan(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_GT, fRES(dataTransferOnlyStr15));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_LessThan(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_LT, fRES(dataTransferOnlyStr15));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_GreaterEqual(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_GE, fRES(dataTransferOnlyStr15));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_LessEqual(String dataTransferOnlyStr15) {
        regDataTransferOnlyStr15(CK_LE, fRES(dataTransferOnlyStr15));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15List The collection of dataTransferOnlyStr15 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_InScope(Collection<String> dataTransferOnlyStr15List) {
        doSetDataTransferOnlyStr15_InScope(dataTransferOnlyStr15List);
    }

    protected void doSetDataTransferOnlyStr15_InScope(Collection<String> dataTransferOnlyStr15List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr15List), xgetCValueDataTransferOnlyStr15(), "DATA_TRANSFER_ONLY_STR15");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15List The collection of dataTransferOnlyStr15 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_NotInScope(Collection<String> dataTransferOnlyStr15List) {
        doSetDataTransferOnlyStr15_NotInScope(dataTransferOnlyStr15List);
    }

    protected void doSetDataTransferOnlyStr15_NotInScope(Collection<String> dataTransferOnlyStr15List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr15List), xgetCValueDataTransferOnlyStr15(), "DATA_TRANSFER_ONLY_STR15");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr15_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr15_LikeSearch(String dataTransferOnlyStr15, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr15), xgetCValueDataTransferOnlyStr15(), "DATA_TRANSFER_ONLY_STR15", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr15_NotLikeSearch(String dataTransferOnlyStr15, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr15), xgetCValueDataTransferOnlyStr15(), "DATA_TRANSFER_ONLY_STR15", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     * @param dataTransferOnlyStr15 The value of dataTransferOnlyStr15 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr15_PrefixSearch(String dataTransferOnlyStr15) {
        setDataTransferOnlyStr15_LikeSearch(dataTransferOnlyStr15, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr15_IsNull() { regDataTransferOnlyStr15(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr15_IsNullOrEmpty() { regDataTransferOnlyStr15(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr15_IsNotNull() { regDataTransferOnlyStr15(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr15(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr15(), "DATA_TRANSFER_ONLY_STR15"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr15();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_Equal(String dataTransferOnlyStr16) {
        doSetDataTransferOnlyStr16_Equal(fRES(dataTransferOnlyStr16));
    }

    protected void doSetDataTransferOnlyStr16_Equal(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_EQ, dataTransferOnlyStr16);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_NotEqual(String dataTransferOnlyStr16) {
        doSetDataTransferOnlyStr16_NotEqual(fRES(dataTransferOnlyStr16));
    }

    protected void doSetDataTransferOnlyStr16_NotEqual(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_NES, dataTransferOnlyStr16);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_GreaterThan(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_GT, fRES(dataTransferOnlyStr16));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_LessThan(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_LT, fRES(dataTransferOnlyStr16));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_GreaterEqual(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_GE, fRES(dataTransferOnlyStr16));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_LessEqual(String dataTransferOnlyStr16) {
        regDataTransferOnlyStr16(CK_LE, fRES(dataTransferOnlyStr16));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16List The collection of dataTransferOnlyStr16 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_InScope(Collection<String> dataTransferOnlyStr16List) {
        doSetDataTransferOnlyStr16_InScope(dataTransferOnlyStr16List);
    }

    protected void doSetDataTransferOnlyStr16_InScope(Collection<String> dataTransferOnlyStr16List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr16List), xgetCValueDataTransferOnlyStr16(), "DATA_TRANSFER_ONLY_STR16");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16List The collection of dataTransferOnlyStr16 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_NotInScope(Collection<String> dataTransferOnlyStr16List) {
        doSetDataTransferOnlyStr16_NotInScope(dataTransferOnlyStr16List);
    }

    protected void doSetDataTransferOnlyStr16_NotInScope(Collection<String> dataTransferOnlyStr16List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr16List), xgetCValueDataTransferOnlyStr16(), "DATA_TRANSFER_ONLY_STR16");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr16_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr16_LikeSearch(String dataTransferOnlyStr16, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr16), xgetCValueDataTransferOnlyStr16(), "DATA_TRANSFER_ONLY_STR16", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr16_NotLikeSearch(String dataTransferOnlyStr16, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr16), xgetCValueDataTransferOnlyStr16(), "DATA_TRANSFER_ONLY_STR16", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     * @param dataTransferOnlyStr16 The value of dataTransferOnlyStr16 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr16_PrefixSearch(String dataTransferOnlyStr16) {
        setDataTransferOnlyStr16_LikeSearch(dataTransferOnlyStr16, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr16_IsNull() { regDataTransferOnlyStr16(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr16_IsNullOrEmpty() { regDataTransferOnlyStr16(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr16_IsNotNull() { regDataTransferOnlyStr16(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr16(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr16(), "DATA_TRANSFER_ONLY_STR16"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr16();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_Equal(String dataTransferOnlyStr17) {
        doSetDataTransferOnlyStr17_Equal(fRES(dataTransferOnlyStr17));
    }

    protected void doSetDataTransferOnlyStr17_Equal(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_EQ, dataTransferOnlyStr17);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_NotEqual(String dataTransferOnlyStr17) {
        doSetDataTransferOnlyStr17_NotEqual(fRES(dataTransferOnlyStr17));
    }

    protected void doSetDataTransferOnlyStr17_NotEqual(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_NES, dataTransferOnlyStr17);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_GreaterThan(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_GT, fRES(dataTransferOnlyStr17));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_LessThan(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_LT, fRES(dataTransferOnlyStr17));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_GreaterEqual(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_GE, fRES(dataTransferOnlyStr17));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_LessEqual(String dataTransferOnlyStr17) {
        regDataTransferOnlyStr17(CK_LE, fRES(dataTransferOnlyStr17));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17List The collection of dataTransferOnlyStr17 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_InScope(Collection<String> dataTransferOnlyStr17List) {
        doSetDataTransferOnlyStr17_InScope(dataTransferOnlyStr17List);
    }

    protected void doSetDataTransferOnlyStr17_InScope(Collection<String> dataTransferOnlyStr17List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr17List), xgetCValueDataTransferOnlyStr17(), "DATA_TRANSFER_ONLY_STR17");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17List The collection of dataTransferOnlyStr17 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_NotInScope(Collection<String> dataTransferOnlyStr17List) {
        doSetDataTransferOnlyStr17_NotInScope(dataTransferOnlyStr17List);
    }

    protected void doSetDataTransferOnlyStr17_NotInScope(Collection<String> dataTransferOnlyStr17List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr17List), xgetCValueDataTransferOnlyStr17(), "DATA_TRANSFER_ONLY_STR17");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr17_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr17_LikeSearch(String dataTransferOnlyStr17, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr17), xgetCValueDataTransferOnlyStr17(), "DATA_TRANSFER_ONLY_STR17", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr17_NotLikeSearch(String dataTransferOnlyStr17, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr17), xgetCValueDataTransferOnlyStr17(), "DATA_TRANSFER_ONLY_STR17", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     * @param dataTransferOnlyStr17 The value of dataTransferOnlyStr17 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr17_PrefixSearch(String dataTransferOnlyStr17) {
        setDataTransferOnlyStr17_LikeSearch(dataTransferOnlyStr17, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr17_IsNull() { regDataTransferOnlyStr17(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr17_IsNullOrEmpty() { regDataTransferOnlyStr17(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr17_IsNotNull() { regDataTransferOnlyStr17(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr17(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr17(), "DATA_TRANSFER_ONLY_STR17"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr17();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_Equal(String dataTransferOnlyStr18) {
        doSetDataTransferOnlyStr18_Equal(fRES(dataTransferOnlyStr18));
    }

    protected void doSetDataTransferOnlyStr18_Equal(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_EQ, dataTransferOnlyStr18);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_NotEqual(String dataTransferOnlyStr18) {
        doSetDataTransferOnlyStr18_NotEqual(fRES(dataTransferOnlyStr18));
    }

    protected void doSetDataTransferOnlyStr18_NotEqual(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_NES, dataTransferOnlyStr18);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_GreaterThan(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_GT, fRES(dataTransferOnlyStr18));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_LessThan(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_LT, fRES(dataTransferOnlyStr18));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_GreaterEqual(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_GE, fRES(dataTransferOnlyStr18));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_LessEqual(String dataTransferOnlyStr18) {
        regDataTransferOnlyStr18(CK_LE, fRES(dataTransferOnlyStr18));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18List The collection of dataTransferOnlyStr18 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_InScope(Collection<String> dataTransferOnlyStr18List) {
        doSetDataTransferOnlyStr18_InScope(dataTransferOnlyStr18List);
    }

    protected void doSetDataTransferOnlyStr18_InScope(Collection<String> dataTransferOnlyStr18List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr18List), xgetCValueDataTransferOnlyStr18(), "DATA_TRANSFER_ONLY_STR18");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18List The collection of dataTransferOnlyStr18 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_NotInScope(Collection<String> dataTransferOnlyStr18List) {
        doSetDataTransferOnlyStr18_NotInScope(dataTransferOnlyStr18List);
    }

    protected void doSetDataTransferOnlyStr18_NotInScope(Collection<String> dataTransferOnlyStr18List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr18List), xgetCValueDataTransferOnlyStr18(), "DATA_TRANSFER_ONLY_STR18");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr18_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr18_LikeSearch(String dataTransferOnlyStr18, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr18), xgetCValueDataTransferOnlyStr18(), "DATA_TRANSFER_ONLY_STR18", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr18_NotLikeSearch(String dataTransferOnlyStr18, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr18), xgetCValueDataTransferOnlyStr18(), "DATA_TRANSFER_ONLY_STR18", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     * @param dataTransferOnlyStr18 The value of dataTransferOnlyStr18 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr18_PrefixSearch(String dataTransferOnlyStr18) {
        setDataTransferOnlyStr18_LikeSearch(dataTransferOnlyStr18, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr18_IsNull() { regDataTransferOnlyStr18(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr18_IsNullOrEmpty() { regDataTransferOnlyStr18(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr18_IsNotNull() { regDataTransferOnlyStr18(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr18(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr18(), "DATA_TRANSFER_ONLY_STR18"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr18();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_Equal(String dataTransferOnlyStr19) {
        doSetDataTransferOnlyStr19_Equal(fRES(dataTransferOnlyStr19));
    }

    protected void doSetDataTransferOnlyStr19_Equal(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_EQ, dataTransferOnlyStr19);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_NotEqual(String dataTransferOnlyStr19) {
        doSetDataTransferOnlyStr19_NotEqual(fRES(dataTransferOnlyStr19));
    }

    protected void doSetDataTransferOnlyStr19_NotEqual(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_NES, dataTransferOnlyStr19);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_GreaterThan(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_GT, fRES(dataTransferOnlyStr19));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_LessThan(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_LT, fRES(dataTransferOnlyStr19));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_GreaterEqual(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_GE, fRES(dataTransferOnlyStr19));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_LessEqual(String dataTransferOnlyStr19) {
        regDataTransferOnlyStr19(CK_LE, fRES(dataTransferOnlyStr19));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19List The collection of dataTransferOnlyStr19 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_InScope(Collection<String> dataTransferOnlyStr19List) {
        doSetDataTransferOnlyStr19_InScope(dataTransferOnlyStr19List);
    }

    protected void doSetDataTransferOnlyStr19_InScope(Collection<String> dataTransferOnlyStr19List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr19List), xgetCValueDataTransferOnlyStr19(), "DATA_TRANSFER_ONLY_STR19");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19List The collection of dataTransferOnlyStr19 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_NotInScope(Collection<String> dataTransferOnlyStr19List) {
        doSetDataTransferOnlyStr19_NotInScope(dataTransferOnlyStr19List);
    }

    protected void doSetDataTransferOnlyStr19_NotInScope(Collection<String> dataTransferOnlyStr19List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr19List), xgetCValueDataTransferOnlyStr19(), "DATA_TRANSFER_ONLY_STR19");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr19_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr19_LikeSearch(String dataTransferOnlyStr19, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr19), xgetCValueDataTransferOnlyStr19(), "DATA_TRANSFER_ONLY_STR19", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr19_NotLikeSearch(String dataTransferOnlyStr19, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr19), xgetCValueDataTransferOnlyStr19(), "DATA_TRANSFER_ONLY_STR19", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     * @param dataTransferOnlyStr19 The value of dataTransferOnlyStr19 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr19_PrefixSearch(String dataTransferOnlyStr19) {
        setDataTransferOnlyStr19_LikeSearch(dataTransferOnlyStr19, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr19_IsNull() { regDataTransferOnlyStr19(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr19_IsNullOrEmpty() { regDataTransferOnlyStr19(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr19_IsNotNull() { regDataTransferOnlyStr19(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr19(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr19(), "DATA_TRANSFER_ONLY_STR19"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr19();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_Equal(String dataTransferOnlyStr20) {
        doSetDataTransferOnlyStr20_Equal(fRES(dataTransferOnlyStr20));
    }

    protected void doSetDataTransferOnlyStr20_Equal(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_EQ, dataTransferOnlyStr20);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_NotEqual(String dataTransferOnlyStr20) {
        doSetDataTransferOnlyStr20_NotEqual(fRES(dataTransferOnlyStr20));
    }

    protected void doSetDataTransferOnlyStr20_NotEqual(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_NES, dataTransferOnlyStr20);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_GreaterThan(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_GT, fRES(dataTransferOnlyStr20));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_LessThan(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_LT, fRES(dataTransferOnlyStr20));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_GreaterEqual(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_GE, fRES(dataTransferOnlyStr20));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_LessEqual(String dataTransferOnlyStr20) {
        regDataTransferOnlyStr20(CK_LE, fRES(dataTransferOnlyStr20));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20List The collection of dataTransferOnlyStr20 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_InScope(Collection<String> dataTransferOnlyStr20List) {
        doSetDataTransferOnlyStr20_InScope(dataTransferOnlyStr20List);
    }

    protected void doSetDataTransferOnlyStr20_InScope(Collection<String> dataTransferOnlyStr20List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr20List), xgetCValueDataTransferOnlyStr20(), "DATA_TRANSFER_ONLY_STR20");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20List The collection of dataTransferOnlyStr20 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_NotInScope(Collection<String> dataTransferOnlyStr20List) {
        doSetDataTransferOnlyStr20_NotInScope(dataTransferOnlyStr20List);
    }

    protected void doSetDataTransferOnlyStr20_NotInScope(Collection<String> dataTransferOnlyStr20List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr20List), xgetCValueDataTransferOnlyStr20(), "DATA_TRANSFER_ONLY_STR20");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr20_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr20_LikeSearch(String dataTransferOnlyStr20, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr20), xgetCValueDataTransferOnlyStr20(), "DATA_TRANSFER_ONLY_STR20", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr20_NotLikeSearch(String dataTransferOnlyStr20, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr20), xgetCValueDataTransferOnlyStr20(), "DATA_TRANSFER_ONLY_STR20", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     * @param dataTransferOnlyStr20 The value of dataTransferOnlyStr20 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr20_PrefixSearch(String dataTransferOnlyStr20) {
        setDataTransferOnlyStr20_LikeSearch(dataTransferOnlyStr20, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr20_IsNull() { regDataTransferOnlyStr20(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr20_IsNullOrEmpty() { regDataTransferOnlyStr20(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr20_IsNotNull() { regDataTransferOnlyStr20(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr20(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr20(), "DATA_TRANSFER_ONLY_STR20"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr20();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_Equal(String dataTransferOnlyStr21) {
        doSetDataTransferOnlyStr21_Equal(fRES(dataTransferOnlyStr21));
    }

    protected void doSetDataTransferOnlyStr21_Equal(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_EQ, dataTransferOnlyStr21);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_NotEqual(String dataTransferOnlyStr21) {
        doSetDataTransferOnlyStr21_NotEqual(fRES(dataTransferOnlyStr21));
    }

    protected void doSetDataTransferOnlyStr21_NotEqual(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_NES, dataTransferOnlyStr21);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_GreaterThan(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_GT, fRES(dataTransferOnlyStr21));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_LessThan(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_LT, fRES(dataTransferOnlyStr21));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_GreaterEqual(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_GE, fRES(dataTransferOnlyStr21));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_LessEqual(String dataTransferOnlyStr21) {
        regDataTransferOnlyStr21(CK_LE, fRES(dataTransferOnlyStr21));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21List The collection of dataTransferOnlyStr21 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_InScope(Collection<String> dataTransferOnlyStr21List) {
        doSetDataTransferOnlyStr21_InScope(dataTransferOnlyStr21List);
    }

    protected void doSetDataTransferOnlyStr21_InScope(Collection<String> dataTransferOnlyStr21List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr21List), xgetCValueDataTransferOnlyStr21(), "DATA_TRANSFER_ONLY_STR21");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21List The collection of dataTransferOnlyStr21 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_NotInScope(Collection<String> dataTransferOnlyStr21List) {
        doSetDataTransferOnlyStr21_NotInScope(dataTransferOnlyStr21List);
    }

    protected void doSetDataTransferOnlyStr21_NotInScope(Collection<String> dataTransferOnlyStr21List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr21List), xgetCValueDataTransferOnlyStr21(), "DATA_TRANSFER_ONLY_STR21");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr21_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr21_LikeSearch(String dataTransferOnlyStr21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr21), xgetCValueDataTransferOnlyStr21(), "DATA_TRANSFER_ONLY_STR21", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr21_NotLikeSearch(String dataTransferOnlyStr21, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr21), xgetCValueDataTransferOnlyStr21(), "DATA_TRANSFER_ONLY_STR21", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     * @param dataTransferOnlyStr21 The value of dataTransferOnlyStr21 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr21_PrefixSearch(String dataTransferOnlyStr21) {
        setDataTransferOnlyStr21_LikeSearch(dataTransferOnlyStr21, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr21_IsNull() { regDataTransferOnlyStr21(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr21_IsNullOrEmpty() { regDataTransferOnlyStr21(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr21_IsNotNull() { regDataTransferOnlyStr21(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr21(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr21(), "DATA_TRANSFER_ONLY_STR21"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr21();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_Equal(String dataTransferOnlyStr22) {
        doSetDataTransferOnlyStr22_Equal(fRES(dataTransferOnlyStr22));
    }

    protected void doSetDataTransferOnlyStr22_Equal(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_EQ, dataTransferOnlyStr22);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_NotEqual(String dataTransferOnlyStr22) {
        doSetDataTransferOnlyStr22_NotEqual(fRES(dataTransferOnlyStr22));
    }

    protected void doSetDataTransferOnlyStr22_NotEqual(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_NES, dataTransferOnlyStr22);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_GreaterThan(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_GT, fRES(dataTransferOnlyStr22));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_LessThan(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_LT, fRES(dataTransferOnlyStr22));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_GreaterEqual(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_GE, fRES(dataTransferOnlyStr22));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_LessEqual(String dataTransferOnlyStr22) {
        regDataTransferOnlyStr22(CK_LE, fRES(dataTransferOnlyStr22));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22List The collection of dataTransferOnlyStr22 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_InScope(Collection<String> dataTransferOnlyStr22List) {
        doSetDataTransferOnlyStr22_InScope(dataTransferOnlyStr22List);
    }

    protected void doSetDataTransferOnlyStr22_InScope(Collection<String> dataTransferOnlyStr22List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr22List), xgetCValueDataTransferOnlyStr22(), "DATA_TRANSFER_ONLY_STR22");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22List The collection of dataTransferOnlyStr22 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_NotInScope(Collection<String> dataTransferOnlyStr22List) {
        doSetDataTransferOnlyStr22_NotInScope(dataTransferOnlyStr22List);
    }

    protected void doSetDataTransferOnlyStr22_NotInScope(Collection<String> dataTransferOnlyStr22List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr22List), xgetCValueDataTransferOnlyStr22(), "DATA_TRANSFER_ONLY_STR22");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr22_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr22_LikeSearch(String dataTransferOnlyStr22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr22), xgetCValueDataTransferOnlyStr22(), "DATA_TRANSFER_ONLY_STR22", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr22_NotLikeSearch(String dataTransferOnlyStr22, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr22), xgetCValueDataTransferOnlyStr22(), "DATA_TRANSFER_ONLY_STR22", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     * @param dataTransferOnlyStr22 The value of dataTransferOnlyStr22 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr22_PrefixSearch(String dataTransferOnlyStr22) {
        setDataTransferOnlyStr22_LikeSearch(dataTransferOnlyStr22, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr22_IsNull() { regDataTransferOnlyStr22(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr22_IsNullOrEmpty() { regDataTransferOnlyStr22(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr22_IsNotNull() { regDataTransferOnlyStr22(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr22(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr22(), "DATA_TRANSFER_ONLY_STR22"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr22();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_Equal(String dataTransferOnlyStr23) {
        doSetDataTransferOnlyStr23_Equal(fRES(dataTransferOnlyStr23));
    }

    protected void doSetDataTransferOnlyStr23_Equal(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_EQ, dataTransferOnlyStr23);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_NotEqual(String dataTransferOnlyStr23) {
        doSetDataTransferOnlyStr23_NotEqual(fRES(dataTransferOnlyStr23));
    }

    protected void doSetDataTransferOnlyStr23_NotEqual(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_NES, dataTransferOnlyStr23);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_GreaterThan(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_GT, fRES(dataTransferOnlyStr23));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_LessThan(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_LT, fRES(dataTransferOnlyStr23));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_GreaterEqual(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_GE, fRES(dataTransferOnlyStr23));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_LessEqual(String dataTransferOnlyStr23) {
        regDataTransferOnlyStr23(CK_LE, fRES(dataTransferOnlyStr23));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23List The collection of dataTransferOnlyStr23 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_InScope(Collection<String> dataTransferOnlyStr23List) {
        doSetDataTransferOnlyStr23_InScope(dataTransferOnlyStr23List);
    }

    protected void doSetDataTransferOnlyStr23_InScope(Collection<String> dataTransferOnlyStr23List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr23List), xgetCValueDataTransferOnlyStr23(), "DATA_TRANSFER_ONLY_STR23");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23List The collection of dataTransferOnlyStr23 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_NotInScope(Collection<String> dataTransferOnlyStr23List) {
        doSetDataTransferOnlyStr23_NotInScope(dataTransferOnlyStr23List);
    }

    protected void doSetDataTransferOnlyStr23_NotInScope(Collection<String> dataTransferOnlyStr23List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr23List), xgetCValueDataTransferOnlyStr23(), "DATA_TRANSFER_ONLY_STR23");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr23_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr23_LikeSearch(String dataTransferOnlyStr23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr23), xgetCValueDataTransferOnlyStr23(), "DATA_TRANSFER_ONLY_STR23", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr23_NotLikeSearch(String dataTransferOnlyStr23, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr23), xgetCValueDataTransferOnlyStr23(), "DATA_TRANSFER_ONLY_STR23", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     * @param dataTransferOnlyStr23 The value of dataTransferOnlyStr23 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr23_PrefixSearch(String dataTransferOnlyStr23) {
        setDataTransferOnlyStr23_LikeSearch(dataTransferOnlyStr23, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr23_IsNull() { regDataTransferOnlyStr23(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr23_IsNullOrEmpty() { regDataTransferOnlyStr23(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr23_IsNotNull() { regDataTransferOnlyStr23(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr23(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr23(), "DATA_TRANSFER_ONLY_STR23"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr23();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_Equal(String dataTransferOnlyStr24) {
        doSetDataTransferOnlyStr24_Equal(fRES(dataTransferOnlyStr24));
    }

    protected void doSetDataTransferOnlyStr24_Equal(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_EQ, dataTransferOnlyStr24);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_NotEqual(String dataTransferOnlyStr24) {
        doSetDataTransferOnlyStr24_NotEqual(fRES(dataTransferOnlyStr24));
    }

    protected void doSetDataTransferOnlyStr24_NotEqual(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_NES, dataTransferOnlyStr24);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_GreaterThan(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_GT, fRES(dataTransferOnlyStr24));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_LessThan(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_LT, fRES(dataTransferOnlyStr24));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_GreaterEqual(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_GE, fRES(dataTransferOnlyStr24));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_LessEqual(String dataTransferOnlyStr24) {
        regDataTransferOnlyStr24(CK_LE, fRES(dataTransferOnlyStr24));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24List The collection of dataTransferOnlyStr24 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_InScope(Collection<String> dataTransferOnlyStr24List) {
        doSetDataTransferOnlyStr24_InScope(dataTransferOnlyStr24List);
    }

    protected void doSetDataTransferOnlyStr24_InScope(Collection<String> dataTransferOnlyStr24List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr24List), xgetCValueDataTransferOnlyStr24(), "DATA_TRANSFER_ONLY_STR24");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24List The collection of dataTransferOnlyStr24 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_NotInScope(Collection<String> dataTransferOnlyStr24List) {
        doSetDataTransferOnlyStr24_NotInScope(dataTransferOnlyStr24List);
    }

    protected void doSetDataTransferOnlyStr24_NotInScope(Collection<String> dataTransferOnlyStr24List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr24List), xgetCValueDataTransferOnlyStr24(), "DATA_TRANSFER_ONLY_STR24");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr24_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr24_LikeSearch(String dataTransferOnlyStr24, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr24), xgetCValueDataTransferOnlyStr24(), "DATA_TRANSFER_ONLY_STR24", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr24_NotLikeSearch(String dataTransferOnlyStr24, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr24), xgetCValueDataTransferOnlyStr24(), "DATA_TRANSFER_ONLY_STR24", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     * @param dataTransferOnlyStr24 The value of dataTransferOnlyStr24 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr24_PrefixSearch(String dataTransferOnlyStr24) {
        setDataTransferOnlyStr24_LikeSearch(dataTransferOnlyStr24, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr24_IsNull() { regDataTransferOnlyStr24(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr24_IsNullOrEmpty() { regDataTransferOnlyStr24(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr24_IsNotNull() { regDataTransferOnlyStr24(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr24(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr24(), "DATA_TRANSFER_ONLY_STR24"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr24();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_Equal(String dataTransferOnlyStr25) {
        doSetDataTransferOnlyStr25_Equal(fRES(dataTransferOnlyStr25));
    }

    protected void doSetDataTransferOnlyStr25_Equal(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_EQ, dataTransferOnlyStr25);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_NotEqual(String dataTransferOnlyStr25) {
        doSetDataTransferOnlyStr25_NotEqual(fRES(dataTransferOnlyStr25));
    }

    protected void doSetDataTransferOnlyStr25_NotEqual(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_NES, dataTransferOnlyStr25);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_GreaterThan(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_GT, fRES(dataTransferOnlyStr25));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_LessThan(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_LT, fRES(dataTransferOnlyStr25));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_GreaterEqual(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_GE, fRES(dataTransferOnlyStr25));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_LessEqual(String dataTransferOnlyStr25) {
        regDataTransferOnlyStr25(CK_LE, fRES(dataTransferOnlyStr25));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25List The collection of dataTransferOnlyStr25 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_InScope(Collection<String> dataTransferOnlyStr25List) {
        doSetDataTransferOnlyStr25_InScope(dataTransferOnlyStr25List);
    }

    protected void doSetDataTransferOnlyStr25_InScope(Collection<String> dataTransferOnlyStr25List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr25List), xgetCValueDataTransferOnlyStr25(), "DATA_TRANSFER_ONLY_STR25");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25List The collection of dataTransferOnlyStr25 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_NotInScope(Collection<String> dataTransferOnlyStr25List) {
        doSetDataTransferOnlyStr25_NotInScope(dataTransferOnlyStr25List);
    }

    protected void doSetDataTransferOnlyStr25_NotInScope(Collection<String> dataTransferOnlyStr25List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr25List), xgetCValueDataTransferOnlyStr25(), "DATA_TRANSFER_ONLY_STR25");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr25_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr25_LikeSearch(String dataTransferOnlyStr25, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr25), xgetCValueDataTransferOnlyStr25(), "DATA_TRANSFER_ONLY_STR25", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr25_NotLikeSearch(String dataTransferOnlyStr25, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr25), xgetCValueDataTransferOnlyStr25(), "DATA_TRANSFER_ONLY_STR25", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     * @param dataTransferOnlyStr25 The value of dataTransferOnlyStr25 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr25_PrefixSearch(String dataTransferOnlyStr25) {
        setDataTransferOnlyStr25_LikeSearch(dataTransferOnlyStr25, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr25_IsNull() { regDataTransferOnlyStr25(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr25_IsNullOrEmpty() { regDataTransferOnlyStr25(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr25_IsNotNull() { regDataTransferOnlyStr25(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr25(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr25(), "DATA_TRANSFER_ONLY_STR25"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr25();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_Equal(String dataTransferOnlyStr26) {
        doSetDataTransferOnlyStr26_Equal(fRES(dataTransferOnlyStr26));
    }

    protected void doSetDataTransferOnlyStr26_Equal(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_EQ, dataTransferOnlyStr26);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_NotEqual(String dataTransferOnlyStr26) {
        doSetDataTransferOnlyStr26_NotEqual(fRES(dataTransferOnlyStr26));
    }

    protected void doSetDataTransferOnlyStr26_NotEqual(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_NES, dataTransferOnlyStr26);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_GreaterThan(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_GT, fRES(dataTransferOnlyStr26));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_LessThan(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_LT, fRES(dataTransferOnlyStr26));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_GreaterEqual(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_GE, fRES(dataTransferOnlyStr26));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_LessEqual(String dataTransferOnlyStr26) {
        regDataTransferOnlyStr26(CK_LE, fRES(dataTransferOnlyStr26));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26List The collection of dataTransferOnlyStr26 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_InScope(Collection<String> dataTransferOnlyStr26List) {
        doSetDataTransferOnlyStr26_InScope(dataTransferOnlyStr26List);
    }

    protected void doSetDataTransferOnlyStr26_InScope(Collection<String> dataTransferOnlyStr26List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr26List), xgetCValueDataTransferOnlyStr26(), "DATA_TRANSFER_ONLY_STR26");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26List The collection of dataTransferOnlyStr26 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_NotInScope(Collection<String> dataTransferOnlyStr26List) {
        doSetDataTransferOnlyStr26_NotInScope(dataTransferOnlyStr26List);
    }

    protected void doSetDataTransferOnlyStr26_NotInScope(Collection<String> dataTransferOnlyStr26List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr26List), xgetCValueDataTransferOnlyStr26(), "DATA_TRANSFER_ONLY_STR26");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * <pre>e.g. setDataTransferOnlyStr26_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr26_LikeSearch(String dataTransferOnlyStr26, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr26), xgetCValueDataTransferOnlyStr26(), "DATA_TRANSFER_ONLY_STR26", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr26_NotLikeSearch(String dataTransferOnlyStr26, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr26), xgetCValueDataTransferOnlyStr26(), "DATA_TRANSFER_ONLY_STR26", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     * @param dataTransferOnlyStr26 The value of dataTransferOnlyStr26 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr26_PrefixSearch(String dataTransferOnlyStr26) {
        setDataTransferOnlyStr26_LikeSearch(dataTransferOnlyStr26, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     */
    public void setDataTransferOnlyStr26_IsNull() { regDataTransferOnlyStr26(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     */
    public void setDataTransferOnlyStr26_IsNullOrEmpty() { regDataTransferOnlyStr26(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
     */
    public void setDataTransferOnlyStr26_IsNotNull() { regDataTransferOnlyStr26(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr26(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr26(), "DATA_TRANSFER_ONLY_STR26"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr26();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_Equal(String dataTransferOnlyStr27) {
        doSetDataTransferOnlyStr27_Equal(fRES(dataTransferOnlyStr27));
    }

    protected void doSetDataTransferOnlyStr27_Equal(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_EQ, dataTransferOnlyStr27);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_NotEqual(String dataTransferOnlyStr27) {
        doSetDataTransferOnlyStr27_NotEqual(fRES(dataTransferOnlyStr27));
    }

    protected void doSetDataTransferOnlyStr27_NotEqual(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_NES, dataTransferOnlyStr27);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_GreaterThan(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_GT, fRES(dataTransferOnlyStr27));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_LessThan(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_LT, fRES(dataTransferOnlyStr27));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_GreaterEqual(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_GE, fRES(dataTransferOnlyStr27));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_LessEqual(String dataTransferOnlyStr27) {
        regDataTransferOnlyStr27(CK_LE, fRES(dataTransferOnlyStr27));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27List The collection of dataTransferOnlyStr27 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_InScope(Collection<String> dataTransferOnlyStr27List) {
        doSetDataTransferOnlyStr27_InScope(dataTransferOnlyStr27List);
    }

    protected void doSetDataTransferOnlyStr27_InScope(Collection<String> dataTransferOnlyStr27List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr27List), xgetCValueDataTransferOnlyStr27(), "DATA_TRANSFER_ONLY_STR27");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27List The collection of dataTransferOnlyStr27 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_NotInScope(Collection<String> dataTransferOnlyStr27List) {
        doSetDataTransferOnlyStr27_NotInScope(dataTransferOnlyStr27List);
    }

    protected void doSetDataTransferOnlyStr27_NotInScope(Collection<String> dataTransferOnlyStr27List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr27List), xgetCValueDataTransferOnlyStr27(), "DATA_TRANSFER_ONLY_STR27");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr27_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr27_LikeSearch(String dataTransferOnlyStr27, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr27), xgetCValueDataTransferOnlyStr27(), "DATA_TRANSFER_ONLY_STR27", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr27_NotLikeSearch(String dataTransferOnlyStr27, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr27), xgetCValueDataTransferOnlyStr27(), "DATA_TRANSFER_ONLY_STR27", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     * @param dataTransferOnlyStr27 The value of dataTransferOnlyStr27 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr27_PrefixSearch(String dataTransferOnlyStr27) {
        setDataTransferOnlyStr27_LikeSearch(dataTransferOnlyStr27, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr27_IsNull() { regDataTransferOnlyStr27(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr27_IsNullOrEmpty() { regDataTransferOnlyStr27(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr27_IsNotNull() { regDataTransferOnlyStr27(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr27(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr27(), "DATA_TRANSFER_ONLY_STR27"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr27();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_Equal(String dataTransferOnlyStr28) {
        doSetDataTransferOnlyStr28_Equal(fRES(dataTransferOnlyStr28));
    }

    protected void doSetDataTransferOnlyStr28_Equal(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_EQ, dataTransferOnlyStr28);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_NotEqual(String dataTransferOnlyStr28) {
        doSetDataTransferOnlyStr28_NotEqual(fRES(dataTransferOnlyStr28));
    }

    protected void doSetDataTransferOnlyStr28_NotEqual(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_NES, dataTransferOnlyStr28);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_GreaterThan(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_GT, fRES(dataTransferOnlyStr28));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_LessThan(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_LT, fRES(dataTransferOnlyStr28));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_GreaterEqual(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_GE, fRES(dataTransferOnlyStr28));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_LessEqual(String dataTransferOnlyStr28) {
        regDataTransferOnlyStr28(CK_LE, fRES(dataTransferOnlyStr28));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28List The collection of dataTransferOnlyStr28 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_InScope(Collection<String> dataTransferOnlyStr28List) {
        doSetDataTransferOnlyStr28_InScope(dataTransferOnlyStr28List);
    }

    protected void doSetDataTransferOnlyStr28_InScope(Collection<String> dataTransferOnlyStr28List) {
        regINS(CK_INS, cTL(dataTransferOnlyStr28List), xgetCValueDataTransferOnlyStr28(), "DATA_TRANSFER_ONLY_STR28");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28List The collection of dataTransferOnlyStr28 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_NotInScope(Collection<String> dataTransferOnlyStr28List) {
        doSetDataTransferOnlyStr28_NotInScope(dataTransferOnlyStr28List);
    }

    protected void doSetDataTransferOnlyStr28_NotInScope(Collection<String> dataTransferOnlyStr28List) {
        regINS(CK_NINS, cTL(dataTransferOnlyStr28List), xgetCValueDataTransferOnlyStr28(), "DATA_TRANSFER_ONLY_STR28");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * <pre>e.g. setDataTransferOnlyStr28_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDataTransferOnlyStr28_LikeSearch(String dataTransferOnlyStr28, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dataTransferOnlyStr28), xgetCValueDataTransferOnlyStr28(), "DATA_TRANSFER_ONLY_STR28", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDataTransferOnlyStr28_NotLikeSearch(String dataTransferOnlyStr28, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dataTransferOnlyStr28), xgetCValueDataTransferOnlyStr28(), "DATA_TRANSFER_ONLY_STR28", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     * @param dataTransferOnlyStr28 The value of dataTransferOnlyStr28 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDataTransferOnlyStr28_PrefixSearch(String dataTransferOnlyStr28) {
        setDataTransferOnlyStr28_LikeSearch(dataTransferOnlyStr28, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr28_IsNull() { regDataTransferOnlyStr28(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr28_IsNullOrEmpty() { regDataTransferOnlyStr28(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
     */
    public void setDataTransferOnlyStr28_IsNotNull() { regDataTransferOnlyStr28(CK_ISNN, DOBJ); }

    protected void regDataTransferOnlyStr28(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDataTransferOnlyStr28(), "DATA_TRANSFER_ONLY_STR28"); }
    protected abstract ConditionValue xgetCValueDataTransferOnlyStr28();

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
    public HpSLCFunction<EsReceivePlanCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, EsReceivePlanCB.class);
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
    public HpSLCFunction<EsReceivePlanCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, EsReceivePlanCB.class);
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
    public HpSLCFunction<EsReceivePlanCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, EsReceivePlanCB.class);
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
    public HpSLCFunction<EsReceivePlanCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, EsReceivePlanCB.class);
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
    public HpSLCFunction<EsReceivePlanCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, EsReceivePlanCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;EsReceivePlanCB&gt;() {
     *     public void query(EsReceivePlanCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<EsReceivePlanCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, EsReceivePlanCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        EsReceivePlanCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(EsReceivePlanCQ sq);

    protected EsReceivePlanCB xcreateScalarConditionCB() {
        EsReceivePlanCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected EsReceivePlanCB xcreateScalarConditionPartitionByCB() {
        EsReceivePlanCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<EsReceivePlanCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EsReceivePlanCB cb = new EsReceivePlanCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_PLAN_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(EsReceivePlanCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<EsReceivePlanCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(EsReceivePlanCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        EsReceivePlanCB cb = new EsReceivePlanCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_PLAN_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(EsReceivePlanCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<EsReceivePlanCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        EsReceivePlanCB cb = new EsReceivePlanCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(EsReceivePlanCQ sq);

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
    protected EsReceivePlanCB newMyCB() {
        return new EsReceivePlanCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return EsReceivePlanCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
