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
 * The base condition-bean of m_location_replenish_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsMLocationReplenishProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MLocationReplenishProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMLocationReplenishProductCB() {
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
        return "m_location_replenish_product";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param locationReplenishProductId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public MLocationReplenishProductCB acceptPK(Long locationReplenishProductId) {
        assertObjectNotNull("locationReplenishProductId", locationReplenishProductId);
        BsMLocationReplenishProductCB cb = this;
        cb.query().setLocationReplenishProductId_Equal(locationReplenishProductId);
        return (MLocationReplenishProductCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param locationReplenishProductId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long locationReplenishProductId) {
        assertObjectNotNull("locationReplenishProductId", locationReplenishProductId);
        BsMLocationReplenishProductCB cb = this;
        cb.query().setLocationReplenishProductId_Equal(locationReplenishProductId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_LocationReplenishProductId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_LocationReplenishProductId_Desc();
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
    public MLocationReplenishProductCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MLocationReplenishProductCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MLocationReplenishProductCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MLocationReplenishProductCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MLocationReplenishProductCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MLocationReplenishProductCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MLocationReplenishProductCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MLocationReplenishProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MLocationReplenishProductCB> unionCBLambda) {
        final MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MLocationReplenishProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MLocationReplenishProductCB> unionCBLambda) {
        final MLocationReplenishProductCB cb = new MLocationReplenishProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MLocationReplenishProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMCustomer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomer() {
        assertSetupSelectPurpose("mCustomer");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplenishDepositId();
        }
        doSetupSelect(() -> query().queryMCustomer());
        if (_nssMCustomer == null || !_nssMCustomer.hasConditionQuery())
        { _nssMCustomer = new MCustomerNss(query().queryMCustomer()); }
        return _nssMCustomer;
    }

    protected MProductShapeNss _nssMProductShape;
    public MProductShapeNss xdfgetNssMProductShape() {
        if (_nssMProductShape == null) { _nssMProductShape = new MProductShapeNss(null); }
        return _nssMProductShape;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProductShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMProductShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductShapeNss setupSelect_MProductShape() {
        assertSetupSelectPurpose("mProductShape");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMaxStoreProductShapeId();
        }
        doSetupSelect(() -> query().queryMProductShape());
        if (_nssMProductShape == null || !_nssMProductShape.hasConditionQuery())
        { _nssMProductShape = new MProductShapeNss(query().queryMProductShape()); }
        return _nssMProductShape;
    }

    protected MShapeNss _nssMShape;
    public MShapeNss xdfgetNssMShape() {
        if (_nssMShape == null) { _nssMShape = new MShapeNss(null); }
        return _nssMShape;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShape()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMShape()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeNss setupSelect_MShape() {
        assertSetupSelectPurpose("mShape");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplenishPProductShapeId();
        }
        doSetupSelect(() -> query().queryMShape());
        if (_nssMShape == null || !_nssMShape.hasConditionQuery())
        { _nssMShape = new MShapeNss(query().queryMShape()); }
        return _nssMShape;
    }

    protected MProductNss _nssMProduct;
    public MProductNss xdfgetNssMProduct() {
        if (_nssMProduct == null) { _nssMProduct = new MProductNss(null); }
        return _nssMProduct;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MProduct()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMProduct()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MProductNss setupSelect_MProduct() {
        assertSetupSelectPurpose("mProduct");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplenishProductId();
        }
        doSetupSelect(() -> query().queryMProduct());
        if (_nssMProduct == null || !_nssMProduct.hasConditionQuery())
        { _nssMProduct = new MProductNss(query().queryMProduct()); }
        return _nssMProduct;
    }

    protected MLocationNss _nssMLocation;
    public MLocationNss xdfgetNssMLocation() {
        if (_nssMLocation == null) { _nssMLocation = new MLocationNss(null); }
        return _nssMLocation;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_location by my LOCATION_ID, named 'MLocation'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MLocation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMLocation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MLocationNss setupSelect_MLocation() {
        assertSetupSelectPurpose("mLocation");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLocationId();
        }
        doSetupSelect(() -> query().queryMLocation());
        if (_nssMLocation == null || !_nssMLocation.hasConditionQuery())
        { _nssMLocation = new MLocationNss(query().queryMLocation()); }
        return _nssMLocation;
    }

    protected MStockTypeNss _nssMStockType;
    public MStockTypeNss xdfgetNssMStockType() {
        if (_nssMStockType == null) { _nssMStockType = new MStockTypeNss(null); }
        return _nssMStockType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * <pre>
     * <span style="color: #0000C0">mLocationReplenishProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MStockType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mLocationReplenishProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mLocationReplenishProduct</span>.<span style="color: #CC4747">getMStockType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MStockTypeNss setupSelect_MStockType() {
        assertSetupSelectPurpose("mStockType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReplenishStockTypeId();
        }
        doSetupSelect(() -> query().queryMStockType());
        if (_nssMStockType == null || !_nssMStockType.hasConditionQuery())
        { _nssMStockType = new MStockTypeNss(query().queryMStockType()); }
        return _nssMStockType;
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

    public static class HpSpecification extends HpAbstractSpecification<MLocationReplenishProductCQ> {
        protected MCustomerCB.HpSpecification _mCustomer;
        protected MProductShapeCB.HpSpecification _mProductShape;
        protected MShapeCB.HpSpecification _mShape;
        protected MProductCB.HpSpecification _mProduct;
        protected MLocationCB.HpSpecification _mLocation;
        protected MStockTypeCB.HpSpecification _mStockType;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MLocationReplenishProductCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * LOCATION_REPLENISH_PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationReplenishProductId() { return doColumn("LOCATION_REPLENISH_PRODUCT_ID"); }
        /**
         * LOCATION_ID: {IX, NotNull, BIGINT(19), FK to m_location}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLocationId() { return doColumn("LOCATION_ID"); }
        /**
         * REPLENISH_PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplenishProductId() { return doColumn("REPLENISH_PRODUCT_ID"); }
        /**
         * REPLENISH_DEPOSIT_ID: {IX, BIGINT(19), FK to m_customer}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplenishDepositId() { return doColumn("REPLENISH_DEPOSIT_ID"); }
        /**
         * REPLENISH_P_NUM: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplenishPNum() { return doColumn("REPLENISH_P_NUM"); }
        /**
         * MAX_STORE_PRODUCT_SHAPE_ID: {IX, NotNull, BIGINT(19), FK to m_product_shape}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMaxStoreProductShapeId() { return doColumn("MAX_STORE_PRODUCT_SHAPE_ID"); }
        /**
         * MAX_STORE_NUM: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMaxStoreNum() { return doColumn("MAX_STORE_NUM"); }
        /**
         * REPLENISH_STOCK_TYPE_ID: {IX, BIGINT(19), FK to m_stock_type}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplenishStockTypeId() { return doColumn("REPLENISH_STOCK_TYPE_ID"); }
        /**
         * REPLENISH_P_PRODUCT_SHAPE_ID: {IX, BIGINT(19), FK to m_shape}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReplenishPProductShapeId() { return doColumn("REPLENISH_P_PRODUCT_SHAPE_ID"); }
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
            columnLocationReplenishProductId(); // PK
            if (qyCall().qy().hasConditionQueryMCustomer()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnReplenishDepositId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProductShape()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProductShapeCQ) {
                columnMaxStoreProductShapeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMShape()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeCQ) {
                columnReplenishPProductShapeId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMProduct()
                    || qyCall().qy().xgetReferrerQuery() instanceof MProductCQ) {
                columnReplenishProductId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMLocation()
                    || qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnLocationId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMStockType()
                    || qyCall().qy().xgetReferrerQuery() instanceof MStockTypeCQ) {
                columnReplenishStockTypeId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_location_replenish_product"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
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
         * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductShapeCB.HpSpecification specifyMProductShape() {
            assertRelation("mProductShape");
            if (_mProductShape == null) {
                _mProductShape = new MProductShapeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProductShape()
                                    , () -> _qyCall.qy().queryMProductShape())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProductShape.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProductShape()
                      , () -> xsyncQyCall().qy().queryMProductShape()));
                }
            }
            return _mProductShape;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeCB.HpSpecification specifyMShape() {
            assertRelation("mShape");
            if (_mShape == null) {
                _mShape = new MShapeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShape()
                                    , () -> _qyCall.qy().queryMShape())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShape.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShape()
                      , () -> xsyncQyCall().qy().queryMShape()));
                }
            }
            return _mShape;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MProductCB.HpSpecification specifyMProduct() {
            assertRelation("mProduct");
            if (_mProduct == null) {
                _mProduct = new MProductCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMProduct()
                                    , () -> _qyCall.qy().queryMProduct())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mProduct.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMProduct()
                      , () -> xsyncQyCall().qy().queryMProduct()));
                }
            }
            return _mProduct;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_location by my LOCATION_ID, named 'MLocation'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MLocationCB.HpSpecification specifyMLocation() {
            assertRelation("mLocation");
            if (_mLocation == null) {
                _mLocation = new MLocationCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMLocation()
                                    , () -> _qyCall.qy().queryMLocation())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mLocation.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMLocation()
                      , () -> xsyncQyCall().qy().queryMLocation()));
                }
            }
            return _mLocation;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MStockTypeCB.HpSpecification specifyMStockType() {
            assertRelation("mStockType");
            if (_mStockType == null) {
                _mStockType = new MStockTypeCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMStockType()
                                    , () -> _qyCall.qy().queryMStockType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mStockType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMStockType()
                      , () -> xsyncQyCall().qy().queryMStockType()));
                }
            }
            return _mStockType;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MLocationReplenishProductCB, MLocationReplenishProductCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationReplenishProductCB> sq, MLocationReplenishProductCQ cq, String al, DerivedReferrerOption op)
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
    public MLocationReplenishProductCB dreamCruiseCB() {
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB();
        cb.xsetupForDreamCruise((MLocationReplenishProductCB) this);
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
    public HpColQyOperand<MLocationReplenishProductCB> columnQuery(final SpecifyQuery<MLocationReplenishProductCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MLocationReplenishProductCB xcreateColumnQueryCB() {
        MLocationReplenishProductCB cb = new MLocationReplenishProductCB();
        cb.xsetupForColumnQuery((MLocationReplenishProductCB)this);
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
    public void orScopeQuery(OrQuery<MLocationReplenishProductCB> orCBLambda) {
        xorSQ((MLocationReplenishProductCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MLocationReplenishProductCB> andCBLambda) {
        xorSQAP((MLocationReplenishProductCB)this, andCBLambda);
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
        final MLocationReplenishProductCB cb;
        if (mainCB != null) {
            cb = (MLocationReplenishProductCB)mainCB;
        } else {
            cb = new MLocationReplenishProductCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MLocationReplenishProductCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MLocationReplenishProductCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}