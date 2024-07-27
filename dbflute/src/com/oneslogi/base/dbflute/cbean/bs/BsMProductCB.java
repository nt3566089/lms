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
 * The base condition-bean of m_product.
 * @author DBFlute(AutoGenerator)
 */
public class BsMProductCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MProductCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMProductCB() {
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
        return "m_product";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param productId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public MProductCB acceptPK(Long productId) {
        assertObjectNotNull("productId", productId);
        BsMProductCB cb = this;
        cb.query().setProductId_Equal(productId);
        return (MProductCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param productId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long productId) {
        assertObjectNotNull("productId", productId);
        BsMProductCB cb = this;
        cb.query().setProductId_Equal(productId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param productCd : +UQ, IX, NotNull, VARCHAR(100). (NotNull)
     * @return this. (NotNull)
     */
    public MProductCB acceptUniqueOf(Long clientId, String productCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("productCd", productCd);
        BsMProductCB cb = this;
        cb.query().setClientId_Equal(clientId);cb.query().setProductCd_Equal(productCd);
        return (MProductCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ProductId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ProductId_Desc();
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
    public MProductCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MProductCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MProductCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MProductCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MProductCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MProductCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MProductCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MProductCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MProductCB> unionCBLambda) {
        final MProductCB cb = new MProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MProductCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MProductCB> unionCBLambda) {
        final MProductCB cb = new MProductCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MProductCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected MShapeGrpNss _nssMShapeGrp;
    public MShapeGrpNss xdfgetNssMShapeGrp() {
        if (_nssMShapeGrp == null) { _nssMShapeGrp = new MShapeGrpNss(null); }
        return _nssMShapeGrp;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MShapeGrp()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMShapeGrp()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MShapeGrpNss setupSelect_MShapeGrp() {
        assertSetupSelectPurpose("mShapeGrp");
        if (hasSpecifiedLocalColumn()) {
            specify().columnShapeGrpId();
        }
        doSetupSelect(() -> query().queryMShapeGrp());
        if (_nssMShapeGrp == null || !_nssMShapeGrp.hasConditionQuery())
        { _nssMShapeGrp = new MShapeGrpNss(query().queryMShapeGrp()); }
        return _nssMShapeGrp;
    }

    protected MClientNss _nssMClient;
    public MClientNss xdfgetNssMClient() {
        if (_nssMClient == null) { _nssMClient = new MClientNss(null); }
        return _nssMClient;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MClient()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMClient()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByDelFlg;
    public BClassDtlNss xdfgetNssBClassDtlByDelFlg() {
        if (_nssBClassDtlByDelFlg == null) { _nssBClassDtlByDelFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByDelFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByDelFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByLimitDtManagFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLimitDtManagFlg() {
        if (_nssBClassDtlByLimitDtManagFlg == null) { _nssBClassDtlByLimitDtManagFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLimitDtManagFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitDtManagFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLimitDtManagFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLimitDtManagFlg() {
        assertSetupSelectPurpose("bClassDtlByLimitDtManagFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLimitDtManagFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLimitDtManagFlg());
        if (_nssBClassDtlByLimitDtManagFlg == null || !_nssBClassDtlByLimitDtManagFlg.hasConditionQuery())
        { _nssBClassDtlByLimitDtManagFlg = new BClassDtlNss(query().queryBClassDtlByLimitDtManagFlg()); }
        return _nssBClassDtlByLimitDtManagFlg;
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
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLimitDtReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByLotManagFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLotManagFlg() {
        if (_nssBClassDtlByLotManagFlg == null) { _nssBClassDtlByLotManagFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLotManagFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLotManagFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLotManagFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLotManagFlg() {
        assertSetupSelectPurpose("bClassDtlByLotManagFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLotManagFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLotManagFlg());
        if (_nssBClassDtlByLotManagFlg == null || !_nssBClassDtlByLotManagFlg.hasConditionQuery())
        { _nssBClassDtlByLotManagFlg = new BClassDtlNss(query().queryBClassDtlByLotManagFlg()); }
        return _nssBClassDtlByLotManagFlg;
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
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLotReverseFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByMergeCls;
    public BClassDtlNss xdfgetNssBClassDtlByMergeCls() {
        if (_nssBClassDtlByMergeCls == null) { _nssBClassDtlByMergeCls = new BClassDtlNss(null); }
        return _nssBClassDtlByMergeCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByMergeCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByMergeCls() {
        assertSetupSelectPurpose("bClassDtlByMergeCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnMergeCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByMergeCls());
        if (_nssBClassDtlByMergeCls == null || !_nssBClassDtlByMergeCls.hasConditionQuery())
        { _nssBClassDtlByMergeCls = new BClassDtlNss(query().queryBClassDtlByMergeCls()); }
        return _nssBClassDtlByMergeCls;
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
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByShippingStopFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
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

    protected BClassDtlNss _nssBClassDtlByFreightCls;
    public BClassDtlNss xdfgetNssBClassDtlByFreightCls() {
        if (_nssBClassDtlByFreightCls == null) { _nssBClassDtlByFreightCls = new BClassDtlNss(null); }
        return _nssBClassDtlByFreightCls;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByFreightCls()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByFreightCls()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByFreightCls() {
        assertSetupSelectPurpose("bClassDtlByFreightCls");
        if (hasSpecifiedLocalColumn()) {
            specify().columnFreightCls();
        }
        doSetupSelect(() -> query().queryBClassDtlByFreightCls());
        if (_nssBClassDtlByFreightCls == null || !_nssBClassDtlByFreightCls.hasConditionQuery())
        { _nssBClassDtlByFreightCls = new BClassDtlNss(query().queryBClassDtlByFreightCls()); }
        return _nssBClassDtlByFreightCls;
    }

    protected BClassDtlNss _nssBClassDtlByProdDtManagFlg;
    public BClassDtlNss xdfgetNssBClassDtlByProdDtManagFlg() {
        if (_nssBClassDtlByProdDtManagFlg == null) { _nssBClassDtlByProdDtManagFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByProdDtManagFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByProdDtManagFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByProdDtManagFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByProdDtManagFlg() {
        assertSetupSelectPurpose("bClassDtlByProdDtManagFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnProdDtManagFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByProdDtManagFlg());
        if (_nssBClassDtlByProdDtManagFlg == null || !_nssBClassDtlByProdDtManagFlg.hasConditionQuery())
        { _nssBClassDtlByProdDtManagFlg = new BClassDtlNss(query().queryBClassDtlByProdDtManagFlg()); }
        return _nssBClassDtlByProdDtManagFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLogiSpecialTypeCd;
    public BClassDtlNss xdfgetNssBClassDtlByLogiSpecialTypeCd() {
        if (_nssBClassDtlByLogiSpecialTypeCd == null) { _nssBClassDtlByLogiSpecialTypeCd = new BClassDtlNss(null); }
        return _nssBClassDtlByLogiSpecialTypeCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLogiSpecialTypeCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLogiSpecialTypeCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLogiSpecialTypeCd() {
        assertSetupSelectPurpose("bClassDtlByLogiSpecialTypeCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLogiSpecialTypeCd();
        }
        doSetupSelect(() -> query().queryBClassDtlByLogiSpecialTypeCd());
        if (_nssBClassDtlByLogiSpecialTypeCd == null || !_nssBClassDtlByLogiSpecialTypeCd.hasConditionQuery())
        { _nssBClassDtlByLogiSpecialTypeCd = new BClassDtlNss(query().queryBClassDtlByLogiSpecialTypeCd()); }
        return _nssBClassDtlByLogiSpecialTypeCd;
    }

    protected BClassDtlNss _nssBClassDtlByOcrDateFormat;
    public BClassDtlNss xdfgetNssBClassDtlByOcrDateFormat() {
        if (_nssBClassDtlByOcrDateFormat == null) { _nssBClassDtlByOcrDateFormat = new BClassDtlNss(null); }
        return _nssBClassDtlByOcrDateFormat;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByOcrDateFormat()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByOcrDateFormat()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByOcrDateFormat() {
        assertSetupSelectPurpose("bClassDtlByOcrDateFormat");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOcrDateFormat();
        }
        doSetupSelect(() -> query().queryBClassDtlByOcrDateFormat());
        if (_nssBClassDtlByOcrDateFormat == null || !_nssBClassDtlByOcrDateFormat.hasConditionQuery())
        { _nssBClassDtlByOcrDateFormat = new BClassDtlNss(query().queryBClassDtlByOcrDateFormat()); }
        return _nssBClassDtlByOcrDateFormat;
    }

    protected BClassDtlNss _nssBClassDtlByInsuranceFlg;
    public BClassDtlNss xdfgetNssBClassDtlByInsuranceFlg() {
        if (_nssBClassDtlByInsuranceFlg == null) { _nssBClassDtlByInsuranceFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByInsuranceFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInsuranceFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByInsuranceFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInsuranceFlg() {
        assertSetupSelectPurpose("bClassDtlByInsuranceFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInsuranceFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByInsuranceFlg());
        if (_nssBClassDtlByInsuranceFlg == null || !_nssBClassDtlByInsuranceFlg.hasConditionQuery())
        { _nssBClassDtlByInsuranceFlg = new BClassDtlNss(query().queryBClassDtlByInsuranceFlg()); }
        return _nssBClassDtlByInsuranceFlg;
    }

    protected BClassDtlNss _nssBClassDtlByNoOkinawaFlightFlg;
    public BClassDtlNss xdfgetNssBClassDtlByNoOkinawaFlightFlg() {
        if (_nssBClassDtlByNoOkinawaFlightFlg == null) { _nssBClassDtlByNoOkinawaFlightFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByNoOkinawaFlightFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByNoOkinawaFlightFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByNoOkinawaFlightFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByNoOkinawaFlightFlg() {
        assertSetupSelectPurpose("bClassDtlByNoOkinawaFlightFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnNoOkinawaFlightFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByNoOkinawaFlightFlg());
        if (_nssBClassDtlByNoOkinawaFlightFlg == null || !_nssBClassDtlByNoOkinawaFlightFlg.hasConditionQuery())
        { _nssBClassDtlByNoOkinawaFlightFlg = new BClassDtlNss(query().queryBClassDtlByNoOkinawaFlightFlg()); }
        return _nssBClassDtlByNoOkinawaFlightFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLogiAttentionTypeCd;
    public BClassDtlNss xdfgetNssBClassDtlByLogiAttentionTypeCd() {
        if (_nssBClassDtlByLogiAttentionTypeCd == null) { _nssBClassDtlByLogiAttentionTypeCd = new BClassDtlNss(null); }
        return _nssBClassDtlByLogiAttentionTypeCd;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLogiAttentionTypeCd()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLogiAttentionTypeCd()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLogiAttentionTypeCd() {
        assertSetupSelectPurpose("bClassDtlByLogiAttentionTypeCd");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLogiAttentionTypeCd();
        }
        doSetupSelect(() -> query().queryBClassDtlByLogiAttentionTypeCd());
        if (_nssBClassDtlByLogiAttentionTypeCd == null || !_nssBClassDtlByLogiAttentionTypeCd.hasConditionQuery())
        { _nssBClassDtlByLogiAttentionTypeCd = new BClassDtlNss(query().queryBClassDtlByLogiAttentionTypeCd()); }
        return _nssBClassDtlByLogiAttentionTypeCd;
    }

    protected BClassDtlNss _nssBClassDtlByHeavyItemFlg;
    public BClassDtlNss xdfgetNssBClassDtlByHeavyItemFlg() {
        if (_nssBClassDtlByHeavyItemFlg == null) { _nssBClassDtlByHeavyItemFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByHeavyItemFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByHeavyItemFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByHeavyItemFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByHeavyItemFlg() {
        assertSetupSelectPurpose("bClassDtlByHeavyItemFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnHeavyItemFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByHeavyItemFlg());
        if (_nssBClassDtlByHeavyItemFlg == null || !_nssBClassDtlByHeavyItemFlg.hasConditionQuery())
        { _nssBClassDtlByHeavyItemFlg = new BClassDtlNss(query().queryBClassDtlByHeavyItemFlg()); }
        return _nssBClassDtlByHeavyItemFlg;
    }

    protected BClassDtlNss _nssBClassDtlByLargeItemFlg;
    public BClassDtlNss xdfgetNssBClassDtlByLargeItemFlg() {
        if (_nssBClassDtlByLargeItemFlg == null) { _nssBClassDtlByLargeItemFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByLargeItemFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByLargeItemFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getBClassDtlByLargeItemFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByLargeItemFlg() {
        assertSetupSelectPurpose("bClassDtlByLargeItemFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnLargeItemFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByLargeItemFlg());
        if (_nssBClassDtlByLargeItemFlg == null || !_nssBClassDtlByLargeItemFlg.hasConditionQuery())
        { _nssBClassDtlByLargeItemFlg = new BClassDtlNss(query().queryBClassDtlByLargeItemFlg()); }
        return _nssBClassDtlByLargeItemFlg;
    }

    protected MSetParentNss _nssMSetParentAsOne;
    public MSetParentNss xdfgetNssMSetParentAsOne() {
        if (_nssMSetParentAsOne == null) { _nssMSetParentAsOne = new MSetParentNss(null); }
        return _nssMSetParentAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MSetParentAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mProduct</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMSetParentAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MSetParentNss setupSelect_MSetParentAsOne() {
        assertSetupSelectPurpose("mSetParentAsOne");
        doSetupSelect(() -> query().queryMSetParentAsOne());
        if (_nssMSetParentAsOne == null || !_nssMSetParentAsOne.hasConditionQuery())
        { _nssMSetParentAsOne = new MSetParentNss(query().queryMSetParentAsOne()); }
        return _nssMSetParentAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<MProductCQ> {
        protected MShapeGrpCB.HpSpecification _mShapeGrp;
        protected MClientCB.HpSpecification _mClient;
        protected BClassDtlCB.HpSpecification _bClassDtlByDelFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitDtManagFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLimitDtReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLotManagFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLotReverseFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByMergeCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByShippingStopFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByFreightCls;
        protected BClassDtlCB.HpSpecification _bClassDtlByProdDtManagFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLogiSpecialTypeCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByOcrDateFormat;
        protected BClassDtlCB.HpSpecification _bClassDtlByInsuranceFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByNoOkinawaFlightFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLogiAttentionTypeCd;
        protected BClassDtlCB.HpSpecification _bClassDtlByHeavyItemFlg;
        protected BClassDtlCB.HpSpecification _bClassDtlByLargeItemFlg;
        protected MSetParentCB.HpSpecification _mSetParentAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MProductCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * PRODUCT_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductId() { return doColumn("PRODUCT_ID"); }
        /**
         * CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientId() { return doColumn("CLIENT_ID"); }
        /**
         * PRODUCT_CD: {+UQ, IX, NotNull, VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCd() { return doColumn("PRODUCT_CD"); }
        /**
         * PRODUCT_NM: {NotNull, VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductNm() { return doColumn("PRODUCT_NM"); }
        /**
         * PRODUCT_ABBR: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductAbbr() { return doColumn("PRODUCT_ABBR"); }
        /**
         * JAN_CD: {IX, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJanCd() { return doColumn("JAN_CD"); }
        /**
         * LOT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LotManagFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotManagFlg() { return doColumn("LOT_MANAG_FLG"); }
        /**
         * LIMIT_DT_MANAG_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=LimitDtManagFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDtManagFlg() { return doColumn("LIMIT_DT_MANAG_FLG"); }
        /**
         * RECEIVE_LIMIT_NUM: {BIGINT(19), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveLimitNum() { return doColumn("RECEIVE_LIMIT_NUM"); }
        /**
         * SHIPPING_LIMIT_NUM: {BIGINT(19), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingLimitNum() { return doColumn("SHIPPING_LIMIT_NUM"); }
        /**
         * MERGE_CLS: {NotNull, VARCHAR(30), default=[02], FK to B_CLASS_DTL, classification=MergeCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMergeCls() { return doColumn("MERGE_CLS"); }
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
         * FIXED_POINT: {DECIMAL(14, 4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFixedPoint() { return doColumn("FIXED_POINT"); }
        /**
         * SHAPE_GRP_ID: {IX, BIGINT(19), FK to m_shape_grp}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShapeGrpId() { return doColumn("SHAPE_GRP_ID"); }
        /**
         * NMFC_CODE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNmfcCode() { return doColumn("NMFC_CODE"); }
        /**
         * FREIGHT_CLS: {VARCHAR(30), FK to B_CLASS_DTL, classification=FreightCls}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFreightCls() { return doColumn("FREIGHT_CLS"); }
        /**
         * COUNNTRY_OF_ORIGIN: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCounntryOfOrigin() { return doColumn("COUNNTRY_OF_ORIGIN"); }
        /**
         * UNIT_VAL: {DECIMAL(14, 4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitVal() { return doColumn("UNIT_VAL"); }
        /**
         * HTS_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtsCd() { return doColumn("HTS_CD"); }
        /**
         * PRODUCT_CATEGORY_CLS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductCategoryCls() { return doColumn("PRODUCT_CATEGORY_CLS"); }
        /**
         * PROD_DT_MANAG_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ProdDtManagFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDtManagFlg() { return doColumn("PROD_DT_MANAG_FLG"); }
        /**
         * PROD_DT_LIMIT_DAYS_RCV: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDtLimitDaysRcv() { return doColumn("PROD_DT_LIMIT_DAYS_RCV"); }
        /**
         * PROD_DT_LIMIT_DAYS_SHP: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDtLimitDaysShp() { return doColumn("PROD_DT_LIMIT_DAYS_SHP"); }
        /**
         * SERIAL_MANAG_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSerialManagFlg() { return doColumn("SERIAL_MANAG_FLG"); }
        /**
         * OCR_DATE_FORMAT: {VARCHAR(30), FK to B_CLASS_DTL, classification=OcrDateFormat}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOcrDateFormat() { return doColumn("OCR_DATE_FORMAT"); }
        /**
         * INSURANCE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InsuranceFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInsuranceFlg() { return doColumn("INSURANCE_FLG"); }
        /**
         * NO_OKINAWA_FLIGHT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=NoOkinawaFlightFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNoOkinawaFlightFlg() { return doColumn("NO_OKINAWA_FLIGHT_FLG"); }
        /**
         * HEAVY_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=HeavyItemFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHeavyItemFlg() { return doColumn("HEAVY_ITEM_FLG"); }
        /**
         * LARGE_ITEM_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LargeItemFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLargeItemFlg() { return doColumn("LARGE_ITEM_FLG"); }
        /**
         * HINMOKU_GROUP_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHinmokuGroupCd() { return doColumn("HINMOKU_GROUP_CD"); }
        /**
         * CASE_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCaseTypeCd() { return doColumn("CASE_TYPE_CD"); }
        /**
         * EVALUATION_UNIT_PRICE: {DECIMAL(14, 4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEvaluationUnitPrice() { return doColumn("EVALUATION_UNIT_PRICE"); }
        /**
         * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiSpecialTypeCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogiSpecialTypeCd() { return doColumn("LOGI_SPECIAL_TYPE_CD"); }
        /**
         * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30), FK to B_CLASS_DTL, classification=LogiAttentionTypeCd}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogiAttentionTypeCd() { return doColumn("LOGI_ATTENTION_TYPE_CD"); }
        /**
         * UNIT_NM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitNm() { return doColumn("UNIT_NM"); }
        /**
         * OLD_JAN_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOldJanCd() { return doColumn("OLD_JAN_CD"); }
        /**
         * RECOMEND_LOCATION_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRecomendLocationCd() { return doColumn("RECOMEND_LOCATION_CD"); }
        /**
         * RECOMEND_LOCATION_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRecomendLocationTypeCd() { return doColumn("RECOMEND_LOCATION_TYPE_CD"); }
        /**
         * INNER_JAN_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInnerJanCd() { return doColumn("INNER_JAN_CD"); }
        /**
         * CREATE_DATE: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreateDate() { return doColumn("CREATE_DATE"); }
        /**
         * CREATE_TIME: {VARCHAR(6)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCreateTime() { return doColumn("CREATE_TIME"); }
        /**
         * FLOOR_REF_STOCK_NUM: {DECIMAL(14, 4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFloorRefStockNum() { return doColumn("FLOOR_REF_STOCK_NUM"); }
        /**
         * WM_SEND_FLG: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmSendFlg() { return doColumn("WM_SEND_FLG"); }
        /**
         * LP_SEND_FLG: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLpSendFlg() { return doColumn("LP_SEND_FLG"); }
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
            columnProductId(); // PK
            if (qyCall().qy().hasConditionQueryMShapeGrp()
                    || qyCall().qy().xgetReferrerQuery() instanceof MShapeGrpCQ) {
                columnShapeGrpId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMClient()
                    || qyCall().qy().xgetReferrerQuery() instanceof MClientCQ) {
                columnClientId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByDelFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnDelFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitDtManagFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLimitDtReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLimitDtReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLotManagFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLotManagFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLotReverseFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLotReverseFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByMergeCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnMergeCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByShippingStopFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnShippingStopFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByFreightCls()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnFreightCls(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByProdDtManagFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnProdDtManagFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLogiSpecialTypeCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLogiSpecialTypeCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByOcrDateFormat()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnOcrDateFormat(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInsuranceFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInsuranceFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByNoOkinawaFlightFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnNoOkinawaFlightFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLogiAttentionTypeCd()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLogiAttentionTypeCd(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByHeavyItemFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnHeavyItemFlg(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByLargeItemFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnLargeItemFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_product"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MShapeGrpCB.HpSpecification specifyMShapeGrp() {
            assertRelation("mShapeGrp");
            if (_mShapeGrp == null) {
                _mShapeGrp = new MShapeGrpCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMShapeGrp()
                                    , () -> _qyCall.qy().queryMShapeGrp())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mShapeGrp.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMShapeGrp()
                      , () -> xsyncQyCall().qy().queryMShapeGrp()));
                }
            }
            return _mShapeGrp;
        }
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
         * b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLimitDtManagFlg() {
            assertRelation("bClassDtlByLimitDtManagFlg");
            if (_bClassDtlByLimitDtManagFlg == null) {
                _bClassDtlByLimitDtManagFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLimitDtManagFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLimitDtManagFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLimitDtManagFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLimitDtManagFlg()));
                }
            }
            return _bClassDtlByLimitDtManagFlg;
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
         * b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLotManagFlg() {
            assertRelation("bClassDtlByLotManagFlg");
            if (_bClassDtlByLotManagFlg == null) {
                _bClassDtlByLotManagFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLotManagFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLotManagFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLotManagFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLotManagFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLotManagFlg()));
                }
            }
            return _bClassDtlByLotManagFlg;
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
         * b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByMergeCls() {
            assertRelation("bClassDtlByMergeCls");
            if (_bClassDtlByMergeCls == null) {
                _bClassDtlByMergeCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByMergeCls()
                                    , () -> _qyCall.qy().queryBClassDtlByMergeCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByMergeCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByMergeCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByMergeCls()));
                }
            }
            return _bClassDtlByMergeCls;
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
         * b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByFreightCls() {
            assertRelation("bClassDtlByFreightCls");
            if (_bClassDtlByFreightCls == null) {
                _bClassDtlByFreightCls = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByFreightCls()
                                    , () -> _qyCall.qy().queryBClassDtlByFreightCls())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByFreightCls.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByFreightCls()
                      , () -> xsyncQyCall().qy().queryBClassDtlByFreightCls()));
                }
            }
            return _bClassDtlByFreightCls;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByProdDtManagFlg() {
            assertRelation("bClassDtlByProdDtManagFlg");
            if (_bClassDtlByProdDtManagFlg == null) {
                _bClassDtlByProdDtManagFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByProdDtManagFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByProdDtManagFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByProdDtManagFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByProdDtManagFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByProdDtManagFlg()));
                }
            }
            return _bClassDtlByProdDtManagFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLogiSpecialTypeCd() {
            assertRelation("bClassDtlByLogiSpecialTypeCd");
            if (_bClassDtlByLogiSpecialTypeCd == null) {
                _bClassDtlByLogiSpecialTypeCd = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLogiSpecialTypeCd()
                                    , () -> _qyCall.qy().queryBClassDtlByLogiSpecialTypeCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLogiSpecialTypeCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLogiSpecialTypeCd()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLogiSpecialTypeCd()));
                }
            }
            return _bClassDtlByLogiSpecialTypeCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByOcrDateFormat() {
            assertRelation("bClassDtlByOcrDateFormat");
            if (_bClassDtlByOcrDateFormat == null) {
                _bClassDtlByOcrDateFormat = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByOcrDateFormat()
                                    , () -> _qyCall.qy().queryBClassDtlByOcrDateFormat())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByOcrDateFormat.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByOcrDateFormat()
                      , () -> xsyncQyCall().qy().queryBClassDtlByOcrDateFormat()));
                }
            }
            return _bClassDtlByOcrDateFormat;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInsuranceFlg() {
            assertRelation("bClassDtlByInsuranceFlg");
            if (_bClassDtlByInsuranceFlg == null) {
                _bClassDtlByInsuranceFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInsuranceFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByInsuranceFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInsuranceFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInsuranceFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInsuranceFlg()));
                }
            }
            return _bClassDtlByInsuranceFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByNoOkinawaFlightFlg() {
            assertRelation("bClassDtlByNoOkinawaFlightFlg");
            if (_bClassDtlByNoOkinawaFlightFlg == null) {
                _bClassDtlByNoOkinawaFlightFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByNoOkinawaFlightFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByNoOkinawaFlightFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByNoOkinawaFlightFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByNoOkinawaFlightFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByNoOkinawaFlightFlg()));
                }
            }
            return _bClassDtlByNoOkinawaFlightFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLogiAttentionTypeCd() {
            assertRelation("bClassDtlByLogiAttentionTypeCd");
            if (_bClassDtlByLogiAttentionTypeCd == null) {
                _bClassDtlByLogiAttentionTypeCd = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLogiAttentionTypeCd()
                                    , () -> _qyCall.qy().queryBClassDtlByLogiAttentionTypeCd())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLogiAttentionTypeCd.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLogiAttentionTypeCd()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLogiAttentionTypeCd()));
                }
            }
            return _bClassDtlByLogiAttentionTypeCd;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByHeavyItemFlg() {
            assertRelation("bClassDtlByHeavyItemFlg");
            if (_bClassDtlByHeavyItemFlg == null) {
                _bClassDtlByHeavyItemFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByHeavyItemFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByHeavyItemFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByHeavyItemFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByHeavyItemFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByHeavyItemFlg()));
                }
            }
            return _bClassDtlByHeavyItemFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByLargeItemFlg() {
            assertRelation("bClassDtlByLargeItemFlg");
            if (_bClassDtlByLargeItemFlg == null) {
                _bClassDtlByLargeItemFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByLargeItemFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByLargeItemFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByLargeItemFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByLargeItemFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByLargeItemFlg()));
                }
            }
            return _bClassDtlByLargeItemFlg;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MSetParentCB.HpSpecification specifyMSetParentAsOne() {
            assertRelation("mSetParentAsOne");
            if (_mSetParentAsOne == null) {
                _mSetParentAsOne = new MSetParentCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMSetParentAsOne()
                                    , () -> _qyCall.qy().queryMSetParentAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mSetParentAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMSetParentAsOne()
                      , () -> xsyncQyCall().qy().queryMSetParentAsOne()));
                }
            }
            return _mSetParentAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from h_stock_book where ...) as FOO_MAX} <br>
         * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bookCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bookCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, HStockBook.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<HStockBookCB, MProductCQ> derivedHStockBookList() {
            assertDerived("hStockBookList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<HStockBookCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveHStockBookList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_deposit_product where ...) as FOO_MAX} <br>
         * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     productCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     productCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MDepositProduct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MDepositProductCB, MProductCQ> derivedMDepositProductList() {
            assertDerived("mDepositProductList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MDepositProductCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMDepositProductList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_location where ...) as FOO_MAX} <br>
         * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(locationCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     locationCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     locationCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocation.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationCB, MProductCQ> derivedMLocationList() {
            assertDerived("mLocationList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_location_replenish_product where ...) as FOO_MAX} <br>
         * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(productCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     productCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     productCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MLocationReplenishProduct.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MLocationReplenishProductCB, MProductCQ> derivedMLocationReplenishProductList() {
            assertDerived("mLocationReplenishProductList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MLocationReplenishProductCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMLocationReplenishProductList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_product_shape where ...) as FOO_MAX} <br>
         * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shapeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shapeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shapeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MProductShape.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MProductShapeCB, MProductCQ> derivedMProductShapeList() {
            assertDerived("mProductShapeList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductShapeCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMProductShapeList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from m_set_structure where ...) as FOO_MAX} <br>
         * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(structureCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     structureCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     structureCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, MSetStructure.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<MSetStructureCB, MProductCQ> derivedMSetStructureList() {
            assertDerived("mSetStructureList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MSetStructureCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveMSetStructureList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_inst_b where ...) as FOO_MAX} <br>
         * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstBCB, MProductCQ> derivedTAllocInstBList() {
            assertDerived("tAllocInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_lot where ...) as FOO_MAX} <br>
         * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocLotCB, MProductCQ> derivedTAllocLotList() {
            assertDerived("tAllocLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_b where ...) as FOO_MAX} <br>
         * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, MProductCQ> derivedTInventoryBList() {
            assertDerived("tInventoryBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_keeping_lot where ...) as FOO_MAX} <br>
         * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TKeepingLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TKeepingLotCB, MProductCQ> derivedTKeepingLotList() {
            assertDerived("tKeepingLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TKeepingLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTKeepingLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_last_lot where ...) as FOO_MAX} <br>
         * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TLastLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TLastLotCB, MProductCQ> derivedTLastLotList() {
            assertDerived("tLastLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TLastLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTLastLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_lot where ...) as FOO_MAX} <br>
         * t_lot by PRODUCT_ID, named 'TLotList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(lotCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     lotCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     lotCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TLot.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TLotCB, MProductCQ> derivedTLotList() {
            assertDerived("tLotList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TLotCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTLotList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_move_inst_b where ...) as FOO_MAX} <br>
         * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, MProductCQ> derivedTMoveInstBList() {
            assertDerived("tMoveInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_nizoroe_alarm_log where ...) as FOO_MAX} <br>
         * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     logCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     logCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TNizoroeAlarmLog.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TNizoroeAlarmLogCB, MProductCQ> derivedTNizoroeAlarmLogList() {
            assertDerived("tNizoroeAlarmLogList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TNizoroeAlarmLogCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTNizoroeAlarmLogList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_operation_log where ...) as FOO_MAX} <br>
         * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(logCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     logCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     logCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TOperationLog.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TOperationLogCB, MProductCQ> derivedTOperationLogList() {
            assertDerived("tOperationLogList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TOperationLogCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTOperationLogList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_receive_plan_b where ...) as FOO_MAX} <br>
         * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TReceivePlanB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TReceivePlanBCB, MProductCQ> derivedTReceivePlanBList() {
            assertDerived("tReceivePlanBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TReceivePlanBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTReceivePlanBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_serial_no where ...) as FOO_MAX} <br>
         * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TSerialNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TSerialNoCB, MProductCQ> derivedTSerialNoList() {
            assertDerived("tSerialNoList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TSerialNoCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTSerialNoList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_b where ...) as FOO_MAX} <br>
         * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstBCB, MProductCQ> derivedTShippingInstBList() {
            assertDerived("tShippingInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstBCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_stock where ...) as FOO_MAX} <br>
         * t_stock by PRODUCT_ID, named 'TStockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     stockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     stockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockCB, MProductCQ> derivedTStockList() {
            assertDerived("tStockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_stock_book where ...) as FOO_MAX} <br>
         * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bookCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bookCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bookCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStockBook.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockBookCB, MProductCQ> derivedTStockBookList() {
            assertDerived("tStockBookList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockBookCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockBookList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_inventory_input_prod where ...) as FOO_MAX} <br>
         * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(prodCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     prodCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     prodCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtInventoryInputProd.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtInventoryInputProdCB, MProductCQ> derivedWHtInventoryInputProdList() {
            assertDerived("wHtInventoryInputProdList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtInventoryInputProdCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtInventoryInputProdList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_picking where ...) as FOO_MAX} <br>
         * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtPickingCB, MProductCQ> derivedWHtPickingList() {
            assertDerived("wHtPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtPickingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_receive_inspection where ...) as FOO_MAX} <br>
         * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspectionCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspectionCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspectionCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveInspection.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveInspectionCB, MProductCQ> derivedWHtReceiveInspectionList() {
            assertDerived("wHtReceiveInspectionList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveInspectionCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveInspectionList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_receive_no_plan_insp where ...) as FOO_MAX} <br>
         * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inspCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inspCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inspCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveNoPlanInsp.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveNoPlanInspCB, MProductCQ> derivedWHtReceiveNoPlanInspList() {
            assertDerived("wHtReceiveNoPlanInspList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveNoPlanInspCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveNoPlanInspList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_receive_store where ...) as FOO_MAX} <br>
         * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(storeCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     storeCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     storeCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtReceiveStore.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtReceiveStoreCB, MProductCQ> derivedWHtReceiveStoreList() {
            assertDerived("wHtReceiveStoreList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtReceiveStoreCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtReceiveStoreList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_shipping where ...) as FOO_MAX} <br>
         * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(shippingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     shippingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     shippingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShipping.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingCB, MProductCQ> derivedWHtShippingList() {
            assertDerived("wHtShippingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_shipping_picking where ...) as FOO_MAX} <br>
         * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtShippingPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtShippingPickingCB, MProductCQ> derivedWHtShippingPickingList() {
            assertDerived("wHtShippingPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtShippingPickingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtShippingPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_ht_total_picking where ...) as FOO_MAX} <br>
         * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(pickingCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     pickingCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     pickingCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WHtTotalPicking.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WHtTotalPickingCB, MProductCQ> derivedWHtTotalPickingList() {
            assertDerived("wHtTotalPickingList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WHtTotalPickingCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWHtTotalPickingList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_sgl_row_ship_insp_h where ...) as FOO_MAX} <br>
         * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(hCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     hCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     hCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WSglRowShipInspH.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WSglRowShipInspHCB, MProductCQ> derivedWSglRowShipInspHList() {
            assertDerived("wSglRowShipInspHList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WSglRowShipInspHCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWSglRowShipInspHList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from w_shipping_interrupt where ...) as FOO_MAX} <br>
         * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(interruptCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     interruptCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     interruptCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, WShippingInterrupt.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<WShippingInterruptCB, MProductCQ> derivedWShippingInterruptList() {
            assertDerived("wShippingInterruptList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<WShippingInterruptCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveWShippingInterruptList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MProductCB, MProductCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MProductCB> sq, MProductCQ cq, String al, DerivedReferrerOption op)
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
    public MProductCB dreamCruiseCB() {
        MProductCB cb = new MProductCB();
        cb.xsetupForDreamCruise((MProductCB) this);
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
    public HpColQyOperand<MProductCB> columnQuery(final SpecifyQuery<MProductCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MProductCB xcreateColumnQueryCB() {
        MProductCB cb = new MProductCB();
        cb.xsetupForColumnQuery((MProductCB)this);
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
    public void orScopeQuery(OrQuery<MProductCB> orCBLambda) {
        xorSQ((MProductCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MProductCB> andCBLambda) {
        xorSQAP((MProductCB)this, andCBLambda);
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
        final MProductCB cb;
        if (mainCB != null) {
            cb = (MProductCB)mainCB;
        } else {
            cb = new MProductCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MProductCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MProductCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
