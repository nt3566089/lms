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
 * The abstract condition-query of t_transfer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTTransferCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTTransferCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_transfer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_Equal(Long transferId) {
        doSetTransferId_Equal(transferId);
    }

    protected void doSetTransferId_Equal(Long transferId) {
        regTransferId(CK_EQ, transferId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_NotEqual(Long transferId) {
        doSetTransferId_NotEqual(transferId);
    }

    protected void doSetTransferId_NotEqual(Long transferId) {
        regTransferId(CK_NES, transferId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_GreaterThan(Long transferId) {
        regTransferId(CK_GT, transferId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_LessThan(Long transferId) {
        regTransferId(CK_LT, transferId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_GreaterEqual(Long transferId) {
        regTransferId(CK_GE, transferId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferId The value of transferId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTransferId_LessEqual(Long transferId) {
        regTransferId(CK_LE, transferId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of transferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of transferId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTransferId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTransferId(), "TRANSFER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferIdList The collection of transferId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferId_InScope(Collection<Long> transferIdList) {
        doSetTransferId_InScope(transferIdList);
    }

    protected void doSetTransferId_InScope(Collection<Long> transferIdList) {
        regINS(CK_INS, cTL(transferIdList), xgetCValueTransferId(), "TRANSFER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param transferIdList The collection of transferId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferId_NotInScope(Collection<Long> transferIdList) {
        doSetTransferId_NotInScope(transferIdList);
    }

    protected void doSetTransferId_NotInScope(Collection<Long> transferIdList) {
        regINS(CK_NINS, cTL(transferIdList), xgetCValueTransferId(), "TRANSFER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTransferId_IsNull() { regTransferId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setTransferId_IsNotNull() { regTransferId(CK_ISNN, DOBJ); }

    protected void regTransferId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransferId(), "TRANSFER_ID"); }
    protected abstract ConditionValue xgetCValueTransferId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_Equal(Long clientId) {
        doSetClientId_Equal(clientId);
    }

    protected void doSetClientId_Equal(Long clientId) {
        regClientId(CK_EQ, clientId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_NotEqual(Long clientId) {
        doSetClientId_NotEqual(clientId);
    }

    protected void doSetClientId_NotEqual(Long clientId) {
        regClientId(CK_NES, clientId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_InScope(Collection<Long> clientIdList) {
        doSetClientId_InScope(clientIdList);
    }

    protected void doSetClientId_InScope(Collection<Long> clientIdList) {
        regINS(CK_INS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'in-scope'. (NotNull)
     */
    public void inScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_InScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", false);
    }
    public abstract String keepClientId_InScopeRelation_MClient(MClientCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CLIENT_ID from m_client where ...)} <br />
     * m_client by my CLIENT_ID, named 'MClient'.
     * @param subCBLambda The callback for sub-query of MClient for 'not in-scope'. (NotNull)
     */
    public void notInScopeMClient(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepClientId_NotInScopeRelation_MClient(cb.query());
        registerInScopeRelation(cb.query(), "CLIENT_ID", "CLIENT_ID", pp, "mClient", true);
    }
    public abstract String keepClientId_NotInScopeRelation_MClient(MClientCQ sq);

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
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
     * PRODUCT_CD: {VARCHAR(100)}
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
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
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
     * PRODUCT_CD: {VARCHAR(100)}
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
     * PRODUCT_CD: {VARCHAR(100)} <br>
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
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(100)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_Equal(String stockTransferDt) {
        doSetStockTransferDt_Equal(fRES(stockTransferDt));
    }

    protected void doSetStockTransferDt_Equal(String stockTransferDt) {
        regStockTransferDt(CK_EQ, stockTransferDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_NotEqual(String stockTransferDt) {
        doSetStockTransferDt_NotEqual(fRES(stockTransferDt));
    }

    protected void doSetStockTransferDt_NotEqual(String stockTransferDt) {
        regStockTransferDt(CK_NES, stockTransferDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_GreaterThan(String stockTransferDt) {
        regStockTransferDt(CK_GT, fRES(stockTransferDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_LessThan(String stockTransferDt) {
        regStockTransferDt(CK_LT, fRES(stockTransferDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_GreaterEqual(String stockTransferDt) {
        regStockTransferDt(CK_GE, fRES(stockTransferDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_LessEqual(String stockTransferDt) {
        regStockTransferDt(CK_LE, fRES(stockTransferDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDtList The collection of stockTransferDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_InScope(Collection<String> stockTransferDtList) {
        doSetStockTransferDt_InScope(stockTransferDtList);
    }

    protected void doSetStockTransferDt_InScope(Collection<String> stockTransferDtList) {
        regINS(CK_INS, cTL(stockTransferDtList), xgetCValueStockTransferDt(), "STOCK_TRANSFER_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDtList The collection of stockTransferDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_NotInScope(Collection<String> stockTransferDtList) {
        doSetStockTransferDt_NotInScope(stockTransferDtList);
    }

    protected void doSetStockTransferDt_NotInScope(Collection<String> stockTransferDtList) {
        regINS(CK_NINS, cTL(stockTransferDtList), xgetCValueStockTransferDt(), "STOCK_TRANSFER_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * <pre>e.g. setStockTransferDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockTransferDt The value of stockTransferDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockTransferDt_LikeSearch(String stockTransferDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockTransferDt), xgetCValueStockTransferDt(), "STOCK_TRANSFER_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockTransferDt_NotLikeSearch(String stockTransferDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockTransferDt), xgetCValueStockTransferDt(), "STOCK_TRANSFER_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     * @param stockTransferDt The value of stockTransferDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockTransferDt_PrefixSearch(String stockTransferDt) {
        setStockTransferDt_LikeSearch(stockTransferDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     */
    public void setStockTransferDt_IsNull() { regStockTransferDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     */
    public void setStockTransferDt_IsNullOrEmpty() { regStockTransferDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_TRANSFER_DT: {VARCHAR(30)}
     */
    public void setStockTransferDt_IsNotNull() { regStockTransferDt(CK_ISNN, DOBJ); }

    protected void regStockTransferDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockTransferDt(), "STOCK_TRANSFER_DT"); }
    protected abstract ConditionValue xgetCValueStockTransferDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_Equal(String receivePlantCd) {
        doSetReceivePlantCd_Equal(fRES(receivePlantCd));
    }

    protected void doSetReceivePlantCd_Equal(String receivePlantCd) {
        regReceivePlantCd(CK_EQ, receivePlantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_NotEqual(String receivePlantCd) {
        doSetReceivePlantCd_NotEqual(fRES(receivePlantCd));
    }

    protected void doSetReceivePlantCd_NotEqual(String receivePlantCd) {
        regReceivePlantCd(CK_NES, receivePlantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_GreaterThan(String receivePlantCd) {
        regReceivePlantCd(CK_GT, fRES(receivePlantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_LessThan(String receivePlantCd) {
        regReceivePlantCd(CK_LT, fRES(receivePlantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_GreaterEqual(String receivePlantCd) {
        regReceivePlantCd(CK_GE, fRES(receivePlantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_LessEqual(String receivePlantCd) {
        regReceivePlantCd(CK_LE, fRES(receivePlantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCdList The collection of receivePlantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_InScope(Collection<String> receivePlantCdList) {
        doSetReceivePlantCd_InScope(receivePlantCdList);
    }

    protected void doSetReceivePlantCd_InScope(Collection<String> receivePlantCdList) {
        regINS(CK_INS, cTL(receivePlantCdList), xgetCValueReceivePlantCd(), "RECEIVE_PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCdList The collection of receivePlantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_NotInScope(Collection<String> receivePlantCdList) {
        doSetReceivePlantCd_NotInScope(receivePlantCdList);
    }

    protected void doSetReceivePlantCd_NotInScope(Collection<String> receivePlantCdList) {
        regINS(CK_NINS, cTL(receivePlantCdList), xgetCValueReceivePlantCd(), "RECEIVE_PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReceivePlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receivePlantCd The value of receivePlantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceivePlantCd_LikeSearch(String receivePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receivePlantCd), xgetCValueReceivePlantCd(), "RECEIVE_PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceivePlantCd_NotLikeSearch(String receivePlantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receivePlantCd), xgetCValueReceivePlantCd(), "RECEIVE_PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     * @param receivePlantCd The value of receivePlantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceivePlantCd_PrefixSearch(String receivePlantCd) {
        setReceivePlantCd_LikeSearch(receivePlantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     */
    public void setReceivePlantCd_IsNull() { regReceivePlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     */
    public void setReceivePlantCd_IsNullOrEmpty() { regReceivePlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_PLANT_CD: {VARCHAR(30)}
     */
    public void setReceivePlantCd_IsNotNull() { regReceivePlantCd(CK_ISNN, DOBJ); }

    protected void regReceivePlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceivePlantCd(), "RECEIVE_PLANT_CD"); }
    protected abstract ConditionValue xgetCValueReceivePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_Equal(String receiveStorageSpaceCd) {
        doSetReceiveStorageSpaceCd_Equal(fRES(receiveStorageSpaceCd));
    }

    protected void doSetReceiveStorageSpaceCd_Equal(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_EQ, receiveStorageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_NotEqual(String receiveStorageSpaceCd) {
        doSetReceiveStorageSpaceCd_NotEqual(fRES(receiveStorageSpaceCd));
    }

    protected void doSetReceiveStorageSpaceCd_NotEqual(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_NES, receiveStorageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_GreaterThan(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_GT, fRES(receiveStorageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_LessThan(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_LT, fRES(receiveStorageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_GreaterEqual(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_GE, fRES(receiveStorageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_LessEqual(String receiveStorageSpaceCd) {
        regReceiveStorageSpaceCd(CK_LE, fRES(receiveStorageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCdList The collection of receiveStorageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_InScope(Collection<String> receiveStorageSpaceCdList) {
        doSetReceiveStorageSpaceCd_InScope(receiveStorageSpaceCdList);
    }

    protected void doSetReceiveStorageSpaceCd_InScope(Collection<String> receiveStorageSpaceCdList) {
        regINS(CK_INS, cTL(receiveStorageSpaceCdList), xgetCValueReceiveStorageSpaceCd(), "RECEIVE_STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCdList The collection of receiveStorageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_NotInScope(Collection<String> receiveStorageSpaceCdList) {
        doSetReceiveStorageSpaceCd_NotInScope(receiveStorageSpaceCdList);
    }

    protected void doSetReceiveStorageSpaceCd_NotInScope(Collection<String> receiveStorageSpaceCdList) {
        regINS(CK_NINS, cTL(receiveStorageSpaceCdList), xgetCValueReceiveStorageSpaceCd(), "RECEIVE_STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setReceiveStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setReceiveStorageSpaceCd_LikeSearch(String receiveStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(receiveStorageSpaceCd), xgetCValueReceiveStorageSpaceCd(), "RECEIVE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setReceiveStorageSpaceCd_NotLikeSearch(String receiveStorageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(receiveStorageSpaceCd), xgetCValueReceiveStorageSpaceCd(), "RECEIVE_STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param receiveStorageSpaceCd The value of receiveStorageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReceiveStorageSpaceCd_PrefixSearch(String receiveStorageSpaceCd) {
        setReceiveStorageSpaceCd_LikeSearch(receiveStorageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setReceiveStorageSpaceCd_IsNull() { regReceiveStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setReceiveStorageSpaceCd_IsNullOrEmpty() { regReceiveStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setReceiveStorageSpaceCd_IsNotNull() { regReceiveStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regReceiveStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReceiveStorageSpaceCd(), "RECEIVE_STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueReceiveStorageSpaceCd();

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
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_Equal(String transferTypeCd) {
        doSetTransferTypeCd_Equal(fRES(transferTypeCd));
    }

    protected void doSetTransferTypeCd_Equal(String transferTypeCd) {
        regTransferTypeCd(CK_EQ, transferTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_NotEqual(String transferTypeCd) {
        doSetTransferTypeCd_NotEqual(fRES(transferTypeCd));
    }

    protected void doSetTransferTypeCd_NotEqual(String transferTypeCd) {
        regTransferTypeCd(CK_NES, transferTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_GreaterThan(String transferTypeCd) {
        regTransferTypeCd(CK_GT, fRES(transferTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_LessThan(String transferTypeCd) {
        regTransferTypeCd(CK_LT, fRES(transferTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_GreaterEqual(String transferTypeCd) {
        regTransferTypeCd(CK_GE, fRES(transferTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_LessEqual(String transferTypeCd) {
        regTransferTypeCd(CK_LE, fRES(transferTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCdList The collection of transferTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_InScope(Collection<String> transferTypeCdList) {
        doSetTransferTypeCd_InScope(transferTypeCdList);
    }

    protected void doSetTransferTypeCd_InScope(Collection<String> transferTypeCdList) {
        regINS(CK_INS, cTL(transferTypeCdList), xgetCValueTransferTypeCd(), "TRANSFER_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCdList The collection of transferTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_NotInScope(Collection<String> transferTypeCdList) {
        doSetTransferTypeCd_NotInScope(transferTypeCdList);
    }

    protected void doSetTransferTypeCd_NotInScope(Collection<String> transferTypeCdList) {
        regINS(CK_NINS, cTL(transferTypeCdList), xgetCValueTransferTypeCd(), "TRANSFER_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTransferTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param transferTypeCd The value of transferTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTransferTypeCd_LikeSearch(String transferTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(transferTypeCd), xgetCValueTransferTypeCd(), "TRANSFER_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTransferTypeCd_NotLikeSearch(String transferTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(transferTypeCd), xgetCValueTransferTypeCd(), "TRANSFER_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     * @param transferTypeCd The value of transferTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTransferTypeCd_PrefixSearch(String transferTypeCd) {
        setTransferTypeCd_LikeSearch(transferTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransferTypeCd_IsNull() { regTransferTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransferTypeCd_IsNullOrEmpty() { regTransferTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TRANSFER_TYPE_CD: {VARCHAR(30)}
     */
    public void setTransferTypeCd_IsNotNull() { regTransferTypeCd(CK_ISNN, DOBJ); }

    protected void regTransferTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTransferTypeCd(), "TRANSFER_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueTransferTypeCd();

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
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_Equal(String s4SendFlg) {
        doSetS4SendFlg_Equal(fRES(s4SendFlg));
    }

    protected void doSetS4SendFlg_Equal(String s4SendFlg) {
        regS4SendFlg(CK_EQ, s4SendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_NotEqual(String s4SendFlg) {
        doSetS4SendFlg_NotEqual(fRES(s4SendFlg));
    }

    protected void doSetS4SendFlg_NotEqual(String s4SendFlg) {
        regS4SendFlg(CK_NES, s4SendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_GreaterThan(String s4SendFlg) {
        regS4SendFlg(CK_GT, fRES(s4SendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_LessThan(String s4SendFlg) {
        regS4SendFlg(CK_LT, fRES(s4SendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_GreaterEqual(String s4SendFlg) {
        regS4SendFlg(CK_GE, fRES(s4SendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_LessEqual(String s4SendFlg) {
        regS4SendFlg(CK_LE, fRES(s4SendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlgList The collection of s4SendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_InScope(Collection<String> s4SendFlgList) {
        doSetS4SendFlg_InScope(s4SendFlgList);
    }

    protected void doSetS4SendFlg_InScope(Collection<String> s4SendFlgList) {
        regINS(CK_INS, cTL(s4SendFlgList), xgetCValueS4SendFlg(), "S4_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlgList The collection of s4SendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_NotInScope(Collection<String> s4SendFlgList) {
        doSetS4SendFlg_NotInScope(s4SendFlgList);
    }

    protected void doSetS4SendFlg_NotInScope(Collection<String> s4SendFlgList) {
        regINS(CK_NINS, cTL(s4SendFlgList), xgetCValueS4SendFlg(), "S4_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setS4SendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param s4SendFlg The value of s4SendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setS4SendFlg_LikeSearch(String s4SendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(s4SendFlg), xgetCValueS4SendFlg(), "S4_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setS4SendFlg_NotLikeSearch(String s4SendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(s4SendFlg), xgetCValueS4SendFlg(), "S4_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     * @param s4SendFlg The value of s4SendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_PrefixSearch(String s4SendFlg) {
        setS4SendFlg_LikeSearch(s4SendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setS4SendFlg_IsNull() { regS4SendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setS4SendFlg_IsNullOrEmpty() { regS4SendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setS4SendFlg_IsNotNull() { regS4SendFlg(CK_ISNN, DOBJ); }

    protected void regS4SendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueS4SendFlg(), "S4_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueS4SendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_Equal(String locationCd1) {
        doSetLocationCd1_Equal(fRES(locationCd1));
    }

    protected void doSetLocationCd1_Equal(String locationCd1) {
        regLocationCd1(CK_EQ, locationCd1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_NotEqual(String locationCd1) {
        doSetLocationCd1_NotEqual(fRES(locationCd1));
    }

    protected void doSetLocationCd1_NotEqual(String locationCd1) {
        regLocationCd1(CK_NES, locationCd1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_GreaterThan(String locationCd1) {
        regLocationCd1(CK_GT, fRES(locationCd1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_LessThan(String locationCd1) {
        regLocationCd1(CK_LT, fRES(locationCd1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_GreaterEqual(String locationCd1) {
        regLocationCd1(CK_GE, fRES(locationCd1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_LessEqual(String locationCd1) {
        regLocationCd1(CK_LE, fRES(locationCd1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1List The collection of locationCd1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_InScope(Collection<String> locationCd1List) {
        doSetLocationCd1_InScope(locationCd1List);
    }

    protected void doSetLocationCd1_InScope(Collection<String> locationCd1List) {
        regINS(CK_INS, cTL(locationCd1List), xgetCValueLocationCd1(), "LOCATION_CD1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1List The collection of locationCd1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_NotInScope(Collection<String> locationCd1List) {
        doSetLocationCd1_NotInScope(locationCd1List);
    }

    protected void doSetLocationCd1_NotInScope(Collection<String> locationCd1List) {
        regINS(CK_NINS, cTL(locationCd1List), xgetCValueLocationCd1(), "LOCATION_CD1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)} <br>
     * <pre>e.g. setLocationCd1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd1 The value of locationCd1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd1_LikeSearch(String locationCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd1), xgetCValueLocationCd1(), "LOCATION_CD1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd1_NotLikeSearch(String locationCd1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd1), xgetCValueLocationCd1(), "LOCATION_CD1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     * @param locationCd1 The value of locationCd1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd1_PrefixSearch(String locationCd1) {
        setLocationCd1_LikeSearch(locationCd1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     */
    public void setLocationCd1_IsNull() { regLocationCd1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     */
    public void setLocationCd1_IsNullOrEmpty() { regLocationCd1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD1: {VARCHAR(30)}
     */
    public void setLocationCd1_IsNotNull() { regLocationCd1(CK_ISNN, DOBJ); }

    protected void regLocationCd1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd1(), "LOCATION_CD1"); }
    protected abstract ConditionValue xgetCValueLocationCd1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_Equal(String locationCd2) {
        doSetLocationCd2_Equal(fRES(locationCd2));
    }

    protected void doSetLocationCd2_Equal(String locationCd2) {
        regLocationCd2(CK_EQ, locationCd2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_NotEqual(String locationCd2) {
        doSetLocationCd2_NotEqual(fRES(locationCd2));
    }

    protected void doSetLocationCd2_NotEqual(String locationCd2) {
        regLocationCd2(CK_NES, locationCd2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_GreaterThan(String locationCd2) {
        regLocationCd2(CK_GT, fRES(locationCd2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_LessThan(String locationCd2) {
        regLocationCd2(CK_LT, fRES(locationCd2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_GreaterEqual(String locationCd2) {
        regLocationCd2(CK_GE, fRES(locationCd2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_LessEqual(String locationCd2) {
        regLocationCd2(CK_LE, fRES(locationCd2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2List The collection of locationCd2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_InScope(Collection<String> locationCd2List) {
        doSetLocationCd2_InScope(locationCd2List);
    }

    protected void doSetLocationCd2_InScope(Collection<String> locationCd2List) {
        regINS(CK_INS, cTL(locationCd2List), xgetCValueLocationCd2(), "LOCATION_CD2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2List The collection of locationCd2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_NotInScope(Collection<String> locationCd2List) {
        doSetLocationCd2_NotInScope(locationCd2List);
    }

    protected void doSetLocationCd2_NotInScope(Collection<String> locationCd2List) {
        regINS(CK_NINS, cTL(locationCd2List), xgetCValueLocationCd2(), "LOCATION_CD2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)} <br>
     * <pre>e.g. setLocationCd2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param locationCd2 The value of locationCd2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLocationCd2_LikeSearch(String locationCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(locationCd2), xgetCValueLocationCd2(), "LOCATION_CD2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLocationCd2_NotLikeSearch(String locationCd2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(locationCd2), xgetCValueLocationCd2(), "LOCATION_CD2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     * @param locationCd2 The value of locationCd2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationCd2_PrefixSearch(String locationCd2) {
        setLocationCd2_LikeSearch(locationCd2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     */
    public void setLocationCd2_IsNull() { regLocationCd2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     */
    public void setLocationCd2_IsNullOrEmpty() { regLocationCd2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_CD2: {VARCHAR(30)}
     */
    public void setLocationCd2_IsNotNull() { regLocationCd2(CK_ISNN, DOBJ); }

    protected void regLocationCd2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationCd2(), "LOCATION_CD2"); }
    protected abstract ConditionValue xgetCValueLocationCd2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_Equal(String userCd) {
        doSetUserCd_Equal(fRES(userCd));
    }

    protected void doSetUserCd_Equal(String userCd) {
        regUserCd(CK_EQ, userCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotEqual(String userCd) {
        doSetUserCd_NotEqual(fRES(userCd));
    }

    protected void doSetUserCd_NotEqual(String userCd) {
        regUserCd(CK_NES, userCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCdList The collection of userCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_InScope(Collection<String> userCdList) {
        doSetUserCd_InScope(userCdList);
    }

    protected void doSetUserCd_InScope(Collection<String> userCdList) {
        regINS(CK_INS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCdList The collection of userCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_NotInScope(Collection<String> userCdList) {
        doSetUserCd_NotInScope(userCdList);
    }

    protected void doSetUserCd_NotInScope(Collection<String> userCdList) {
        regINS(CK_NINS, cTL(userCdList), xgetCValueUserCd(), "USER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setUserCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param userCd The value of userCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUserCd_LikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     */
    public void setUserCd_IsNull() { regUserCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     */
    public void setUserCd_IsNullOrEmpty() { regUserCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * USER_CD: {VARCHAR(30)}
     */
    public void setUserCd_IsNotNull() { regUserCd(CK_ISNN, DOBJ); }

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

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
    public HpSLCFunction<TTransferCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TTransferCB.class);
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
    public HpSLCFunction<TTransferCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TTransferCB.class);
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
    public HpSLCFunction<TTransferCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TTransferCB.class);
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
    public HpSLCFunction<TTransferCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TTransferCB.class);
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
    public HpSLCFunction<TTransferCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TTransferCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TTransferCB&gt;() {
     *     public void query(TTransferCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TTransferCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TTransferCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TTransferCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TTransferCQ sq);

    protected TTransferCB xcreateScalarConditionCB() {
        TTransferCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TTransferCB xcreateScalarConditionPartitionByCB() {
        TTransferCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TTransferCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTransferCB cb = new TTransferCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "TRANSFER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TTransferCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TTransferCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TTransferCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TTransferCB cb = new TTransferCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "TRANSFER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TTransferCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TTransferCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TTransferCB cb = new TTransferCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TTransferCQ sq);

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
    protected TTransferCB newMyCB() {
        return new TTransferCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TTransferCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
