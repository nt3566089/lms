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
 * The base condition-bean of t_store_record_b.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreRecordBCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreRecordBCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreRecordBCB() {
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
        return "t_store_record_b";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param storeRecordBId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public TStoreRecordBCB acceptPK(Long storeRecordBId) {
        assertObjectNotNull("storeRecordBId", storeRecordBId);
        BsTStoreRecordBCB cb = this;
        cb.query().setStoreRecordBId_Equal(storeRecordBId);
        return (TStoreRecordBCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param storeRecordBId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long storeRecordBId) {
        assertObjectNotNull("storeRecordBId", storeRecordBId);
        BsTStoreRecordBCB cb = this;
        cb.query().setStoreRecordBId_Equal(storeRecordBId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StoreRecordBId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StoreRecordBId_Desc();
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
    public TStoreRecordBCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TStoreRecordBCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TStoreRecordBCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TStoreRecordBCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TStoreRecordBCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TStoreRecordBCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TStoreRecordBCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TStoreRecordBCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TStoreRecordBCB> unionCBLambda) {
        final TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStoreRecordBCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TStoreRecordBCB> unionCBLambda) {
        final TStoreRecordBCB cb = new TStoreRecordBCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStoreRecordBCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TStoreRecordHNss _nssTStoreRecordH;
    public TStoreRecordHNss xdfgetNssTStoreRecordH() {
        if (_nssTStoreRecordH == null) { _nssTStoreRecordH = new TStoreRecordHNss(null); }
        return _nssTStoreRecordH;
    }
    /**
     * Set up relation columns to select clause. <br>
     * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreRecordH()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreRecordB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreRecordB</span>.<span style="color: #CC4747">getTStoreRecordH()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStoreRecordHNss setupSelect_TStoreRecordH() {
        assertSetupSelectPurpose("tStoreRecordH");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreRecordHId();
        }
        doSetupSelect(() -> query().queryTStoreRecordH());
        if (_nssTStoreRecordH == null || !_nssTStoreRecordH.hasConditionQuery())
        { _nssTStoreRecordH = new TStoreRecordHNss(query().queryTStoreRecordH()); }
        return _nssTStoreRecordH;
    }

    protected TReceivePlanBNss _nssTReceivePlanB;
    public TReceivePlanBNss xdfgetNssTReceivePlanB() {
        if (_nssTReceivePlanB == null) { _nssTReceivePlanB = new TReceivePlanBNss(null); }
        return _nssTReceivePlanB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TReceivePlanB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreRecordB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreRecordB</span>.<span style="color: #CC4747">getTReceivePlanB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TReceivePlanBNss setupSelect_TReceivePlanB() {
        assertSetupSelectPurpose("tReceivePlanB");
        if (hasSpecifiedLocalColumn()) {
            specify().columnReceivePlanBId();
        }
        doSetupSelect(() -> query().queryTReceivePlanB());
        if (_nssTReceivePlanB == null || !_nssTReceivePlanB.hasConditionQuery())
        { _nssTReceivePlanB = new TReceivePlanBNss(query().queryTReceivePlanB()); }
        return _nssTReceivePlanB;
    }

    protected MLocationNss _nssMLocation;
    public MLocationNss xdfgetNssMLocation() {
        if (_nssMLocation == null) { _nssMLocation = new MLocationNss(null); }
        return _nssMLocation;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_location by my STORE_LOCATION_ID, named 'MLocation'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MLocation()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreRecordB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreRecordB</span>.<span style="color: #CC4747">getMLocation()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MLocationNss setupSelect_MLocation() {
        assertSetupSelectPurpose("mLocation");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreLocationId();
        }
        doSetupSelect(() -> query().queryMLocation());
        if (_nssMLocation == null || !_nssMLocation.hasConditionQuery())
        { _nssMLocation = new MLocationNss(query().queryMLocation()); }
        return _nssMLocation;
    }

    protected BClassDtlNss _nssBClassDtlByInputType;
    public BClassDtlNss xdfgetNssBClassDtlByInputType() {
        if (_nssBClassDtlByInputType == null) { _nssBClassDtlByInputType = new BClassDtlNss(null); }
        return _nssBClassDtlByInputType;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByInputType()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreRecordB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreRecordB</span>.<span style="color: #CC4747">getBClassDtlByInputType()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByInputType() {
        assertSetupSelectPurpose("bClassDtlByInputType");
        if (hasSpecifiedLocalColumn()) {
            specify().columnInputType();
        }
        doSetupSelect(() -> query().queryBClassDtlByInputType());
        if (_nssBClassDtlByInputType == null || !_nssBClassDtlByInputType.hasConditionQuery())
        { _nssBClassDtlByInputType = new BClassDtlNss(query().queryBClassDtlByInputType()); }
        return _nssBClassDtlByInputType;
    }

    protected BClassDtlNss _nssBClassDtlByStoreFlg;
    public BClassDtlNss xdfgetNssBClassDtlByStoreFlg() {
        if (_nssBClassDtlByStoreFlg == null) { _nssBClassDtlByStoreFlg = new BClassDtlNss(null); }
        return _nssBClassDtlByStoreFlg;
    }
    /**
     * Set up relation columns to select clause. <br>
     * b_class_dtl by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * <pre>
     * <span style="color: #0000C0">tStoreRecordBBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_BClassDtlByStoreFlg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreRecordB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreRecordB</span>.<span style="color: #CC4747">getBClassDtlByStoreFlg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public BClassDtlNss setupSelect_BClassDtlByStoreFlg() {
        assertSetupSelectPurpose("bClassDtlByStoreFlg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnStoreFlg();
        }
        doSetupSelect(() -> query().queryBClassDtlByStoreFlg());
        if (_nssBClassDtlByStoreFlg == null || !_nssBClassDtlByStoreFlg.hasConditionQuery())
        { _nssBClassDtlByStoreFlg = new BClassDtlNss(query().queryBClassDtlByStoreFlg()); }
        return _nssBClassDtlByStoreFlg;
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

    public static class HpSpecification extends HpAbstractSpecification<TStoreRecordBCQ> {
        protected TStoreRecordHCB.HpSpecification _tStoreRecordH;
        protected TReceivePlanBCB.HpSpecification _tReceivePlanB;
        protected MLocationCB.HpSpecification _mLocation;
        protected BClassDtlCB.HpSpecification _bClassDtlByInputType;
        protected BClassDtlCB.HpSpecification _bClassDtlByStoreFlg;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TStoreRecordBCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * STORE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordBId() { return doColumn("STORE_RECORD_B_ID"); }
        /**
         * STORE_RECORD_H_ID: {IX, NotNull, BIGINT(19), FK to t_store_record_h}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordHId() { return doColumn("STORE_RECORD_H_ID"); }
        /**
         * RECEIVE_PLAN_B_ID: {IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanBId() { return doColumn("RECEIVE_PLAN_B_ID"); }
        /**
         * PROCESS_NO: {NotNull, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessNo() { return doColumn("PROCESS_NO"); }
        /**
         * CLIENT_ORDER_NO: {IX, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnClientOrderNo() { return doColumn("CLIENT_ORDER_NO"); }
        /**
         * LOT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot() { return doColumn("LOT"); }
        /**
         * LIMIT_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLimitDt() { return doColumn("LIMIT_DT"); }
        /**
         * STORE_DT: {IX, NotNull, VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
        /**
         * STORE_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNum() { return doColumn("STORE_NUM"); }
        /**
         * STORE_FLG: {NotNull, CHAR(1), default=[0], FK to B_CLASS_DTL, classification=StoreFlg}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreFlg() { return doColumn("STORE_FLG"); }
        /**
         * STORE_LOCATION_ID: {IX, BIGINT(19), FK to m_location}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLocationId() { return doColumn("STORE_LOCATION_ID"); }
        /**
         * INPUT_TYPE: {VARCHAR(30), FK to B_CLASS_DTL, classification=InputType}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInputType() { return doColumn("INPUT_TYPE"); }
        /**
         * HT_STORE_INSPECTION_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtStoreInspectionDt() { return doColumn("HT_STORE_INSPECTION_DT"); }
        /**
         * HT_STORE_INSPECTION_USER_ID: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHtStoreInspectionUserId() { return doColumn("HT_STORE_INSPECTION_USER_ID"); }
        /**
         * STORE_RECORD_B_COMMENT: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordBComment() { return doColumn("STORE_RECORD_B_COMMENT"); }
        /**
         * PROD_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProdDt() { return doColumn("PROD_DT"); }
        /**
         * STORE_REASON_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreReasonCd() { return doColumn("STORE_REASON_CD"); }
        /**
         * RECEIVE_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveNo() { return doColumn("RECEIVE_NO"); }
        /**
         * PROCESS_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProcessTypeCd() { return doColumn("PROCESS_TYPE_CD"); }
        /**
         * SLIP_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipNo() { return doColumn("SLIP_NO"); }
        /**
         * RECEIVE_UNIT_NUM: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveUnitNum() { return doColumn("RECEIVE_UNIT_NUM"); }
        /**
         * STORE_RECORD_SEND_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreRecordSendFlg() { return doColumn("STORE_RECORD_SEND_FLG"); }
        /**
         * TRANSFER_SEND_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTransferSendFlg() { return doColumn("TRANSFER_SEND_FLG"); }
        /**
         * PRODUCT_STORE_STATUS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnProductStoreStatus() { return doColumn("PRODUCT_STORE_STATUS"); }
        /**
         * USER_ID: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUserId() { return doColumn("USER_ID"); }
        /**
         * CM_SEND_FLG_STORE: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCmSendFlgStore() { return doColumn("CM_SEND_FLG_STORE"); }
        /**
         * CM_SEND_FLG_TRANSFER: {CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCmSendFlgTransfer() { return doColumn("CM_SEND_FLG_TRANSFER"); }
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
            columnStoreRecordBId(); // PK
            if (qyCall().qy().hasConditionQueryTStoreRecordH()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStoreRecordHCQ) {
                columnStoreRecordHId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryTReceivePlanB()
                    || qyCall().qy().xgetReferrerQuery() instanceof TReceivePlanBCQ) {
                columnReceivePlanBId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMLocation()
                    || qyCall().qy().xgetReferrerQuery() instanceof MLocationCQ) {
                columnStoreLocationId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByInputType()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnInputType(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryBClassDtlByStoreFlg()
                    || qyCall().qy().xgetReferrerQuery() instanceof BClassDtlCQ) {
                columnStoreFlg(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "t_store_record_b"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStoreRecordHCB.HpSpecification specifyTStoreRecordH() {
            assertRelation("tStoreRecordH");
            if (_tStoreRecordH == null) {
                _tStoreRecordH = new TStoreRecordHCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStoreRecordH()
                                    , () -> _qyCall.qy().queryTStoreRecordH())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStoreRecordH.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStoreRecordH()
                      , () -> xsyncQyCall().qy().queryTStoreRecordH()));
                }
            }
            return _tStoreRecordH;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TReceivePlanBCB.HpSpecification specifyTReceivePlanB() {
            assertRelation("tReceivePlanB");
            if (_tReceivePlanB == null) {
                _tReceivePlanB = new TReceivePlanBCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTReceivePlanB()
                                    , () -> _qyCall.qy().queryTReceivePlanB())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tReceivePlanB.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTReceivePlanB()
                      , () -> xsyncQyCall().qy().queryTReceivePlanB()));
                }
            }
            return _tReceivePlanB;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_location by my STORE_LOCATION_ID, named 'MLocation'.
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
         * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByInputType() {
            assertRelation("bClassDtlByInputType");
            if (_bClassDtlByInputType == null) {
                _bClassDtlByInputType = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByInputType()
                                    , () -> _qyCall.qy().queryBClassDtlByInputType())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByInputType.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByInputType()
                      , () -> xsyncQyCall().qy().queryBClassDtlByInputType()));
                }
            }
            return _bClassDtlByInputType;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * b_class_dtl by my STORE_FLG, named 'BClassDtlByStoreFlg'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public BClassDtlCB.HpSpecification specifyBClassDtlByStoreFlg() {
            assertRelation("bClassDtlByStoreFlg");
            if (_bClassDtlByStoreFlg == null) {
                _bClassDtlByStoreFlg = new BClassDtlCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryBClassDtlByStoreFlg()
                                    , () -> _qyCall.qy().queryBClassDtlByStoreFlg())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _bClassDtlByStoreFlg.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryBClassDtlByStoreFlg()
                      , () -> xsyncQyCall().qy().queryBClassDtlByStoreFlg()));
                }
            }
            return _bClassDtlByStoreFlg;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_stock_inout where ...) as FOO_MAX} <br>
         * t_stock_inout by STORE_RECORD_B_ID, named 'TStockInoutList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(inoutCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     inoutCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     inoutCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStockInout.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockInoutCB, TStoreRecordBCQ> derivedTStockInoutList() {
            assertDerived("tStockInoutList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockInoutCB> sq, TStoreRecordBCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockInoutList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TStoreRecordBCB, TStoreRecordBCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreRecordBCB> sq, TStoreRecordBCQ cq, String al, DerivedReferrerOption op)
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
    public TStoreRecordBCB dreamCruiseCB() {
        TStoreRecordBCB cb = new TStoreRecordBCB();
        cb.xsetupForDreamCruise((TStoreRecordBCB) this);
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
    public HpColQyOperand<TStoreRecordBCB> columnQuery(final SpecifyQuery<TStoreRecordBCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TStoreRecordBCB xcreateColumnQueryCB() {
        TStoreRecordBCB cb = new TStoreRecordBCB();
        cb.xsetupForColumnQuery((TStoreRecordBCB)this);
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
    public void orScopeQuery(OrQuery<TStoreRecordBCB> orCBLambda) {
        xorSQ((TStoreRecordBCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TStoreRecordBCB> andCBLambda) {
        xorSQAP((TStoreRecordBCB)this, andCBLambda);
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
        final TStoreRecordBCB cb;
        if (mainCB != null) {
            cb = (TStoreRecordBCB)mainCB;
        } else {
            cb = new TStoreRecordBCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TStoreRecordBCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TStoreRecordBCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
