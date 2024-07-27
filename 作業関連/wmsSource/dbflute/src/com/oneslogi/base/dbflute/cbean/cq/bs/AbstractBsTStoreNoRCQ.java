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
 * The abstract condition-query of t_store_no_r.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTStoreNoRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTStoreNoRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_store_no_r";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_Equal(Long storeNoId) {
        doSetStoreNoId_Equal(storeNoId);
    }

    protected void doSetStoreNoId_Equal(Long storeNoId) {
        regStoreNoId(CK_EQ, storeNoId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_NotEqual(Long storeNoId) {
        doSetStoreNoId_NotEqual(storeNoId);
    }

    protected void doSetStoreNoId_NotEqual(Long storeNoId) {
        regStoreNoId(CK_NES, storeNoId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterThan(Long storeNoId) {
        regStoreNoId(CK_GT, storeNoId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessThan(Long storeNoId) {
        regStoreNoId(CK_LT, storeNoId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_GreaterEqual(Long storeNoId) {
        regStoreNoId(CK_GE, storeNoId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoId The value of storeNoId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStoreNoId_LessEqual(Long storeNoId) {
        regStoreNoId(CK_LE, storeNoId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param minNumber The min number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of storeNoId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStoreNoId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStoreNoId(), "STORE_NO_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoIdList The collection of storeNoId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_InScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_InScope(storeNoIdList);
    }

    protected void doSetStoreNoId_InScope(Collection<Long> storeNoIdList) {
        regINS(CK_INS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     * @param storeNoIdList The collection of storeNoId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        doSetStoreNoId_NotInScope(storeNoIdList);
    }

    protected void doSetStoreNoId_NotInScope(Collection<Long> storeNoIdList) {
        regINS(CK_NINS, cTL(storeNoIdList), xgetCValueStoreNoId(), "STORE_NO_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STORE_NO_ID from t_store_no where ...)} <br />
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'in-scope'. (NotNull)
     */
    public void inScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_InScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", false);
    }
    public abstract String keepStoreNoId_InScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STORE_NO_ID from t_store_no where ...)} <br />
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @param subCBLambda The callback for sub-query of TStoreNo for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStoreNo(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStoreNoId_NotInScopeRelation_TStoreNo(cb.query());
        registerInScopeRelation(cb.query(), "STORE_NO_ID", "STORE_NO_ID", pp, "tStoreNo", true);
    }
    public abstract String keepStoreNoId_NotInScopeRelation_TStoreNo(TStoreNoCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     */
    public void setStoreNoId_IsNull() { regStoreNoId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORE_NO_ID: {PK, NotNull, BIGINT(19), FK to t_store_no}
     */
    public void setStoreNoId_IsNotNull() { regStoreNoId(CK_ISNN, DOBJ); }

    protected void regStoreNoId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStoreNoId(), "STORE_NO_ID"); }
    protected abstract ConditionValue xgetCValueStoreNoId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param twlOutFlg The value of twlOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_Equal(String twlOutFlg) {
        doSetTwlOutFlg_Equal(fRES(twlOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTwlOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTwlOutFlg_Equal_$0() {
        setTwlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTwlOutFlg_Equal_$1() {
        setTwlOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTwlOutFlg_Equal(String twlOutFlg) {
        regTwlOutFlg(CK_EQ, twlOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param twlOutFlg The value of twlOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_NotEqual(String twlOutFlg) {
        doSetTwlOutFlg_NotEqual(fRES(twlOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetTwlOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setTwlOutFlg_NotEqual_$0() {
        setTwlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setTwlOutFlg_NotEqual_$1() {
        setTwlOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetTwlOutFlg_NotEqual(String twlOutFlg) {
        regTwlOutFlg(CK_NES, twlOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param twlOutFlgList The collection of twlOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_InScope(Collection<String> twlOutFlgList) {
        doSetTwlOutFlg_InScope(twlOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTwlOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetTwlOutFlg_InScope(Collection<String> twlOutFlgList) {
        regINS(CK_INS, cTL(twlOutFlgList), xgetCValueTwlOutFlg(), "TWL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param twlOutFlgList The collection of twlOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_NotInScope(Collection<String> twlOutFlgList) {
        doSetTwlOutFlg_NotInScope(twlOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetTwlOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetTwlOutFlg_NotInScope(Collection<String> twlOutFlgList) {
        regINS(CK_NINS, cTL(twlOutFlgList), xgetCValueTwlOutFlg(), "TWL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTwlOutFlg_IsNull() { regTwlOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTwlOutFlg_IsNullOrEmpty() { regTwlOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setTwlOutFlg_IsNotNull() { regTwlOutFlg(CK_ISNN, DOBJ); }

    protected void regTwlOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwlOutFlg(), "TWL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueTwlOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_Equal(Long twlOutUserId) {
        doSetTwlOutUserId_Equal(twlOutUserId);
    }

    protected void doSetTwlOutUserId_Equal(Long twlOutUserId) {
        regTwlOutUserId(CK_EQ, twlOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_NotEqual(Long twlOutUserId) {
        doSetTwlOutUserId_NotEqual(twlOutUserId);
    }

    protected void doSetTwlOutUserId_NotEqual(Long twlOutUserId) {
        regTwlOutUserId(CK_NES, twlOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_GreaterThan(Long twlOutUserId) {
        regTwlOutUserId(CK_GT, twlOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_LessThan(Long twlOutUserId) {
        regTwlOutUserId(CK_LT, twlOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_GreaterEqual(Long twlOutUserId) {
        regTwlOutUserId(CK_GE, twlOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserId The value of twlOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutUserId_LessEqual(Long twlOutUserId) {
        regTwlOutUserId(CK_LE, twlOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of twlOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of twlOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTwlOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTwlOutUserId(), "TWL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserIdList The collection of twlOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutUserId_InScope(Collection<Long> twlOutUserIdList) {
        doSetTwlOutUserId_InScope(twlOutUserIdList);
    }

    protected void doSetTwlOutUserId_InScope(Collection<Long> twlOutUserIdList) {
        regINS(CK_INS, cTL(twlOutUserIdList), xgetCValueTwlOutUserId(), "TWL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param twlOutUserIdList The collection of twlOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTwlOutUserId_NotInScope(Collection<Long> twlOutUserIdList) {
        doSetTwlOutUserId_NotInScope(twlOutUserIdList);
    }

    protected void doSetTwlOutUserId_NotInScope(Collection<Long> twlOutUserIdList) {
        regINS(CK_NINS, cTL(twlOutUserIdList), xgetCValueTwlOutUserId(), "TWL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select TWL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my TWL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTwlOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "TWL_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepTwlOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TWL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my TWL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTwlOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "TWL_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepTwlOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setTwlOutUserId_IsNull() { regTwlOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setTwlOutUserId_IsNotNull() { regTwlOutUserId(CK_ISNN, DOBJ); }

    protected void regTwlOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwlOutUserId(), "TWL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueTwlOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @param twlOutDt The value of twlOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutDt_Equal(java.sql.Timestamp twlOutDt) {
        regTwlOutDt(CK_EQ,  twlOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @param twlOutDt The value of twlOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutDt_GreaterThan(java.sql.Timestamp twlOutDt) {
        regTwlOutDt(CK_GT,  twlOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @param twlOutDt The value of twlOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutDt_LessThan(java.sql.Timestamp twlOutDt) {
        regTwlOutDt(CK_LT,  twlOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @param twlOutDt The value of twlOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutDt_GreaterEqual(java.sql.Timestamp twlOutDt) {
        regTwlOutDt(CK_GE,  twlOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * @param twlOutDt The value of twlOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTwlOutDt_LessEqual(java.sql.Timestamp twlOutDt) {
        regTwlOutDt(CK_LE, twlOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setTwlOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of twlOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of twlOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setTwlOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueTwlOutDt(), "TWL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of twlOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of twlOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setTwlOutDt_DateFromTo(Date fromDate, Date toDate) {
        setTwlOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     */
    public void setTwlOutDt_IsNull() { regTwlOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TWL_OUT_DT: {DATETIME(19)}
     */
    public void setTwlOutDt_IsNotNull() { regTwlOutDt(CK_ISNN, DOBJ); }

    protected void regTwlOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTwlOutDt(), "TWL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueTwlOutDt();

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
    public HpSLCFunction<TStoreNoRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TStoreNoRCB.class);
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
    public HpSLCFunction<TStoreNoRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TStoreNoRCB.class);
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
    public HpSLCFunction<TStoreNoRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TStoreNoRCB.class);
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
    public HpSLCFunction<TStoreNoRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TStoreNoRCB.class);
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
    public HpSLCFunction<TStoreNoRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TStoreNoRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TStoreNoRCB&gt;() {
     *     public void query(TStoreNoRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TStoreNoRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TStoreNoRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TStoreNoRCQ sq);

    protected TStoreNoRCB xcreateScalarConditionCB() {
        TStoreNoRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TStoreNoRCB xcreateScalarConditionPartitionByCB() {
        TStoreNoRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TStoreNoRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "STORE_NO_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TStoreNoRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TStoreNoRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TStoreNoRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "STORE_NO_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TStoreNoRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TStoreNoRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoRCB cb = new TStoreNoRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TStoreNoRCQ sq);

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
    protected TStoreNoRCB newMyCB() {
        return new TStoreNoRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TStoreNoRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
