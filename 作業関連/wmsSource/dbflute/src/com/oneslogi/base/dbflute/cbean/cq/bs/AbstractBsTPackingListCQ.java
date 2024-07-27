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
 * The abstract condition-query of t_packing_list.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTPackingListCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTPackingListCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_packing_list";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_Equal(Long packingListId) {
        doSetPackingListId_Equal(packingListId);
    }

    protected void doSetPackingListId_Equal(Long packingListId) {
        regPackingListId(CK_EQ, packingListId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_NotEqual(Long packingListId) {
        doSetPackingListId_NotEqual(packingListId);
    }

    protected void doSetPackingListId_NotEqual(Long packingListId) {
        regPackingListId(CK_NES, packingListId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_GreaterThan(Long packingListId) {
        regPackingListId(CK_GT, packingListId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_LessThan(Long packingListId) {
        regPackingListId(CK_LT, packingListId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_GreaterEqual(Long packingListId) {
        regPackingListId(CK_GE, packingListId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListId The value of packingListId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPackingListId_LessEqual(Long packingListId) {
        regPackingListId(CK_LE, packingListId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of packingListId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of packingListId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPackingListId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePackingListId(), "PACKING_LIST_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListIdList The collection of packingListId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingListId_InScope(Collection<Long> packingListIdList) {
        doSetPackingListId_InScope(packingListIdList);
    }

    protected void doSetPackingListId_InScope(Collection<Long> packingListIdList) {
        regINS(CK_INS, cTL(packingListIdList), xgetCValuePackingListId(), "PACKING_LIST_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param packingListIdList The collection of packingListId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingListId_NotInScope(Collection<Long> packingListIdList) {
        doSetPackingListId_NotInScope(packingListIdList);
    }

    protected void doSetPackingListId_NotInScope(Collection<Long> packingListIdList) {
        regINS(CK_NINS, cTL(packingListIdList), xgetCValuePackingListId(), "PACKING_LIST_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPackingListId_IsNull() { regPackingListId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setPackingListId_IsNotNull() { regPackingListId(CK_ISNN, DOBJ); }

    protected void regPackingListId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingListId(), "PACKING_LIST_ID"); }
    protected abstract ConditionValue xgetCValuePackingListId();

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
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_Equal(String packingNo) {
        doSetPackingNo_Equal(fRES(packingNo));
    }

    protected void doSetPackingNo_Equal(String packingNo) {
        regPackingNo(CK_EQ, packingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_NotEqual(String packingNo) {
        doSetPackingNo_NotEqual(fRES(packingNo));
    }

    protected void doSetPackingNo_NotEqual(String packingNo) {
        regPackingNo(CK_NES, packingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_GreaterThan(String packingNo) {
        regPackingNo(CK_GT, fRES(packingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_LessThan(String packingNo) {
        regPackingNo(CK_LT, fRES(packingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_GreaterEqual(String packingNo) {
        regPackingNo(CK_GE, fRES(packingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_LessEqual(String packingNo) {
        regPackingNo(CK_LE, fRES(packingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNoList The collection of packingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_InScope(Collection<String> packingNoList) {
        doSetPackingNo_InScope(packingNoList);
    }

    protected void doSetPackingNo_InScope(Collection<String> packingNoList) {
        regINS(CK_INS, cTL(packingNoList), xgetCValuePackingNo(), "PACKING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNoList The collection of packingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_NotInScope(Collection<String> packingNoList) {
        doSetPackingNo_NotInScope(packingNoList);
    }

    protected void doSetPackingNo_NotInScope(Collection<String> packingNoList) {
        regINS(CK_NINS, cTL(packingNoList), xgetCValuePackingNo(), "PACKING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPackingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packingNo The value of packingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackingNo_LikeSearch(String packingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packingNo), xgetCValuePackingNo(), "PACKING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackingNo_NotLikeSearch(String packingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packingNo), xgetCValuePackingNo(), "PACKING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     * @param packingNo The value of packingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingNo_PrefixSearch(String packingNo) {
        setPackingNo_LikeSearch(packingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNull() { regPackingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNullOrEmpty() { regPackingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_NO: {VARCHAR(30)}
     */
    public void setPackingNo_IsNotNull() { regPackingNo(CK_ISNN, DOBJ); }

    protected void regPackingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingNo(), "PACKING_NO"); }
    protected abstract ConditionValue xgetCValuePackingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_Equal(String packingRowNo) {
        doSetPackingRowNo_Equal(fRES(packingRowNo));
    }

    protected void doSetPackingRowNo_Equal(String packingRowNo) {
        regPackingRowNo(CK_EQ, packingRowNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_NotEqual(String packingRowNo) {
        doSetPackingRowNo_NotEqual(fRES(packingRowNo));
    }

    protected void doSetPackingRowNo_NotEqual(String packingRowNo) {
        regPackingRowNo(CK_NES, packingRowNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_GreaterThan(String packingRowNo) {
        regPackingRowNo(CK_GT, fRES(packingRowNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_LessThan(String packingRowNo) {
        regPackingRowNo(CK_LT, fRES(packingRowNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_GreaterEqual(String packingRowNo) {
        regPackingRowNo(CK_GE, fRES(packingRowNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_LessEqual(String packingRowNo) {
        regPackingRowNo(CK_LE, fRES(packingRowNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNoList The collection of packingRowNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_InScope(Collection<String> packingRowNoList) {
        doSetPackingRowNo_InScope(packingRowNoList);
    }

    protected void doSetPackingRowNo_InScope(Collection<String> packingRowNoList) {
        regINS(CK_INS, cTL(packingRowNoList), xgetCValuePackingRowNo(), "PACKING_ROW_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNoList The collection of packingRowNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_NotInScope(Collection<String> packingRowNoList) {
        doSetPackingRowNo_NotInScope(packingRowNoList);
    }

    protected void doSetPackingRowNo_NotInScope(Collection<String> packingRowNoList) {
        regINS(CK_NINS, cTL(packingRowNoList), xgetCValuePackingRowNo(), "PACKING_ROW_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPackingRowNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param packingRowNo The value of packingRowNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPackingRowNo_LikeSearch(String packingRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(packingRowNo), xgetCValuePackingRowNo(), "PACKING_ROW_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPackingRowNo_NotLikeSearch(String packingRowNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(packingRowNo), xgetCValuePackingRowNo(), "PACKING_ROW_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     * @param packingRowNo The value of packingRowNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPackingRowNo_PrefixSearch(String packingRowNo) {
        setPackingRowNo_LikeSearch(packingRowNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setPackingRowNo_IsNull() { regPackingRowNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setPackingRowNo_IsNullOrEmpty() { regPackingRowNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PACKING_ROW_NO: {VARCHAR(30)}
     */
    public void setPackingRowNo_IsNotNull() { regPackingRowNo(CK_ISNN, DOBJ); }

    protected void regPackingRowNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePackingRowNo(), "PACKING_ROW_NO"); }
    protected abstract ConditionValue xgetCValuePackingRowNo();

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
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_Equal(String shippingSlipRowNoSn) {
        doSetShippingSlipRowNoSn_Equal(fRES(shippingSlipRowNoSn));
    }

    protected void doSetShippingSlipRowNoSn_Equal(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_EQ, shippingSlipRowNoSn);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_NotEqual(String shippingSlipRowNoSn) {
        doSetShippingSlipRowNoSn_NotEqual(fRES(shippingSlipRowNoSn));
    }

    protected void doSetShippingSlipRowNoSn_NotEqual(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_NES, shippingSlipRowNoSn);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_GreaterThan(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_GT, fRES(shippingSlipRowNoSn));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_LessThan(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_LT, fRES(shippingSlipRowNoSn));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_GreaterEqual(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_GE, fRES(shippingSlipRowNoSn));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_LessEqual(String shippingSlipRowNoSn) {
        regShippingSlipRowNoSn(CK_LE, fRES(shippingSlipRowNoSn));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSnList The collection of shippingSlipRowNoSn as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_InScope(Collection<String> shippingSlipRowNoSnList) {
        doSetShippingSlipRowNoSn_InScope(shippingSlipRowNoSnList);
    }

    protected void doSetShippingSlipRowNoSn_InScope(Collection<String> shippingSlipRowNoSnList) {
        regINS(CK_INS, cTL(shippingSlipRowNoSnList), xgetCValueShippingSlipRowNoSn(), "SHIPPING_SLIP_ROW_NO_SN");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSnList The collection of shippingSlipRowNoSn as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_NotInScope(Collection<String> shippingSlipRowNoSnList) {
        doSetShippingSlipRowNoSn_NotInScope(shippingSlipRowNoSnList);
    }

    protected void doSetShippingSlipRowNoSn_NotInScope(Collection<String> shippingSlipRowNoSnList) {
        regINS(CK_NINS, cTL(shippingSlipRowNoSnList), xgetCValueShippingSlipRowNoSn(), "SHIPPING_SLIP_ROW_NO_SN");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingSlipRowNoSn_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingSlipRowNoSn_LikeSearch(String shippingSlipRowNoSn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingSlipRowNoSn), xgetCValueShippingSlipRowNoSn(), "SHIPPING_SLIP_ROW_NO_SN", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipRowNoSn_NotLikeSearch(String shippingSlipRowNoSn, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipRowNoSn), xgetCValueShippingSlipRowNoSn(), "SHIPPING_SLIP_ROW_NO_SN", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     * @param shippingSlipRowNoSn The value of shippingSlipRowNoSn as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipRowNoSn_PrefixSearch(String shippingSlipRowNoSn) {
        setShippingSlipRowNoSn_LikeSearch(shippingSlipRowNoSn, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     */
    public void setShippingSlipRowNoSn_IsNull() { regShippingSlipRowNoSn(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     */
    public void setShippingSlipRowNoSn_IsNullOrEmpty() { regShippingSlipRowNoSn(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)}
     */
    public void setShippingSlipRowNoSn_IsNotNull() { regShippingSlipRowNoSn(CK_ISNN, DOBJ); }

    protected void regShippingSlipRowNoSn(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipRowNoSn(), "SHIPPING_SLIP_ROW_NO_SN"); }
    protected abstract ConditionValue xgetCValueShippingSlipRowNoSn();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
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
     * PRODUCT_CD: {VARCHAR(30)}
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
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterThan(String productCd) {
        regProductCd(CK_GT, fRES(productCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessThan(String productCd) {
        regProductCd(CK_LT, fRES(productCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_GreaterEqual(String productCd) {
        regProductCd(CK_GE, fRES(productCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_LessEqual(String productCd) {
        regProductCd(CK_LE, fRES(productCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
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
     * PRODUCT_CD: {VARCHAR(30)}
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
     * PRODUCT_CD: {VARCHAR(30)} <br>
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
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProductCd_NotLikeSearch(String productCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(productCd), xgetCValueProductCd(), "PRODUCT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     * @param productCd The value of productCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductCd_PrefixSearch(String productCd) {
        setProductCd_LikeSearch(productCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNull() { regProductCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNullOrEmpty() { regProductCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_CD: {VARCHAR(30)}
     */
    public void setProductCd_IsNotNull() { regProductCd(CK_ISNN, DOBJ); }

    protected void regProductCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductCd(), "PRODUCT_CD"); }
    protected abstract ConditionValue xgetCValueProductCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_Equal(Long num) {
        doSetNum_Equal(num);
    }

    protected void doSetNum_Equal(Long num) {
        regNum(CK_EQ, num);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_NotEqual(Long num) {
        doSetNum_NotEqual(num);
    }

    protected void doSetNum_NotEqual(Long num) {
        regNum(CK_NES, num);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterThan(Long num) {
        regNum(CK_GT, num);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessThan(Long num) {
        regNum(CK_LT, num);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_GreaterEqual(Long num) {
        regNum(CK_GE, num);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param num The value of num as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setNum_LessEqual(Long num) {
        regNum(CK_LE, num);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param minNumber The min number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of num. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueNum(), "NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param numList The collection of num as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_InScope(Collection<Long> numList) {
        doSetNum_InScope(numList);
    }

    protected void doSetNum_InScope(Collection<Long> numList) {
        regINS(CK_INS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * NUM: {BIGINT(19)}
     * @param numList The collection of num as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNum_NotInScope(Collection<Long> numList) {
        doSetNum_NotInScope(numList);
    }

    protected void doSetNum_NotInScope(Collection<Long> numList) {
        regINS(CK_NINS, cTL(numList), xgetCValueNum(), "NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     */
    public void setNum_IsNull() { regNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NUM: {BIGINT(19)}
     */
    public void setNum_IsNotNull() { regNum(CK_ISNN, DOBJ); }

    protected void regNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNum(), "NUM"); }
    protected abstract ConditionValue xgetCValueNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_Equal(String carrierSlipNo) {
        doSetCarrierSlipNo_Equal(fRES(carrierSlipNo));
    }

    protected void doSetCarrierSlipNo_Equal(String carrierSlipNo) {
        regCarrierSlipNo(CK_EQ, carrierSlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_NotEqual(String carrierSlipNo) {
        doSetCarrierSlipNo_NotEqual(fRES(carrierSlipNo));
    }

    protected void doSetCarrierSlipNo_NotEqual(String carrierSlipNo) {
        regCarrierSlipNo(CK_NES, carrierSlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_GreaterThan(String carrierSlipNo) {
        regCarrierSlipNo(CK_GT, fRES(carrierSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_LessThan(String carrierSlipNo) {
        regCarrierSlipNo(CK_LT, fRES(carrierSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_GreaterEqual(String carrierSlipNo) {
        regCarrierSlipNo(CK_GE, fRES(carrierSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_LessEqual(String carrierSlipNo) {
        regCarrierSlipNo(CK_LE, fRES(carrierSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNoList The collection of carrierSlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_InScope(Collection<String> carrierSlipNoList) {
        doSetCarrierSlipNo_InScope(carrierSlipNoList);
    }

    protected void doSetCarrierSlipNo_InScope(Collection<String> carrierSlipNoList) {
        regINS(CK_INS, cTL(carrierSlipNoList), xgetCValueCarrierSlipNo(), "CARRIER_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNoList The collection of carrierSlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_NotInScope(Collection<String> carrierSlipNoList) {
        doSetCarrierSlipNo_NotInScope(carrierSlipNoList);
    }

    protected void doSetCarrierSlipNo_NotInScope(Collection<String> carrierSlipNoList) {
        regINS(CK_NINS, cTL(carrierSlipNoList), xgetCValueCarrierSlipNo(), "CARRIER_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setCarrierSlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierSlipNo The value of carrierSlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierSlipNo_LikeSearch(String carrierSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierSlipNo), xgetCValueCarrierSlipNo(), "CARRIER_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierSlipNo_NotLikeSearch(String carrierSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierSlipNo), xgetCValueCarrierSlipNo(), "CARRIER_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     * @param carrierSlipNo The value of carrierSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierSlipNo_PrefixSearch(String carrierSlipNo) {
        setCarrierSlipNo_LikeSearch(carrierSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     */
    public void setCarrierSlipNo_IsNull() { regCarrierSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     */
    public void setCarrierSlipNo_IsNullOrEmpty() { regCarrierSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_SLIP_NO: {VARCHAR(30)}
     */
    public void setCarrierSlipNo_IsNotNull() { regCarrierSlipNo(CK_ISNN, DOBJ); }

    protected void regCarrierSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierSlipNo(), "CARRIER_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueCarrierSlipNo();

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
    public HpSLCFunction<TPackingListCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TPackingListCB.class);
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
    public HpSLCFunction<TPackingListCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TPackingListCB.class);
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
    public HpSLCFunction<TPackingListCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TPackingListCB.class);
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
    public HpSLCFunction<TPackingListCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TPackingListCB.class);
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
    public HpSLCFunction<TPackingListCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TPackingListCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TPackingListCB&gt;() {
     *     public void query(TPackingListCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TPackingListCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TPackingListCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingListCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TPackingListCQ sq);

    protected TPackingListCB xcreateScalarConditionCB() {
        TPackingListCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TPackingListCB xcreateScalarConditionPartitionByCB() {
        TPackingListCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TPackingListCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingListCB cb = new TPackingListCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "PACKING_LIST_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TPackingListCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TPackingListCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TPackingListCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TPackingListCB cb = new TPackingListCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "PACKING_LIST_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TPackingListCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TPackingListCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TPackingListCB cb = new TPackingListCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TPackingListCQ sq);

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
    protected TPackingListCB newMyCB() {
        return new TPackingListCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TPackingListCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
