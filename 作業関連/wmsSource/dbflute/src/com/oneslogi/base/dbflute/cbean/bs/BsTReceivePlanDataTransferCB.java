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
 * The base condition-bean of t_receive_plan_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class BsTReceivePlanDataTransferCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected TReceivePlanDataTransferCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTReceivePlanDataTransferCB() {
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
        return "t_receive_plan_data_transfer";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param receivePlanDataTransferId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @param receivePlanBId : PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b. (NotNull)
     * @return this. (NotNull)
     */
    public TReceivePlanDataTransferCB acceptPK(Long receivePlanDataTransferId, Long receivePlanBId) {
        assertObjectNotNull("receivePlanDataTransferId", receivePlanDataTransferId);assertObjectNotNull("receivePlanBId", receivePlanBId);
        BsTReceivePlanDataTransferCB cb = this;
        cb.query().setReceivePlanDataTransferId_Equal(receivePlanDataTransferId);cb.query().setReceivePlanBId_Equal(receivePlanBId);
        return (TReceivePlanDataTransferCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param receivePlanDataTransferId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @param receivePlanBId : PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b. (NotNull)
     */
    public void acceptPrimaryKey(Long receivePlanDataTransferId, Long receivePlanBId) {
        assertObjectNotNull("receivePlanDataTransferId", receivePlanDataTransferId);assertObjectNotNull("receivePlanBId", receivePlanBId);
        BsTReceivePlanDataTransferCB cb = this;
        cb.query().setReceivePlanDataTransferId_Equal(receivePlanDataTransferId);cb.query().setReceivePlanBId_Equal(receivePlanBId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReceivePlanDataTransferId_Asc();
        query().addOrderBy_ReceivePlanBId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReceivePlanDataTransferId_Desc();
        query().addOrderBy_ReceivePlanBId_Desc();
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
    public TReceivePlanDataTransferCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public TReceivePlanDataTransferCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected TReceivePlanDataTransferCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected TReceivePlanDataTransferCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected TReceivePlanDataTransferCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        TReceivePlanDataTransferCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected TReceivePlanDataTransferCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new TReceivePlanDataTransferCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<TReceivePlanDataTransferCB> unionCBLambda) {
        final TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TReceivePlanDataTransferCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<TReceivePlanDataTransferCB> unionCBLambda) {
        final TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final TReceivePlanDataTransferCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    protected TReceivePlanBNss _nssTReceivePlanB;
    public TReceivePlanBNss xdfgetNssTReceivePlanB() {
        if (_nssTReceivePlanB == null) { _nssTReceivePlanB = new TReceivePlanBNss(null); }
        return _nssTReceivePlanB;
    }
    /**
     * Set up relation columns to select clause. <br>
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanDataTransferBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_TReceivePlanB()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">tReceivePlanDataTransfer</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">tReceivePlanDataTransfer</span>.<span style="color: #CC4747">getTReceivePlanB()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public TReceivePlanBNss setupSelect_TReceivePlanB() {
        assertSetupSelectPurpose("tReceivePlanB");
        doSetupSelect(() -> query().queryTReceivePlanB());
        if (_nssTReceivePlanB == null || !_nssTReceivePlanB.hasConditionQuery())
        { _nssTReceivePlanB = new TReceivePlanBNss(query().queryTReceivePlanB()); }
        return _nssTReceivePlanB;
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

    public static class HpSpecification extends HpAbstractSpecification<TReceivePlanDataTransferCQ> {
        protected TReceivePlanBCB.HpSpecification _tReceivePlanB;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<TReceivePlanDataTransferCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanDataTransferId() { return doColumn("RECEIVE_PLAN_DATA_TRANSFER_ID"); }
        /**
         * RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceivePlanBId() { return doColumn("RECEIVE_PLAN_B_ID"); }
        /**
         * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr01() { return doColumn("DATA_TRANSFER_ONLY_STR01"); }
        /**
         * DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr02() { return doColumn("DATA_TRANSFER_ONLY_STR02"); }
        /**
         * DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr03() { return doColumn("DATA_TRANSFER_ONLY_STR03"); }
        /**
         * DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr04() { return doColumn("DATA_TRANSFER_ONLY_STR04"); }
        /**
         * DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr05() { return doColumn("DATA_TRANSFER_ONLY_STR05"); }
        /**
         * DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr06() { return doColumn("DATA_TRANSFER_ONLY_STR06"); }
        /**
         * DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr07() { return doColumn("DATA_TRANSFER_ONLY_STR07"); }
        /**
         * DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr08() { return doColumn("DATA_TRANSFER_ONLY_STR08"); }
        /**
         * DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr09() { return doColumn("DATA_TRANSFER_ONLY_STR09"); }
        /**
         * DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr10() { return doColumn("DATA_TRANSFER_ONLY_STR10"); }
        /**
         * DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr11() { return doColumn("DATA_TRANSFER_ONLY_STR11"); }
        /**
         * DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr12() { return doColumn("DATA_TRANSFER_ONLY_STR12"); }
        /**
         * DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr13() { return doColumn("DATA_TRANSFER_ONLY_STR13"); }
        /**
         * DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr14() { return doColumn("DATA_TRANSFER_ONLY_STR14"); }
        /**
         * DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr15() { return doColumn("DATA_TRANSFER_ONLY_STR15"); }
        /**
         * DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr16() { return doColumn("DATA_TRANSFER_ONLY_STR16"); }
        /**
         * DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr17() { return doColumn("DATA_TRANSFER_ONLY_STR17"); }
        /**
         * DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr18() { return doColumn("DATA_TRANSFER_ONLY_STR18"); }
        /**
         * DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr19() { return doColumn("DATA_TRANSFER_ONLY_STR19"); }
        /**
         * DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr20() { return doColumn("DATA_TRANSFER_ONLY_STR20"); }
        /**
         * DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr21() { return doColumn("DATA_TRANSFER_ONLY_STR21"); }
        /**
         * DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr22() { return doColumn("DATA_TRANSFER_ONLY_STR22"); }
        /**
         * DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr23() { return doColumn("DATA_TRANSFER_ONLY_STR23"); }
        /**
         * DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr24() { return doColumn("DATA_TRANSFER_ONLY_STR24"); }
        /**
         * DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr25() { return doColumn("DATA_TRANSFER_ONLY_STR25"); }
        /**
         * DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr26() { return doColumn("DATA_TRANSFER_ONLY_STR26"); }
        /**
         * DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr27() { return doColumn("DATA_TRANSFER_ONLY_STR27"); }
        /**
         * DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr28() { return doColumn("DATA_TRANSFER_ONLY_STR28"); }
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
            columnReceivePlanDataTransferId(); // PK
            columnReceivePlanBId(); // PK
        }
        @Override
        protected String getTableDbName() { return "t_receive_plan_data_transfer"; }
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
    }

    // ===================================================================================
    //                                                                        Dream Cruise
    //                                                                        ============
    /**
     * Welcome to the Dream Cruise for condition-bean deep world. <br>
     * This is very specialty so you can get the frontier spirit. Bon voyage!
     * @return The condition-bean for dream cruise, which is linked to main condition-bean.
     */
    public TReceivePlanDataTransferCB dreamCruiseCB() {
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB();
        cb.xsetupForDreamCruise((TReceivePlanDataTransferCB) this);
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
    public HpColQyOperand<TReceivePlanDataTransferCB> columnQuery(final SpecifyQuery<TReceivePlanDataTransferCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected TReceivePlanDataTransferCB xcreateColumnQueryCB() {
        TReceivePlanDataTransferCB cb = new TReceivePlanDataTransferCB();
        cb.xsetupForColumnQuery((TReceivePlanDataTransferCB)this);
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
    public void orScopeQuery(OrQuery<TReceivePlanDataTransferCB> orCBLambda) {
        xorSQ((TReceivePlanDataTransferCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<TReceivePlanDataTransferCB> andCBLambda) {
        xorSQAP((TReceivePlanDataTransferCB)this, andCBLambda);
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
        final TReceivePlanDataTransferCB cb;
        if (mainCB != null) {
            cb = (TReceivePlanDataTransferCB)mainCB;
        } else {
            cb = new TReceivePlanDataTransferCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return TReceivePlanDataTransferCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return TReceivePlanDataTransferCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
