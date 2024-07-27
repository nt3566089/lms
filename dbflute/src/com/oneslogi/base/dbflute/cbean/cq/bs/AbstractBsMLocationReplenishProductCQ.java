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
 * The abstract condition-query of m_location_replenish_product.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMLocationReplenishProductCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMLocationReplenishProductCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_location_replenish_product";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_Equal(Long locationReplenishProductId) {
        doSetLocationReplenishProductId_Equal(locationReplenishProductId);
    }

    protected void doSetLocationReplenishProductId_Equal(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_EQ, locationReplenishProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_NotEqual(Long locationReplenishProductId) {
        doSetLocationReplenishProductId_NotEqual(locationReplenishProductId);
    }

    protected void doSetLocationReplenishProductId_NotEqual(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_NES, locationReplenishProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_GreaterThan(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_GT, locationReplenishProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_LessThan(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_LT, locationReplenishProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_GreaterEqual(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_GE, locationReplenishProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductId The value of locationReplenishProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_LessEqual(Long locationReplenishProductId) {
        regLocationReplenishProductId(CK_LE, locationReplenishProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of locationReplenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationReplenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationReplenishProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationReplenishProductId(), "LOCATION_REPLENISH_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductIdList The collection of locationReplenishProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_InScope(Collection<Long> locationReplenishProductIdList) {
        doSetLocationReplenishProductId_InScope(locationReplenishProductIdList);
    }

    protected void doSetLocationReplenishProductId_InScope(Collection<Long> locationReplenishProductIdList) {
        regINS(CK_INS, cTL(locationReplenishProductIdList), xgetCValueLocationReplenishProductId(), "LOCATION_REPLENISH_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param locationReplenishProductIdList The collection of locationReplenishProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationReplenishProductId_NotInScope(Collection<Long> locationReplenishProductIdList) {
        doSetLocationReplenishProductId_NotInScope(locationReplenishProductIdList);
    }

    protected void doSetLocationReplenishProductId_NotInScope(Collection<Long> locationReplenishProductIdList) {
        regINS(CK_NINS, cTL(locationReplenishProductIdList), xgetCValueLocationReplenishProductId(), "LOCATION_REPLENISH_PRODUCT_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLocationReplenishProductId_IsNull() { regLocationReplenishProductId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setLocationReplenishProductId_IsNotNull() { regLocationReplenishProductId(CK_ISNN, DOBJ); }

    protected void regLocationReplenishProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationReplenishProductId(), "LOCATION_REPLENISH_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueLocationReplenishProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_Equal(Long locationId) {
        doSetLocationId_Equal(locationId);
    }

    protected void doSetLocationId_Equal(Long locationId) {
        regLocationId(CK_EQ, locationId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_NotEqual(Long locationId) {
        doSetLocationId_NotEqual(locationId);
    }

    protected void doSetLocationId_NotEqual(Long locationId) {
        regLocationId(CK_NES, locationId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterThan(Long locationId) {
        regLocationId(CK_GT, locationId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessThan(Long locationId) {
        regLocationId(CK_LT, locationId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_GreaterEqual(Long locationId) {
        regLocationId(CK_GE, locationId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationId The value of locationId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setLocationId_LessEqual(Long locationId) {
        regLocationId(CK_LE, locationId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param minNumber The min number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of locationId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setLocationId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueLocationId(), "LOCATION_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationIdList The collection of locationId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_InScope(Collection<Long> locationIdList) {
        doSetLocationId_InScope(locationIdList);
    }

    protected void doSetLocationId_InScope(Collection<Long> locationIdList) {
        regINS(CK_INS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
     * @param locationIdList The collection of locationId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLocationId_NotInScope(Collection<Long> locationIdList) {
        doSetLocationId_NotInScope(locationIdList);
    }

    protected void doSetLocationId_NotInScope(Collection<Long> locationIdList) {
        regINS(CK_NINS, cTL(locationIdList), xgetCValueLocationId(), "LOCATION_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select LOCATION_ID from m_location where ...)} <br />
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'in-scope'. (NotNull)
     */
    public void inScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_InScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", false);
    }
    public abstract String keepLocationId_InScopeRelation_MLocation(MLocationCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select LOCATION_ID from m_location where ...)} <br />
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @param subCBLambda The callback for sub-query of MLocation for 'not in-scope'. (NotNull)
     */
    public void notInScopeMLocation(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepLocationId_NotInScopeRelation_MLocation(cb.query());
        registerInScopeRelation(cb.query(), "LOCATION_ID", "LOCATION_ID", pp, "mLocation", true);
    }
    public abstract String keepLocationId_NotInScopeRelation_MLocation(MLocationCQ sq);

    protected void regLocationId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLocationId(), "LOCATION_ID"); }
    protected abstract ConditionValue xgetCValueLocationId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_Equal(Long replenishProductId) {
        doSetReplenishProductId_Equal(replenishProductId);
    }

    protected void doSetReplenishProductId_Equal(Long replenishProductId) {
        regReplenishProductId(CK_EQ, replenishProductId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_NotEqual(Long replenishProductId) {
        doSetReplenishProductId_NotEqual(replenishProductId);
    }

    protected void doSetReplenishProductId_NotEqual(Long replenishProductId) {
        regReplenishProductId(CK_NES, replenishProductId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_GreaterThan(Long replenishProductId) {
        regReplenishProductId(CK_GT, replenishProductId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_LessThan(Long replenishProductId) {
        regReplenishProductId(CK_LT, replenishProductId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_GreaterEqual(Long replenishProductId) {
        regReplenishProductId(CK_GE, replenishProductId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductId The value of replenishProductId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishProductId_LessEqual(Long replenishProductId) {
        regReplenishProductId(CK_LE, replenishProductId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param minNumber The min number of replenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishProductId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishProductId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductIdList The collection of replenishProductId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductId_InScope(Collection<Long> replenishProductIdList) {
        doSetReplenishProductId_InScope(replenishProductIdList);
    }

    protected void doSetReplenishProductId_InScope(Collection<Long> replenishProductIdList) {
        regINS(CK_INS, cTL(replenishProductIdList), xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
     * @param replenishProductIdList The collection of replenishProductId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishProductId_NotInScope(Collection<Long> replenishProductIdList) {
        doSetReplenishProductId_NotInScope(replenishProductIdList);
    }

    protected void doSetReplenishProductId_NotInScope(Collection<Long> replenishProductIdList) {
        regINS(CK_NINS, cTL(replenishProductIdList), xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_PRODUCT_ID from m_product where ...)} <br />
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'in-scope'. (NotNull)
     */
    public void inScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishProductId_InScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", false);
    }
    public abstract String keepReplenishProductId_InScopeRelation_MProduct(MProductCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_PRODUCT_ID from m_product where ...)} <br />
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @param subCBLambda The callback for sub-query of MProduct for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProduct(SubQuery<MProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductCB cb = new MProductCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishProductId_NotInScopeRelation_MProduct(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_PRODUCT_ID", "PRODUCT_ID", pp, "mProduct", true);
    }
    public abstract String keepReplenishProductId_NotInScopeRelation_MProduct(MProductCQ sq);

    protected void regReplenishProductId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishProductId(), "REPLENISH_PRODUCT_ID"); }
    protected abstract ConditionValue xgetCValueReplenishProductId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_Equal(Long replenishDepositId) {
        doSetReplenishDepositId_Equal(replenishDepositId);
    }

    protected void doSetReplenishDepositId_Equal(Long replenishDepositId) {
        regReplenishDepositId(CK_EQ, replenishDepositId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_NotEqual(Long replenishDepositId) {
        doSetReplenishDepositId_NotEqual(replenishDepositId);
    }

    protected void doSetReplenishDepositId_NotEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_NES, replenishDepositId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_GreaterThan(Long replenishDepositId) {
        regReplenishDepositId(CK_GT, replenishDepositId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_LessThan(Long replenishDepositId) {
        regReplenishDepositId(CK_LT, replenishDepositId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_GreaterEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_GE, replenishDepositId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositId The value of replenishDepositId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishDepositId_LessEqual(Long replenishDepositId) {
        regReplenishDepositId(CK_LE, replenishDepositId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of replenishDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishDepositId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishDepositId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositIdList The collection of replenishDepositId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositId_InScope(Collection<Long> replenishDepositIdList) {
        doSetReplenishDepositId_InScope(replenishDepositIdList);
    }

    protected void doSetReplenishDepositId_InScope(Collection<Long> replenishDepositIdList) {
        regINS(CK_INS, cTL(replenishDepositIdList), xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     * @param replenishDepositIdList The collection of replenishDepositId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishDepositId_NotInScope(Collection<Long> replenishDepositIdList) {
        doSetReplenishDepositId_NotInScope(replenishDepositIdList);
    }

    protected void doSetReplenishDepositId_NotInScope(Collection<Long> replenishDepositIdList) {
        regINS(CK_NINS, cTL(replenishDepositIdList), xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishDepositId_InScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", false);
    }
    public abstract String keepReplenishDepositId_InScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_DEPOSIT_ID from m_customer where ...)} <br />
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @param subCBLambda The callback for sub-query of MCustomer for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomer(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishDepositId_NotInScopeRelation_MCustomer(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_DEPOSIT_ID", "CUSTOMER_ID", pp, "mCustomer", true);
    }
    public abstract String keepReplenishDepositId_NotInScopeRelation_MCustomer(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setReplenishDepositId_IsNull() { regReplenishDepositId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setReplenishDepositId_IsNotNull() { regReplenishDepositId(CK_ISNN, DOBJ); }

    protected void regReplenishDepositId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishDepositId(), "REPLENISH_DEPOSIT_ID"); }
    protected abstract ConditionValue xgetCValueReplenishDepositId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_Equal(Long replenishPNum) {
        doSetReplenishPNum_Equal(replenishPNum);
    }

    protected void doSetReplenishPNum_Equal(Long replenishPNum) {
        regReplenishPNum(CK_EQ, replenishPNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotEqual(Long replenishPNum) {
        doSetReplenishPNum_NotEqual(replenishPNum);
    }

    protected void doSetReplenishPNum_NotEqual(Long replenishPNum) {
        regReplenishPNum(CK_NES, replenishPNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterThan(Long replenishPNum) {
        regReplenishPNum(CK_GT, replenishPNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessThan(Long replenishPNum) {
        regReplenishPNum(CK_LT, replenishPNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_GreaterEqual(Long replenishPNum) {
        regReplenishPNum(CK_GE, replenishPNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNum The value of replenishPNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPNum_LessEqual(Long replenishPNum) {
        regReplenishPNum(CK_LE, replenishPNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param minNumber The min number of replenishPNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishPNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishPNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishPNum(), "REPLENISH_P_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNumList The collection of replenishPNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_InScope(Collection<Long> replenishPNumList) {
        doSetReplenishPNum_InScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_InScope(Collection<Long> replenishPNumList) {
        regINS(CK_INS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     * @param replenishPNumList The collection of replenishPNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPNum_NotInScope(Collection<Long> replenishPNumList) {
        doSetReplenishPNum_NotInScope(replenishPNumList);
    }

    protected void doSetReplenishPNum_NotInScope(Collection<Long> replenishPNumList) {
        regINS(CK_NINS, cTL(replenishPNumList), xgetCValueReplenishPNum(), "REPLENISH_P_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     */
    public void setReplenishPNum_IsNull() { regReplenishPNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_NUM: {BIGINT(19)}
     */
    public void setReplenishPNum_IsNotNull() { regReplenishPNum(CK_ISNN, DOBJ); }

    protected void regReplenishPNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPNum(), "REPLENISH_P_NUM"); }
    protected abstract ConditionValue xgetCValueReplenishPNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_Equal(Long maxStoreProductShapeId) {
        doSetMaxStoreProductShapeId_Equal(maxStoreProductShapeId);
    }

    protected void doSetMaxStoreProductShapeId_Equal(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_EQ, maxStoreProductShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_NotEqual(Long maxStoreProductShapeId) {
        doSetMaxStoreProductShapeId_NotEqual(maxStoreProductShapeId);
    }

    protected void doSetMaxStoreProductShapeId_NotEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_NES, maxStoreProductShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_GreaterThan(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_GT, maxStoreProductShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_LessThan(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_LT, maxStoreProductShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_GreaterEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_GE, maxStoreProductShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeId The value of maxStoreProductShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_LessEqual(Long maxStoreProductShapeId) {
        regMaxStoreProductShapeId(CK_LE, maxStoreProductShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param minNumber The min number of maxStoreProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxStoreProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxStoreProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeIdList The collection of maxStoreProductShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_InScope(Collection<Long> maxStoreProductShapeIdList) {
        doSetMaxStoreProductShapeId_InScope(maxStoreProductShapeIdList);
    }

    protected void doSetMaxStoreProductShapeId_InScope(Collection<Long> maxStoreProductShapeIdList) {
        regINS(CK_INS, cTL(maxStoreProductShapeIdList), xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
     * @param maxStoreProductShapeIdList The collection of maxStoreProductShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreProductShapeId_NotInScope(Collection<Long> maxStoreProductShapeIdList) {
        doSetMaxStoreProductShapeId_NotInScope(maxStoreProductShapeIdList);
    }

    protected void doSetMaxStoreProductShapeId_NotInScope(Collection<Long> maxStoreProductShapeIdList) {
        regINS(CK_NINS, cTL(maxStoreProductShapeIdList), xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select MAX_STORE_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @param subCBLambda The callback for sub-query of MProductShape for 'in-scope'. (NotNull)
     */
    public void inScopeMProductShape(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMaxStoreProductShapeId_InScopeRelation_MProductShape(cb.query());
        registerInScopeRelation(cb.query(), "MAX_STORE_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShape", false);
    }
    public abstract String keepMaxStoreProductShapeId_InScopeRelation_MProductShape(MProductShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select MAX_STORE_PRODUCT_SHAPE_ID from m_product_shape where ...)} <br />
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @param subCBLambda The callback for sub-query of MProductShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMProductShape(SubQuery<MProductShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MProductShapeCB cb = new MProductShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepMaxStoreProductShapeId_NotInScopeRelation_MProductShape(cb.query());
        registerInScopeRelation(cb.query(), "MAX_STORE_PRODUCT_SHAPE_ID", "PRODUCT_SHAPE_ID", pp, "mProductShape", true);
    }
    public abstract String keepMaxStoreProductShapeId_NotInScopeRelation_MProductShape(MProductShapeCQ sq);

    protected void regMaxStoreProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreProductShapeId(), "MAX_STORE_PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueMaxStoreProductShapeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_Equal(Long maxStoreNum) {
        doSetMaxStoreNum_Equal(maxStoreNum);
    }

    protected void doSetMaxStoreNum_Equal(Long maxStoreNum) {
        regMaxStoreNum(CK_EQ, maxStoreNum);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotEqual(Long maxStoreNum) {
        doSetMaxStoreNum_NotEqual(maxStoreNum);
    }

    protected void doSetMaxStoreNum_NotEqual(Long maxStoreNum) {
        regMaxStoreNum(CK_NES, maxStoreNum);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterThan(Long maxStoreNum) {
        regMaxStoreNum(CK_GT, maxStoreNum);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessThan(Long maxStoreNum) {
        regMaxStoreNum(CK_LT, maxStoreNum);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_GreaterEqual(Long maxStoreNum) {
        regMaxStoreNum(CK_GE, maxStoreNum);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNum The value of maxStoreNum as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setMaxStoreNum_LessEqual(Long maxStoreNum) {
        regMaxStoreNum(CK_LE, maxStoreNum);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param minNumber The min number of maxStoreNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of maxStoreNum. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setMaxStoreNum_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueMaxStoreNum(), "MAX_STORE_NUM", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNumList The collection of maxStoreNum as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_InScope(Collection<Long> maxStoreNumList) {
        doSetMaxStoreNum_InScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_InScope(Collection<Long> maxStoreNumList) {
        regINS(CK_INS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     * @param maxStoreNumList The collection of maxStoreNum as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setMaxStoreNum_NotInScope(Collection<Long> maxStoreNumList) {
        doSetMaxStoreNum_NotInScope(maxStoreNumList);
    }

    protected void doSetMaxStoreNum_NotInScope(Collection<Long> maxStoreNumList) {
        regINS(CK_NINS, cTL(maxStoreNumList), xgetCValueMaxStoreNum(), "MAX_STORE_NUM");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     */
    public void setMaxStoreNum_IsNull() { regMaxStoreNum(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * MAX_STORE_NUM: {BIGINT(19)}
     */
    public void setMaxStoreNum_IsNotNull() { regMaxStoreNum(CK_ISNN, DOBJ); }

    protected void regMaxStoreNum(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueMaxStoreNum(), "MAX_STORE_NUM"); }
    protected abstract ConditionValue xgetCValueMaxStoreNum();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_Equal(Long replenishStockTypeId) {
        doSetReplenishStockTypeId_Equal(replenishStockTypeId);
    }

    protected void doSetReplenishStockTypeId_Equal(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_EQ, replenishStockTypeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_NotEqual(Long replenishStockTypeId) {
        doSetReplenishStockTypeId_NotEqual(replenishStockTypeId);
    }

    protected void doSetReplenishStockTypeId_NotEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_NES, replenishStockTypeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_GreaterThan(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_GT, replenishStockTypeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_LessThan(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_LT, replenishStockTypeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_GreaterEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_GE, replenishStockTypeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeId The value of replenishStockTypeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_LessEqual(Long replenishStockTypeId) {
        regReplenishStockTypeId(CK_LE, replenishStockTypeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param minNumber The min number of replenishStockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishStockTypeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishStockTypeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeIdList The collection of replenishStockTypeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_InScope(Collection<Long> replenishStockTypeIdList) {
        doSetReplenishStockTypeId_InScope(replenishStockTypeIdList);
    }

    protected void doSetReplenishStockTypeId_InScope(Collection<Long> replenishStockTypeIdList) {
        regINS(CK_INS, cTL(replenishStockTypeIdList), xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     * @param replenishStockTypeIdList The collection of replenishStockTypeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishStockTypeId_NotInScope(Collection<Long> replenishStockTypeIdList) {
        doSetReplenishStockTypeId_NotInScope(replenishStockTypeIdList);
    }

    protected void doSetReplenishStockTypeId_NotInScope(Collection<Long> replenishStockTypeIdList) {
        regINS(CK_NINS, cTL(replenishStockTypeIdList), xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'in-scope'. (NotNull)
     */
    public void inScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishStockTypeId_InScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", false);
    }
    public abstract String keepReplenishStockTypeId_InScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_STOCK_TYPE_ID from m_stock_type where ...)} <br />
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @param subCBLambda The callback for sub-query of MStockType for 'not in-scope'. (NotNull)
     */
    public void notInScopeMStockType(SubQuery<MStockTypeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MStockTypeCB cb = new MStockTypeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishStockTypeId_NotInScopeRelation_MStockType(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_STOCK_TYPE_ID", "STOCK_TYPE_ID", pp, "mStockType", true);
    }
    public abstract String keepReplenishStockTypeId_NotInScopeRelation_MStockType(MStockTypeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setReplenishStockTypeId_IsNull() { regReplenishStockTypeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
     */
    public void setReplenishStockTypeId_IsNotNull() { regReplenishStockTypeId(CK_ISNN, DOBJ); }

    protected void regReplenishStockTypeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishStockTypeId(), "REPLENISH_STOCK_TYPE_ID"); }
    protected abstract ConditionValue xgetCValueReplenishStockTypeId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_Equal(Long replenishPProductShapeId) {
        doSetReplenishPProductShapeId_Equal(replenishPProductShapeId);
    }

    protected void doSetReplenishPProductShapeId_Equal(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_EQ, replenishPProductShapeId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_NotEqual(Long replenishPProductShapeId) {
        doSetReplenishPProductShapeId_NotEqual(replenishPProductShapeId);
    }

    protected void doSetReplenishPProductShapeId_NotEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_NES, replenishPProductShapeId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_GreaterThan(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_GT, replenishPProductShapeId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_LessThan(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_LT, replenishPProductShapeId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_GreaterEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_GE, replenishPProductShapeId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeId The value of replenishPProductShapeId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_LessEqual(Long replenishPProductShapeId) {
        regReplenishPProductShapeId(CK_LE, replenishPProductShapeId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param minNumber The min number of replenishPProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of replenishPProductShapeId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setReplenishPProductShapeId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeIdList The collection of replenishPProductShapeId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_InScope(Collection<Long> replenishPProductShapeIdList) {
        doSetReplenishPProductShapeId_InScope(replenishPProductShapeIdList);
    }

    protected void doSetReplenishPProductShapeId_InScope(Collection<Long> replenishPProductShapeIdList) {
        regINS(CK_INS, cTL(replenishPProductShapeIdList), xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     * @param replenishPProductShapeIdList The collection of replenishPProductShapeId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setReplenishPProductShapeId_NotInScope(Collection<Long> replenishPProductShapeIdList) {
        doSetReplenishPProductShapeId_NotInScope(replenishPProductShapeIdList);
    }

    protected void doSetReplenishPProductShapeId_NotInScope(Collection<Long> replenishPProductShapeIdList) {
        regINS(CK_NINS, cTL(replenishPProductShapeIdList), xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select REPLENISH_P_PRODUCT_SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'in-scope'. (NotNull)
     */
    public void inScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishPProductShapeId_InScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_P_PRODUCT_SHAPE_ID", "SHAPE_ID", pp, "mShape", false);
    }
    public abstract String keepReplenishPProductShapeId_InScopeRelation_MShape(MShapeCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select REPLENISH_P_PRODUCT_SHAPE_ID from m_shape where ...)} <br />
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @param subCBLambda The callback for sub-query of MShape for 'not in-scope'. (NotNull)
     */
    public void notInScopeMShape(SubQuery<MShapeCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MShapeCB cb = new MShapeCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepReplenishPProductShapeId_NotInScopeRelation_MShape(cb.query());
        registerInScopeRelation(cb.query(), "REPLENISH_P_PRODUCT_SHAPE_ID", "SHAPE_ID", pp, "mShape", true);
    }
    public abstract String keepReplenishPProductShapeId_NotInScopeRelation_MShape(MShapeCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setReplenishPProductShapeId_IsNull() { regReplenishPProductShapeId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
     */
    public void setReplenishPProductShapeId_IsNotNull() { regReplenishPProductShapeId(CK_ISNN, DOBJ); }

    protected void regReplenishPProductShapeId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueReplenishPProductShapeId(), "REPLENISH_P_PRODUCT_SHAPE_ID"); }
    protected abstract ConditionValue xgetCValueReplenishPProductShapeId();

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
    public HpSLCFunction<MLocationReplenishProductCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MLocationReplenishProductCB.class);
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
    public HpSLCFunction<MLocationReplenishProductCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MLocationReplenishProductCB.class);
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
    public HpSLCFunction<MLocationReplenishProductCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MLocationReplenishProductCB.class);
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
    public HpSLCFunction<MLocationReplenishProductCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MLocationReplenishProductCB.class);
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
    public HpSLCFunction<MLocationReplenishProductCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MLocationReplenishProductCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MLocationReplenishProductCB&gt;() {
     *     public void query(MLocationReplenishProductCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MLocationReplenishProductCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MLocationReplenishProductCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MLocationReplenishProductCQ sq);

    protected MLocationReplenishProductCB xcreateScalarConditionCB() {
        MLocationReplenishProductCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MLocationReplenishProductCB xcreateScalarConditionPartitionByCB() {
        MLocationReplenishProductCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MLocationReplenishProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "LOCATION_REPLENISH_PRODUCT_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MLocationReplenishProductCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MLocationReplenishProductCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MLocationReplenishProductCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "LOCATION_REPLENISH_PRODUCT_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MLocationReplenishProductCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MLocationReplenishProductCQ sq);

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
    protected MLocationReplenishProductCB newMyCB() {
        return new MLocationReplenishProductCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MLocationReplenishProductCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
