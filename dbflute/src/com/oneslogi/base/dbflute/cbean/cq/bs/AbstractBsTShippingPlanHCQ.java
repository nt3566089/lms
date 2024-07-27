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
 * The abstract condition-query of t_shipping_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsTShippingPlanHCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsTShippingPlanHCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "t_shipping_plan_h";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_Equal(Long shippingPlanHId) {
        doSetShippingPlanHId_Equal(shippingPlanHId);
    }

    protected void doSetShippingPlanHId_Equal(Long shippingPlanHId) {
        regShippingPlanHId(CK_EQ, shippingPlanHId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_NotEqual(Long shippingPlanHId) {
        doSetShippingPlanHId_NotEqual(shippingPlanHId);
    }

    protected void doSetShippingPlanHId_NotEqual(Long shippingPlanHId) {
        regShippingPlanHId(CK_NES, shippingPlanHId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_GreaterThan(Long shippingPlanHId) {
        regShippingPlanHId(CK_GT, shippingPlanHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_LessThan(Long shippingPlanHId) {
        regShippingPlanHId(CK_LT, shippingPlanHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_GreaterEqual(Long shippingPlanHId) {
        regShippingPlanHId(CK_GE, shippingPlanHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHId The value of shippingPlanHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingPlanHId_LessEqual(Long shippingPlanHId) {
        regShippingPlanHId(CK_LE, shippingPlanHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of shippingPlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingPlanHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingPlanHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingPlanHId(), "SHIPPING_PLAN_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHIdList The collection of shippingPlanHId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlanHId_InScope(Collection<Long> shippingPlanHIdList) {
        doSetShippingPlanHId_InScope(shippingPlanHIdList);
    }

    protected void doSetShippingPlanHId_InScope(Collection<Long> shippingPlanHIdList) {
        regINS(CK_INS, cTL(shippingPlanHIdList), xgetCValueShippingPlanHId(), "SHIPPING_PLAN_H_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param shippingPlanHIdList The collection of shippingPlanHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingPlanHId_NotInScope(Collection<Long> shippingPlanHIdList) {
        doSetShippingPlanHId_NotInScope(shippingPlanHIdList);
    }

    protected void doSetShippingPlanHId_NotInScope(Collection<Long> shippingPlanHIdList) {
        regINS(CK_NINS, cTL(shippingPlanHIdList), xgetCValueShippingPlanHId(), "SHIPPING_PLAN_H_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SHIPPING_PLAN_H_ID from t_shipping_plan_b where ...)} <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingPlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingPlanBList for 'exists'. (NotNull)
     */
    public void existsTShippingPlanBList(SubQuery<TShippingPlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingPlanBCB cb = new TShippingPlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingPlanHId_ExistsReferrer_TShippingPlanBList(cb.query());
        registerExistsReferrer(cb.query(), "SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", pp, "tShippingPlanBList");
    }
    public abstract String keepShippingPlanHId_ExistsReferrer_TShippingPlanBList(TShippingPlanBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SHIPPING_PLAN_H_ID from t_shipping_plan_b where ...)} <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingPlanBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of ShippingPlanHId_NotExistsReferrer_TShippingPlanBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingPlanBList(SubQuery<TShippingPlanBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingPlanBCB cb = new TShippingPlanBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepShippingPlanHId_NotExistsReferrer_TShippingPlanBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", pp, "tShippingPlanBList");
    }
    public abstract String keepShippingPlanHId_NotExistsReferrer_TShippingPlanBList(TShippingPlanBCQ sq);

    public void xsderiveTShippingPlanBList(String fn, SubQuery<TShippingPlanBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingPlanBCB cb = new TShippingPlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepShippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", pp, "tShippingPlanBList", al, op);
    }
    public abstract String keepShippingPlanHId_SpecifyDerivedReferrer_TShippingPlanBList(TShippingPlanBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_plan_b where ...)} <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingPlanBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingPlanBCB> derivedTShippingPlanBList() {
        return xcreateQDRFunctionTShippingPlanBList();
    }
    protected HpQDRFunction<TShippingPlanBCB> xcreateQDRFunctionTShippingPlanBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingPlanBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingPlanBList(String fn, SubQuery<TShippingPlanBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingPlanBCB cb = new TShippingPlanBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBList(cb.query()); String prpp = keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SHIPPING_PLAN_H_ID", "SHIPPING_PLAN_H_ID", sqpp, "tShippingPlanBList", rd, vl, prpp, op);
    }
    public abstract String keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBList(TShippingPlanBCQ sq);
    public abstract String keepShippingPlanHId_QueryDerivedReferrer_TShippingPlanBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingPlanHId_IsNull() { regShippingPlanHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_PLAN_H_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setShippingPlanHId_IsNotNull() { regShippingPlanHId(CK_ISNN, DOBJ); }

    protected void regShippingPlanHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingPlanHId(), "SHIPPING_PLAN_H_ID"); }
    protected abstract ConditionValue xgetCValueShippingPlanHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
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
     * CLIENT_ID: {NotNull, BIGINT(19)}
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
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param clientId The value of clientId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterThan(Long clientId) {
        regClientId(CK_GT, clientId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param clientId The value of clientId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessThan(Long clientId) {
        regClientId(CK_LT, clientId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param clientId The value of clientId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_GreaterEqual(Long clientId) {
        regClientId(CK_GE, clientId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param clientId The value of clientId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setClientId_LessEqual(Long clientId) {
        regClientId(CK_LE, clientId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of clientId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setClientId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueClientId(), "CLIENT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CLIENT_ID: {NotNull, BIGINT(19)}
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
     * CLIENT_ID: {NotNull, BIGINT(19)}
     * @param clientIdList The collection of clientId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientId_NotInScope(Collection<Long> clientIdList) {
        doSetClientId_NotInScope(clientIdList);
    }

    protected void doSetClientId_NotInScope(Collection<Long> clientIdList) {
        regINS(CK_NINS, cTL(clientIdList), xgetCValueClientId(), "CLIENT_ID");
    }

    protected void regClientId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientId(), "CLIENT_ID"); }
    protected abstract ConditionValue xgetCValueClientId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
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
     * CENTER_ID: {NotNull, BIGINT(19)}
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
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {NotNull, BIGINT(19)}
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
     * CENTER_ID: {NotNull, BIGINT(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_Equal(Long processTypeId) {
        doSetProcessTypeId_Equal(processTypeId);
    }

    protected void doSetProcessTypeId_Equal(Long processTypeId) {
        regProcessTypeId(CK_EQ, processTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotEqual(Long processTypeId) {
        doSetProcessTypeId_NotEqual(processTypeId);
    }

    protected void doSetProcessTypeId_NotEqual(Long processTypeId) {
        regProcessTypeId(CK_NES, processTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterThan(Long processTypeId) {
        regProcessTypeId(CK_GT, processTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessThan(Long processTypeId) {
        regProcessTypeId(CK_LT, processTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_GreaterEqual(Long processTypeId) {
        regProcessTypeId(CK_GE, processTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeId The value of processTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setProcessTypeId_LessEqual(Long processTypeId) {
        regProcessTypeId(CK_LE, processTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param minNumber The min number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of processTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setProcessTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeIdList The collection of processTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_InScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_InScope(Collection<Long> processTypeIdList) {
        regINS(CK_INS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * PROCESS_TYPE_ID: {IX, NotNull, BIGINT(19)}
     * @param processTypeIdList The collection of processTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        doSetProcessTypeId_NotInScope(processTypeIdList);
    }

    protected void doSetProcessTypeId_NotInScope(Collection<Long> processTypeIdList) {
        regINS(CK_NINS, cTL(processTypeIdList), xgetCValueProcessTypeId(), "PROCESS_TYPE_ID");
    }

    protected void regProcessTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProcessTypeId(), "PROCESS_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueProcessTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_Equal(String inputType) {
        doSetInputType_Equal(fRES(inputType));
    }

    protected void doSetInputType_Equal(String inputType) {
        regInputType(CK_EQ, inputType);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotEqual(String inputType) {
        doSetInputType_NotEqual(fRES(inputType));
    }

    protected void doSetInputType_NotEqual(String inputType) {
        regInputType(CK_NES, inputType);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_GreaterThan(String inputType) {
        regInputType(CK_GT, fRES(inputType));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_LessThan(String inputType) {
        regInputType(CK_LT, fRES(inputType));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_GreaterEqual(String inputType) {
        regInputType(CK_GE, fRES(inputType));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_LessEqual(String inputType) {
        regInputType(CK_LE, fRES(inputType));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputTypeList The collection of inputType as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_InScope(Collection<String> inputTypeList) {
        doSetInputType_InScope(inputTypeList);
    }

    protected void doSetInputType_InScope(Collection<String> inputTypeList) {
        regINS(CK_INS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputTypeList The collection of inputType as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_NotInScope(Collection<String> inputTypeList) {
        doSetInputType_NotInScope(inputTypeList);
    }

    protected void doSetInputType_NotInScope(Collection<String> inputTypeList) {
        regINS(CK_NINS, cTL(inputTypeList), xgetCValueInputType(), "INPUT_TYPE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)} <br>
     * <pre>e.g. setInputType_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param inputType The value of inputType as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setInputType_LikeSearch(String inputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(inputType), xgetCValueInputType(), "INPUT_TYPE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setInputType_NotLikeSearch(String inputType, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(inputType), xgetCValueInputType(), "INPUT_TYPE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     * @param inputType The value of inputType as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setInputType_PrefixSearch(String inputType) {
        setInputType_LikeSearch(inputType, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     */
    public void setInputType_IsNull() { regInputType(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     */
    public void setInputType_IsNullOrEmpty() { regInputType(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * INPUT_TYPE: {VARCHAR(30)}
     */
    public void setInputType_IsNotNull() { regInputType(CK_ISNN, DOBJ); }

    protected void regInputType(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueInputType(), "INPUT_TYPE"); }
    protected abstract ConditionValue xgetCValueInputType();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterThan(String shippingDt) {
        regShippingDt(CK_GT, fRES(shippingDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessThan(String shippingDt) {
        regShippingDt(CK_LT, fRES(shippingDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_GreaterEqual(String shippingDt) {
        regShippingDt(CK_GE, fRES(shippingDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_LessEqual(String shippingDt) {
        regShippingDt(CK_LE, fRES(shippingDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
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
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)} <br>
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
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingDt_NotLikeSearch(String shippingDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingDt), xgetCValueShippingDt(), "SHIPPING_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_DT: {IX, NotNull, VARCHAR(8)}
     * @param shippingDt The value of shippingDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingDt_PrefixSearch(String shippingDt) {
        setShippingDt_LikeSearch(shippingDt, xcLSOPPre());
    }

    protected void regShippingDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingDt(), "SHIPPING_DT"); }
    protected abstract ConditionValue xgetCValueShippingDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_Equal(String workDt) {
        doSetWorkDt_Equal(fRES(workDt));
    }

    protected void doSetWorkDt_Equal(String workDt) {
        regWorkDt(CK_EQ, workDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotEqual(String workDt) {
        doSetWorkDt_NotEqual(fRES(workDt));
    }

    protected void doSetWorkDt_NotEqual(String workDt) {
        regWorkDt(CK_NES, workDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterThan(String workDt) {
        regWorkDt(CK_GT, fRES(workDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessThan(String workDt) {
        regWorkDt(CK_LT, fRES(workDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_GreaterEqual(String workDt) {
        regWorkDt(CK_GE, fRES(workDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_LessEqual(String workDt) {
        regWorkDt(CK_LE, fRES(workDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_InScope(Collection<String> workDtList) {
        doSetWorkDt_InScope(workDtList);
    }

    protected void doSetWorkDt_InScope(Collection<String> workDtList) {
        regINS(CK_INS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDtList The collection of workDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_NotInScope(Collection<String> workDtList) {
        doSetWorkDt_NotInScope(workDtList);
    }

    protected void doSetWorkDt_NotInScope(Collection<String> workDtList) {
        regINS(CK_NINS, cTL(workDtList), xgetCValueWorkDt(), "WORK_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)} <br>
     * <pre>e.g. setWorkDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param workDt The value of workDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWorkDt_LikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWorkDt_NotLikeSearch(String workDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(workDt), xgetCValueWorkDt(), "WORK_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     * @param workDt The value of workDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWorkDt_PrefixSearch(String workDt) {
        setWorkDt_LikeSearch(workDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNull() { regWorkDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNullOrEmpty() { regWorkDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WORK_DT: {IX, VARCHAR(8)}
     */
    public void setWorkDt_IsNotNull() { regWorkDt(CK_ISNN, DOBJ); }

    protected void regWorkDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWorkDt(), "WORK_DT"); }
    protected abstract ConditionValue xgetCValueWorkDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_Equal(String delivPlanDt) {
        doSetDelivPlanDt_Equal(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_Equal(String delivPlanDt) {
        regDelivPlanDt(CK_EQ, delivPlanDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotEqual(String delivPlanDt) {
        doSetDelivPlanDt_NotEqual(fRES(delivPlanDt));
    }

    protected void doSetDelivPlanDt_NotEqual(String delivPlanDt) {
        regDelivPlanDt(CK_NES, delivPlanDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterThan(String delivPlanDt) {
        regDelivPlanDt(CK_GT, fRES(delivPlanDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessThan(String delivPlanDt) {
        regDelivPlanDt(CK_LT, fRES(delivPlanDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_GreaterEqual(String delivPlanDt) {
        regDelivPlanDt(CK_GE, fRES(delivPlanDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_LessEqual(String delivPlanDt) {
        regDelivPlanDt(CK_LE, fRES(delivPlanDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_InScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_InScope(Collection<String> delivPlanDtList) {
        regINS(CK_INS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDtList The collection of delivPlanDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        doSetDelivPlanDt_NotInScope(delivPlanDtList);
    }

    protected void doSetDelivPlanDt_NotInScope(Collection<String> delivPlanDtList) {
        regINS(CK_NINS, cTL(delivPlanDtList), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivPlanDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivPlanDt The value of delivPlanDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivPlanDt_LikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivPlanDt_NotLikeSearch(String delivPlanDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivPlanDt), xgetCValueDelivPlanDt(), "DELIV_PLAN_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     * @param delivPlanDt The value of delivPlanDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivPlanDt_PrefixSearch(String delivPlanDt) {
        setDelivPlanDt_LikeSearch(delivPlanDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNull() { regDelivPlanDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNullOrEmpty() { regDelivPlanDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_PLAN_DT: {VARCHAR(8)}
     */
    public void setDelivPlanDt_IsNotNull() { regDelivPlanDt(CK_ISNN, DOBJ); }

    protected void regDelivPlanDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivPlanDt(), "DELIV_PLAN_DT"); }
    protected abstract ConditionValue xgetCValueDelivPlanDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_Equal(String delivDt) {
        doSetDelivDt_Equal(fRES(delivDt));
    }

    protected void doSetDelivDt_Equal(String delivDt) {
        regDelivDt(CK_EQ, delivDt);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotEqual(String delivDt) {
        doSetDelivDt_NotEqual(fRES(delivDt));
    }

    protected void doSetDelivDt_NotEqual(String delivDt) {
        regDelivDt(CK_NES, delivDt);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterThan(String delivDt) {
        regDelivDt(CK_GT, fRES(delivDt));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessThan(String delivDt) {
        regDelivDt(CK_LT, fRES(delivDt));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_GreaterEqual(String delivDt) {
        regDelivDt(CK_GE, fRES(delivDt));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_LessEqual(String delivDt) {
        regDelivDt(CK_LE, fRES(delivDt));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_InScope(Collection<String> delivDtList) {
        doSetDelivDt_InScope(delivDtList);
    }

    protected void doSetDelivDt_InScope(Collection<String> delivDtList) {
        regINS(CK_INS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDtList The collection of delivDt as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_NotInScope(Collection<String> delivDtList) {
        doSetDelivDt_NotInScope(delivDtList);
    }

    protected void doSetDelivDt_NotInScope(Collection<String> delivDtList) {
        regINS(CK_NINS, cTL(delivDtList), xgetCValueDelivDt(), "DELIV_DT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)} <br>
     * <pre>e.g. setDelivDt_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivDt The value of delivDt as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivDt_LikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivDt_NotLikeSearch(String delivDt, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivDt), xgetCValueDelivDt(), "DELIV_DT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     * @param delivDt The value of delivDt as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivDt_PrefixSearch(String delivDt) {
        setDelivDt_LikeSearch(delivDt, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNull() { regDelivDt(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNullOrEmpty() { regDelivDt(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_DT: {VARCHAR(8)}
     */
    public void setDelivDt_IsNotNull() { regDelivDt(CK_ISNN, DOBJ); }

    protected void regDelivDt(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivDt(), "DELIV_DT"); }
    protected abstract ConditionValue xgetCValueDelivDt();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_Equal(String delivTz) {
        doSetDelivTz_Equal(fRES(delivTz));
    }

    protected void doSetDelivTz_Equal(String delivTz) {
        regDelivTz(CK_EQ, delivTz);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotEqual(String delivTz) {
        doSetDelivTz_NotEqual(fRES(delivTz));
    }

    protected void doSetDelivTz_NotEqual(String delivTz) {
        regDelivTz(CK_NES, delivTz);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterThan(String delivTz) {
        regDelivTz(CK_GT, fRES(delivTz));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessThan(String delivTz) {
        regDelivTz(CK_LT, fRES(delivTz));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_GreaterEqual(String delivTz) {
        regDelivTz(CK_GE, fRES(delivTz));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_LessEqual(String delivTz) {
        regDelivTz(CK_LE, fRES(delivTz));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTzList The collection of delivTz as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_InScope(Collection<String> delivTzList) {
        doSetDelivTz_InScope(delivTzList);
    }

    protected void doSetDelivTz_InScope(Collection<String> delivTzList) {
        regINS(CK_INS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTzList The collection of delivTz as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_NotInScope(Collection<String> delivTzList) {
        doSetDelivTz_NotInScope(delivTzList);
    }

    protected void doSetDelivTz_NotInScope(Collection<String> delivTzList) {
        regINS(CK_NINS, cTL(delivTzList), xgetCValueDelivTz(), "DELIV_TZ");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivTz_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTz The value of delivTz as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTz_LikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTz_NotLikeSearch(String delivTz, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTz), xgetCValueDelivTz(), "DELIV_TZ", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     * @param delivTz The value of delivTz as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTz_PrefixSearch(String delivTz) {
        setDelivTz_LikeSearch(delivTz, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     */
    public void setDelivTz_IsNull() { regDelivTz(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     */
    public void setDelivTz_IsNullOrEmpty() { regDelivTz(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TZ: {VARCHAR(30)}
     */
    public void setDelivTz_IsNotNull() { regDelivTz(CK_ISNN, DOBJ); }

    protected void regDelivTz(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTz(), "DELIV_TZ"); }
    protected abstract ConditionValue xgetCValueDelivTz();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_Equal(String clientShippingNo) {
        doSetClientShippingNo_Equal(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_Equal(String clientShippingNo) {
        regClientShippingNo(CK_EQ, clientShippingNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotEqual(String clientShippingNo) {
        doSetClientShippingNo_NotEqual(fRES(clientShippingNo));
    }

    protected void doSetClientShippingNo_NotEqual(String clientShippingNo) {
        regClientShippingNo(CK_NES, clientShippingNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterThan(String clientShippingNo) {
        regClientShippingNo(CK_GT, fRES(clientShippingNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessThan(String clientShippingNo) {
        regClientShippingNo(CK_LT, fRES(clientShippingNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_GreaterEqual(String clientShippingNo) {
        regClientShippingNo(CK_GE, fRES(clientShippingNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_LessEqual(String clientShippingNo) {
        regClientShippingNo(CK_LE, fRES(clientShippingNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNoList The collection of clientShippingNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_InScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_InScope(Collection<String> clientShippingNoList) {
        regINS(CK_INS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNoList The collection of clientShippingNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        doSetClientShippingNo_NotInScope(clientShippingNoList);
    }

    protected void doSetClientShippingNo_NotInScope(Collection<String> clientShippingNoList) {
        regINS(CK_NINS, cTL(clientShippingNoList), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setClientShippingNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param clientShippingNo The value of clientShippingNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setClientShippingNo_LikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setClientShippingNo_NotLikeSearch(String clientShippingNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(clientShippingNo), xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     * @param clientShippingNo The value of clientShippingNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setClientShippingNo_PrefixSearch(String clientShippingNo) {
        setClientShippingNo_LikeSearch(clientShippingNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNull() { regClientShippingNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNullOrEmpty() { regClientShippingNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CLIENT_SHIPPING_NO: {IX, VARCHAR(30)}
     */
    public void setClientShippingNo_IsNotNull() { regClientShippingNo(CK_ISNN, DOBJ); }

    protected void regClientShippingNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueClientShippingNo(), "CLIENT_SHIPPING_NO"); }
    protected abstract ConditionValue xgetCValueClientShippingNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
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
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
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
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterThan(String shippingSlipNo) {
        regShippingSlipNo(CK_GT, fRES(shippingSlipNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessThan(String shippingSlipNo) {
        regShippingSlipNo(CK_LT, fRES(shippingSlipNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_GreaterEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_GE, fRES(shippingSlipNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_LessEqual(String shippingSlipNo) {
        regShippingSlipNo(CK_LE, fRES(shippingSlipNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
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
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
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
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)} <br>
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
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingSlipNo_NotLikeSearch(String shippingSlipNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingSlipNo), xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     * @param shippingSlipNo The value of shippingSlipNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingSlipNo_PrefixSearch(String shippingSlipNo) {
        setShippingSlipNo_LikeSearch(shippingSlipNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNull() { regShippingSlipNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNullOrEmpty() { regShippingSlipNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_SLIP_NO: {IX, VARCHAR(30)}
     */
    public void setShippingSlipNo_IsNotNull() { regShippingSlipNo(CK_ISNN, DOBJ); }

    protected void regShippingSlipNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingSlipNo(), "SHIPPING_SLIP_NO"); }
    protected abstract ConditionValue xgetCValueShippingSlipNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_Equal(String shippingStatus) {
        doSetShippingStatus_Equal(fRES(shippingStatus));
    }

    protected void doSetShippingStatus_Equal(String shippingStatus) {
        regShippingStatus(CK_EQ, shippingStatus);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_NotEqual(String shippingStatus) {
        doSetShippingStatus_NotEqual(fRES(shippingStatus));
    }

    protected void doSetShippingStatus_NotEqual(String shippingStatus) {
        regShippingStatus(CK_NES, shippingStatus);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_GreaterThan(String shippingStatus) {
        regShippingStatus(CK_GT, fRES(shippingStatus));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_LessThan(String shippingStatus) {
        regShippingStatus(CK_LT, fRES(shippingStatus));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_GreaterEqual(String shippingStatus) {
        regShippingStatus(CK_GE, fRES(shippingStatus));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_LessEqual(String shippingStatus) {
        regShippingStatus(CK_LE, fRES(shippingStatus));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatusList The collection of shippingStatus as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_InScope(Collection<String> shippingStatusList) {
        doSetShippingStatus_InScope(shippingStatusList);
    }

    protected void doSetShippingStatus_InScope(Collection<String> shippingStatusList) {
        regINS(CK_INS, cTL(shippingStatusList), xgetCValueShippingStatus(), "SHIPPING_STATUS");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatusList The collection of shippingStatus as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_NotInScope(Collection<String> shippingStatusList) {
        doSetShippingStatus_NotInScope(shippingStatusList);
    }

    protected void doSetShippingStatus_NotInScope(Collection<String> shippingStatusList) {
        regINS(CK_NINS, cTL(shippingStatusList), xgetCValueShippingStatus(), "SHIPPING_STATUS");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setShippingStatus_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingStatus The value of shippingStatus as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingStatus_LikeSearch(String shippingStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingStatus), xgetCValueShippingStatus(), "SHIPPING_STATUS", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingStatus_NotLikeSearch(String shippingStatus, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingStatus), xgetCValueShippingStatus(), "SHIPPING_STATUS", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_STATUS: {IX, NotNull, VARCHAR(30)}
     * @param shippingStatus The value of shippingStatus as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStatus_PrefixSearch(String shippingStatus) {
        setShippingStatus_LikeSearch(shippingStatus, xcLSOPPre());
    }

    protected void regShippingStatus(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStatus(), "SHIPPING_STATUS"); }
    protected abstract ConditionValue xgetCValueShippingStatus();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_Equal(Long supplyCustomerId) {
        doSetSupplyCustomerId_Equal(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_Equal(Long supplyCustomerId) {
        regSupplyCustomerId(CK_EQ, supplyCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        doSetSupplyCustomerId_NotEqual(supplyCustomerId);
    }

    protected void doSetSupplyCustomerId_NotEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_NES, supplyCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GT, supplyCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessThan(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LT, supplyCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_GreaterEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_GE, supplyCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerId The value of supplyCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_LessEqual(Long supplyCustomerId) {
        regSupplyCustomerId(CK_LE, supplyCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param minNumber The min number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of supplyCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSupplyCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerIdList The collection of supplyCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_InScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_InScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_INS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param supplyCustomerIdList The collection of supplyCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        doSetSupplyCustomerId_NotInScope(supplyCustomerIdList);
    }

    protected void doSetSupplyCustomerId_NotInScope(Collection<Long> supplyCustomerIdList) {
        regINS(CK_NINS, cTL(supplyCustomerIdList), xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     */
    public void setSupplyCustomerId_IsNull() { regSupplyCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_ID: {IX, BIGINT(19)}
     */
    public void setSupplyCustomerId_IsNotNull() { regSupplyCustomerId(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerId(), "SUPPLY_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_Equal(String supplyCustomerCd) {
        doSetSupplyCustomerCd_Equal(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_Equal(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_EQ, supplyCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        doSetSupplyCustomerCd_NotEqual(fRES(supplyCustomerCd));
    }

    protected void doSetSupplyCustomerCd_NotEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_NES, supplyCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GT, fRES(supplyCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessThan(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LT, fRES(supplyCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_GreaterEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_GE, fRES(supplyCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_LessEqual(String supplyCustomerCd) {
        regSupplyCustomerCd(CK_LE, fRES(supplyCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_InScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_InScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_INS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCdList The collection of supplyCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        doSetSupplyCustomerCd_NotInScope(supplyCustomerCdList);
    }

    protected void doSetSupplyCustomerCd_NotInScope(Collection<String> supplyCustomerCdList) {
        regINS(CK_NINS, cTL(supplyCustomerCdList), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setSupplyCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerCd The value of supplyCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerCd_LikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerCd_NotLikeSearch(String supplyCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerCd), xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param supplyCustomerCd The value of supplyCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerCd_PrefixSearch(String supplyCustomerCd) {
        setSupplyCustomerCd_LikeSearch(supplyCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNull() { regSupplyCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNullOrEmpty() { regSupplyCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setSupplyCustomerCd_IsNotNull() { regSupplyCustomerCd(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerCd(), "SUPPLY_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_Equal(String supplyCustomerNm) {
        doSetSupplyCustomerNm_Equal(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_Equal(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_EQ, supplyCustomerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        doSetSupplyCustomerNm_NotEqual(fRES(supplyCustomerNm));
    }

    protected void doSetSupplyCustomerNm_NotEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_NES, supplyCustomerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GT, fRES(supplyCustomerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessThan(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LT, fRES(supplyCustomerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_GreaterEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_GE, fRES(supplyCustomerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_LessEqual(String supplyCustomerNm) {
        regSupplyCustomerNm(CK_LE, fRES(supplyCustomerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_InScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_InScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_INS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNmList The collection of supplyCustomerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        doSetSupplyCustomerNm_NotInScope(supplyCustomerNmList);
    }

    protected void doSetSupplyCustomerNm_NotInScope(Collection<String> supplyCustomerNmList) {
        regINS(CK_NINS, cTL(supplyCustomerNmList), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)} <br>
     * <pre>e.g. setSupplyCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param supplyCustomerNm The value of supplyCustomerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSupplyCustomerNm_LikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSupplyCustomerNm_NotLikeSearch(String supplyCustomerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(supplyCustomerNm), xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     * @param supplyCustomerNm The value of supplyCustomerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSupplyCustomerNm_PrefixSearch(String supplyCustomerNm) {
        setSupplyCustomerNm_LikeSearch(supplyCustomerNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNull() { regSupplyCustomerNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNullOrEmpty() { regSupplyCustomerNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SUPPLY_CUSTOMER_NM: {VARCHAR(255)}
     */
    public void setSupplyCustomerNm_IsNotNull() { regSupplyCustomerNm(CK_ISNN, DOBJ); }

    protected void regSupplyCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSupplyCustomerNm(), "SUPPLY_CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueSupplyCustomerNm();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_Equal(Long delivCustomerId) {
        doSetDelivCustomerId_Equal(delivCustomerId);
    }

    protected void doSetDelivCustomerId_Equal(Long delivCustomerId) {
        regDelivCustomerId(CK_EQ, delivCustomerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotEqual(Long delivCustomerId) {
        doSetDelivCustomerId_NotEqual(delivCustomerId);
    }

    protected void doSetDelivCustomerId_NotEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_NES, delivCustomerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerIdList The collection of delivCustomerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_InScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_InScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_INS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19)}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_Equal(String delivCustomerCd) {
        doSetDelivCustomerCd_Equal(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_Equal(String delivCustomerCd) {
        regDelivCustomerCd(CK_EQ, delivCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotEqual(String delivCustomerCd) {
        doSetDelivCustomerCd_NotEqual(fRES(delivCustomerCd));
    }

    protected void doSetDelivCustomerCd_NotEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_NES, delivCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_GT, fRES(delivCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessThan(String delivCustomerCd) {
        regDelivCustomerCd(CK_LT, fRES(delivCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_GreaterEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_GE, fRES(delivCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_LessEqual(String delivCustomerCd) {
        regDelivCustomerCd(CK_LE, fRES(delivCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_InScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_InScope(Collection<String> delivCustomerCdList) {
        regINS(CK_INS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCdList The collection of delivCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        doSetDelivCustomerCd_NotInScope(delivCustomerCdList);
    }

    protected void doSetDelivCustomerCd_NotInScope(Collection<String> delivCustomerCdList) {
        regINS(CK_NINS, cTL(delivCustomerCdList), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setDelivCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivCustomerCd The value of delivCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivCustomerCd_LikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivCustomerCd_NotLikeSearch(String delivCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivCustomerCd), xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     * @param delivCustomerCd The value of delivCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerCd_PrefixSearch(String delivCustomerCd) {
        setDelivCustomerCd_LikeSearch(delivCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNull() { regDelivCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNullOrEmpty() { regDelivCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_CD: {IX, VARCHAR(30)}
     */
    public void setDelivCustomerCd_IsNotNull() { regDelivCustomerCd(CK_ISNN, DOBJ); }

    protected void regDelivCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerCd(), "DELIV_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueDelivCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_Equal(String delivZipCd) {
        doSetDelivZipCd_Equal(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_Equal(String delivZipCd) {
        regDelivZipCd(CK_EQ, delivZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotEqual(String delivZipCd) {
        doSetDelivZipCd_NotEqual(fRES(delivZipCd));
    }

    protected void doSetDelivZipCd_NotEqual(String delivZipCd) {
        regDelivZipCd(CK_NES, delivZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterThan(String delivZipCd) {
        regDelivZipCd(CK_GT, fRES(delivZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessThan(String delivZipCd) {
        regDelivZipCd(CK_LT, fRES(delivZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_GreaterEqual(String delivZipCd) {
        regDelivZipCd(CK_GE, fRES(delivZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_LessEqual(String delivZipCd) {
        regDelivZipCd(CK_LE, fRES(delivZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCdList The collection of delivZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_InScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_InScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_InScope(Collection<String> delivZipCdList) {
        regINS(CK_INS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCdList The collection of delivZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        doSetDelivZipCd_NotInScope(delivZipCdList);
    }

    protected void doSetDelivZipCd_NotInScope(Collection<String> delivZipCdList) {
        regINS(CK_NINS, cTL(delivZipCdList), xgetCValueDelivZipCd(), "DELIV_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDelivZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivZipCd The value of delivZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivZipCd_LikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivZipCd_NotLikeSearch(String delivZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivZipCd), xgetCValueDelivZipCd(), "DELIV_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     * @param delivZipCd The value of delivZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivZipCd_PrefixSearch(String delivZipCd) {
        setDelivZipCd_LikeSearch(delivZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNull() { regDelivZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNullOrEmpty() { regDelivZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ZIP_CD: {VARCHAR(30)}
     */
    public void setDelivZipCd_IsNotNull() { regDelivZipCd(CK_ISNN, DOBJ); }

    protected void regDelivZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivZipCd(), "DELIV_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueDelivZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_Equal(String delivAddress1) {
        doSetDelivAddress1_Equal(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_Equal(String delivAddress1) {
        regDelivAddress1(CK_EQ, delivAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotEqual(String delivAddress1) {
        doSetDelivAddress1_NotEqual(fRES(delivAddress1));
    }

    protected void doSetDelivAddress1_NotEqual(String delivAddress1) {
        regDelivAddress1(CK_NES, delivAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterThan(String delivAddress1) {
        regDelivAddress1(CK_GT, fRES(delivAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessThan(String delivAddress1) {
        regDelivAddress1(CK_LT, fRES(delivAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_GreaterEqual(String delivAddress1) {
        regDelivAddress1(CK_GE, fRES(delivAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_LessEqual(String delivAddress1) {
        regDelivAddress1(CK_LE, fRES(delivAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_InScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_InScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_InScope(Collection<String> delivAddress1List) {
        regINS(CK_INS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1List The collection of delivAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        doSetDelivAddress1_NotInScope(delivAddress1List);
    }

    protected void doSetDelivAddress1_NotInScope(Collection<String> delivAddress1List) {
        regINS(CK_NINS, cTL(delivAddress1List), xgetCValueDelivAddress1(), "DELIV_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress1 The value of delivAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress1_LikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress1_NotLikeSearch(String delivAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress1), xgetCValueDelivAddress1(), "DELIV_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     * @param delivAddress1 The value of delivAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress1_PrefixSearch(String delivAddress1) {
        setDelivAddress1_LikeSearch(delivAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNull() { regDelivAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNullOrEmpty() { regDelivAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS1: {VARCHAR(255)}
     */
    public void setDelivAddress1_IsNotNull() { regDelivAddress1(CK_ISNN, DOBJ); }

    protected void regDelivAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress1(), "DELIV_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueDelivAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_Equal(String delivAddress2) {
        doSetDelivAddress2_Equal(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_Equal(String delivAddress2) {
        regDelivAddress2(CK_EQ, delivAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotEqual(String delivAddress2) {
        doSetDelivAddress2_NotEqual(fRES(delivAddress2));
    }

    protected void doSetDelivAddress2_NotEqual(String delivAddress2) {
        regDelivAddress2(CK_NES, delivAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterThan(String delivAddress2) {
        regDelivAddress2(CK_GT, fRES(delivAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessThan(String delivAddress2) {
        regDelivAddress2(CK_LT, fRES(delivAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_GreaterEqual(String delivAddress2) {
        regDelivAddress2(CK_GE, fRES(delivAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_LessEqual(String delivAddress2) {
        regDelivAddress2(CK_LE, fRES(delivAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_InScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_InScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_InScope(Collection<String> delivAddress2List) {
        regINS(CK_INS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2List The collection of delivAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        doSetDelivAddress2_NotInScope(delivAddress2List);
    }

    protected void doSetDelivAddress2_NotInScope(Collection<String> delivAddress2List) {
        regINS(CK_NINS, cTL(delivAddress2List), xgetCValueDelivAddress2(), "DELIV_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress2 The value of delivAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress2_LikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress2_NotLikeSearch(String delivAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress2), xgetCValueDelivAddress2(), "DELIV_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     * @param delivAddress2 The value of delivAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress2_PrefixSearch(String delivAddress2) {
        setDelivAddress2_LikeSearch(delivAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNull() { regDelivAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNullOrEmpty() { regDelivAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS2: {VARCHAR(255)}
     */
    public void setDelivAddress2_IsNotNull() { regDelivAddress2(CK_ISNN, DOBJ); }

    protected void regDelivAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress2(), "DELIV_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueDelivAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_Equal(String delivAddress3) {
        doSetDelivAddress3_Equal(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_Equal(String delivAddress3) {
        regDelivAddress3(CK_EQ, delivAddress3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotEqual(String delivAddress3) {
        doSetDelivAddress3_NotEqual(fRES(delivAddress3));
    }

    protected void doSetDelivAddress3_NotEqual(String delivAddress3) {
        regDelivAddress3(CK_NES, delivAddress3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterThan(String delivAddress3) {
        regDelivAddress3(CK_GT, fRES(delivAddress3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessThan(String delivAddress3) {
        regDelivAddress3(CK_LT, fRES(delivAddress3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_GreaterEqual(String delivAddress3) {
        regDelivAddress3(CK_GE, fRES(delivAddress3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_LessEqual(String delivAddress3) {
        regDelivAddress3(CK_LE, fRES(delivAddress3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_InScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_InScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_InScope(Collection<String> delivAddress3List) {
        regINS(CK_INS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3List The collection of delivAddress3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        doSetDelivAddress3_NotInScope(delivAddress3List);
    }

    protected void doSetDelivAddress3_NotInScope(Collection<String> delivAddress3List) {
        regINS(CK_NINS, cTL(delivAddress3List), xgetCValueDelivAddress3(), "DELIV_ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddress3 The value of delivAddress3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddress3_LikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddress3_NotLikeSearch(String delivAddress3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddress3), xgetCValueDelivAddress3(), "DELIV_ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     * @param delivAddress3 The value of delivAddress3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddress3_PrefixSearch(String delivAddress3) {
        setDelivAddress3_LikeSearch(delivAddress3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNull() { regDelivAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNullOrEmpty() { regDelivAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS3: {VARCHAR(255)}
     */
    public void setDelivAddress3_IsNotNull() { regDelivAddress3(CK_ISNN, DOBJ); }

    protected void regDelivAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddress3(), "DELIV_ADDRESS3"); }
    protected abstract ConditionValue xgetCValueDelivAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_Equal(String delivAddressSupply) {
        doSetDelivAddressSupply_Equal(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_Equal(String delivAddressSupply) {
        regDelivAddressSupply(CK_EQ, delivAddressSupply);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotEqual(String delivAddressSupply) {
        doSetDelivAddressSupply_NotEqual(fRES(delivAddressSupply));
    }

    protected void doSetDelivAddressSupply_NotEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_NES, delivAddressSupply);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_GT, fRES(delivAddressSupply));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessThan(String delivAddressSupply) {
        regDelivAddressSupply(CK_LT, fRES(delivAddressSupply));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_GreaterEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_GE, fRES(delivAddressSupply));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_LessEqual(String delivAddressSupply) {
        regDelivAddressSupply(CK_LE, fRES(delivAddressSupply));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_InScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_InScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_INS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupplyList The collection of delivAddressSupply as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        doSetDelivAddressSupply_NotInScope(delivAddressSupplyList);
    }

    protected void doSetDelivAddressSupply_NotInScope(Collection<String> delivAddressSupplyList) {
        regINS(CK_NINS, cTL(delivAddressSupplyList), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)} <br>
     * <pre>e.g. setDelivAddressSupply_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivAddressSupply The value of delivAddressSupply as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivAddressSupply_LikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivAddressSupply_NotLikeSearch(String delivAddressSupply, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivAddressSupply), xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     * @param delivAddressSupply The value of delivAddressSupply as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivAddressSupply_PrefixSearch(String delivAddressSupply) {
        setDelivAddressSupply_LikeSearch(delivAddressSupply, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNull() { regDelivAddressSupply(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNullOrEmpty() { regDelivAddressSupply(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_ADDRESS_SUPPLY: {VARCHAR(60)}
     */
    public void setDelivAddressSupply_IsNotNull() { regDelivAddressSupply(CK_ISNN, DOBJ); }

    protected void regDelivAddressSupply(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivAddressSupply(), "DELIV_ADDRESS_SUPPLY"); }
    protected abstract ConditionValue xgetCValueDelivAddressSupply();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_Equal(String delivTelNo) {
        doSetDelivTelNo_Equal(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_Equal(String delivTelNo) {
        regDelivTelNo(CK_EQ, delivTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotEqual(String delivTelNo) {
        doSetDelivTelNo_NotEqual(fRES(delivTelNo));
    }

    protected void doSetDelivTelNo_NotEqual(String delivTelNo) {
        regDelivTelNo(CK_NES, delivTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterThan(String delivTelNo) {
        regDelivTelNo(CK_GT, fRES(delivTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessThan(String delivTelNo) {
        regDelivTelNo(CK_LT, fRES(delivTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_GreaterEqual(String delivTelNo) {
        regDelivTelNo(CK_GE, fRES(delivTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_LessEqual(String delivTelNo) {
        regDelivTelNo(CK_LE, fRES(delivTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_InScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_InScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_InScope(Collection<String> delivTelNoList) {
        regINS(CK_INS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNoList The collection of delivTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        doSetDelivTelNo_NotInScope(delivTelNoList);
    }

    protected void doSetDelivTelNo_NotInScope(Collection<String> delivTelNoList) {
        regINS(CK_NINS, cTL(delivTelNoList), xgetCValueDelivTelNo(), "DELIV_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)} <br>
     * <pre>e.g. setDelivTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param delivTelNo The value of delivTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDelivTelNo_LikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDelivTelNo_NotLikeSearch(String delivTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(delivTelNo), xgetCValueDelivTelNo(), "DELIV_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     * @param delivTelNo The value of delivTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivTelNo_PrefixSearch(String delivTelNo) {
        setDelivTelNo_LikeSearch(delivTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNull() { regDelivTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNullOrEmpty() { regDelivTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_TEL_NO: {VARCHAR(255)}
     */
    public void setDelivTelNo_IsNotNull() { regDelivTelNo(CK_ISNN, DOBJ); }

    protected void regDelivTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivTelNo(), "DELIV_TEL_NO"); }
    protected abstract ConditionValue xgetCValueDelivTelNo();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_Equal(Long deliveryCourseId) {
        doSetDeliveryCourseId_Equal(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_Equal(Long deliveryCourseId) {
        regDeliveryCourseId(CK_EQ, deliveryCourseId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        doSetDeliveryCourseId_NotEqual(deliveryCourseId);
    }

    protected void doSetDeliveryCourseId_NotEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_NES, deliveryCourseId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GT, deliveryCourseId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessThan(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LT, deliveryCourseId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_GreaterEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_GE, deliveryCourseId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseId The value of deliveryCourseId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_LessEqual(Long deliveryCourseId) {
        regDeliveryCourseId(CK_LE, deliveryCourseId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param minNumber The min number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of deliveryCourseId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDeliveryCourseId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseIdList The collection of deliveryCourseId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_InScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_InScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_INS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     * @param deliveryCourseIdList The collection of deliveryCourseId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        doSetDeliveryCourseId_NotInScope(deliveryCourseIdList);
    }

    protected void doSetDeliveryCourseId_NotInScope(Collection<Long> deliveryCourseIdList) {
        regINS(CK_NINS, cTL(deliveryCourseIdList), xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     */
    public void setDeliveryCourseId_IsNull() { regDeliveryCourseId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_ID: {IX, BIGINT(19)}
     */
    public void setDeliveryCourseId_IsNotNull() { regDeliveryCourseId(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseId(), "DELIVERY_COURSE_ID"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_Equal(String deliveryCourseCd) {
        doSetDeliveryCourseCd_Equal(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_Equal(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_EQ, deliveryCourseCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        doSetDeliveryCourseCd_NotEqual(fRES(deliveryCourseCd));
    }

    protected void doSetDeliveryCourseCd_NotEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_NES, deliveryCourseCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GT, fRES(deliveryCourseCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessThan(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LT, fRES(deliveryCourseCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_GreaterEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_GE, fRES(deliveryCourseCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_LessEqual(String deliveryCourseCd) {
        regDeliveryCourseCd(CK_LE, fRES(deliveryCourseCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_InScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_InScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_INS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCdList The collection of deliveryCourseCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        doSetDeliveryCourseCd_NotInScope(deliveryCourseCdList);
    }

    protected void doSetDeliveryCourseCd_NotInScope(Collection<String> deliveryCourseCdList) {
        regINS(CK_NINS, cTL(deliveryCourseCdList), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDeliveryCourseCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param deliveryCourseCd The value of deliveryCourseCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDeliveryCourseCd_LikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDeliveryCourseCd_NotLikeSearch(String deliveryCourseCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(deliveryCourseCd), xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     * @param deliveryCourseCd The value of deliveryCourseCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryCourseCd_PrefixSearch(String deliveryCourseCd) {
        setDeliveryCourseCd_LikeSearch(deliveryCourseCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNull() { regDeliveryCourseCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNullOrEmpty() { regDeliveryCourseCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_COURSE_CD: {VARCHAR(30)}
     */
    public void setDeliveryCourseCd_IsNotNull() { regDeliveryCourseCd(CK_ISNN, DOBJ); }

    protected void regDeliveryCourseCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryCourseCd(), "DELIVERY_COURSE_CD"); }
    protected abstract ConditionValue xgetCValueDeliveryCourseCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_Equal(String emergencyFlg) {
        doSetEmergencyFlg_Equal(fRES(emergencyFlg));
    }

    protected void doSetEmergencyFlg_Equal(String emergencyFlg) {
        regEmergencyFlg(CK_EQ, emergencyFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotEqual(String emergencyFlg) {
        doSetEmergencyFlg_NotEqual(fRES(emergencyFlg));
    }

    protected void doSetEmergencyFlg_NotEqual(String emergencyFlg) {
        regEmergencyFlg(CK_NES, emergencyFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_GreaterThan(String emergencyFlg) {
        regEmergencyFlg(CK_GT, fRES(emergencyFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_LessThan(String emergencyFlg) {
        regEmergencyFlg(CK_LT, fRES(emergencyFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_GreaterEqual(String emergencyFlg) {
        regEmergencyFlg(CK_GE, fRES(emergencyFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_LessEqual(String emergencyFlg) {
        regEmergencyFlg(CK_LE, fRES(emergencyFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlgList The collection of emergencyFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_InScope(emergencyFlgList);
    }

    protected void doSetEmergencyFlg_InScope(Collection<String> emergencyFlgList) {
        regINS(CK_INS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlgList The collection of emergencyFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        doSetEmergencyFlg_NotInScope(emergencyFlgList);
    }

    protected void doSetEmergencyFlg_NotInScope(Collection<String> emergencyFlgList) {
        regINS(CK_NINS, cTL(emergencyFlgList), xgetCValueEmergencyFlg(), "EMERGENCY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)} <br>
     * <pre>e.g. setEmergencyFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param emergencyFlg The value of emergencyFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setEmergencyFlg_LikeSearch(String emergencyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(emergencyFlg), xgetCValueEmergencyFlg(), "EMERGENCY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setEmergencyFlg_NotLikeSearch(String emergencyFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(emergencyFlg), xgetCValueEmergencyFlg(), "EMERGENCY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     * @param emergencyFlg The value of emergencyFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setEmergencyFlg_PrefixSearch(String emergencyFlg) {
        setEmergencyFlg_LikeSearch(emergencyFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     */
    public void setEmergencyFlg_IsNull() { regEmergencyFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     */
    public void setEmergencyFlg_IsNullOrEmpty() { regEmergencyFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * EMERGENCY_FLG: {CHAR(1)}
     */
    public void setEmergencyFlg_IsNotNull() { regEmergencyFlg(CK_ISNN, DOBJ); }

    protected void regEmergencyFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueEmergencyFlg(), "EMERGENCY_FLG"); }
    protected abstract ConditionValue xgetCValueEmergencyFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_Equal(String pickingWorkMessage) {
        doSetPickingWorkMessage_Equal(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_Equal(String pickingWorkMessage) {
        regPickingWorkMessage(CK_EQ, pickingWorkMessage);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        doSetPickingWorkMessage_NotEqual(fRES(pickingWorkMessage));
    }

    protected void doSetPickingWorkMessage_NotEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_NES, pickingWorkMessage);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GT, fRES(pickingWorkMessage));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessThan(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LT, fRES(pickingWorkMessage));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_GreaterEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_GE, fRES(pickingWorkMessage));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_LessEqual(String pickingWorkMessage) {
        regPickingWorkMessage(CK_LE, fRES(pickingWorkMessage));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_InScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_InScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_INS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessageList The collection of pickingWorkMessage as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        doSetPickingWorkMessage_NotInScope(pickingWorkMessageList);
    }

    protected void doSetPickingWorkMessage_NotInScope(Collection<String> pickingWorkMessageList) {
        regINS(CK_NINS, cTL(pickingWorkMessageList), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)} <br>
     * <pre>e.g. setPickingWorkMessage_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingWorkMessage The value of pickingWorkMessage as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingWorkMessage_LikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingWorkMessage_NotLikeSearch(String pickingWorkMessage, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingWorkMessage), xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     * @param pickingWorkMessage The value of pickingWorkMessage as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingWorkMessage_PrefixSearch(String pickingWorkMessage) {
        setPickingWorkMessage_LikeSearch(pickingWorkMessage, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNull() { regPickingWorkMessage(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNullOrEmpty() { regPickingWorkMessage(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_WORK_MESSAGE: {VARCHAR(255)}
     */
    public void setPickingWorkMessage_IsNotNull() { regPickingWorkMessage(CK_ISNN, DOBJ); }

    protected void regPickingWorkMessage(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingWorkMessage(), "PICKING_WORK_MESSAGE"); }
    protected abstract ConditionValue xgetCValuePickingWorkMessage();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_Equal(String errorFlg) {
        doSetErrorFlg_Equal(fRES(errorFlg));
    }

    protected void doSetErrorFlg_Equal(String errorFlg) {
        regErrorFlg(CK_EQ, errorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotEqual(String errorFlg) {
        doSetErrorFlg_NotEqual(fRES(errorFlg));
    }

    protected void doSetErrorFlg_NotEqual(String errorFlg) {
        regErrorFlg(CK_NES, errorFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterThan(String errorFlg) {
        regErrorFlg(CK_GT, fRES(errorFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessThan(String errorFlg) {
        regErrorFlg(CK_LT, fRES(errorFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_GreaterEqual(String errorFlg) {
        regErrorFlg(CK_GE, fRES(errorFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_LessEqual(String errorFlg) {
        regErrorFlg(CK_LE, fRES(errorFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlgList The collection of errorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_InScope(Collection<String> errorFlgList) {
        doSetErrorFlg_InScope(errorFlgList);
    }

    protected void doSetErrorFlg_InScope(Collection<String> errorFlgList) {
        regINS(CK_INS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlgList The collection of errorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_NotInScope(Collection<String> errorFlgList) {
        doSetErrorFlg_NotInScope(errorFlgList);
    }

    protected void doSetErrorFlg_NotInScope(Collection<String> errorFlgList) {
        regINS(CK_NINS, cTL(errorFlgList), xgetCValueErrorFlg(), "ERROR_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1)} <br>
     * <pre>e.g. setErrorFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorFlg The value of errorFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorFlg_LikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorFlg_NotLikeSearch(String errorFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorFlg), xgetCValueErrorFlg(), "ERROR_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     * @param errorFlg The value of errorFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorFlg_PrefixSearch(String errorFlg) {
        setErrorFlg_LikeSearch(errorFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     */
    public void setErrorFlg_IsNull() { regErrorFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     */
    public void setErrorFlg_IsNullOrEmpty() { regErrorFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_FLG: {CHAR(1)}
     */
    public void setErrorFlg_IsNotNull() { regErrorFlg(CK_ISNN, DOBJ); }

    protected void regErrorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorFlg(), "ERROR_FLG"); }
    protected abstract ConditionValue xgetCValueErrorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_Equal(String errorMessageCd) {
        doSetErrorMessageCd_Equal(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_Equal(String errorMessageCd) {
        regErrorMessageCd(CK_EQ, errorMessageCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotEqual(String errorMessageCd) {
        doSetErrorMessageCd_NotEqual(fRES(errorMessageCd));
    }

    protected void doSetErrorMessageCd_NotEqual(String errorMessageCd) {
        regErrorMessageCd(CK_NES, errorMessageCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterThan(String errorMessageCd) {
        regErrorMessageCd(CK_GT, fRES(errorMessageCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessThan(String errorMessageCd) {
        regErrorMessageCd(CK_LT, fRES(errorMessageCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_GreaterEqual(String errorMessageCd) {
        regErrorMessageCd(CK_GE, fRES(errorMessageCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_LessEqual(String errorMessageCd) {
        regErrorMessageCd(CK_LE, fRES(errorMessageCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_InScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_InScope(Collection<String> errorMessageCdList) {
        regINS(CK_INS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCdList The collection of errorMessageCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        doSetErrorMessageCd_NotInScope(errorMessageCdList);
    }

    protected void doSetErrorMessageCd_NotInScope(Collection<String> errorMessageCdList) {
        regINS(CK_NINS, cTL(errorMessageCdList), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * <pre>e.g. setErrorMessageCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param errorMessageCd The value of errorMessageCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setErrorMessageCd_LikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setErrorMessageCd_NotLikeSearch(String errorMessageCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(errorMessageCd), xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     * @param errorMessageCd The value of errorMessageCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setErrorMessageCd_PrefixSearch(String errorMessageCd) {
        setErrorMessageCd_LikeSearch(errorMessageCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNull() { regErrorMessageCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNullOrEmpty() { regErrorMessageCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ERROR_MESSAGE_CD: {VARCHAR(100)}
     */
    public void setErrorMessageCd_IsNotNull() { regErrorMessageCd(CK_ISNN, DOBJ); }

    protected void regErrorMessageCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueErrorMessageCd(), "ERROR_MESSAGE_CD"); }
    protected abstract ConditionValue xgetCValueErrorMessageCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_Equal(String pickingBatchNo) {
        doSetPickingBatchNo_Equal(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_Equal(String pickingBatchNo) {
        regPickingBatchNo(CK_EQ, pickingBatchNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotEqual(String pickingBatchNo) {
        doSetPickingBatchNo_NotEqual(fRES(pickingBatchNo));
    }

    protected void doSetPickingBatchNo_NotEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_NES, pickingBatchNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterThan(String pickingBatchNo) {
        regPickingBatchNo(CK_GT, fRES(pickingBatchNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessThan(String pickingBatchNo) {
        regPickingBatchNo(CK_LT, fRES(pickingBatchNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_GreaterEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_GE, fRES(pickingBatchNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_LessEqual(String pickingBatchNo) {
        regPickingBatchNo(CK_LE, fRES(pickingBatchNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_InScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_InScope(Collection<String> pickingBatchNoList) {
        regINS(CK_INS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNoList The collection of pickingBatchNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        doSetPickingBatchNo_NotInScope(pickingBatchNoList);
    }

    protected void doSetPickingBatchNo_NotInScope(Collection<String> pickingBatchNoList) {
        regINS(CK_NINS, cTL(pickingBatchNoList), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)} <br>
     * <pre>e.g. setPickingBatchNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param pickingBatchNo The value of pickingBatchNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPickingBatchNo_LikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPickingBatchNo_NotLikeSearch(String pickingBatchNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(pickingBatchNo), xgetCValuePickingBatchNo(), "PICKING_BATCH_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     * @param pickingBatchNo The value of pickingBatchNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPickingBatchNo_PrefixSearch(String pickingBatchNo) {
        setPickingBatchNo_LikeSearch(pickingBatchNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNull() { regPickingBatchNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNullOrEmpty() { regPickingBatchNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PICKING_BATCH_NO: {IX, VARCHAR(30)}
     */
    public void setPickingBatchNo_IsNotNull() { regPickingBatchNo(CK_ISNN, DOBJ); }

    protected void regPickingBatchNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePickingBatchNo(), "PICKING_BATCH_NO"); }
    protected abstract ConditionValue xgetCValuePickingBatchNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_Equal(String stockOutFlg) {
        doSetStockOutFlg_Equal(fRES(stockOutFlg));
    }

    protected void doSetStockOutFlg_Equal(String stockOutFlg) {
        regStockOutFlg(CK_EQ, stockOutFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotEqual(String stockOutFlg) {
        doSetStockOutFlg_NotEqual(fRES(stockOutFlg));
    }

    protected void doSetStockOutFlg_NotEqual(String stockOutFlg) {
        regStockOutFlg(CK_NES, stockOutFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_GreaterThan(String stockOutFlg) {
        regStockOutFlg(CK_GT, fRES(stockOutFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_LessThan(String stockOutFlg) {
        regStockOutFlg(CK_LT, fRES(stockOutFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_GreaterEqual(String stockOutFlg) {
        regStockOutFlg(CK_GE, fRES(stockOutFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_LessEqual(String stockOutFlg) {
        regStockOutFlg(CK_LE, fRES(stockOutFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlgList The collection of stockOutFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_InScope(Collection<String> stockOutFlgList) {
        doSetStockOutFlg_InScope(stockOutFlgList);
    }

    protected void doSetStockOutFlg_InScope(Collection<String> stockOutFlgList) {
        regINS(CK_INS, cTL(stockOutFlgList), xgetCValueStockOutFlg(), "STOCK_OUT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlgList The collection of stockOutFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_NotInScope(Collection<String> stockOutFlgList) {
        doSetStockOutFlg_NotInScope(stockOutFlgList);
    }

    protected void doSetStockOutFlg_NotInScope(Collection<String> stockOutFlgList) {
        regINS(CK_NINS, cTL(stockOutFlgList), xgetCValueStockOutFlg(), "STOCK_OUT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setStockOutFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param stockOutFlg The value of stockOutFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setStockOutFlg_LikeSearch(String stockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(stockOutFlg), xgetCValueStockOutFlg(), "STOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setStockOutFlg_NotLikeSearch(String stockOutFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(stockOutFlg), xgetCValueStockOutFlg(), "STOCK_OUT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     * @param stockOutFlg The value of stockOutFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setStockOutFlg_PrefixSearch(String stockOutFlg) {
        setStockOutFlg_LikeSearch(stockOutFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     */
    public void setStockOutFlg_IsNull() { regStockOutFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     */
    public void setStockOutFlg_IsNullOrEmpty() { regStockOutFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * STOCK_OUT_FLG: {CHAR(1)}
     */
    public void setStockOutFlg_IsNotNull() { regStockOutFlg(CK_ISNN, DOBJ); }

    protected void regStockOutFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueStockOutFlg(), "STOCK_OUT_FLG"); }
    protected abstract ConditionValue xgetCValueStockOutFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
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
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
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
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterThan(Long allocInstHId) {
        regAllocInstHId(CK_GT, allocInstHId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessThan(Long allocInstHId) {
        regAllocInstHId(CK_LT, allocInstHId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_GreaterEqual(Long allocInstHId) {
        regAllocInstHId(CK_GE, allocInstHId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param allocInstHId The value of allocInstHId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocInstHId_LessEqual(Long allocInstHId) {
        regAllocInstHId(CK_LE, allocInstHId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param minNumber The min number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocInstHId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocInstHId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
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
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     * @param allocInstHIdList The collection of allocInstHId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        doSetAllocInstHId_NotInScope(allocInstHIdList);
    }

    protected void doSetAllocInstHId_NotInScope(Collection<Long> allocInstHIdList) {
        regINS(CK_NINS, cTL(allocInstHIdList), xgetCValueAllocInstHId(), "ALLOC_INST_H_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     */
    public void setAllocInstHId_IsNull() { regAllocInstHId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_INST_H_ID: {IX, BIGINT(19)}
     */
    public void setAllocInstHId_IsNotNull() { regAllocInstHId(CK_ISNN, DOBJ); }

    protected void regAllocInstHId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocInstHId(), "ALLOC_INST_H_ID"); }
    protected abstract ConditionValue xgetCValueAllocInstHId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_Equal(Long cod) {
        doSetCod_Equal(cod);
    }

    protected void doSetCod_Equal(Long cod) {
        regCod(CK_EQ, cod);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_NotEqual(Long cod) {
        doSetCod_NotEqual(cod);
    }

    protected void doSetCod_NotEqual(Long cod) {
        regCod(CK_NES, cod);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterThan(Long cod) {
        regCod(CK_GT, cod);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessThan(Long cod) {
        regCod(CK_LT, cod);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_GreaterEqual(Long cod) {
        regCod(CK_GE, cod);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param cod The value of cod as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCod_LessEqual(Long cod) {
        regCod(CK_LE, cod);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     * @param minNumber The min number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of cod. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCod_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCod(), "COD", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {BIGINT(19)}
     * @param codList The collection of cod as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_InScope(Collection<Long> codList) {
        doSetCod_InScope(codList);
    }

    protected void doSetCod_InScope(Collection<Long> codList) {
        regINS(CK_INS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD: {BIGINT(19)}
     * @param codList The collection of cod as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCod_NotInScope(Collection<Long> codList) {
        doSetCod_NotInScope(codList);
    }

    protected void doSetCod_NotInScope(Collection<Long> codList) {
        regINS(CK_NINS, cTL(codList), xgetCValueCod(), "COD");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     */
    public void setCod_IsNull() { regCod(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD: {BIGINT(19)}
     */
    public void setCod_IsNotNull() { regCod(CK_ISNN, DOBJ); }

    protected void regCod(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCod(), "COD"); }
    protected abstract ConditionValue xgetCValueCod();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_Equal(Long codTax) {
        doSetCodTax_Equal(codTax);
    }

    protected void doSetCodTax_Equal(Long codTax) {
        regCodTax(CK_EQ, codTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_NotEqual(Long codTax) {
        doSetCodTax_NotEqual(codTax);
    }

    protected void doSetCodTax_NotEqual(Long codTax) {
        regCodTax(CK_NES, codTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_GreaterThan(Long codTax) {
        regCodTax(CK_GT, codTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_LessThan(Long codTax) {
        regCodTax(CK_LT, codTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_GreaterEqual(Long codTax) {
        regCodTax(CK_GE, codTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTax The value of codTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCodTax_LessEqual(Long codTax) {
        regCodTax(CK_LE, codTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param minNumber The min number of codTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of codTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCodTax_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCodTax(), "COD_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTaxList The collection of codTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodTax_InScope(Collection<Long> codTaxList) {
        doSetCodTax_InScope(codTaxList);
    }

    protected void doSetCodTax_InScope(Collection<Long> codTaxList) {
        regINS(CK_INS, cTL(codTaxList), xgetCValueCodTax(), "COD_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     * @param codTaxList The collection of codTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCodTax_NotInScope(Collection<Long> codTaxList) {
        doSetCodTax_NotInScope(codTaxList);
    }

    protected void doSetCodTax_NotInScope(Collection<Long> codTaxList) {
        regINS(CK_NINS, cTL(codTaxList), xgetCValueCodTax(), "COD_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     */
    public void setCodTax_IsNull() { regCodTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * COD_TAX: {BIGINT(19)}
     */
    public void setCodTax_IsNotNull() { regCodTax(CK_ISNN, DOBJ); }

    protected void regCodTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCodTax(), "COD_TAX"); }
    protected abstract ConditionValue xgetCValueCodTax();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_Equal(totalPrice);
    }

    protected void doSetTotalPrice_Equal(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_EQ, totalPrice);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        doSetTotalPrice_NotEqual(totalPrice);
    }

    protected void doSetTotalPrice_NotEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_NES, totalPrice);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GT, totalPrice);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessThan(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LT, totalPrice);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_GreaterEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_GE, totalPrice);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPrice The value of totalPrice as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalPrice_LessEqual(java.math.BigDecimal totalPrice) {
        regTotalPrice(CK_LE, totalPrice);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param minNumber The min number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalPrice. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalPrice_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalPrice(), "TOTAL_PRICE", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPriceList The collection of totalPrice as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_InScope(totalPriceList);
    }

    protected void doSetTotalPrice_InScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_INS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     * @param totalPriceList The collection of totalPrice as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        doSetTotalPrice_NotInScope(totalPriceList);
    }

    protected void doSetTotalPrice_NotInScope(Collection<java.math.BigDecimal> totalPriceList) {
        regINS(CK_NINS, cTL(totalPriceList), xgetCValueTotalPrice(), "TOTAL_PRICE");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     */
    public void setTotalPrice_IsNull() { regTotalPrice(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_PRICE: {DECIMAL(14, 4)}
     */
    public void setTotalPrice_IsNotNull() { regTotalPrice(CK_ISNN, DOBJ); }

    protected void regTotalPrice(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalPrice(), "TOTAL_PRICE"); }
    protected abstract ConditionValue xgetCValueTotalPrice();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_Equal(java.math.BigDecimal totalTax) {
        doSetTotalTax_Equal(totalTax);
    }

    protected void doSetTotalTax_Equal(java.math.BigDecimal totalTax) {
        regTotalTax(CK_EQ, totalTax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        doSetTotalTax_NotEqual(totalTax);
    }

    protected void doSetTotalTax_NotEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_NES, totalTax);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GT, totalTax);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessThan(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LT, totalTax);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_GreaterEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_GE, totalTax);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTax The value of totalTax as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setTotalTax_LessEqual(java.math.BigDecimal totalTax) {
        regTotalTax(CK_LE, totalTax);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param minNumber The min number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of totalTax. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setTotalTax_RangeOf(java.math.BigDecimal minNumber, java.math.BigDecimal maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueTotalTax(), "TOTAL_TAX", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTaxList The collection of totalTax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_InScope(totalTaxList);
    }

    protected void doSetTotalTax_InScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_INS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     * @param totalTaxList The collection of totalTax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        doSetTotalTax_NotInScope(totalTaxList);
    }

    protected void doSetTotalTax_NotInScope(Collection<java.math.BigDecimal> totalTaxList) {
        regINS(CK_NINS, cTL(totalTaxList), xgetCValueTotalTax(), "TOTAL_TAX");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     */
    public void setTotalTax_IsNull() { regTotalTax(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TOTAL_TAX: {DECIMAL(14, 4)}
     */
    public void setTotalTax_IsNotNull() { regTotalTax(CK_ISNN, DOBJ); }

    protected void regTotalTax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTotalTax(), "TOTAL_TAX"); }
    protected abstract ConditionValue xgetCValueTotalTax();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_Equal(String slipTypeCd) {
        doSetSlipTypeCd_Equal(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_Equal(String slipTypeCd) {
        regSlipTypeCd(CK_EQ, slipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotEqual(String slipTypeCd) {
        doSetSlipTypeCd_NotEqual(fRES(slipTypeCd));
    }

    protected void doSetSlipTypeCd_NotEqual(String slipTypeCd) {
        regSlipTypeCd(CK_NES, slipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterThan(String slipTypeCd) {
        regSlipTypeCd(CK_GT, fRES(slipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessThan(String slipTypeCd) {
        regSlipTypeCd(CK_LT, fRES(slipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_GreaterEqual(String slipTypeCd) {
        regSlipTypeCd(CK_GE, fRES(slipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_LessEqual(String slipTypeCd) {
        regSlipTypeCd(CK_LE, fRES(slipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_InScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_InScope(Collection<String> slipTypeCdList) {
        regINS(CK_INS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCdList The collection of slipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        doSetSlipTypeCd_NotInScope(slipTypeCdList);
    }

    protected void doSetSlipTypeCd_NotInScope(Collection<String> slipTypeCdList) {
        regINS(CK_NINS, cTL(slipTypeCdList), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param slipTypeCd The value of slipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSlipTypeCd_LikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSlipTypeCd_NotLikeSearch(String slipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(slipTypeCd), xgetCValueSlipTypeCd(), "SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     * @param slipTypeCd The value of slipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSlipTypeCd_PrefixSearch(String slipTypeCd) {
        setSlipTypeCd_LikeSearch(slipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNull() { regSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNullOrEmpty() { regSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSlipTypeCd_IsNotNull() { regSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSlipTypeCd(), "SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_Equal(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_Equal(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_EQ, salesOrderSlipTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        doSetSalesOrderSlipTypeCd_NotEqual(fRES(salesOrderSlipTypeCd));
    }

    protected void doSetSalesOrderSlipTypeCd_NotEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_NES, salesOrderSlipTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessThan(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LT, fRES(salesOrderSlipTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_GreaterEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_GE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_LessEqual(String salesOrderSlipTypeCd) {
        regSalesOrderSlipTypeCd(CK_LE, fRES(salesOrderSlipTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_InScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_InScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_INS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCdList The collection of salesOrderSlipTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        doSetSalesOrderSlipTypeCd_NotInScope(salesOrderSlipTypeCdList);
    }

    protected void doSetSalesOrderSlipTypeCd_NotInScope(Collection<String> salesOrderSlipTypeCdList) {
        regINS(CK_NINS, cTL(salesOrderSlipTypeCdList), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrderSlipTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_LikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrderSlipTypeCd_NotLikeSearch(String salesOrderSlipTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrderSlipTypeCd), xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     * @param salesOrderSlipTypeCd The value of salesOrderSlipTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrderSlipTypeCd_PrefixSearch(String salesOrderSlipTypeCd) {
        setSalesOrderSlipTypeCd_LikeSearch(salesOrderSlipTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNull() { regSalesOrderSlipTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNullOrEmpty() { regSalesOrderSlipTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
     */
    public void setSalesOrderSlipTypeCd_IsNotNull() { regSalesOrderSlipTypeCd(CK_ISNN, DOBJ); }

    protected void regSalesOrderSlipTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrderSlipTypeCd(), "SALES_ORDER_SLIP_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrderSlipTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_Equal(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_Equal(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_EQ, directDeliveryTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        doSetDirectDeliveryTypeCd_NotEqual(fRES(directDeliveryTypeCd));
    }

    protected void doSetDirectDeliveryTypeCd_NotEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_NES, directDeliveryTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GT, fRES(directDeliveryTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessThan(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LT, fRES(directDeliveryTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_GreaterEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_GE, fRES(directDeliveryTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_LessEqual(String directDeliveryTypeCd) {
        regDirectDeliveryTypeCd(CK_LE, fRES(directDeliveryTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_InScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_InScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_INS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCdList The collection of directDeliveryTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        doSetDirectDeliveryTypeCd_NotInScope(directDeliveryTypeCdList);
    }

    protected void doSetDirectDeliveryTypeCd_NotInScope(Collection<String> directDeliveryTypeCdList) {
        regINS(CK_NINS, cTL(directDeliveryTypeCdList), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDirectDeliveryTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_LikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDirectDeliveryTypeCd_NotLikeSearch(String directDeliveryTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(directDeliveryTypeCd), xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     * @param directDeliveryTypeCd The value of directDeliveryTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDirectDeliveryTypeCd_PrefixSearch(String directDeliveryTypeCd) {
        setDirectDeliveryTypeCd_LikeSearch(directDeliveryTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNull() { regDirectDeliveryTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNullOrEmpty() { regDirectDeliveryTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
     */
    public void setDirectDeliveryTypeCd_IsNotNull() { regDirectDeliveryTypeCd(CK_ISNN, DOBJ); }

    protected void regDirectDeliveryTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDirectDeliveryTypeCd(), "DIRECT_DELIVERY_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueDirectDeliveryTypeCd();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_Equal(Long shippingTypeId) {
        doSetShippingTypeId_Equal(shippingTypeId);
    }

    protected void doSetShippingTypeId_Equal(Long shippingTypeId) {
        regShippingTypeId(CK_EQ, shippingTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_NotEqual(Long shippingTypeId) {
        doSetShippingTypeId_NotEqual(shippingTypeId);
    }

    protected void doSetShippingTypeId_NotEqual(Long shippingTypeId) {
        regShippingTypeId(CK_NES, shippingTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_GreaterThan(Long shippingTypeId) {
        regShippingTypeId(CK_GT, shippingTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_LessThan(Long shippingTypeId) {
        regShippingTypeId(CK_LT, shippingTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_GreaterEqual(Long shippingTypeId) {
        regShippingTypeId(CK_GE, shippingTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeId The value of shippingTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingTypeId_LessEqual(Long shippingTypeId) {
        regShippingTypeId(CK_LE, shippingTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param minNumber The min number of shippingTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of shippingTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setShippingTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeIdList The collection of shippingTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeId_InScope(Collection<Long> shippingTypeIdList) {
        doSetShippingTypeId_InScope(shippingTypeIdList);
    }

    protected void doSetShippingTypeId_InScope(Collection<Long> shippingTypeIdList) {
        regINS(CK_INS, cTL(shippingTypeIdList), xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     * @param shippingTypeIdList The collection of shippingTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeId_NotInScope(Collection<Long> shippingTypeIdList) {
        doSetShippingTypeId_NotInScope(shippingTypeIdList);
    }

    protected void doSetShippingTypeId_NotInScope(Collection<Long> shippingTypeIdList) {
        regINS(CK_NINS, cTL(shippingTypeIdList), xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     */
    public void setShippingTypeId_IsNull() { regShippingTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_ID: {BIGINT(19)}
     */
    public void setShippingTypeId_IsNotNull() { regShippingTypeId(CK_ISNN, DOBJ); }

    protected void regShippingTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTypeId(), "SHIPPING_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueShippingTypeId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_Equal(String shippingTypeCd) {
        doSetShippingTypeCd_Equal(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_Equal(String shippingTypeCd) {
        regShippingTypeCd(CK_EQ, shippingTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotEqual(String shippingTypeCd) {
        doSetShippingTypeCd_NotEqual(fRES(shippingTypeCd));
    }

    protected void doSetShippingTypeCd_NotEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_NES, shippingTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterThan(String shippingTypeCd) {
        regShippingTypeCd(CK_GT, fRES(shippingTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessThan(String shippingTypeCd) {
        regShippingTypeCd(CK_LT, fRES(shippingTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_GreaterEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_GE, fRES(shippingTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_LessEqual(String shippingTypeCd) {
        regShippingTypeCd(CK_LE, fRES(shippingTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_InScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_InScope(Collection<String> shippingTypeCdList) {
        regINS(CK_INS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCdList The collection of shippingTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        doSetShippingTypeCd_NotInScope(shippingTypeCdList);
    }

    protected void doSetShippingTypeCd_NotInScope(Collection<String> shippingTypeCdList) {
        regINS(CK_NINS, cTL(shippingTypeCdList), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingTypeCd The value of shippingTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingTypeCd_LikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingTypeCd_NotLikeSearch(String shippingTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingTypeCd), xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     * @param shippingTypeCd The value of shippingTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingTypeCd_PrefixSearch(String shippingTypeCd) {
        setShippingTypeCd_LikeSearch(shippingTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNull() { regShippingTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNullOrEmpty() { regShippingTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_TYPE_CD: {VARCHAR(30)}
     */
    public void setShippingTypeCd_IsNotNull() { regShippingTypeCd(CK_ISNN, DOBJ); }

    protected void regShippingTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingTypeCd(), "SHIPPING_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueShippingTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_Equal(String salesOrgCd) {
        doSetSalesOrgCd_Equal(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_Equal(String salesOrgCd) {
        regSalesOrgCd(CK_EQ, salesOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotEqual(String salesOrgCd) {
        doSetSalesOrgCd_NotEqual(fRES(salesOrgCd));
    }

    protected void doSetSalesOrgCd_NotEqual(String salesOrgCd) {
        regSalesOrgCd(CK_NES, salesOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_InScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_InScope(Collection<String> salesOrgCdList) {
        regINS(CK_INS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCdList The collection of salesOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        doSetSalesOrgCd_NotInScope(salesOrgCdList);
    }

    protected void doSetSalesOrgCd_NotInScope(Collection<String> salesOrgCdList) {
        regINS(CK_NINS, cTL(salesOrgCdList), xgetCValueSalesOrgCd(), "SALES_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setSalesOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param salesOrgCd The value of salesOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSalesOrgCd_LikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_Equal(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_Equal(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_EQ, koguchiDeliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        doSetKoguchiDeliveryFlg_NotEqual(fRES(koguchiDeliveryFlg));
    }

    protected void doSetKoguchiDeliveryFlg_NotEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_NES, koguchiDeliveryFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GT, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessThan(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LT, fRES(koguchiDeliveryFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_GreaterEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_GE, fRES(koguchiDeliveryFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_LessEqual(String koguchiDeliveryFlg) {
        regKoguchiDeliveryFlg(CK_LE, fRES(koguchiDeliveryFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_InScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_InScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_INS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlgList The collection of koguchiDeliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        doSetKoguchiDeliveryFlg_NotInScope(koguchiDeliveryFlgList);
    }

    protected void doSetKoguchiDeliveryFlg_NotInScope(Collection<String> koguchiDeliveryFlgList) {
        regINS(CK_NINS, cTL(koguchiDeliveryFlgList), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)} <br>
     * <pre>e.g. setKoguchiDeliveryFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_LikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKoguchiDeliveryFlg_NotLikeSearch(String koguchiDeliveryFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(koguchiDeliveryFlg), xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     * @param koguchiDeliveryFlg The value of koguchiDeliveryFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKoguchiDeliveryFlg_PrefixSearch(String koguchiDeliveryFlg) {
        setKoguchiDeliveryFlg_LikeSearch(koguchiDeliveryFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNull() { regKoguchiDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNullOrEmpty() { regKoguchiDeliveryFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOGUCHI_DELIVERY_FLG: {CHAR(1)}
     */
    public void setKoguchiDeliveryFlg_IsNotNull() { regKoguchiDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regKoguchiDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKoguchiDeliveryFlg(), "KOGUCHI_DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueKoguchiDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_Equal(String kohaiContractorCd) {
        doSetKohaiContractorCd_Equal(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_Equal(String kohaiContractorCd) {
        regKohaiContractorCd(CK_EQ, kohaiContractorCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        doSetKohaiContractorCd_NotEqual(fRES(kohaiContractorCd));
    }

    protected void doSetKohaiContractorCd_NotEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_NES, kohaiContractorCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GT, fRES(kohaiContractorCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessThan(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LT, fRES(kohaiContractorCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_GreaterEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_GE, fRES(kohaiContractorCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_LessEqual(String kohaiContractorCd) {
        regKohaiContractorCd(CK_LE, fRES(kohaiContractorCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_InScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_InScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_INS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCdList The collection of kohaiContractorCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        doSetKohaiContractorCd_NotInScope(kohaiContractorCdList);
    }

    protected void doSetKohaiContractorCd_NotInScope(Collection<String> kohaiContractorCdList) {
        regINS(CK_NINS, cTL(kohaiContractorCdList), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setKohaiContractorCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorCd The value of kohaiContractorCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorCd_LikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorCd_NotLikeSearch(String kohaiContractorCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorCd), xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     * @param kohaiContractorCd The value of kohaiContractorCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorCd_PrefixSearch(String kohaiContractorCd) {
        setKohaiContractorCd_LikeSearch(kohaiContractorCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNull() { regKohaiContractorCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNullOrEmpty() { regKohaiContractorCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
     */
    public void setKohaiContractorCd_IsNotNull() { regKohaiContractorCd(CK_ISNN, DOBJ); }

    protected void regKohaiContractorCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorCd(), "KOHAI_CONTRACTOR_CD"); }
    protected abstract ConditionValue xgetCValueKohaiContractorCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_Equal(String kohaiContractorNm) {
        doSetKohaiContractorNm_Equal(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_Equal(String kohaiContractorNm) {
        regKohaiContractorNm(CK_EQ, kohaiContractorNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        doSetKohaiContractorNm_NotEqual(fRES(kohaiContractorNm));
    }

    protected void doSetKohaiContractorNm_NotEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_NES, kohaiContractorNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GT, fRES(kohaiContractorNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessThan(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LT, fRES(kohaiContractorNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_GreaterEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_GE, fRES(kohaiContractorNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_LessEqual(String kohaiContractorNm) {
        regKohaiContractorNm(CK_LE, fRES(kohaiContractorNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_InScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_InScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_INS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNmList The collection of kohaiContractorNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        doSetKohaiContractorNm_NotInScope(kohaiContractorNmList);
    }

    protected void doSetKohaiContractorNm_NotInScope(Collection<String> kohaiContractorNmList) {
        regINS(CK_NINS, cTL(kohaiContractorNmList), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * <pre>e.g. setKohaiContractorNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param kohaiContractorNm The value of kohaiContractorNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setKohaiContractorNm_LikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setKohaiContractorNm_NotLikeSearch(String kohaiContractorNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(kohaiContractorNm), xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     * @param kohaiContractorNm The value of kohaiContractorNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setKohaiContractorNm_PrefixSearch(String kohaiContractorNm) {
        setKohaiContractorNm_LikeSearch(kohaiContractorNm, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNull() { regKohaiContractorNm(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNullOrEmpty() { regKohaiContractorNm(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
     */
    public void setKohaiContractorNm_IsNotNull() { regKohaiContractorNm(CK_ISNN, DOBJ); }

    protected void regKohaiContractorNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueKohaiContractorNm(), "KOHAI_CONTRACTOR_NM"); }
    protected abstract ConditionValue xgetCValueKohaiContractorNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_Equal(String shippingReasonCd) {
        doSetShippingReasonCd_Equal(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_Equal(String shippingReasonCd) {
        regShippingReasonCd(CK_EQ, shippingReasonCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotEqual(String shippingReasonCd) {
        doSetShippingReasonCd_NotEqual(fRES(shippingReasonCd));
    }

    protected void doSetShippingReasonCd_NotEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_NES, shippingReasonCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterThan(String shippingReasonCd) {
        regShippingReasonCd(CK_GT, fRES(shippingReasonCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessThan(String shippingReasonCd) {
        regShippingReasonCd(CK_LT, fRES(shippingReasonCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_GreaterEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_GE, fRES(shippingReasonCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_LessEqual(String shippingReasonCd) {
        regShippingReasonCd(CK_LE, fRES(shippingReasonCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_InScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_InScope(Collection<String> shippingReasonCdList) {
        regINS(CK_INS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCdList The collection of shippingReasonCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        doSetShippingReasonCd_NotInScope(shippingReasonCdList);
    }

    protected void doSetShippingReasonCd_NotInScope(Collection<String> shippingReasonCdList) {
        regINS(CK_NINS, cTL(shippingReasonCdList), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setShippingReasonCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param shippingReasonCd The value of shippingReasonCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setShippingReasonCd_LikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setShippingReasonCd_NotLikeSearch(String shippingReasonCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(shippingReasonCd), xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     * @param shippingReasonCd The value of shippingReasonCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingReasonCd_PrefixSearch(String shippingReasonCd) {
        setShippingReasonCd_LikeSearch(shippingReasonCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNull() { regShippingReasonCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNullOrEmpty() { regShippingReasonCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_REASON_CD: {VARCHAR(30)}
     */
    public void setShippingReasonCd_IsNotNull() { regShippingReasonCd(CK_ISNN, DOBJ); }

    protected void regShippingReasonCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingReasonCd(), "SHIPPING_REASON_CD"); }
    protected abstract ConditionValue xgetCValueShippingReasonCd();

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
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_Equal(String tenhanshaCd) {
        doSetTenhanshaCd_Equal(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_Equal(String tenhanshaCd) {
        regTenhanshaCd(CK_EQ, tenhanshaCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotEqual(String tenhanshaCd) {
        doSetTenhanshaCd_NotEqual(fRES(tenhanshaCd));
    }

    protected void doSetTenhanshaCd_NotEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_NES, tenhanshaCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterThan(String tenhanshaCd) {
        regTenhanshaCd(CK_GT, fRES(tenhanshaCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessThan(String tenhanshaCd) {
        regTenhanshaCd(CK_LT, fRES(tenhanshaCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_GreaterEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_GE, fRES(tenhanshaCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_LessEqual(String tenhanshaCd) {
        regTenhanshaCd(CK_LE, fRES(tenhanshaCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_InScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_InScope(Collection<String> tenhanshaCdList) {
        regINS(CK_INS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCdList The collection of tenhanshaCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        doSetTenhanshaCd_NotInScope(tenhanshaCdList);
    }

    protected void doSetTenhanshaCd_NotInScope(Collection<String> tenhanshaCdList) {
        regINS(CK_NINS, cTL(tenhanshaCdList), xgetCValueTenhanshaCd(), "TENHANSHA_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaCd The value of tenhanshaCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaCd_LikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaCd_NotLikeSearch(String tenhanshaCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaCd), xgetCValueTenhanshaCd(), "TENHANSHA_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     * @param tenhanshaCd The value of tenhanshaCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaCd_PrefixSearch(String tenhanshaCd) {
        setTenhanshaCd_LikeSearch(tenhanshaCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNull() { regTenhanshaCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNullOrEmpty() { regTenhanshaCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_CD: {VARCHAR(30)}
     */
    public void setTenhanshaCd_IsNotNull() { regTenhanshaCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaCd(), "TENHANSHA_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_Equal(String tenhanshaOrderNo) {
        doSetTenhanshaOrderNo_Equal(fRES(tenhanshaOrderNo));
    }

    protected void doSetTenhanshaOrderNo_Equal(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_EQ, tenhanshaOrderNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_NotEqual(String tenhanshaOrderNo) {
        doSetTenhanshaOrderNo_NotEqual(fRES(tenhanshaOrderNo));
    }

    protected void doSetTenhanshaOrderNo_NotEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_NES, tenhanshaOrderNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_GreaterThan(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_GT, fRES(tenhanshaOrderNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_LessThan(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_LT, fRES(tenhanshaOrderNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_GreaterEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_GE, fRES(tenhanshaOrderNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_LessEqual(String tenhanshaOrderNo) {
        regTenhanshaOrderNo(CK_LE, fRES(tenhanshaOrderNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNoList The collection of tenhanshaOrderNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_InScope(Collection<String> tenhanshaOrderNoList) {
        doSetTenhanshaOrderNo_InScope(tenhanshaOrderNoList);
    }

    protected void doSetTenhanshaOrderNo_InScope(Collection<String> tenhanshaOrderNoList) {
        regINS(CK_INS, cTL(tenhanshaOrderNoList), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNoList The collection of tenhanshaOrderNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_NotInScope(Collection<String> tenhanshaOrderNoList) {
        doSetTenhanshaOrderNo_NotInScope(tenhanshaOrderNoList);
    }

    protected void doSetTenhanshaOrderNo_NotInScope(Collection<String> tenhanshaOrderNoList) {
        regINS(CK_NINS, cTL(tenhanshaOrderNoList), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaOrderNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaOrderNo_LikeSearch(String tenhanshaOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaOrderNo), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaOrderNo_NotLikeSearch(String tenhanshaOrderNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaOrderNo), xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     * @param tenhanshaOrderNo The value of tenhanshaOrderNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaOrderNo_PrefixSearch(String tenhanshaOrderNo) {
        setTenhanshaOrderNo_LikeSearch(tenhanshaOrderNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNull() { regTenhanshaOrderNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNullOrEmpty() { regTenhanshaOrderNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ORDER_NO: {VARCHAR(30)}
     */
    public void setTenhanshaOrderNo_IsNotNull() { regTenhanshaOrderNo(CK_ISNN, DOBJ); }

    protected void regTenhanshaOrderNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaOrderNo(), "TENHANSHA_ORDER_NO"); }
    protected abstract ConditionValue xgetCValueTenhanshaOrderNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_Equal(String destinationCd) {
        doSetDestinationCd_Equal(fRES(destinationCd));
    }

    protected void doSetDestinationCd_Equal(String destinationCd) {
        regDestinationCd(CK_EQ, destinationCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_NotEqual(String destinationCd) {
        doSetDestinationCd_NotEqual(fRES(destinationCd));
    }

    protected void doSetDestinationCd_NotEqual(String destinationCd) {
        regDestinationCd(CK_NES, destinationCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_GreaterThan(String destinationCd) {
        regDestinationCd(CK_GT, fRES(destinationCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_LessThan(String destinationCd) {
        regDestinationCd(CK_LT, fRES(destinationCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_GreaterEqual(String destinationCd) {
        regDestinationCd(CK_GE, fRES(destinationCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_LessEqual(String destinationCd) {
        regDestinationCd(CK_LE, fRES(destinationCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCdList The collection of destinationCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_InScope(Collection<String> destinationCdList) {
        doSetDestinationCd_InScope(destinationCdList);
    }

    protected void doSetDestinationCd_InScope(Collection<String> destinationCdList) {
        regINS(CK_INS, cTL(destinationCdList), xgetCValueDestinationCd(), "DESTINATION_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCdList The collection of destinationCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_NotInScope(Collection<String> destinationCdList) {
        doSetDestinationCd_NotInScope(destinationCdList);
    }

    protected void doSetDestinationCd_NotInScope(Collection<String> destinationCdList) {
        regINS(CK_NINS, cTL(destinationCdList), xgetCValueDestinationCd(), "DESTINATION_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationCd The value of destinationCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationCd_LikeSearch(String destinationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationCd), xgetCValueDestinationCd(), "DESTINATION_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationCd_NotLikeSearch(String destinationCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationCd), xgetCValueDestinationCd(), "DESTINATION_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     * @param destinationCd The value of destinationCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationCd_PrefixSearch(String destinationCd) {
        setDestinationCd_LikeSearch(destinationCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNull() { regDestinationCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNullOrEmpty() { regDestinationCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_CD: {VARCHAR(30)}
     */
    public void setDestinationCd_IsNotNull() { regDestinationCd(CK_ISNN, DOBJ); }

    protected void regDestinationCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationCd(), "DESTINATION_CD"); }
    protected abstract ConditionValue xgetCValueDestinationCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_Equal(String destinationNm1) {
        doSetDestinationNm1_Equal(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_Equal(String destinationNm1) {
        regDestinationNm1(CK_EQ, destinationNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotEqual(String destinationNm1) {
        doSetDestinationNm1_NotEqual(fRES(destinationNm1));
    }

    protected void doSetDestinationNm1_NotEqual(String destinationNm1) {
        regDestinationNm1(CK_NES, destinationNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterThan(String destinationNm1) {
        regDestinationNm1(CK_GT, fRES(destinationNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessThan(String destinationNm1) {
        regDestinationNm1(CK_LT, fRES(destinationNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_GreaterEqual(String destinationNm1) {
        regDestinationNm1(CK_GE, fRES(destinationNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_LessEqual(String destinationNm1) {
        regDestinationNm1(CK_LE, fRES(destinationNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_InScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_InScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_InScope(Collection<String> destinationNm1List) {
        regINS(CK_INS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1List The collection of destinationNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        doSetDestinationNm1_NotInScope(destinationNm1List);
    }

    protected void doSetDestinationNm1_NotInScope(Collection<String> destinationNm1List) {
        regINS(CK_NINS, cTL(destinationNm1List), xgetCValueDestinationNm1(), "DESTINATION_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm1 The value of destinationNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm1_LikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm1_NotLikeSearch(String destinationNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm1), xgetCValueDestinationNm1(), "DESTINATION_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     * @param destinationNm1 The value of destinationNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm1_PrefixSearch(String destinationNm1) {
        setDestinationNm1_LikeSearch(destinationNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNull() { regDestinationNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNullOrEmpty() { regDestinationNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM1: {VARCHAR(60)}
     */
    public void setDestinationNm1_IsNotNull() { regDestinationNm1(CK_ISNN, DOBJ); }

    protected void regDestinationNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm1(), "DESTINATION_NM1"); }
    protected abstract ConditionValue xgetCValueDestinationNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_Equal(String destinationNm2) {
        doSetDestinationNm2_Equal(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_Equal(String destinationNm2) {
        regDestinationNm2(CK_EQ, destinationNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotEqual(String destinationNm2) {
        doSetDestinationNm2_NotEqual(fRES(destinationNm2));
    }

    protected void doSetDestinationNm2_NotEqual(String destinationNm2) {
        regDestinationNm2(CK_NES, destinationNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterThan(String destinationNm2) {
        regDestinationNm2(CK_GT, fRES(destinationNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessThan(String destinationNm2) {
        regDestinationNm2(CK_LT, fRES(destinationNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_GreaterEqual(String destinationNm2) {
        regDestinationNm2(CK_GE, fRES(destinationNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_LessEqual(String destinationNm2) {
        regDestinationNm2(CK_LE, fRES(destinationNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_InScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_InScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_InScope(Collection<String> destinationNm2List) {
        regINS(CK_INS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2List The collection of destinationNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        doSetDestinationNm2_NotInScope(destinationNm2List);
    }

    protected void doSetDestinationNm2_NotInScope(Collection<String> destinationNm2List) {
        regINS(CK_NINS, cTL(destinationNm2List), xgetCValueDestinationNm2(), "DESTINATION_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNm2 The value of destinationNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNm2_LikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNm2_NotLikeSearch(String destinationNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNm2), xgetCValueDestinationNm2(), "DESTINATION_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     * @param destinationNm2 The value of destinationNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNm2_PrefixSearch(String destinationNm2) {
        setDestinationNm2_LikeSearch(destinationNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNull() { regDestinationNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNullOrEmpty() { regDestinationNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM2: {VARCHAR(60)}
     */
    public void setDestinationNm2_IsNotNull() { regDestinationNm2(CK_ISNN, DOBJ); }

    protected void regDestinationNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNm2(), "DESTINATION_NM2"); }
    protected abstract ConditionValue xgetCValueDestinationNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_Equal(String destinationNmKana) {
        doSetDestinationNmKana_Equal(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_Equal(String destinationNmKana) {
        regDestinationNmKana(CK_EQ, destinationNmKana);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotEqual(String destinationNmKana) {
        doSetDestinationNmKana_NotEqual(fRES(destinationNmKana));
    }

    protected void doSetDestinationNmKana_NotEqual(String destinationNmKana) {
        regDestinationNmKana(CK_NES, destinationNmKana);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterThan(String destinationNmKana) {
        regDestinationNmKana(CK_GT, fRES(destinationNmKana));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessThan(String destinationNmKana) {
        regDestinationNmKana(CK_LT, fRES(destinationNmKana));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_GreaterEqual(String destinationNmKana) {
        regDestinationNmKana(CK_GE, fRES(destinationNmKana));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_LessEqual(String destinationNmKana) {
        regDestinationNmKana(CK_LE, fRES(destinationNmKana));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_InScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_InScope(Collection<String> destinationNmKanaList) {
        regINS(CK_INS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKanaList The collection of destinationNmKana as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        doSetDestinationNmKana_NotInScope(destinationNmKanaList);
    }

    protected void doSetDestinationNmKana_NotInScope(Collection<String> destinationNmKanaList) {
        regINS(CK_NINS, cTL(destinationNmKanaList), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * <pre>e.g. setDestinationNmKana_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationNmKana The value of destinationNmKana as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationNmKana_LikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationNmKana_NotLikeSearch(String destinationNmKana, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationNmKana), xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     * @param destinationNmKana The value of destinationNmKana as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationNmKana_PrefixSearch(String destinationNmKana) {
        setDestinationNmKana_LikeSearch(destinationNmKana, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNull() { regDestinationNmKana(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNullOrEmpty() { regDestinationNmKana(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_NM_KANA: {VARCHAR(60)}
     */
    public void setDestinationNmKana_IsNotNull() { regDestinationNmKana(CK_ISNN, DOBJ); }

    protected void regDestinationNmKana(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationNmKana(), "DESTINATION_NM_KANA"); }
    protected abstract ConditionValue xgetCValueDestinationNmKana();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_Equal(String destinationFax) {
        doSetDestinationFax_Equal(fRES(destinationFax));
    }

    protected void doSetDestinationFax_Equal(String destinationFax) {
        regDestinationFax(CK_EQ, destinationFax);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotEqual(String destinationFax) {
        doSetDestinationFax_NotEqual(fRES(destinationFax));
    }

    protected void doSetDestinationFax_NotEqual(String destinationFax) {
        regDestinationFax(CK_NES, destinationFax);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterThan(String destinationFax) {
        regDestinationFax(CK_GT, fRES(destinationFax));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessThan(String destinationFax) {
        regDestinationFax(CK_LT, fRES(destinationFax));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_GreaterEqual(String destinationFax) {
        regDestinationFax(CK_GE, fRES(destinationFax));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_LessEqual(String destinationFax) {
        regDestinationFax(CK_LE, fRES(destinationFax));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_InScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_InScope(destinationFaxList);
    }

    protected void doSetDestinationFax_InScope(Collection<String> destinationFaxList) {
        regINS(CK_INS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFaxList The collection of destinationFax as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        doSetDestinationFax_NotInScope(destinationFaxList);
    }

    protected void doSetDestinationFax_NotInScope(Collection<String> destinationFaxList) {
        regINS(CK_NINS, cTL(destinationFaxList), xgetCValueDestinationFax(), "DESTINATION_FAX");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)} <br>
     * <pre>e.g. setDestinationFax_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param destinationFax The value of destinationFax as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setDestinationFax_LikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setDestinationFax_NotLikeSearch(String destinationFax, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(destinationFax), xgetCValueDestinationFax(), "DESTINATION_FAX", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     * @param destinationFax The value of destinationFax as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDestinationFax_PrefixSearch(String destinationFax) {
        setDestinationFax_LikeSearch(destinationFax, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNull() { regDestinationFax(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNullOrEmpty() { regDestinationFax(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DESTINATION_FAX: {VARCHAR(30)}
     */
    public void setDestinationFax_IsNotNull() { regDestinationFax(CK_ISNN, DOBJ); }

    protected void regDestinationFax(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDestinationFax(), "DESTINATION_FAX"); }
    protected abstract ConditionValue xgetCValueDestinationFax();

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
    public HpSLCFunction<TShippingPlanHCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, TShippingPlanHCB.class);
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
    public HpSLCFunction<TShippingPlanHCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, TShippingPlanHCB.class);
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
    public HpSLCFunction<TShippingPlanHCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, TShippingPlanHCB.class);
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
    public HpSLCFunction<TShippingPlanHCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, TShippingPlanHCB.class);
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
    public HpSLCFunction<TShippingPlanHCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, TShippingPlanHCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;TShippingPlanHCB&gt;() {
     *     public void query(TShippingPlanHCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<TShippingPlanHCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, TShippingPlanHCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingPlanHCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(TShippingPlanHCQ sq);

    protected TShippingPlanHCB xcreateScalarConditionCB() {
        TShippingPlanHCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected TShippingPlanHCB xcreateScalarConditionPartitionByCB() {
        TShippingPlanHCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<TShippingPlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingPlanHCB cb = new TShippingPlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SHIPPING_PLAN_H_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(TShippingPlanHCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<TShippingPlanHCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(TShippingPlanHCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingPlanHCB cb = new TShippingPlanHCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SHIPPING_PLAN_H_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(TShippingPlanHCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<TShippingPlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingPlanHCB cb = new TShippingPlanHCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(TShippingPlanHCQ sq);

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
    protected TShippingPlanHCB newMyCB() {
        return new TShippingPlanHCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return TShippingPlanHCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
