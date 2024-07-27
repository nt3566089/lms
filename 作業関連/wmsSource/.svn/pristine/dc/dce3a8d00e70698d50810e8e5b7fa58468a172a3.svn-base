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

/**
 * The base condition-bean of e_shipping_inst.
 * @author DBFlute(AutoGenerator)
 */
public class BsEShippingInstCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected EShippingInstCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsEShippingInstCB() {
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
        return "e_shipping_inst";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param shippingInstId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public EShippingInstCB acceptPK(Long shippingInstId) {
        assertObjectNotNull("shippingInstId", shippingInstId);
        BsEShippingInstCB cb = this;
        cb.query().setShippingInstId_Equal(shippingInstId);
        return (EShippingInstCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param shippingInstId : PK, ID, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long shippingInstId) {
        assertObjectNotNull("shippingInstId", shippingInstId);
        BsEShippingInstCB cb = this;
        cb.query().setShippingInstId_Equal(shippingInstId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public EShippingInstCB acceptUniqueOf(String receiveCd, Long receiveRowId) {
        assertObjectNotNull("receiveCd", receiveCd);assertObjectNotNull("receiveRowId", receiveRowId);
        BsEShippingInstCB cb = this;
        cb.query().setReceiveCd_Equal(receiveCd);cb.query().setReceiveRowId_Equal(receiveRowId);
        return (EShippingInstCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ShippingInstId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ShippingInstId_Desc();
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
    public EShippingInstCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public EShippingInstCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected EShippingInstCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected EShippingInstCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected EShippingInstCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        EShippingInstCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected EShippingInstCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new EShippingInstCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<EShippingInstCB> unionCBLambda) {
        final EShippingInstCB cb = new EShippingInstCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final EShippingInstCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<EShippingInstCB> unionCBLambda) {
        final EShippingInstCB cb = new EShippingInstCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final EShippingInstCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
    }

    // ===================================================================================
    //                                                                         SetupSelect
    //                                                                         ===========
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

    public static class HpSpecification extends HpAbstractSpecification<EShippingInstCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<EShippingInstCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * SHIPPING_INST_ID: {PK, ID, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingInstId() { return doColumn("SHIPPING_INST_ID"); }
        /**
         * RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveCd() { return doColumn("RECEIVE_CD"); }
        /**
         * RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveRowId() { return doColumn("RECEIVE_ROW_ID"); }
        /**
         * IMPORT_FLG: {NotNull, CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnImportFlg() { return doColumn("IMPORT_FLG"); }
        /**
         * ERROR_FLG: {NotNull, CHAR(1), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * ERROR_MESSAGE_CD: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorMessageCd() { return doColumn("ERROR_MESSAGE_CD"); }
        /**
         * SHIPPING_SLIP_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingSlipNo() { return doColumn("SHIPPING_SLIP_NO"); }
        /**
         * SHIPPING_SLIP_ROW_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingSlipRowNo() { return doColumn("SHIPPING_SLIP_ROW_NO"); }
        /**
         * SALES_ORDER_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrderNo() { return doColumn("SALES_ORDER_NO"); }
        /**
         * HINMOKU_CD: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHinmokuCd() { return doColumn("HINMOKU_CD"); }
        /**
         * SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrderSlipTypeCd() { return doColumn("SALES_ORDER_SLIP_TYPE_CD"); }
        /**
         * SALES_ORDER_SLIP_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrderSlipNo() { return doColumn("SALES_ORDER_SLIP_NO"); }
        /**
         * NIZOROE_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNizoroeNo() { return doColumn("NIZOROE_NO"); }
        /**
         * SHIPPING_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingTypeCd() { return doColumn("SHIPPING_TYPE_CD"); }
        /**
         * SHIPPING_REASON_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingReasonCd() { return doColumn("SHIPPING_REASON_CD"); }
        /**
         * HINMOKU_GROUP: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHinmokuGroup() { return doColumn("HINMOKU_GROUP"); }
        /**
         * SHIPPING_NUM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingNum() { return doColumn("SHIPPING_NUM"); }
        /**
         * HINMOKU_TEXT: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHinmokuText() { return doColumn("HINMOKU_TEXT"); }
        /**
         * JAN_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJanCd() { return doColumn("JAN_CD"); }
        /**
         * UNIT_NM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitNm() { return doColumn("UNIT_NM"); }
        /**
         * EC_UNIT_NM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcUnitNm() { return doColumn("EC_UNIT_NM"); }
        /**
         * SAMPLE_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSampleTypeCd() { return doColumn("SAMPLE_TYPE_CD"); }
        /**
         * LOGI_WEIGHT_FLG: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogiWeightFlg() { return doColumn("LOGI_WEIGHT_FLG"); }
        /**
         * LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogiAttentionTypeCd() { return doColumn("LOGI_ATTENTION_TYPE_CD"); }
        /**
         * LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLogiSpecialTypeCd() { return doColumn("LOGI_SPECIAL_TYPE_CD"); }
        /**
         * DIRECT_DELIVERY_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDirectDeliveryTypeCd() { return doColumn("DIRECT_DELIVERY_TYPE_CD"); }
        /**
         * KOGUCHI_DELIVERY_FLG: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKoguchiDeliveryFlg() { return doColumn("KOGUCHI_DELIVERY_FLG"); }
        /**
         * SPLIT_DELIVERY_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSplitDeliveryTypeCd() { return doColumn("SPLIT_DELIVERY_TYPE_CD"); }
        /**
         * CARRIER_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierTypeCd() { return doColumn("CARRIER_TYPE_CD"); }
        /**
         * CARRIER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCarrierCd() { return doColumn("CARRIER_CD"); }
        /**
         * EXPRESS_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnExpressCd() { return doColumn("EXPRESS_CD"); }
        /**
         * SHIPPING_DT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingDt() { return doColumn("SHIPPING_DT"); }
        /**
         * SPECIFY_DELIVERY_DT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpecifyDeliveryDt() { return doColumn("SPECIFY_DELIVERY_DT"); }
        /**
         * SPECIFY_DELIVERY_TIME: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpecifyDeliveryTime() { return doColumn("SPECIFY_DELIVERY_TIME"); }
        /**
         * TENHANSHA_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTenhanshaCd() { return doColumn("TENHANSHA_CD"); }
        /**
         * SALES_ORG_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesOrgCd() { return doColumn("SALES_ORG_CD"); }
        /**
         * TENHANSHA_ORDER_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTenhanshaOrderNo() { return doColumn("TENHANSHA_ORDER_NO"); }
        /**
         * KOHAI_CONTRACTOR_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKohaiContractorCd() { return doColumn("KOHAI_CONTRACTOR_CD"); }
        /**
         * KOHAI_CONTRACTOR_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKohaiContractorNm() { return doColumn("KOHAI_CONTRACTOR_NM"); }
        /**
         * DESTINATION_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationCd() { return doColumn("DESTINATION_CD"); }
        /**
         * DESTINATION_NM1: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationNm1() { return doColumn("DESTINATION_NM1"); }
        /**
         * DESTINATION_NM2: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationNm2() { return doColumn("DESTINATION_NM2"); }
        /**
         * DESTINATION_NM_KANA: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationNmKana() { return doColumn("DESTINATION_NM_KANA"); }
        /**
         * DESTINATION_ZIP_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationZipCd() { return doColumn("DESTINATION_ZIP_CD"); }
        /**
         * DESTINATION_ADDRESS1: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationAddress1() { return doColumn("DESTINATION_ADDRESS1"); }
        /**
         * DESTINATION_ADDRESS2: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationAddress2() { return doColumn("DESTINATION_ADDRESS2"); }
        /**
         * DESTINATION_TEL: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationTel() { return doColumn("DESTINATION_TEL"); }
        /**
         * DESTINATION_FAX: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationFax() { return doColumn("DESTINATION_FAX"); }
        /**
         * KANJI_MESSAGE1: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage1() { return doColumn("KANJI_MESSAGE1"); }
        /**
         * KANJI_MESSAGE2: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage2() { return doColumn("KANJI_MESSAGE2"); }
        /**
         * KANJI_MESSAGE3: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage3() { return doColumn("KANJI_MESSAGE3"); }
        /**
         * KANJI_MESSAGE4: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage4() { return doColumn("KANJI_MESSAGE4"); }
        /**
         * KANJI_MESSAGE5: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage5() { return doColumn("KANJI_MESSAGE5"); }
        /**
         * KANJI_MESSAGE6: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage6() { return doColumn("KANJI_MESSAGE6"); }
        /**
         * KANJI_MESSAGE7: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage7() { return doColumn("KANJI_MESSAGE7"); }
        /**
         * KANJI_MESSAGE8: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage8() { return doColumn("KANJI_MESSAGE8"); }
        /**
         * KANJI_MESSAGE9: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage9() { return doColumn("KANJI_MESSAGE9"); }
        /**
         * KANJI_MESSAGE10: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanjiMessage10() { return doColumn("KANJI_MESSAGE10"); }
        /**
         * KANA_MESSAGE1: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage1() { return doColumn("KANA_MESSAGE1"); }
        /**
         * KANA_MESSAGE2: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage2() { return doColumn("KANA_MESSAGE2"); }
        /**
         * KANA_MESSAGE3: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage3() { return doColumn("KANA_MESSAGE3"); }
        /**
         * KANA_MESSAGE4: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage4() { return doColumn("KANA_MESSAGE4"); }
        /**
         * KANA_MESSAGE5: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage5() { return doColumn("KANA_MESSAGE5"); }
        /**
         * KANA_MESSAGE6: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage6() { return doColumn("KANA_MESSAGE6"); }
        /**
         * KANA_MESSAGE7: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage7() { return doColumn("KANA_MESSAGE7"); }
        /**
         * KANA_MESSAGE8: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage8() { return doColumn("KANA_MESSAGE8"); }
        /**
         * KANA_MESSAGE9: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage9() { return doColumn("KANA_MESSAGE9"); }
        /**
         * KANA_MESSAGE10: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKanaMessage10() { return doColumn("KANA_MESSAGE10"); }
        /**
         * DELIVERY_NOTE_SUMMARY: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDeliveryNoteSummary() { return doColumn("DELIVERY_NOTE_SUMMARY"); }
        /**
         * INVOICE_SUMMARY: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnInvoiceSummary() { return doColumn("INVOICE_SUMMARY"); }
        /**
         * UNIT_PRICE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnUnitPrice() { return doColumn("UNIT_PRICE"); }
        /**
         * EC_ORDER_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcOrderNo() { return doColumn("EC_ORDER_NO"); }
        /**
         * EC_ORDER_BRANCH_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcOrderBranchNo() { return doColumn("EC_ORDER_BRANCH_NO"); }
        /**
         * EC_PRODUCT_NM_KANJI: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEcProductNmKanji() { return doColumn("EC_PRODUCT_NM_KANJI"); }
        /**
         * ORDER_DT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderDt() { return doColumn("ORDER_DT"); }
        /**
         * KOKYAKU_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnKokyakuCd() { return doColumn("KOKYAKU_CD"); }
        /**
         * PAYMENT_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentTypeCd() { return doColumn("PAYMENT_TYPE_CD"); }
        /**
         * TOTAL_PRICE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnTotalPrice() { return doColumn("TOTAL_PRICE"); }
        /**
         * SHIPPING_FEE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingFee() { return doColumn("SHIPPING_FEE"); }
        /**
         * SEPARATE_SHIPPING_FEE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSeparateShippingFee() { return doColumn("SEPARATE_SHIPPING_FEE"); }
        /**
         * COD_FEE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCodFee() { return doColumn("COD_FEE"); }
        /**
         * SALES_TAX_RATE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSalesTaxRate() { return doColumn("SALES_TAX_RATE"); }
        /**
         * PRICE_HIDDEN_FLG: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPriceHiddenFlg() { return doColumn("PRICE_HIDDEN_FLG"); }
        /**
         * PAYMENT_HIDDEN_FLG: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPaymentHiddenFlg() { return doColumn("PAYMENT_HIDDEN_FLG"); }
        /**
         * ORDER_NO_DELIVERY_NOTE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnOrderNoDeliveryNote() { return doColumn("ORDER_NO_DELIVERY_NOTE"); }
        /**
         * POINT: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPoint() { return doColumn("POINT"); }
        /**
         * STORE_PLANT_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStorePlantCd() { return doColumn("STORE_PLANT_CD"); }
        /**
         * STORE_STORAGE_SPACE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreStorageSpaceCd() { return doColumn("STORE_STORAGE_SPACE_CD"); }
        /**
         * SHIPPING_PLANT_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingPlantCd() { return doColumn("SHIPPING_PLANT_CD"); }
        /**
         * SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnShippingStorageSpaceCd() { return doColumn("SHIPPING_STORAGE_SPACE_CD"); }
        /**
         * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotManagTypeCd() { return doColumn("LOT_MANAG_TYPE_CD"); }
        /**
         * DEAL_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDealTypeCd() { return doColumn("DEAL_TYPE_CD"); }
        /**
         * CUSTOMER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerCd() { return doColumn("CUSTOMER_CD"); }
        /**
         * CUSTOMER_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnCustomerNm() { return doColumn("CUSTOMER_NM"); }
        /**
         * DELIV_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDelivCd() { return doColumn("DELIV_CD"); }
        /**
         * EMP_ID_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmpIdCd() { return doColumn("EMP_ID_CD"); }
        /**
         * EMP_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnEmpNm() { return doColumn("EMP_NM"); }
        /**
         * IF_ID: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIfId() { return doColumn("IF_ID"); }
        /**
         * DESTINATION_PREFECTURE: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDestinationPrefecture() { return doColumn("DESTINATION_PREFECTURE"); }
        /**
         * PSAM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnPsam() { return doColumn("PSAM"); }
        /**
         * FLOOR_COMP_FLG: {CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnFloorCompFlg() { return doColumn("FLOOR_COMP_FLG"); }
        /**
         * SAP_ADD_YYYY: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddYyyy() { return doColumn("SAP_ADD_YYYY"); }
        /**
         * SAP_ADD_MM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddMm() { return doColumn("SAP_ADD_MM"); }
        /**
         * SAP_ADD_DD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddDd() { return doColumn("SAP_ADD_DD"); }
        /**
         * SAP_ADD_HH: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddHh() { return doColumn("SAP_ADD_HH"); }
        /**
         * SAP_ADD_MI: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddMi() { return doColumn("SAP_ADD_MI"); }
        /**
         * SAP_ADD_SS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddSs() { return doColumn("SAP_ADD_SS"); }
        /**
         * SAP_ADD_USER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapAddUserCd() { return doColumn("SAP_ADD_USER_CD"); }
        /**
         * SAP_UPD_YYYY: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdYyyy() { return doColumn("SAP_UPD_YYYY"); }
        /**
         * SAP_UPD_MM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdMm() { return doColumn("SAP_UPD_MM"); }
        /**
         * SAP_UPD_DD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdDd() { return doColumn("SAP_UPD_DD"); }
        /**
         * SAP_UPD_HH: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdHh() { return doColumn("SAP_UPD_HH"); }
        /**
         * SAP_UPD_MI: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdMi() { return doColumn("SAP_UPD_MI"); }
        /**
         * SAP_UPD_SS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdSs() { return doColumn("SAP_UPD_SS"); }
        /**
         * SAP_UPD_USER_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSapUpdUserCd() { return doColumn("SAP_UPD_USER_CD"); }
        /**
         * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr01() { return doColumn("DATA_TRANSFER_ONLY_STR01"); }
        /**
         * DATA_TRANSFER_ONLY_STR02: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr02() { return doColumn("DATA_TRANSFER_ONLY_STR02"); }
        /**
         * DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr03() { return doColumn("DATA_TRANSFER_ONLY_STR03"); }
        /**
         * SPARE_STR: {VARCHAR(255)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSpareStr() { return doColumn("SPARE_STR"); }
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
            columnShippingInstId(); // PK
        }
        @Override
        protected String getTableDbName() { return "e_shipping_inst"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<EShippingInstCB, EShippingInstCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<EShippingInstCB> sq, EShippingInstCQ cq, String al, DerivedReferrerOption op)
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
    public EShippingInstCB dreamCruiseCB() {
        EShippingInstCB cb = new EShippingInstCB();
        cb.xsetupForDreamCruise((EShippingInstCB) this);
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
    public HpColQyOperand<EShippingInstCB> columnQuery(final SpecifyQuery<EShippingInstCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected EShippingInstCB xcreateColumnQueryCB() {
        EShippingInstCB cb = new EShippingInstCB();
        cb.xsetupForColumnQuery((EShippingInstCB)this);
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
    public void orScopeQuery(OrQuery<EShippingInstCB> orCBLambda) {
        xorSQ((EShippingInstCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<EShippingInstCB> andCBLambda) {
        xorSQAP((EShippingInstCB)this, andCBLambda);
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
        final EShippingInstCB cb;
        if (mainCB != null) {
            cb = (EShippingInstCB)mainCB;
        } else {
            cb = new EShippingInstCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return EShippingInstCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return EShippingInstCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
