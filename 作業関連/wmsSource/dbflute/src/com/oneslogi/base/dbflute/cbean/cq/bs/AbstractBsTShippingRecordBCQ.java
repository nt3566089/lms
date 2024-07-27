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
 * The abstract condition-query of t_shipping_record_b.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingRecordBCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingRecordBCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_record_b";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_Equal(Long shippingRecordBId) {
        doSetShippingRecordBId_Equal(shippingRecordBId);
    }

    protected void doSetShippingRecordBId_Equal(Long shippingRecordBId) {
        regShippingRecordBId(CK_EQ, shippingRecordBId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_NotEqual(Long shippingRecordBId) {
        doSetShippingRecordBId_NotEqual(shippingRecordBId);
    }

    protected void doSetShippingRecordBId_NotEqual(Long shippingRecordBId) {
        regShippingRecordBId(CK_NES, shippingRecordBId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_GreaterThan(Long shippingRecordBId) {
        regShippingRecordBId(CK_GT, shippingRecordBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_LessThan(Long shippingRecordBId) {
        regShippingRecordBId(CK_LT, shippingRecordBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_GreaterEqual(Long shippingRecordBId) {
        regShippingRecordBId(CK_GE, shippingRecordBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBId The value of shippingRecordBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordBId_LessEqual(Long shippingRecordBId) {
        regShippingRecordBId(CK_LE, shippingRecordBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordBId(), "SHIPPING_RECORD_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBIdList The collection of shippingRecordBId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordBId_InScope(Collection<Long> shippingRecordBIdList) {
        doSetShippingRecordBId_InScope(shippingRecordBIdList);
    }

    protected void doSetShippingRecordBId_InScope(Collection<Long> shippingRecordBIdList) {
        regINS(CK_INS, cTL(shippingRecordBIdList), xgetCValueShippingRecordBId(), "SHIPPING_RECORD_B_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordBIdList The collection of shippingRecordBId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordBId_NotInScope(Collection<Long> shippingRecordBIdList) {
        doSetShippingRecordBId_NotInScope(shippingRecordBIdList);
    }

    protected void doSetShippingRecordBId_NotInScope(Collection<Long> shippingRecordBIdList) {
        regINS(CK_NINS, cTL(shippingRecordBIdList), xgetCValueShippingRecordBId(), "SHIPPING_RECORD_B_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingRecordBId_IsNull() { regShippingRecordBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingRecordBId_IsNotNull() { regShippingRecordBId(CK_ISNN, DOBJ); }

    protected void regShippingRecordBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordBId(), "SHIPPING_RECORD_B_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_Equal(Long shippingRecordHId) {
        doSetShippingRecordHId_Equal(shippingRecordHId);
    }

    protected void doSetShippingRecordHId_Equal(Long shippingRecordHId) {
        regShippingRecordHId(CK_EQ, shippingRecordHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_NotEqual(Long shippingRecordHId) {
        doSetShippingRecordHId_NotEqual(shippingRecordHId);
    }

    protected void doSetShippingRecordHId_NotEqual(Long shippingRecordHId) {
        regShippingRecordHId(CK_NES, shippingRecordHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_GreaterThan(Long shippingRecordHId) {
        regShippingRecordHId(CK_GT, shippingRecordHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_LessThan(Long shippingRecordHId) {
        regShippingRecordHId(CK_LT, shippingRecordHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_GreaterEqual(Long shippingRecordHId) {
        regShippingRecordHId(CK_GE, shippingRecordHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHId The value of shippingRecordHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_LessEqual(Long shippingRecordHId) {
        regShippingRecordHId(CK_LE, shippingRecordHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param minNumber The min number of shippingRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHIdList The collection of shippingRecordHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordHId_InScope(Collection<Long> shippingRecordHIdList) {
        doSetShippingRecordHId_InScope(shippingRecordHIdList);
    }

    protected void doSetShippingRecordHId_InScope(Collection<Long> shippingRecordHIdList) {
        regINS(CK_INS, cTL(shippingRecordHIdList), xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     * @param shippingRecordHIdList The collection of shippingRecordHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordHId_NotInScope(Collection<Long> shippingRecordHIdList) {
        doSetShippingRecordHId_NotInScope(shippingRecordHIdList);
    }

    protected void doSetShippingRecordHId_NotInScope(Collection<Long> shippingRecordHIdList) {
        regINS(CK_NINS, cTL(shippingRecordHIdList), xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select SHIPPING_RECORD_H_ID from t_shipping_record_h where ...)} <br />
     * t_shipping_record_h by my SHIPPING_RECORD_H_ID, named 'TShippingRecordH'.
     * @param subCBLambda The callback for sub-query of TShippingRecordH for 'in-scope'. (NotNull)
     */
    public void inScopeTShippingRecordH(SubQuery<TShippingRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordHCB cb = new TShippingRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordHId_InScopeRelation_TShippingRecordH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", pp, "tShippingRecordH", false);
    }
    public abstract String keepShippingRecordHId_InScopeRelation_TShippingRecordH(TShippingRecordHCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select SHIPPING_RECORD_H_ID from t_shipping_record_h where ...)} <br />
     * t_shipping_record_h by my SHIPPING_RECORD_H_ID, named 'TShippingRecordH'.
     * @param subCBLambda The callback for sub-query of TShippingRecordH for 'not in-scope'. (NotNull)
     */
    public void notInScopeTShippingRecordH(SubQuery<TShippingRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordHCB cb = new TShippingRecordHCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepShippingRecordHId_NotInScopeRelation_TShippingRecordH(cb.query());
        registerInScopeRelation(cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", pp, "tShippingRecordH", true);
    }
    public abstract String keepShippingRecordHId_NotInScopeRelation_TShippingRecordH(TShippingRecordHCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     */
    public void setShippingRecordHId_IsNull() { regShippingRecordHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h}
     */
    public void setShippingRecordHId_IsNotNull() { regShippingRecordHId(CK_ISNN, DOBJ); }

    protected void regShippingRecordHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordHId();

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
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_Equal(String productCd) {
        doSetProductCd_Equal(fRES(productCd));
    }

    protected void doSetProductCd_Equal(String productCd) {
        regProductCd(CK_EQ, productCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotEqual(String productCd) {
        doSetProductCd_NotEqual(fRES(productCd));
    }

    protected void doSetProductCd_NotEqual(String productCd) {
        regProductCd(CK_NES, productCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCdList The collection of productCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_InScope(Collection<String> productCdList) {
        doSetProductCd_InScope(productCdList);
    }

    protected void doSetProductCd_InScope(Collection<String> productCdList) {
        regINS(CK_INS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCdList The collection of productCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_NotInScope(Collection<String> productCdList) {
        doSetProductCd_NotInScope(productCdList);
    }

    protected void doSetProductCd_NotInScope(Collection<String> productCdList) {
        regINS(CK_NINS, cTL(productCdList), xgetCValueProductCd(), "PRODUCT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setProductCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productCd The value of productCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductCd_LikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {NotNull, VARCHAR(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterThan(java.math.BigDecimal num) {
        regNum(CK_GT, num);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessThan(java.math.BigDecimal num) {
        regNum(CK_LT, num);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterEqual(java.math.BigDecimal num) {
        regNum(CK_GE, num);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessEqual(java.math.BigDecimal num) {
        regNum(CK_LE, num);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum(), "NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
     * @param numList The collection of num as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_NotInScope(Collection<java.math.BigDecimal> numList) {
        doSetNum_NotInScope(numList);
    }

    protected void doSetNum_NotInScope(Collection<java.math.BigDecimal> numList) {
        regINS(CK_NINS, cTL(numList), xgetCValueNum(), "NUM");
    }

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_Equal(Long confirmedPackingNum) {
        doSetConfirmedPackingNum_Equal(confirmedPackingNum);
    }

    protected void doSetConfirmedPackingNum_Equal(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_EQ, confirmedPackingNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_NotEqual(Long confirmedPackingNum) {
        doSetConfirmedPackingNum_NotEqual(confirmedPackingNum);
    }

    protected void doSetConfirmedPackingNum_NotEqual(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_NES, confirmedPackingNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_GreaterThan(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_GT, confirmedPackingNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_LessThan(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_LT, confirmedPackingNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_GreaterEqual(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_GE, confirmedPackingNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNum The value of confirmedPackingNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_LessEqual(Long confirmedPackingNum) {
        regConfirmedPackingNum(CK_LE, confirmedPackingNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param minNumber The min number of confirmedPackingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of confirmedPackingNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setConfirmedPackingNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueConfirmedPackingNum(), "CONFIRMED_PACKING_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNumList The collection of confirmedPackingNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_InScope(Collection<Long> confirmedPackingNumList) {
        doSetConfirmedPackingNum_InScope(confirmedPackingNumList);
    }

    protected void doSetConfirmedPackingNum_InScope(Collection<Long> confirmedPackingNumList) {
        regINS(CK_INS, cTL(confirmedPackingNumList), xgetCValueConfirmedPackingNum(), "CONFIRMED_PACKING_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)}
     * @param confirmedPackingNumList The collection of confirmedPackingNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setConfirmedPackingNum_NotInScope(Collection<Long> confirmedPackingNumList) {
        doSetConfirmedPackingNum_NotInScope(confirmedPackingNumList);
    }

    protected void doSetConfirmedPackingNum_NotInScope(Collection<Long> confirmedPackingNumList) {
        regINS(CK_NINS, cTL(confirmedPackingNumList), xgetCValueConfirmedPackingNum(), "CONFIRMED_PACKING_NUM");
    }

    protected void regConfirmedPackingNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueConfirmedPackingNum(), "CONFIRMED_PACKING_NUM"); }
    protected abstract ConditionValue xgetCValueConfirmedPackingNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_Equal(String srSendFlg) {
        doSetSrSendFlg_Equal(fRES(srSendFlg));
    }

    protected void doSetSrSendFlg_Equal(String srSendFlg) {
        regSrSendFlg(CK_EQ, srSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_NotEqual(String srSendFlg) {
        doSetSrSendFlg_NotEqual(fRES(srSendFlg));
    }

    protected void doSetSrSendFlg_NotEqual(String srSendFlg) {
        regSrSendFlg(CK_NES, srSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_GreaterThan(String srSendFlg) {
        regSrSendFlg(CK_GT, fRES(srSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_LessThan(String srSendFlg) {
        regSrSendFlg(CK_LT, fRES(srSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_GreaterEqual(String srSendFlg) {
        regSrSendFlg(CK_GE, fRES(srSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_LessEqual(String srSendFlg) {
        regSrSendFlg(CK_LE, fRES(srSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlgList The collection of srSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_InScope(Collection<String> srSendFlgList) {
        doSetSrSendFlg_InScope(srSendFlgList);
    }

    protected void doSetSrSendFlg_InScope(Collection<String> srSendFlgList) {
        regINS(CK_INS, cTL(srSendFlgList), xgetCValueSrSendFlg(), "SR_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlgList The collection of srSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_NotInScope(Collection<String> srSendFlgList) {
        doSetSrSendFlg_NotInScope(srSendFlgList);
    }

    protected void doSetSrSendFlg_NotInScope(Collection<String> srSendFlgList) {
        regINS(CK_NINS, cTL(srSendFlgList), xgetCValueSrSendFlg(), "SR_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setSrSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param srSendFlg The value of srSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSrSendFlg_LikeSearch(String srSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(srSendFlg), xgetCValueSrSendFlg(), "SR_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSrSendFlg_NotLikeSearch(String srSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(srSendFlg), xgetCValueSrSendFlg(), "SR_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     * @param srSendFlg The value of srSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSrSendFlg_PrefixSearch(String srSendFlg) {
        setSrSendFlg_LikeSearch(srSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setSrSendFlg_IsNull() { regSrSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setSrSendFlg_IsNullOrEmpty() { regSrSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SR_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setSrSendFlg_IsNotNull() { regSrSendFlg(CK_ISNN, DOBJ); }

    protected void regSrSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSrSendFlg(), "SR_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueSrSendFlg();

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
    public HpSLCFunction<TShippingRecordBCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingRecordBCB.class);
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
    public HpSLCFunction<TShippingRecordBCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingRecordBCB.class);
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
    public HpSLCFunction<TShippingRecordBCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingRecordBCB.class);
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
    public HpSLCFunction<TShippingRecordBCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingRecordBCB.class);
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
    public HpSLCFunction<TShippingRecordBCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingRecordBCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingRecordBCB&gt;() {
     *     public void query(TShippingRecordBCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingRecordBCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingRecordBCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordBCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingRecordBCQ sq);

    protected TShippingRecordBCB xcreateScalarConditionCB() {
        TShippingRecordBCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingRecordBCB xcreateScalarConditionPartitionByCB() {
        TShippingRecordBCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_RECORD_B_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingRecordBCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingRecordBCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingRecordBCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_RECORD_B_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingRecordBCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingRecordBCQ sq);

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
    protected TShippingRecordBCB newMyCB() {
        return new TShippingRecordBCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingRecordBCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
