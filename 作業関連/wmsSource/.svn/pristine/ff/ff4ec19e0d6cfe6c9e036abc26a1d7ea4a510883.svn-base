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
 * The base condition-bean of m_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public class BsMKoguchiDeliveryCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected MKoguchiDeliveryCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsMKoguchiDeliveryCB() {
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
        return "m_koguchi_delivery";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param koguchiDeliveryId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public MKoguchiDeliveryCB acceptPK(Long koguchiDeliveryId) {
        assertObjectNotNull("koguchiDeliveryId", koguchiDeliveryId);
        BsMKoguchiDeliveryCB cb = this;
        cb.query().setKoguchiDeliveryId_Equal(koguchiDeliveryId);
        return (MKoguchiDeliveryCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param koguchiDeliveryId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long koguchiDeliveryId) {
        assertObjectNotNull("koguchiDeliveryId", koguchiDeliveryId);
        BsMKoguchiDeliveryCB cb = this;
        cb.query().setKoguchiDeliveryId_Equal(koguchiDeliveryId);
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_KoguchiDeliveryId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_KoguchiDeliveryId_Desc();
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
    public MKoguchiDeliveryCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public MKoguchiDeliveryCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected MKoguchiDeliveryCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected MKoguchiDeliveryCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected MKoguchiDeliveryCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        MKoguchiDeliveryCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected MKoguchiDeliveryCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new MKoguchiDeliveryCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<MKoguchiDeliveryCB> unionCBLambda) {
        final MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MKoguchiDeliveryCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<MKoguchiDeliveryCB> unionCBLambda) {
        final MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final MKoguchiDeliveryCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
    /**
     * Set up relation columns to select clause. <br>
     * m_sales_org by my SERV_SALES_ORG_ID, named 'MSalesOrg'.
     * <pre>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MSalesOrg()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mKoguchiDelivery</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mKoguchiDelivery</span>.<span style="color: #CC4747">getMSalesOrg()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     */
    public void setupSelect_MSalesOrg() {
        assertSetupSelectPurpose("mSalesOrg");
        if (hasSpecifiedLocalColumn()) {
            specify().columnServSalesOrgId();
        }
        doSetupSelect(() -> query().queryMSalesOrg());
    }

    protected MCarrierNss _nssMCarrier;
    public MCarrierNss xdfgetNssMCarrier() {
        if (_nssMCarrier == null) { _nssMCarrier = new MCarrierNss(null); }
        return _nssMCarrier;
    }
    /**
     * Set up relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * <pre>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.selectEntity(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.<span style="color: #CC4747">setupSelect_MCarrier()</span>; <span style="color: #3F7E5E">// ...().with[nested-relation]()</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * }).alwaysPresent(<span style="color: #553000">mKoguchiDelivery</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">mKoguchiDelivery</span>.<span style="color: #CC4747">getMCarrier()</span>; <span style="color: #3F7E5E">// you can get by using SetupSelect</span>
     * });
     * </pre>
     * @return The set-upper of nested relation. {setupSelect...().with[nested-relation]} (NotNull)
     */
    public MCarrierNss setupSelect_MCarrier() {
        assertSetupSelectPurpose("mCarrier");
        if (hasSpecifiedLocalColumn()) {
            specify().columnCarrierId();
        }
        doSetupSelect(() -> query().queryMCarrier());
        if (_nssMCarrier == null || !_nssMCarrier.hasConditionQuery())
        { _nssMCarrier = new MCarrierNss(query().queryMCarrier()); }
        return _nssMCarrier;
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

    public static class HpSpecification extends HpAbstractSpecification<MKoguchiDeliveryCQ> {
        protected MSalesOrgCB.HpSpecification _mSalesOrg;
        protected MCarrierCB.HpSpecification _mCarrier;
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<MKoguchiDeliveryCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKoguchiDeliveryId() { return doColumn("KOGUCHI_DELIVERY_ID"); }
        /**
         * BASE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnBaseCd() { return doColumn("BASE_CD"); }
        /**
         * SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnServSalesOrgId() { return doColumn("SERV_SALES_ORG_ID"); }
        /**
         * SERV_SALES_ORG_CD: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnServSalesOrgCd() { return doColumn("SERV_SALES_ORG_CD"); }
        /**
         * SERV_SALES_ORG_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnServSalesOrgNm() { return doColumn("SERV_SALES_ORG_NM"); }
        /**
         * DIRECT_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectFlg() { return doColumn("DIRECT_FLG"); }
        /**
         * URGENT_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUrgentFlg() { return doColumn("URGENT_FLG"); }
        /**
         * DELIVERY_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryFlg() { return doColumn("DELIVERY_FLG"); }
        /**
         * KOGUCHI_DELIVERY_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKoguchiDeliveryCd() { return doColumn("KOGUCHI_DELIVERY_CD"); }
        /**
         * KOGUCHI_DELIVERY_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKoguchiDeliveryNm() { return doColumn("KOGUCHI_DELIVERY_NM"); }
        /**
         * UNI_DELIVERY_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUniDeliveryCd() { return doColumn("UNI_DELIVERY_CD"); }
        /**
         * UNI_DELIVERY_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUniDeliveryNm() { return doColumn("UNI_DELIVERY_NM"); }
        /**
         * FW_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFwTypeCd() { return doColumn("FW_TYPE_CD"); }
        /**
         * MCA_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnMcaTypeCd() { return doColumn("MCA_TYPE_CD"); }
        /**
         * YOUHIN_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnYouhinTypeCd() { return doColumn("YOUHIN_TYPE_CD"); }
        /**
         * CARRIER_ID: {IX, BIGINT(19), FK to m_carrier}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierId() { return doColumn("CARRIER_ID"); }
        /**
         * REQ_SALES_ORG_ID: {BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgId() { return doColumn("REQ_SALES_ORG_ID"); }
        /**
         * REQ_SALES_ORG_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgCd() { return doColumn("REQ_SALES_ORG_CD"); }
        /**
         * REQ_SALES_ORG_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgNm() { return doColumn("REQ_SALES_ORG_NM"); }
        /**
         * REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgBranchNm() { return doColumn("REQ_SALES_ORG_BRANCH_NM"); }
        /**
         * REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgAddress1() { return doColumn("REQ_SALES_ORG_ADDRESS1"); }
        /**
         * REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgAddress2() { return doColumn("REQ_SALES_ORG_ADDRESS2"); }
        /**
         * REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgZipCd() { return doColumn("REQ_SALES_ORG_ZIP_CD"); }
        /**
         * REQ_SALES_ORG_TEL_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgTelNo() { return doColumn("REQ_SALES_ORG_TEL_NO"); }
        /**
         * REQ_SALES_ORG_FAX_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReqSalesOrgFaxNo() { return doColumn("REQ_SALES_ORG_FAX_NO"); }
        /**
         * REMARK1: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRemark1() { return doColumn("REMARK1"); }
        /**
         * REMARK2: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRemark2() { return doColumn("REMARK2"); }
        /**
         * REMARK3: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRemark3() { return doColumn("REMARK3"); }
        /**
         * REMARK4: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnRemark4() { return doColumn("REMARK4"); }
        /**
         * INDV_OUT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIndvOut() { return doColumn("INDV_OUT"); }
        /**
         * INVOICE_SUMMARY: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceSummary() { return doColumn("INVOICE_SUMMARY"); }
        /**
         * PSAM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPsam() { return doColumn("PSAM"); }
        /**
         * ABOLISH_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnAbolishDt() { return doColumn("ABOLISH_DT"); }
        /**
         * FLOOR_COMP_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFloorCompFlg() { return doColumn("FLOOR_COMP_FLG"); }
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
            columnKoguchiDeliveryId(); // PK
            if (qyCall().qy().hasConditionQueryMSalesOrg()
                    || qyCall().qy().xgetReferrerQuery() instanceof MSalesOrgCQ) {
                columnServSalesOrgId(); // FK or one-to-one referrer
            }
            if (qyCall().qy().hasConditionQueryMCarrier()
                    || qyCall().qy().xgetReferrerQuery() instanceof MCarrierCQ) {
                columnCarrierId(); // FK or one-to-one referrer
            }
        }
        @Override
        protected String getTableDbName() { return "m_koguchi_delivery"; }
        /**
         * Prepare to specify functions about relation table. <br>
         * m_sales_org by my SERV_SALES_ORG_ID, named 'MSalesOrg'.
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
         * Prepare to specify functions about relation table. <br>
         * m_carrier by my CARRIER_ID, named 'MCarrier'.
         * @return The instance for specification for relation table to specify. (NotNull)
         */
        public MCarrierCB.HpSpecification specifyMCarrier() {
            assertRelation("mCarrier");
            if (_mCarrier == null) {
                _mCarrier = new MCarrierCB.HpSpecification(_baseCB
                    , xcreateSpQyCall(() -> _qyCall.has() && _qyCall.qy().hasConditionQueryMCarrier()
                                    , () -> _qyCall.qy().queryMCarrier())
                    , _purpose, _dbmetaProvider, xgetSDRFnFc());
                if (xhasSyncQyCall()) { // inherits it
                    _mCarrier.xsetSyncQyCall(xcreateSpQyCall(
                        () -> xsyncQyCall().has() && xsyncQyCall().qy().hasConditionQueryMCarrier()
                      , () -> xsyncQyCall().qy().queryMCarrier()));
                }
            }
            return _mCarrier;
        }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<MKoguchiDeliveryCB, MKoguchiDeliveryCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<MKoguchiDeliveryCB> sq, MKoguchiDeliveryCQ cq, String al, DerivedReferrerOption op)
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
    public MKoguchiDeliveryCB dreamCruiseCB() {
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB();
        cb.xsetupForDreamCruise((MKoguchiDeliveryCB) this);
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
    public HpColQyOperand<MKoguchiDeliveryCB> columnQuery(final SpecifyQuery<MKoguchiDeliveryCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected MKoguchiDeliveryCB xcreateColumnQueryCB() {
        MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB();
        cb.xsetupForColumnQuery((MKoguchiDeliveryCB)this);
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
    public void orScopeQuery(OrQuery<MKoguchiDeliveryCB> orCBLambda) {
        xorSQ((MKoguchiDeliveryCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<MKoguchiDeliveryCB> andCBLambda) {
        xorSQAP((MKoguchiDeliveryCB)this, andCBLambda);
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
        final MKoguchiDeliveryCB cb;
        if (mainCB != null) {
            cb = (MKoguchiDeliveryCB)mainCB;
        } else {
            cb = new MKoguchiDeliveryCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return MKoguchiDeliveryCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return MKoguchiDeliveryCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
