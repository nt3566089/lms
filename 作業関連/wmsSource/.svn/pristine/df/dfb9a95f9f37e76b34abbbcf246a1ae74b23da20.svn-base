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
 * The abstract condition-query of t_inventory_r.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTInventoryRCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTInventoryRCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_inventory_r";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_Equal(Long inventoryBId) {
        doSetInventoryBId_Equal(inventoryBId);
    }

    protected void doSetInventoryBId_Equal(Long inventoryBId) {
        regInventoryBId(CK_EQ, inventoryBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_NotEqual(Long inventoryBId) {
        doSetInventoryBId_NotEqual(inventoryBId);
    }

    protected void doSetInventoryBId_NotEqual(Long inventoryBId) {
        regInventoryBId(CK_NES, inventoryBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterThan(Long inventoryBId) {
        regInventoryBId(CK_GT, inventoryBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessThan(Long inventoryBId) {
        regInventoryBId(CK_LT, inventoryBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_GreaterEqual(Long inventoryBId) {
        regInventoryBId(CK_GE, inventoryBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBId The value of inventoryBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryBId_LessEqual(Long inventoryBId) {
        regInventoryBId(CK_LE, inventoryBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param minNumber The min number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryBId(), "INVENTORY_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBIdList The collection of inventoryBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_InScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_InScope(Collection<Long> inventoryBIdList) {
        regINS(CK_INS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     * @param inventoryBIdList The collection of inventoryBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        doSetInventoryBId_NotInScope(inventoryBIdList);
    }

    protected void doSetInventoryBId_NotInScope(Collection<Long> inventoryBIdList) {
        regINS(CK_NINS, cTL(inventoryBIdList), xgetCValueInventoryBId(), "INVENTORY_B_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_B_ID from t_inventory_b where ...)} <br />
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param subCBLambda The callback for sub-query of TInventoryB for 'in-scope'. (NotNull)
     */
    public void inScopeTInventoryB(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryBId_InScopeRelation_TInventoryB(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryB", false);
    }
    public abstract String keepInventoryBId_InScopeRelation_TInventoryB(TInventoryBCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_B_ID from t_inventory_b where ...)} <br />
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @param subCBLambda The callback for sub-query of TInventoryB for 'not in-scope'. (NotNull)
     */
    public void notInScopeTInventoryB(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryBId_NotInScopeRelation_TInventoryB(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_B_ID", "INVENTORY_B_ID", pp, "tInventoryB", true);
    }
    public abstract String keepInventoryBId_NotInScopeRelation_TInventoryB(TInventoryBCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     */
    public void setInventoryBId_IsNull() { regInventoryBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_B_ID: {PK, NotNull, BIGINT(19), FK to t_inventory_b}
     */
    public void setInventoryBId_IsNotNull() { regInventoryBId(CK_ISNN, DOBJ); }

    protected void regInventoryBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryBId(), "INVENTORY_B_ID"); }
    protected abstract ConditionValue xgetCValueInventoryBId();

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
     * b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTwlOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByTwlOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTwlOutUserId_InScopeRelation_BUserByTwlOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TWL_OUT_USER_ID", "USER_ID", pp, "bUserByTwlOutUserId", false);
    }
    public abstract String keepTwlOutUserId_InScopeRelation_BUserByTwlOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select TWL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByTwlOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByTwlOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "TWL_OUT_USER_ID", "USER_ID", pp, "bUserByTwlOutUserId", true);
    }
    public abstract String keepTwlOutUserId_NotInScopeRelation_BUserByTwlOutUserId(BUserCQ sq);

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
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_Equal(String inventoryDiffOutFlg) {
        doSetInventoryDiffOutFlg_Equal(fRES(inventoryDiffOutFlg));
    }

    protected void doSetInventoryDiffOutFlg_Equal(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_EQ, inventoryDiffOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_NotEqual(String inventoryDiffOutFlg) {
        doSetInventoryDiffOutFlg_NotEqual(fRES(inventoryDiffOutFlg));
    }

    protected void doSetInventoryDiffOutFlg_NotEqual(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_NES, inventoryDiffOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_GreaterThan(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_GT, fRES(inventoryDiffOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_LessThan(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_LT, fRES(inventoryDiffOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_GreaterEqual(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_GE, fRES(inventoryDiffOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_LessEqual(String inventoryDiffOutFlg) {
        regInventoryDiffOutFlg(CK_LE, fRES(inventoryDiffOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlgList The collection of inventoryDiffOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_InScope(Collection<String> inventoryDiffOutFlgList) {
        doSetInventoryDiffOutFlg_InScope(inventoryDiffOutFlgList);
    }

    protected void doSetInventoryDiffOutFlg_InScope(Collection<String> inventoryDiffOutFlgList) {
        regINS(CK_INS, cTL(inventoryDiffOutFlgList), xgetCValueInventoryDiffOutFlg(), "INVENTORY_DIFF_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlgList The collection of inventoryDiffOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_NotInScope(Collection<String> inventoryDiffOutFlgList) {
        doSetInventoryDiffOutFlg_NotInScope(inventoryDiffOutFlgList);
    }

    protected void doSetInventoryDiffOutFlg_NotInScope(Collection<String> inventoryDiffOutFlgList) {
        regINS(CK_NINS, cTL(inventoryDiffOutFlgList), xgetCValueInventoryDiffOutFlg(), "INVENTORY_DIFF_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setInventoryDiffOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDiffOutFlg_LikeSearch(String inventoryDiffOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDiffOutFlg), xgetCValueInventoryDiffOutFlg(), "INVENTORY_DIFF_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDiffOutFlg_NotLikeSearch(String inventoryDiffOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDiffOutFlg), xgetCValueInventoryDiffOutFlg(), "INVENTORY_DIFF_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     * @param inventoryDiffOutFlg The value of inventoryDiffOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutFlg_PrefixSearch(String inventoryDiffOutFlg) {
        setInventoryDiffOutFlg_LikeSearch(inventoryDiffOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryDiffOutFlg_IsNull() { regInventoryDiffOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryDiffOutFlg_IsNullOrEmpty() { regInventoryDiffOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryDiffOutFlg_IsNotNull() { regInventoryDiffOutFlg(CK_ISNN, DOBJ); }

    protected void regInventoryDiffOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDiffOutFlg(), "INVENTORY_DIFF_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInventoryDiffOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_Equal(Long inventoryDiffOutUserId) {
        doSetInventoryDiffOutUserId_Equal(inventoryDiffOutUserId);
    }

    protected void doSetInventoryDiffOutUserId_Equal(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_EQ, inventoryDiffOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_NotEqual(Long inventoryDiffOutUserId) {
        doSetInventoryDiffOutUserId_NotEqual(inventoryDiffOutUserId);
    }

    protected void doSetInventoryDiffOutUserId_NotEqual(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_NES, inventoryDiffOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_GreaterThan(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_GT, inventoryDiffOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_LessThan(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_LT, inventoryDiffOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_GreaterEqual(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_GE, inventoryDiffOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserId The value of inventoryDiffOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_LessEqual(Long inventoryDiffOutUserId) {
        regInventoryDiffOutUserId(CK_LE, inventoryDiffOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of inventoryDiffOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryDiffOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryDiffOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryDiffOutUserId(), "INVENTORY_DIFF_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserIdList The collection of inventoryDiffOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_InScope(Collection<Long> inventoryDiffOutUserIdList) {
        doSetInventoryDiffOutUserId_InScope(inventoryDiffOutUserIdList);
    }

    protected void doSetInventoryDiffOutUserId_InScope(Collection<Long> inventoryDiffOutUserIdList) {
        regINS(CK_INS, cTL(inventoryDiffOutUserIdList), xgetCValueInventoryDiffOutUserId(), "INVENTORY_DIFF_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryDiffOutUserIdList The collection of inventoryDiffOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDiffOutUserId_NotInScope(Collection<Long> inventoryDiffOutUserIdList) {
        doSetInventoryDiffOutUserId_NotInScope(inventoryDiffOutUserIdList);
    }

    protected void doSetInventoryDiffOutUserId_NotInScope(Collection<Long> inventoryDiffOutUserIdList) {
        regINS(CK_NINS, cTL(inventoryDiffOutUserIdList), xgetCValueInventoryDiffOutUserId(), "INVENTORY_DIFF_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_DIFF_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryDiffOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByInventoryDiffOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_DIFF_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryDiffOutUserId", false);
    }
    public abstract String keepInventoryDiffOutUserId_InScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_DIFF_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryDiffOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByInventoryDiffOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_DIFF_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryDiffOutUserId", true);
    }
    public abstract String keepInventoryDiffOutUserId_NotInScopeRelation_BUserByInventoryDiffOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryDiffOutUserId_IsNull() { regInventoryDiffOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryDiffOutUserId_IsNotNull() { regInventoryDiffOutUserId(CK_ISNN, DOBJ); }

    protected void regInventoryDiffOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDiffOutUserId(), "INVENTORY_DIFF_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueInventoryDiffOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @param inventoryDiffOutDt The value of inventoryDiffOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutDt_Equal(java.sql.Timestamp inventoryDiffOutDt) {
        regInventoryDiffOutDt(CK_EQ,  inventoryDiffOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @param inventoryDiffOutDt The value of inventoryDiffOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutDt_GreaterThan(java.sql.Timestamp inventoryDiffOutDt) {
        regInventoryDiffOutDt(CK_GT,  inventoryDiffOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @param inventoryDiffOutDt The value of inventoryDiffOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutDt_LessThan(java.sql.Timestamp inventoryDiffOutDt) {
        regInventoryDiffOutDt(CK_LT,  inventoryDiffOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @param inventoryDiffOutDt The value of inventoryDiffOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutDt_GreaterEqual(java.sql.Timestamp inventoryDiffOutDt) {
        regInventoryDiffOutDt(CK_GE,  inventoryDiffOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * @param inventoryDiffOutDt The value of inventoryDiffOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryDiffOutDt_LessEqual(java.sql.Timestamp inventoryDiffOutDt) {
        regInventoryDiffOutDt(CK_LE, inventoryDiffOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setInventoryDiffOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInventoryDiffOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInventoryDiffOutDt(), "INVENTORY_DIFF_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inventoryDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of inventoryDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInventoryDiffOutDt_DateFromTo(Date fromDate, Date toDate) {
        setInventoryDiffOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryDiffOutDt_IsNull() { regInventoryDiffOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DIFF_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryDiffOutDt_IsNotNull() { regInventoryDiffOutDt(CK_ISNN, DOBJ); }

    protected void regInventoryDiffOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDiffOutDt(), "INVENTORY_DIFF_OUT_DT"); }
    protected abstract ConditionValue xgetCValueInventoryDiffOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_Equal(String inventoryRecordOutFlg) {
        doSetInventoryRecordOutFlg_Equal(fRES(inventoryRecordOutFlg));
    }

    protected void doSetInventoryRecordOutFlg_Equal(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_EQ, inventoryRecordOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_NotEqual(String inventoryRecordOutFlg) {
        doSetInventoryRecordOutFlg_NotEqual(fRES(inventoryRecordOutFlg));
    }

    protected void doSetInventoryRecordOutFlg_NotEqual(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_NES, inventoryRecordOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_GreaterThan(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_GT, fRES(inventoryRecordOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_LessThan(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_LT, fRES(inventoryRecordOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_GreaterEqual(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_GE, fRES(inventoryRecordOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_LessEqual(String inventoryRecordOutFlg) {
        regInventoryRecordOutFlg(CK_LE, fRES(inventoryRecordOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlgList The collection of inventoryRecordOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_InScope(Collection<String> inventoryRecordOutFlgList) {
        doSetInventoryRecordOutFlg_InScope(inventoryRecordOutFlgList);
    }

    protected void doSetInventoryRecordOutFlg_InScope(Collection<String> inventoryRecordOutFlgList) {
        regINS(CK_INS, cTL(inventoryRecordOutFlgList), xgetCValueInventoryRecordOutFlg(), "INVENTORY_RECORD_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlgList The collection of inventoryRecordOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_NotInScope(Collection<String> inventoryRecordOutFlgList) {
        doSetInventoryRecordOutFlg_NotInScope(inventoryRecordOutFlgList);
    }

    protected void doSetInventoryRecordOutFlg_NotInScope(Collection<String> inventoryRecordOutFlgList) {
        regINS(CK_NINS, cTL(inventoryRecordOutFlgList), xgetCValueInventoryRecordOutFlg(), "INVENTORY_RECORD_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setInventoryRecordOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryRecordOutFlg_LikeSearch(String inventoryRecordOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryRecordOutFlg), xgetCValueInventoryRecordOutFlg(), "INVENTORY_RECORD_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryRecordOutFlg_NotLikeSearch(String inventoryRecordOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryRecordOutFlg), xgetCValueInventoryRecordOutFlg(), "INVENTORY_RECORD_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordOutFlg The value of inventoryRecordOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutFlg_PrefixSearch(String inventoryRecordOutFlg) {
        setInventoryRecordOutFlg_LikeSearch(inventoryRecordOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordOutFlg_IsNull() { regInventoryRecordOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordOutFlg_IsNullOrEmpty() { regInventoryRecordOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordOutFlg_IsNotNull() { regInventoryRecordOutFlg(CK_ISNN, DOBJ); }

    protected void regInventoryRecordOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordOutFlg(), "INVENTORY_RECORD_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInventoryRecordOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_Equal(Long inventoryRecordOutUserId) {
        doSetInventoryRecordOutUserId_Equal(inventoryRecordOutUserId);
    }

    protected void doSetInventoryRecordOutUserId_Equal(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_EQ, inventoryRecordOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_NotEqual(Long inventoryRecordOutUserId) {
        doSetInventoryRecordOutUserId_NotEqual(inventoryRecordOutUserId);
    }

    protected void doSetInventoryRecordOutUserId_NotEqual(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_NES, inventoryRecordOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_GreaterThan(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_GT, inventoryRecordOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_LessThan(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_LT, inventoryRecordOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_GreaterEqual(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_GE, inventoryRecordOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserId The value of inventoryRecordOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_LessEqual(Long inventoryRecordOutUserId) {
        regInventoryRecordOutUserId(CK_LE, inventoryRecordOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of inventoryRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryRecordOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryRecordOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryRecordOutUserId(), "INVENTORY_RECORD_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserIdList The collection of inventoryRecordOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_InScope(Collection<Long> inventoryRecordOutUserIdList) {
        doSetInventoryRecordOutUserId_InScope(inventoryRecordOutUserIdList);
    }

    protected void doSetInventoryRecordOutUserId_InScope(Collection<Long> inventoryRecordOutUserIdList) {
        regINS(CK_INS, cTL(inventoryRecordOutUserIdList), xgetCValueInventoryRecordOutUserId(), "INVENTORY_RECORD_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordOutUserIdList The collection of inventoryRecordOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordOutUserId_NotInScope(Collection<Long> inventoryRecordOutUserIdList) {
        doSetInventoryRecordOutUserId_NotInScope(inventoryRecordOutUserIdList);
    }

    protected void doSetInventoryRecordOutUserId_NotInScope(Collection<Long> inventoryRecordOutUserIdList) {
        regINS(CK_NINS, cTL(inventoryRecordOutUserIdList), xgetCValueInventoryRecordOutUserId(), "INVENTORY_RECORD_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_RECORD_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryRecordOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByInventoryRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryRecordOutUserId", false);
    }
    public abstract String keepInventoryRecordOutUserId_InScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_RECORD_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryRecordOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByInventoryRecordOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_RECORD_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryRecordOutUserId", true);
    }
    public abstract String keepInventoryRecordOutUserId_NotInScopeRelation_BUserByInventoryRecordOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryRecordOutUserId_IsNull() { regInventoryRecordOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryRecordOutUserId_IsNotNull() { regInventoryRecordOutUserId(CK_ISNN, DOBJ); }

    protected void regInventoryRecordOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordOutUserId(), "INVENTORY_RECORD_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueInventoryRecordOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordOutDt The value of inventoryRecordOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutDt_Equal(java.sql.Timestamp inventoryRecordOutDt) {
        regInventoryRecordOutDt(CK_EQ,  inventoryRecordOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordOutDt The value of inventoryRecordOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutDt_GreaterThan(java.sql.Timestamp inventoryRecordOutDt) {
        regInventoryRecordOutDt(CK_GT,  inventoryRecordOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordOutDt The value of inventoryRecordOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutDt_LessThan(java.sql.Timestamp inventoryRecordOutDt) {
        regInventoryRecordOutDt(CK_LT,  inventoryRecordOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordOutDt The value of inventoryRecordOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutDt_GreaterEqual(java.sql.Timestamp inventoryRecordOutDt) {
        regInventoryRecordOutDt(CK_GE,  inventoryRecordOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordOutDt The value of inventoryRecordOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordOutDt_LessEqual(java.sql.Timestamp inventoryRecordOutDt) {
        regInventoryRecordOutDt(CK_LE, inventoryRecordOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setInventoryRecordOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInventoryRecordOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInventoryRecordOutDt(), "INVENTORY_RECORD_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inventoryRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of inventoryRecordOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInventoryRecordOutDt_DateFromTo(Date fromDate, Date toDate) {
        setInventoryRecordOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryRecordOutDt_IsNull() { regInventoryRecordOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryRecordOutDt_IsNotNull() { regInventoryRecordOutDt(CK_ISNN, DOBJ); }

    protected void regInventoryRecordOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordOutDt(), "INVENTORY_RECORD_OUT_DT"); }
    protected abstract ConditionValue xgetCValueInventoryRecordOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_Equal(String inventoryRecordLocOutFlg) {
        doSetInventoryRecordLocOutFlg_Equal(fRES(inventoryRecordLocOutFlg));
    }

    protected void doSetInventoryRecordLocOutFlg_Equal(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_EQ, inventoryRecordLocOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_NotEqual(String inventoryRecordLocOutFlg) {
        doSetInventoryRecordLocOutFlg_NotEqual(fRES(inventoryRecordLocOutFlg));
    }

    protected void doSetInventoryRecordLocOutFlg_NotEqual(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_NES, inventoryRecordLocOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_GreaterThan(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_GT, fRES(inventoryRecordLocOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_LessThan(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_LT, fRES(inventoryRecordLocOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_GreaterEqual(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_GE, fRES(inventoryRecordLocOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_LessEqual(String inventoryRecordLocOutFlg) {
        regInventoryRecordLocOutFlg(CK_LE, fRES(inventoryRecordLocOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlgList The collection of inventoryRecordLocOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_InScope(Collection<String> inventoryRecordLocOutFlgList) {
        doSetInventoryRecordLocOutFlg_InScope(inventoryRecordLocOutFlgList);
    }

    protected void doSetInventoryRecordLocOutFlg_InScope(Collection<String> inventoryRecordLocOutFlgList) {
        regINS(CK_INS, cTL(inventoryRecordLocOutFlgList), xgetCValueInventoryRecordLocOutFlg(), "INVENTORY_RECORD_LOC_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlgList The collection of inventoryRecordLocOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_NotInScope(Collection<String> inventoryRecordLocOutFlgList) {
        doSetInventoryRecordLocOutFlg_NotInScope(inventoryRecordLocOutFlgList);
    }

    protected void doSetInventoryRecordLocOutFlg_NotInScope(Collection<String> inventoryRecordLocOutFlgList) {
        regINS(CK_NINS, cTL(inventoryRecordLocOutFlgList), xgetCValueInventoryRecordLocOutFlg(), "INVENTORY_RECORD_LOC_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setInventoryRecordLocOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryRecordLocOutFlg_LikeSearch(String inventoryRecordLocOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryRecordLocOutFlg), xgetCValueInventoryRecordLocOutFlg(), "INVENTORY_RECORD_LOC_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryRecordLocOutFlg_NotLikeSearch(String inventoryRecordLocOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryRecordLocOutFlg), xgetCValueInventoryRecordLocOutFlg(), "INVENTORY_RECORD_LOC_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     * @param inventoryRecordLocOutFlg The value of inventoryRecordLocOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutFlg_PrefixSearch(String inventoryRecordLocOutFlg) {
        setInventoryRecordLocOutFlg_LikeSearch(inventoryRecordLocOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordLocOutFlg_IsNull() { regInventoryRecordLocOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordLocOutFlg_IsNullOrEmpty() { regInventoryRecordLocOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_FLG: {CHAR(1)}
     */
    public void setInventoryRecordLocOutFlg_IsNotNull() { regInventoryRecordLocOutFlg(CK_ISNN, DOBJ); }

    protected void regInventoryRecordLocOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordLocOutFlg(), "INVENTORY_RECORD_LOC_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueInventoryRecordLocOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_Equal(Long inventoryRecordLocOutUserId) {
        doSetInventoryRecordLocOutUserId_Equal(inventoryRecordLocOutUserId);
    }

    protected void doSetInventoryRecordLocOutUserId_Equal(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_EQ, inventoryRecordLocOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_NotEqual(Long inventoryRecordLocOutUserId) {
        doSetInventoryRecordLocOutUserId_NotEqual(inventoryRecordLocOutUserId);
    }

    protected void doSetInventoryRecordLocOutUserId_NotEqual(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_NES, inventoryRecordLocOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_GreaterThan(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_GT, inventoryRecordLocOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_LessThan(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_LT, inventoryRecordLocOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_GreaterEqual(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_GE, inventoryRecordLocOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserId The value of inventoryRecordLocOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_LessEqual(Long inventoryRecordLocOutUserId) {
        regInventoryRecordLocOutUserId(CK_LE, inventoryRecordLocOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of inventoryRecordLocOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryRecordLocOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryRecordLocOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryRecordLocOutUserId(), "INVENTORY_RECORD_LOC_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserIdList The collection of inventoryRecordLocOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_InScope(Collection<Long> inventoryRecordLocOutUserIdList) {
        doSetInventoryRecordLocOutUserId_InScope(inventoryRecordLocOutUserIdList);
    }

    protected void doSetInventoryRecordLocOutUserId_InScope(Collection<Long> inventoryRecordLocOutUserIdList) {
        regINS(CK_INS, cTL(inventoryRecordLocOutUserIdList), xgetCValueInventoryRecordLocOutUserId(), "INVENTORY_RECORD_LOC_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param inventoryRecordLocOutUserIdList The collection of inventoryRecordLocOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutUserId_NotInScope(Collection<Long> inventoryRecordLocOutUserIdList) {
        doSetInventoryRecordLocOutUserId_NotInScope(inventoryRecordLocOutUserIdList);
    }

    protected void doSetInventoryRecordLocOutUserId_NotInScope(Collection<Long> inventoryRecordLocOutUserIdList) {
        regINS(CK_NINS, cTL(inventoryRecordLocOutUserIdList), xgetCValueInventoryRecordLocOutUserId(), "INVENTORY_RECORD_LOC_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select INVENTORY_RECORD_LOC_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryRecordLocOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByInventoryRecordLocOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_RECORD_LOC_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryRecordLocOutUserId", false);
    }
    public abstract String keepInventoryRecordLocOutUserId_InScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select INVENTORY_RECORD_LOC_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByInventoryRecordLocOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByInventoryRecordLocOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "INVENTORY_RECORD_LOC_OUT_USER_ID", "USER_ID", pp, "bUserByInventoryRecordLocOutUserId", true);
    }
    public abstract String keepInventoryRecordLocOutUserId_NotInScopeRelation_BUserByInventoryRecordLocOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryRecordLocOutUserId_IsNull() { regInventoryRecordLocOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setInventoryRecordLocOutUserId_IsNotNull() { regInventoryRecordLocOutUserId(CK_ISNN, DOBJ); }

    protected void regInventoryRecordLocOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordLocOutUserId(), "INVENTORY_RECORD_LOC_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueInventoryRecordLocOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordLocOutDt The value of inventoryRecordLocOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutDt_Equal(java.sql.Timestamp inventoryRecordLocOutDt) {
        regInventoryRecordLocOutDt(CK_EQ,  inventoryRecordLocOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordLocOutDt The value of inventoryRecordLocOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutDt_GreaterThan(java.sql.Timestamp inventoryRecordLocOutDt) {
        regInventoryRecordLocOutDt(CK_GT,  inventoryRecordLocOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordLocOutDt The value of inventoryRecordLocOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutDt_LessThan(java.sql.Timestamp inventoryRecordLocOutDt) {
        regInventoryRecordLocOutDt(CK_LT,  inventoryRecordLocOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordLocOutDt The value of inventoryRecordLocOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutDt_GreaterEqual(java.sql.Timestamp inventoryRecordLocOutDt) {
        regInventoryRecordLocOutDt(CK_GE,  inventoryRecordLocOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * @param inventoryRecordLocOutDt The value of inventoryRecordLocOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryRecordLocOutDt_LessEqual(java.sql.Timestamp inventoryRecordLocOutDt) {
        regInventoryRecordLocOutDt(CK_LE, inventoryRecordLocOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setInventoryRecordLocOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryRecordLocOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of inventoryRecordLocOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInventoryRecordLocOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInventoryRecordLocOutDt(), "INVENTORY_RECORD_LOC_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of inventoryRecordLocOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of inventoryRecordLocOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInventoryRecordLocOutDt_DateFromTo(Date fromDate, Date toDate) {
        setInventoryRecordLocOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryRecordLocOutDt_IsNull() { regInventoryRecordLocOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_RECORD_LOC_OUT_DT: {DATETIME(19)}
     */
    public void setInventoryRecordLocOutDt_IsNotNull() { regInventoryRecordLocOutDt(CK_ISNN, DOBJ); }

    protected void regInventoryRecordLocOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryRecordLocOutDt(), "INVENTORY_RECORD_LOC_OUT_DT"); }
    protected abstract ConditionValue xgetCValueInventoryRecordLocOutDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_Equal(String stockDiffOutFlg) {
        doSetStockDiffOutFlg_Equal(fRES(stockDiffOutFlg));
    }

    protected void doSetStockDiffOutFlg_Equal(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_EQ, stockDiffOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_NotEqual(String stockDiffOutFlg) {
        doSetStockDiffOutFlg_NotEqual(fRES(stockDiffOutFlg));
    }

    protected void doSetStockDiffOutFlg_NotEqual(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_NES, stockDiffOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_GreaterThan(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_GT, fRES(stockDiffOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_LessThan(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_LT, fRES(stockDiffOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_GreaterEqual(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_GE, fRES(stockDiffOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_LessEqual(String stockDiffOutFlg) {
        regStockDiffOutFlg(CK_LE, fRES(stockDiffOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlgList The collection of stockDiffOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_InScope(Collection<String> stockDiffOutFlgList) {
        doSetStockDiffOutFlg_InScope(stockDiffOutFlgList);
    }

    protected void doSetStockDiffOutFlg_InScope(Collection<String> stockDiffOutFlgList) {
        regINS(CK_INS, cTL(stockDiffOutFlgList), xgetCValueStockDiffOutFlg(), "STOCK_DIFF_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlgList The collection of stockDiffOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_NotInScope(Collection<String> stockDiffOutFlgList) {
        doSetStockDiffOutFlg_NotInScope(stockDiffOutFlgList);
    }

    protected void doSetStockDiffOutFlg_NotInScope(Collection<String> stockDiffOutFlgList) {
        regINS(CK_NINS, cTL(stockDiffOutFlgList), xgetCValueStockDiffOutFlg(), "STOCK_DIFF_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setStockDiffOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockDiffOutFlg The value of stockDiffOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockDiffOutFlg_LikeSearch(String stockDiffOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockDiffOutFlg), xgetCValueStockDiffOutFlg(), "STOCK_DIFF_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockDiffOutFlg_NotLikeSearch(String stockDiffOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockDiffOutFlg), xgetCValueStockDiffOutFlg(), "STOCK_DIFF_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     * @param stockDiffOutFlg The value of stockDiffOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutFlg_PrefixSearch(String stockDiffOutFlg) {
        setStockDiffOutFlg_LikeSearch(stockDiffOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setStockDiffOutFlg_IsNull() { regStockDiffOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setStockDiffOutFlg_IsNullOrEmpty() { regStockDiffOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_FLG: {CHAR(1)}
     */
    public void setStockDiffOutFlg_IsNotNull() { regStockDiffOutFlg(CK_ISNN, DOBJ); }

    protected void regStockDiffOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockDiffOutFlg(), "STOCK_DIFF_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueStockDiffOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_Equal(Long stockDiffOutUserId) {
        doSetStockDiffOutUserId_Equal(stockDiffOutUserId);
    }

    protected void doSetStockDiffOutUserId_Equal(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_EQ, stockDiffOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_NotEqual(Long stockDiffOutUserId) {
        doSetStockDiffOutUserId_NotEqual(stockDiffOutUserId);
    }

    protected void doSetStockDiffOutUserId_NotEqual(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_NES, stockDiffOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_GreaterThan(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_GT, stockDiffOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_LessThan(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_LT, stockDiffOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_GreaterEqual(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_GE, stockDiffOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserId The value of stockDiffOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_LessEqual(Long stockDiffOutUserId) {
        regStockDiffOutUserId(CK_LE, stockDiffOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of stockDiffOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockDiffOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockDiffOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockDiffOutUserId(), "STOCK_DIFF_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserIdList The collection of stockDiffOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_InScope(Collection<Long> stockDiffOutUserIdList) {
        doSetStockDiffOutUserId_InScope(stockDiffOutUserIdList);
    }

    protected void doSetStockDiffOutUserId_InScope(Collection<Long> stockDiffOutUserIdList) {
        regINS(CK_INS, cTL(stockDiffOutUserIdList), xgetCValueStockDiffOutUserId(), "STOCK_DIFF_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param stockDiffOutUserIdList The collection of stockDiffOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockDiffOutUserId_NotInScope(Collection<Long> stockDiffOutUserIdList) {
        doSetStockDiffOutUserId_NotInScope(stockDiffOutUserIdList);
    }

    protected void doSetStockDiffOutUserId_NotInScope(Collection<Long> stockDiffOutUserIdList) {
        regINS(CK_NINS, cTL(stockDiffOutUserIdList), xgetCValueStockDiffOutUserId(), "STOCK_DIFF_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_DIFF_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByStockDiffOutUserId for 'in-scope'. (NotNull)
     */
    public void inScopeBUserByStockDiffOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_DIFF_OUT_USER_ID", "USER_ID", pp, "bUserByStockDiffOutUserId", false);
    }
    public abstract String keepStockDiffOutUserId_InScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_DIFF_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @param subCBLambda The callback for sub-query of BUserByStockDiffOutUserId for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUserByStockDiffOutUserId(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_DIFF_OUT_USER_ID", "USER_ID", pp, "bUserByStockDiffOutUserId", true);
    }
    public abstract String keepStockDiffOutUserId_NotInScopeRelation_BUserByStockDiffOutUserId(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setStockDiffOutUserId_IsNull() { regStockDiffOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setStockDiffOutUserId_IsNotNull() { regStockDiffOutUserId(CK_ISNN, DOBJ); }

    protected void regStockDiffOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockDiffOutUserId(), "STOCK_DIFF_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueStockDiffOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @param stockDiffOutDt The value of stockDiffOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutDt_Equal(java.sql.Timestamp stockDiffOutDt) {
        regStockDiffOutDt(CK_EQ,  stockDiffOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @param stockDiffOutDt The value of stockDiffOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutDt_GreaterThan(java.sql.Timestamp stockDiffOutDt) {
        regStockDiffOutDt(CK_GT,  stockDiffOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @param stockDiffOutDt The value of stockDiffOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutDt_LessThan(java.sql.Timestamp stockDiffOutDt) {
        regStockDiffOutDt(CK_LT,  stockDiffOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @param stockDiffOutDt The value of stockDiffOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutDt_GreaterEqual(java.sql.Timestamp stockDiffOutDt) {
        regStockDiffOutDt(CK_GE,  stockDiffOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * @param stockDiffOutDt The value of stockDiffOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockDiffOutDt_LessEqual(java.sql.Timestamp stockDiffOutDt) {
        regStockDiffOutDt(CK_LE, stockDiffOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setStockDiffOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of stockDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of stockDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setStockDiffOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueStockDiffOutDt(), "STOCK_DIFF_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of stockDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of stockDiffOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setStockDiffOutDt_DateFromTo(Date fromDate, Date toDate) {
        setStockDiffOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     */
    public void setStockDiffOutDt_IsNull() { regStockDiffOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_DIFF_OUT_DT: {DATETIME(19)}
     */
    public void setStockDiffOutDt_IsNotNull() { regStockDiffOutDt(CK_ISNN, DOBJ); }

    protected void regStockDiffOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockDiffOutDt(), "STOCK_DIFF_OUT_DT"); }
    protected abstract ConditionValue xgetCValueStockDiffOutDt();

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
    public HpSLCFunction<TInventoryRCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TInventoryRCB.class);
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
    public HpSLCFunction<TInventoryRCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TInventoryRCB.class);
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
    public HpSLCFunction<TInventoryRCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TInventoryRCB.class);
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
    public HpSLCFunction<TInventoryRCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TInventoryRCB.class);
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
    public HpSLCFunction<TInventoryRCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TInventoryRCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TInventoryRCB&gt;() {
     *     public void query(TInventoryRCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TInventoryRCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TInventoryRCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TInventoryRCQ sq);

    protected TInventoryRCB xcreateScalarConditionCB() {
        TInventoryRCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TInventoryRCB xcreateScalarConditionPartitionByCB() {
        TInventoryRCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TInventoryRCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TInventoryRCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TInventoryRCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TInventoryRCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TInventoryRCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TInventoryRCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryRCB cb = new TInventoryRCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TInventoryRCQ sq);

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
    protected TInventoryRCB newMyCB() {
        return new TInventoryRCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TInventoryRCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
