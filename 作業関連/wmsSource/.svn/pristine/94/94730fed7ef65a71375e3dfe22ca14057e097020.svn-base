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
 * The abstract condition-query of t_shipping_record_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingRecordHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingRecordHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_record_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordHId The value of shippingRecordHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_GreaterThan(Long shippingRecordHId) {
        regShippingRecordHId(CK_GT, shippingRecordHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordHId The value of shippingRecordHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_LessThan(Long shippingRecordHId) {
        regShippingRecordHId(CK_LT, shippingRecordHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordHId The value of shippingRecordHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_GreaterEqual(Long shippingRecordHId) {
        regShippingRecordHId(CK_GE, shippingRecordHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordHId The value of shippingRecordHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingRecordHId_LessEqual(Long shippingRecordHId) {
        regShippingRecordHId(CK_LE, shippingRecordHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingRecordHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingRecordHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingRecordHIdList The collection of shippingRecordHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingRecordHId_NotInScope(Collection<Long> shippingRecordHIdList) {
        doSetShippingRecordHId_NotInScope(shippingRecordHIdList);
    }

    protected void doSetShippingRecordHId_NotInScope(Collection<Long> shippingRecordHIdList) {
        regINS(CK_NINS, cTL(shippingRecordHIdList), xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_RECORD_H_ID from t_shipping_record_b where ...)} <br>
     * t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingRecordBList for 'exists'. (NotNull)
     */
    public void existsTShippingRecordBList(SubQuery<TShippingRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingRecordHId_ExistsReferrer_TShippingRecordBList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", pp, "tShippingRecordBList");
    }
    public abstract String keepShippingRecordHId_ExistsReferrer_TShippingRecordBList(TShippingRecordBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_RECORD_H_ID from t_shipping_record_b where ...)} <br>
     * t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingRecordBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingRecordHId_NotExistsReferrer_TShippingRecordBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingRecordBList(SubQuery<TShippingRecordBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingRecordHId_NotExistsReferrer_TShippingRecordBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", pp, "tShippingRecordBList");
    }
    public abstract String keepShippingRecordHId_NotExistsReferrer_TShippingRecordBList(TShippingRecordBCQ sq);

    public void xsderiveTShippingRecordBList(String fn, SubQuery<TShippingRecordBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", pp, "tShippingRecordBList", al, op);
    }
    public abstract String keepShippingRecordHId_SpecifyDerivedReferrer_TShippingRecordBList(TShippingRecordBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_record_b where ...)} <br>
     * t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingRecordBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingRecordBCB> derivedTShippingRecordBList() {
        return xcreateQDRFunctionTShippingRecordBList();
    }
    protected HpQDRFunction<TShippingRecordBCB> xcreateQDRFunctionTShippingRecordBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingRecordBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingRecordBList(String fn, SubQuery<TShippingRecordBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordBCB cb = new TShippingRecordBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBList(cb.query()); String prpp = keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_RECORD_H_ID", "SHIPPING_RECORD_H_ID", sqpp, "tShippingRecordBList", rd, vl, prpp, op);
    }
    public abstract String keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBList(TShippingRecordBCQ sq);
    public abstract String keepShippingRecordHId_QueryDerivedReferrer_TShippingRecordBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingRecordHId_IsNull() { regShippingRecordHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingRecordHId_IsNotNull() { regShippingRecordHId(CK_ISNN, DOBJ); }

    protected void regShippingRecordHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingRecordHId(), "SHIPPING_RECORD_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingRecordHId();

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
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {NotNull, VARCHAR(8)} <br>
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
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

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
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_Equal(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_Equal(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_EQ, daihyoNizoroeNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        doSetDaihyoNizoroeNo_NotEqual(fRES(daihyoNizoroeNo));
    }

    protected void doSetDaihyoNizoroeNo_NotEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_NES, daihyoNizoroeNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GT, fRES(daihyoNizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessThan(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LT, fRES(daihyoNizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_GreaterEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_GE, fRES(daihyoNizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_LessEqual(String daihyoNizoroeNo) {
        regDaihyoNizoroeNo(CK_LE, fRES(daihyoNizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_InScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_InScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_INS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNoList The collection of daihyoNizoroeNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        doSetDaihyoNizoroeNo_NotInScope(daihyoNizoroeNoList);
    }

    protected void doSetDaihyoNizoroeNo_NotInScope(Collection<String> daihyoNizoroeNoList) {
        regINS(CK_NINS, cTL(daihyoNizoroeNoList), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_LikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo_NotLikeSearch(String daihyoNizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo), xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     * @param daihyoNizoroeNo The value of daihyoNizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo_PrefixSearch(String daihyoNizoroeNo) {
        setDaihyoNizoroeNo_LikeSearch(daihyoNizoroeNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNull() { regDaihyoNizoroeNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNullOrEmpty() { regDaihyoNizoroeNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo_IsNotNull() { regDaihyoNizoroeNo(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo(), "DAIHYO_NIZOROE_NO"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo();

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
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_Equal(String carrierRnm) {
        doSetCarrierRnm_Equal(fRES(carrierRnm));
    }

    protected void doSetCarrierRnm_Equal(String carrierRnm) {
        regCarrierRnm(CK_EQ, carrierRnm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_NotEqual(String carrierRnm) {
        doSetCarrierRnm_NotEqual(fRES(carrierRnm));
    }

    protected void doSetCarrierRnm_NotEqual(String carrierRnm) {
        regCarrierRnm(CK_NES, carrierRnm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_GreaterThan(String carrierRnm) {
        regCarrierRnm(CK_GT, fRES(carrierRnm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_LessThan(String carrierRnm) {
        regCarrierRnm(CK_LT, fRES(carrierRnm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_GreaterEqual(String carrierRnm) {
        regCarrierRnm(CK_GE, fRES(carrierRnm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_LessEqual(String carrierRnm) {
        regCarrierRnm(CK_LE, fRES(carrierRnm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnmList The collection of carrierRnm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_InScope(Collection<String> carrierRnmList) {
        doSetCarrierRnm_InScope(carrierRnmList);
    }

    protected void doSetCarrierRnm_InScope(Collection<String> carrierRnmList) {
        regINS(CK_INS, cTL(carrierRnmList), xgetCValueCarrierRnm(), "CARRIER_RNM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnmList The collection of carrierRnm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_NotInScope(Collection<String> carrierRnmList) {
        doSetCarrierRnm_NotInScope(carrierRnmList);
    }

    protected void doSetCarrierRnm_NotInScope(Collection<String> carrierRnmList) {
        regINS(CK_NINS, cTL(carrierRnmList), xgetCValueCarrierRnm(), "CARRIER_RNM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)} <br>
     * <pre>e.g. setCarrierRnm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param carrierRnm The value of carrierRnm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCarrierRnm_LikeSearch(String carrierRnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(carrierRnm), xgetCValueCarrierRnm(), "CARRIER_RNM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCarrierRnm_NotLikeSearch(String carrierRnm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(carrierRnm), xgetCValueCarrierRnm(), "CARRIER_RNM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     * @param carrierRnm The value of carrierRnm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCarrierRnm_PrefixSearch(String carrierRnm) {
        setCarrierRnm_LikeSearch(carrierRnm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     */
    public void setCarrierRnm_IsNull() { regCarrierRnm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     */
    public void setCarrierRnm_IsNullOrEmpty() { regCarrierRnm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CARRIER_RNM: {VARCHAR(60)}
     */
    public void setCarrierRnm_IsNotNull() { regCarrierRnm(CK_ISNN, DOBJ); }

    protected void regCarrierRnm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCarrierRnm(), "CARRIER_RNM"); }
    protected abstract ConditionValue xgetCValueCarrierRnm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_Equal(String salesNo2) {
        doSetSalesNo2_Equal(fRES(salesNo2));
    }

    protected void doSetSalesNo2_Equal(String salesNo2) {
        regSalesNo2(CK_EQ, salesNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_NotEqual(String salesNo2) {
        doSetSalesNo2_NotEqual(fRES(salesNo2));
    }

    protected void doSetSalesNo2_NotEqual(String salesNo2) {
        regSalesNo2(CK_NES, salesNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_GreaterThan(String salesNo2) {
        regSalesNo2(CK_GT, fRES(salesNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_LessThan(String salesNo2) {
        regSalesNo2(CK_LT, fRES(salesNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_GreaterEqual(String salesNo2) {
        regSalesNo2(CK_GE, fRES(salesNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_LessEqual(String salesNo2) {
        regSalesNo2(CK_LE, fRES(salesNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2List The collection of salesNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_InScope(Collection<String> salesNo2List) {
        doSetSalesNo2_InScope(salesNo2List);
    }

    protected void doSetSalesNo2_InScope(Collection<String> salesNo2List) {
        regINS(CK_INS, cTL(salesNo2List), xgetCValueSalesNo2(), "SALES_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2List The collection of salesNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_NotInScope(Collection<String> salesNo2List) {
        doSetSalesNo2_NotInScope(salesNo2List);
    }

    protected void doSetSalesNo2_NotInScope(Collection<String> salesNo2List) {
        regINS(CK_NINS, cTL(salesNo2List), xgetCValueSalesNo2(), "SALES_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesNo2 The value of salesNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesNo2_LikeSearch(String salesNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesNo2), xgetCValueSalesNo2(), "SALES_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesNo2_NotLikeSearch(String salesNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesNo2), xgetCValueSalesNo2(), "SALES_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     * @param salesNo2 The value of salesNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesNo2_PrefixSearch(String salesNo2) {
        setSalesNo2_LikeSearch(salesNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     */
    public void setSalesNo2_IsNull() { regSalesNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     */
    public void setSalesNo2_IsNullOrEmpty() { regSalesNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_NO2: {VARCHAR(30)}
     */
    public void setSalesNo2_IsNotNull() { regSalesNo2(CK_ISNN, DOBJ); }

    protected void regSalesNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesNo2(), "SALES_NO2"); }
    protected abstract ConditionValue xgetCValueSalesNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_Equal(String deliverySlipNo) {
        doSetDeliverySlipNo_Equal(fRES(deliverySlipNo));
    }

    protected void doSetDeliverySlipNo_Equal(String deliverySlipNo) {
        regDeliverySlipNo(CK_EQ, deliverySlipNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_NotEqual(String deliverySlipNo) {
        doSetDeliverySlipNo_NotEqual(fRES(deliverySlipNo));
    }

    protected void doSetDeliverySlipNo_NotEqual(String deliverySlipNo) {
        regDeliverySlipNo(CK_NES, deliverySlipNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_GreaterThan(String deliverySlipNo) {
        regDeliverySlipNo(CK_GT, fRES(deliverySlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_LessThan(String deliverySlipNo) {
        regDeliverySlipNo(CK_LT, fRES(deliverySlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_GreaterEqual(String deliverySlipNo) {
        regDeliverySlipNo(CK_GE, fRES(deliverySlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_LessEqual(String deliverySlipNo) {
        regDeliverySlipNo(CK_LE, fRES(deliverySlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNoList The collection of deliverySlipNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_InScope(Collection<String> deliverySlipNoList) {
        doSetDeliverySlipNo_InScope(deliverySlipNoList);
    }

    protected void doSetDeliverySlipNo_InScope(Collection<String> deliverySlipNoList) {
        regINS(CK_INS, cTL(deliverySlipNoList), xgetCValueDeliverySlipNo(), "DELIVERY_SLIP_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNoList The collection of deliverySlipNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_NotInScope(Collection<String> deliverySlipNoList) {
        doSetDeliverySlipNo_NotInScope(deliverySlipNoList);
    }

    protected void doSetDeliverySlipNo_NotInScope(Collection<String> deliverySlipNoList) {
        regINS(CK_NINS, cTL(deliverySlipNoList), xgetCValueDeliverySlipNo(), "DELIVERY_SLIP_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setDeliverySlipNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliverySlipNo The value of deliverySlipNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliverySlipNo_LikeSearch(String deliverySlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliverySlipNo), xgetCValueDeliverySlipNo(), "DELIVERY_SLIP_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliverySlipNo_NotLikeSearch(String deliverySlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliverySlipNo), xgetCValueDeliverySlipNo(), "DELIVERY_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     * @param deliverySlipNo The value of deliverySlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliverySlipNo_PrefixSearch(String deliverySlipNo) {
        setDeliverySlipNo_LikeSearch(deliverySlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     */
    public void setDeliverySlipNo_IsNull() { regDeliverySlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     */
    public void setDeliverySlipNo_IsNullOrEmpty() { regDeliverySlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_SLIP_NO: {VARCHAR(30)}
     */
    public void setDeliverySlipNo_IsNotNull() { regDeliverySlipNo(CK_ISNN, DOBJ); }

    protected void regDeliverySlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliverySlipNo(), "DELIVERY_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueDeliverySlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_Equal(String dStr) {
        doSetDStr_Equal(fRES(dStr));
    }

    protected void doSetDStr_Equal(String dStr) {
        regDStr(CK_EQ, dStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_NotEqual(String dStr) {
        doSetDStr_NotEqual(fRES(dStr));
    }

    protected void doSetDStr_NotEqual(String dStr) {
        regDStr(CK_NES, dStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_GreaterThan(String dStr) {
        regDStr(CK_GT, fRES(dStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_LessThan(String dStr) {
        regDStr(CK_LT, fRES(dStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_GreaterEqual(String dStr) {
        regDStr(CK_GE, fRES(dStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_LessEqual(String dStr) {
        regDStr(CK_LE, fRES(dStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStrList The collection of dStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_InScope(Collection<String> dStrList) {
        doSetDStr_InScope(dStrList);
    }

    protected void doSetDStr_InScope(Collection<String> dStrList) {
        regINS(CK_INS, cTL(dStrList), xgetCValueDStr(), "D_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStrList The collection of dStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_NotInScope(Collection<String> dStrList) {
        doSetDStr_NotInScope(dStrList);
    }

    protected void doSetDStr_NotInScope(Collection<String> dStrList) {
        regINS(CK_NINS, cTL(dStrList), xgetCValueDStr(), "D_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * D_STR: {VARCHAR(60)} <br>
     * <pre>e.g. setDStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param dStr The value of dStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDStr_LikeSearch(String dStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(dStr), xgetCValueDStr(), "D_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDStr_NotLikeSearch(String dStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(dStr), xgetCValueDStr(), "D_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * D_STR: {VARCHAR(60)}
     * @param dStr The value of dStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDStr_PrefixSearch(String dStr) {
        setDStr_LikeSearch(dStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     */
    public void setDStr_IsNull() { regDStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     */
    public void setDStr_IsNullOrEmpty() { regDStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * D_STR: {VARCHAR(60)}
     */
    public void setDStr_IsNotNull() { regDStr(CK_ISNN, DOBJ); }

    protected void regDStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDStr(), "D_STR"); }
    protected abstract ConditionValue xgetCValueDStr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_Equal(String iStr) {
        doSetIStr_Equal(fRES(iStr));
    }

    protected void doSetIStr_Equal(String iStr) {
        regIStr(CK_EQ, iStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_NotEqual(String iStr) {
        doSetIStr_NotEqual(fRES(iStr));
    }

    protected void doSetIStr_NotEqual(String iStr) {
        regIStr(CK_NES, iStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_GreaterThan(String iStr) {
        regIStr(CK_GT, fRES(iStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_LessThan(String iStr) {
        regIStr(CK_LT, fRES(iStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_GreaterEqual(String iStr) {
        regIStr(CK_GE, fRES(iStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_LessEqual(String iStr) {
        regIStr(CK_LE, fRES(iStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStrList The collection of iStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_InScope(Collection<String> iStrList) {
        doSetIStr_InScope(iStrList);
    }

    protected void doSetIStr_InScope(Collection<String> iStrList) {
        regINS(CK_INS, cTL(iStrList), xgetCValueIStr(), "I_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStrList The collection of iStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_NotInScope(Collection<String> iStrList) {
        doSetIStr_NotInScope(iStrList);
    }

    protected void doSetIStr_NotInScope(Collection<String> iStrList) {
        regINS(CK_NINS, cTL(iStrList), xgetCValueIStr(), "I_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * I_STR: {VARCHAR(60)} <br>
     * <pre>e.g. setIStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param iStr The value of iStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setIStr_LikeSearch(String iStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(iStr), xgetCValueIStr(), "I_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setIStr_NotLikeSearch(String iStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(iStr), xgetCValueIStr(), "I_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * I_STR: {VARCHAR(60)}
     * @param iStr The value of iStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setIStr_PrefixSearch(String iStr) {
        setIStr_LikeSearch(iStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     */
    public void setIStr_IsNull() { regIStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     */
    public void setIStr_IsNullOrEmpty() { regIStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * I_STR: {VARCHAR(60)}
     */
    public void setIStr_IsNotNull() { regIStr(CK_ISNN, DOBJ); }

    protected void regIStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueIStr(), "I_STR"); }
    protected abstract ConditionValue xgetCValueIStr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
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
     * S4_SEND_FLG: {CHAR(1)}
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
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_GreaterThan(String s4SendFlg) {
        regS4SendFlg(CK_GT, fRES(s4SendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_LessThan(String s4SendFlg) {
        regS4SendFlg(CK_LT, fRES(s4SendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_GreaterEqual(String s4SendFlg) {
        regS4SendFlg(CK_GE, fRES(s4SendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_LessEqual(String s4SendFlg) {
        regS4SendFlg(CK_LE, fRES(s4SendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
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
     * S4_SEND_FLG: {CHAR(1)}
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
     * S4_SEND_FLG: {CHAR(1)} <br>
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
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setS4SendFlg_NotLikeSearch(String s4SendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(s4SendFlg), xgetCValueS4SendFlg(), "S4_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     * @param s4SendFlg The value of s4SendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setS4SendFlg_PrefixSearch(String s4SendFlg) {
        setS4SendFlg_LikeSearch(s4SendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     */
    public void setS4SendFlg_IsNull() { regS4SendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     */
    public void setS4SendFlg_IsNullOrEmpty() { regS4SendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * S4_SEND_FLG: {CHAR(1)}
     */
    public void setS4SendFlg_IsNotNull() { regS4SendFlg(CK_ISNN, DOBJ); }

    protected void regS4SendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueS4SendFlg(), "S4_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueS4SendFlg();

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
    public HpSLCFunction<TShippingRecordHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingRecordHCB.class);
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
    public HpSLCFunction<TShippingRecordHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingRecordHCB.class);
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
    public HpSLCFunction<TShippingRecordHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingRecordHCB.class);
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
    public HpSLCFunction<TShippingRecordHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingRecordHCB.class);
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
    public HpSLCFunction<TShippingRecordHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingRecordHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingRecordHCB&gt;() {
     *     public void query(TShippingRecordHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingRecordHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingRecordHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingRecordHCQ sq);

    protected TShippingRecordHCB xcreateScalarConditionCB() {
        TShippingRecordHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingRecordHCB xcreateScalarConditionPartitionByCB() {
        TShippingRecordHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordHCB cb = new TShippingRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_RECORD_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingRecordHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingRecordHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingRecordHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingRecordHCB cb = new TShippingRecordHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_RECORD_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingRecordHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingRecordHCB cb = new TShippingRecordHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingRecordHCQ sq);

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
    protected TShippingRecordHCB newMyCB() {
        return new TShippingRecordHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingRecordHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
