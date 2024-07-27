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
 * The abstract condition-query of m_sales_org.
 * @author DBFlute(AutoGenerator)
 */
public abstract class AbstractBsMSalesOrgCQ extends AbstractConditionQuery {

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public AbstractBsMSalesOrgCQ(ConditionQuery referrerQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
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
        return "m_sales_org";
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Equal(=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterThan(Long salesOrgId) {
        regSalesOrgId(CK_GT, salesOrgId);
    }

    /**
     * LessThan(&lt;). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessThan. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessThan(Long salesOrgId) {
        regSalesOrgId(CK_LT, salesOrgId);
    }

    /**
     * GreaterEqual(&gt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as greaterEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_GreaterEqual(Long salesOrgId) {
        regSalesOrgId(CK_GE, salesOrgId);
    }

    /**
     * LessEqual(&lt;=). And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param salesOrgId The value of salesOrgId as lessEqual. (basically NotNull: error as default, or no condition as option)
     */
    public void setSalesOrgId_LessEqual(Long salesOrgId) {
        regSalesOrgId(CK_LE, salesOrgId);
    }

    /**
     * RangeOf with various options. (versatile) <br>
     * {(default) minNumber &lt;= column &lt;= maxNumber} <br>
     * And NullIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param minNumber The min number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param maxNumber The max number of salesOrgId. (basically NotNull: if op.allowOneSide(), null allowed)
     * @param rangeOfOption The option of range-of. (NotNull)
     */
    public void setSalesOrgId_RangeOf(Long minNumber, Long maxNumber, RangeOfOption rangeOfOption) {
        regROO(minNumber, maxNumber, xgetCValueSalesOrgId(), "SALES_ORG_ID", rangeOfOption);
    }

    /**
     * InScope {in (1, 2)}. And NullIgnored, NullElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
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
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     * @param salesOrgIdList The collection of salesOrgId as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        doSetSalesOrgId_NotInScope(salesOrgIdList);
    }

    protected void doSetSalesOrgId_NotInScope(Collection<Long> salesOrgIdList) {
        regINS(CK_NINS, cTL(salesOrgIdList), xgetCValueSalesOrgId(), "SALES_ORG_ID");
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_ID from m_base_sales_org where ...)} <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMBaseSalesOrgList</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MBaseSalesOrgList for 'exists'. (NotNull)
     */
    public void existsMBaseSalesOrgList(SubQuery<MBaseSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_MBaseSalesOrgList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mBaseSalesOrgList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_MCarrierDecisionList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCarrierDecisionList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_MCustomerPickingList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_MDepositProductList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mDepositProductList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SERV_SALES_ORG_ID from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsMKoguchiDeliveryList</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of MKoguchiDeliveryList for 'exists'. (NotNull)
     */
    public void existsMKoguchiDeliveryList(SubQuery<MKoguchiDeliveryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_MKoguchiDeliveryList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SERV_SALES_ORG_ID", pp, "mKoguchiDeliveryList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_ExistsReferrer_TInventoryBList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "tInventoryBList");
    }
    public abstract String keepSalesOrgId_ExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_ID from m_base_sales_org where ...)} <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMBaseSalesOrgList</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_MBaseSalesOrgList for 'not exists'. (NotNull)
     */
    public void notExistsMBaseSalesOrgList(SubQuery<MBaseSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_MBaseSalesOrgList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mBaseSalesOrgList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_ID from m_carrier_decision where ...)} <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCarrierDecisionList</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     decisionCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_MCarrierDecisionList for 'not exists'. (NotNull)
     */
    public void notExistsMCarrierDecisionList(SubQuery<MCarrierDecisionCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_MCarrierDecisionList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCarrierDecisionList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_ID from m_customer_picking where ...)} <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMCustomerPickingList</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     pickingCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_MCustomerPickingList for 'not exists'. (NotNull)
     */
    public void notExistsMCustomerPickingList(SubQuery<MCustomerPickingCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_MCustomerPickingList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCustomerPickingList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_ID from m_deposit_product where ...)} <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMDepositProductList</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     productCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_MDepositProductList for 'not exists'. (NotNull)
     */
    public void notExistsMDepositProductList(SubQuery<MDepositProductCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_MDepositProductList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mDepositProductList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_MDepositProductList(MDepositProductCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SERV_SALES_ORG_ID from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsMKoguchiDeliveryList</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_MKoguchiDeliveryList for 'not exists'. (NotNull)
     */
    public void notExistsMKoguchiDeliveryList(SubQuery<MKoguchiDeliveryCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_MKoguchiDeliveryList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SERV_SALES_ORG_ID", pp, "mKoguchiDeliveryList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_ID from t_inventory_b where ...)} <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTInventoryBList</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     bCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgId_NotExistsReferrer_TInventoryBList for 'not exists'. (NotNull)
     */
    public void notExistsTInventoryBList(SubQuery<TInventoryBCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgId_NotExistsReferrer_TInventoryBList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "tInventoryBList");
    }
    public abstract String keepSalesOrgId_NotExistsReferrer_TInventoryBList(TInventoryBCQ sq);

    public void xsderiveMBaseSalesOrgList(String fn, SubQuery<MBaseSalesOrgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mBaseSalesOrgList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);

    public void xsderiveMCarrierDecisionList(String fn, SubQuery<MCarrierDecisionCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCarrierDecisionList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);

    public void xsderiveMCustomerPickingList(String fn, SubQuery<MCustomerPickingCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MCustomerPickingCB cb = new MCustomerPickingCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_MCustomerPickingList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mCustomerPickingList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);

    public void xsderiveMDepositProductList(String fn, SubQuery<MDepositProductCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MDepositProductCB cb = new MDepositProductCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_MDepositProductList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "mDepositProductList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_MDepositProductList(MDepositProductCQ sq);

    public void xsderiveMKoguchiDeliveryList(String fn, SubQuery<MKoguchiDeliveryCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SERV_SALES_ORG_ID", pp, "mKoguchiDeliveryList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);

    public void xsderiveTInventoryBList(String fn, SubQuery<TInventoryBCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TInventoryBCB cb = new TInventoryBCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgId_SpecifyDerivedReferrer_TInventoryBList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", pp, "tInventoryBList", al, op);
    }
    public abstract String keepSalesOrgId_SpecifyDerivedReferrer_TInventoryBList(TInventoryBCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_base_sales_org where ...)} <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMBaseSalesOrgList()</span>.<span style="color: #CC4747">max</span>(orgCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     orgCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     orgCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MBaseSalesOrgCB> derivedMBaseSalesOrgList() {
        return xcreateQDRFunctionMBaseSalesOrgList();
    }
    protected HpQDRFunction<MBaseSalesOrgCB> xcreateQDRFunctionMBaseSalesOrgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMBaseSalesOrgList(fn, sq, rd, vl, op));
    }
    public void xqderiveMBaseSalesOrgList(String fn, SubQuery<MBaseSalesOrgCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MBaseSalesOrgCB cb = new MBaseSalesOrgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", sqpp, "mBaseSalesOrgList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgList(MBaseSalesOrgCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MBaseSalesOrgListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_carrier_decision where ...)} <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", sqpp, "mCarrierDecisionList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionList(MCarrierDecisionCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MCarrierDecisionListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_customer_picking where ...)} <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", sqpp, "mCustomerPickingList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingList(MCustomerPickingCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MCustomerPickingListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_deposit_product where ...)} <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_MDepositProductList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_MDepositProductListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", sqpp, "mDepositProductList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MDepositProductList(MDepositProductCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MDepositProductListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from m_koguchi_delivery where ...)} <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedMKoguchiDeliveryList()</span>.<span style="color: #CC4747">max</span>(deliveryCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     deliveryCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     deliveryCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<MKoguchiDeliveryCB> derivedMKoguchiDeliveryList() {
        return xcreateQDRFunctionMKoguchiDeliveryList();
    }
    protected HpQDRFunction<MKoguchiDeliveryCB> xcreateQDRFunctionMKoguchiDeliveryList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveMKoguchiDeliveryList(fn, sq, rd, vl, op));
    }
    public void xqderiveMKoguchiDeliveryList(String fn, SubQuery<MKoguchiDeliveryCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SERV_SALES_ORG_ID", sqpp, "mKoguchiDeliveryList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryList(MKoguchiDeliveryCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_MKoguchiDeliveryListParameter(Object vl);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_inventory_b where ...)} <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBAsOne'.
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
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgId_QueryDerivedReferrer_TInventoryBList(cb.query()); String prpp = keepSalesOrgId_QueryDerivedReferrer_TInventoryBListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_ID", "SALES_ORG_ID", sqpp, "tInventoryBList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgId_QueryDerivedReferrer_TInventoryBList(TInventoryBCQ sq);
    public abstract String keepSalesOrgId_QueryDerivedReferrer_TInventoryBListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSalesOrgId_IsNull() { regSalesOrgId(CK_ISN, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_ID: {PK, ID, NotNull, BIGINT(19)}
     */
    public void setSalesOrgId_IsNotNull() { regSalesOrgId(CK_ISNN, DOBJ); }

    protected void regSalesOrgId(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgId(), "SALES_ORG_ID"); }
    protected abstract ConditionValue xgetCValueSalesOrgId();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
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
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
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
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterThan(String salesOrgCd) {
        regSalesOrgCd(CK_GT, fRES(salesOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessThan(String salesOrgCd) {
        regSalesOrgCd(CK_LT, fRES(salesOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_GreaterEqual(String salesOrgCd) {
        regSalesOrgCd(CK_GE, fRES(salesOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_LessEqual(String salesOrgCd) {
        regSalesOrgCd(CK_LE, fRES(salesOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
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
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
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
     * SALES_ORG_CD: {UQ, VARCHAR(30)} <br>
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
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSalesOrgCd_NotLikeSearch(String salesOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(salesOrgCd), xgetCValueSalesOrgCd(), "SALES_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     * @param salesOrgCd The value of salesOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSalesOrgCd_PrefixSearch(String salesOrgCd) {
        setSalesOrgCd_LikeSearch(salesOrgCd, xcLSOPPre());
    }

    /**
     * Set up ExistsReferrer (correlated sub-query). <br>
     * {exists (select SALES_ORG_CD from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">existsTShippingInstHBySalesOrgList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of TShippingInstHBySalesOrgList for 'exists'. (NotNull)
     */
    public void existsTShippingInstHBySalesOrgList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList(cb.query());
        registerExistsReferrer(cb.query(), "SALES_ORG_CD", "SALES_ORG_CD", pp, "tShippingInstHBySalesOrgList");
    }
    public abstract String keepSalesOrgCd_ExistsReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq);

    /**
     * Set up NotExistsReferrer (correlated sub-query). <br>
     * {not exists (select SALES_ORG_CD from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">notExistsTShippingInstHBySalesOrgList</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.query().set...
     * });
     * </pre>
     * @param subCBLambda The callback for sub-query of SalesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList for 'not exists'. (NotNull)
     */
    public void notExistsTShippingInstHBySalesOrgList(SubQuery<TShippingInstHCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForExistsReferrer(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepSalesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList(cb.query());
        registerNotExistsReferrer(cb.query(), "SALES_ORG_CD", "SALES_ORG_CD", pp, "tShippingInstHBySalesOrgList");
    }
    public abstract String keepSalesOrgCd_NotExistsReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq);

    public void xsderiveTShippingInstHBySalesOrgList(String fn, SubQuery<TShippingInstHCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSalesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList(cb.query());
        registerSpecifyDerivedReferrer(fn, cb.query(), "SALES_ORG_CD", "SALES_ORG_CD", pp, "tShippingInstHBySalesOrgList", al, op);
    }
    public abstract String keepSalesOrgCd_SpecifyDerivedReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq);

    /**
     * Prepare for (Query)DerivedReferrer (correlated sub-query). <br>
     * {FOO &lt;= (select max(BAR) from t_shipping_inst_h where ...)} <br>
     * t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHAsOne'.
     * <pre>
     * cb.query().<span style="color: #CC4747">derivedTShippingInstHBySalesOrgList()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     hCB.specify().<span style="color: #CC4747">columnFoo...</span> <span style="color: #3F7E5E">// derived column by function</span>
     *     hCB.query().setBar... <span style="color: #3F7E5E">// referrer condition</span>
     * }).<span style="color: #CC4747">greaterEqual</span>(123); <span style="color: #3F7E5E">// condition to derived column</span>
     * </pre>
     * @return The object to set up a function for referrer table. (NotNull)
     */
    public HpQDRFunction<TShippingInstHCB> derivedTShippingInstHBySalesOrgList() {
        return xcreateQDRFunctionTShippingInstHBySalesOrgList();
    }
    protected HpQDRFunction<TShippingInstHCB> xcreateQDRFunctionTShippingInstHBySalesOrgList() {
        return xcQDRFunc((fn, sq, rd, vl, op) -> xqderiveTShippingInstHBySalesOrgList(fn, sq, rd, vl, op));
    }
    public void xqderiveTShippingInstHBySalesOrgList(String fn, SubQuery<TShippingInstHCB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        TShippingInstHCB cb = new TShippingInstHCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String sqpp = keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList(cb.query()); String prpp = keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgListParameter(vl);
        registerQueryDerivedReferrer(fn, cb.query(), "SALES_ORG_CD", "SALES_ORG_CD", sqpp, "tShippingInstHBySalesOrgList", rd, vl, prpp, op);
    }
    public abstract String keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgList(TShippingInstHCQ sq);
    public abstract String keepSalesOrgCd_QueryDerivedReferrer_TShippingInstHBySalesOrgListParameter(Object vl);

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNull() { regSalesOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNullOrEmpty() { regSalesOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SALES_ORG_CD: {UQ, VARCHAR(30)}
     */
    public void setSalesOrgCd_IsNotNull() { regSalesOrgCd(CK_ISNN, DOBJ); }

    protected void regSalesOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSalesOrgCd(), "SALES_ORG_CD"); }
    protected abstract ConditionValue xgetCValueSalesOrgCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_Equal(String purchaseOrgCd) {
        doSetPurchaseOrgCd_Equal(fRES(purchaseOrgCd));
    }

    protected void doSetPurchaseOrgCd_Equal(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_EQ, purchaseOrgCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_NotEqual(String purchaseOrgCd) {
        doSetPurchaseOrgCd_NotEqual(fRES(purchaseOrgCd));
    }

    protected void doSetPurchaseOrgCd_NotEqual(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_NES, purchaseOrgCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_GreaterThan(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_GT, fRES(purchaseOrgCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_LessThan(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_LT, fRES(purchaseOrgCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_GreaterEqual(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_GE, fRES(purchaseOrgCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_LessEqual(String purchaseOrgCd) {
        regPurchaseOrgCd(CK_LE, fRES(purchaseOrgCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCdList The collection of purchaseOrgCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_InScope(Collection<String> purchaseOrgCdList) {
        doSetPurchaseOrgCd_InScope(purchaseOrgCdList);
    }

    protected void doSetPurchaseOrgCd_InScope(Collection<String> purchaseOrgCdList) {
        regINS(CK_INS, cTL(purchaseOrgCdList), xgetCValuePurchaseOrgCd(), "PURCHASE_ORG_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCdList The collection of purchaseOrgCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_NotInScope(Collection<String> purchaseOrgCdList) {
        doSetPurchaseOrgCd_NotInScope(purchaseOrgCdList);
    }

    protected void doSetPurchaseOrgCd_NotInScope(Collection<String> purchaseOrgCdList) {
        regINS(CK_NINS, cTL(purchaseOrgCdList), xgetCValuePurchaseOrgCd(), "PURCHASE_ORG_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setPurchaseOrgCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param purchaseOrgCd The value of purchaseOrgCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPurchaseOrgCd_LikeSearch(String purchaseOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(purchaseOrgCd), xgetCValuePurchaseOrgCd(), "PURCHASE_ORG_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPurchaseOrgCd_NotLikeSearch(String purchaseOrgCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(purchaseOrgCd), xgetCValuePurchaseOrgCd(), "PURCHASE_ORG_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     * @param purchaseOrgCd The value of purchaseOrgCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPurchaseOrgCd_PrefixSearch(String purchaseOrgCd) {
        setPurchaseOrgCd_LikeSearch(purchaseOrgCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     */
    public void setPurchaseOrgCd_IsNull() { regPurchaseOrgCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     */
    public void setPurchaseOrgCd_IsNullOrEmpty() { regPurchaseOrgCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PURCHASE_ORG_CD: {VARCHAR(30)}
     */
    public void setPurchaseOrgCd_IsNotNull() { regPurchaseOrgCd(CK_ISNN, DOBJ); }

    protected void regPurchaseOrgCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePurchaseOrgCd(), "PURCHASE_ORG_CD"); }
    protected abstract ConditionValue xgetCValuePurchaseOrgCd();

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
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_Equal(String tenhanshaNm1) {
        doSetTenhanshaNm1_Equal(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_Equal(String tenhanshaNm1) {
        regTenhanshaNm1(CK_EQ, tenhanshaNm1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        doSetTenhanshaNm1_NotEqual(fRES(tenhanshaNm1));
    }

    protected void doSetTenhanshaNm1_NotEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_NES, tenhanshaNm1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GT, fRES(tenhanshaNm1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessThan(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LT, fRES(tenhanshaNm1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_GreaterEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_GE, fRES(tenhanshaNm1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_LessEqual(String tenhanshaNm1) {
        regTenhanshaNm1(CK_LE, fRES(tenhanshaNm1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_InScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_InScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_INS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1List The collection of tenhanshaNm1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        doSetTenhanshaNm1_NotInScope(tenhanshaNm1List);
    }

    protected void doSetTenhanshaNm1_NotInScope(Collection<String> tenhanshaNm1List) {
        regINS(CK_NINS, cTL(tenhanshaNm1List), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm1 The value of tenhanshaNm1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm1_LikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm1_NotLikeSearch(String tenhanshaNm1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm1), xgetCValueTenhanshaNm1(), "TENHANSHA_NM1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     * @param tenhanshaNm1 The value of tenhanshaNm1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm1_PrefixSearch(String tenhanshaNm1) {
        setTenhanshaNm1_LikeSearch(tenhanshaNm1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNull() { regTenhanshaNm1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNullOrEmpty() { regTenhanshaNm1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM1: {VARCHAR(60)}
     */
    public void setTenhanshaNm1_IsNotNull() { regTenhanshaNm1(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm1(), "TENHANSHA_NM1"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_Equal(String tenhanshaNm2) {
        doSetTenhanshaNm2_Equal(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_Equal(String tenhanshaNm2) {
        regTenhanshaNm2(CK_EQ, tenhanshaNm2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        doSetTenhanshaNm2_NotEqual(fRES(tenhanshaNm2));
    }

    protected void doSetTenhanshaNm2_NotEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_NES, tenhanshaNm2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GT, fRES(tenhanshaNm2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessThan(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LT, fRES(tenhanshaNm2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_GreaterEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_GE, fRES(tenhanshaNm2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_LessEqual(String tenhanshaNm2) {
        regTenhanshaNm2(CK_LE, fRES(tenhanshaNm2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_InScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_InScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_INS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2List The collection of tenhanshaNm2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        doSetTenhanshaNm2_NotInScope(tenhanshaNm2List);
    }

    protected void doSetTenhanshaNm2_NotInScope(Collection<String> tenhanshaNm2List) {
        regINS(CK_NINS, cTL(tenhanshaNm2List), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaNm2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaNm2 The value of tenhanshaNm2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaNm2_LikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaNm2_NotLikeSearch(String tenhanshaNm2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaNm2), xgetCValueTenhanshaNm2(), "TENHANSHA_NM2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     * @param tenhanshaNm2 The value of tenhanshaNm2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaNm2_PrefixSearch(String tenhanshaNm2) {
        setTenhanshaNm2_LikeSearch(tenhanshaNm2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNull() { regTenhanshaNm2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNullOrEmpty() { regTenhanshaNm2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_NM2: {VARCHAR(60)}
     */
    public void setTenhanshaNm2_IsNotNull() { regTenhanshaNm2(CK_ISNN, DOBJ); }

    protected void regTenhanshaNm2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaNm2(), "TENHANSHA_NM2"); }
    protected abstract ConditionValue xgetCValueTenhanshaNm2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_Equal(String tenhanshaZipCd) {
        doSetTenhanshaZipCd_Equal(fRES(tenhanshaZipCd));
    }

    protected void doSetTenhanshaZipCd_Equal(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_EQ, tenhanshaZipCd);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_NotEqual(String tenhanshaZipCd) {
        doSetTenhanshaZipCd_NotEqual(fRES(tenhanshaZipCd));
    }

    protected void doSetTenhanshaZipCd_NotEqual(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_NES, tenhanshaZipCd);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_GreaterThan(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_GT, fRES(tenhanshaZipCd));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_LessThan(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_LT, fRES(tenhanshaZipCd));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_GreaterEqual(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_GE, fRES(tenhanshaZipCd));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_LessEqual(String tenhanshaZipCd) {
        regTenhanshaZipCd(CK_LE, fRES(tenhanshaZipCd));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCdList The collection of tenhanshaZipCd as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_InScope(Collection<String> tenhanshaZipCdList) {
        doSetTenhanshaZipCd_InScope(tenhanshaZipCdList);
    }

    protected void doSetTenhanshaZipCd_InScope(Collection<String> tenhanshaZipCdList) {
        regINS(CK_INS, cTL(tenhanshaZipCdList), xgetCValueTenhanshaZipCd(), "TENHANSHA_ZIP_CD");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCdList The collection of tenhanshaZipCd as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_NotInScope(Collection<String> tenhanshaZipCdList) {
        doSetTenhanshaZipCd_NotInScope(tenhanshaZipCdList);
    }

    protected void doSetTenhanshaZipCd_NotInScope(Collection<String> tenhanshaZipCdList) {
        regINS(CK_NINS, cTL(tenhanshaZipCdList), xgetCValueTenhanshaZipCd(), "TENHANSHA_ZIP_CD");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaZipCd_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaZipCd The value of tenhanshaZipCd as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaZipCd_LikeSearch(String tenhanshaZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaZipCd), xgetCValueTenhanshaZipCd(), "TENHANSHA_ZIP_CD", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaZipCd_NotLikeSearch(String tenhanshaZipCd, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaZipCd), xgetCValueTenhanshaZipCd(), "TENHANSHA_ZIP_CD", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     * @param tenhanshaZipCd The value of tenhanshaZipCd as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaZipCd_PrefixSearch(String tenhanshaZipCd) {
        setTenhanshaZipCd_LikeSearch(tenhanshaZipCd, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     */
    public void setTenhanshaZipCd_IsNull() { regTenhanshaZipCd(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     */
    public void setTenhanshaZipCd_IsNullOrEmpty() { regTenhanshaZipCd(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ZIP_CD: {VARCHAR(30)}
     */
    public void setTenhanshaZipCd_IsNotNull() { regTenhanshaZipCd(CK_ISNN, DOBJ); }

    protected void regTenhanshaZipCd(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaZipCd(), "TENHANSHA_ZIP_CD"); }
    protected abstract ConditionValue xgetCValueTenhanshaZipCd();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_Equal(String tenhanshaPrefecture) {
        doSetTenhanshaPrefecture_Equal(fRES(tenhanshaPrefecture));
    }

    protected void doSetTenhanshaPrefecture_Equal(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_EQ, tenhanshaPrefecture);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_NotEqual(String tenhanshaPrefecture) {
        doSetTenhanshaPrefecture_NotEqual(fRES(tenhanshaPrefecture));
    }

    protected void doSetTenhanshaPrefecture_NotEqual(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_NES, tenhanshaPrefecture);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_GreaterThan(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_GT, fRES(tenhanshaPrefecture));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_LessThan(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_LT, fRES(tenhanshaPrefecture));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_GreaterEqual(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_GE, fRES(tenhanshaPrefecture));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_LessEqual(String tenhanshaPrefecture) {
        regTenhanshaPrefecture(CK_LE, fRES(tenhanshaPrefecture));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefectureList The collection of tenhanshaPrefecture as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_InScope(Collection<String> tenhanshaPrefectureList) {
        doSetTenhanshaPrefecture_InScope(tenhanshaPrefectureList);
    }

    protected void doSetTenhanshaPrefecture_InScope(Collection<String> tenhanshaPrefectureList) {
        regINS(CK_INS, cTL(tenhanshaPrefectureList), xgetCValueTenhanshaPrefecture(), "TENHANSHA_PREFECTURE");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefectureList The collection of tenhanshaPrefecture as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_NotInScope(Collection<String> tenhanshaPrefectureList) {
        doSetTenhanshaPrefecture_NotInScope(tenhanshaPrefectureList);
    }

    protected void doSetTenhanshaPrefecture_NotInScope(Collection<String> tenhanshaPrefectureList) {
        regINS(CK_NINS, cTL(tenhanshaPrefectureList), xgetCValueTenhanshaPrefecture(), "TENHANSHA_PREFECTURE");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaPrefecture_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaPrefecture_LikeSearch(String tenhanshaPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaPrefecture), xgetCValueTenhanshaPrefecture(), "TENHANSHA_PREFECTURE", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaPrefecture_NotLikeSearch(String tenhanshaPrefecture, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaPrefecture), xgetCValueTenhanshaPrefecture(), "TENHANSHA_PREFECTURE", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     * @param tenhanshaPrefecture The value of tenhanshaPrefecture as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaPrefecture_PrefixSearch(String tenhanshaPrefecture) {
        setTenhanshaPrefecture_LikeSearch(tenhanshaPrefecture, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     */
    public void setTenhanshaPrefecture_IsNull() { regTenhanshaPrefecture(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     */
    public void setTenhanshaPrefecture_IsNullOrEmpty() { regTenhanshaPrefecture(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_PREFECTURE: {VARCHAR(60)}
     */
    public void setTenhanshaPrefecture_IsNotNull() { regTenhanshaPrefecture(CK_ISNN, DOBJ); }

    protected void regTenhanshaPrefecture(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaPrefecture(), "TENHANSHA_PREFECTURE"); }
    protected abstract ConditionValue xgetCValueTenhanshaPrefecture();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_Equal(String tenhanshaAddress1) {
        doSetTenhanshaAddress1_Equal(fRES(tenhanshaAddress1));
    }

    protected void doSetTenhanshaAddress1_Equal(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_EQ, tenhanshaAddress1);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_NotEqual(String tenhanshaAddress1) {
        doSetTenhanshaAddress1_NotEqual(fRES(tenhanshaAddress1));
    }

    protected void doSetTenhanshaAddress1_NotEqual(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_NES, tenhanshaAddress1);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_GreaterThan(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_GT, fRES(tenhanshaAddress1));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_LessThan(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_LT, fRES(tenhanshaAddress1));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_GreaterEqual(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_GE, fRES(tenhanshaAddress1));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_LessEqual(String tenhanshaAddress1) {
        regTenhanshaAddress1(CK_LE, fRES(tenhanshaAddress1));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1List The collection of tenhanshaAddress1 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_InScope(Collection<String> tenhanshaAddress1List) {
        doSetTenhanshaAddress1_InScope(tenhanshaAddress1List);
    }

    protected void doSetTenhanshaAddress1_InScope(Collection<String> tenhanshaAddress1List) {
        regINS(CK_INS, cTL(tenhanshaAddress1List), xgetCValueTenhanshaAddress1(), "TENHANSHA_ADDRESS1");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1List The collection of tenhanshaAddress1 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_NotInScope(Collection<String> tenhanshaAddress1List) {
        doSetTenhanshaAddress1_NotInScope(tenhanshaAddress1List);
    }

    protected void doSetTenhanshaAddress1_NotInScope(Collection<String> tenhanshaAddress1List) {
        regINS(CK_NINS, cTL(tenhanshaAddress1List), xgetCValueTenhanshaAddress1(), "TENHANSHA_ADDRESS1");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaAddress1_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaAddress1_LikeSearch(String tenhanshaAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaAddress1), xgetCValueTenhanshaAddress1(), "TENHANSHA_ADDRESS1", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaAddress1_NotLikeSearch(String tenhanshaAddress1, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaAddress1), xgetCValueTenhanshaAddress1(), "TENHANSHA_ADDRESS1", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     * @param tenhanshaAddress1 The value of tenhanshaAddress1 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress1_PrefixSearch(String tenhanshaAddress1) {
        setTenhanshaAddress1_LikeSearch(tenhanshaAddress1, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     */
    public void setTenhanshaAddress1_IsNull() { regTenhanshaAddress1(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     */
    public void setTenhanshaAddress1_IsNullOrEmpty() { regTenhanshaAddress1(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS1: {VARCHAR(60)}
     */
    public void setTenhanshaAddress1_IsNotNull() { regTenhanshaAddress1(CK_ISNN, DOBJ); }

    protected void regTenhanshaAddress1(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaAddress1(), "TENHANSHA_ADDRESS1"); }
    protected abstract ConditionValue xgetCValueTenhanshaAddress1();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_Equal(String tenhanshaAddress2) {
        doSetTenhanshaAddress2_Equal(fRES(tenhanshaAddress2));
    }

    protected void doSetTenhanshaAddress2_Equal(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_EQ, tenhanshaAddress2);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_NotEqual(String tenhanshaAddress2) {
        doSetTenhanshaAddress2_NotEqual(fRES(tenhanshaAddress2));
    }

    protected void doSetTenhanshaAddress2_NotEqual(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_NES, tenhanshaAddress2);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_GreaterThan(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_GT, fRES(tenhanshaAddress2));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_LessThan(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_LT, fRES(tenhanshaAddress2));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_GreaterEqual(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_GE, fRES(tenhanshaAddress2));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_LessEqual(String tenhanshaAddress2) {
        regTenhanshaAddress2(CK_LE, fRES(tenhanshaAddress2));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2List The collection of tenhanshaAddress2 as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_InScope(Collection<String> tenhanshaAddress2List) {
        doSetTenhanshaAddress2_InScope(tenhanshaAddress2List);
    }

    protected void doSetTenhanshaAddress2_InScope(Collection<String> tenhanshaAddress2List) {
        regINS(CK_INS, cTL(tenhanshaAddress2List), xgetCValueTenhanshaAddress2(), "TENHANSHA_ADDRESS2");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2List The collection of tenhanshaAddress2 as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_NotInScope(Collection<String> tenhanshaAddress2List) {
        doSetTenhanshaAddress2_NotInScope(tenhanshaAddress2List);
    }

    protected void doSetTenhanshaAddress2_NotInScope(Collection<String> tenhanshaAddress2List) {
        regINS(CK_NINS, cTL(tenhanshaAddress2List), xgetCValueTenhanshaAddress2(), "TENHANSHA_ADDRESS2");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)} <br>
     * <pre>e.g. setTenhanshaAddress2_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaAddress2_LikeSearch(String tenhanshaAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaAddress2), xgetCValueTenhanshaAddress2(), "TENHANSHA_ADDRESS2", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaAddress2_NotLikeSearch(String tenhanshaAddress2, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaAddress2), xgetCValueTenhanshaAddress2(), "TENHANSHA_ADDRESS2", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     * @param tenhanshaAddress2 The value of tenhanshaAddress2 as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaAddress2_PrefixSearch(String tenhanshaAddress2) {
        setTenhanshaAddress2_LikeSearch(tenhanshaAddress2, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     */
    public void setTenhanshaAddress2_IsNull() { regTenhanshaAddress2(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     */
    public void setTenhanshaAddress2_IsNullOrEmpty() { regTenhanshaAddress2(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_ADDRESS2: {VARCHAR(60)}
     */
    public void setTenhanshaAddress2_IsNotNull() { regTenhanshaAddress2(CK_ISNN, DOBJ); }

    protected void regTenhanshaAddress2(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaAddress2(), "TENHANSHA_ADDRESS2"); }
    protected abstract ConditionValue xgetCValueTenhanshaAddress2();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_Equal(String tenhanshaTelNo) {
        doSetTenhanshaTelNo_Equal(fRES(tenhanshaTelNo));
    }

    protected void doSetTenhanshaTelNo_Equal(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_EQ, tenhanshaTelNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_NotEqual(String tenhanshaTelNo) {
        doSetTenhanshaTelNo_NotEqual(fRES(tenhanshaTelNo));
    }

    protected void doSetTenhanshaTelNo_NotEqual(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_NES, tenhanshaTelNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_GreaterThan(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_GT, fRES(tenhanshaTelNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_LessThan(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_LT, fRES(tenhanshaTelNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_GreaterEqual(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_GE, fRES(tenhanshaTelNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_LessEqual(String tenhanshaTelNo) {
        regTenhanshaTelNo(CK_LE, fRES(tenhanshaTelNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNoList The collection of tenhanshaTelNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_InScope(Collection<String> tenhanshaTelNoList) {
        doSetTenhanshaTelNo_InScope(tenhanshaTelNoList);
    }

    protected void doSetTenhanshaTelNo_InScope(Collection<String> tenhanshaTelNoList) {
        regINS(CK_INS, cTL(tenhanshaTelNoList), xgetCValueTenhanshaTelNo(), "TENHANSHA_TEL_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNoList The collection of tenhanshaTelNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_NotInScope(Collection<String> tenhanshaTelNoList) {
        doSetTenhanshaTelNo_NotInScope(tenhanshaTelNoList);
    }

    protected void doSetTenhanshaTelNo_NotInScope(Collection<String> tenhanshaTelNoList) {
        regINS(CK_NINS, cTL(tenhanshaTelNoList), xgetCValueTenhanshaTelNo(), "TENHANSHA_TEL_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaTelNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaTelNo The value of tenhanshaTelNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaTelNo_LikeSearch(String tenhanshaTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaTelNo), xgetCValueTenhanshaTelNo(), "TENHANSHA_TEL_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaTelNo_NotLikeSearch(String tenhanshaTelNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaTelNo), xgetCValueTenhanshaTelNo(), "TENHANSHA_TEL_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     * @param tenhanshaTelNo The value of tenhanshaTelNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaTelNo_PrefixSearch(String tenhanshaTelNo) {
        setTenhanshaTelNo_LikeSearch(tenhanshaTelNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     */
    public void setTenhanshaTelNo_IsNull() { regTenhanshaTelNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     */
    public void setTenhanshaTelNo_IsNullOrEmpty() { regTenhanshaTelNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_TEL_NO: {VARCHAR(30)}
     */
    public void setTenhanshaTelNo_IsNotNull() { regTenhanshaTelNo(CK_ISNN, DOBJ); }

    protected void regTenhanshaTelNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaTelNo(), "TENHANSHA_TEL_NO"); }
    protected abstract ConditionValue xgetCValueTenhanshaTelNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_Equal(String tenhanshaFaxNo) {
        doSetTenhanshaFaxNo_Equal(fRES(tenhanshaFaxNo));
    }

    protected void doSetTenhanshaFaxNo_Equal(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_EQ, tenhanshaFaxNo);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_NotEqual(String tenhanshaFaxNo) {
        doSetTenhanshaFaxNo_NotEqual(fRES(tenhanshaFaxNo));
    }

    protected void doSetTenhanshaFaxNo_NotEqual(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_NES, tenhanshaFaxNo);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_GreaterThan(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_GT, fRES(tenhanshaFaxNo));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_LessThan(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_LT, fRES(tenhanshaFaxNo));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_GreaterEqual(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_GE, fRES(tenhanshaFaxNo));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_LessEqual(String tenhanshaFaxNo) {
        regTenhanshaFaxNo(CK_LE, fRES(tenhanshaFaxNo));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNoList The collection of tenhanshaFaxNo as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_InScope(Collection<String> tenhanshaFaxNoList) {
        doSetTenhanshaFaxNo_InScope(tenhanshaFaxNoList);
    }

    protected void doSetTenhanshaFaxNo_InScope(Collection<String> tenhanshaFaxNoList) {
        regINS(CK_INS, cTL(tenhanshaFaxNoList), xgetCValueTenhanshaFaxNo(), "TENHANSHA_FAX_NO");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNoList The collection of tenhanshaFaxNo as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_NotInScope(Collection<String> tenhanshaFaxNoList) {
        doSetTenhanshaFaxNo_NotInScope(tenhanshaFaxNoList);
    }

    protected void doSetTenhanshaFaxNo_NotInScope(Collection<String> tenhanshaFaxNoList) {
        regINS(CK_NINS, cTL(tenhanshaFaxNoList), xgetCValueTenhanshaFaxNo(), "TENHANSHA_FAX_NO");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)} <br>
     * <pre>e.g. setTenhanshaFaxNo_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setTenhanshaFaxNo_LikeSearch(String tenhanshaFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(tenhanshaFaxNo), xgetCValueTenhanshaFaxNo(), "TENHANSHA_FAX_NO", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setTenhanshaFaxNo_NotLikeSearch(String tenhanshaFaxNo, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(tenhanshaFaxNo), xgetCValueTenhanshaFaxNo(), "TENHANSHA_FAX_NO", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     * @param tenhanshaFaxNo The value of tenhanshaFaxNo as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setTenhanshaFaxNo_PrefixSearch(String tenhanshaFaxNo) {
        setTenhanshaFaxNo_LikeSearch(tenhanshaFaxNo, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     */
    public void setTenhanshaFaxNo_IsNull() { regTenhanshaFaxNo(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     */
    public void setTenhanshaFaxNo_IsNullOrEmpty() { regTenhanshaFaxNo(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * TENHANSHA_FAX_NO: {VARCHAR(30)}
     */
    public void setTenhanshaFaxNo_IsNotNull() { regTenhanshaFaxNo(CK_ISNN, DOBJ); }

    protected void regTenhanshaFaxNo(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueTenhanshaFaxNo(), "TENHANSHA_FAX_NO"); }
    protected abstract ConditionValue xgetCValueTenhanshaFaxNo();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_Equal(String plantNormal) {
        doSetPlantNormal_Equal(fRES(plantNormal));
    }

    protected void doSetPlantNormal_Equal(String plantNormal) {
        regPlantNormal(CK_EQ, plantNormal);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_NotEqual(String plantNormal) {
        doSetPlantNormal_NotEqual(fRES(plantNormal));
    }

    protected void doSetPlantNormal_NotEqual(String plantNormal) {
        regPlantNormal(CK_NES, plantNormal);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_GreaterThan(String plantNormal) {
        regPlantNormal(CK_GT, fRES(plantNormal));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_LessThan(String plantNormal) {
        regPlantNormal(CK_LT, fRES(plantNormal));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_GreaterEqual(String plantNormal) {
        regPlantNormal(CK_GE, fRES(plantNormal));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_LessEqual(String plantNormal) {
        regPlantNormal(CK_LE, fRES(plantNormal));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormalList The collection of plantNormal as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_InScope(Collection<String> plantNormalList) {
        doSetPlantNormal_InScope(plantNormalList);
    }

    protected void doSetPlantNormal_InScope(Collection<String> plantNormalList) {
        regINS(CK_INS, cTL(plantNormalList), xgetCValuePlantNormal(), "PLANT_NORMAL");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormalList The collection of plantNormal as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_NotInScope(Collection<String> plantNormalList) {
        doSetPlantNormal_NotInScope(plantNormalList);
    }

    protected void doSetPlantNormal_NotInScope(Collection<String> plantNormalList) {
        regINS(CK_NINS, cTL(plantNormalList), xgetCValuePlantNormal(), "PLANT_NORMAL");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)} <br>
     * <pre>e.g. setPlantNormal_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantNormal The value of plantNormal as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantNormal_LikeSearch(String plantNormal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantNormal), xgetCValuePlantNormal(), "PLANT_NORMAL", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantNormal_NotLikeSearch(String plantNormal, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantNormal), xgetCValuePlantNormal(), "PLANT_NORMAL", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     * @param plantNormal The value of plantNormal as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantNormal_PrefixSearch(String plantNormal) {
        setPlantNormal_LikeSearch(plantNormal, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     */
    public void setPlantNormal_IsNull() { regPlantNormal(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     */
    public void setPlantNormal_IsNullOrEmpty() { regPlantNormal(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_NORMAL: {VARCHAR(30)}
     */
    public void setPlantNormal_IsNotNull() { regPlantNormal(CK_ISNN, DOBJ); }

    protected void regPlantNormal(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantNormal(), "PLANT_NORMAL"); }
    protected abstract ConditionValue xgetCValuePlantNormal();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_Equal(String plantDeposit) {
        doSetPlantDeposit_Equal(fRES(plantDeposit));
    }

    protected void doSetPlantDeposit_Equal(String plantDeposit) {
        regPlantDeposit(CK_EQ, plantDeposit);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_NotEqual(String plantDeposit) {
        doSetPlantDeposit_NotEqual(fRES(plantDeposit));
    }

    protected void doSetPlantDeposit_NotEqual(String plantDeposit) {
        regPlantDeposit(CK_NES, plantDeposit);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_GreaterThan(String plantDeposit) {
        regPlantDeposit(CK_GT, fRES(plantDeposit));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_LessThan(String plantDeposit) {
        regPlantDeposit(CK_LT, fRES(plantDeposit));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_GreaterEqual(String plantDeposit) {
        regPlantDeposit(CK_GE, fRES(plantDeposit));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_LessEqual(String plantDeposit) {
        regPlantDeposit(CK_LE, fRES(plantDeposit));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDepositList The collection of plantDeposit as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_InScope(Collection<String> plantDepositList) {
        doSetPlantDeposit_InScope(plantDepositList);
    }

    protected void doSetPlantDeposit_InScope(Collection<String> plantDepositList) {
        regINS(CK_INS, cTL(plantDepositList), xgetCValuePlantDeposit(), "PLANT_DEPOSIT");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDepositList The collection of plantDeposit as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_NotInScope(Collection<String> plantDepositList) {
        doSetPlantDeposit_NotInScope(plantDepositList);
    }

    protected void doSetPlantDeposit_NotInScope(Collection<String> plantDepositList) {
        regINS(CK_NINS, cTL(plantDepositList), xgetCValuePlantDeposit(), "PLANT_DEPOSIT");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)} <br>
     * <pre>e.g. setPlantDeposit_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param plantDeposit The value of plantDeposit as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setPlantDeposit_LikeSearch(String plantDeposit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(plantDeposit), xgetCValuePlantDeposit(), "PLANT_DEPOSIT", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setPlantDeposit_NotLikeSearch(String plantDeposit, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(plantDeposit), xgetCValuePlantDeposit(), "PLANT_DEPOSIT", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     * @param plantDeposit The value of plantDeposit as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setPlantDeposit_PrefixSearch(String plantDeposit) {
        setPlantDeposit_LikeSearch(plantDeposit, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     */
    public void setPlantDeposit_IsNull() { regPlantDeposit(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     */
    public void setPlantDeposit_IsNullOrEmpty() { regPlantDeposit(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * PLANT_DEPOSIT: {VARCHAR(30)}
     */
    public void setPlantDeposit_IsNotNull() { regPlantDeposit(CK_ISNN, DOBJ); }

    protected void regPlantDeposit(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValuePlantDeposit(), "PLANT_DEPOSIT"); }
    protected abstract ConditionValue xgetCValuePlantDeposit();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_Equal(String lpSendFlg) {
        doSetLpSendFlg_Equal(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_Equal(String lpSendFlg) {
        regLpSendFlg(CK_EQ, lpSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotEqual(String lpSendFlg) {
        doSetLpSendFlg_NotEqual(fRES(lpSendFlg));
    }

    protected void doSetLpSendFlg_NotEqual(String lpSendFlg) {
        regLpSendFlg(CK_NES, lpSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterThan(String lpSendFlg) {
        regLpSendFlg(CK_GT, fRES(lpSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessThan(String lpSendFlg) {
        regLpSendFlg(CK_LT, fRES(lpSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_GreaterEqual(String lpSendFlg) {
        regLpSendFlg(CK_GE, fRES(lpSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_LessEqual(String lpSendFlg) {
        regLpSendFlg(CK_LE, fRES(lpSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_InScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_InScope(Collection<String> lpSendFlgList) {
        regINS(CK_INS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlgList The collection of lpSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        doSetLpSendFlg_NotInScope(lpSendFlgList);
    }

    protected void doSetLpSendFlg_NotInScope(Collection<String> lpSendFlgList) {
        regINS(CK_NINS, cTL(lpSendFlgList), xgetCValueLpSendFlg(), "LP_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setLpSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param lpSendFlg The value of lpSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setLpSendFlg_LikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setLpSendFlg_NotLikeSearch(String lpSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(lpSendFlg), xgetCValueLpSendFlg(), "LP_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     * @param lpSendFlg The value of lpSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setLpSendFlg_PrefixSearch(String lpSendFlg) {
        setLpSendFlg_LikeSearch(lpSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNull() { regLpSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNullOrEmpty() { regLpSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * LP_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setLpSendFlg_IsNotNull() { regLpSendFlg(CK_ISNN, DOBJ); }

    protected void regLpSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueLpSendFlg(), "LP_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueLpSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_Equal(String wmsSendFlg) {
        doSetWmsSendFlg_Equal(fRES(wmsSendFlg));
    }

    protected void doSetWmsSendFlg_Equal(String wmsSendFlg) {
        regWmsSendFlg(CK_EQ, wmsSendFlg);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_NotEqual(String wmsSendFlg) {
        doSetWmsSendFlg_NotEqual(fRES(wmsSendFlg));
    }

    protected void doSetWmsSendFlg_NotEqual(String wmsSendFlg) {
        regWmsSendFlg(CK_NES, wmsSendFlg);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_GreaterThan(String wmsSendFlg) {
        regWmsSendFlg(CK_GT, fRES(wmsSendFlg));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_LessThan(String wmsSendFlg) {
        regWmsSendFlg(CK_LT, fRES(wmsSendFlg));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_GreaterEqual(String wmsSendFlg) {
        regWmsSendFlg(CK_GE, fRES(wmsSendFlg));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_LessEqual(String wmsSendFlg) {
        regWmsSendFlg(CK_LE, fRES(wmsSendFlg));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlgList The collection of wmsSendFlg as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_InScope(Collection<String> wmsSendFlgList) {
        doSetWmsSendFlg_InScope(wmsSendFlgList);
    }

    protected void doSetWmsSendFlg_InScope(Collection<String> wmsSendFlgList) {
        regINS(CK_INS, cTL(wmsSendFlgList), xgetCValueWmsSendFlg(), "WMS_SEND_FLG");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlgList The collection of wmsSendFlg as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_NotInScope(Collection<String> wmsSendFlgList) {
        doSetWmsSendFlg_NotInScope(wmsSendFlgList);
    }

    protected void doSetWmsSendFlg_NotInScope(Collection<String> wmsSendFlgList) {
        regINS(CK_NINS, cTL(wmsSendFlgList), xgetCValueWmsSendFlg(), "WMS_SEND_FLG");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]} <br>
     * <pre>e.g. setWmsSendFlg_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param wmsSendFlg The value of wmsSendFlg as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setWmsSendFlg_LikeSearch(String wmsSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(wmsSendFlg), xgetCValueWmsSendFlg(), "WMS_SEND_FLG", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setWmsSendFlg_NotLikeSearch(String wmsSendFlg, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(wmsSendFlg), xgetCValueWmsSendFlg(), "WMS_SEND_FLG", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     * @param wmsSendFlg The value of wmsSendFlg as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setWmsSendFlg_PrefixSearch(String wmsSendFlg) {
        setWmsSendFlg_LikeSearch(wmsSendFlg, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmsSendFlg_IsNull() { regWmsSendFlg(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmsSendFlg_IsNullOrEmpty() { regWmsSendFlg(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * WMS_SEND_FLG: {CHAR(1), default=[0]}
     */
    public void setWmsSendFlg_IsNotNull() { regWmsSendFlg(CK_ISNN, DOBJ); }

    protected void regWmsSendFlg(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueWmsSendFlg(), "WMS_SEND_FLG"); }
    protected abstract ConditionValue xgetCValueWmsSendFlg();

    /**
     * Equal(=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as equal. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_Equal(String spareStr) {
        doSetSpareStr_Equal(fRES(spareStr));
    }

    protected void doSetSpareStr_Equal(String spareStr) {
        regSpareStr(CK_EQ, spareStr);
    }

    /**
     * NotEqual(&lt;&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotEqual(String spareStr) {
        doSetSpareStr_NotEqual(fRES(spareStr));
    }

    protected void doSetSpareStr_NotEqual(String spareStr) {
        regSpareStr(CK_NES, spareStr);
    }

    /**
     * GreaterThan(&gt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterThan(String spareStr) {
        regSpareStr(CK_GT, fRES(spareStr));
    }

    /**
     * LessThan(&lt;). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessThan. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessThan(String spareStr) {
        regSpareStr(CK_LT, fRES(spareStr));
    }

    /**
     * GreaterEqual(&gt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as greaterEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_GreaterEqual(String spareStr) {
        regSpareStr(CK_GE, fRES(spareStr));
    }

    /**
     * LessEqual(&lt;=). And NullOrEmptyIgnored, OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as lessEqual. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_LessEqual(String spareStr) {
        regSpareStr(CK_LE, fRES(spareStr));
    }

    /**
     * InScope {in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as inScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_InScope(Collection<String> spareStrList) {
        doSetSpareStr_InScope(spareStrList);
    }

    protected void doSetSpareStr_InScope(Collection<String> spareStrList) {
        regINS(CK_INS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * NotInScope {not in ('a', 'b')}. And NullOrEmptyIgnored, NullOrEmptyElementIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStrList The collection of spareStr as notInScope. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_NotInScope(Collection<String> spareStrList) {
        doSetSpareStr_NotInScope(spareStrList);
    }

    protected void doSetSpareStr_NotInScope(Collection<String> spareStrList) {
        regINS(CK_NINS, cTL(spareStrList), xgetCValueSpareStr(), "SPARE_STR");
    }

    /**
     * LikeSearch with various options. (versatile) {like '%xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)} <br>
     * <pre>e.g. setSpareStr_LikeSearch("xxx", new <span style="color: #CC4747">LikeSearchOption</span>().likeContain());</pre>
     * @param spareStr The value of spareStr as likeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of like-search. (NotNull)
     */
    public void setSpareStr_LikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_LS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * NotLikeSearch with various options. (versatile) {not like 'xxx%' escape ...} <br>
     * And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as notLikeSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     * @param likeSearchOption The option of not-like-search. (NotNull)
     */
    public void setSpareStr_NotLikeSearch(String spareStr, LikeSearchOption likeSearchOption) {
        regLSQ(CK_NLS, fRES(spareStr), xgetCValueSpareStr(), "SPARE_STR", likeSearchOption);
    }

    /**
     * PrefixSearch {like 'xxx%' escape ...}. And NullOrEmptyIgnored, SeveralRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     * @param spareStr The value of spareStr as prefixSearch. (basically NotNull, NotEmpty: error as default, or no condition as option)
     */
    public void setSpareStr_PrefixSearch(String spareStr) {
        setSpareStr_LikeSearch(spareStr, xcLSOPPre());
    }

    /**
     * IsNull {is null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNull() { regSpareStr(CK_ISN, DOBJ); }

    /**
     * IsNullOrEmpty {is null or empty}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNullOrEmpty() { regSpareStr(CK_ISNOE, DOBJ); }

    /**
     * IsNotNull {is not null}. And OnlyOnceRegistered. <br>
     * SPARE_STR: {VARCHAR(255)}
     */
    public void setSpareStr_IsNotNull() { regSpareStr(CK_ISNN, DOBJ); }

    protected void regSpareStr(ConditionKey ky, Object vl) { regQ(ky, vl, xgetCValueSpareStr(), "SPARE_STR"); }
    protected abstract ConditionValue xgetCValueSpareStr();

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
    public HpSLCFunction<MSalesOrgCB> scalar_Equal() {
        return xcreateSLCFunction(CK_EQ, MSalesOrgCB.class);
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
    public HpSLCFunction<MSalesOrgCB> scalar_NotEqual() {
        return xcreateSLCFunction(CK_NES, MSalesOrgCB.class);
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
    public HpSLCFunction<MSalesOrgCB> scalar_GreaterThan() {
        return xcreateSLCFunction(CK_GT, MSalesOrgCB.class);
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
    public HpSLCFunction<MSalesOrgCB> scalar_LessThan() {
        return xcreateSLCFunction(CK_LT, MSalesOrgCB.class);
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
    public HpSLCFunction<MSalesOrgCB> scalar_GreaterEqual() {
        return xcreateSLCFunction(CK_GE, MSalesOrgCB.class);
    }

    /**
     * Prepare ScalarCondition as lessEqual. <br>
     * {where FOO &lt;= (select max(BAR) from ...)}
     * <pre>
     * cb.query().<span style="color: #CC4747">scalar_LessEqual()</span>.max(new SubQuery&lt;MSalesOrgCB&gt;() {
     *     public void query(MSalesOrgCB subCB) {
     *         subCB.specify().setFoo... <span style="color: #3F7E5E">// derived column for function</span>
     *         subCB.query().setBar...
     *     }
     * });
     * </pre>
     * @return The object to set up a function. (NotNull)
     */
    public HpSLCFunction<MSalesOrgCB> scalar_LessEqual() {
        return xcreateSLCFunction(CK_LE, MSalesOrgCB.class);
    }

    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xscalarCondition(String fn, SubQuery<CB> sq, String rd, HpSLCCustomized<CB> cs, ScalarConditionOption op) {
        assertObjectNotNull("subQuery", sq);
        MSalesOrgCB cb = xcreateScalarConditionCB(); sq.query((CB)cb);
        String pp = keepScalarCondition(cb.query()); // for saving query-value
        cs.setPartitionByCBean((CB)xcreateScalarConditionPartitionByCB()); // for using partition-by
        registerScalarCondition(fn, cb.query(), pp, rd, cs, op);
    }
    public abstract String keepScalarCondition(MSalesOrgCQ sq);

    protected MSalesOrgCB xcreateScalarConditionCB() {
        MSalesOrgCB cb = newMyCB(); cb.xsetupForScalarCondition(this); return cb;
    }

    protected MSalesOrgCB xcreateScalarConditionPartitionByCB() {
        MSalesOrgCB cb = newMyCB(); cb.xsetupForScalarConditionPartitionBy(this); return cb;
    }

    // ===================================================================================
    //                                                                       MyselfDerived
    //                                                                       =============
    public void xsmyselfDerive(String fn, SubQuery<MSalesOrgCB> sq, String al, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSalesOrgCB cb = new MSalesOrgCB(); cb.xsetupForDerivedReferrer(this);
        lockCall(() -> sq.query(cb)); String pp = keepSpecifyMyselfDerived(cb.query()); String pk = "SALES_ORG_ID";
        registerSpecifyMyselfDerived(fn, cb.query(), pk, pk, pp, "myselfDerived", al, op);
    }
    public abstract String keepSpecifyMyselfDerived(MSalesOrgCQ sq);

    /**
     * Prepare for (Query)MyselfDerived (correlated sub-query).
     * @return The object to set up a function for myself table. (NotNull)
     */
    public HpQDRFunction<MSalesOrgCB> myselfDerived() {
        return xcreateQDRFunctionMyselfDerived(MSalesOrgCB.class);
    }
    @SuppressWarnings("unchecked")
    protected <CB extends ConditionBean> void xqderiveMyselfDerived(String fn, SubQuery<CB> sq, String rd, Object vl, DerivedReferrerOption op) {
        assertObjectNotNull("subQuery", sq);
        MSalesOrgCB cb = new MSalesOrgCB(); cb.xsetupForDerivedReferrer(this); sq.query((CB)cb);
        String pk = "SALES_ORG_ID";
        String sqpp = keepQueryMyselfDerived(cb.query()); // for saving query-value.
        String prpp = keepQueryMyselfDerivedParameter(vl);
        registerQueryMyselfDerived(fn, cb.query(), pk, pk, sqpp, "myselfDerived", rd, vl, prpp, op);
    }
    public abstract String keepQueryMyselfDerived(MSalesOrgCQ sq);
    public abstract String keepQueryMyselfDerivedParameter(Object vl);

    // ===================================================================================
    //                                                                        MyselfExists
    //                                                                        ============
    /**
     * Prepare for MyselfExists (correlated sub-query).
     * @param subCBLambda The implementation of sub-query. (NotNull)
     */
    public void myselfExists(SubQuery<MSalesOrgCB> subCBLambda) {
        assertObjectNotNull("subCBLambda", subCBLambda);
        MSalesOrgCB cb = new MSalesOrgCB(); cb.xsetupForMyselfExists(this);
        lockCall(() -> subCBLambda.query(cb)); String pp = keepMyselfExists(cb.query());
        registerMyselfExists(cb.query(), pp);
    }
    public abstract String keepMyselfExists(MSalesOrgCQ sq);

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
    protected MSalesOrgCB newMyCB() {
        return new MSalesOrgCB();
    }
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xabUDT() { return Date.class.getName(); }
    protected String xabCQ() { return MSalesOrgCQ.class.getName(); }
    protected String xabLSO() { return LikeSearchOption.class.getName(); }
    protected String xabSLCS() { return HpSLCSetupper.class.getName(); }
    protected String xabSCP() { return SubQuery.class.getName(); }
}
