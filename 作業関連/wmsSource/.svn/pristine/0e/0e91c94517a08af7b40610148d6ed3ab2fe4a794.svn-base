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
 * The abstract condition-query of t_receive_plan_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReceivePlanDataTransferCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReceivePlanDataTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_receive_plan_data_transfer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_Equal(Long receivePlanDataTransferId) {
        doSetReceivePlanDataTransferId_Equal(receivePlanDataTransferId);
    }

    protected void doSetReceivePlanDataTransferId_Equal(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_EQ, receivePlanDataTransferId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_NotEqual(Long receivePlanDataTransferId) {
        doSetReceivePlanDataTransferId_NotEqual(receivePlanDataTransferId);
    }

    protected void doSetReceivePlanDataTransferId_NotEqual(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_NES, receivePlanDataTransferId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_GreaterThan(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_GT, receivePlanDataTransferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_LessThan(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_LT, receivePlanDataTransferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_GreaterEqual(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_GE, receivePlanDataTransferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferId The value of receivePlanDataTransferId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_LessEqual(Long receivePlanDataTransferId) {
        regReceivePlanDataTransferId(CK_LE, receivePlanDataTransferId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of receivePlanDataTransferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanDataTransferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanDataTransferId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanDataTransferId(), "RECEIVE_PLAN_DATA_TRANSFER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferIdList The collection of receivePlanDataTransferId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_InScope(Collection<Long> receivePlanDataTransferIdList) {
        doSetReceivePlanDataTransferId_InScope(receivePlanDataTransferIdList);
    }

    protected void doSetReceivePlanDataTransferId_InScope(Collection<Long> receivePlanDataTransferIdList) {
        regINS(CK_INS, cTL(receivePlanDataTransferIdList), xgetCValueReceivePlanDataTransferId(), "RECEIVE_PLAN_DATA_TRANSFER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receivePlanDataTransferIdList The collection of receivePlanDataTransferId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanDataTransferId_NotInScope(Collection<Long> receivePlanDataTransferIdList) {
        doSetReceivePlanDataTransferId_NotInScope(receivePlanDataTransferIdList);
    }

    protected void doSetReceivePlanDataTransferId_NotInScope(Collection<Long> receivePlanDataTransferIdList) {
        regINS(CK_NINS, cTL(receivePlanDataTransferIdList), xgetCValueReceivePlanDataTransferId(), "RECEIVE_PLAN_DATA_TRANSFER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanDataTransferId_IsNull() { regReceivePlanDataTransferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceivePlanDataTransferId_IsNotNull() { regReceivePlanDataTransferId(CK_ISNN, DOBJ); }

    protected void regReceivePlanDataTransferId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanDataTransferId(), "RECEIVE_PLAN_DATA_TRANSFER_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanDataTransferId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_Equal(Long receivePlanBId) {
        doSetReceivePlanBId_Equal(receivePlanBId);
    }

    protected void doSetReceivePlanBId_Equal(Long receivePlanBId) {
        regReceivePlanBId(CK_EQ, receivePlanBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotEqual(Long receivePlanBId) {
        doSetReceivePlanBId_NotEqual(receivePlanBId);
    }

    protected void doSetReceivePlanBId_NotEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_NES, receivePlanBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterThan(Long receivePlanBId) {
        regReceivePlanBId(CK_GT, receivePlanBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessThan(Long receivePlanBId) {
        regReceivePlanBId(CK_LT, receivePlanBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_GE, receivePlanBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_LE, receivePlanBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param minNumber The min number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBIdList The collection of receivePlanBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_InScope(Collection<Long> receivePlanBIdList) {
        doSetReceivePlanBId_InScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_InScope(Collection<Long> receivePlanBIdList) {
        regINS(CK_INS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBIdList The collection of receivePlanBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        doSetReceivePlanBId_NotInScope(receivePlanBIdList);
    }

    protected void doSetReceivePlanBId_NotInScope(Collection<Long> receivePlanBIdList) {
        regINS(CK_NINS, cTL(receivePlanBIdList), xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RECEIVE_PLAN_B_ID from t_receive_plan_b where ...)} <br />
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param subCBLambda The callback for sub-query of TReceivePlanB for 'in-scope'. (NotNull)
     */
    public void inScopeTReceivePlanB(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanBId_InScopeRelation_TReceivePlanB(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanB", false);
    }
    public abstract String keepReceivePlanBId_InScopeRelation_TReceivePlanB(TReceivePlanBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RECEIVE_PLAN_B_ID from t_receive_plan_b where ...)} <br />
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @param subCBLambda The callback for sub-query of TReceivePlanB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTReceivePlanB(SubQuery<TReceivePlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanBCB cb = new TReceivePlanBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_B_ID", "RECEIVE_PLAN_B_ID", pp, "tReceivePlanB", true);
    }
    public abstract String keepReceivePlanBId_NotInScopeRelation_TReceivePlanB(TReceivePlanBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     */
    public void setReceivePlanBId_IsNull() { regReceivePlanBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
     */
    public void setReceivePlanBId_IsNotNull() { regReceivePlanBId(CK_ISNN, DOBJ); }

    protected void regReceivePlanBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanBId();

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
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReceivePlanDataTransferCB.class);
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
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReceivePlanDataTransferCB.class);
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
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReceivePlanDataTransferCB.class);
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
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReceivePlanDataTransferCB.class);
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
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReceivePlanDataTransferCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReceivePlanDataTransferCB&gt;() {
     *     public void query(TReceivePlanDataTransferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReceivePlanDataTransferCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReceivePlanDataTransferCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanDataTransferCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReceivePlanDataTransferCQ sq);

    protected TReceivePlanDataTransferCB xcreateScalarConditionCB() {
        TReceivePlanDataTransferCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReceivePlanDataTransferCB xcreateScalarConditionPartitionByCB() {
        TReceivePlanDataTransferCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

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
    protected TReceivePlanDataTransferCB newMyCB() {
        return new TReceivePlanDataTransferCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReceivePlanDataTransferCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
