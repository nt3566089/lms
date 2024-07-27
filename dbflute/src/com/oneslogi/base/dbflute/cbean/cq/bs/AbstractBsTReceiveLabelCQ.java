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
 * The abstract condition-query of t_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTReceiveLabelCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTReceiveLabelCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_receive_label";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_Equal(Long receiveLabelId) {
        doSetReceiveLabelId_Equal(receiveLabelId);
    }

    protected void doSetReceiveLabelId_Equal(Long receiveLabelId) {
        regReceiveLabelId(CK_EQ, receiveLabelId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_NotEqual(Long receiveLabelId) {
        doSetReceiveLabelId_NotEqual(receiveLabelId);
    }

    protected void doSetReceiveLabelId_NotEqual(Long receiveLabelId) {
        regReceiveLabelId(CK_NES, receiveLabelId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_GreaterThan(Long receiveLabelId) {
        regReceiveLabelId(CK_GT, receiveLabelId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_LessThan(Long receiveLabelId) {
        regReceiveLabelId(CK_LT, receiveLabelId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_GreaterEqual(Long receiveLabelId) {
        regReceiveLabelId(CK_GE, receiveLabelId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelId The value of receiveLabelId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveLabelId_LessEqual(Long receiveLabelId) {
        regReceiveLabelId(CK_LE, receiveLabelId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of receiveLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveLabelId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveLabelId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveLabelId(), "RECEIVE_LABEL_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelIdList The collection of receiveLabelId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelId_InScope(Collection<Long> receiveLabelIdList) {
        doSetReceiveLabelId_InScope(receiveLabelIdList);
    }

    protected void doSetReceiveLabelId_InScope(Collection<Long> receiveLabelIdList) {
        regINS(CK_INS, cTL(receiveLabelIdList), xgetCValueReceiveLabelId(), "RECEIVE_LABEL_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param receiveLabelIdList The collection of receiveLabelId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelId_NotInScope(Collection<Long> receiveLabelIdList) {
        doSetReceiveLabelId_NotInScope(receiveLabelIdList);
    }

    protected void doSetReceiveLabelId_NotInScope(Collection<Long> receiveLabelIdList) {
        regINS(CK_NINS, cTL(receiveLabelIdList), xgetCValueReceiveLabelId(), "RECEIVE_LABEL_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceiveLabelId_IsNull() { regReceiveLabelId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setReceiveLabelId_IsNotNull() { regReceiveLabelId(CK_ISNN, DOBJ); }

    protected void regReceiveLabelId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLabelId(), "RECEIVE_LABEL_ID"); }
    protected abstract ConditionValue xgetCValueReceiveLabelId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_Equal(Long stockId) {
        doSetStockId_Equal(stockId);
    }

    protected void doSetStockId_Equal(Long stockId) {
        regStockId(CK_EQ, stockId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_NotEqual(Long stockId) {
        doSetStockId_NotEqual(stockId);
    }

    protected void doSetStockId_NotEqual(Long stockId) {
        regStockId(CK_NES, stockId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterThan(Long stockId) {
        regStockId(CK_GT, stockId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessThan(Long stockId) {
        regStockId(CK_LT, stockId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_GreaterEqual(Long stockId) {
        regStockId(CK_GE, stockId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockId The value of stockId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setStockId_LessEqual(Long stockId) {
        regStockId(CK_LE, stockId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param minNumber The min number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of stockId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setStockId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueStockId(), "STOCK_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_InScope(Collection<Long> stockIdList) {
        doSetStockId_InScope(stockIdList);
    }

    protected void doSetStockId_InScope(Collection<Long> stockIdList) {
        regINS(CK_INS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock}
     * @param stockIdList The collection of stockId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockId_NotInScope(Collection<Long> stockIdList) {
        doSetStockId_NotInScope(stockIdList);
    }

    protected void doSetStockId_NotInScope(Collection<Long> stockIdList) {
        regINS(CK_NINS, cTL(stockIdList), xgetCValueStockId(), "STOCK_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'in-scope'. (NotNull)
     */
    public void inScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_InScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", false);
    }
    public abstract String keepStockId_InScopeRelation_TStock(TStockCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select STOCK_ID from t_stock where ...)} <br />
     * t_stock by my STOCK_ID, named 'TStock'.
     * @param subCBLambda The callback for sub-query of TStock for 'not in-scope'. (NotNull)
     */
    public void notInScopeTStock(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepStockId_NotInScopeRelation_TStock(cb.query());
        registerInScopeRelation(cb.query(), "STOCK_ID", "STOCK_ID", pp, "tStock", true);
    }
    public abstract String keepStockId_NotInScopeRelation_TStock(TStockCQ sq);

    protected void regStockId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockId(), "STOCK_ID"); }
    protected abstract ConditionValue xgetCValueStockId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_Equal(String receiveLabelNo) {
        doSetReceiveLabelNo_Equal(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_Equal(String receiveLabelNo) {
        regReceiveLabelNo(CK_EQ, receiveLabelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotEqual(String receiveLabelNo) {
        doSetReceiveLabelNo_NotEqual(fRES(receiveLabelNo));
    }

    protected void doSetReceiveLabelNo_NotEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_NES, receiveLabelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_GT, fRES(receiveLabelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessThan(String receiveLabelNo) {
        regReceiveLabelNo(CK_LT, fRES(receiveLabelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_GreaterEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_GE, fRES(receiveLabelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_LessEqual(String receiveLabelNo) {
        regReceiveLabelNo(CK_LE, fRES(receiveLabelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNoList The collection of receiveLabelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_InScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_InScope(Collection<String> receiveLabelNoList) {
        regINS(CK_INS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNoList The collection of receiveLabelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        doSetReceiveLabelNo_NotInScope(receiveLabelNoList);
    }

    protected void doSetReceiveLabelNo_NotInScope(Collection<String> receiveLabelNoList) {
        regINS(CK_NINS, cTL(receiveLabelNoList), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)} <br>
     * <pre>e.g. setReceiveLabelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveLabelNo The value of receiveLabelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveLabelNo_LikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveLabelNo_NotLikeSearch(String receiveLabelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveLabelNo), xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     * @param receiveLabelNo The value of receiveLabelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveLabelNo_PrefixSearch(String receiveLabelNo) {
        setReceiveLabelNo_LikeSearch(receiveLabelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     */
    public void setReceiveLabelNo_IsNull() { regReceiveLabelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     */
    public void setReceiveLabelNo_IsNullOrEmpty() { regReceiveLabelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_LABEL_NO: {IX, VARCHAR(255)}
     */
    public void setReceiveLabelNo_IsNotNull() { regReceiveLabelNo(CK_ISNN, DOBJ); }

    protected void regReceiveLabelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveLabelNo(), "RECEIVE_LABEL_NO"); }
    protected abstract ConditionValue xgetCValueReceiveLabelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterThan(java.math.BigDecimal num) {
        regNum(CK_GT, num);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessThan(java.math.BigDecimal num) {
        regNum(CK_LT, num);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterEqual(java.math.BigDecimal num) {
        regNum(CK_GE, num);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param num The value of num as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessEqual(java.math.BigDecimal num) {
        regNum(CK_LE, num);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     * @param minNumber The min number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum(), "NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
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
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum_IsNull() { regNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM: {DECIMAL(14, 4), default=[0.0000]}
     */
    public void setNum_IsNotNull() { regNum(CK_ISNN, DOBJ); }

    protected void regNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum(), "NUM"); }
    protected abstract ConditionValue xgetCValueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_Equal(String ownerCd) {
        doSetOwnerCd_Equal(fRES(ownerCd));
    }

    protected void doSetOwnerCd_Equal(String ownerCd) {
        regOwnerCd(CK_EQ, ownerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotEqual(String ownerCd) {
        doSetOwnerCd_NotEqual(fRES(ownerCd));
    }

    protected void doSetOwnerCd_NotEqual(String ownerCd) {
        regOwnerCd(CK_NES, ownerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterThan(String ownerCd) {
        regOwnerCd(CK_GT, fRES(ownerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessThan(String ownerCd) {
        regOwnerCd(CK_LT, fRES(ownerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_GreaterEqual(String ownerCd) {
        regOwnerCd(CK_GE, fRES(ownerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_LessEqual(String ownerCd) {
        regOwnerCd(CK_LE, fRES(ownerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCdList The collection of ownerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_InScope(Collection<String> ownerCdList) {
        doSetOwnerCd_InScope(ownerCdList);
    }

    protected void doSetOwnerCd_InScope(Collection<String> ownerCdList) {
        regINS(CK_INS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCdList The collection of ownerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_NotInScope(Collection<String> ownerCdList) {
        doSetOwnerCd_NotInScope(ownerCdList);
    }

    protected void doSetOwnerCd_NotInScope(Collection<String> ownerCdList) {
        regINS(CK_NINS, cTL(ownerCdList), xgetCValueOwnerCd(), "OWNER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setOwnerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerCd The value of ownerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerCd_LikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerCd_NotLikeSearch(String ownerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerCd), xgetCValueOwnerCd(), "OWNER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     * @param ownerCd The value of ownerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerCd_PrefixSearch(String ownerCd) {
        setOwnerCd_LikeSearch(ownerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNull() { regOwnerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNullOrEmpty() { regOwnerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNER_CD: {VARCHAR(30)}
     */
    public void setOwnerCd_IsNotNull() { regOwnerCd(CK_ISNN, DOBJ); }

    protected void regOwnerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerCd(), "OWNER_CD"); }
    protected abstract ConditionValue xgetCValueOwnerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_Equal(String ownerAbbr) {
        doSetOwnerAbbr_Equal(fRES(ownerAbbr));
    }

    protected void doSetOwnerAbbr_Equal(String ownerAbbr) {
        regOwnerAbbr(CK_EQ, ownerAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_NotEqual(String ownerAbbr) {
        doSetOwnerAbbr_NotEqual(fRES(ownerAbbr));
    }

    protected void doSetOwnerAbbr_NotEqual(String ownerAbbr) {
        regOwnerAbbr(CK_NES, ownerAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_GreaterThan(String ownerAbbr) {
        regOwnerAbbr(CK_GT, fRES(ownerAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_LessThan(String ownerAbbr) {
        regOwnerAbbr(CK_LT, fRES(ownerAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_GreaterEqual(String ownerAbbr) {
        regOwnerAbbr(CK_GE, fRES(ownerAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_LessEqual(String ownerAbbr) {
        regOwnerAbbr(CK_LE, fRES(ownerAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbrList The collection of ownerAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_InScope(Collection<String> ownerAbbrList) {
        doSetOwnerAbbr_InScope(ownerAbbrList);
    }

    protected void doSetOwnerAbbr_InScope(Collection<String> ownerAbbrList) {
        regINS(CK_INS, cTL(ownerAbbrList), xgetCValueOwnerAbbr(), "OWNER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbrList The collection of ownerAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_NotInScope(Collection<String> ownerAbbrList) {
        doSetOwnerAbbr_NotInScope(ownerAbbrList);
    }

    protected void doSetOwnerAbbr_NotInScope(Collection<String> ownerAbbrList) {
        regINS(CK_NINS, cTL(ownerAbbrList), xgetCValueOwnerAbbr(), "OWNER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setOwnerAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param ownerAbbr The value of ownerAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setOwnerAbbr_LikeSearch(String ownerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(ownerAbbr), xgetCValueOwnerAbbr(), "OWNER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setOwnerAbbr_NotLikeSearch(String ownerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(ownerAbbr), xgetCValueOwnerAbbr(), "OWNER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     * @param ownerAbbr The value of ownerAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOwnerAbbr_PrefixSearch(String ownerAbbr) {
        setOwnerAbbr_LikeSearch(ownerAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     */
    public void setOwnerAbbr_IsNull() { regOwnerAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     */
    public void setOwnerAbbr_IsNullOrEmpty() { regOwnerAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * OWNER_ABBR: {VARCHAR(60)}
     */
    public void setOwnerAbbr_IsNotNull() { regOwnerAbbr(CK_ISNN, DOBJ); }

    protected void regOwnerAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOwnerAbbr(), "OWNER_ABBR"); }
    protected abstract ConditionValue xgetCValueOwnerAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_Equal(String recommendLocationCd) {
        doSetRecommendLocationCd_Equal(fRES(recommendLocationCd));
    }

    protected void doSetRecommendLocationCd_Equal(String recommendLocationCd) {
        regRecommendLocationCd(CK_EQ, recommendLocationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_NotEqual(String recommendLocationCd) {
        doSetRecommendLocationCd_NotEqual(fRES(recommendLocationCd));
    }

    protected void doSetRecommendLocationCd_NotEqual(String recommendLocationCd) {
        regRecommendLocationCd(CK_NES, recommendLocationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_GreaterThan(String recommendLocationCd) {
        regRecommendLocationCd(CK_GT, fRES(recommendLocationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_LessThan(String recommendLocationCd) {
        regRecommendLocationCd(CK_LT, fRES(recommendLocationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_GreaterEqual(String recommendLocationCd) {
        regRecommendLocationCd(CK_GE, fRES(recommendLocationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_LessEqual(String recommendLocationCd) {
        regRecommendLocationCd(CK_LE, fRES(recommendLocationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCdList The collection of recommendLocationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_InScope(Collection<String> recommendLocationCdList) {
        doSetRecommendLocationCd_InScope(recommendLocationCdList);
    }

    protected void doSetRecommendLocationCd_InScope(Collection<String> recommendLocationCdList) {
        regINS(CK_INS, cTL(recommendLocationCdList), xgetCValueRecommendLocationCd(), "RECOMMEND_LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCdList The collection of recommendLocationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_NotInScope(Collection<String> recommendLocationCdList) {
        doSetRecommendLocationCd_NotInScope(recommendLocationCdList);
    }

    protected void doSetRecommendLocationCd_NotInScope(Collection<String> recommendLocationCdList) {
        regINS(CK_NINS, cTL(recommendLocationCdList), xgetCValueRecommendLocationCd(), "RECOMMEND_LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setRecommendLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param recommendLocationCd The value of recommendLocationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setRecommendLocationCd_LikeSearch(String recommendLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(recommendLocationCd), xgetCValueRecommendLocationCd(), "RECOMMEND_LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setRecommendLocationCd_NotLikeSearch(String recommendLocationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(recommendLocationCd), xgetCValueRecommendLocationCd(), "RECOMMEND_LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     * @param recommendLocationCd The value of recommendLocationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRecommendLocationCd_PrefixSearch(String recommendLocationCd) {
        setRecommendLocationCd_LikeSearch(recommendLocationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecommendLocationCd_IsNull() { regRecommendLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecommendLocationCd_IsNullOrEmpty() { regRecommendLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECOMMEND_LOCATION_CD: {VARCHAR(30)}
     */
    public void setRecommendLocationCd_IsNotNull() { regRecommendLocationCd(CK_ISNN, DOBJ); }

    protected void regRecommendLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRecommendLocationCd(), "RECOMMEND_LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueRecommendLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_Equal(String locationCd) {
        doSetLocationCd_Equal(fRES(locationCd));
    }

    protected void doSetLocationCd_Equal(String locationCd) {
        regLocationCd(CK_EQ, locationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotEqual(String locationCd) {
        doSetLocationCd_NotEqual(fRES(locationCd));
    }

    protected void doSetLocationCd_NotEqual(String locationCd) {
        regLocationCd(CK_NES, locationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterThan(String locationCd) {
        regLocationCd(CK_GT, fRES(locationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessThan(String locationCd) {
        regLocationCd(CK_LT, fRES(locationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_GreaterEqual(String locationCd) {
        regLocationCd(CK_GE, fRES(locationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_LessEqual(String locationCd) {
        regLocationCd(CK_LE, fRES(locationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCdList The collection of locationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_InScope(Collection<String> locationCdList) {
        doSetLocationCd_InScope(locationCdList);
    }

    protected void doSetLocationCd_InScope(Collection<String> locationCdList) {
        regINS(CK_INS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCdList The collection of locationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_NotInScope(Collection<String> locationCdList) {
        doSetLocationCd_NotInScope(locationCdList);
    }

    protected void doSetLocationCd_NotInScope(Collection<String> locationCdList) {
        regINS(CK_NINS, cTL(locationCdList), xgetCValueLocationCd(), "LOCATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setLocationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd The value of locationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd_LikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd_NotLikeSearch(String locationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd), xgetCValueLocationCd(), "LOCATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     * @param locationCd The value of locationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd_PrefixSearch(String locationCd) {
        setLocationCd_LikeSearch(locationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNull() { regLocationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNullOrEmpty() { regLocationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD: {VARCHAR(30)}
     */
    public void setLocationCd_IsNotNull() { regLocationCd(CK_ISNN, DOBJ); }

    protected void regLocationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd(), "LOCATION_CD"); }
    protected abstract ConditionValue xgetCValueLocationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_Equal(String jancd) {
        doSetJancd_Equal(fRES(jancd));
    }

    protected void doSetJancd_Equal(String jancd) {
        regJancd(CK_EQ, jancd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_NotEqual(String jancd) {
        doSetJancd_NotEqual(fRES(jancd));
    }

    protected void doSetJancd_NotEqual(String jancd) {
        regJancd(CK_NES, jancd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_GreaterThan(String jancd) {
        regJancd(CK_GT, fRES(jancd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_LessThan(String jancd) {
        regJancd(CK_LT, fRES(jancd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_GreaterEqual(String jancd) {
        regJancd(CK_GE, fRES(jancd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_LessEqual(String jancd) {
        regJancd(CK_LE, fRES(jancd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancdList The collection of jancd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_InScope(Collection<String> jancdList) {
        doSetJancd_InScope(jancdList);
    }

    protected void doSetJancd_InScope(Collection<String> jancdList) {
        regINS(CK_INS, cTL(jancdList), xgetCValueJancd(), "JANCD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancdList The collection of jancd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_NotInScope(Collection<String> jancdList) {
        doSetJancd_NotInScope(jancdList);
    }

    protected void doSetJancd_NotInScope(Collection<String> jancdList) {
        regINS(CK_NINS, cTL(jancdList), xgetCValueJancd(), "JANCD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JANCD: {VARCHAR(30)} <br>
     * <pre>e.g. setJancd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param jancd The value of jancd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setJancd_LikeSearch(String jancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(jancd), xgetCValueJancd(), "JANCD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setJancd_NotLikeSearch(String jancd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(jancd), xgetCValueJancd(), "JANCD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * JANCD: {VARCHAR(30)}
     * @param jancd The value of jancd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setJancd_PrefixSearch(String jancd) {
        setJancd_LikeSearch(jancd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     */
    public void setJancd_IsNull() { regJancd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     */
    public void setJancd_IsNullOrEmpty() { regJancd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * JANCD: {VARCHAR(30)}
     */
    public void setJancd_IsNotNull() { regJancd(CK_ISNN, DOBJ); }

    protected void regJancd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueJancd(), "JANCD"); }
    protected abstract ConditionValue xgetCValueJancd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_Equal(String productNm) {
        doSetProductNm_Equal(fRES(productNm));
    }

    protected void doSetProductNm_Equal(String productNm) {
        regProductNm(CK_EQ, productNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotEqual(String productNm) {
        doSetProductNm_NotEqual(fRES(productNm));
    }

    protected void doSetProductNm_NotEqual(String productNm) {
        regProductNm(CK_NES, productNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterThan(String productNm) {
        regProductNm(CK_GT, fRES(productNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessThan(String productNm) {
        regProductNm(CK_LT, fRES(productNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_GreaterEqual(String productNm) {
        regProductNm(CK_GE, fRES(productNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_LessEqual(String productNm) {
        regProductNm(CK_LE, fRES(productNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNmList The collection of productNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_InScope(Collection<String> productNmList) {
        doSetProductNm_InScope(productNmList);
    }

    protected void doSetProductNm_InScope(Collection<String> productNmList) {
        regINS(CK_INS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNmList The collection of productNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_NotInScope(Collection<String> productNmList) {
        doSetProductNm_NotInScope(productNmList);
    }

    protected void doSetProductNm_NotInScope(Collection<String> productNmList) {
        regINS(CK_NINS, cTL(productNmList), xgetCValueProductNm(), "PRODUCT_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setProductNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param productNm The value of productNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProductNm_LikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductNm_NotLikeSearch(String productNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productNm), xgetCValueProductNm(), "PRODUCT_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     * @param productNm The value of productNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductNm_PrefixSearch(String productNm) {
        setProductNm_LikeSearch(productNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     */
    public void setProductNm_IsNull() { regProductNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     */
    public void setProductNm_IsNullOrEmpty() { regProductNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_NM: {VARCHAR(60)}
     */
    public void setProductNm_IsNotNull() { regProductNm(CK_ISNN, DOBJ); }

    protected void regProductNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductNm(), "PRODUCT_NM"); }
    protected abstract ConditionValue xgetCValueProductNm();

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
     * LOT: {VARCHAR(30)}
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
     * LOT: {VARCHAR(30)}
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
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterThan(String lot) {
        regLot(CK_GT, fRES(lot));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessThan(String lot) {
        regLot(CK_LT, fRES(lot));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_GreaterEqual(String lot) {
        regLot(CK_GE, fRES(lot));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_LessEqual(String lot) {
        regLot(CK_LE, fRES(lot));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
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
     * LOT: {VARCHAR(30)}
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
     * LOT: {VARCHAR(30)} <br>
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
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLot_NotLikeSearch(String lot, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lot), xgetCValueLot(), "LOT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT: {VARCHAR(30)}
     * @param lot The value of lot as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLot_PrefixSearch(String lot) {
        setLot_LikeSearch(lot, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNull() { regLot(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNullOrEmpty() { regLot(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT: {VARCHAR(30)}
     */
    public void setLot_IsNotNull() { regLot(CK_ISNN, DOBJ); }

    protected void regLot(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLot(), "LOT"); }
    protected abstract ConditionValue xgetCValueLot();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_Equal(String limitDt) {
        doSetLimitDt_Equal(fRES(limitDt));
    }

    protected void doSetLimitDt_Equal(String limitDt) {
        regLimitDt(CK_EQ, limitDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotEqual(String limitDt) {
        doSetLimitDt_NotEqual(fRES(limitDt));
    }

    protected void doSetLimitDt_NotEqual(String limitDt) {
        regLimitDt(CK_NES, limitDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterThan(String limitDt) {
        regLimitDt(CK_GT, fRES(limitDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessThan(String limitDt) {
        regLimitDt(CK_LT, fRES(limitDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_GreaterEqual(String limitDt) {
        regLimitDt(CK_GE, fRES(limitDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_LessEqual(String limitDt) {
        regLimitDt(CK_LE, fRES(limitDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_InScope(Collection<String> limitDtList) {
        doSetLimitDt_InScope(limitDtList);
    }

    protected void doSetLimitDt_InScope(Collection<String> limitDtList) {
        regINS(CK_INS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDtList The collection of limitDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_NotInScope(Collection<String> limitDtList) {
        doSetLimitDt_NotInScope(limitDtList);
    }

    protected void doSetLimitDt_NotInScope(Collection<String> limitDtList) {
        regINS(CK_NINS, cTL(limitDtList), xgetCValueLimitDt(), "LIMIT_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setLimitDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDt The value of limitDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDt_LikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDt_NotLikeSearch(String limitDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDt), xgetCValueLimitDt(), "LIMIT_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     * @param limitDt The value of limitDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDt_PrefixSearch(String limitDt) {
        setLimitDt_LikeSearch(limitDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNull() { regLimitDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNullOrEmpty() { regLimitDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT: {VARCHAR(8)}
     */
    public void setLimitDt_IsNotNull() { regLimitDt(CK_ISNN, DOBJ); }

    protected void regLimitDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDt(), "LIMIT_DT"); }
    protected abstract ConditionValue xgetCValueLimitDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_Equal(String prodDt) {
        doSetProdDt_Equal(fRES(prodDt));
    }

    protected void doSetProdDt_Equal(String prodDt) {
        regProdDt(CK_EQ, prodDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotEqual(String prodDt) {
        doSetProdDt_NotEqual(fRES(prodDt));
    }

    protected void doSetProdDt_NotEqual(String prodDt) {
        regProdDt(CK_NES, prodDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterThan(String prodDt) {
        regProdDt(CK_GT, fRES(prodDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessThan(String prodDt) {
        regProdDt(CK_LT, fRES(prodDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_GreaterEqual(String prodDt) {
        regProdDt(CK_GE, fRES(prodDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_LessEqual(String prodDt) {
        regProdDt(CK_LE, fRES(prodDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_InScope(Collection<String> prodDtList) {
        doSetProdDt_InScope(prodDtList);
    }

    protected void doSetProdDt_InScope(Collection<String> prodDtList) {
        regINS(CK_INS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDtList The collection of prodDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_NotInScope(Collection<String> prodDtList) {
        doSetProdDt_NotInScope(prodDtList);
    }

    protected void doSetProdDt_NotInScope(Collection<String> prodDtList) {
        regINS(CK_NINS, cTL(prodDtList), xgetCValueProdDt(), "PROD_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setProdDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDt The value of prodDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDt_LikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDt_NotLikeSearch(String prodDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDt), xgetCValueProdDt(), "PROD_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     * @param prodDt The value of prodDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDt_PrefixSearch(String prodDt) {
        setProdDt_LikeSearch(prodDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNull() { regProdDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNullOrEmpty() { regProdDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT: {VARCHAR(8)}
     */
    public void setProdDt_IsNotNull() { regProdDt(CK_ISNN, DOBJ); }

    protected void regProdDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDt(), "PROD_DT"); }
    protected abstract ConditionValue xgetCValueProdDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_Equal(String receiveDt) {
        doSetReceiveDt_Equal(fRES(receiveDt));
    }

    protected void doSetReceiveDt_Equal(String receiveDt) {
        regReceiveDt(CK_EQ, receiveDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotEqual(String receiveDt) {
        doSetReceiveDt_NotEqual(fRES(receiveDt));
    }

    protected void doSetReceiveDt_NotEqual(String receiveDt) {
        regReceiveDt(CK_NES, receiveDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterThan(String receiveDt) {
        regReceiveDt(CK_GT, fRES(receiveDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessThan(String receiveDt) {
        regReceiveDt(CK_LT, fRES(receiveDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_GreaterEqual(String receiveDt) {
        regReceiveDt(CK_GE, fRES(receiveDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_LessEqual(String receiveDt) {
        regReceiveDt(CK_LE, fRES(receiveDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_InScope(Collection<String> receiveDtList) {
        doSetReceiveDt_InScope(receiveDtList);
    }

    protected void doSetReceiveDt_InScope(Collection<String> receiveDtList) {
        regINS(CK_INS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDtList The collection of receiveDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_NotInScope(Collection<String> receiveDtList) {
        doSetReceiveDt_NotInScope(receiveDtList);
    }

    protected void doSetReceiveDt_NotInScope(Collection<String> receiveDtList) {
        regINS(CK_NINS, cTL(receiveDtList), xgetCValueReceiveDt(), "RECEIVE_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setReceiveDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveDt The value of receiveDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveDt_LikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveDt_NotLikeSearch(String receiveDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveDt), xgetCValueReceiveDt(), "RECEIVE_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     * @param receiveDt The value of receiveDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveDt_PrefixSearch(String receiveDt) {
        setReceiveDt_LikeSearch(receiveDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNull() { regReceiveDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNullOrEmpty() { regReceiveDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_DT: {VARCHAR(8)}
     */
    public void setReceiveDt_IsNotNull() { regReceiveDt(CK_ISNN, DOBJ); }

    protected void regReceiveDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveDt(), "RECEIVE_DT"); }
    protected abstract ConditionValue xgetCValueReceiveDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_Equal(String depositFlg) {
        doSetDepositFlg_Equal(fRES(depositFlg));
    }

    protected void doSetDepositFlg_Equal(String depositFlg) {
        regDepositFlg(CK_EQ, depositFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotEqual(String depositFlg) {
        doSetDepositFlg_NotEqual(fRES(depositFlg));
    }

    protected void doSetDepositFlg_NotEqual(String depositFlg) {
        regDepositFlg(CK_NES, depositFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_GreaterThan(String depositFlg) {
        regDepositFlg(CK_GT, fRES(depositFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_LessThan(String depositFlg) {
        regDepositFlg(CK_LT, fRES(depositFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_GreaterEqual(String depositFlg) {
        regDepositFlg(CK_GE, fRES(depositFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_LessEqual(String depositFlg) {
        regDepositFlg(CK_LE, fRES(depositFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlgList The collection of depositFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_InScope(Collection<String> depositFlgList) {
        doSetDepositFlg_InScope(depositFlgList);
    }

    protected void doSetDepositFlg_InScope(Collection<String> depositFlgList) {
        regINS(CK_INS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlgList The collection of depositFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotInScope(Collection<String> depositFlgList) {
        doSetDepositFlg_NotInScope(depositFlgList);
    }

    protected void doSetDepositFlg_NotInScope(Collection<String> depositFlgList) {
        regINS(CK_NINS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setDepositFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param depositFlg The value of depositFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDepositFlg_LikeSearch(String depositFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(depositFlg), xgetCValueDepositFlg(), "DEPOSIT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDepositFlg_NotLikeSearch(String depositFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(depositFlg), xgetCValueDepositFlg(), "DEPOSIT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     * @param depositFlg The value of depositFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_PrefixSearch(String depositFlg) {
        setDepositFlg_LikeSearch(depositFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     */
    public void setDepositFlg_IsNull() { regDepositFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     */
    public void setDepositFlg_IsNullOrEmpty() { regDepositFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1)}
     */
    public void setDepositFlg_IsNotNull() { regDepositFlg(CK_ISNN, DOBJ); }

    protected void regDepositFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositFlg(), "DEPOSIT_FLG"); }
    protected abstract ConditionValue xgetCValueDepositFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_Equal(String reprintFlg) {
        doSetReprintFlg_Equal(fRES(reprintFlg));
    }

    protected void doSetReprintFlg_Equal(String reprintFlg) {
        regReprintFlg(CK_EQ, reprintFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_NotEqual(String reprintFlg) {
        doSetReprintFlg_NotEqual(fRES(reprintFlg));
    }

    protected void doSetReprintFlg_NotEqual(String reprintFlg) {
        regReprintFlg(CK_NES, reprintFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_GreaterThan(String reprintFlg) {
        regReprintFlg(CK_GT, fRES(reprintFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_LessThan(String reprintFlg) {
        regReprintFlg(CK_LT, fRES(reprintFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_GreaterEqual(String reprintFlg) {
        regReprintFlg(CK_GE, fRES(reprintFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_LessEqual(String reprintFlg) {
        regReprintFlg(CK_LE, fRES(reprintFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlgList The collection of reprintFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_InScope(Collection<String> reprintFlgList) {
        doSetReprintFlg_InScope(reprintFlgList);
    }

    protected void doSetReprintFlg_InScope(Collection<String> reprintFlgList) {
        regINS(CK_INS, cTL(reprintFlgList), xgetCValueReprintFlg(), "REPRINT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlgList The collection of reprintFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_NotInScope(Collection<String> reprintFlgList) {
        doSetReprintFlg_NotInScope(reprintFlgList);
    }

    protected void doSetReprintFlg_NotInScope(Collection<String> reprintFlgList) {
        regINS(CK_NINS, cTL(reprintFlgList), xgetCValueReprintFlg(), "REPRINT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPRINT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setReprintFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param reprintFlg The value of reprintFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReprintFlg_LikeSearch(String reprintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(reprintFlg), xgetCValueReprintFlg(), "REPRINT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReprintFlg_NotLikeSearch(String reprintFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(reprintFlg), xgetCValueReprintFlg(), "REPRINT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     * @param reprintFlg The value of reprintFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReprintFlg_PrefixSearch(String reprintFlg) {
        setReprintFlg_LikeSearch(reprintFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     */
    public void setReprintFlg_IsNull() { regReprintFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     */
    public void setReprintFlg_IsNullOrEmpty() { regReprintFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPRINT_FLG: {CHAR(1)}
     */
    public void setReprintFlg_IsNotNull() { regReprintFlg(CK_ISNN, DOBJ); }

    protected void regReprintFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReprintFlg(), "REPRINT_FLG"); }
    protected abstract ConditionValue xgetCValueReprintFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_Equal(Long receiveUnitNum) {
        doSetReceiveUnitNum_Equal(receiveUnitNum);
    }

    protected void doSetReceiveUnitNum_Equal(Long receiveUnitNum) {
        regReceiveUnitNum(CK_EQ, receiveUnitNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_NotEqual(Long receiveUnitNum) {
        doSetReceiveUnitNum_NotEqual(receiveUnitNum);
    }

    protected void doSetReceiveUnitNum_NotEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_NES, receiveUnitNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_GreaterThan(Long receiveUnitNum) {
        regReceiveUnitNum(CK_GT, receiveUnitNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_LessThan(Long receiveUnitNum) {
        regReceiveUnitNum(CK_LT, receiveUnitNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_GreaterEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_GE, receiveUnitNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNum The value of receiveUnitNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_LessEqual(Long receiveUnitNum) {
        regReceiveUnitNum(CK_LE, receiveUnitNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param minNumber The min number of receiveUnitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receiveUnitNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceiveUnitNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNumList The collection of receiveUnitNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_InScope(Collection<Long> receiveUnitNumList) {
        doSetReceiveUnitNum_InScope(receiveUnitNumList);
    }

    protected void doSetReceiveUnitNum_InScope(Collection<Long> receiveUnitNumList) {
        regINS(CK_INS, cTL(receiveUnitNumList), xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     * @param receiveUnitNumList The collection of receiveUnitNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveUnitNum_NotInScope(Collection<Long> receiveUnitNumList) {
        doSetReceiveUnitNum_NotInScope(receiveUnitNumList);
    }

    protected void doSetReceiveUnitNum_NotInScope(Collection<Long> receiveUnitNumList) {
        regINS(CK_NINS, cTL(receiveUnitNumList), xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     */
    public void setReceiveUnitNum_IsNull() { regReceiveUnitNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_UNIT_NUM: {BIGINT(19)}
     */
    public void setReceiveUnitNum_IsNotNull() { regReceiveUnitNum(CK_ISNN, DOBJ); }

    protected void regReceiveUnitNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveUnitNum(), "RECEIVE_UNIT_NUM"); }
    protected abstract ConditionValue xgetCValueReceiveUnitNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
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
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
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
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterThan(Long receivePlanBId) {
        regReceivePlanBId(CK_GT, receivePlanBId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessThan(Long receivePlanBId) {
        regReceivePlanBId(CK_LT, receivePlanBId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_GreaterEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_GE, receivePlanBId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @param receivePlanBId The value of receivePlanBId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReceivePlanBId_LessEqual(Long receivePlanBId) {
        regReceivePlanBId(CK_LE, receivePlanBId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     * @param minNumber The min number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of receivePlanBId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReceivePlanBId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
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
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
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
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     */
    public void setReceivePlanBId_IsNull() { regReceivePlanBId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b}
     */
    public void setReceivePlanBId_IsNotNull() { regReceivePlanBId(CK_ISNN, DOBJ); }

    protected void regReceivePlanBId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlanBId(), "RECEIVE_PLAN_B_ID"); }
    protected abstract ConditionValue xgetCValueReceivePlanBId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_Equal(Long rcvLblOutUserId) {
        doSetRcvLblOutUserId_Equal(rcvLblOutUserId);
    }

    protected void doSetRcvLblOutUserId_Equal(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_EQ, rcvLblOutUserId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_NotEqual(Long rcvLblOutUserId) {
        doSetRcvLblOutUserId_NotEqual(rcvLblOutUserId);
    }

    protected void doSetRcvLblOutUserId_NotEqual(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_NES, rcvLblOutUserId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_GreaterThan(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_GT, rcvLblOutUserId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_LessThan(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_LT, rcvLblOutUserId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_GreaterEqual(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_GE, rcvLblOutUserId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserId The value of rcvLblOutUserId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_LessEqual(Long rcvLblOutUserId) {
        regRcvLblOutUserId(CK_LE, rcvLblOutUserId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param minNumber The min number of rcvLblOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of rcvLblOutUserId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setRcvLblOutUserId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueRcvLblOutUserId(), "RCV_LBL_OUT_USER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserIdList The collection of rcvLblOutUserId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_InScope(Collection<Long> rcvLblOutUserIdList) {
        doSetRcvLblOutUserId_InScope(rcvLblOutUserIdList);
    }

    protected void doSetRcvLblOutUserId_InScope(Collection<Long> rcvLblOutUserIdList) {
        regINS(CK_INS, cTL(rcvLblOutUserIdList), xgetCValueRcvLblOutUserId(), "RCV_LBL_OUT_USER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     * @param rcvLblOutUserIdList The collection of rcvLblOutUserId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setRcvLblOutUserId_NotInScope(Collection<Long> rcvLblOutUserIdList) {
        doSetRcvLblOutUserId_NotInScope(rcvLblOutUserIdList);
    }

    protected void doSetRcvLblOutUserId_NotInScope(Collection<Long> rcvLblOutUserIdList) {
        regINS(CK_NINS, cTL(rcvLblOutUserIdList), xgetCValueRcvLblOutUserId(), "RCV_LBL_OUT_USER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select RCV_LBL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'in-scope'. (NotNull)
     */
    public void inScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRcvLblOutUserId_InScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RCV_LBL_OUT_USER_ID", "USER_ID", pp, "bUser", false);
    }
    public abstract String keepRcvLblOutUserId_InScopeRelation_BUser(BUserCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select RCV_LBL_OUT_USER_ID from b_user where ...)} <br />
     * b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
     * @param subCBLambda The callback for sub-query of BUser for 'not in-scope'. (NotNull)
     */
    public void notInScopeBUser(SubQuery<BUserCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        BUserCB cb = new BUserCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepRcvLblOutUserId_NotInScopeRelation_BUser(cb.query());
        registerInScopeRelation(cb.query(), "RCV_LBL_OUT_USER_ID", "USER_ID", pp, "bUser", true);
    }
    public abstract String keepRcvLblOutUserId_NotInScopeRelation_BUser(BUserCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setRcvLblOutUserId_IsNull() { regRcvLblOutUserId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user}
     */
    public void setRcvLblOutUserId_IsNotNull() { regRcvLblOutUserId(CK_ISNN, DOBJ); }

    protected void regRcvLblOutUserId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvLblOutUserId(), "RCV_LBL_OUT_USER_ID"); }
    protected abstract ConditionValue xgetCValueRcvLblOutUserId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @param rcvLblOutDt The value of rcvLblOutDt as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutDt_Equal(java.sql.Timestamp rcvLblOutDt) {
        regRcvLblOutDt(CK_EQ,  rcvLblOutDt);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @param rcvLblOutDt The value of rcvLblOutDt as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutDt_GreaterThan(java.sql.Timestamp rcvLblOutDt) {
        regRcvLblOutDt(CK_GT,  rcvLblOutDt);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @param rcvLblOutDt The value of rcvLblOutDt as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutDt_LessThan(java.sql.Timestamp rcvLblOutDt) {
        regRcvLblOutDt(CK_LT,  rcvLblOutDt);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @param rcvLblOutDt The value of rcvLblOutDt as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutDt_GreaterEqual(java.sql.Timestamp rcvLblOutDt) {
        regRcvLblOutDt(CK_GE,  rcvLblOutDt);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * @param rcvLblOutDt The value of rcvLblOutDt as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setRcvLblOutDt_LessEqual(java.sql.Timestamp rcvLblOutDt) {
        regRcvLblOutDt(CK_LE, rcvLblOutDt);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * <pre>e.g. setRcvLblOutDt_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rcvLblOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of rcvLblOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setRcvLblOutDt_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueRcvLblOutDt(), "RCV_LBL_OUT_DT", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of rcvLblOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of rcvLblOutDt. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setRcvLblOutDt_DateFromTo(Date fromDate, Date toDate) {
        setRcvLblOutDt_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     */
    public void setRcvLblOutDt_IsNull() { regRcvLblOutDt(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RCV_LBL_OUT_DT: {DATETIME(19)}
     */
    public void setRcvLblOutDt_IsNotNull() { regRcvLblOutDt(CK_ISNN, DOBJ); }

    protected void regRcvLblOutDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueRcvLblOutDt(), "RCV_LBL_OUT_DT"); }
    protected abstract ConditionValue xgetCValueRcvLblOutDt();

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
    public HpSLCFunction<TReceiveLabelCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TReceiveLabelCB.class);
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
    public HpSLCFunction<TReceiveLabelCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TReceiveLabelCB.class);
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
    public HpSLCFunction<TReceiveLabelCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TReceiveLabelCB.class);
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
    public HpSLCFunction<TReceiveLabelCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TReceiveLabelCB.class);
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
    public HpSLCFunction<TReceiveLabelCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TReceiveLabelCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TReceiveLabelCB&gt;() {
     *     public void query(TReceiveLabelCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TReceiveLabelCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TReceiveLabelCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TReceiveLabelCQ sq);

    protected TReceiveLabelCB xcreateScalarConditionCB() {
        TReceiveLabelCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TReceiveLabelCB xcreateScalarConditionPartitionByCB() {
        TReceiveLabelCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TReceiveLabelCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "RECEIVE_LABEL_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TReceiveLabelCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TReceiveLabelCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TReceiveLabelCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "RECEIVE_LABEL_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TReceiveLabelCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TReceiveLabelCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceiveLabelCB cb = new TReceiveLabelCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TReceiveLabelCQ sq);

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
    protected TReceiveLabelCB newMyCB() {
        return new TReceiveLabelCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TReceiveLabelCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
