package com.oneslogi.base.dbflute.cbean.bs;

import org.dbflute.cbean.AbstractConditionBean;
import org.dbflute.cbean.ConditionBean;
import org.dbflute.cbean.ConditionQuery;
import org.dbflute.cbean.chelper.*;
import org.dbflute.cbean.coption.*;
import org.dbflute.cbean.dream.*;
import org.dbflute.cbean.sqlclause.SqlClause;
import org.dbflute.cbean.sqlclause.SqlClauseCreator;
import org.dbflute.cbean.scoping.*;
import org.dbflute.dbmeta.DBMetaProvider;
import org.dbflute.twowaysql.factory.SqlAnalyzerFactory;
import org.dbflute.twowaysql.style.BoundDateDisplayTimeZoneProvider;
import com.oneslogi.base.dbflute.allcommon.DBFluteConfig;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.ImplementedInvokerAssistant;
import com.oneslogi.base.dbflute.allcommon.ImplementedSqlClauseCreator;
import com.oneslogi.base.dbflute.cbean.*;
import com.oneslogi.base.dbflute.cbean.cq.*;
import com.oneslogi.base.dbflute.cbean.nss.*;

/**
 * The base condition-bean of m_carrier_decision.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCarrierDecisionCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCarrierDecisionCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCarrierDecisionCB() {
        if (DBFluteConfig.getInstance().isPagingCountLater()) {
            enablePagingCountLater();
        }
        if (DBFluteConfig.getInstance().isPagingCountLeastJoin()) {
            enablePagingCountLeastJoin();
        }
        if (DBFluteConfig.getInstance().isNonSpecifiedColumnAccessAllowed()) {
            enableNonSpecifiedColumnAccess();
        }
        if (DBFluteConfig.getInstance().isSpecifyColumnRequired()) {
            enableSpecifyColumnRequired();
        }
        xsetSpecifyColumnRequiredExceptDeterminer(DBFluteConfig.getInstance().getSpecifyColumnRequiredExceptDeterminer());
        if (DBFluteConfig.getInstance().isSpecifyColumnRequiredWarningOnly()) {
            xenableSpecifyColumnRequiredWarningOnly();
        }
        if (DBFluteConfig.getInstance().isQueryUpdateCountPreCheck()) {
            enableQueryUpdateCountPreCheck();
        }
    }

    // ===================================================================================
    //                                                                           SqlClause
    //                                                                           =========
    @Override
    protected SqlClause createSqlClause() {
        SqlClauseCreator creator = DBFluteConfig.getInstance().getSqlClauseCreator();
        if (creator != null) {
            return creator.createSqlClause(this);
        }
        return new ImplementedSqlClauseCreator().createSqlClause(this); // as default
    }

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    @Override
    protected DBMetaProvider getDBMetaProvider() {
        return DBMetaInstanceHandler.getProvider(); // as default
    }

    public String asTableDbName() {
        return "m_carrier_decision";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param carrierDecisionId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public MCarrierDecisionCB acceptPK(Long carrierDecisionId) {
        assertObjectNotNull("carrierDecisionId", carrierDecisionId);
        BsMCarrierDecisionCB cb = this;
        cb.query().setCarrierDecisionId_Equal(carrierDecisionId);
        return (MCarrierDecisionCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param carrierDecisionId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long carrierDecisionId) {
        assertObjectNotNull("carrierDecisionId", carrierDecisionId);
        BsMCarrierDecisionCB cb = this;
        cb.query().setCarrierDecisionId_Equal(carrierDecisionId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CarrierDecisionId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CarrierDecisionId_Desc();
        return this;
    }

    // ===================================================================================
    //                                                                               Query
    //                                                                               =====
    /**
     * Prepare for various queries. <br>
     * Examples of main functions are following:
     * <pre>
     * <span style="color: #3F7E5E">// Basic Queries</span>
     * cb.query().setMemberId_Equal(value);        <span style="color: #3F7E5E">// =</span>
     * cb.query().setMemberId_NotEqual(value);     <span style="color: #3F7E5E">// !=</span>
     * cb.query().setMemberId_GreaterThan(value);  <span style="color: #3F7E5E">// &gt;</span>
     * cb.query().setMemberId_LessThan(value);     <span style="color: #3F7E5E">// &lt;</span>
     * cb.query().setMemberId_GreaterEqual(value); <span style="color: #3F7E5E">// &gt;=</span>
     * cb.query().setMemberId_LessEqual(value);    <span style="color: #3F7E5E">// &lt;=</span>
     * cb.query().setMemberName_InScope(valueList);    <span style="color: #3F7E5E">// in ('a', 'b')</span>
     * cb.query().setMemberName_NotInScope(valueList); <span style="color: #3F7E5E">// not in ('a', 'b')</span>
     * <span style="color: #3F7E5E">// LikeSearch with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {like ... [options]}</span>
     * cb.query().setMemberName_LikeSearch(value, option);
     * cb.query().setMemberName_NotLikeSearch(value, option); <span style="color: #3F7E5E">// not like ...</span>
     * <span style="color: #3F7E5E">// FromTo with various options: (versatile)</span>
     * <span style="color: #3F7E5E">// {(default) fromDatetime &lt;= BIRTHDATE &lt;= toDatetime}</span>
     * cb.query().setBirthdate_FromTo(fromDatetime, toDatetime, option);
     * <span style="color: #3F7E5E">// DateFromTo: (Date means yyyy/MM/dd)</span>
     * <span style="color: #3F7E5E">// {fromDate &lt;= BIRTHDATE &lt; toDate + 1 day}</span>
     * cb.query().setBirthdate_IsNull();    <span style="color: #3F7E5E">// is null</span>
     * cb.query().setBirthdate_IsNotNull(); <span style="color: #3F7E5E">// is not null</span>
     *
     * <span style="color: #3F7E5E">// ExistsReferrer: (correlated sub-query)</span>
     * <span style="color: #3F7E5E">// {where exists (select PURCHASE_ID from PURCHASE where ...)}</span>
     * cb.query().existsPurchase(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * });
     * cb.query().notExistsPurchase...
     *
     * <span style="color: #3F7E5E">// (Query)DerivedReferrer: (correlated sub-query)</span>
     * cb.query().derivedPurchaseList().max(purchaseCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     purchaseCB.specify().columnPurchasePrice(); <span style="color: #3F7E5E">// derived column for function</span>
     *     purchaseCB.query().set... <span style="color: #3F7E5E">// referrer sub-query condition</span>
     * }).greaterEqual(value);
     *
     * <span style="color: #3F7E5E">// ScalarCondition: (self-table sub-query)</span>
     * cb.query().scalar_Equal().max(scalarCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     scalarCB.specify().columnBirthdate(); <span style="color: #3F7E5E">// derived column for function</span>
     *     scalarCB.query().set... <span style="color: #3F7E5E">// scalar sub-query condition</span>
     * });
     *
     * <span style="color: #3F7E5E">// OrderBy</span>
     * cb.query().addOrderBy_MemberName_Asc();
     * cb.query().addOrderBy_MemberName_Desc().withManualOrder(option);
     * cb.query().addOrderBy_MemberName_Desc().withNullsFirst();
     * cb.query().addOrderBy_MemberName_Desc().withNullsLast();
     * cb.query().addSpecifiedDerivedOrderBy_Desc(aliasName);
     *
     * <span style="color: #3F7E5E">// Query(Relation)</span>
     * cb.query().queryMemberStatus()...;
     * cb.query().queryMemberAddressAsValid(targetDate)...;
     * </pre>
     * @return The instance of condition-query for base-point table to set up query. (NotNull)
     */
    public MCarrierDecisionCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCarrierDecisionCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCarrierDecisionCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCarrierDecisionCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCarrierDecisionCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCarrierDecisionCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCarrierDecisionCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCarrierDecisionCQ(childQuery, sqlClause, aliasName, nestLevel);
    }

    /**
     * {@inheritDoc}
     */
    public ConditionQuery localCQ() {
        return doGetConditionQuery();
    }

    // ===================================================================================
    //                                                                               Union
    //                                                                               =====
    /**
     * Set up 'union' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">union</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union'. (NotNull)
     */
    public void union(UnionQuery<MCarrierDecisionCB> unionCBLambda) {
        final MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierDecisionCQ cq = cb.query(); query().xsetUnionQuery(cq);
    }

    /**
     * Set up 'union all' for base-point table. <br>
     * You don't need to call SetupSelect in union-query,
     * because it inherits calls before. (Don't call SetupSelect after here)
     * <pre>
     * cb.query().<span style="color: #CC4747">unionAll</span>(<span style="color: #553000">unionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">unionCB</span>.query().set...
     * });
     * </pre>
     * @param unionCBLambda The callback for query of 'union all'. (NotNull)
     */
    public void unionAll(UnionQuery<MCarrierDecisionCB> unionCBLambda) {
        final MCarrierDecisionCB cb = new MCarrierDecisionCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCarrierDecisionCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MCustomerNss _nssMCustomer;
    public MCustomerNss xdfgetNssMCustomer() {
        if (_nssMCustomer == null) { _nssMCustomer = new MCustomerNss(null); }
        return _nssMCustomer;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMCustomer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomer() {
        assertSetupSelectPurpose("mCustomer");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCustomerId();
        }
        doSetupSelect(() -> query().queryMCustomer());
        if (_nssMCustomer == null || !_nssMCustomer.hasConditionQuery())
        { _nssMCustomer = new MCustomerNss(query().queryMCustomer()); }
        return _nssMCustomer;
    }

    protected MCarrierNss _nssMCarrierByCarrierId2;
    public MCarrierNss xdfgetNssMCarrierByCarrierId2() {
        if (_nssMCarrierByCarrierId2 == null) { _nssMCarrierByCarrierId2 = new MCarrierNss(null); }
        return _nssMCarrierByCarrierId2;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierByCarrierId2()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMCarrierByCarrierId2()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrierByCarrierId2() {
        assertSetupSelectPurpose("mCarrierByCarrierId2");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId2();
        }
        doSetupSelect(() -> query().queryMCarrierByCarrierId2());
        if (_nssMCarrierByCarrierId2 == null || !_nssMCarrierByCarrierId2.hasConditionQuery())
        { _nssMCarrierByCarrierId2 = new MCarrierNss(query().queryMCarrierByCarrierId2()); }
        return _nssMCarrierByCarrierId2;
    }

    protected MCarrierNss _nssMCarrierByCarrierId1;
    public MCarrierNss xdfgetNssMCarrierByCarrierId1() {
        if (_nssMCarrierByCarrierId1 == null) { _nssMCarrierByCarrierId1 = new MCarrierNss(null); }
        return _nssMCarrierByCarrierId1;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierByCarrierId1()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMCarrierByCarrierId1()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrierByCarrierId1() {
        assertSetupSelectPurpose("mCarrierByCarrierId1");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId1();
        }
        doSetupSelect(() -> query().queryMCarrierByCarrierId1());
        if (_nssMCarrierByCarrierId1 == null || !_nssMCarrierByCarrierId1.hasConditionQuery())
        { _nssMCarrierByCarrierId1 = new MCarrierNss(query().queryMCarrierByCarrierId1()); }
        return _nssMCarrierByCarrierId1;
    }

    protected MCarrierNss _nssMCarrierByCarrierId3;
    public MCarrierNss xdfgetNssMCarrierByCarrierId3() {
        if (_nssMCarrierByCarrierId3 == null) { _nssMCarrierByCarrierId3 = new MCarrierNss(null); }
        return _nssMCarrierByCarrierId3;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierByCarrierId3()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMCarrierByCarrierId3()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrierByCarrierId3() {
        assertSetupSelectPurpose("mCarrierByCarrierId3");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId3();
        }
        doSetupSelect(() -> query().queryMCarrierByCarrierId3());
        if (_nssMCarrierByCarrierId3 == null || !_nssMCarrierByCarrierId3.hasConditionQuery())
        { _nssMCarrierByCarrierId3 = new MCarrierNss(query().queryMCarrierByCarrierId3()); }
        return _nssMCarrierByCarrierId3;
    }

    protected MCarrierNss _nssMCarrierByCarrierId;
    public MCarrierNss xdfgetNssMCarrierByCarrierId() {
        if (_nssMCarrierByCarrierId == null) { _nssMCarrierByCarrierId = new MCarrierNss(null); }
        return _nssMCarrierByCarrierId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierByCarrierId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMCarrierByCarrierId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrierByCarrierId() {
        assertSetupSelectPurpose("mCarrierByCarrierId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId();
        }
        doSetupSelect(() -> query().queryMCarrierByCarrierId());
        if (_nssMCarrierByCarrierId == null || !_nssMCarrierByCarrierId.hasConditionQuery())
        { _nssMCarrierByCarrierId = new MCarrierNss(query().queryMCarrierByCarrierId()); }
        return _nssMCarrierByCarrierId;
    }

    /**
     * Set up relation columns to select clause. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     * <pre>
     * <span style="color: #0000C0">mCarrierDecisionBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MSalesOrg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCarrierDecision</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCarrierDecision</span>.<span style="color: #CC4747">getMSalesOrg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_MSalesOrg() {
        assertSetupSelectPurpose("mSalesOrg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSalesOrgId();
        }
        doSetupSelect(() -> query().queryMSalesOrg());
    }

    // [DBFlute-0.7.4]
    // ===================================================================================
    //                                                                             Specify
    //                                                                             =======
    protected HpSpecification _specification;

    /**
     * Prepare for SpecifyColumn, (Specify)DerivedReferrer. <br>
     * This method should be called after SetupSelect.
     * <pre>
     * <span style="color: #0000C0">memberBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.setupSelect_MemberStatus(); <span style="color: #3F7E5E">// should be called before specify()</span>
     *     <span style="color: #553000">cb</span>.specify().columnMemberName();
     *     <span style="color: #553000">cb</span>.specify().specifyMemberStatus().columnMemberStatusName();
     *     <span style="color: #553000">cb</span>.specify().derivedPurchaseList().max(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.specify().columnPurchaseDatetime();
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *     }, aliasName);
     * }).alwaysPresent(<span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ...
     * });
     * </pre>
     * @return The instance of specification. (NotNull)
     */
    public HpSpecification specify() {
        assertSpecifyPurpose();
        if (_specification == null) { _specification = new HpSpecification(this
            , xcreateSpQyCall(() -> true, () -> xdfgetConditionQuery())
            , _purpose, getDBMetaProvider(), xcSDRFnFc()); }
        return _specification;
    }

    public HpColumnSpHandler localSp() {
        return specify();
    }

    public boolean hasSpecifiedLocalColumn() {
        return _specification != null && _specification.hasSpecifiedColumn();
    }

    public static class HpSpecification extends HpAbstractSpecification<MCarrierDecisionCQ> {
        protected MCustomerCB.HpSpecification _mCustomer;
        protected MCarrierCB.HpSpecification _mCarrierByCarrierId2;
        protected MCarrierCB.HpSpecification _mCarrierByCarrierId1;
        protected MCarrierCB.HpSpecification _mCarrierByCarrierId3;
        protected MCarrierCB.HpSpecification _mCarrierByCarrierId;
        protected MSalesOrgCB.HpSpecification _mSalesOrg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCarrierDecisionCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierDecisionId() { return doColumn("CARRIER_DECISION_ID"); }
        /**
         * CENTER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterCd() { return doColumn("CENTER_CD"); }
        /**
         * ZIP_CD: {IX, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZipCd() { return doColumn("ZIP_CD"); }
        /**
         * SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrgId() { return doColumn("SALES_ORG_ID"); }
        /**
         * SALES_ORG_CD: {IX+, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrgCd() { return doColumn("SALES_ORG_CD"); }
        /**
         * CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerId() { return doColumn("CUSTOMER_ID"); }
        /**
         * CUSTOMER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerCd() { return doColumn("CUSTOMER_CD"); }
        /**
         * DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectKohaiTypeCd() { return doColumn("DIRECT_KOHAI_TYPE_CD"); }
        /**
         * PREFECTURE: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPrefecture() { return doColumn("PREFECTURE"); }
        /**
         * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId() { return doColumn("CARRIER_ID"); }
        /**
         * CARRIER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierCd() { return doColumn("CARRIER_CD"); }
        /**
         * CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId1() { return doColumn("CARRIER_ID1"); }
        /**
         * CARRIER_CD1: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierCd1() { return doColumn("CARRIER_CD1"); }
        /**
         * CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId2() { return doColumn("CARRIER_ID2"); }
        /**
         * CARRIER_CD2: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierCd2() { return doColumn("CARRIER_CD2"); }
        /**
         * CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId3() { return doColumn("CARRIER_ID3"); }
        /**
         * CARRIER_CD3: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierCd3() { return doColumn("CARRIER_CD3"); }
        /**
         * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelFlg() { return doColumn("DEL_FLG"); }
        /**
         * VERSION_NO: {NotNull, BIGINT(19), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVersionNo() { return doColumn("VERSION_NO"); }
        /**
         * CONTROL_NO: {IX, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnControlNo() { return doColumn("CONTROL_NO"); }
        /**
         * ADD_DT: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddDt() { return doColumn("ADD_DT"); }
        /**
         * ADD_USER: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddUser() { return doColumn("ADD_USER"); }
        /**
         * ADD_PROCESS: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddProcess() { return doColumn("ADD_PROCESS"); }
        /**
         * UPD_DT: {DATETIME(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdDt() { return doColumn("UPD_DT"); }
        /**
         * UPD_USER: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdUser() { return doColumn("UPD_USER"); }
        /**
         * UPD_PROCESS: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUpdProcess() { return doColumn("UPD_PROCESS"); }
        public void everyColumn() { doEveryColumn(); }
        public void exceptRecordMetaColumn() { doExceptRecordMetaColumn(); }
        @Override
        protected void doSpecifyRequiredColumn() {
            columnCarrierDecisionId(); // PK
            if (qyCall().qy().hasConditionQueryMCustomer()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnCustomerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierByCarrierId2()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId2(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierByCarrierId1()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId1(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierByCarrierId3()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId3(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrierByCarrierId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMSalesOrg()
                    || qyCall().qy().xgetReferrerQuery() instanceof MSalesOrgCQ) {
                columnSalesOrgId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_carrier_decision"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_customer by my CUSTOMER_ID, named 'MCustomer'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomer() {
            assertRelation("mCustomer");
            if (_mCustomer == null) {
                _mCustomer = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomer()
                                    , () -> _qyCall.qy().queryMCustomer())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomer.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomer()
                      , () -> xsyncQyCall().qy().queryMCustomer()));
                }
            }
            return _mCustomer;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrierByCarrierId2() {
            assertRelation("mCarrierByCarrierId2");
            if (_mCarrierByCarrierId2 == null) {
                _mCarrierByCarrierId2 = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierByCarrierId2()
                                    , () -> _qyCall.qy().queryMCarrierByCarrierId2())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierByCarrierId2.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierByCarrierId2()
                      , () -> xsyncQyCall().qy().queryMCarrierByCarrierId2()));
                }
            }
            return _mCarrierByCarrierId2;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrierByCarrierId1() {
            assertRelation("mCarrierByCarrierId1");
            if (_mCarrierByCarrierId1 == null) {
                _mCarrierByCarrierId1 = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierByCarrierId1()
                                    , () -> _qyCall.qy().queryMCarrierByCarrierId1())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierByCarrierId1.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierByCarrierId1()
                      , () -> xsyncQyCall().qy().queryMCarrierByCarrierId1()));
                }
            }
            return _mCarrierByCarrierId1;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrierByCarrierId3() {
            assertRelation("mCarrierByCarrierId3");
            if (_mCarrierByCarrierId3 == null) {
                _mCarrierByCarrierId3 = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierByCarrierId3()
                                    , () -> _qyCall.qy().queryMCarrierByCarrierId3())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierByCarrierId3.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierByCarrierId3()
                      , () -> xsyncQyCall().qy().queryMCarrierByCarrierId3()));
                }
            }
            return _mCarrierByCarrierId3;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrierByCarrierId() {
            assertRelation("mCarrierByCarrierId");
            if (_mCarrierByCarrierId == null) {
                _mCarrierByCarrierId = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierByCarrierId()
                                    , () -> _qyCall.qy().queryMCarrierByCarrierId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierByCarrierId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierByCarrierId()
                      , () -> xsyncQyCall().qy().queryMCarrierByCarrierId()));
                }
            }
            return _mCarrierByCarrierId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MSalesOrgCB.HpSpecification specifyMSalesOrg() {
            assertRelation("mSalesOrg");
            if (_mSalesOrg == null) {
                _mSalesOrg = new MSalesOrgCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMSalesOrg()
                                    , () -> _qyCall.qy().queryMSalesOrg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mSalesOrg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMSalesOrg()
                      , () -> xsyncQyCall().qy().queryMSalesOrg()));
                }
            }
            return _mSalesOrg;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCarrierDecisionCB, MCarrierDecisionCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierDecisionCB> sq, MCarrierDecisionCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsmyselfDerive(fn, sq, al, op), _dbmetaProvider);
        }
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public MCarrierDecisionCB dreamCruiseCB() {
        MCarrierDecisionCB cb = new MCarrierDecisionCB();
        cb.xsetupForDreamCruise((MCarrierDecisionCB) this);
        return cb;
    }

    protected ConditionBean xdoCreateDreamCruiseCB() {
        return dreamCruiseCB();
    }

    // [DBFlute-0.9.5.3]
    // ===================================================================================
    //                                                                        Column Query
    //                                                                        ============
    /**
     * Set up column-query. {column1 = column2}
     * <pre>
     * <span style="color: #3F7E5E">// where FOO &lt; BAR</span>
     * cb.<span style="color: #CC4747">columnQuery</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFoo()</span>; <span style="color: #3F7E5E">// left column</span>
     * }).lessThan(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBar()</span>; <span style="color: #3F7E5E">// right column</span>
     * }); <span style="color: #3F7E5E">// you can calculate for right column like '}).plus(3);'</span>
     * </pre>
     * @param colCBLambda The callback for specify-query of left column. (NotNull)
     * @return The object for setting up operand and right column. (NotNull)
     */
    public HpColQyOperand<MCarrierDecisionCB> columnQuery(final SpecifyQuery<MCarrierDecisionCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCarrierDecisionCB xcreateColumnQueryCB() {
        MCarrierDecisionCB cb = new MCarrierDecisionCB();
        cb.xsetupForColumnQuery((MCarrierDecisionCB)this);
        return cb;
    }

    // [DBFlute-0.9.6.3]
    // ===================================================================================
    //                                                                       OrScope Query
    //                                                                       =============
    /**
     * Set up the query for or-scope. <br>
     * (Same-column-and-same-condition-key conditions are allowed in or-scope)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or BAR = '...')</span>
     * cb.<span style="color: #CC4747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.query().setBar...
     * });
     * </pre>
     * @param orCBLambda The callback for query of or-condition. (NotNull)
     */
    public void orScopeQuery(OrQuery<MCarrierDecisionCB> orCBLambda) {
        xorSQ((MCarrierDecisionCB)this, orCBLambda);
    }

    @Override
    protected HpCBPurpose xhandleOrSQPurposeChange() {
        return null; // means no check
    }

    /**
     * Set up the and-part of or-scope. <br>
     * (However nested or-scope query and as-or-split of like-search in and-part are unsupported)
     * <pre>
     * <span style="color: #3F7E5E">// where (FOO = '...' or (BAR = '...' and QUX = '...'))</span>
     * cb.<span style="color: #994747">orScopeQuery</span>(<span style="color: #553000">orCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orCB</span>.query().setFoo...
     *     <span style="color: #553000">orCB</span>.<span style="color: #CC4747">orScopeQueryAndPart</span>(<span style="color: #553000">andCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">andCB</span>.query().setBar...
     *         <span style="color: #553000">andCB</span>.query().setQux...
     *     });
     * });
     * </pre>
     * @param andCBLambda The callback for query of and-condition. (NotNull)
     */
    public void orScopeQueryAndPart(AndQuery<MCarrierDecisionCB> andCBLambda) {
        xorSQAP((MCarrierDecisionCB)this, andCBLambda);
    }

    /**
     * Check invalid query when query is set. <br>
     * (it throws an exception if set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this. <br>
     *
     * <p>renamed to checkNullOrEmptyQuery() since 1.1,
     * but not deprecated because it might have many use.</p>
     *
     * #java8 compatible option
     */
    public void checkInvalidQuery() {
        checkNullOrEmptyQuery();
    }

    /**
     * Accept (no check) an invalid query when a query is set. <br>
     * (no condition if a set query is invalid) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use ignoreNullOrEmptyQuery()
     */
    public void acceptInvalidQuery() {
        getSqlClause().ignoreNullOrEmptyQuery();
    }

    /**
     * Allow to auto-detect joins that can be inner-join. <br>
     * <pre>
     * o You should call this before registrations of where clause.
     * o Union and SubQuery and other sub condition-bean inherit this.
     * o You should confirm your SQL on the log to be tuned by inner-join correctly.
     * </pre>
     * @deprecated use enableInnerJoinAutoDetect()
     */
    public void allowInnerJoinAutoDetect() {
        enableInnerJoinAutoDetect();
    }

    /**
     * Suppress auto-detecting inner-join. <br>
     * You should call this before registrations of where clause.
     * @deprecated use disableInnerJoinAutoDetect()
     */
    public void suppressInnerJoinAutoDetect() {
        disableInnerJoinAutoDetect();
    }

    /**
     * Allow an empty string for query. <br>
     * (you can use an empty string as condition) <br>
     * You should call this before registrations of where clause and other queries. <br>
     * Union and SubQuery and other sub condition-bean inherit this.
     * @deprecated use enableEmptyStringQuery()
     */
    public void allowEmptyStringQuery() {
        doEnableEmptyStringQuery();
    }

    /**
     * Enable checking record count before QueryUpdate (contains QueryDelete). (default is disabled) <br>
     * No query update if zero count. (basically for MySQL's deadlock by next-key lock)
     * @deprecated use enableQueryUpdateCountPreCheck()
     */
    public void enableCheckCountBeforeQueryUpdate() {
        enableQueryUpdateCountPreCheck();
    }

    /**
     * Disable checking record count before QueryUpdate (contains QueryDelete). (back to default) <br>
     * Executes query update even if zero count. (normal specification)
     * @deprecated use disableQueryUpdateCountPreCheck()
     */
    public void disableCheckCountBeforeQueryUpdate() {
        disableQueryUpdateCountPreCheck();
    }

    /**
     * Allow "that's bad timing" check.
     * @deprecated use enableThatsBadTiming()
     */
    public void allowThatsBadTiming() {
        enableThatsBadTiming();
    }

    /**
     * Suppress "that's bad timing" check.
     * @deprecated use disableThatsBadTiming()
     */
    public void suppressThatsBadTiming() {
        disableThatsBadTiming();
    }

    // ===================================================================================
    //                                                                          DisplaySQL
    //                                                                          ==========
    @Override
    protected SqlAnalyzerFactory getSqlAnalyzerFactory()
    { return new ImplementedInvokerAssistant().assistSqlAnalyzerFactory(); }
    @Override
    protected String getConfiguredLogDatePattern() { return DBFluteConfig.getInstance().getLogDatePattern(); }
    @Override
    protected String getConfiguredLogTimestampPattern() { return DBFluteConfig.getInstance().getLogTimestampPattern(); }
    @Override
    protected String getConfiguredLogTimePattern() { return DBFluteConfig.getInstance().getLogTimePattern(); }
    @Override
    protected BoundDateDisplayTimeZoneProvider getConfiguredLogTimeZoneProvider() { return DBFluteConfig.getInstance().getLogTimeZoneProvider(); }

    // ===================================================================================
    //                                                                       Meta Handling
    //                                                                       =============
    public boolean hasUnionQueryOrUnionAllQuery() {
        return query().hasUnionQueryOrUnionAllQuery();
    }

    // ===================================================================================
    //                                                                        Purpose Type
    //                                                                        ============
    @Override
    protected void xprepareSyncQyCall(ConditionBean mainCB) {
        final MCarrierDecisionCB cb;
        if (mainCB != null) {
            cb = (MCarrierDecisionCB)mainCB;
        } else {
            cb = new MCarrierDecisionCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCarrierDecisionCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCarrierDecisionCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
