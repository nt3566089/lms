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
 * The abstract condition-query of t_receive_plan_r.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReceivePlanRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReceivePlanRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_receive_plan_r";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_Equal(Long receivePlanHId) {
        doSetReceivePlanHId_Equal(receivePlanHId);
    }

    protected void doSetReceivePlanHId_Equal(Long receivePlanHId) {
        regReceivePlanHId(CK_EQ, receivePlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotEqual(Long receivePlanHId) {
        doSetReceivePlanHId_NotEqual(receivePlanHId);
    }

    protected void doSetReceivePlanHId_NotEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_NES, receivePlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterThan(Long receivePlanHId) {
        regReceivePlanHId(CK_GT, receivePlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessThan(Long receivePlanHId) {
        regReceivePlanHId(CK_LT, receivePlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_GreaterEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_GE, receivePlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHId The value of receivePlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanHId_LessEqual(Long receivePlanHId) {
        regReceivePlanHId(CK_LE, receivePlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param minNumber The min number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHIdList The collection of receivePlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_InScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_InScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_INS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     * @param receivePlanHIdList The collection of receivePlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        doSetReceivePlanHId_NotInScope(receivePlanHIdList);
    }

    protected void doSetReceivePlanHId_NotInScope(Collection<Long> receivePlanHIdList) {
        regINS(CK_NINS, cTL(receivePlanHIdList), xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @param subCBLambda The callback for sub-query of TReceivePlanH for 'in-scope'. (NotNull)
     */
    public void inScopeTReceivePlanH(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanHId_InScopeRelation_TReceivePlanH(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanH", false);
    }
    public abstract String keepReceivePlanHId_InScopeRelation_TReceivePlanH(TReceivePlanHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RECEIVE_PLAN_H_ID from t_receive_plan_h where ...)} <br />
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @param subCBLambda The callback for sub-query of TReceivePlanH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTReceivePlanH(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(cb.query());
        registerInScopeRelation(cb.query(), "RECEIVE_PLAN_H_ID", "RECEIVE_PLAN_H_ID", pp, "tReceivePlanH", true);
    }
    public abstract String keepReceivePlanHId_NotInScopeRelation_TReceivePlanH(TReceivePlanHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     */
    public void setReceivePlanHId_IsNull() { regReceivePlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_H_ID: {PK, NotNull, BIGINT(19), FK to t_receive_plan_h}
     */
    public void setReceivePlanHId_IsNotNull() { regReceivePlanHId(CK_ISNN, DOBJ); }

    protected void regReceivePlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanHId(), "RECEIVE_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanHId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param rplOutFlg The value of rplOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_Equal(String rplOutFlg) {
        doSetRplOutFlg_Equal(fRES(rplOutFlg));
    }

    /**
     * Equal(=). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetRplOutFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setRplOutFlg_Equal_$0() {
        setRplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setRplOutFlg_Equal_$1() {
        setRplOutFlg_Equal_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetRplOutFlg_Equal(String rplOutFlg) {
        regRplOutFlg(CK_EQ, rplOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param rplOutFlg The value of rplOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_NotEqual(String rplOutFlg) {
        doSetRplOutFlg_NotEqual(fRES(rplOutFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ListOutFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg cdef) {
        doSetRplOutFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未発行
     */
    public void setRplOutFlg_NotEqual_$0() {
        setRplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$0);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 発行済
     */
    public void setRplOutFlg_NotEqual_$1() {
        setRplOutFlg_NotEqual_AsListOutFlg(CDef.ListOutFlg.$1);
    }

    protected void doSetRplOutFlg_NotEqual(String rplOutFlg) {
        regRplOutFlg(CK_NES, rplOutFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param rplOutFlgList The collection of rplOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_InScope(Collection<String> rplOutFlgList) {
        doSetRplOutFlg_InScope(rplOutFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_InScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetRplOutFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetRplOutFlg_InScope(Collection<String> rplOutFlgList) {
        regINS(CK_INS, cTL(rplOutFlgList), xgetCValueRplOutFlg(), "RPL_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     * @param rplOutFlgList The collection of rplOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_NotInScope(Collection<String> rplOutFlgList) {
        doSetRplOutFlg_NotInScope(rplOutFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ListOutFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * リスト発行フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutFlg_NotInScope_AsListOutFlg(Collection<CDef.ListOutFlg> cdefList) {
        doSetRplOutFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetRplOutFlg_NotInScope(Collection<String> rplOutFlgList) {
        regINS(CK_NINS, cTL(rplOutFlgList), xgetCValueRplOutFlg(), "RPL_OUT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setRplOutFlg_IsNull() { regRplOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setRplOutFlg_IsNullOrEmpty() { regRplOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg}
     */
    public void setRplOutFlg_IsNotNull() { regRplOutFlg(CK_ISNN, DOBJ); }

    protected void regRplOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRplOutFlg(), "RPL_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueRplOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_Equal(Long rplOutUserId) {
        doSetRplOutUserId_Equal(rplOutUserId);
    }

    protected void doSetRplOutUserId_Equal(Long rplOutUserId) {
        regRplOutUserId(CK_EQ, rplOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_NotEqual(Long rplOutUserId) {
        doSetRplOutUserId_NotEqual(rplOutUserId);
    }

    protected void doSetRplOutUserId_NotEqual(Long rplOutUserId) {
        regRplOutUserId(CK_NES, rplOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_GreaterThan(Long rplOutUserId) {
        regRplOutUserId(CK_GT, rplOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_LessThan(Long rplOutUserId) {
        regRplOutUserId(CK_LT, rplOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_GreaterEqual(Long rplOutUserId) {
        regRplOutUserId(CK_GE, rplOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserId The value of rplOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutUserId_LessEqual(Long rplOutUserId) {
        regRplOutUserId(CK_LE, rplOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of rplOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rplOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRplOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRplOutUserId(), "RPL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserIdList The collection of rplOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutUserId_InScope(Collection<Long> rplOutUserIdList) {
        doSetRplOutUserId_InScope(rplOutUserIdList);
    }

    protected void doSetRplOutUserId_InScope(Collection<Long> rplOutUserIdList) {
        regINS(CK_INS, cTL(rplOutUserIdList), xgetCValueRplOutUserId(), "RPL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rplOutUserIdList The collection of rplOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRplOutUserId_NotInScope(Collection<Long> rplOutUserIdList) {
        doSetRplOutUserId_NotInScope(rplOutUserIdList);
    }

    protected void doSetRplOutUserId_NotInScope(Collection<Long> rplOutUserIdList) {
        regINS(CK_NINS, cTL(rplOutUserIdList), xgetCValueRplOutUserId(), "RPL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RPL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my RPL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRplOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RPL_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepRplOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RPL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my RPL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRplOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RPL_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepRplOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setRplOutUserId_IsNull() { regRplOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setRplOutUserId_IsNotNull() { regRplOutUserId(CK_ISNN, DOBJ); }

    protected void regRplOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRplOutUserId(), "RPL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueRplOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * @param rplOutDt The value of rplOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutDt_Equal(java.sql.Timestamp rplOutDt) {
        regRplOutDt(CK_EQ,  rplOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * @param rplOutDt The value of rplOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutDt_GreaterThan(java.sql.Timestamp rplOutDt) {
        regRplOutDt(CK_GT,  rplOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * @param rplOutDt The value of rplOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutDt_LessThan(java.sql.Timestamp rplOutDt) {
        regRplOutDt(CK_LT,  rplOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * @param rplOutDt The value of rplOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutDt_GreaterEqual(java.sql.Timestamp rplOutDt) {
        regRplOutDt(CK_GE,  rplOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * @param rplOutDt The value of rplOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRplOutDt_LessEqual(java.sql.Timestamp rplOutDt) {
        regRplOutDt(CK_LE, rplOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setRplOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rplOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rplOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRplOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueRplOutDt(), "RPL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of rplOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of rplOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setRplOutDt_DateFromTo(Date fromDate, Date toDate) {
        setRplOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     */
    public void setRplOutDt_IsNull() { regRplOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RPL_OUT_DT: {DATETIME(19)}
     */
    public void setRplOutDt_IsNotNull() { regRplOutDt(CK_ISNN, DOBJ); }

    protected void regRplOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRplOutDt(), "RPL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueRplOutDt();

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
    public HpSLCFunction<TReceivePlanRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReceivePlanRCB.class);
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
    public HpSLCFunction<TReceivePlanRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReceivePlanRCB.class);
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
    public HpSLCFunction<TReceivePlanRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReceivePlanRCB.class);
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
    public HpSLCFunction<TReceivePlanRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReceivePlanRCB.class);
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
    public HpSLCFunction<TReceivePlanRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReceivePlanRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReceivePlanRCB&gt;() {
     *     public void query(TReceivePlanRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReceivePlanRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReceivePlanRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReceivePlanRCQ sq);

    protected TReceivePlanRCB xcreateScalarConditionCB() {
        TReceivePlanRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReceivePlanRCB xcreateScalarConditionPartitionByCB() {
        TReceivePlanRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReceivePlanRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_PLAN_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReceivePlanRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReceivePlanRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_PLAN_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReceivePlanRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReceivePlanRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanRCB cb = new TReceivePlanRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReceivePlanRCQ sq);

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
    protected TReceivePlanRCB newMyCB() {
        return new TReceivePlanRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReceivePlanRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
