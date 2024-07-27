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
 * The abstract condition-query of t_inventory_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTInventoryHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTInventoryHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_inventory_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_Equal(Long inventoryHId) {
        doSetInventoryHId_Equal(inventoryHId);
    }

    protected void doSetInventoryHId_Equal(Long inventoryHId) {
        regInventoryHId(CK_EQ, inventoryHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_NotEqual(Long inventoryHId) {
        doSetInventoryHId_NotEqual(inventoryHId);
    }

    protected void doSetInventoryHId_NotEqual(Long inventoryHId) {
        regInventoryHId(CK_NES, inventoryHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterThan(Long inventoryHId) {
        regInventoryHId(CK_GT, inventoryHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessThan(Long inventoryHId) {
        regInventoryHId(CK_LT, inventoryHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_GreaterEqual(Long inventoryHId) {
        regInventoryHId(CK_GE, inventoryHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHId The value of inventoryHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryHId_LessEqual(Long inventoryHId) {
        regInventoryHId(CK_LE, inventoryHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryHId(), "INVENTORY_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHIdList The collection of inventoryHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_InScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_InScope(Collection<Long> inventoryHIdList) {
        regINS(CK_INS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param inventoryHIdList The collection of inventoryHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        doSetInventoryHId_NotInScope(inventoryHIdList);
    }

    protected void doSetInventoryHId_NotInScope(Collection<Long> inventoryHIdList) {
        regINS(CK_NINS, cTL(inventoryHIdList), xgetCValueInventoryHId(), "INVENTORY_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_H_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_H_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBList for 'exists'. (NotNull)
     */
    public void existsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryBList");
    }
    public abstract String keepInventoryHId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select INVENTORY_H_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryInstList for 'exists'. (NotNull)
     */
    public void existsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_ExistsReferrer_TInventoryInstList(cb.query());
        registerExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryInstList");
    }
    public abstract String keepInventoryHId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_H_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_H_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of InventoryHId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryBList");
    }
    public abstract String keepInventoryHId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select INVENTORY_H_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of InventoryHId_NotExistsReferrer_TInventoryInstList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepInventoryHId_NotExistsReferrer_TInventoryInstList(cb.query());
        registerNotExistsReferrer(cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryInstList");
    }
    public abstract String keepInventoryHId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepInventoryHId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepInventoryHId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepInventoryHId_SpecifyDerivedReferrer_TInventoryInstList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", pp, "tInventoryInstList", al, op);
    }
    public abstract String keepInventoryHId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by INVENTORY_H_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBList() {
        return xcreateQDRFunctionTInventoryBList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepInventoryHId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepInventoryHId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepInventoryHId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepInventoryHId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_inst where ...)} <br>
     * t_inventory_inst by INVENTORY_H_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryInstList()</span>.<span style="color: #CC4747">max</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     instCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryInstCB> derivedTInventoryInstList() {
        return xcreateQDRFunctionTInventoryInstList();
    }
    protected HpQDRFunction<TInventoryInstCB> xcreateQDRFunctionTInventoryInstList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryInstList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepInventoryHId_QueryDerivedReferrer_TInventoryInstList(cb.query()); String prpp = keepInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "INVENTORY_H_ID", "INVENTORY_H_ID", sqpp, "tInventoryInstList", rd, vl, prpp, op);
    }
    public abstract String keepInventoryHId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);
    public abstract String keepInventoryHId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setInventoryHId_IsNull() { regInventoryHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setInventoryHId_IsNotNull() { regInventoryHId(CK_ISNN, DOBJ); }

    protected void regInventoryHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryHId(), "INVENTORY_H_ID"); }
    protected abstract ConditionValue xgetCValueInventoryHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
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
     * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center}
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
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_Equal(Long batchNum) {
        doSetBatchNum_Equal(batchNum);
    }

    protected void doSetBatchNum_Equal(Long batchNum) {
        regBatchNum(CK_EQ, batchNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_NotEqual(Long batchNum) {
        doSetBatchNum_NotEqual(batchNum);
    }

    protected void doSetBatchNum_NotEqual(Long batchNum) {
        regBatchNum(CK_NES, batchNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_GreaterThan(Long batchNum) {
        regBatchNum(CK_GT, batchNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_LessThan(Long batchNum) {
        regBatchNum(CK_LT, batchNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_GreaterEqual(Long batchNum) {
        regBatchNum(CK_GE, batchNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNum The value of batchNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setBatchNum_LessEqual(Long batchNum) {
        regBatchNum(CK_LE, batchNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param minNumber The min number of batchNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of batchNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setBatchNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueBatchNum(), "BATCH_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNumList The collection of batchNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchNum_InScope(Collection<Long> batchNumList) {
        doSetBatchNum_InScope(batchNumList);
    }

    protected void doSetBatchNum_InScope(Collection<Long> batchNumList) {
        regINS(CK_INS, cTL(batchNumList), xgetCValueBatchNum(), "BATCH_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * BATCH_NUM: {NotNull, BIGINT(19)}
     * @param batchNumList The collection of batchNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setBatchNum_NotInScope(Collection<Long> batchNumList) {
        doSetBatchNum_NotInScope(batchNumList);
    }

    protected void doSetBatchNum_NotInScope(Collection<Long> batchNumList) {
        regINS(CK_NINS, cTL(batchNumList), xgetCValueBatchNum(), "BATCH_NUM");
    }

    protected void regBatchNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueBatchNum(), "BATCH_NUM"); }
    protected abstract ConditionValue xgetCValueBatchNum();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_Equal(String inventoryDt) {
        doSetInventoryDt_Equal(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_Equal(String inventoryDt) {
        regInventoryDt(CK_EQ, inventoryDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotEqual(String inventoryDt) {
        doSetInventoryDt_NotEqual(fRES(inventoryDt));
    }

    protected void doSetInventoryDt_NotEqual(String inventoryDt) {
        regInventoryDt(CK_NES, inventoryDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterThan(String inventoryDt) {
        regInventoryDt(CK_GT, fRES(inventoryDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessThan(String inventoryDt) {
        regInventoryDt(CK_LT, fRES(inventoryDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_GreaterEqual(String inventoryDt) {
        regInventoryDt(CK_GE, fRES(inventoryDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_LessEqual(String inventoryDt) {
        regInventoryDt(CK_LE, fRES(inventoryDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDtList The collection of inventoryDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_InScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_InScope(inventoryDtList);
    }

    protected void doSetInventoryDt_InScope(Collection<String> inventoryDtList) {
        regINS(CK_INS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDtList The collection of inventoryDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        doSetInventoryDt_NotInScope(inventoryDtList);
    }

    protected void doSetInventoryDt_NotInScope(Collection<String> inventoryDtList) {
        regINS(CK_NINS, cTL(inventoryDtList), xgetCValueInventoryDt(), "INVENTORY_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} <br>
     * <pre>e.g. setInventoryDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDt The value of inventoryDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDt_LikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDt_NotLikeSearch(String inventoryDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDt), xgetCValueInventoryDt(), "INVENTORY_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)}
     * @param inventoryDt The value of inventoryDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDt_PrefixSearch(String inventoryDt) {
        setInventoryDt_LikeSearch(inventoryDt, xcLSOPPre());
    }

    protected void regInventoryDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDt(), "INVENTORY_DT"); }
    protected abstract ConditionValue xgetCValueInventoryDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_Equal(String plantCd) {
        doSetPlantCd_Equal(fRES(plantCd));
    }

    protected void doSetPlantCd_Equal(String plantCd) {
        regPlantCd(CK_EQ, plantCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotEqual(String plantCd) {
        doSetPlantCd_NotEqual(fRES(plantCd));
    }

    protected void doSetPlantCd_NotEqual(String plantCd) {
        regPlantCd(CK_NES, plantCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterThan(String plantCd) {
        regPlantCd(CK_GT, fRES(plantCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessThan(String plantCd) {
        regPlantCd(CK_LT, fRES(plantCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_GreaterEqual(String plantCd) {
        regPlantCd(CK_GE, fRES(plantCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_LessEqual(String plantCd) {
        regPlantCd(CK_LE, fRES(plantCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_InScope(Collection<String> plantCdList) {
        doSetPlantCd_InScope(plantCdList);
    }

    protected void doSetPlantCd_InScope(Collection<String> plantCdList) {
        regINS(CK_INS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCdList The collection of plantCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_NotInScope(Collection<String> plantCdList) {
        doSetPlantCd_NotInScope(plantCdList);
    }

    protected void doSetPlantCd_NotInScope(Collection<String> plantCdList) {
        regINS(CK_NINS, cTL(plantCdList), xgetCValuePlantCd(), "PLANT_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPlantCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantCd The value of plantCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantCd_LikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantCd_NotLikeSearch(String plantCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantCd), xgetCValuePlantCd(), "PLANT_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     * @param plantCd The value of plantCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantCd_PrefixSearch(String plantCd) {
        setPlantCd_LikeSearch(plantCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNull() { regPlantCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNullOrEmpty() { regPlantCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_CD: {VARCHAR(30)}
     */
    public void setPlantCd_IsNotNull() { regPlantCd(CK_ISNN, DOBJ); }

    protected void regPlantCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantCd(), "PLANT_CD"); }
    protected abstract ConditionValue xgetCValuePlantCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_Equal(String storageSpaceCd) {
        doSetStorageSpaceCd_Equal(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_Equal(String storageSpaceCd) {
        regStorageSpaceCd(CK_EQ, storageSpaceCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotEqual(String storageSpaceCd) {
        doSetStorageSpaceCd_NotEqual(fRES(storageSpaceCd));
    }

    protected void doSetStorageSpaceCd_NotEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_NES, storageSpaceCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_GT, fRES(storageSpaceCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessThan(String storageSpaceCd) {
        regStorageSpaceCd(CK_LT, fRES(storageSpaceCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_GreaterEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_GE, fRES(storageSpaceCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_LessEqual(String storageSpaceCd) {
        regStorageSpaceCd(CK_LE, fRES(storageSpaceCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_InScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_InScope(Collection<String> storageSpaceCdList) {
        regINS(CK_INS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCdList The collection of storageSpaceCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        doSetStorageSpaceCd_NotInScope(storageSpaceCdList);
    }

    protected void doSetStorageSpaceCd_NotInScope(Collection<String> storageSpaceCdList) {
        regINS(CK_NINS, cTL(storageSpaceCdList), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setStorageSpaceCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param storageSpaceCd The value of storageSpaceCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStorageSpaceCd_LikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStorageSpaceCd_NotLikeSearch(String storageSpaceCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(storageSpaceCd), xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     * @param storageSpaceCd The value of storageSpaceCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStorageSpaceCd_PrefixSearch(String storageSpaceCd) {
        setStorageSpaceCd_LikeSearch(storageSpaceCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNull() { regStorageSpaceCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNullOrEmpty() { regStorageSpaceCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STORAGE_SPACE_CD: {VARCHAR(30)}
     */
    public void setStorageSpaceCd_IsNotNull() { regStorageSpaceCd(CK_ISNN, DOBJ); }

    protected void regStorageSpaceCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStorageSpaceCd(), "STORAGE_SPACE_CD"); }
    protected abstract ConditionValue xgetCValueStorageSpaceCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_Equal(String inventoryInstNo) {
        doSetInventoryInstNo_Equal(fRES(inventoryInstNo));
    }

    protected void doSetInventoryInstNo_Equal(String inventoryInstNo) {
        regInventoryInstNo(CK_EQ, inventoryInstNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_NotEqual(String inventoryInstNo) {
        doSetInventoryInstNo_NotEqual(fRES(inventoryInstNo));
    }

    protected void doSetInventoryInstNo_NotEqual(String inventoryInstNo) {
        regInventoryInstNo(CK_NES, inventoryInstNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_GreaterThan(String inventoryInstNo) {
        regInventoryInstNo(CK_GT, fRES(inventoryInstNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_LessThan(String inventoryInstNo) {
        regInventoryInstNo(CK_LT, fRES(inventoryInstNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_GreaterEqual(String inventoryInstNo) {
        regInventoryInstNo(CK_GE, fRES(inventoryInstNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_LessEqual(String inventoryInstNo) {
        regInventoryInstNo(CK_LE, fRES(inventoryInstNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNoList The collection of inventoryInstNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_InScope(Collection<String> inventoryInstNoList) {
        doSetInventoryInstNo_InScope(inventoryInstNoList);
    }

    protected void doSetInventoryInstNo_InScope(Collection<String> inventoryInstNoList) {
        regINS(CK_INS, cTL(inventoryInstNoList), xgetCValueInventoryInstNo(), "INVENTORY_INST_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNoList The collection of inventoryInstNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_NotInScope(Collection<String> inventoryInstNoList) {
        doSetInventoryInstNo_NotInScope(inventoryInstNoList);
    }

    protected void doSetInventoryInstNo_NotInScope(Collection<String> inventoryInstNoList) {
        regINS(CK_NINS, cTL(inventoryInstNoList), xgetCValueInventoryInstNo(), "INVENTORY_INST_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setInventoryInstNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryInstNo The value of inventoryInstNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryInstNo_LikeSearch(String inventoryInstNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryInstNo), xgetCValueInventoryInstNo(), "INVENTORY_INST_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryInstNo_NotLikeSearch(String inventoryInstNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryInstNo), xgetCValueInventoryInstNo(), "INVENTORY_INST_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     * @param inventoryInstNo The value of inventoryInstNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryInstNo_PrefixSearch(String inventoryInstNo) {
        setInventoryInstNo_LikeSearch(inventoryInstNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     */
    public void setInventoryInstNo_IsNull() { regInventoryInstNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     */
    public void setInventoryInstNo_IsNullOrEmpty() { regInventoryInstNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_INST_NO: {VARCHAR(30)}
     */
    public void setInventoryInstNo_IsNotNull() { regInventoryInstNo(CK_ISNN, DOBJ); }

    protected void regInventoryInstNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryInstNo(), "INVENTORY_INST_NO"); }
    protected abstract ConditionValue xgetCValueInventoryInstNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_Equal(Long inventoryStatusTypeId) {
        doSetInventoryStatusTypeId_Equal(inventoryStatusTypeId);
    }

    protected void doSetInventoryStatusTypeId_Equal(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_EQ, inventoryStatusTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_NotEqual(Long inventoryStatusTypeId) {
        doSetInventoryStatusTypeId_NotEqual(inventoryStatusTypeId);
    }

    protected void doSetInventoryStatusTypeId_NotEqual(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_NES, inventoryStatusTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_GreaterThan(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_GT, inventoryStatusTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_LessThan(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_LT, inventoryStatusTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_GreaterEqual(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_GE, inventoryStatusTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeId The value of inventoryStatusTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_LessEqual(Long inventoryStatusTypeId) {
        regInventoryStatusTypeId(CK_LE, inventoryStatusTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of inventoryStatusTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of inventoryStatusTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setInventoryStatusTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueInventoryStatusTypeId(), "INVENTORY_STATUS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeIdList The collection of inventoryStatusTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_InScope(Collection<Long> inventoryStatusTypeIdList) {
        doSetInventoryStatusTypeId_InScope(inventoryStatusTypeIdList);
    }

    protected void doSetInventoryStatusTypeId_InScope(Collection<Long> inventoryStatusTypeIdList) {
        regINS(CK_INS, cTL(inventoryStatusTypeIdList), xgetCValueInventoryStatusTypeId(), "INVENTORY_STATUS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     * @param inventoryStatusTypeIdList The collection of inventoryStatusTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeId_NotInScope(Collection<Long> inventoryStatusTypeIdList) {
        doSetInventoryStatusTypeId_NotInScope(inventoryStatusTypeIdList);
    }

    protected void doSetInventoryStatusTypeId_NotInScope(Collection<Long> inventoryStatusTypeIdList) {
        regINS(CK_NINS, cTL(inventoryStatusTypeIdList), xgetCValueInventoryStatusTypeId(), "INVENTORY_STATUS_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     */
    public void setInventoryStatusTypeId_IsNull() { regInventoryStatusTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_ID: {BIGINT(19)}
     */
    public void setInventoryStatusTypeId_IsNotNull() { regInventoryStatusTypeId(CK_ISNN, DOBJ); }

    protected void regInventoryStatusTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryStatusTypeId(), "INVENTORY_STATUS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueInventoryStatusTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_Equal(String inventoryStatusTypeCd) {
        doSetInventoryStatusTypeCd_Equal(fRES(inventoryStatusTypeCd));
    }

    protected void doSetInventoryStatusTypeCd_Equal(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_EQ, inventoryStatusTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_NotEqual(String inventoryStatusTypeCd) {
        doSetInventoryStatusTypeCd_NotEqual(fRES(inventoryStatusTypeCd));
    }

    protected void doSetInventoryStatusTypeCd_NotEqual(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_NES, inventoryStatusTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_GreaterThan(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_GT, fRES(inventoryStatusTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_LessThan(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_LT, fRES(inventoryStatusTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_GreaterEqual(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_GE, fRES(inventoryStatusTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_LessEqual(String inventoryStatusTypeCd) {
        regInventoryStatusTypeCd(CK_LE, fRES(inventoryStatusTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCdList The collection of inventoryStatusTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_InScope(Collection<String> inventoryStatusTypeCdList) {
        doSetInventoryStatusTypeCd_InScope(inventoryStatusTypeCdList);
    }

    protected void doSetInventoryStatusTypeCd_InScope(Collection<String> inventoryStatusTypeCdList) {
        regINS(CK_INS, cTL(inventoryStatusTypeCdList), xgetCValueInventoryStatusTypeCd(), "INVENTORY_STATUS_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCdList The collection of inventoryStatusTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_NotInScope(Collection<String> inventoryStatusTypeCdList) {
        doSetInventoryStatusTypeCd_NotInScope(inventoryStatusTypeCdList);
    }

    protected void doSetInventoryStatusTypeCd_NotInScope(Collection<String> inventoryStatusTypeCdList) {
        regINS(CK_NINS, cTL(inventoryStatusTypeCdList), xgetCValueInventoryStatusTypeCd(), "INVENTORY_STATUS_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setInventoryStatusTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryStatusTypeCd_LikeSearch(String inventoryStatusTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryStatusTypeCd), xgetCValueInventoryStatusTypeCd(), "INVENTORY_STATUS_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryStatusTypeCd_NotLikeSearch(String inventoryStatusTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryStatusTypeCd), xgetCValueInventoryStatusTypeCd(), "INVENTORY_STATUS_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     * @param inventoryStatusTypeCd The value of inventoryStatusTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryStatusTypeCd_PrefixSearch(String inventoryStatusTypeCd) {
        setInventoryStatusTypeCd_LikeSearch(inventoryStatusTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     */
    public void setInventoryStatusTypeCd_IsNull() { regInventoryStatusTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     */
    public void setInventoryStatusTypeCd_IsNullOrEmpty() { regInventoryStatusTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)}
     */
    public void setInventoryStatusTypeCd_IsNotNull() { regInventoryStatusTypeCd(CK_ISNN, DOBJ); }

    protected void regInventoryStatusTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryStatusTypeCd(), "INVENTORY_STATUS_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueInventoryStatusTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @param instRecvTime The value of instRecvTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstRecvTime_Equal(java.sql.Timestamp instRecvTime) {
        regInstRecvTime(CK_EQ,  instRecvTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @param instRecvTime The value of instRecvTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstRecvTime_GreaterThan(java.sql.Timestamp instRecvTime) {
        regInstRecvTime(CK_GT,  instRecvTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @param instRecvTime The value of instRecvTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstRecvTime_LessThan(java.sql.Timestamp instRecvTime) {
        regInstRecvTime(CK_LT,  instRecvTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @param instRecvTime The value of instRecvTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstRecvTime_GreaterEqual(java.sql.Timestamp instRecvTime) {
        regInstRecvTime(CK_GE,  instRecvTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * @param instRecvTime The value of instRecvTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setInstRecvTime_LessEqual(java.sql.Timestamp instRecvTime) {
        regInstRecvTime(CK_LE, instRecvTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * <pre>e.g. setInstRecvTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of instRecvTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of instRecvTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setInstRecvTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueInstRecvTime(), "INST_RECV_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of instRecvTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of instRecvTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setInstRecvTime_DateFromTo(Date fromDate, Date toDate) {
        setInstRecvTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     */
    public void setInstRecvTime_IsNull() { regInstRecvTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INST_RECV_TIME: {DATETIME(19)}
     */
    public void setInstRecvTime_IsNotNull() { regInstRecvTime(CK_ISNN, DOBJ); }

    protected void regInstRecvTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInstRecvTime(), "INST_RECV_TIME"); }
    protected abstract ConditionValue xgetCValueInstRecvTime();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @param reportSendTime The value of reportSendTime as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportSendTime_Equal(java.sql.Timestamp reportSendTime) {
        regReportSendTime(CK_EQ,  reportSendTime);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @param reportSendTime The value of reportSendTime as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportSendTime_GreaterThan(java.sql.Timestamp reportSendTime) {
        regReportSendTime(CK_GT,  reportSendTime);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @param reportSendTime The value of reportSendTime as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportSendTime_LessThan(java.sql.Timestamp reportSendTime) {
        regReportSendTime(CK_LT,  reportSendTime);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @param reportSendTime The value of reportSendTime as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportSendTime_GreaterEqual(java.sql.Timestamp reportSendTime) {
        regReportSendTime(CK_GE,  reportSendTime);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * @param reportSendTime The value of reportSendTime as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReportSendTime_LessEqual(java.sql.Timestamp reportSendTime) {
        regReportSendTime(CK_LE, reportSendTime);
    }

    /**
     * FromTo with various options. (versatile) {(default) fromDatetime &lt;= column &lt;= toDatetime} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * <pre>e.g. setReportSendTime_FromTo(fromDate, toDate, new <span style="color: #CC4747">FromToOption</span>().compareAsDate());</pre>
     * @param fromDatetime The from-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reportSendTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDatetime The to-datetime(yyyy/MM/dd HH:mm:ss.SSS) of reportSendTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param fromToOption The option of from-to. (NotNull)
     */
    public void setReportSendTime_FromTo(Date fromDatetime, Date toDatetime, FromToOption fromToOption) {
        regFTQ((fromDatetime != null ? new java.sql.Timestamp(fromDatetime.getTime()) : null), (toDatetime != null ? new java.sql.Timestamp(toDatetime.getTime()) : null), xgetCValueReportSendTime(), "REPORT_SEND_TIME", fromToOption);
    }

    /**
     * DateFromTo. (Date means yyyy/MM/dd) {fromDate &lt;= column &lt; toDate + 1 day} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     * <pre>
     * e.g. from:{2007/04/10 08:24:53} to:{2007/04/16 14:36:29}
     *  column &gt;= '2007/04/10 00:00:00' and column <span style="color: #CC4747">&lt; '2007/04/17 00:00:00'</span>
     * </pre>
     * @param fromDate The from-date(yyyy/MM/dd) of reportSendTime. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param toDate The to-date(yyyy/MM/dd) of reportSendTime. (basically NotNull: if op.allowOneSide(), null allowed)
     */
    public void setReportSendTime_DateFromTo(Date fromDate, Date toDate) {
        setReportSendTime_FromTo(fromDate, toDate, xcDFTOP());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     */
    public void setReportSendTime_IsNull() { regReportSendTime(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPORT_SEND_TIME: {DATETIME(19)}
     */
    public void setReportSendTime_IsNotNull() { regReportSendTime(CK_ISNN, DOBJ); }

    protected void regReportSendTime(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReportSendTime(), "REPORT_SEND_TIME"); }
    protected abstract ConditionValue xgetCValueReportSendTime();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_Equal(String inventoryUpdateFlg) {
        doSetInventoryUpdateFlg_Equal(fRES(inventoryUpdateFlg));
    }

    protected void doSetInventoryUpdateFlg_Equal(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_EQ, inventoryUpdateFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_NotEqual(String inventoryUpdateFlg) {
        doSetInventoryUpdateFlg_NotEqual(fRES(inventoryUpdateFlg));
    }

    protected void doSetInventoryUpdateFlg_NotEqual(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_NES, inventoryUpdateFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_GreaterThan(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_GT, fRES(inventoryUpdateFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_LessThan(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_LT, fRES(inventoryUpdateFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_GreaterEqual(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_GE, fRES(inventoryUpdateFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_LessEqual(String inventoryUpdateFlg) {
        regInventoryUpdateFlg(CK_LE, fRES(inventoryUpdateFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlgList The collection of inventoryUpdateFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_InScope(Collection<String> inventoryUpdateFlgList) {
        doSetInventoryUpdateFlg_InScope(inventoryUpdateFlgList);
    }

    protected void doSetInventoryUpdateFlg_InScope(Collection<String> inventoryUpdateFlgList) {
        regINS(CK_INS, cTL(inventoryUpdateFlgList), xgetCValueInventoryUpdateFlg(), "INVENTORY_UPDATE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlgList The collection of inventoryUpdateFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_NotInScope(Collection<String> inventoryUpdateFlgList) {
        doSetInventoryUpdateFlg_NotInScope(inventoryUpdateFlgList);
    }

    protected void doSetInventoryUpdateFlg_NotInScope(Collection<String> inventoryUpdateFlgList) {
        regINS(CK_NINS, cTL(inventoryUpdateFlgList), xgetCValueInventoryUpdateFlg(), "INVENTORY_UPDATE_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setInventoryUpdateFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryUpdateFlg_LikeSearch(String inventoryUpdateFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryUpdateFlg), xgetCValueInventoryUpdateFlg(), "INVENTORY_UPDATE_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryUpdateFlg_NotLikeSearch(String inventoryUpdateFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryUpdateFlg), xgetCValueInventoryUpdateFlg(), "INVENTORY_UPDATE_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     * @param inventoryUpdateFlg The value of inventoryUpdateFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryUpdateFlg_PrefixSearch(String inventoryUpdateFlg) {
        setInventoryUpdateFlg_LikeSearch(inventoryUpdateFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     */
    public void setInventoryUpdateFlg_IsNull() { regInventoryUpdateFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     */
    public void setInventoryUpdateFlg_IsNullOrEmpty() { regInventoryUpdateFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]}
     */
    public void setInventoryUpdateFlg_IsNotNull() { regInventoryUpdateFlg(CK_ISNN, DOBJ); }

    protected void regInventoryUpdateFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryUpdateFlg(), "INVENTORY_UPDATE_FLG"); }
    protected abstract ConditionValue xgetCValueInventoryUpdateFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_Equal(String inventoryDataStatus) {
        doSetInventoryDataStatus_Equal(fRES(inventoryDataStatus));
    }

    protected void doSetInventoryDataStatus_Equal(String inventoryDataStatus) {
        regInventoryDataStatus(CK_EQ, inventoryDataStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_NotEqual(String inventoryDataStatus) {
        doSetInventoryDataStatus_NotEqual(fRES(inventoryDataStatus));
    }

    protected void doSetInventoryDataStatus_NotEqual(String inventoryDataStatus) {
        regInventoryDataStatus(CK_NES, inventoryDataStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_GreaterThan(String inventoryDataStatus) {
        regInventoryDataStatus(CK_GT, fRES(inventoryDataStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_LessThan(String inventoryDataStatus) {
        regInventoryDataStatus(CK_LT, fRES(inventoryDataStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_GreaterEqual(String inventoryDataStatus) {
        regInventoryDataStatus(CK_GE, fRES(inventoryDataStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_LessEqual(String inventoryDataStatus) {
        regInventoryDataStatus(CK_LE, fRES(inventoryDataStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatusList The collection of inventoryDataStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_InScope(Collection<String> inventoryDataStatusList) {
        doSetInventoryDataStatus_InScope(inventoryDataStatusList);
    }

    protected void doSetInventoryDataStatus_InScope(Collection<String> inventoryDataStatusList) {
        regINS(CK_INS, cTL(inventoryDataStatusList), xgetCValueInventoryDataStatus(), "INVENTORY_DATA_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatusList The collection of inventoryDataStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_NotInScope(Collection<String> inventoryDataStatusList) {
        doSetInventoryDataStatus_NotInScope(inventoryDataStatusList);
    }

    protected void doSetInventoryDataStatus_NotInScope(Collection<String> inventoryDataStatusList) {
        regINS(CK_NINS, cTL(inventoryDataStatusList), xgetCValueInventoryDataStatus(), "INVENTORY_DATA_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} <br>
     * <pre>e.g. setInventoryDataStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inventoryDataStatus The value of inventoryDataStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInventoryDataStatus_LikeSearch(String inventoryDataStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inventoryDataStatus), xgetCValueInventoryDataStatus(), "INVENTORY_DATA_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInventoryDataStatus_NotLikeSearch(String inventoryDataStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inventoryDataStatus), xgetCValueInventoryDataStatus(), "INVENTORY_DATA_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     * @param inventoryDataStatus The value of inventoryDataStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInventoryDataStatus_PrefixSearch(String inventoryDataStatus) {
        setInventoryDataStatus_LikeSearch(inventoryDataStatus, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     */
    public void setInventoryDataStatus_IsNull() { regInventoryDataStatus(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     */
    public void setInventoryDataStatus_IsNullOrEmpty() { regInventoryDataStatus(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]}
     */
    public void setInventoryDataStatus_IsNotNull() { regInventoryDataStatus(CK_ISNN, DOBJ); }

    protected void regInventoryDataStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInventoryDataStatus(), "INVENTORY_DATA_STATUS"); }
    protected abstract ConditionValue xgetCValueInventoryDataStatus();

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
    public HpSLCFunction<TInventoryHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TInventoryHCB.class);
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
    public HpSLCFunction<TInventoryHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TInventoryHCB.class);
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
    public HpSLCFunction<TInventoryHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TInventoryHCB.class);
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
    public HpSLCFunction<TInventoryHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TInventoryHCB.class);
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
    public HpSLCFunction<TInventoryHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TInventoryHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TInventoryHCB&gt;() {
     *     public void query(TInventoryHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TInventoryHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TInventoryHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TInventoryHCQ sq);

    protected TInventoryHCB xcreateScalarConditionCB() {
        TInventoryHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TInventoryHCB xcreateScalarConditionPartitionByCB() {
        TInventoryHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TInventoryHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "INVENTORY_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TInventoryHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TInventoryHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TInventoryHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "INVENTORY_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TInventoryHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TInventoryHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryHCB cb = new TInventoryHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TInventoryHCQ sq);

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
    protected TInventoryHCB newMyCB() {
        return new TInventoryHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TInventoryHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
