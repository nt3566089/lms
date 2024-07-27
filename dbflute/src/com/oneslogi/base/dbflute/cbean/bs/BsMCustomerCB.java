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
 * The base condition-bean of m_customer.
 * @author DBFlute(AutoGenerator)
 */
public class BsMCustomerCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MCustomerCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMCustomerCB() {
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
        return "m_customer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param customerId : PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER. (NotNull)
     * @return this. (NotNull)
     */
    public MCustomerCB acceptPK(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        BsMCustomerCB cb = this;
        cb.query().setCustomerId_Equal(customerId);
        return (MCustomerCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param customerId : PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER. (NotNull)
     */
    public void acceptPrimaryKey(Long customerId) {
        assertObjectNotNull("customerId", customerId);
        BsMCustomerCB cb = this;
        cb.query().setCustomerId_Equal(customerId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param customerCd : +UQ, IX, NotNull, VARCHAR(30), FK to M_PLANT_STORAGE_SPACE. (NotNull)
     * @return this. (NotNull)
     */
    public MCustomerCB acceptUniqueOf(Long clientId, String customerCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("customerCd", customerCd);
        BsMCustomerCB cb = this;
        cb.query().setClientId_Equal(clientId);cb.query().setCustomerCd_Equal(customerCd);
        return (MCustomerCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_CustomerId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_CustomerId_Desc();
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
    public MCustomerCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MCustomerCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MCustomerCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MCustomerCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MCustomerCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MCustomerCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MCustomerCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MCustomerCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MCustomerCB> unionCBLambda) {
        final MCustomerCB cb = new MCustomerCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCustomerCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MCustomerCB> unionCBLambda) {
        final MCustomerCB cb = new MCustomerCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MCustomerCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MClientNss _nssMClient;
    public MClientNss xdfgetNssMClient() {
        if (_nssMClient == null) { _nssMClient = new MClientNss(null); }
        return _nssMClient;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MClientNss setupSelect_MClient() {
        assertSetupSelectPurpose("mClient");
        if (hasSpecifiedLocalColumn()) {
            specify().columnClientId();
        }
        doSetupSelect(() -> query().queryMClient());
        if (_nssMClient == null || !_nssMClient.hasConditionQuery())
        { _nssMClient = new MClientNss(query().queryMClient()); }
        return _nssMClient;
    }

    protected MCustomerNss _nssMCustomerSelf;
    public MCustomerNss xdfgetNssMCustomerSelf() {
        if (_nssMCustomerSelf == null) { _nssMCustomerSelf = new MCustomerNss(null); }
        return _nssMCustomerSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomerSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMCustomerSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomerSelf() {
        assertSetupSelectPurpose("mCustomerSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelivCustomerId();
        }
        doSetupSelect(() -> query().queryMCustomerSelf());
        if (_nssMCustomerSelf == null || !_nssMCustomerSelf.hasConditionQuery())
        { _nssMCustomerSelf = new MCustomerNss(query().queryMCustomerSelf()); }
        return _nssMCustomerSelf;
    }

    protected MClientCenterNss _nssMClientCenterByClientId;
    public MClientCenterNss xdfgetNssMClientCenterByClientId() {
        if (_nssMClientCenterByClientId == null) { _nssMClientCenterByClientId = new MClientCenterNss(null); }
        return _nssMClientCenterByClientId;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_client_center by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClientCenterByClientId()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMClientCenterByClientId()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MClientCenterNss setupSelect_MClientCenterByClientId() {
        assertSetupSelectPurpose("mClientCenterByClientId");
        if (hasSpecifiedLocalColumn()) {
            specify().columnClientId();
        }
        doSetupSelect(() -> query().queryMClientCenterByClientId());
        if (_nssMClientCenterByClientId == null || !_nssMClientCenterByClientId.hasConditionQuery())
        { _nssMClientCenterByClientId = new MClientCenterNss(query().queryMClientCenterByClientId()); }
        return _nssMClientCenterByClientId;
    }

    /**
     * Set up relation columns to select clause. <br>
     * m_plant_storage_space by my CUSTOMER_CD, named 'MPlantStorageSpaceByCd'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MPlantStorageSpaceByCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMPlantStorageSpaceByCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_MPlantStorageSpaceByCd() {
        assertSetupSelectPurpose("mPlantStorageSpaceByCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCustomerCd();
        }
        doSetupSelect(() -> query().queryMPlantStorageSpaceByCd());
    }

    protected BClassDtlNss _nssBClassDtlByDelFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelFlg() {
        if (_nssBClassDtlByDelFlg == null) { _nssBClassDtlByDelFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDelFlg() {
        assertSetupSelectPurpose("bClassDtlByDelFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDelFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDelFlg());
        if (_nssBClassDtlByDelFlg == null || !_nssBClassDtlByDelFlg.hasConditionQuery())
        { _nssBClassDtlByDelFlg = new BClassDtlNss(query().queryBClassDtlByDelFlg()); }
        return _nssBClassDtlByDelFlg;
    }

    protected BClassDtlNss _nssBClassDtlByDeliveryFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDeliveryFlg() {
        if (_nssBClassDtlByDeliveryFlg == null) { _nssBClassDtlByDeliveryFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDeliveryFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDeliveryFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByDeliveryFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDeliveryFlg() {
        assertSetupSelectPurpose("bClassDtlByDeliveryFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDeliveryFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDeliveryFlg());
        if (_nssBClassDtlByDeliveryFlg == null || !_nssBClassDtlByDeliveryFlg.hasConditionQuery())
        { _nssBClassDtlByDeliveryFlg = new BClassDtlNss(query().queryBClassDtlByDeliveryFlg()); }
        return _nssBClassDtlByDeliveryFlg;
    }

    protected BClassDtlNss _nssBClassDtlByDepositFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDepositFlg() {
        if (_nssBClassDtlByDepositFlg == null) { _nssBClassDtlByDepositFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDepositFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDepositFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByDepositFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByDepositFlg() {
        assertSetupSelectPurpose("bClassDtlByDepositFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnDepositFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByDepositFlg());
        if (_nssBClassDtlByDepositFlg == null || !_nssBClassDtlByDepositFlg.hasConditionQuery())
        { _nssBClassDtlByDepositFlg = new BClassDtlNss(query().queryBClassDtlByDepositFlg()); }
        return _nssBClassDtlByDepositFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLimitDtReverseFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitDtReverseFlg() {
        if (_nssBClassDtlByLimitDtReverseFlg == null) { _nssBClassDtlByLimitDtReverseFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitDtReverseFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitDtReverseFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitDtReverseFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitDtReverseFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitDtReverseFlg());
        if (_nssBClassDtlByLimitDtReverseFlg == null || !_nssBClassDtlByLimitDtReverseFlg.hasConditionQuery())
        { _nssBClassDtlByLimitDtReverseFlg = new BClassDtlNss(query().queryBClassDtlByLimitDtReverseFlg()); }
        return _nssBClassDtlByLimitDtReverseFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLotReverseFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLotReverseFlg() {
        if (_nssBClassDtlByLotReverseFlg == null) { _nssBClassDtlByLotReverseFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLotReverseFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLotReverseFlg() {
        assertSetupSelectPurpose("bClassDtlByLotReverseFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLotReverseFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLotReverseFlg());
        if (_nssBClassDtlByLotReverseFlg == null || !_nssBClassDtlByLotReverseFlg.hasConditionQuery())
        { _nssBClassDtlByLotReverseFlg = new BClassDtlNss(query().queryBClassDtlByLotReverseFlg()); }
        return _nssBClassDtlByLotReverseFlg;
    }

    protected BClassDtlNss _nssBClassDtlByOnetimeFlg;
    public BClassDtlNss xdfgetNssBClassDtlByOnetimeFlg() {
        if (_nssBClassDtlByOnetimeFlg == null) { _nssBClassDtlByOnetimeFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByOnetimeFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByOnetimeFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByOnetimeFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByOnetimeFlg() {
        assertSetupSelectPurpose("bClassDtlByOnetimeFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOnetimeFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByOnetimeFlg());
        if (_nssBClassDtlByOnetimeFlg == null || !_nssBClassDtlByOnetimeFlg.hasConditionQuery())
        { _nssBClassDtlByOnetimeFlg = new BClassDtlNss(query().queryBClassDtlByOnetimeFlg()); }
        return _nssBClassDtlByOnetimeFlg;
    }

    protected BClassDtlNss _nssBClassDtlByShippingStopFlg;
    public BClassDtlNss xdfgetNssBClassDtlByShippingStopFlg() {
        if (_nssBClassDtlByShippingStopFlg == null) { _nssBClassDtlByShippingStopFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByShippingStopFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByShippingStopFlg() {
        assertSetupSelectPurpose("bClassDtlByShippingStopFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShippingStopFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByShippingStopFlg());
        if (_nssBClassDtlByShippingStopFlg == null || !_nssBClassDtlByShippingStopFlg.hasConditionQuery())
        { _nssBClassDtlByShippingStopFlg = new BClassDtlNss(query().queryBClassDtlByShippingStopFlg()); }
        return _nssBClassDtlByShippingStopFlg;
    }

    protected BClassDtlNss _nssBClassDtlByVendorFlg;
    public BClassDtlNss xdfgetNssBClassDtlByVendorFlg() {
        if (_nssBClassDtlByVendorFlg == null) { _nssBClassDtlByVendorFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByVendorFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByVendorFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getBClassDtlByVendorFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByVendorFlg() {
        assertSetupSelectPurpose("bClassDtlByVendorFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnVendorFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByVendorFlg());
        if (_nssBClassDtlByVendorFlg == null || !_nssBClassDtlByVendorFlg.hasConditionQuery())
        { _nssBClassDtlByVendorFlg = new BClassDtlNss(query().queryBClassDtlByVendorFlg()); }
        return _nssBClassDtlByVendorFlg;
    }

    protected MCarrierSlipCesNss _nssMCarrierSlipCesAsOne;
    public MCarrierSlipCesNss xdfgetNssMCarrierSlipCesAsOne() {
        if (_nssMCarrierSlipCesAsOne == null) { _nssMCarrierSlipCesAsOne = new MCarrierSlipCesNss(null); }
        return _nssMCarrierSlipCesAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrierSlipCesAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mCustomer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mCustomer</span>.<span style="color: #CC4747">getMCarrierSlipCesAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierSlipCesNss setupSelect_MCarrierSlipCesAsOne() {
        assertSetupSelectPurpose("mCarrierSlipCesAsOne");
        doSetupSelect(() -> query().queryMCarrierSlipCesAsOne());
        if (_nssMCarrierSlipCesAsOne == null || !_nssMCarrierSlipCesAsOne.hasConditionQuery())
        { _nssMCarrierSlipCesAsOne = new MCarrierSlipCesNss(query().queryMCarrierSlipCesAsOne()); }
        return _nssMCarrierSlipCesAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<MCustomerCQ> {
        protected MClientCB.HpSpecification _mClient;
        protected MCustomerCB.HpSpecification _mCustomerSelf;
        protected MClientCenterCB.HpSpecification _mClientCenterByClientId;
        protected MPlantStorageSpaceCB.HpSpecification _mPlantStorageSpaceByCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDeliveryFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByDepositFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitDtReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLotReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByOnetimeFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByShippingStopFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByVendorFlg;
        protected MCarrierSlipCesCB.HpSpecification _mCarrierSlipCesAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MCustomerCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * CUSTOMER_ID: {PK, ID, NotNull, BIGINT(19), FK to M_CLIENT_CENTER}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerId() { return doColumn("CUSTOMER_ID"); }
        /**
         * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * CUSTOMER_CD: {+UQ, IX, NotNull, VARCHAR(30), FK to M_PLANT_STORAGE_SPACE}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerCd() { return doColumn("CUSTOMER_CD"); }
        /**
         * CUSTOMER_NM: {NotNull, VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerNm() { return doColumn("CUSTOMER_NM"); }
        /**
         * CUSTOMER_ABBR: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerAbbr() { return doColumn("CUSTOMER_ABBR"); }
        /**
         * ZIP_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnZipCd() { return doColumn("ZIP_CD"); }
        /**
         * TEL_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTelNo() { return doColumn("TEL_NO"); }
        /**
         * ADDRESS1: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress1() { return doColumn("ADDRESS1"); }
        /**
         * ADDRESS2: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress2() { return doColumn("ADDRESS2"); }
        /**
         * ADDRESS3: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAddress3() { return doColumn("ADDRESS3"); }
        /**
         * VENDOR_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=VendorFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnVendorFlg() { return doColumn("VENDOR_FLG"); }
        /**
         * DELIVERY_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DeliveryFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryFlg() { return doColumn("DELIVERY_FLG"); }
        /**
         * ONETIME_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=OnetimeFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOnetimeFlg() { return doColumn("ONETIME_FLG"); }
        /**
         * DEPOSIT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=DepositFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDepositFlg() { return doColumn("DEPOSIT_FLG"); }
        /**
         * ALLOC_ORDER: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAllocOrder() { return doColumn("ALLOC_ORDER"); }
        /**
         * LOT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotReverseFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotReverseFlg() { return doColumn("LOT_REVERSE_FLG"); }
        /**
         * LIMIT_DT_REVERSE_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtReverseFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtReverseFlg() { return doColumn("LIMIT_DT_REVERSE_FLG"); }
        /**
         * SHIPPING_STOP_FLG: {CHAR(1), default=[0], FK to B_CLASS_DTL, classification=ShippingStopFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingStopFlg() { return doColumn("SHIPPING_STOP_FLG"); }
        /**
         * DELIV_CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCustomerId() { return doColumn("DELIV_CUSTOMER_ID"); }
        /**
         * ACCOUNT_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAccountFlg() { return doColumn("ACCOUNT_FLG"); }
        /**
         * CENTER_ID: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCenterId() { return doColumn("CENTER_ID"); }
        /**
         * SALES_ORG_ID: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrgId() { return doColumn("SALES_ORG_ID"); }
        /**
         * LOT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotSplitTypeCd() { return doColumn("LOT_SPLIT_TYPE_CD"); }
        /**
         * LIMIT_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtSplitTypeCd() { return doColumn("LIMIT_DT_SPLIT_TYPE_CD"); }
        /**
         * PROD_DT_SPLIT_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDtSplitTypeCd() { return doColumn("PROD_DT_SPLIT_TYPE_CD"); }
        /**
         * LOT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotUnmatchTypeCd() { return doColumn("LOT_UNMATCH_TYPE_CD"); }
        /**
         * LIMIT_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtUnmatchTypeCd() { return doColumn("LIMIT_DT_UNMATCH_TYPE_CD"); }
        /**
         * PROD_DT_UNMATCH_TYPE_CD: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDtUnmatchTypeCd() { return doColumn("PROD_DT_UNMATCH_TYPE_CD"); }
        /**
         * UNI_CUSTOMER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUniCustomerCd() { return doColumn("UNI_CUSTOMER_CD"); }
        /**
         * DEL_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=DelFlg}
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
            columnCustomerId(); // PK
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomerSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnDelivCustomerId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClientCenterByClientId()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCenterCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMPlantStorageSpaceByCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof MPlantStorageSpaceCQ) {
                columnCustomerCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDeliveryFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDeliveryFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDepositFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDepositFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitDtReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLotReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLotReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByOnetimeFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnOnetimeFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByShippingStopFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnShippingStopFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByVendorFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnVendorFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_customer"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_client by my CLIENT_ID, named 'MClient'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MClientCB.HpSpecification specifyMClient() {
            assertRelation("mClient");
            if (_mClient == null) {
                _mClient = new MClientCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMClient()
                                    , () -> _qyCall.qy().queryMClient())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mClient.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMClient()
                      , () -> xsyncQyCall().qy().queryMClient()));
                }
            }
            return _mClient;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_customer by my DELIV_CUSTOMER_ID, named 'MCustomerSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCustomerCB.HpSpecification specifyMCustomerSelf() {
            assertRelation("mCustomerSelf");
            if (_mCustomerSelf == null) {
                _mCustomerSelf = new MCustomerCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCustomerSelf()
                                    , () -> _qyCall.qy().queryMCustomerSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCustomerSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCustomerSelf()
                      , () -> xsyncQyCall().qy().queryMCustomerSelf()));
                }
            }
            return _mCustomerSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_client_center by my CUSTOMER_ID, CLIENT_ID, named 'MClientCenterByClientId'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MClientCenterCB.HpSpecification specifyMClientCenterByClientId() {
            assertRelation("mClientCenterByClientId");
            if (_mClientCenterByClientId == null) {
                _mClientCenterByClientId = new MClientCenterCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMClientCenterByClientId()
                                    , () -> _qyCall.qy().queryMClientCenterByClientId())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mClientCenterByClientId.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMClientCenterByClientId()
                      , () -> xsyncQyCall().qy().queryMClientCenterByClientId()));
                }
            }
            return _mClientCenterByClientId;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_plant_storage_space by my CUSTOMER_CD, named 'MPlantStorageSpaceByCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MPlantStorageSpaceCB.HpSpecification specifyMPlantStorageSpaceByCd() {
            assertRelation("mPlantStorageSpaceByCd");
            if (_mPlantStorageSpaceByCd == null) {
                _mPlantStorageSpaceByCd = new MPlantStorageSpaceCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMPlantStorageSpaceByCd()
                                    , () -> _qyCall.qy().queryMPlantStorageSpaceByCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mPlantStorageSpaceByCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMPlantStorageSpaceByCd()
                      , () -> xsyncQyCall().qy().queryMPlantStorageSpaceByCd()));
                }
            }
            return _mPlantStorageSpaceByCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDelFlg() {
            assertRelation("bClassDtlByDelFlg");
            if (_bClassDtlByDelFlg == null) {
                _bClassDtlByDelFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDelFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDelFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDelFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDelFlg()));
                }
            }
            return _bClassDtlByDelFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my DELIVERY_FLG, named 'BClassDtlByDeliveryFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDeliveryFlg() {
            assertRelation("bClassDtlByDeliveryFlg");
            if (_bClassDtlByDeliveryFlg == null) {
                _bClassDtlByDeliveryFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDeliveryFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDeliveryFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDeliveryFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDeliveryFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDeliveryFlg()));
                }
            }
            return _bClassDtlByDeliveryFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my DEPOSIT_FLG, named 'BClassDtlByDepositFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByDepositFlg() {
            assertRelation("bClassDtlByDepositFlg");
            if (_bClassDtlByDepositFlg == null) {
                _bClassDtlByDepositFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByDepositFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByDepositFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByDepositFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByDepositFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByDepositFlg()));
                }
            }
            return _bClassDtlByDepositFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitDtReverseFlg() {
            assertRelation("bClassDtlByLimitDtReverseFlg");
            if (_bClassDtlByLimitDtReverseFlg == null) {
                _bClassDtlByLimitDtReverseFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitDtReverseFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitDtReverseFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitDtReverseFlg()));
                }
            }
            return _bClassDtlByLimitDtReverseFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLotReverseFlg() {
            assertRelation("bClassDtlByLotReverseFlg");
            if (_bClassDtlByLotReverseFlg == null) {
                _bClassDtlByLotReverseFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLotReverseFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLotReverseFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLotReverseFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLotReverseFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLotReverseFlg()));
                }
            }
            return _bClassDtlByLotReverseFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my ONETIME_FLG, named 'BClassDtlByOnetimeFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByOnetimeFlg() {
            assertRelation("bClassDtlByOnetimeFlg");
            if (_bClassDtlByOnetimeFlg == null) {
                _bClassDtlByOnetimeFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByOnetimeFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByOnetimeFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByOnetimeFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByOnetimeFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByOnetimeFlg()));
                }
            }
            return _bClassDtlByOnetimeFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByShippingStopFlg() {
            assertRelation("bClassDtlByShippingStopFlg");
            if (_bClassDtlByShippingStopFlg == null) {
                _bClassDtlByShippingStopFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByShippingStopFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByShippingStopFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByShippingStopFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByShippingStopFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByShippingStopFlg()));
                }
            }
            return _bClassDtlByShippingStopFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my VENDOR_FLG, named 'BClassDtlByVendorFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByVendorFlg() {
            assertRelation("bClassDtlByVendorFlg");
            if (_bClassDtlByVendorFlg == null) {
                _bClassDtlByVendorFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByVendorFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByVendorFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByVendorFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByVendorFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByVendorFlg()));
                }
            }
            return _bClassDtlByVendorFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_carrier_slip_ces by CUSTOMER_ID, named 'MCarrierSlipCesAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierSlipCesCB.HpSpecification specifyMCarrierSlipCesAsOne() {
            assertRelation("mCarrierSlipCesAsOne");
            if (_mCarrierSlipCesAsOne == null) {
                _mCarrierSlipCesAsOne = new MCarrierSlipCesCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrierSlipCesAsOne()
                                    , () -> _qyCall.qy().queryMCarrierSlipCesAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrierSlipCesAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrierSlipCesAsOne()
                      , () -> xsyncQyCall().qy().queryMCarrierSlipCesAsOne()));
                }
            }
            return _mCarrierSlipCesAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_carrier_decision where ...) as FOO_MAX} <br>
         * m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(decisionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     decisionCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     decisionCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCarrierDecision.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCarrierDecisionCB, MCustomerCQ> derivedMCarrierDecisionList() {
            assertDerived("mCarrierDecisionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCarrierDecisionCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCarrierDecisionList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_center_customer where ...) as FOO_MAX} <br>
         * m_center_customer by CUSTOMER_ID, named 'MCenterCustomerList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     customerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     customerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCenterCustomer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCenterCustomerCB, MCustomerCQ> derivedMCenterCustomerList() {
            assertDerived("mCenterCustomerList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCenterCustomerCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCenterCustomerList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_client where ...) as FOO_MAX} <br>
         * m_client by CUSTOMER_ID, named 'MClientList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(clientCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     clientCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     clientCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClient.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientCB, MCustomerCQ> derivedMClientList() {
            assertDerived("mClientList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_client_center where ...) as FOO_MAX} <br>
         * m_client_center by CUSTOMER_ID, named 'MClientCenterList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(centerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     centerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     centerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MClientCenter.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MClientCenterCB, MCustomerCQ> derivedMClientCenterList() {
            assertDerived("mClientCenterList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MClientCenterCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMClientCenterList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_customer where ...) as FOO_MAX} <br>
         * m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(customerCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     customerCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     customerCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCustomer.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCustomerCB, MCustomerCQ> derivedMCustomerSelfList() {
            assertDerived("mCustomerSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCustomerCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCustomerSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_customer_picking where ...) as FOO_MAX} <br>
         * m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MCustomerPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MCustomerPickingCB, MCustomerCQ> derivedMCustomerPickingList() {
            assertDerived("mCustomerPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCustomerPickingCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMCustomerPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_deposit_product where ...) as FOO_MAX} <br>
         * m_deposit_product by ACCOUNT_ID, named 'MDepositProductList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     productCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     productCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDepositProduct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDepositProductCB, MCustomerCQ> derivedMDepositProductList() {
            assertDerived("mDepositProductList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDepositProductCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDepositProductList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_location where ...) as FOO_MAX} <br>
         * m_location by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     locationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     locationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationCB, MCustomerCQ> derivedMLocationList() {
            assertDerived("mLocationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_location_replenish_product where ...) as FOO_MAX} <br>
         * m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     productCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     productCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocationReplenishProduct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationReplenishProductCB, MCustomerCQ> derivedMLocationReplenishProductList() {
            assertDerived("mLocationReplenishProductList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationReplenishProductCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationReplenishProductList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_user_deposit where ...) as FOO_MAX} <br>
         * m_user_deposit by CUSTOMER_ID, named 'MUserDepositList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(depositCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     depositCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     depositCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MUserDeposit.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MUserDepositCB, MCustomerCQ> derivedMUserDepositList() {
            assertDerived("mUserDepositList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MUserDepositCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMUserDepositList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_inst_b where ...) as FOO_MAX} <br>
         * t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstBCB, MCustomerCQ> derivedTAllocInstBList() {
            assertDerived("tAllocInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_inst_h where ...) as FOO_MAX} <br>
         * t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstHCB, MCustomerCQ> derivedTAllocInstHBySupplyCustomerIdList() {
            assertDerived("tAllocInstHBySupplyCustomerIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstHBySupplyCustomerIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_inst_h where ...) as FOO_MAX} <br>
         * t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstHCB, MCustomerCQ> derivedTAllocInstHByDelivCustomerIdList() {
            assertDerived("tAllocInstHByDelivCustomerIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstHByDelivCustomerIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_lot where ...) as FOO_MAX} <br>
         * t_alloc_lot by CUSTOMER_ID, named 'TAllocLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocLotCB, MCustomerCQ> derivedTAllocLotList() {
            assertDerived("tAllocLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocLotCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_b where ...) as FOO_MAX} <br>
         * t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, MCustomerCQ> derivedTInventoryBByAccountIdList() {
            assertDerived("tInventoryBByAccountIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBByAccountIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_b where ...) as FOO_MAX} <br>
         * t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, MCustomerCQ> derivedTInventoryBByDepositIdList() {
            assertDerived("tInventoryBByDepositIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBByDepositIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_b where ...) as FOO_MAX} <br>
         * t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, MCustomerCQ> derivedTInventoryBBySupplierIdList() {
            assertDerived("tInventoryBBySupplierIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBBySupplierIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_inst where ...) as FOO_MAX} <br>
         * t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(instCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     instCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     instCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryInst.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryInstCB, MCustomerCQ> derivedTInventoryInstList() {
            assertDerived("tInventoryInstList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryInstCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryInstList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_keeping_lot where ...) as FOO_MAX} <br>
         * t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TKeepingLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TKeepingLotCB, MCustomerCQ> derivedTKeepingLotList() {
            assertDerived("tKeepingLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TKeepingLotCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTKeepingLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_last_lot where ...) as FOO_MAX} <br>
         * t_last_lot by CUSTOMER_ID, named 'TLastLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TLastLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TLastLotCB, MCustomerCQ> derivedTLastLotList() {
            assertDerived("tLastLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TLastLotCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTLastLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_move_inst_b where ...) as FOO_MAX} <br>
         * t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, MCustomerCQ> derivedTMoveInstBByDepositIdList() {
            assertDerived("tMoveInstBByDepositIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBByDepositIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_move_inst_b where ...) as FOO_MAX} <br>
         * t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, MCustomerCQ> derivedTMoveInstBBySupplierIdList() {
            assertDerived("tMoveInstBBySupplierIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBBySupplierIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_move_inst_b where ...) as FOO_MAX} <br>
         * t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, MCustomerCQ> derivedTMoveInstBByAccountIdList() {
            assertDerived("tMoveInstBByAccountIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBByAccountIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_receive_plan_h where ...) as FOO_MAX} <br>
         * t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, MCustomerCQ> derivedTReceivePlanHByPlanSupplierIdList() {
            assertDerived("tReceivePlanHByPlanSupplierIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHByPlanSupplierIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_receive_plan_h where ...) as FOO_MAX} <br>
         * t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanHCB, MCustomerCQ> derivedTReceivePlanHByPlanDepositIdList() {
            assertDerived("tReceivePlanHByPlanDepositIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanHByPlanDepositIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_b where ...) as FOO_MAX} <br>
         * t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstBCB, MCustomerCQ> derivedTShippingInstBList() {
            assertDerived("tShippingInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstBCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_h where ...) as FOO_MAX} <br>
         * t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MCustomerCQ> derivedTShippingInstHByDelivCustomerIdList() {
            assertDerived("tShippingInstHByDelivCustomerIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHByDelivCustomerIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_h where ...) as FOO_MAX} <br>
         * t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MCustomerCQ> derivedTShippingInstHBySupplyCustomerIdList() {
            assertDerived("tShippingInstHBySupplyCustomerIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHBySupplyCustomerIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_stock where ...) as FOO_MAX} <br>
         * t_stock by DEPOSIT_ID, named 'TStockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     stockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     stockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockCB, MCustomerCQ> derivedTStockList() {
            assertDerived("tStockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_store_no where ...) as FOO_MAX} <br>
         * t_store_no by SUPPLIER_ID, named 'TStoreNoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreNoCB, MCustomerCQ> derivedTStoreNoList() {
            assertDerived("tStoreNoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreNoCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreNoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_store_record_h where ...) as FOO_MAX} <br>
         * t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreRecordH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordHCB, MCustomerCQ> derivedTStoreRecordHBySupplierIdList() {
            assertDerived("tStoreRecordHBySupplierIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreRecordHBySupplierIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_store_record_h where ...) as FOO_MAX} <br>
         * t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreRecordH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordHCB, MCustomerCQ> derivedTStoreRecordHByDepositIdList() {
            assertDerived("tStoreRecordHByDepositIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreRecordHByDepositIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_inventory_input_prod where ...) as FOO_MAX} <br>
         * w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     prodCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     prodCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtInventoryInputProd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtInventoryInputProdCB, MCustomerCQ> derivedWHtInventoryInputProdList() {
            assertDerived("wHtInventoryInputProdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtInventoryInputProdCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtInventoryInputProdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_receive_no_plan_insp where ...) as FOO_MAX} <br>
         * w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MCustomerCQ> derivedWHtReceiveNoPlanInspBySupplierIdList() {
            assertDerived("wHtReceiveNoPlanInspBySupplierIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspBySupplierIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_receive_no_plan_insp where ...) as FOO_MAX} <br>
         * w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MCustomerCQ> derivedWHtReceiveNoPlanInspByDepositIdList() {
            assertDerived("wHtReceiveNoPlanInspByDepositIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspByDepositIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_serial_receive_insp where ...) as FOO_MAX} <br>
         * w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialReceiveInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialReceiveInspCB, MCustomerCQ> derivedWHtSerialReceiveInspList() {
            assertDerived("wHtSerialReceiveInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialReceiveInspCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialReceiveInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_serial_shipping_insp where ...) as FOO_MAX} <br>
         * w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtSerialShippingInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtSerialShippingInspCB, MCustomerCQ> derivedWHtSerialShippingInspList() {
            assertDerived("wHtSerialShippingInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtSerialShippingInspCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtSerialShippingInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_h where ...) as FOO_MAX} <br>
         * t_shipping_inst_h by ACCOUNT_ID, named 'TShippingInstHByAccoutIdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstHCB, MCustomerCQ> derivedTShippingInstHByAccoutIdList() {
            assertDerived("tShippingInstHByAccoutIdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstHCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstHByAccoutIdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MCustomerCB, MCustomerCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MCustomerCB> sq, MCustomerCQ cq, String al, DerivedReferrerOption op)
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
    public MCustomerCB dreamCruiseCB() {
        MCustomerCB cb = new MCustomerCB();
        cb.xsetupForDreamCruise((MCustomerCB) this);
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
    public HpColQyOperand<MCustomerCB> columnQuery(final SpecifyQuery<MCustomerCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MCustomerCB xcreateColumnQueryCB() {
        MCustomerCB cb = new MCustomerCB();
        cb.xsetupForColumnQuery((MCustomerCB)this);
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
    public void orScopeQuery(OrQuery<MCustomerCB> orCBLambda) {
        xorSQ((MCustomerCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MCustomerCB> andCBLambda) {
        xorSQAP((MCustomerCB)this, andCBLambda);
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
        final MCustomerCB cb;
        if (mainCB != null) {
            cb = (MCustomerCB)mainCB;
        } else {
            cb = new MCustomerCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MCustomerCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MCustomerCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
