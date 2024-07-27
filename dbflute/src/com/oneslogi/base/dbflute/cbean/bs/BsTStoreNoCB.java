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
 * The base condition-bean of t_store_no.
 * @author DBFlute(AutoGenerator)
 */
public class BsTStoreNoCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TStoreNoCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTStoreNoCB() {
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
        return "t_store_no";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param storeNoId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public TStoreNoCB acceptPK(Long storeNoId) {
        assertObjectNotNull("storeNoId", storeNoId);
        BsTStoreNoCB cb = this;
        cb.query().setStoreNoId_Equal(storeNoId);
        return (TStoreNoCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param storeNoId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long storeNoId) {
        assertObjectNotNull("storeNoId", storeNoId);
        BsTStoreNoCB cb = this;
        cb.query().setStoreNoId_Equal(storeNoId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param storeLabelNo : UQ, NotNull, VARCHAR(30). (NotNull)
     * @return this. (NotNull)
     */
    public TStoreNoCB acceptUniqueOf(String storeLabelNo) {
        assertObjectNotNull("storeLabelNo", storeLabelNo);
        BsTStoreNoCB cb = this;
        cb.query().setStoreLabelNo_Equal(storeLabelNo);
        return (TStoreNoCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_StoreNoId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_StoreNoId_Desc();
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
    public TStoreNoCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TStoreNoCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TStoreNoCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TStoreNoCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TStoreNoCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TStoreNoCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TStoreNoCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TStoreNoCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TStoreNoCB> unionCBLambda) {
        final TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStoreNoCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TStoreNoCB> unionCBLambda) {
        final TStoreNoCB cb = new TStoreNoCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TStoreNoCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TStoreNoNss _nssTStoreNoSelf;
    public TStoreNoNss xdfgetNssTStoreNoSelf() {
        if (_nssTStoreNoSelf == null) { _nssTStoreNoSelf = new TStoreNoNss(null); }
        return _nssTStoreNoSelf;
    }
    /**
     * Set up relation columns to select clause. <br>
     * t_store_no by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreNoSelf()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreNo</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTStoreNoSelf()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStoreNoNss setupSelect_TStoreNoSelf() {
        assertSetupSelectPurpose("tStoreNoSelf");
        if (hasSpecifiedLocalColumn()) {
            specify().columnOldStoreNumId();
        }
        doSetupSelect(() -> query().queryTStoreNoSelf());
        if (_nssTStoreNoSelf == null || !_nssTStoreNoSelf.hasConditionQuery())
        { _nssTStoreNoSelf = new TStoreNoNss(query().queryTStoreNoSelf()); }
        return _nssTStoreNoSelf;
    }

    protected MCustomerNss _nssMCustomer;
    public MCustomerNss xdfgetNssMCustomer() {
        if (_nssMCustomer == null) { _nssMCustomer = new MCustomerNss(null); }
        return _nssMCustomer;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_customer by my SUPPLIER_ID, named 'MCustomer'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCustomer()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreNo</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getMCustomer()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCustomerNss setupSelect_MCustomer() {
        assertSetupSelectPurpose("mCustomer");
        if (hasSpecifiedLocalColumn()) {
            specify().columnSupplierId();
        }
        doSetupSelect(() -> query().queryMCustomer());
        if (_nssMCustomer == null || !_nssMCustomer.hasConditionQuery())
        { _nssMCustomer = new MCustomerNss(query().queryMCustomer()); }
        return _nssMCustomer;
    }

    protected TStoreNoRNss _nssTStoreNoRAsOne;
    public TStoreNoRNss xdfgetNssTStoreNoRAsOne() {
        if (_nssTStoreNoRAsOne == null) { _nssTStoreNoRAsOne = new TStoreNoRNss(null); }
        return _nssTStoreNoRAsOne;
    }
    /**
     * Set up relation columns to select clause. <br>
     * t_store_no_r by STORE_NO_ID, named 'TStoreNoRAsOne'.
     * <pre>
     * <span style="color: #0000C0">tStoreNoBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TStoreNoRAsOne()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tStoreNo</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tStoreNo</span>.<span style="color: #CC4747">getTStoreNoRAsOne()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TStoreNoRNss setupSelect_TStoreNoRAsOne() {
        assertSetupSelectPurpose("tStoreNoRAsOne");
        doSetupSelect(() -> query().queryTStoreNoRAsOne());
        if (_nssTStoreNoRAsOne == null || !_nssTStoreNoRAsOne.hasConditionQuery())
        { _nssTStoreNoRAsOne = new TStoreNoRNss(query().queryTStoreNoRAsOne()); }
        return _nssTStoreNoRAsOne;
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

    public static class HpSpecification extends HpAbstractSpecification<TStoreNoCQ> {
        protected TStoreNoCB.HpSpecification _tStoreNoSelf;
        protected MCustomerCB.HpSpecification _mCustomer;
        protected TStoreNoRCB.HpSpecification _tStoreNoRAsOne;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TStoreNoCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * STORE_NO_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreNoId() { return doColumn("STORE_NO_ID"); }
        /**
         * STORE_LABEL_NO: {UQ, NotNull, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreLabelNo() { return doColumn("STORE_LABEL_NO"); }
        /**
         * OLD_STORE_NUM_ID: {IX, BIGINT(19), FK to t_store_no}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOldStoreNumId() { return doColumn("OLD_STORE_NUM_ID"); }
        /**
         * SUPPLIER_ID: {IX, BIGINT(19), FK to m_customer}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSupplierId() { return doColumn("SUPPLIER_ID"); }
        /**
         * STORE_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
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
            columnStoreNoId(); // PK
            if (qyCall().qy().hasConditionQueryTStoreNoSelf()
                    || qyCall().qy().xgetReferrerQuery() instanceof TStoreNoCQ) {
                columnOldStoreNumId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCustomer()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCustomerCQ) {
                columnSupplierId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "t_store_no"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * t_store_no by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStoreNoCB.HpSpecification specifyTStoreNoSelf() {
            assertRelation("tStoreNoSelf");
            if (_tStoreNoSelf == null) {
                _tStoreNoSelf = new TStoreNoCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStoreNoSelf()
                                    , () -> _qyCall.qy().queryTStoreNoSelf())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStoreNoSelf.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStoreNoSelf()
                      , () -> xsyncQyCall().qy().queryTStoreNoSelf()));
                }
            }
            return _tStoreNoSelf;
        }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_customer by my SUPPLIER_ID, named 'MCustomer'.
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
         * t_store_no_r by STORE_NO_ID, named 'TStoreNoRAsOne'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public TStoreNoRCB.HpSpecification specifyTStoreNoRAsOne() {
            assertRelation("tStoreNoRAsOne");
            if (_tStoreNoRAsOne == null) {
                _tStoreNoRAsOne = new TStoreNoRCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryTStoreNoRAsOne()
                                    , () -> _qyCall.qy().queryTStoreNoRAsOne())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _tStoreNoRAsOne.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryTStoreNoRAsOne()
                      , () -> xsyncQyCall().qy().queryTStoreNoRAsOne()));
                }
            }
            return _tStoreNoRAsOne;
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_alloc_inst_b where ...) as FOO_MAX} <br>
         * t_alloc_inst_b by STORE_NO_ID, named 'TAllocInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TAllocInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TAllocInstBCB, TStoreNoCQ> derivedTAllocInstBList() {
            assertDerived("tAllocInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TAllocInstBCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTAllocInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_inventory_b where ...) as FOO_MAX} <br>
         * t_inventory_b by STORE_NO_ID, named 'TInventoryBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TInventoryB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TInventoryBCB, TStoreNoCQ> derivedTInventoryBList() {
            assertDerived("tInventoryBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TInventoryBCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTInventoryBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_move_inst_b where ...) as FOO_MAX} <br>
         * t_move_inst_b by STORE_NO_ID, named 'TMoveInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TMoveInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TMoveInstBCB, TStoreNoCQ> derivedTMoveInstBList() {
            assertDerived("tMoveInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TMoveInstBCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTMoveInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_shipping_inst_b where ...) as FOO_MAX} <br>
         * t_shipping_inst_b by STORE_NO_ID, named 'TShippingInstBList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(bCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     bCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     bCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TShippingInstB.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TShippingInstBCB, TStoreNoCQ> derivedTShippingInstBList() {
            assertDerived("tShippingInstBList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TShippingInstBCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTShippingInstBList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_stock where ...) as FOO_MAX} <br>
         * t_stock by STORE_NO_ID, named 'TStockList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(stockCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     stockCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     stockCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStock.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStockCB, TStoreNoCQ> derivedTStockList() {
            assertDerived("tStockList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStockCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStockList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)DerivedReferrer (correlated sub-query). <br>
         * {select max(FOO) from t_store_no where ...) as FOO_MAX} <br>
         * t_store_no by OLD_STORE_NUM_ID, named 'TStoreNoSelfList'.
         * <pre>
         * cb.specify().<span style="color: #CC4747">derived${relationMethodIdentityName}()</span>.<span style="color: #CC4747">max</span>(noCB <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
         *     noCB.specify().<span style="color: #CC4747">column...</span> <span style="color: #3F7E5E">// derived column by function</span>
         *     noCB.query().set... <span style="color: #3F7E5E">// referrer condition</span>
         * }, TStoreNo.<span style="color: #CC4747">ALIAS_foo...</span>);
         * </pre>
         * @return The object to set up a function for referrer table. (NotNull)
         */
        public HpSDRFunction<TStoreNoCB, TStoreNoCQ> derivedTStoreNoSelfList() {
            assertDerived("tStoreNoSelfList"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreNoCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
                    -> cq.xsderiveTStoreNoSelfList(fn, sq, al, op), _dbmetaProvider);
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<TStoreNoCB, TStoreNoCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<TStoreNoCB> sq, TStoreNoCQ cq, String al, DerivedReferrerOption op)
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
    public TStoreNoCB dreamCruiseCB() {
        TStoreNoCB cb = new TStoreNoCB();
        cb.xsetupForDreamCruise((TStoreNoCB) this);
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
    public HpColQyOperand<TStoreNoCB> columnQuery(final SpecifyQuery<TStoreNoCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TStoreNoCB xcreateColumnQueryCB() {
        TStoreNoCB cb = new TStoreNoCB();
        cb.xsetupForColumnQuery((TStoreNoCB)this);
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
    public void orScopeQuery(OrQuery<TStoreNoCB> orCBLambda) {
        xorSQ((TStoreNoCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TStoreNoCB> andCBLambda) {
        xorSQAP((TStoreNoCB)this, andCBLambda);
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
        final TStoreNoCB cb;
        if (mainCB != null) {
            cb = (TStoreNoCB)mainCB;
        } else {
            cb = new TStoreNoCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TStoreNoCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TStoreNoCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
