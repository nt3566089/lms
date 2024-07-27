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
 * The abstract condition-query of m_customer.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMCustomerCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMCustomerCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_customer";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_Equal(Long customerId) {
        doSetCustomerId_Equal(customerId);
    }

    protected void doSetCustomerId_Equal(Long customerId) {
        regCustomerId(CK_EQ, customerId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_NotEqual(Long customerId) {
        doSetCustomerId_NotEqual(customerId);
    }

    protected void doSetCustomerId_NotEqual(Long customerId) {
        regCustomerId(CK_NES, customerId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterThan(Long customerId) {
        regCustomerId(CK_GT, customerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessThan(Long customerId) {
        regCustomerId(CK_LT, customerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_GreaterEqual(Long customerId) {
        regCustomerId(CK_GE, customerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerId The value of customerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCustomerId_LessEqual(Long customerId) {
        regCustomerId(CK_LE, customerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param minNumber The min number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of customerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCustomerId(), "CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerIdList The collection of customerId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_InScope(Collection<Long> customerIdList) {
        doSetCustomerId_InScope(customerIdList);
    }

    protected void doSetCustomerId_InScope(Collection<Long> customerIdList) {
        regINS(CK_INS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     * @param customerIdList The collection of customerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerId_NotInScope(Collection<Long> customerIdList) {
        doSetCustomerId_NotInScope(customerIdList);
    }

    protected void doSetCustomerId_NotInScope(Collection<Long> customerIdList) {
        regINS(CK_NINS, cTL(customerIdList), xgetCValueCustomerId(), "CUSTOMER_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierDecisionList</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierDecisionList for 'exists'. (NotNull)
     */
    public void existsMCarrierDecisionList(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCarrierDecisionList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierDecisionList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_carrier_slip_ces where ...)} <br>
     * m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCarrierSlipCesAsOne</span>(cesCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cesCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCarrierSlipCesAsOne for 'exists'. (NotNull)
     */
    public void existsMCarrierSlipCesAsOne(SubQuery<MCarrierSlipCesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierSlipCesAsOne");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_center_customer where ...)} <br>
     * m_center_customer by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCenterCustomerList for 'exists'. (NotNull)
     */
    public void existsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCenterCustomerList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_client where ...)} <br>
     * m_client by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientList for 'exists'. (NotNull)
     */
    public void existsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MClientList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_client_center where ...)} <br>
     * m_client_center by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MClientCenterList for 'exists'. (NotNull)
     */
    public void existsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MClientCenterList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from m_customer where ...)} <br>
     * m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCustomerSelfList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCustomerSelfList for 'exists'. (NotNull)
     */
    public void existsMCustomerSelfList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCustomerSelfList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCustomerSelfList(MCustomerCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMCustomerPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MCustomerPickingList for 'exists'. (NotNull)
     */
    public void existsMCustomerPickingList(SubQuery<MCustomerPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MCustomerPickingList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ACCOUNT_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by ACCOUNT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMDepositProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MDepositProductList for 'exists'. (NotNull)
     */
    public void existsMDepositProductList(SubQuery<MDepositProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MDepositProductList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "mDepositProductList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_DEPOSIT_ID from m_location where ...)} <br>
     * m_location by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationList for 'exists'. (NotNull)
     */
    public void existsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MLocationList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select REPLENISH_DEPOSIT_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMLocationReplenishProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MLocationReplenishProductList for 'exists'. (NotNull)
     */
    public void existsMLocationReplenishProductList(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MLocationReplenishProductList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from m_user_deposit where ...)} <br>
     * m_user_deposit by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MUserDepositList for 'exists'. (NotNull)
     */
    public void existsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_MUserDepositList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList");
    }
    public abstract String keepCustomerId_ExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstBList for 'exists'. (NotNull)
     */
    public void existsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstBList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLY_CUSTOMER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHBySupplyCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocInstHByDelivCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from t_alloc_lot where ...)} <br>
     * t_alloc_lot by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TAllocLotList for 'exists'. (NotNull)
     */
    public void existsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TAllocLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ACCOUNT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBByAccountIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBByAccountIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBByAccountIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryBByAccountIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tInventoryBByAccountIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryBByAccountIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBByDepositIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTInventoryBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TInventoryBBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTInventoryBBySupplierIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TInventoryInstList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from t_keeping_lot where ...)} <br>
     * t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TKeepingLotList for 'exists'. (NotNull)
     */
    public void existsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TKeepingLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from t_last_lot where ...)} <br>
     * t_last_lot by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TLastLotList for 'exists'. (NotNull)
     */
    public void existsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TLastLotList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBByDepositIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBBySupplierIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select ACCOUNT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTMoveInstBByAccountIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TMoveInstBByAccountIdList for 'exists'. (NotNull)
     */
    public void existsTMoveInstBByAccountIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TMoveInstBByAccountIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tMoveInstBByAccountIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TMoveInstBByAccountIdList(TMoveInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLAN_SUPPLIER_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHByPlanSupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHByPlanSupplierIdList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHByPlanSupplierIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select PLAN_DEPOSIT_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTReceivePlanHByPlanDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TReceivePlanHByPlanDepositIdList for 'exists'. (NotNull)
     */
    public void existsTReceivePlanHByPlanDepositIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstBList for 'exists'. (NotNull)
     */
    public void existsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstBList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DELIV_CUSTOMER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHByDelivCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHByDelivCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLY_CUSTOMER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHBySupplyCustomerIdList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHBySupplyCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_stock where ...)} <br>
     * t_stock by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStockList for 'exists'. (NotNull)
     */
    public void existsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStockList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from t_store_no where ...)} <br>
     * t_store_no by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreNoList for 'exists'. (NotNull)
     */
    public void existsTStoreNoList(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreNoList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreNoList(TStoreNoCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHBySupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHBySupplierIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTStoreRecordHByDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TStoreRecordHByDepositIdList for 'exists'. (NotNull)
     */
    public void existsTStoreRecordHByDepositIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CONSIGNMENT_CLS_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtInventoryInputProdList for 'exists'. (NotNull)
     */
    public void existsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SUPPLIER_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspBySupplierIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspBySupplierIdList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspBySupplierIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select DEPOSIT_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtReceiveNoPlanInspByDepositIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtReceiveNoPlanInspByDepositIdList for 'exists'. (NotNull)
     */
    public void existsWHtReceiveNoPlanInspByDepositIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialReceiveInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select CUSTOMER_ID from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of WHtSerialShippingInspList for 'exists'. (NotNull)
     */
    public void existsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCustomerId_ExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionList</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCarrierDecisionList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionList(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCarrierDecisionList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierDecisionList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_carrier_slip_ces where ...)} <br>
     * m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierSlipCesAsOne</span>(cesCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     cesCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCarrierSlipCesAsOne for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierSlipCesAsOne(SubQuery<MCarrierSlipCesCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierSlipCesCB cb = new MCarrierSlipCesCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierSlipCesAsOne");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCarrierSlipCesAsOne(MCarrierSlipCesCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_center_customer where ...)} <br>
     * m_center_customer by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCenterCustomerList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCenterCustomerList for 'not exists'. (NotNull)
     */
    public void notExistsMCenterCustomerList(SubQuery<MCenterCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCenterCustomerList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_client where ...)} <br>
     * m_client by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientList</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MClientList for 'not exists'. (NotNull)
     */
    public void notExistsMClientList(SubQuery<MClientCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCB cb = new MClientCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MClientList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MClientList(MClientCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_client_center where ...)} <br>
     * m_client_center by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMClientCenterList</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MClientCenterList for 'not exists'. (NotNull)
     */
    public void notExistsMClientCenterList(SubQuery<MClientCenterCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MClientCenterList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MClientCenterList(MClientCenterCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from m_customer where ...)} <br>
     * m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerSelfList</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCustomerSelfList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerSelfList(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCustomerSelfList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCustomerSelfList(MCustomerCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MCustomerPickingList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerPickingList(SubQuery<MCustomerPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MCustomerPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ACCOUNT_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by ACCOUNT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDepositProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MDepositProductList for 'not exists'. (NotNull)
     */
    public void notExistsMDepositProductList(SubQuery<MDepositProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MDepositProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "mDepositProductList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_DEPOSIT_ID from m_location where ...)} <br>
     * m_location by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationList</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MLocationList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationList(SubQuery<MLocationCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationCB cb = new MLocationCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MLocationList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MLocationList(MLocationCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select REPLENISH_DEPOSIT_ID from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMLocationReplenishProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MLocationReplenishProductList for 'not exists'. (NotNull)
     */
    public void notExistsMLocationReplenishProductList(SubQuery<MLocationReplenishProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MLocationReplenishProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationReplenishProductList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from m_user_deposit where ...)} <br>
     * m_user_deposit by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMUserDepositList</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_MUserDepositList for 'not exists'. (NotNull)
     */
    public void notExistsMUserDepositList(SubQuery<MUserDepositCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_MUserDepositList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_MUserDepositList(MUserDepositCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstBList(SubQuery<TAllocInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstBList(TAllocInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLY_CUSTOMER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHBySupplyCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocInstHByDelivCustomerIdList(SubQuery<TAllocInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from t_alloc_lot where ...)} <br>
     * t_alloc_lot by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTAllocLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TAllocLotList for 'not exists'. (NotNull)
     */
    public void notExistsTAllocLotList(SubQuery<TAllocLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TAllocLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TAllocLotList(TAllocLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ACCOUNT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBByAccountIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryBByAccountIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBByAccountIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryBByAccountIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tInventoryBByAccountIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryBByAccountIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryBByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBByDepositIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryBBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBBySupplierIdList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_inventory_inst where ...)} <br>
     * t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryInstList</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     instCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TInventoryInstList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryInstList(SubQuery<TInventoryInstCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TInventoryInstList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TInventoryInstList(TInventoryInstCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from t_keeping_lot where ...)} <br>
     * t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTKeepingLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TKeepingLotList for 'not exists'. (NotNull)
     */
    public void notExistsTKeepingLotList(SubQuery<TKeepingLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TKeepingLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TKeepingLotList(TKeepingLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from t_last_lot where ...)} <br>
     * t_last_lot by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTLastLotList</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TLastLotList for 'not exists'. (NotNull)
     */
    public void notExistsTLastLotList(SubQuery<TLastLotCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TLastLotList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TLastLotList(TLastLotCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBByDepositIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TMoveInstBByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBByDepositIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBBySupplierIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBBySupplierIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select ACCOUNT_ID from t_move_inst_b where ...)} <br>
     * t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTMoveInstBByAccountIdList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TMoveInstBByAccountIdList for 'not exists'. (NotNull)
     */
    public void notExistsTMoveInstBByAccountIdList(SubQuery<TMoveInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TMoveInstBByAccountIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tMoveInstBByAccountIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TMoveInstBByAccountIdList(TMoveInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLAN_SUPPLIER_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHByPlanSupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHByPlanSupplierIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select PLAN_DEPOSIT_ID from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTReceivePlanHByPlanDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTReceivePlanHByPlanDepositIdList(SubQuery<TReceivePlanHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstBList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstBList(SubQuery<TShippingInstBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstBList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstBList(TShippingInstBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DELIV_CUSTOMER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHByDelivCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHByDelivCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLY_CUSTOMER_ID from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHBySupplyCustomerIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHBySupplyCustomerIdList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_stock where ...)} <br>
     * t_stock by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStockList</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStockList for 'not exists'. (NotNull)
     */
    public void notExistsTStockList(SubQuery<TStockCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStockCB cb = new TStockCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStockList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStockList(TStockCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from t_store_no where ...)} <br>
     * t_store_no by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreNoList</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreNoList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreNoList(SubQuery<TStoreNoCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreNoList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreNoList(TStoreNoCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHBySupplierIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHBySupplierIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from t_store_record_h where ...)} <br>
     * t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTStoreRecordHByDepositIdList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsTStoreRecordHByDepositIdList(SubQuery<TStoreRecordHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CONSIGNMENT_CLS_ID from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtInventoryInputProdList</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtInventoryInputProdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtInventoryInputProdList(SubQuery<WHtInventoryInputProdCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SUPPLIER_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspBySupplierIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspBySupplierIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select DEPOSIT_ID from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtReceiveNoPlanInspByDepositIdList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList for 'not exists'. (NotNull)
     */
    public void notExistsWHtReceiveNoPlanInspByDepositIdList(SubQuery<WHtReceiveNoPlanInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialReceiveInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtSerialReceiveInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialReceiveInspList(SubQuery<WHtSerialReceiveInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select CUSTOMER_ID from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsWHtSerialShippingInspList</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of CustomerId_NotExistsReferrer_WHtSerialShippingInspList for 'not exists'. (NotNull)
     */
    public void notExistsWHtSerialShippingInspList(SubQuery<WHtSerialShippingInspCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(cb.query());
        registerNotExistsReferrer(cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList");
    }
    public abstract String keepCustomerId_NotExistsReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    public void xsderiveMCarrierDecisionList(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCarrierDecisionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCarrierDecisionList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    public void xsderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCenterCustomerList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);

    public void xsderiveMClientList(String fn, SubQuery<MClientCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MClientList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MClientList(MClientCQ sq);

    public void xsderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mClientCenterList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MClientCenterList(MClientCenterCQ sq);

    public void xsderiveMCustomerSelfList(String fn, SubQuery<MCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "mCustomerSelfList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCustomerSelfList(MCustomerCQ sq);

    public void xsderiveMCustomerPickingList(String fn, SubQuery<MCustomerPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MCustomerPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerPickingList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    public void xsderiveMDepositProductList(String fn, SubQuery<MDepositProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MDepositProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "mDepositProductList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq);

    public void xsderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MLocationList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MLocationList(MLocationCQ sq);

    public void xsderiveMLocationReplenishProductList(String fn, SubQuery<MLocationReplenishProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MLocationReplenishProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", pp, "mLocationReplenishProductList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);

    public void xsderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "mUserDepositList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_MUserDepositList(MUserDepositCQ sq);

    public void xsderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tAllocInstBList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);

    public void xsderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tAllocInstHBySupplyCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);

    public void xsderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tAllocInstHByDelivCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);

    public void xsderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tAllocLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TAllocLotList(TAllocLotCQ sq);

    public void xsderiveTInventoryBByAccountIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryBByAccountIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tInventoryBByAccountIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryBByAccountIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryBByDepositIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryBByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryBBySupplierIdList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tInventoryBBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);

    public void xsderiveTInventoryInstList(String fn, SubQuery<TInventoryInstCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryInstCB cb = new TInventoryInstCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tInventoryInstList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);

    public void xsderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tKeepingLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);

    public void xsderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TLastLotList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "tLastLotList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TLastLotList(TLastLotCQ sq);

    public void xsderiveTMoveInstBByDepositIdList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tMoveInstBByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);

    public void xsderiveTMoveInstBBySupplierIdList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tMoveInstBBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);

    public void xsderiveTMoveInstBByAccountIdList(String fn, SubQuery<TMoveInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByAccountIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", pp, "tMoveInstBByAccountIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TMoveInstBByAccountIdList(TMoveInstBCQ sq);

    public void xsderiveTReceivePlanHByPlanSupplierIdList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", pp, "tReceivePlanHByPlanSupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);

    public void xsderiveTReceivePlanHByPlanDepositIdList(String fn, SubQuery<TReceivePlanHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", pp, "tReceivePlanHByPlanDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);

    public void xsderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tShippingInstBList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);

    public void xsderiveTShippingInstHByDelivCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", pp, "tShippingInstHByDelivCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);

    public void xsderiveTShippingInstHBySupplyCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", pp, "tShippingInstHBySupplyCustomerIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);

    public void xsderiveTStockList(String fn, SubQuery<TStockCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStockList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStockList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStockList(TStockCQ sq);

    public void xsderiveTStoreNoList(String fn, SubQuery<TStoreNoCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreNoList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreNoList(TStoreNoCQ sq);

    public void xsderiveTStoreRecordHBySupplierIdList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "tStoreRecordHBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);

    public void xsderiveTStoreRecordHByDepositIdList(String fn, SubQuery<TStoreRecordHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "tStoreRecordHByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);

    public void xsderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", pp, "wHtInventoryInputProdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);

    public void xsderiveWHtReceiveNoPlanInspBySupplierIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", pp, "wHtReceiveNoPlanInspBySupplierIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtReceiveNoPlanInspByDepositIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", pp, "wHtReceiveNoPlanInspByDepositIdList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);

    public void xsderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialReceiveInspList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);

    public void xsderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", pp, "wHtSerialShippingInspList", al, op);
    }
    public abstract String keepCustomerId_SpecifyDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCarrierDecisionList()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     decisionCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCarrierDecisionCB> derivedMCarrierDecisionList() {
        return xcreateQDRFunctionMCarrierDecisionList();
    }
    protected HpQDRFunction<MCarrierDecisionCB> xcreateQDRFunctionMCarrierDecisionList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCarrierDecisionList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCarrierDecisionList(String fn, SubQuery<MCarrierDecisionCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCarrierDecisionList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCarrierDecisionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mCarrierDecisionList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCarrierDecisionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_center_customer where ...)} <br>
     * m_center_customer by CUSTOMER_ID, named 'MCenterCustomerAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCenterCustomerList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCenterCustomerCB> derivedMCenterCustomerList() {
        return xcreateQDRFunctionMCenterCustomerList();
    }
    protected HpQDRFunction<MCenterCustomerCB> xcreateQDRFunctionMCenterCustomerList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCenterCustomerList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCenterCustomerList(String fn, SubQuery<MCenterCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCenterCustomerCB cb = new MCenterCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mCenterCustomerList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCenterCustomerList(MCenterCustomerCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCenterCustomerListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_client where ...)} <br>
     * m_client by CUSTOMER_ID, named 'MClientAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientList()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     clientCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     clientCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCB> derivedMClientList() {
        return xcreateQDRFunctionMClientList();
    }
    protected HpQDRFunction<MClientCB> xcreateQDRFunctionMClientList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientList(String fn, SubQuery<MClientCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCB cb = new MClientCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MClientList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MClientListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mClientList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientList(MClientCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_client_center where ...)} <br>
     * m_client_center by CUSTOMER_ID, named 'MClientCenterAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMClientCenterList()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     centerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     centerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MClientCenterCB> derivedMClientCenterList() {
        return xcreateQDRFunctionMClientCenterList();
    }
    protected HpQDRFunction<MClientCenterCB> xcreateQDRFunctionMClientCenterList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMClientCenterList(fn, sq, rd, vl, op));
    }
    public void xqderiveMClientCenterList(String fn, SubQuery<MClientCenterCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MClientCenterCB cb = new MClientCenterCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MClientCenterList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mClientCenterList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientCenterList(MClientCenterCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MClientCenterListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_customer where ...)} <br>
     * m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCustomerSelfList()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     customerCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     customerCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCustomerCB> derivedMCustomerSelfList() {
        return xcreateQDRFunctionMCustomerSelfList();
    }
    protected HpQDRFunction<MCustomerCB> xcreateQDRFunctionMCustomerSelfList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCustomerSelfList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCustomerSelfList(String fn, SubQuery<MCustomerCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "mCustomerSelfList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerSelfList(MCustomerCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerSelfListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_customer_picking where ...)} <br>
     * m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMCustomerPickingList()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     pickingCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MCustomerPickingCB> derivedMCustomerPickingList() {
        return xcreateQDRFunctionMCustomerPickingList();
    }
    protected HpQDRFunction<MCustomerPickingCB> xcreateQDRFunctionMCustomerPickingList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMCustomerPickingList(fn, sq, rd, vl, op));
    }
    public void xqderiveMCustomerPickingList(String fn, SubQuery<MCustomerPickingCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MCustomerPickingList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MCustomerPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mCustomerPickingList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MCustomerPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_deposit_product where ...)} <br>
     * m_deposit_product by ACCOUNT_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMDepositProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MDepositProductCB> derivedMDepositProductList() {
        return xcreateQDRFunctionMDepositProductList();
    }
    protected HpQDRFunction<MDepositProductCB> xcreateQDRFunctionMDepositProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMDepositProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMDepositProductList(String fn, SubQuery<MDepositProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MDepositProductList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MDepositProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", sqpp, "mDepositProductList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MDepositProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location where ...)} <br>
     * m_location by REPLENISH_DEPOSIT_ID, named 'MLocationAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationList()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     locationCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     locationCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationCB> derivedMLocationList() {
        return xcreateQDRFunctionMLocationList();
    }
    protected HpQDRFunction<MLocationCB> xcreateQDRFunctionMLocationList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationList(String fn, SubQuery<MLocationCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationCB cb = new MLocationCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MLocationList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MLocationListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", sqpp, "mLocationList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationList(MLocationCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_location_replenish_product where ...)} <br>
     * m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMLocationReplenishProductList()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     productCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MLocationReplenishProductCB> derivedMLocationReplenishProductList() {
        return xcreateQDRFunctionMLocationReplenishProductList();
    }
    protected HpQDRFunction<MLocationReplenishProductCB> xcreateQDRFunctionMLocationReplenishProductList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMLocationReplenishProductList(fn, sq, rd, vl, op));
    }
    public void xqderiveMLocationReplenishProductList(String fn, SubQuery<MLocationReplenishProductCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MLocationReplenishProductList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MLocationReplenishProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "REPLENISH_DEPOSIT_ID", sqpp, "mLocationReplenishProductList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationReplenishProductList(MLocationReplenishProductCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MLocationReplenishProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_user_deposit where ...)} <br>
     * m_user_deposit by CUSTOMER_ID, named 'MUserDepositAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMUserDepositList()</span>.<span style="color: #CC4747">max</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     depositCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     depositCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MUserDepositCB> derivedMUserDepositList() {
        return xcreateQDRFunctionMUserDepositList();
    }
    protected HpQDRFunction<MUserDepositCB> xcreateQDRFunctionMUserDepositList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMUserDepositList(fn, sq, rd, vl, op));
    }
    public void xqderiveMUserDepositList(String fn, SubQuery<MUserDepositCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MUserDepositCB cb = new MUserDepositCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_MUserDepositList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "mUserDepositList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_MUserDepositList(MUserDepositCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_MUserDepositListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_b where ...)} <br>
     * t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstBCB> derivedTAllocInstBList() {
        return xcreateQDRFunctionTAllocInstBList();
    }
    protected HpQDRFunction<TAllocInstBCB> xcreateQDRFunctionTAllocInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstBList(String fn, SubQuery<TAllocInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstBCB cb = new TAllocInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstBList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tAllocInstBList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstBList(TAllocInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHBySupplyCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHBySupplyCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHBySupplyCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHBySupplyCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHBySupplyCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", sqpp, "tAllocInstHBySupplyCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdList(TAllocInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHBySupplyCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_inst_h where ...)} <br>
     * t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocInstHByDelivCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocInstHCB> derivedTAllocInstHByDelivCustomerIdList() {
        return xcreateQDRFunctionTAllocInstHByDelivCustomerIdList();
    }
    protected HpQDRFunction<TAllocInstHCB> xcreateQDRFunctionTAllocInstHByDelivCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocInstHByDelivCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocInstHByDelivCustomerIdList(String fn, SubQuery<TAllocInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocInstHCB cb = new TAllocInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "tAllocInstHByDelivCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdList(TAllocInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocInstHByDelivCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_alloc_lot where ...)} <br>
     * t_alloc_lot by CUSTOMER_ID, named 'TAllocLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTAllocLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TAllocLotCB> derivedTAllocLotList() {
        return xcreateQDRFunctionTAllocLotList();
    }
    protected HpQDRFunction<TAllocLotCB> xcreateQDRFunctionTAllocLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTAllocLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTAllocLotList(String fn, SubQuery<TAllocLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TAllocLotCB cb = new TAllocLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TAllocLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tAllocLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocLotList(TAllocLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TAllocLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBByAccountIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBByAccountIdList() {
        return xcreateQDRFunctionTInventoryBByAccountIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBByAccountIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBByAccountIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBByAccountIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByAccountIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByAccountIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", sqpp, "tInventoryBByAccountIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByAccountIdList(TInventoryBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByAccountIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBByDepositIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBByDepositIdList() {
        return xcreateQDRFunctionTInventoryBByDepositIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBByDepositIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tInventoryBByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdList(TInventoryBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTInventoryBBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TInventoryBCB> derivedTInventoryBBySupplierIdList() {
        return xcreateQDRFunctionTInventoryBBySupplierIdList();
    }
    protected HpQDRFunction<TInventoryBCB> xcreateQDRFunctionTInventoryBBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTInventoryBBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTInventoryBBySupplierIdList(String fn, SubQuery<TInventoryBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tInventoryBBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdList(TInventoryBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryBBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_inst where ...)} <br>
     * t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TInventoryInstList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tInventoryInstList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryInstList(TInventoryInstCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TInventoryInstListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_keeping_lot where ...)} <br>
     * t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTKeepingLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TKeepingLotCB> derivedTKeepingLotList() {
        return xcreateQDRFunctionTKeepingLotList();
    }
    protected HpQDRFunction<TKeepingLotCB> xcreateQDRFunctionTKeepingLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTKeepingLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTKeepingLotList(String fn, SubQuery<TKeepingLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TKeepingLotCB cb = new TKeepingLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TKeepingLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tKeepingLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TKeepingLotList(TKeepingLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TKeepingLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_last_lot where ...)} <br>
     * t_last_lot by CUSTOMER_ID, named 'TLastLotAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTLastLotList()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     lotCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     lotCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TLastLotCB> derivedTLastLotList() {
        return xcreateQDRFunctionTLastLotList();
    }
    protected HpQDRFunction<TLastLotCB> xcreateQDRFunctionTLastLotList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTLastLotList(fn, sq, rd, vl, op));
    }
    public void xqderiveTLastLotList(String fn, SubQuery<TLastLotCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TLastLotCB cb = new TLastLotCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TLastLotList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "tLastLotList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TLastLotList(TLastLotCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TLastLotListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_b where ...)} <br>
     * t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBByDepositIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBByDepositIdList() {
        return xcreateQDRFunctionTMoveInstBByDepositIdList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBByDepositIdList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tMoveInstBByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdList(TMoveInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_b where ...)} <br>
     * t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBBySupplierIdList() {
        return xcreateQDRFunctionTMoveInstBBySupplierIdList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBBySupplierIdList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tMoveInstBBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdList(TMoveInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_move_inst_b where ...)} <br>
     * t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTMoveInstBByAccountIdList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TMoveInstBCB> derivedTMoveInstBByAccountIdList() {
        return xcreateQDRFunctionTMoveInstBByAccountIdList();
    }
    protected HpQDRFunction<TMoveInstBCB> xcreateQDRFunctionTMoveInstBByAccountIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTMoveInstBByAccountIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTMoveInstBByAccountIdList(String fn, SubQuery<TMoveInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TMoveInstBCB cb = new TMoveInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByAccountIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TMoveInstBByAccountIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "ACCOUNT_ID", sqpp, "tMoveInstBByAccountIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByAccountIdList(TMoveInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TMoveInstBByAccountIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHByPlanSupplierIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHByPlanSupplierIdList() {
        return xcreateQDRFunctionTReceivePlanHByPlanSupplierIdList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHByPlanSupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHByPlanSupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHByPlanSupplierIdList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_SUPPLIER_ID", sqpp, "tReceivePlanHByPlanSupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdList(TReceivePlanHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanSupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_receive_plan_h where ...)} <br>
     * t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTReceivePlanHByPlanDepositIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TReceivePlanHCB> derivedTReceivePlanHByPlanDepositIdList() {
        return xcreateQDRFunctionTReceivePlanHByPlanDepositIdList();
    }
    protected HpQDRFunction<TReceivePlanHCB> xcreateQDRFunctionTReceivePlanHByPlanDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTReceivePlanHByPlanDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTReceivePlanHByPlanDepositIdList(String fn, SubQuery<TReceivePlanHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TReceivePlanHCB cb = new TReceivePlanHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "PLAN_DEPOSIT_ID", sqpp, "tReceivePlanHByPlanDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdList(TReceivePlanHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TReceivePlanHByPlanDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_b where ...)} <br>
     * t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstBList()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     bCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstBCB> derivedTShippingInstBList() {
        return xcreateQDRFunctionTShippingInstBList();
    }
    protected HpQDRFunction<TShippingInstBCB> xcreateQDRFunctionTShippingInstBList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstBList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstBList(String fn, SubQuery<TShippingInstBCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstBCB cb = new TShippingInstBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstBList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tShippingInstBList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstBList(TShippingInstBCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstBListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHByDelivCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHByDelivCustomerIdList() {
        return xcreateQDRFunctionTShippingInstHByDelivCustomerIdList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHByDelivCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHByDelivCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHByDelivCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DELIV_CUSTOMER_ID", sqpp, "tShippingInstHByDelivCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdList(TShippingInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHByDelivCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHBySupplyCustomerIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHBySupplyCustomerIdList() {
        return xcreateQDRFunctionTShippingInstHBySupplyCustomerIdList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHBySupplyCustomerIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHBySupplyCustomerIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHBySupplyCustomerIdList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLY_CUSTOMER_ID", sqpp, "tShippingInstHBySupplyCustomerIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdList(TShippingInstHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TShippingInstHBySupplyCustomerIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_stock where ...)} <br>
     * t_stock by DEPOSIT_ID, named 'TStockAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStockList()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     stockCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     stockCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStockCB> derivedTStockList() {
        return xcreateQDRFunctionTStockList();
    }
    protected HpQDRFunction<TStockCB> xcreateQDRFunctionTStockList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStockList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStockList(String fn, SubQuery<TStockCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStockCB cb = new TStockCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStockList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStockListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tStockList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStockList(TStockCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStockListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_no where ...)} <br>
     * t_store_no by SUPPLIER_ID, named 'TStoreNoAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreNoList()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     noCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     noCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreNoCB> derivedTStoreNoList() {
        return xcreateQDRFunctionTStoreNoList();
    }
    protected HpQDRFunction<TStoreNoCB> xcreateQDRFunctionTStoreNoList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreNoList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreNoList(String fn, SubQuery<TStoreNoCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreNoList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tStoreNoList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreNoList(TStoreNoCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreNoListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_h where ...)} <br>
     * t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHBySupplierIdList() {
        return xcreateQDRFunctionTStoreRecordHBySupplierIdList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHBySupplierIdList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "tStoreRecordHBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdList(TStoreRecordHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_store_record_h where ...)} <br>
     * t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTStoreRecordHByDepositIdList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TStoreRecordHCB> derivedTStoreRecordHByDepositIdList() {
        return xcreateQDRFunctionTStoreRecordHByDepositIdList();
    }
    protected HpQDRFunction<TStoreRecordHCB> xcreateQDRFunctionTStoreRecordHByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTStoreRecordHByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveTStoreRecordHByDepositIdList(String fn, SubQuery<TStoreRecordHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TStoreRecordHCB cb = new TStoreRecordHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "tStoreRecordHByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdList(TStoreRecordHCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_TStoreRecordHByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_inventory_input_prod where ...)} <br>
     * w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtInventoryInputProdList()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     prodCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     prodCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtInventoryInputProdCB> derivedWHtInventoryInputProdList() {
        return xcreateQDRFunctionWHtInventoryInputProdList();
    }
    protected HpQDRFunction<WHtInventoryInputProdCB> xcreateQDRFunctionWHtInventoryInputProdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtInventoryInputProdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtInventoryInputProdList(String fn, SubQuery<WHtInventoryInputProdCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CONSIGNMENT_CLS_ID", sqpp, "wHtInventoryInputProdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdList(WHtInventoryInputProdCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtInventoryInputProdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspBySupplierIdList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspBySupplierIdList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspBySupplierIdList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspBySupplierIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspBySupplierIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspBySupplierIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "SUPPLIER_ID", sqpp, "wHtReceiveNoPlanInspBySupplierIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspBySupplierIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_receive_no_plan_insp where ...)} <br>
     * w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtReceiveNoPlanInspByDepositIdList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtReceiveNoPlanInspCB> derivedWHtReceiveNoPlanInspByDepositIdList() {
        return xcreateQDRFunctionWHtReceiveNoPlanInspByDepositIdList();
    }
    protected HpQDRFunction<WHtReceiveNoPlanInspCB> xcreateQDRFunctionWHtReceiveNoPlanInspByDepositIdList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtReceiveNoPlanInspByDepositIdList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtReceiveNoPlanInspByDepositIdList(String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtReceiveNoPlanInspCB cb = new WHtReceiveNoPlanInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "DEPOSIT_ID", sqpp, "wHtReceiveNoPlanInspByDepositIdList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdList(WHtReceiveNoPlanInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtReceiveNoPlanInspByDepositIdListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_serial_receive_insp where ...)} <br>
     * w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialReceiveInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialReceiveInspCB> derivedWHtSerialReceiveInspList() {
        return xcreateQDRFunctionWHtSerialReceiveInspList();
    }
    protected HpQDRFunction<WHtSerialReceiveInspCB> xcreateQDRFunctionWHtSerialReceiveInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialReceiveInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialReceiveInspList(String fn, SubQuery<WHtSerialReceiveInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialReceiveInspCB cb = new WHtSerialReceiveInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "wHtSerialReceiveInspList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspList(WHtSerialReceiveInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialReceiveInspListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from w_ht_serial_shipping_insp where ...)} <br>
     * w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedWHtSerialShippingInspList()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     inspCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     inspCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<WHtSerialShippingInspCB> derivedWHtSerialShippingInspList() {
        return xcreateQDRFunctionWHtSerialShippingInspList();
    }
    protected HpQDRFunction<WHtSerialShippingInspCB> xcreateQDRFunctionWHtSerialShippingInspList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveWHtSerialShippingInspList(fn, sq, rd, vl, op));
    }
    public void xqderiveWHtSerialShippingInspList(String fn, SubQuery<WHtSerialShippingInspCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        WHtSerialShippingInspCB cb = new WHtSerialShippingInspCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(cb.query()); String prpp = keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "CUSTOMER_ID", "CUSTOMER_ID", sqpp, "wHtSerialShippingInspList", rd, vl, prpp, op);
    }
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspList(WHtSerialShippingInspCQ sq);
    public abstract String keepCustomerId_QueryDerivedReferrer_WHtSerialShippingInspListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     */
    public void setCustomerId_IsNull() { regCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
     */
    public void setCustomerId_IsNotNull() { regCustomerId(CK_ISNN, DOBJ); }

    protected void regCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerId(), "CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueCustomerId();

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
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_Equal(String customerCd) {
        doSetCustomerCd_Equal(fRES(customerCd));
    }

    protected void doSetCustomerCd_Equal(String customerCd) {
        regCustomerCd(CK_EQ, customerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotEqual(String customerCd) {
        doSetCustomerCd_NotEqual(fRES(customerCd));
    }

    protected void doSetCustomerCd_NotEqual(String customerCd) {
        regCustomerCd(CK_NES, customerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterThan(String customerCd) {
        regCustomerCd(CK_GT, fRES(customerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessThan(String customerCd) {
        regCustomerCd(CK_LT, fRES(customerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_GreaterEqual(String customerCd) {
        regCustomerCd(CK_GE, fRES(customerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_LessEqual(String customerCd) {
        regCustomerCd(CK_LE, fRES(customerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCdList The collection of customerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_InScope(Collection<String> customerCdList) {
        doSetCustomerCd_InScope(customerCdList);
    }

    protected void doSetCustomerCd_InScope(Collection<String> customerCdList) {
        regINS(CK_INS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCdList The collection of customerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_NotInScope(Collection<String> customerCdList) {
        doSetCustomerCd_NotInScope(customerCdList);
    }

    protected void doSetCustomerCd_NotInScope(Collection<String> customerCdList) {
        regINS(CK_NINS, cTL(customerCdList), xgetCValueCustomerCd(), "CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)} <br>
     * <pre>e.g. setCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerCd The value of customerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerCd_LikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerCd_NotLikeSearch(String customerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerCd), xgetCValueCustomerCd(), "CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30)}
     * @param customerCd The value of customerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerCd_PrefixSearch(String customerCd) {
        setCustomerCd_LikeSearch(customerCd, xcLSOPPre());
    }

    protected void regCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerCd(), "CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_Equal(String customerNm) {
        doSetCustomerNm_Equal(fRES(customerNm));
    }

    protected void doSetCustomerNm_Equal(String customerNm) {
        regCustomerNm(CK_EQ, customerNm);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotEqual(String customerNm) {
        doSetCustomerNm_NotEqual(fRES(customerNm));
    }

    protected void doSetCustomerNm_NotEqual(String customerNm) {
        regCustomerNm(CK_NES, customerNm);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterThan(String customerNm) {
        regCustomerNm(CK_GT, fRES(customerNm));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessThan(String customerNm) {
        regCustomerNm(CK_LT, fRES(customerNm));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_GreaterEqual(String customerNm) {
        regCustomerNm(CK_GE, fRES(customerNm));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_LessEqual(String customerNm) {
        regCustomerNm(CK_LE, fRES(customerNm));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNmList The collection of customerNm as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_InScope(Collection<String> customerNmList) {
        doSetCustomerNm_InScope(customerNmList);
    }

    protected void doSetCustomerNm_InScope(Collection<String> customerNmList) {
        regINS(CK_INS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNmList The collection of customerNm as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_NotInScope(Collection<String> customerNmList) {
        doSetCustomerNm_NotInScope(customerNmList);
    }

    protected void doSetCustomerNm_NotInScope(Collection<String> customerNmList) {
        regINS(CK_NINS, cTL(customerNmList), xgetCValueCustomerNm(), "CUSTOMER_NM");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)} <br>
     * <pre>e.g. setCustomerNm_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerNm The value of customerNm as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerNm_LikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerNm_NotLikeSearch(String customerNm, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerNm), xgetCValueCustomerNm(), "CUSTOMER_NM", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_NM: {NotNull, VARCHAR(60)}
     * @param customerNm The value of customerNm as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerNm_PrefixSearch(String customerNm) {
        setCustomerNm_LikeSearch(customerNm, xcLSOPPre());
    }

    protected void regCustomerNm(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerNm(), "CUSTOMER_NM"); }
    protected abstract ConditionValue xgetCValueCustomerNm();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_Equal(String customerAbbr) {
        doSetCustomerAbbr_Equal(fRES(customerAbbr));
    }

    protected void doSetCustomerAbbr_Equal(String customerAbbr) {
        regCustomerAbbr(CK_EQ, customerAbbr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_NotEqual(String customerAbbr) {
        doSetCustomerAbbr_NotEqual(fRES(customerAbbr));
    }

    protected void doSetCustomerAbbr_NotEqual(String customerAbbr) {
        regCustomerAbbr(CK_NES, customerAbbr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_GreaterThan(String customerAbbr) {
        regCustomerAbbr(CK_GT, fRES(customerAbbr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_LessThan(String customerAbbr) {
        regCustomerAbbr(CK_LT, fRES(customerAbbr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_GreaterEqual(String customerAbbr) {
        regCustomerAbbr(CK_GE, fRES(customerAbbr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_LessEqual(String customerAbbr) {
        regCustomerAbbr(CK_LE, fRES(customerAbbr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbrList The collection of customerAbbr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_InScope(Collection<String> customerAbbrList) {
        doSetCustomerAbbr_InScope(customerAbbrList);
    }

    protected void doSetCustomerAbbr_InScope(Collection<String> customerAbbrList) {
        regINS(CK_INS, cTL(customerAbbrList), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbrList The collection of customerAbbr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_NotInScope(Collection<String> customerAbbrList) {
        doSetCustomerAbbr_NotInScope(customerAbbrList);
    }

    protected void doSetCustomerAbbr_NotInScope(Collection<String> customerAbbrList) {
        regINS(CK_NINS, cTL(customerAbbrList), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)} <br>
     * <pre>e.g. setCustomerAbbr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param customerAbbr The value of customerAbbr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setCustomerAbbr_LikeSearch(String customerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(customerAbbr), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setCustomerAbbr_NotLikeSearch(String customerAbbr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(customerAbbr), xgetCValueCustomerAbbr(), "CUSTOMER_ABBR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     * @param customerAbbr The value of customerAbbr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCustomerAbbr_PrefixSearch(String customerAbbr) {
        setCustomerAbbr_LikeSearch(customerAbbr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     */
    public void setCustomerAbbr_IsNull() { regCustomerAbbr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     */
    public void setCustomerAbbr_IsNullOrEmpty() { regCustomerAbbr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CUSTOMER_ABBR: {VARCHAR(60)}
     */
    public void setCustomerAbbr_IsNotNull() { regCustomerAbbr(CK_ISNN, DOBJ); }

    protected void regCustomerAbbr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCustomerAbbr(), "CUSTOMER_ABBR"); }
    protected abstract ConditionValue xgetCValueCustomerAbbr();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_Equal(String zipCd) {
        doSetZipCd_Equal(fRES(zipCd));
    }

    protected void doSetZipCd_Equal(String zipCd) {
        regZipCd(CK_EQ, zipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotEqual(String zipCd) {
        doSetZipCd_NotEqual(fRES(zipCd));
    }

    protected void doSetZipCd_NotEqual(String zipCd) {
        regZipCd(CK_NES, zipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterThan(String zipCd) {
        regZipCd(CK_GT, fRES(zipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessThan(String zipCd) {
        regZipCd(CK_LT, fRES(zipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_GreaterEqual(String zipCd) {
        regZipCd(CK_GE, fRES(zipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_LessEqual(String zipCd) {
        regZipCd(CK_LE, fRES(zipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCdList The collection of zipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_InScope(Collection<String> zipCdList) {
        doSetZipCd_InScope(zipCdList);
    }

    protected void doSetZipCd_InScope(Collection<String> zipCdList) {
        regINS(CK_INS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCdList The collection of zipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_NotInScope(Collection<String> zipCdList) {
        doSetZipCd_NotInScope(zipCdList);
    }

    protected void doSetZipCd_NotInScope(Collection<String> zipCdList) {
        regINS(CK_NINS, cTL(zipCdList), xgetCValueZipCd(), "ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param zipCd The value of zipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setZipCd_LikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setZipCd_NotLikeSearch(String zipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(zipCd), xgetCValueZipCd(), "ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     * @param zipCd The value of zipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setZipCd_PrefixSearch(String zipCd) {
        setZipCd_LikeSearch(zipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNull() { regZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNullOrEmpty() { regZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ZIP_CD: {VARCHAR(30)}
     */
    public void setZipCd_IsNotNull() { regZipCd(CK_ISNN, DOBJ); }

    protected void regZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueZipCd(), "ZIP_CD"); }
    protected abstract ConditionValue xgetCValueZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_Equal(String telNo) {
        doSetTelNo_Equal(fRES(telNo));
    }

    protected void doSetTelNo_Equal(String telNo) {
        regTelNo(CK_EQ, telNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotEqual(String telNo) {
        doSetTelNo_NotEqual(fRES(telNo));
    }

    protected void doSetTelNo_NotEqual(String telNo) {
        regTelNo(CK_NES, telNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterThan(String telNo) {
        regTelNo(CK_GT, fRES(telNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessThan(String telNo) {
        regTelNo(CK_LT, fRES(telNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_GreaterEqual(String telNo) {
        regTelNo(CK_GE, fRES(telNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_LessEqual(String telNo) {
        regTelNo(CK_LE, fRES(telNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_InScope(Collection<String> telNoList) {
        doSetTelNo_InScope(telNoList);
    }

    protected void doSetTelNo_InScope(Collection<String> telNoList) {
        regINS(CK_INS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNoList The collection of telNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_NotInScope(Collection<String> telNoList) {
        doSetTelNo_NotInScope(telNoList);
    }

    protected void doSetTelNo_NotInScope(Collection<String> telNoList) {
        regINS(CK_NINS, cTL(telNoList), xgetCValueTelNo(), "TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param telNo The value of telNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTelNo_LikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTelNo_NotLikeSearch(String telNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(telNo), xgetCValueTelNo(), "TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     * @param telNo The value of telNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTelNo_PrefixSearch(String telNo) {
        setTelNo_LikeSearch(telNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNull() { regTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNullOrEmpty() { regTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TEL_NO: {VARCHAR(30)}
     */
    public void setTelNo_IsNotNull() { regTelNo(CK_ISNN, DOBJ); }

    protected void regTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTelNo(), "TEL_NO"); }
    protected abstract ConditionValue xgetCValueTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_Equal(String address1) {
        doSetAddress1_Equal(fRES(address1));
    }

    protected void doSetAddress1_Equal(String address1) {
        regAddress1(CK_EQ, address1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotEqual(String address1) {
        doSetAddress1_NotEqual(fRES(address1));
    }

    protected void doSetAddress1_NotEqual(String address1) {
        regAddress1(CK_NES, address1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterThan(String address1) {
        regAddress1(CK_GT, fRES(address1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessThan(String address1) {
        regAddress1(CK_LT, fRES(address1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_GreaterEqual(String address1) {
        regAddress1(CK_GE, fRES(address1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_LessEqual(String address1) {
        regAddress1(CK_LE, fRES(address1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1List The collection of address1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_InScope(Collection<String> address1List) {
        doSetAddress1_InScope(address1List);
    }

    protected void doSetAddress1_InScope(Collection<String> address1List) {
        regINS(CK_INS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1List The collection of address1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_NotInScope(Collection<String> address1List) {
        doSetAddress1_NotInScope(address1List);
    }

    protected void doSetAddress1_NotInScope(Collection<String> address1List) {
        regINS(CK_NINS, cTL(address1List), xgetCValueAddress1(), "ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address1 The value of address1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress1_LikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress1_NotLikeSearch(String address1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address1), xgetCValueAddress1(), "ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     * @param address1 The value of address1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress1_PrefixSearch(String address1) {
        setAddress1_LikeSearch(address1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNull() { regAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNullOrEmpty() { regAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS1: {VARCHAR(60)}
     */
    public void setAddress1_IsNotNull() { regAddress1(CK_ISNN, DOBJ); }

    protected void regAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress1(), "ADDRESS1"); }
    protected abstract ConditionValue xgetCValueAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_Equal(String address2) {
        doSetAddress2_Equal(fRES(address2));
    }

    protected void doSetAddress2_Equal(String address2) {
        regAddress2(CK_EQ, address2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotEqual(String address2) {
        doSetAddress2_NotEqual(fRES(address2));
    }

    protected void doSetAddress2_NotEqual(String address2) {
        regAddress2(CK_NES, address2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterThan(String address2) {
        regAddress2(CK_GT, fRES(address2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessThan(String address2) {
        regAddress2(CK_LT, fRES(address2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_GreaterEqual(String address2) {
        regAddress2(CK_GE, fRES(address2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_LessEqual(String address2) {
        regAddress2(CK_LE, fRES(address2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2List The collection of address2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_InScope(Collection<String> address2List) {
        doSetAddress2_InScope(address2List);
    }

    protected void doSetAddress2_InScope(Collection<String> address2List) {
        regINS(CK_INS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2List The collection of address2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_NotInScope(Collection<String> address2List) {
        doSetAddress2_NotInScope(address2List);
    }

    protected void doSetAddress2_NotInScope(Collection<String> address2List) {
        regINS(CK_NINS, cTL(address2List), xgetCValueAddress2(), "ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address2 The value of address2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress2_LikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress2_NotLikeSearch(String address2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address2), xgetCValueAddress2(), "ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     * @param address2 The value of address2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress2_PrefixSearch(String address2) {
        setAddress2_LikeSearch(address2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNull() { regAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNullOrEmpty() { regAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS2: {VARCHAR(60)}
     */
    public void setAddress2_IsNotNull() { regAddress2(CK_ISNN, DOBJ); }

    protected void regAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress2(), "ADDRESS2"); }
    protected abstract ConditionValue xgetCValueAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_Equal(String address3) {
        doSetAddress3_Equal(fRES(address3));
    }

    protected void doSetAddress3_Equal(String address3) {
        regAddress3(CK_EQ, address3);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotEqual(String address3) {
        doSetAddress3_NotEqual(fRES(address3));
    }

    protected void doSetAddress3_NotEqual(String address3) {
        regAddress3(CK_NES, address3);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterThan(String address3) {
        regAddress3(CK_GT, fRES(address3));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessThan(String address3) {
        regAddress3(CK_LT, fRES(address3));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_GreaterEqual(String address3) {
        regAddress3(CK_GE, fRES(address3));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_LessEqual(String address3) {
        regAddress3(CK_LE, fRES(address3));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3List The collection of address3 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_InScope(Collection<String> address3List) {
        doSetAddress3_InScope(address3List);
    }

    protected void doSetAddress3_InScope(Collection<String> address3List) {
        regINS(CK_INS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3List The collection of address3 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_NotInScope(Collection<String> address3List) {
        doSetAddress3_NotInScope(address3List);
    }

    protected void doSetAddress3_NotInScope(Collection<String> address3List) {
        regINS(CK_NINS, cTL(address3List), xgetCValueAddress3(), "ADDRESS3");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)} <br>
     * <pre>e.g. setAddress3_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param address3 The value of address3 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAddress3_LikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAddress3_NotLikeSearch(String address3, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(address3), xgetCValueAddress3(), "ADDRESS3", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     * @param address3 The value of address3 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAddress3_PrefixSearch(String address3) {
        setAddress3_LikeSearch(address3, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNull() { regAddress3(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNullOrEmpty() { regAddress3(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ADDRESS3: {VARCHAR(60)}
     */
    public void setAddress3_IsNotNull() { regAddress3(CK_ISNN, DOBJ); }

    protected void regAddress3(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAddress3(), "ADDRESS3"); }
    protected abstract ConditionValue xgetCValueAddress3();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlg The value of vendorFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_Equal(String vendorFlg) {
        doSetVendorFlg_Equal(fRES(vendorFlg));
    }

    /**
     * Equal(=). As VendorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg cdef) {
        doSetVendorFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setVendorFlg_Equal_$1() {
        setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setVendorFlg_Equal_$0() {
        setVendorFlg_Equal_AsVendorFlg(CDef.VendorFlg.$0);
    }

    protected void doSetVendorFlg_Equal(String vendorFlg) {
        regVendorFlg(CK_EQ, vendorFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlg The value of vendorFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotEqual(String vendorFlg) {
        doSetVendorFlg_NotEqual(fRES(vendorFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As VendorFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg cdef) {
        doSetVendorFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setVendorFlg_NotEqual_$1() {
        setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setVendorFlg_NotEqual_$0() {
        setVendorFlg_NotEqual_AsVendorFlg(CDef.VendorFlg.$0);
    }

    protected void doSetVendorFlg_NotEqual(String vendorFlg) {
        regVendorFlg(CK_NES, vendorFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlgList The collection of vendorFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_InScope(Collection<String> vendorFlgList) {
        doSetVendorFlg_InScope(vendorFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As VendorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_InScope_AsVendorFlg(Collection<CDef.VendorFlg> cdefList) {
        doSetVendorFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetVendorFlg_InScope(Collection<String> vendorFlgList) {
        regINS(CK_INS, cTL(vendorFlgList), xgetCValueVendorFlg(), "VENDOR_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     * @param vendorFlgList The collection of vendorFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotInScope(Collection<String> vendorFlgList) {
        doSetVendorFlg_NotInScope(vendorFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As VendorFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg} <br>
     * 仕入先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setVendorFlg_NotInScope_AsVendorFlg(Collection<CDef.VendorFlg> cdefList) {
        doSetVendorFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetVendorFlg_NotInScope(Collection<String> vendorFlgList) {
        regINS(CK_NINS, cTL(vendorFlgList), xgetCValueVendorFlg(), "VENDOR_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     */
    public void setVendorFlg_IsNull() { regVendorFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     */
    public void setVendorFlg_IsNullOrEmpty() { regVendorFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
     */
    public void setVendorFlg_IsNotNull() { regVendorFlg(CK_ISNN, DOBJ); }

    protected void regVendorFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueVendorFlg(), "VENDOR_FLG"); }
    protected abstract ConditionValue xgetCValueVendorFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlg The value of deliveryFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_Equal(String deliveryFlg) {
        doSetDeliveryFlg_Equal(fRES(deliveryFlg));
    }

    /**
     * Equal(=). As DeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg cdef) {
        doSetDeliveryFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDeliveryFlg_Equal_$1() {
        setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDeliveryFlg_Equal_$0() {
        setDeliveryFlg_Equal_AsDeliveryFlg(CDef.DeliveryFlg.$0);
    }

    protected void doSetDeliveryFlg_Equal(String deliveryFlg) {
        regDeliveryFlg(CK_EQ, deliveryFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlg The value of deliveryFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotEqual(String deliveryFlg) {
        doSetDeliveryFlg_NotEqual(fRES(deliveryFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DeliveryFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg cdef) {
        doSetDeliveryFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDeliveryFlg_NotEqual_$1() {
        setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDeliveryFlg_NotEqual_$0() {
        setDeliveryFlg_NotEqual_AsDeliveryFlg(CDef.DeliveryFlg.$0);
    }

    protected void doSetDeliveryFlg_NotEqual(String deliveryFlg) {
        regDeliveryFlg(CK_NES, deliveryFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlgList The collection of deliveryFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_InScope(deliveryFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_InScope_AsDeliveryFlg(Collection<CDef.DeliveryFlg> cdefList) {
        doSetDeliveryFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDeliveryFlg_InScope(Collection<String> deliveryFlgList) {
        regINS(CK_INS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     * @param deliveryFlgList The collection of deliveryFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        doSetDeliveryFlg_NotInScope(deliveryFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DeliveryFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg} <br>
     * 納品先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDeliveryFlg_NotInScope_AsDeliveryFlg(Collection<CDef.DeliveryFlg> cdefList) {
        doSetDeliveryFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDeliveryFlg_NotInScope(Collection<String> deliveryFlgList) {
        regINS(CK_NINS, cTL(deliveryFlgList), xgetCValueDeliveryFlg(), "DELIVERY_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     */
    public void setDeliveryFlg_IsNull() { regDeliveryFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     */
    public void setDeliveryFlg_IsNullOrEmpty() { regDeliveryFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
     */
    public void setDeliveryFlg_IsNotNull() { regDeliveryFlg(CK_ISNN, DOBJ); }

    protected void regDeliveryFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDeliveryFlg(), "DELIVERY_FLG"); }
    protected abstract ConditionValue xgetCValueDeliveryFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlg The value of onetimeFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_Equal(String onetimeFlg) {
        doSetOnetimeFlg_Equal(fRES(onetimeFlg));
    }

    /**
     * Equal(=). As OnetimeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg cdef) {
        doSetOnetimeFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setOnetimeFlg_Equal_$1() {
        setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_Equal_$0() {
        setOnetimeFlg_Equal_AsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    protected void doSetOnetimeFlg_Equal(String onetimeFlg) {
        regOnetimeFlg(CK_EQ, onetimeFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlg The value of onetimeFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotEqual(String onetimeFlg) {
        doSetOnetimeFlg_NotEqual(fRES(onetimeFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As OnetimeFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg cdef) {
        doSetOnetimeFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setOnetimeFlg_NotEqual_$1() {
        setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setOnetimeFlg_NotEqual_$0() {
        setOnetimeFlg_NotEqual_AsOnetimeFlg(CDef.OnetimeFlg.$0);
    }

    protected void doSetOnetimeFlg_NotEqual(String onetimeFlg) {
        regOnetimeFlg(CK_NES, onetimeFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlgList The collection of onetimeFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_InScope(Collection<String> onetimeFlgList) {
        doSetOnetimeFlg_InScope(onetimeFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As OnetimeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_InScope_AsOnetimeFlg(Collection<CDef.OnetimeFlg> cdefList) {
        doSetOnetimeFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetOnetimeFlg_InScope(Collection<String> onetimeFlgList) {
        regINS(CK_INS, cTL(onetimeFlgList), xgetCValueOnetimeFlg(), "ONETIME_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     * @param onetimeFlgList The collection of onetimeFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotInScope(Collection<String> onetimeFlgList) {
        doSetOnetimeFlg_NotInScope(onetimeFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As OnetimeFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg} <br>
     * ワンタイムフラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setOnetimeFlg_NotInScope_AsOnetimeFlg(Collection<CDef.OnetimeFlg> cdefList) {
        doSetOnetimeFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetOnetimeFlg_NotInScope(Collection<String> onetimeFlgList) {
        regINS(CK_NINS, cTL(onetimeFlgList), xgetCValueOnetimeFlg(), "ONETIME_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     */
    public void setOnetimeFlg_IsNull() { regOnetimeFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     */
    public void setOnetimeFlg_IsNullOrEmpty() { regOnetimeFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
     */
    public void setOnetimeFlg_IsNotNull() { regOnetimeFlg(CK_ISNN, DOBJ); }

    protected void regOnetimeFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueOnetimeFlg(), "ONETIME_FLG"); }
    protected abstract ConditionValue xgetCValueOnetimeFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlg The value of depositFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_Equal(String depositFlg) {
        doSetDepositFlg_Equal(fRES(depositFlg));
    }

    /**
     * Equal(=). As DepositFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg cdef) {
        doSetDepositFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDepositFlg_Equal_$1() {
        setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDepositFlg_Equal_$0() {
        setDepositFlg_Equal_AsDepositFlg(CDef.DepositFlg.$0);
    }

    protected void doSetDepositFlg_Equal(String depositFlg) {
        regDepositFlg(CK_EQ, depositFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlg The value of depositFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotEqual(String depositFlg) {
        doSetDepositFlg_NotEqual(fRES(depositFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As DepositFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg cdef) {
        doSetDepositFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 使用
     */
    public void setDepositFlg_NotEqual_$1() {
        setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 未使用
     */
    public void setDepositFlg_NotEqual_$0() {
        setDepositFlg_NotEqual_AsDepositFlg(CDef.DepositFlg.$0);
    }

    protected void doSetDepositFlg_NotEqual(String depositFlg) {
        regDepositFlg(CK_NES, depositFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlgList The collection of depositFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_InScope(Collection<String> depositFlgList) {
        doSetDepositFlg_InScope(depositFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DepositFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_InScope_AsDepositFlg(Collection<CDef.DepositFlg> cdefList) {
        doSetDepositFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDepositFlg_InScope(Collection<String> depositFlgList) {
        regINS(CK_INS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     * @param depositFlgList The collection of depositFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotInScope(Collection<String> depositFlgList) {
        doSetDepositFlg_NotInScope(depositFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As DepositFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg} <br>
     * 預託先フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDepositFlg_NotInScope_AsDepositFlg(Collection<CDef.DepositFlg> cdefList) {
        doSetDepositFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetDepositFlg_NotInScope(Collection<String> depositFlgList) {
        regINS(CK_NINS, cTL(depositFlgList), xgetCValueDepositFlg(), "DEPOSIT_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     */
    public void setDepositFlg_IsNull() { regDepositFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     */
    public void setDepositFlg_IsNullOrEmpty() { regDepositFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
     */
    public void setDepositFlg_IsNotNull() { regDepositFlg(CK_ISNN, DOBJ); }

    protected void regDepositFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDepositFlg(), "DEPOSIT_FLG"); }
    protected abstract ConditionValue xgetCValueDepositFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_Equal(Long allocOrder) {
        doSetAllocOrder_Equal(allocOrder);
    }

    protected void doSetAllocOrder_Equal(Long allocOrder) {
        regAllocOrder(CK_EQ, allocOrder);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_NotEqual(Long allocOrder) {
        doSetAllocOrder_NotEqual(allocOrder);
    }

    protected void doSetAllocOrder_NotEqual(Long allocOrder) {
        regAllocOrder(CK_NES, allocOrder);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterThan(Long allocOrder) {
        regAllocOrder(CK_GT, allocOrder);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessThan(Long allocOrder) {
        regAllocOrder(CK_LT, allocOrder);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_GreaterEqual(Long allocOrder) {
        regAllocOrder(CK_GE, allocOrder);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrder The value of allocOrder as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setAllocOrder_LessEqual(Long allocOrder) {
        regAllocOrder(CK_LE, allocOrder);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param minNumber The min number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of allocOrder. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setAllocOrder_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueAllocOrder(), "ALLOC_ORDER", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrderList The collection of allocOrder as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_InScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_InScope(allocOrderList);
    }

    protected void doSetAllocOrder_InScope(Collection<Long> allocOrderList) {
        regINS(CK_INS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     * @param allocOrderList The collection of allocOrder as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        doSetAllocOrder_NotInScope(allocOrderList);
    }

    protected void doSetAllocOrder_NotInScope(Collection<Long> allocOrderList) {
        regINS(CK_NINS, cTL(allocOrderList), xgetCValueAllocOrder(), "ALLOC_ORDER");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     */
    public void setAllocOrder_IsNull() { regAllocOrder(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ALLOC_ORDER: {BIGINT(19)}
     */
    public void setAllocOrder_IsNotNull() { regAllocOrder(CK_ISNN, DOBJ); }

    protected void regAllocOrder(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAllocOrder(), "ALLOC_ORDER"); }
    protected abstract ConditionValue xgetCValueAllocOrder();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal(String lotReverseFlg) {
        doSetLotReverseFlg_Equal(fRES(lotReverseFlg));
    }

    /**
     * Equal(=). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_Equal_$1() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_Equal_$0() {
        setLotReverseFlg_Equal_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    protected void doSetLotReverseFlg_Equal(String lotReverseFlg) {
        regLotReverseFlg(CK_EQ, lotReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlg The value of lotReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual(String lotReverseFlg) {
        doSetLotReverseFlg_NotEqual(fRES(lotReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LotReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg cdef) {
        doSetLotReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLotReverseFlg_NotEqual_$1() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLotReverseFlg_NotEqual_$0() {
        setLotReverseFlg_NotEqual_AsLotReverseFlg(CDef.LotReverseFlg.$0);
    }

    protected void doSetLotReverseFlg_NotEqual(String lotReverseFlg) {
        regLotReverseFlg(CK_NES, lotReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_InScope(lotReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_InScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_InScope(Collection<String> lotReverseFlgList) {
        regINS(CK_INS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     * @param lotReverseFlgList The collection of lotReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        doSetLotReverseFlg_NotInScope(lotReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LotReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg} <br>
     * ロット逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotReverseFlg_NotInScope_AsLotReverseFlg(Collection<CDef.LotReverseFlg> cdefList) {
        doSetLotReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLotReverseFlg_NotInScope(Collection<String> lotReverseFlgList) {
        regINS(CK_NINS, cTL(lotReverseFlgList), xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNull() { regLotReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNullOrEmpty() { regLotReverseFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
     */
    public void setLotReverseFlg_IsNotNull() { regLotReverseFlg(CK_ISNN, DOBJ); }

    protected void regLotReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotReverseFlg(), "LOT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLotReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_Equal(fRES(limitDtReverseFlg));
    }

    /**
     * Equal(=). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_Equal_$1() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_Equal_$0() {
        setLimitDtReverseFlg_Equal_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    protected void doSetLimitDtReverseFlg_Equal(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_EQ, limitDtReverseFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlg The value of limitDtReverseFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        doSetLimitDtReverseFlg_NotEqual(fRES(limitDtReverseFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As LimitDtReverseFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg cdef) {
        doSetLimitDtReverseFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 管理する
     */
    public void setLimitDtReverseFlg_NotEqual_$1() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 管理しない
     */
    public void setLimitDtReverseFlg_NotEqual_$0() {
        setLimitDtReverseFlg_NotEqual_AsLimitDtReverseFlg(CDef.LimitDtReverseFlg.$0);
    }

    protected void doSetLimitDtReverseFlg_NotEqual(String limitDtReverseFlg) {
        regLimitDtReverseFlg(CK_NES, limitDtReverseFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_InScope(limitDtReverseFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_InScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_InScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_INS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     * @param limitDtReverseFlgList The collection of limitDtReverseFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        doSetLimitDtReverseFlg_NotInScope(limitDtReverseFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As LimitDtReverseFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg} <br>
     * 期限日逆転防止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtReverseFlg_NotInScope_AsLimitDtReverseFlg(Collection<CDef.LimitDtReverseFlg> cdefList) {
        doSetLimitDtReverseFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetLimitDtReverseFlg_NotInScope(Collection<String> limitDtReverseFlgList) {
        regINS(CK_NINS, cTL(limitDtReverseFlgList), xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNull() { regLimitDtReverseFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNullOrEmpty() { regLimitDtReverseFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
     */
    public void setLimitDtReverseFlg_IsNotNull() { regLimitDtReverseFlg(CK_ISNN, DOBJ); }

    protected void regLimitDtReverseFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtReverseFlg(), "LIMIT_DT_REVERSE_FLG"); }
    protected abstract ConditionValue xgetCValueLimitDtReverseFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal(String shippingStopFlg) {
        doSetShippingStopFlg_Equal(fRES(shippingStopFlg));
    }

    /**
     * Equal(=). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_Equal(cdef != null ? cdef.code() : null);
    }

    /**
     * Equal(=). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_Equal_$1() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * Equal(=). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_Equal_$0() {
        setShippingStopFlg_Equal_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    protected void doSetShippingStopFlg_Equal(String shippingStopFlg) {
        regShippingStopFlg(CK_EQ, shippingStopFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlg The value of shippingStopFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual(String shippingStopFlg) {
        doSetShippingStopFlg_NotEqual(fRES(shippingStopFlg));
    }

    /**
     * NotEqual(&lt;&gt;). As ShippingStopFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdef The instance of classification definition (as ENUM type). (basically NotNull: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg cdef) {
        doSetShippingStopFlg_NotEqual(cdef != null ? cdef.code() : null);
    }

    /**
     * NotEqual(&lt;&gt;). As $1 (1). And OnlyOnceRegistered. <br>
     * $1: 出荷停止
     */
    public void setShippingStopFlg_NotEqual_$1() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$1);
    }

    /**
     * NotEqual(&lt;&gt;). As $0 (0). And OnlyOnceRegistered. <br>
     * $0: 出荷可能
     */
    public void setShippingStopFlg_NotEqual_$0() {
        setShippingStopFlg_NotEqual_AsShippingStopFlg(CDef.ShippingStopFlg.$0);
    }

    protected void doSetShippingStopFlg_NotEqual(String shippingStopFlg) {
        regShippingStopFlg(CK_NES, shippingStopFlg);
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_InScope(shippingStopFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_InScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_InScope(Collection<String> shippingStopFlgList) {
        regINS(CK_INS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     * @param shippingStopFlgList The collection of shippingStopFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        doSetShippingStopFlg_NotInScope(shippingStopFlgList);
    }

    /**
     * NotInScope {not in ('a', 'b')}. As ShippingStopFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg} <br>
     * 出荷停止フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setShippingStopFlg_NotInScope_AsShippingStopFlg(Collection<CDef.ShippingStopFlg> cdefList) {
        doSetShippingStopFlg_NotInScope(cTStrL(cdefList));
    }

    protected void doSetShippingStopFlg_NotInScope(Collection<String> shippingStopFlgList) {
        regINS(CK_NINS, cTL(shippingStopFlgList), xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNull() { regShippingStopFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNullOrEmpty() { regShippingStopFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
     */
    public void setShippingStopFlg_IsNotNull() { regShippingStopFlg(CK_ISNN, DOBJ); }

    protected void regShippingStopFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueShippingStopFlg(), "SHIPPING_STOP_FLG"); }
    protected abstract ConditionValue xgetCValueShippingStopFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
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
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
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
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterThan(Long delivCustomerId) {
        regDelivCustomerId(CK_GT, delivCustomerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessThan(Long delivCustomerId) {
        regDelivCustomerId(CK_LT, delivCustomerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_GreaterEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_GE, delivCustomerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerId The value of delivCustomerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setDelivCustomerId_LessEqual(Long delivCustomerId) {
        regDelivCustomerId(CK_LE, delivCustomerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param minNumber The min number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of delivCustomerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setDelivCustomerId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
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
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     * @param delivCustomerIdList The collection of delivCustomerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        doSetDelivCustomerId_NotInScope(delivCustomerIdList);
    }

    protected void doSetDelivCustomerId_NotInScope(Collection<Long> delivCustomerIdList) {
        regINS(CK_NINS, cTL(delivCustomerIdList), xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID");
    }

    /**
     * Set up InScopeRelation (sub-query). <br />
     * {in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @param subCBLambda The callback for sub-query of MCustomerSelf for 'in-scope'. (NotNull)
     */
    public void inScopeMCustomerSelf(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_InScopeRelation_MCustomerSelf(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerSelf", false);
    }
    public abstract String keepDelivCustomerId_InScopeRelation_MCustomerSelf(MCustomerCQ sq);

    /**
     * Set up NotInScopeRelation (sub-query). <br />
     * {not in (select DELIV_CUSTOMER_ID from m_customer where ...)} <br />
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * @param subCBLambda The callback for sub-query of MCustomerSelf for 'not in-scope'. (NotNull)
     */
    public void notInScopeMCustomerSelf(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForInScopeRelation(this);
        try { lock(); subCBLambda.query(cb); } finally { unlock(); }
        String pp = keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(cb.query());
        registerInScopeRelation(cb.query(), "DELIV_CUSTOMER_ID", "CUSTOMER_ID", pp, "mCustomerSelf", true);
    }
    public abstract String keepDelivCustomerId_NotInScopeRelation_MCustomerSelf(MCustomerCQ sq);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNull() { regDelivCustomerId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
     */
    public void setDelivCustomerId_IsNotNull() { regDelivCustomerId(CK_ISNN, DOBJ); }

    protected void regDelivCustomerId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueDelivCustomerId(), "DELIV_CUSTOMER_ID"); }
    protected abstract ConditionValue xgetCValueDelivCustomerId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_Equal(String accountFlg) {
        doSetAccountFlg_Equal(fRES(accountFlg));
    }

    protected void doSetAccountFlg_Equal(String accountFlg) {
        regAccountFlg(CK_EQ, accountFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_NotEqual(String accountFlg) {
        doSetAccountFlg_NotEqual(fRES(accountFlg));
    }

    protected void doSetAccountFlg_NotEqual(String accountFlg) {
        regAccountFlg(CK_NES, accountFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_GreaterThan(String accountFlg) {
        regAccountFlg(CK_GT, fRES(accountFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_LessThan(String accountFlg) {
        regAccountFlg(CK_LT, fRES(accountFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_GreaterEqual(String accountFlg) {
        regAccountFlg(CK_GE, fRES(accountFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_LessEqual(String accountFlg) {
        regAccountFlg(CK_LE, fRES(accountFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlgList The collection of accountFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_InScope(Collection<String> accountFlgList) {
        doSetAccountFlg_InScope(accountFlgList);
    }

    protected void doSetAccountFlg_InScope(Collection<String> accountFlgList) {
        regINS(CK_INS, cTL(accountFlgList), xgetCValueAccountFlg(), "ACCOUNT_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlgList The collection of accountFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_NotInScope(Collection<String> accountFlgList) {
        doSetAccountFlg_NotInScope(accountFlgList);
    }

    protected void doSetAccountFlg_NotInScope(Collection<String> accountFlgList) {
        regINS(CK_NINS, cTL(accountFlgList), xgetCValueAccountFlg(), "ACCOUNT_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)} <br>
     * <pre>e.g. setAccountFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param accountFlg The value of accountFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setAccountFlg_LikeSearch(String accountFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(accountFlg), xgetCValueAccountFlg(), "ACCOUNT_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setAccountFlg_NotLikeSearch(String accountFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(accountFlg), xgetCValueAccountFlg(), "ACCOUNT_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     * @param accountFlg The value of accountFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setAccountFlg_PrefixSearch(String accountFlg) {
        setAccountFlg_LikeSearch(accountFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     */
    public void setAccountFlg_IsNull() { regAccountFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     */
    public void setAccountFlg_IsNullOrEmpty() { regAccountFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * ACCOUNT_FLG: {CHAR(1)}
     */
    public void setAccountFlg_IsNotNull() { regAccountFlg(CK_ISNN, DOBJ); }

    protected void regAccountFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueAccountFlg(), "ACCOUNT_FLG"); }
    protected abstract ConditionValue xgetCValueAccountFlg();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
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
     * CENTER_ID: {BIGINT(19)}
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
     * CENTER_ID: {BIGINT(19)}
     * @param centerId The value of centerId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterThan(Long centerId) {
        regCenterId(CK_GT, centerId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     * @param centerId The value of centerId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessThan(Long centerId) {
        regCenterId(CK_LT, centerId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     * @param centerId The value of centerId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_GreaterEqual(Long centerId) {
        regCenterId(CK_GE, centerId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     * @param centerId The value of centerId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setCenterId_LessEqual(Long centerId) {
        regCenterId(CK_LE, centerId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     * @param minNumber The min number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of centerId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setCenterId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueCenterId(), "CENTER_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
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
     * CENTER_ID: {BIGINT(19)}
     * @param centerIdList The collection of centerId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setCenterId_NotInScope(Collection<Long> centerIdList) {
        doSetCenterId_NotInScope(centerIdList);
    }

    protected void doSetCenterId_NotInScope(Collection<Long> centerIdList) {
        regINS(CK_NINS, cTL(centerIdList), xgetCValueCenterId(), "CENTER_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     */
    public void setCenterId_IsNull() { regCenterId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * CENTER_ID: {BIGINT(19)}
     */
    public void setCenterId_IsNotNull() { regCenterId(CK_ISNN, DOBJ); }

    protected void regCenterId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueCenterId(), "CENTER_ID"); }
    protected abstract ConditionValue xgetCValueCenterId();

    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as equal. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_Equal(Long salesOrgId) {
        doSetSalesOrgId_Equal(salesOrgId);
    }

    protected void doSetSalesOrgId_Equal(Long salesOrgId) {
        regSalesOrgId(CK_EQ, salesOrgId);
    }

    /**
     * NotEqual(&lt;&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as notEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotEqual(Long salesOrgId) {
        doSetSalesOrgId_NotEqual(salesOrgId);
    }

    protected void doSetSalesOrgId_NotEqual(Long salesOrgId) {
        regSalesOrgId(CK_NES, salesOrgId);
    }

    /**
     * GreaterThan(&gt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterThan(Long salesOrgId) {
        regSalesOrgId(CK_GT, salesOrgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessThan(Long salesOrgId) {
        regSalesOrgId(CK_LT, salesOrgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterEqual(Long salesOrgId) {
        regSalesOrgId(CK_GE, salesOrgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessEqual(Long salesOrgId) {
        regSalesOrgId(CK_LE, salesOrgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param minNumber The min number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrgId(), "SALES_ORG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgIdList The collection of salesOrgId as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_InScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_InScope(Collection<Long> salesOrgIdList) {
        regINS(CK_INS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * NotInScope {not in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     * @param salesOrgIdList The collection of salesOrgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_NotInScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        regINS(CK_NINS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     */
    public void setSalesOrgId_IsNull() { regSalesOrgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {BIGINT(19)}
     */
    public void setSalesOrgId_IsNotNull() { regSalesOrgId(CK_ISNN, DOBJ); }

    protected void regSalesOrgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgId(), "SALES_ORG_ID"); }
    protected abstract ConditionValue xgetCValueSalesOrgId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_Equal(String lotSplitTypeCd) {
        doSetLotSplitTypeCd_Equal(fRES(lotSplitTypeCd));
    }

    protected void doSetLotSplitTypeCd_Equal(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_EQ, lotSplitTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_NotEqual(String lotSplitTypeCd) {
        doSetLotSplitTypeCd_NotEqual(fRES(lotSplitTypeCd));
    }

    protected void doSetLotSplitTypeCd_NotEqual(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_NES, lotSplitTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_GreaterThan(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_GT, fRES(lotSplitTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_LessThan(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_LT, fRES(lotSplitTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_GreaterEqual(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_GE, fRES(lotSplitTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_LessEqual(String lotSplitTypeCd) {
        regLotSplitTypeCd(CK_LE, fRES(lotSplitTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCdList The collection of lotSplitTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_InScope(Collection<String> lotSplitTypeCdList) {
        doSetLotSplitTypeCd_InScope(lotSplitTypeCdList);
    }

    protected void doSetLotSplitTypeCd_InScope(Collection<String> lotSplitTypeCdList) {
        regINS(CK_INS, cTL(lotSplitTypeCdList), xgetCValueLotSplitTypeCd(), "LOT_SPLIT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCdList The collection of lotSplitTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_NotInScope(Collection<String> lotSplitTypeCdList) {
        doSetLotSplitTypeCd_NotInScope(lotSplitTypeCdList);
    }

    protected void doSetLotSplitTypeCd_NotInScope(Collection<String> lotSplitTypeCdList) {
        regINS(CK_NINS, cTL(lotSplitTypeCdList), xgetCValueLotSplitTypeCd(), "LOT_SPLIT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLotSplitTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotSplitTypeCd The value of lotSplitTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotSplitTypeCd_LikeSearch(String lotSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotSplitTypeCd), xgetCValueLotSplitTypeCd(), "LOT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotSplitTypeCd_NotLikeSearch(String lotSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotSplitTypeCd), xgetCValueLotSplitTypeCd(), "LOT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotSplitTypeCd The value of lotSplitTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotSplitTypeCd_PrefixSearch(String lotSplitTypeCd) {
        setLotSplitTypeCd_LikeSearch(lotSplitTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotSplitTypeCd_IsNull() { regLotSplitTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotSplitTypeCd_IsNullOrEmpty() { regLotSplitTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotSplitTypeCd_IsNotNull() { regLotSplitTypeCd(CK_ISNN, DOBJ); }

    protected void regLotSplitTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotSplitTypeCd(), "LOT_SPLIT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotSplitTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_Equal(String limitDtSplitTypeCd) {
        doSetLimitDtSplitTypeCd_Equal(fRES(limitDtSplitTypeCd));
    }

    protected void doSetLimitDtSplitTypeCd_Equal(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_EQ, limitDtSplitTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_NotEqual(String limitDtSplitTypeCd) {
        doSetLimitDtSplitTypeCd_NotEqual(fRES(limitDtSplitTypeCd));
    }

    protected void doSetLimitDtSplitTypeCd_NotEqual(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_NES, limitDtSplitTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_GreaterThan(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_GT, fRES(limitDtSplitTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_LessThan(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_LT, fRES(limitDtSplitTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_GreaterEqual(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_GE, fRES(limitDtSplitTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_LessEqual(String limitDtSplitTypeCd) {
        regLimitDtSplitTypeCd(CK_LE, fRES(limitDtSplitTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCdList The collection of limitDtSplitTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_InScope(Collection<String> limitDtSplitTypeCdList) {
        doSetLimitDtSplitTypeCd_InScope(limitDtSplitTypeCdList);
    }

    protected void doSetLimitDtSplitTypeCd_InScope(Collection<String> limitDtSplitTypeCdList) {
        regINS(CK_INS, cTL(limitDtSplitTypeCdList), xgetCValueLimitDtSplitTypeCd(), "LIMIT_DT_SPLIT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCdList The collection of limitDtSplitTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_NotInScope(Collection<String> limitDtSplitTypeCdList) {
        doSetLimitDtSplitTypeCd_NotInScope(limitDtSplitTypeCdList);
    }

    protected void doSetLimitDtSplitTypeCd_NotInScope(Collection<String> limitDtSplitTypeCdList) {
        regINS(CK_NINS, cTL(limitDtSplitTypeCdList), xgetCValueLimitDtSplitTypeCd(), "LIMIT_DT_SPLIT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLimitDtSplitTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDtSplitTypeCd_LikeSearch(String limitDtSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDtSplitTypeCd), xgetCValueLimitDtSplitTypeCd(), "LIMIT_DT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDtSplitTypeCd_NotLikeSearch(String limitDtSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDtSplitTypeCd), xgetCValueLimitDtSplitTypeCd(), "LIMIT_DT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtSplitTypeCd The value of limitDtSplitTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtSplitTypeCd_PrefixSearch(String limitDtSplitTypeCd) {
        setLimitDtSplitTypeCd_LikeSearch(limitDtSplitTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtSplitTypeCd_IsNull() { regLimitDtSplitTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtSplitTypeCd_IsNullOrEmpty() { regLimitDtSplitTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtSplitTypeCd_IsNotNull() { regLimitDtSplitTypeCd(CK_ISNN, DOBJ); }

    protected void regLimitDtSplitTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtSplitTypeCd(), "LIMIT_DT_SPLIT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLimitDtSplitTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_Equal(String prodDtSplitTypeCd) {
        doSetProdDtSplitTypeCd_Equal(fRES(prodDtSplitTypeCd));
    }

    protected void doSetProdDtSplitTypeCd_Equal(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_EQ, prodDtSplitTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_NotEqual(String prodDtSplitTypeCd) {
        doSetProdDtSplitTypeCd_NotEqual(fRES(prodDtSplitTypeCd));
    }

    protected void doSetProdDtSplitTypeCd_NotEqual(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_NES, prodDtSplitTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_GreaterThan(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_GT, fRES(prodDtSplitTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_LessThan(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_LT, fRES(prodDtSplitTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_GreaterEqual(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_GE, fRES(prodDtSplitTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_LessEqual(String prodDtSplitTypeCd) {
        regProdDtSplitTypeCd(CK_LE, fRES(prodDtSplitTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCdList The collection of prodDtSplitTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_InScope(Collection<String> prodDtSplitTypeCdList) {
        doSetProdDtSplitTypeCd_InScope(prodDtSplitTypeCdList);
    }

    protected void doSetProdDtSplitTypeCd_InScope(Collection<String> prodDtSplitTypeCdList) {
        regINS(CK_INS, cTL(prodDtSplitTypeCdList), xgetCValueProdDtSplitTypeCd(), "PROD_DT_SPLIT_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCdList The collection of prodDtSplitTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_NotInScope(Collection<String> prodDtSplitTypeCdList) {
        doSetProdDtSplitTypeCd_NotInScope(prodDtSplitTypeCdList);
    }

    protected void doSetProdDtSplitTypeCd_NotInScope(Collection<String> prodDtSplitTypeCdList) {
        regINS(CK_NINS, cTL(prodDtSplitTypeCdList), xgetCValueProdDtSplitTypeCd(), "PROD_DT_SPLIT_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setProdDtSplitTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDtSplitTypeCd_LikeSearch(String prodDtSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDtSplitTypeCd), xgetCValueProdDtSplitTypeCd(), "PROD_DT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDtSplitTypeCd_NotLikeSearch(String prodDtSplitTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDtSplitTypeCd), xgetCValueProdDtSplitTypeCd(), "PROD_DT_SPLIT_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtSplitTypeCd The value of prodDtSplitTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtSplitTypeCd_PrefixSearch(String prodDtSplitTypeCd) {
        setProdDtSplitTypeCd_LikeSearch(prodDtSplitTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtSplitTypeCd_IsNull() { regProdDtSplitTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtSplitTypeCd_IsNullOrEmpty() { regProdDtSplitTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtSplitTypeCd_IsNotNull() { regProdDtSplitTypeCd(CK_ISNN, DOBJ); }

    protected void regProdDtSplitTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtSplitTypeCd(), "PROD_DT_SPLIT_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProdDtSplitTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_Equal(String lotUnmatchTypeCd) {
        doSetLotUnmatchTypeCd_Equal(fRES(lotUnmatchTypeCd));
    }

    protected void doSetLotUnmatchTypeCd_Equal(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_EQ, lotUnmatchTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_NotEqual(String lotUnmatchTypeCd) {
        doSetLotUnmatchTypeCd_NotEqual(fRES(lotUnmatchTypeCd));
    }

    protected void doSetLotUnmatchTypeCd_NotEqual(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_NES, lotUnmatchTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_GreaterThan(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_GT, fRES(lotUnmatchTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_LessThan(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_LT, fRES(lotUnmatchTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_GreaterEqual(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_GE, fRES(lotUnmatchTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_LessEqual(String lotUnmatchTypeCd) {
        regLotUnmatchTypeCd(CK_LE, fRES(lotUnmatchTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCdList The collection of lotUnmatchTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_InScope(Collection<String> lotUnmatchTypeCdList) {
        doSetLotUnmatchTypeCd_InScope(lotUnmatchTypeCdList);
    }

    protected void doSetLotUnmatchTypeCd_InScope(Collection<String> lotUnmatchTypeCdList) {
        regINS(CK_INS, cTL(lotUnmatchTypeCdList), xgetCValueLotUnmatchTypeCd(), "LOT_UNMATCH_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCdList The collection of lotUnmatchTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_NotInScope(Collection<String> lotUnmatchTypeCdList) {
        doSetLotUnmatchTypeCd_NotInScope(lotUnmatchTypeCdList);
    }

    protected void doSetLotUnmatchTypeCd_NotInScope(Collection<String> lotUnmatchTypeCdList) {
        regINS(CK_NINS, cTL(lotUnmatchTypeCdList), xgetCValueLotUnmatchTypeCd(), "LOT_UNMATCH_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLotUnmatchTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLotUnmatchTypeCd_LikeSearch(String lotUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lotUnmatchTypeCd), xgetCValueLotUnmatchTypeCd(), "LOT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLotUnmatchTypeCd_NotLikeSearch(String lotUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lotUnmatchTypeCd), xgetCValueLotUnmatchTypeCd(), "LOT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param lotUnmatchTypeCd The value of lotUnmatchTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLotUnmatchTypeCd_PrefixSearch(String lotUnmatchTypeCd) {
        setLotUnmatchTypeCd_LikeSearch(lotUnmatchTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotUnmatchTypeCd_IsNull() { regLotUnmatchTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotUnmatchTypeCd_IsNullOrEmpty() { regLotUnmatchTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLotUnmatchTypeCd_IsNotNull() { regLotUnmatchTypeCd(CK_ISNN, DOBJ); }

    protected void regLotUnmatchTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLotUnmatchTypeCd(), "LOT_UNMATCH_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLotUnmatchTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_Equal(String limitDtUnmatchTypeCd) {
        doSetLimitDtUnmatchTypeCd_Equal(fRES(limitDtUnmatchTypeCd));
    }

    protected void doSetLimitDtUnmatchTypeCd_Equal(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_EQ, limitDtUnmatchTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_NotEqual(String limitDtUnmatchTypeCd) {
        doSetLimitDtUnmatchTypeCd_NotEqual(fRES(limitDtUnmatchTypeCd));
    }

    protected void doSetLimitDtUnmatchTypeCd_NotEqual(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_NES, limitDtUnmatchTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_GreaterThan(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_GT, fRES(limitDtUnmatchTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_LessThan(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_LT, fRES(limitDtUnmatchTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_GreaterEqual(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_GE, fRES(limitDtUnmatchTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_LessEqual(String limitDtUnmatchTypeCd) {
        regLimitDtUnmatchTypeCd(CK_LE, fRES(limitDtUnmatchTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCdList The collection of limitDtUnmatchTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_InScope(Collection<String> limitDtUnmatchTypeCdList) {
        doSetLimitDtUnmatchTypeCd_InScope(limitDtUnmatchTypeCdList);
    }

    protected void doSetLimitDtUnmatchTypeCd_InScope(Collection<String> limitDtUnmatchTypeCdList) {
        regINS(CK_INS, cTL(limitDtUnmatchTypeCdList), xgetCValueLimitDtUnmatchTypeCd(), "LIMIT_DT_UNMATCH_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCdList The collection of limitDtUnmatchTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_NotInScope(Collection<String> limitDtUnmatchTypeCdList) {
        doSetLimitDtUnmatchTypeCd_NotInScope(limitDtUnmatchTypeCdList);
    }

    protected void doSetLimitDtUnmatchTypeCd_NotInScope(Collection<String> limitDtUnmatchTypeCdList) {
        regINS(CK_NINS, cTL(limitDtUnmatchTypeCdList), xgetCValueLimitDtUnmatchTypeCd(), "LIMIT_DT_UNMATCH_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLimitDtUnmatchTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLimitDtUnmatchTypeCd_LikeSearch(String limitDtUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(limitDtUnmatchTypeCd), xgetCValueLimitDtUnmatchTypeCd(), "LIMIT_DT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLimitDtUnmatchTypeCd_NotLikeSearch(String limitDtUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(limitDtUnmatchTypeCd), xgetCValueLimitDtUnmatchTypeCd(), "LIMIT_DT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param limitDtUnmatchTypeCd The value of limitDtUnmatchTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLimitDtUnmatchTypeCd_PrefixSearch(String limitDtUnmatchTypeCd) {
        setLimitDtUnmatchTypeCd_LikeSearch(limitDtUnmatchTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtUnmatchTypeCd_IsNull() { regLimitDtUnmatchTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtUnmatchTypeCd_IsNullOrEmpty() { regLimitDtUnmatchTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setLimitDtUnmatchTypeCd_IsNotNull() { regLimitDtUnmatchTypeCd(CK_ISNN, DOBJ); }

    protected void regLimitDtUnmatchTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLimitDtUnmatchTypeCd(), "LIMIT_DT_UNMATCH_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueLimitDtUnmatchTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_Equal(String prodDtUnmatchTypeCd) {
        doSetProdDtUnmatchTypeCd_Equal(fRES(prodDtUnmatchTypeCd));
    }

    protected void doSetProdDtUnmatchTypeCd_Equal(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_EQ, prodDtUnmatchTypeCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_NotEqual(String prodDtUnmatchTypeCd) {
        doSetProdDtUnmatchTypeCd_NotEqual(fRES(prodDtUnmatchTypeCd));
    }

    protected void doSetProdDtUnmatchTypeCd_NotEqual(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_NES, prodDtUnmatchTypeCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_GreaterThan(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_GT, fRES(prodDtUnmatchTypeCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_LessThan(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_LT, fRES(prodDtUnmatchTypeCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_GreaterEqual(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_GE, fRES(prodDtUnmatchTypeCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_LessEqual(String prodDtUnmatchTypeCd) {
        regProdDtUnmatchTypeCd(CK_LE, fRES(prodDtUnmatchTypeCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCdList The collection of prodDtUnmatchTypeCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_InScope(Collection<String> prodDtUnmatchTypeCdList) {
        doSetProdDtUnmatchTypeCd_InScope(prodDtUnmatchTypeCdList);
    }

    protected void doSetProdDtUnmatchTypeCd_InScope(Collection<String> prodDtUnmatchTypeCdList) {
        regINS(CK_INS, cTL(prodDtUnmatchTypeCdList), xgetCValueProdDtUnmatchTypeCd(), "PROD_DT_UNMATCH_TYPE_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCdList The collection of prodDtUnmatchTypeCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_NotInScope(Collection<String> prodDtUnmatchTypeCdList) {
        doSetProdDtUnmatchTypeCd_NotInScope(prodDtUnmatchTypeCdList);
    }

    protected void doSetProdDtUnmatchTypeCd_NotInScope(Collection<String> prodDtUnmatchTypeCdList) {
        regINS(CK_NINS, cTL(prodDtUnmatchTypeCdList), xgetCValueProdDtUnmatchTypeCd(), "PROD_DT_UNMATCH_TYPE_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setProdDtUnmatchTypeCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setProdDtUnmatchTypeCd_LikeSearch(String prodDtUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(prodDtUnmatchTypeCd), xgetCValueProdDtUnmatchTypeCd(), "PROD_DT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setProdDtUnmatchTypeCd_NotLikeSearch(String prodDtUnmatchTypeCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(prodDtUnmatchTypeCd), xgetCValueProdDtUnmatchTypeCd(), "PROD_DT_UNMATCH_TYPE_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     * @param prodDtUnmatchTypeCd The value of prodDtUnmatchTypeCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setProdDtUnmatchTypeCd_PrefixSearch(String prodDtUnmatchTypeCd) {
        setProdDtUnmatchTypeCd_LikeSearch(prodDtUnmatchTypeCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtUnmatchTypeCd_IsNull() { regProdDtUnmatchTypeCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtUnmatchTypeCd_IsNullOrEmpty() { regProdDtUnmatchTypeCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
     */
    public void setProdDtUnmatchTypeCd_IsNotNull() { regProdDtUnmatchTypeCd(CK_ISNN, DOBJ); }

    protected void regProdDtUnmatchTypeCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueProdDtUnmatchTypeCd(), "PROD_DT_UNMATCH_TYPE_CD"); }
    protected abstract ConditionValue xgetCValueProdDtUnmatchTypeCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_Equal(String uniCustomerCd) {
        doSetUniCustomerCd_Equal(fRES(uniCustomerCd));
    }

    protected void doSetUniCustomerCd_Equal(String uniCustomerCd) {
        regUniCustomerCd(CK_EQ, uniCustomerCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_NotEqual(String uniCustomerCd) {
        doSetUniCustomerCd_NotEqual(fRES(uniCustomerCd));
    }

    protected void doSetUniCustomerCd_NotEqual(String uniCustomerCd) {
        regUniCustomerCd(CK_NES, uniCustomerCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_GreaterThan(String uniCustomerCd) {
        regUniCustomerCd(CK_GT, fRES(uniCustomerCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_LessThan(String uniCustomerCd) {
        regUniCustomerCd(CK_LT, fRES(uniCustomerCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_GreaterEqual(String uniCustomerCd) {
        regUniCustomerCd(CK_GE, fRES(uniCustomerCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_LessEqual(String uniCustomerCd) {
        regUniCustomerCd(CK_LE, fRES(uniCustomerCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCdList The collection of uniCustomerCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_InScope(Collection<String> uniCustomerCdList) {
        doSetUniCustomerCd_InScope(uniCustomerCdList);
    }

    protected void doSetUniCustomerCd_InScope(Collection<String> uniCustomerCdList) {
        regINS(CK_INS, cTL(uniCustomerCdList), xgetCValueUniCustomerCd(), "UNI_CUSTOMER_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCdList The collection of uniCustomerCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_NotInScope(Collection<String> uniCustomerCdList) {
        doSetUniCustomerCd_NotInScope(uniCustomerCdList);
    }

    protected void doSetUniCustomerCd_NotInScope(Collection<String> uniCustomerCdList) {
        regINS(CK_NINS, cTL(uniCustomerCdList), xgetCValueUniCustomerCd(), "UNI_CUSTOMER_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setUniCustomerCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param uniCustomerCd The value of uniCustomerCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setUniCustomerCd_LikeSearch(String uniCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(uniCustomerCd), xgetCValueUniCustomerCd(), "UNI_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setUniCustomerCd_NotLikeSearch(String uniCustomerCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(uniCustomerCd), xgetCValueUniCustomerCd(), "UNI_CUSTOMER_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     * @param uniCustomerCd The value of uniCustomerCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setUniCustomerCd_PrefixSearch(String uniCustomerCd) {
        setUniCustomerCd_LikeSearch(uniCustomerCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setUniCustomerCd_IsNull() { regUniCustomerCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setUniCustomerCd_IsNullOrEmpty() { regUniCustomerCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * UNI_CUSTOMER_CD: {VARCHAR(30)}
     */
    public void setUniCustomerCd_IsNotNull() { regUniCustomerCd(CK_ISNN, DOBJ); }

    protected void regUniCustomerCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueUniCustomerCd(), "UNI_CUSTOMER_CD"); }
    protected abstract ConditionValue xgetCValueUniCustomerCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlg The value of delFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_Equal(String delFlg) {
        doSetDelFlg_Equal(fRES(delFlg));
    }

    /**
     * Equal(=). As DelFlg. And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
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

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
     * @param delFlgList The collection of delFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope(Collection<String> delFlgList) {
        doSetDelFlg_InScope(delFlgList);
    }

    /**
     * InScope {in ('a', 'b')}. As DelFlg. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg} <br>
     * 削除フラグ
     * @param cdefList The list of classification definition (as ENUM type). (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setDelFlg_InScope_AsDelFlg(Collection<CDef.DelFlg> cdefList) {
        doSetDelFlg_InScope(cTStrL(cdefList));
    }

    protected void doSetDelFlg_InScope(Collection<String> delFlgList) {
        regINS(CK_INS, cTL(delFlgList), xgetCValueDelFlg(), "DEL_FLG");
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
    public HpSLCFunction<MCustomerCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MCustomerCB.class);
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
    public HpSLCFunction<MCustomerCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MCustomerCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MCustomerCB&gt;() {
     *     public void query(MCustomerCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MCustomerCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MCustomerCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MCustomerCQ sq);

    protected MCustomerCB xcreateScalarConditionCB() {
        MCustomerCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MCustomerCB xcreateScalarConditionPartitionByCB() {
        MCustomerCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MCustomerCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "CUSTOMER_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MCustomerCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MCustomerCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MCustomerCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "CUSTOMER_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MCustomerCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MCustomerCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerCB cb = new MCustomerCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MCustomerCQ sq);

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
    protected MCustomerCB newMyCB() {
        return new MCustomerCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MCustomerCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
