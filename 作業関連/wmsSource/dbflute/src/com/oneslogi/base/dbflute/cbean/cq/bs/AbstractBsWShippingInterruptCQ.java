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
 * The abstract condition-query of w_shipping_interrupt.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsWShippingInterruptCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsWShippingInterruptCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "w_shipping_interrupt";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_Equal(Long shippingInstHId) {
        doSetShippingInstHId_Equal(shippingInstHId);
    }

    protected void doSetShippingInstHId_Equal(Long shippingInstHId) {
        regShippingInstHId(CK_EQ, shippingInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotEqual(Long shippingInstHId) {
        doSetShippingInstHId_NotEqual(shippingInstHId);
    }

    protected void doSetShippingInstHId_NotEqual(Long shippingInstHId) {
        regShippingInstHId(CK_NES, shippingInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterThan(Long shippingInstHId) {
        regShippingInstHId(CK_GT, shippingInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessThan(Long shippingInstHId) {
        regShippingInstHId(CK_LT, shippingInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_GreaterEqual(Long shippingInstHId) {
        regShippingInstHId(CK_GE, shippingInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHId The value of shippingInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingInstHId_LessEqual(Long shippingInstHId) {
        regShippingInstHId(CK_LE, shippingInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_InScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_InScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_INS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     * @param shippingInstHIdList The collection of shippingInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        doSetShippingInstHId_NotInScope(shippingInstHIdList);
    }

    protected void doSetShippingInstHId_NotInScope(Collection<Long> shippingInstHIdList) {
        regINS(CK_NINS, cTL(shippingInstHIdList), xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setShippingInstHId_IsNull() { regShippingInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_INST_H_ID: {PK, NotNull, BIGINT(19)}
     */
    public void setShippingInstHId_IsNotNull() { regShippingInstHId(CK_ISNN, DOBJ); }

    protected void regShippingInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingInstHId(), "SHIPPING_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_Equal(Long allocInstHId) {
        doSetAllocInstHId_Equal(allocInstHId);
    }

    protected void doSetAllocInstHId_Equal(Long allocInstHId) {
        regAllocInstHId(CK_EQ, allocInstHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotEqual(Long allocInstHId) {
        doSetAllocInstHId_NotEqual(allocInstHId);
    }

    protected void doSetAllocInstHId_NotEqual(Long allocInstHId) {
        regAllocInstHId(CK_NES, allocInstHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHIdList The collection of allocInstHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_InScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_InScope(Collection<Long> allocInstHIdList) {
        regINS(CK_INS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {NotNull, BIGINT(19)}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_Equal(Long centerId) {
        doSetCenterId_Equal(centerId);
    }

    protected void doSetCenterId_Equal(Long centerId) {
        regCenterId(CK_EQ, centerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_NotEqual(Long centerId) {
        doSetCenterId_NotEqual(centerId);
    }

    protected void doSetCenterId_NotEqual(Long centerId) {
        regCenterId(CK_NES, centerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_InScope(Collection<Long> centerIdList) {
        doSetCenterId_InScope(centerIdList);
    }

    protected void doSetCenterId_InScope(Collection<Long> centerIdList) {
        regINS(CK_INS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'in-scope'. (NotNull)
     */
    public void inScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_InScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", false);
    }
    public abstract String keepCenterId_InScopeRelation_MCenter(MCenterCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select CENTER_ID from m_center where ...)} <br />
     * m_center by my CENTER_ID, named 'MCenter'.
     * @param subCBLambda The callback for sub-query of MCenter for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCenter(SubQuery<MCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCB cb = new MCenterCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepCenterId_NotInScopeRelation_MCenter(cb.query());
        registerInScopeRelation(cb.query(), "CENTER_ID", "CENTER_ID", pp, "mCenter", true);
    }
    public abstract String keepCenterId_NotInScopeRelation_MCenter(MCenterCQ sq);

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
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
     * USER_CD: {NotNull, VARCHAR(30)}
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
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterThan(String userCd) {
        regUserCd(CK_GT, fRES(userCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessThan(String userCd) {
        regUserCd(CK_LT, fRES(userCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_GreaterEqual(String userCd) {
        regUserCd(CK_GE, fRES(userCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_LessEqual(String userCd) {
        regUserCd(CK_LE, fRES(userCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
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
     * USER_CD: {NotNull, VARCHAR(30)}
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
     * USER_CD: {NotNull, VARCHAR(30)} <br>
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
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUserCd_NotLikeSearch(String userCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(userCd), xgetCValueUserCd(), "USER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * USER_CD: {NotNull, VARCHAR(30)}
     * @param userCd The value of userCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUserCd_PrefixSearch(String userCd) {
        setUserCd_LikeSearch(userCd, xcLSOPPre());
    }

    protected void regUserCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUserCd(), "USER_CD"); }
    protected abstract ConditionValue xgetCValueUserCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_Equal(Long productId) {
        doSetProductId_Equal(productId);
    }

    protected void doSetProductId_Equal(Long productId) {
        regProductId(CK_EQ, productId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_NotEqual(Long productId) {
        doSetProductId_NotEqual(productId);
    }

    protected void doSetProductId_NotEqual(Long productId) {
        regProductId(CK_NES, productId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterThan(Long productId) {
        regProductId(CK_GT, productId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessThan(Long productId) {
        regProductId(CK_LT, productId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_GreaterEqual(Long productId) {
        regProductId(CK_GE, productId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productId The value of productId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProductId_LessEqual(Long productId) {
        regProductId(CK_LE, productId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param minNumber The min number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of productId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProductId(), "PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productIdList The collection of productId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_InScope(Collection<Long> productIdList) {
        doSetProductId_InScope(productIdList);
    }

    protected void doSetProductId_InScope(Collection<Long> productIdList) {
        regINS(CK_INS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     * @param productIdList The collection of productId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProductId_NotInScope(Collection<Long> productIdList) {
        doSetProductId_NotInScope(productIdList);
    }

    protected void doSetProductId_NotInScope(Collection<Long> productIdList) {
        regINS(CK_NINS, cTL(productIdList), xgetCValueProductId(), "PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select PRODUCT_ID from m_product where ...)} <br />
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNull() { regProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PRODUCT_ID: {IX, BIGINT(19), FK to m_product}
     */
    public void setProductId_IsNotNull() { regProductId(CK_ISNN, DOBJ); }

    protected void regProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProductId(), "PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_Equal(java.math.BigDecimal instNum) {
        doSetInstNum_Equal(instNum);
    }

    protected void doSetInstNum_Equal(java.math.BigDecimal instNum) {
        regInstNum(CK_EQ, instNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_NotEqual(java.math.BigDecimal instNum) {
        doSetInstNum_NotEqual(instNum);
    }

    protected void doSetInstNum_NotEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_NES, instNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterThan(java.math.BigDecimal instNum) {
        regInstNum(CK_GT, instNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessThan(java.math.BigDecimal instNum) {
        regInstNum(CK_LT, instNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_GreaterEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_GE, instNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNum The value of instNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstNum_LessEqual(java.math.BigDecimal instNum) {
        regInstNum(CK_LE, instNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param minNumber The min number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of instNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInstNum_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInstNum(), "INST_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNumList The collection of instNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_InScope(instNumList);
    }

    protected void doSetInstNum_InScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_INS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INST_NUM: {NotNull, DECIMAL(14, 4)}
     * @param instNumList The collection of instNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        doSetInstNum_NotInScope(instNumList);
    }

    protected void doSetInstNum_NotInScope(Collection<java.math.BigDecimal> instNumList) {
        regINS(CK_NINS, cTL(instNumList), xgetCValueInstNum(), "INST_NUM");
    }

    protected void regInstNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstNum(), "INST_NUM"); }
    protected abstract ConditionValue xgetCValueInstNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_Equal(java.math.BigDecimal spgQtyOns) {
        doSetSpgQtyOns_Equal(spgQtyOns);
    }

    protected void doSetSpgQtyOns_Equal(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_EQ, spgQtyOns);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_NotEqual(java.math.BigDecimal spgQtyOns) {
        doSetSpgQtyOns_NotEqual(spgQtyOns);
    }

    protected void doSetSpgQtyOns_NotEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_NES, spgQtyOns);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_GreaterThan(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_GT, spgQtyOns);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_LessThan(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_LT, spgQtyOns);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_GreaterEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_GE, spgQtyOns);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOns The value of spgQtyOns as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyOns_LessEqual(java.math.BigDecimal spgQtyOns) {
        regSpgQtyOns(CK_LE, spgQtyOns);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param minNumber The min number of spgQtyOns. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spgQtyOns. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpgQtyOns_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpgQtyOns(), "SPG_QTY_ONS", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOnsList The collection of spgQtyOns as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyOns_InScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        doSetSpgQtyOns_InScope(spgQtyOnsList);
    }

    protected void doSetSpgQtyOns_InScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        regINS(CK_INS, cTL(spgQtyOnsList), xgetCValueSpgQtyOns(), "SPG_QTY_ONS");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     * @param spgQtyOnsList The collection of spgQtyOns as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyOns_NotInScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        doSetSpgQtyOns_NotInScope(spgQtyOnsList);
    }

    protected void doSetSpgQtyOns_NotInScope(Collection<java.math.BigDecimal> spgQtyOnsList) {
        regINS(CK_NINS, cTL(spgQtyOnsList), xgetCValueSpgQtyOns(), "SPG_QTY_ONS");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     */
    public void setSpgQtyOns_IsNull() { regSpgQtyOns(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_ONS: {DECIMAL(14, 4)}
     */
    public void setSpgQtyOns_IsNotNull() { regSpgQtyOns(CK_ISNN, DOBJ); }

    protected void regSpgQtyOns(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpgQtyOns(), "SPG_QTY_ONS"); }
    protected abstract ConditionValue xgetCValueSpgQtyOns();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_Equal(java.math.BigDecimal spgQtyRemain) {
        doSetSpgQtyRemain_Equal(spgQtyRemain);
    }

    protected void doSetSpgQtyRemain_Equal(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_EQ, spgQtyRemain);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_NotEqual(java.math.BigDecimal spgQtyRemain) {
        doSetSpgQtyRemain_NotEqual(spgQtyRemain);
    }

    protected void doSetSpgQtyRemain_NotEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_NES, spgQtyRemain);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_GreaterThan(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_GT, spgQtyRemain);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_LessThan(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_LT, spgQtyRemain);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_GreaterEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_GE, spgQtyRemain);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemain The value of spgQtyRemain as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_LessEqual(java.math.BigDecimal spgQtyRemain) {
        regSpgQtyRemain(CK_LE, spgQtyRemain);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param minNumber The min number of spgQtyRemain. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of spgQtyRemain. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSpgQtyRemain_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemainList The collection of spgQtyRemain as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_InScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        doSetSpgQtyRemain_InScope(spgQtyRemainList);
    }

    protected void doSetSpgQtyRemain_InScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        regINS(CK_INS, cTL(spgQtyRemainList), xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     * @param spgQtyRemainList The collection of spgQtyRemain as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpgQtyRemain_NotInScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        doSetSpgQtyRemain_NotInScope(spgQtyRemainList);
    }

    protected void doSetSpgQtyRemain_NotInScope(Collection<java.math.BigDecimal> spgQtyRemainList) {
        regINS(CK_NINS, cTL(spgQtyRemainList), xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     */
    public void setSpgQtyRemain_IsNull() { regSpgQtyRemain(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPG_QTY_REMAIN: {DECIMAL(14, 4)}
     */
    public void setSpgQtyRemain_IsNotNull() { regSpgQtyRemain(CK_ISNN, DOBJ); }

    protected void regSpgQtyRemain(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpgQtyRemain(), "SPG_QTY_REMAIN"); }
    protected abstract ConditionValue xgetCValueSpgQtyRemain();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_Equal(Long pieceNo) {
        doSetPieceNo_Equal(pieceNo);
    }

    protected void doSetPieceNo_Equal(Long pieceNo) {
        regPieceNo(CK_EQ, pieceNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_NotEqual(Long pieceNo) {
        doSetPieceNo_NotEqual(pieceNo);
    }

    protected void doSetPieceNo_NotEqual(Long pieceNo) {
        regPieceNo(CK_NES, pieceNo);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_GreaterThan(Long pieceNo) {
        regPieceNo(CK_GT, pieceNo);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_LessThan(Long pieceNo) {
        regPieceNo(CK_LT, pieceNo);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_GreaterEqual(Long pieceNo) {
        regPieceNo(CK_GE, pieceNo);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNo The value of pieceNo as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setPieceNo_LessEqual(Long pieceNo) {
        regPieceNo(CK_LE, pieceNo);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param minNumber The min number of pieceNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of pieceNo. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setPieceNo_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValuePieceNo(), "PIECE_NO", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNoList The collection of pieceNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPieceNo_InScope(Collection<Long> pieceNoList) {
        doSetPieceNo_InScope(pieceNoList);
    }

    protected void doSetPieceNo_InScope(Collection<Long> pieceNoList) {
        regINS(CK_INS, cTL(pieceNoList), xgetCValuePieceNo(), "PIECE_NO");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     * @param pieceNoList The collection of pieceNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPieceNo_NotInScope(Collection<Long> pieceNoList) {
        doSetPieceNo_NotInScope(pieceNoList);
    }

    protected void doSetPieceNo_NotInScope(Collection<Long> pieceNoList) {
        regINS(CK_NINS, cTL(pieceNoList), xgetCValuePieceNo(), "PIECE_NO");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     */
    public void setPieceNo_IsNull() { regPieceNo(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PIECE_NO: {BIGINT(19)}
     */
    public void setPieceNo_IsNotNull() { regPieceNo(CK_ISNN, DOBJ); }

    protected void regPieceNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePieceNo(), "PIECE_NO"); }
    protected abstract ConditionValue xgetCValuePieceNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_Equal(Long boxId) {
        doSetBoxId_Equal(boxId);
    }

    protected void doSetBoxId_Equal(Long boxId) {
        regBoxId(CK_EQ, boxId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_NotEqual(Long boxId) {
        doSetBoxId_NotEqual(boxId);
    }

    protected void doSetBoxId_NotEqual(Long boxId) {
        regBoxId(CK_NES, boxId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterThan(Long boxId) {
        regBoxId(CK_GT, boxId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessThan(Long boxId) {
        regBoxId(CK_LT, boxId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_GreaterEqual(Long boxId) {
        regBoxId(CK_GE, boxId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxId The value of boxId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBoxId_LessEqual(Long boxId) {
        regBoxId(CK_LE, boxId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param minNumber The min number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of boxId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBoxId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBoxId(), "BOX_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxIdList The collection of boxId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_InScope(Collection<Long> boxIdList) {
        doSetBoxId_InScope(boxIdList);
    }

    protected void doSetBoxId_InScope(Collection<Long> boxIdList) {
        regINS(CK_INS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     * @param boxIdList The collection of boxId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBoxId_NotInScope(Collection<Long> boxIdList) {
        doSetBoxId_NotInScope(boxIdList);
    }

    protected void doSetBoxId_NotInScope(Collection<Long> boxIdList) {
        regINS(CK_NINS, cTL(boxIdList), xgetCValueBoxId(), "BOX_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select BOX_ID from m_box where ...)} <br />
     * m_box by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'in-scope'. (NotNull)
     */
    public void inScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_InScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", false);
    }
    public abstract String keepBoxId_InScopeRelation_MBox(MBoxCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select BOX_ID from m_box where ...)} <br />
     * m_box by my BOX_ID, named 'MBox'.
     * @param subCBLambda The callback for sub-query of MBox for 'not in-scope'. (NotNull)
     */
    public void notInScopeMBox(SubQuery<MBoxCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBoxCB cb = new MBoxCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepBoxId_NotInScopeRelation_MBox(cb.query());
        registerInScopeRelation(cb.query(), "BOX_ID", "BOX_ID", pp, "mBox", true);
    }
    public abstract String keepBoxId_NotInScopeRelation_MBox(MBoxCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     */
    public void setBoxId_IsNull() { regBoxId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * BOX_ID: {IX, BIGINT(19), FK to m_box}
     */
    public void setBoxId_IsNotNull() { regBoxId(CK_ISNN, DOBJ); }

    protected void regBoxId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBoxId(), "BOX_ID"); }
    protected abstract ConditionValue xgetCValueBoxId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_Equal(String pickingWorkNo) {
        doSetPickingWorkNo_Equal(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_Equal(String pickingWorkNo) {
        regPickingWorkNo(CK_EQ, pickingWorkNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotEqual(String pickingWorkNo) {
        doSetPickingWorkNo_NotEqual(fRES(pickingWorkNo));
    }

    protected void doSetPickingWorkNo_NotEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_NES, pickingWorkNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterThan(String pickingWorkNo) {
        regPickingWorkNo(CK_GT, fRES(pickingWorkNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessThan(String pickingWorkNo) {
        regPickingWorkNo(CK_LT, fRES(pickingWorkNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_GreaterEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_GE, fRES(pickingWorkNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_LessEqual(String pickingWorkNo) {
        regPickingWorkNo(CK_LE, fRES(pickingWorkNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_InScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_InScope(Collection<String> pickingWorkNoList) {
        regINS(CK_INS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNoList The collection of pickingWorkNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        doSetPickingWorkNo_NotInScope(pickingWorkNoList);
    }

    protected void doSetPickingWorkNo_NotInScope(Collection<String> pickingWorkNoList) {
        regINS(CK_NINS, cTL(pickingWorkNoList), xgetCValuePickingWorkNo(), "PICKING_WORK_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setPickingWorkNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkNo The value of pickingWorkNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkNo_LikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkNo_NotLikeSearch(String pickingWorkNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkNo), xgetCValuePickingWorkNo(), "PICKING_WORK_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     * @param pickingWorkNo The value of pickingWorkNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkNo_PrefixSearch(String pickingWorkNo) {
        setPickingWorkNo_LikeSearch(pickingWorkNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNull() { regPickingWorkNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNullOrEmpty() { regPickingWorkNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_NO: {VARCHAR(30)}
     */
    public void setPickingWorkNo_IsNotNull() { regPickingWorkNo(CK_ISNN, DOBJ); }

    protected void regPickingWorkNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkNo(), "PICKING_WORK_NO"); }
    protected abstract ConditionValue xgetCValuePickingWorkNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
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
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
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
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterThan(String nizoroeNo) {
        regNizoroeNo(CK_GT, fRES(nizoroeNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessThan(String nizoroeNo) {
        regNizoroeNo(CK_LT, fRES(nizoroeNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_GreaterEqual(String nizoroeNo) {
        regNizoroeNo(CK_GE, fRES(nizoroeNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_LessEqual(String nizoroeNo) {
        regNizoroeNo(CK_LE, fRES(nizoroeNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
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
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
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
     * NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
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
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo_NotLikeSearch(String nizoroeNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo), xgetCValueNizoroeNo(), "NIZOROE_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO: {NotNull, VARCHAR(30)}
     * @param nizoroeNo The value of nizoroeNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo_PrefixSearch(String nizoroeNo) {
        setNizoroeNo_LikeSearch(nizoroeNo, xcLSOPPre());
    }

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
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_Equal(String nizoroeNo2) {
        doSetNizoroeNo2_Equal(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_Equal(String nizoroeNo2) {
        regNizoroeNo2(CK_EQ, nizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotEqual(String nizoroeNo2) {
        doSetNizoroeNo2_NotEqual(fRES(nizoroeNo2));
    }

    protected void doSetNizoroeNo2_NotEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_NES, nizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterThan(String nizoroeNo2) {
        regNizoroeNo2(CK_GT, fRES(nizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessThan(String nizoroeNo2) {
        regNizoroeNo2(CK_LT, fRES(nizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_GreaterEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_GE, fRES(nizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_LessEqual(String nizoroeNo2) {
        regNizoroeNo2(CK_LE, fRES(nizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_InScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_InScope(Collection<String> nizoroeNo2List) {
        regINS(CK_INS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2List The collection of nizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        doSetNizoroeNo2_NotInScope(nizoroeNo2List);
    }

    protected void doSetNizoroeNo2_NotInScope(Collection<String> nizoroeNo2List) {
        regINS(CK_NINS, cTL(nizoroeNo2List), xgetCValueNizoroeNo2(), "NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param nizoroeNo2 The value of nizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setNizoroeNo2_LikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setNizoroeNo2_NotLikeSearch(String nizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(nizoroeNo2), xgetCValueNizoroeNo2(), "NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     * @param nizoroeNo2 The value of nizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setNizoroeNo2_PrefixSearch(String nizoroeNo2) {
        setNizoroeNo2_LikeSearch(nizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNull() { regNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNullOrEmpty() { regNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setNizoroeNo2_IsNotNull() { regNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueNizoroeNo2(), "NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueNizoroeNo2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_Equal(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_Equal(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_EQ, daihyoNizoroeNo2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        doSetDaihyoNizoroeNo2_NotEqual(fRES(daihyoNizoroeNo2));
    }

    protected void doSetDaihyoNizoroeNo2_NotEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_NES, daihyoNizoroeNo2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GT, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessThan(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LT, fRES(daihyoNizoroeNo2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_GreaterEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_GE, fRES(daihyoNizoroeNo2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_LessEqual(String daihyoNizoroeNo2) {
        regDaihyoNizoroeNo2(CK_LE, fRES(daihyoNizoroeNo2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_InScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_InScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_INS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2List The collection of daihyoNizoroeNo2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        doSetDaihyoNizoroeNo2_NotInScope(daihyoNizoroeNo2List);
    }

    protected void doSetDaihyoNizoroeNo2_NotInScope(Collection<String> daihyoNizoroeNo2List) {
        regINS(CK_NINS, cTL(daihyoNizoroeNo2List), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * <pre>e.g. setDaihyoNizoroeNo2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_LikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDaihyoNizoroeNo2_NotLikeSearch(String daihyoNizoroeNo2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(daihyoNizoroeNo2), xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     * @param daihyoNizoroeNo2 The value of daihyoNizoroeNo2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDaihyoNizoroeNo2_PrefixSearch(String daihyoNizoroeNo2) {
        setDaihyoNizoroeNo2_LikeSearch(daihyoNizoroeNo2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNull() { regDaihyoNizoroeNo2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNullOrEmpty() { regDaihyoNizoroeNo2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DAIHYO_NIZOROE_NO2: {VARCHAR(30)}
     */
    public void setDaihyoNizoroeNo2_IsNotNull() { regDaihyoNizoroeNo2(CK_ISNN, DOBJ); }

    protected void regDaihyoNizoroeNo2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDaihyoNizoroeNo2(), "DAIHYO_NIZOROE_NO2"); }
    protected abstract ConditionValue xgetCValueDaihyoNizoroeNo2();

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
    public HpSLCFunction<WShippingInterruptCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, WShippingInterruptCB.class);
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
    public HpSLCFunction<WShippingInterruptCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, WShippingInterruptCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;WShippingInterruptCB&gt;() {
     *     public void query(WShippingInterruptCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<WShippingInterruptCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, WShippingInterruptCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(WShippingInterruptCQ sq);

    protected WShippingInterruptCB xcreateScalarConditionCB() {
        WShippingInterruptCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected WShippingInterruptCB xcreateScalarConditionPartitionByCB() {
        WShippingInterruptCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<WShippingInterruptCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_INST_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(WShippingInterruptCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<WShippingInterruptCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(WShippingInterruptCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_INST_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(WShippingInterruptCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<WShippingInterruptCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WShippingInterruptCB cb = new WShippingInterruptCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(WShippingInterruptCQ sq);

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
    protected WShippingInterruptCB newMyCB() {
        return new WShippingInterruptCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return WShippingInterruptCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
