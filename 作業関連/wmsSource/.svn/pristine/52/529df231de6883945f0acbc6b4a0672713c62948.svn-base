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
 * The base condition-bean of er_receive_report.
 * @author DBFlute(AutoGenerator)
 */
public class BsErReceiveReportCB extends AbstractConditionBean {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected ErReceiveReportCQ _conditionQuery;

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsErReceiveReportCB() {
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
        return "er_receive_report";
    }

    // ===================================================================================
    //                                                                 PrimaryKey Handling
    //                                                                 ===================
    /**
     * Accept the query condition of primary key as equal.
     * @param receiveReportId : PK, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public ErReceiveReportCB acceptPK(Long receiveReportId) {
        assertObjectNotNull("receiveReportId", receiveReportId);
        BsErReceiveReportCB cb = this;
        cb.query().setReceiveReportId_Equal(receiveReportId);
        return (ErReceiveReportCB)this;
    }

    /**
     * Accept the query condition of primary key as equal. (old style)
     * @param receiveReportId : PK, NotNull, BIGINT(19). (NotNull)
     */
    public void acceptPrimaryKey(Long receiveReportId) {
        assertObjectNotNull("receiveReportId", receiveReportId);
        BsErReceiveReportCB cb = this;
        cb.query().setReceiveReportId_Equal(receiveReportId);
    }

    /**
     * Accept the query condition of unique key as equal.
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     * @return this. (NotNull)
     */
    public ErReceiveReportCB acceptUniqueOf(String receiveCd, Long receiveRowId) {
        assertObjectNotNull("receiveCd", receiveCd);assertObjectNotNull("receiveRowId", receiveRowId);
        BsErReceiveReportCB cb = this;
        cb.query().setReceiveCd_Equal(receiveCd);cb.query().setReceiveRowId_Equal(receiveRowId);
        return (ErReceiveReportCB)this;
    }

    public ConditionBean addOrderBy_PK_Asc() {
        query().addOrderBy_ReceiveReportId_Asc();
        return this;
    }

    public ConditionBean addOrderBy_PK_Desc() {
        query().addOrderBy_ReceiveReportId_Desc();
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
    public ErReceiveReportCQ query() {
        assertQueryPurpose(); // assert only when user-public query
        return doGetConditionQuery();
    }

    public ErReceiveReportCQ xdfgetConditionQuery() { // public for parameter comment and internal
        return doGetConditionQuery();
    }

    protected ErReceiveReportCQ doGetConditionQuery() {
        if (_conditionQuery == null) {
            _conditionQuery = createLocalCQ();
        }
        return _conditionQuery;
    }

    protected ErReceiveReportCQ createLocalCQ() {
        return xcreateCQ(null, getSqlClause(), getSqlClause().getBasePointAliasName(), 0);
    }

    protected ErReceiveReportCQ xcreateCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        ErReceiveReportCQ cq = xnewCQ(childQuery, sqlClause, aliasName, nestLevel);
        cq.xsetBaseCB(this);
        return cq;
    }

    protected ErReceiveReportCQ xnewCQ(ConditionQuery childQuery, SqlClause sqlClause, String aliasName, int nestLevel) {
        return new ErReceiveReportCQ(childQuery, sqlClause, aliasName, nestLevel);
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
    public void union(UnionQuery<ErReceiveReportCB> unionCBLambda) {
        final ErReceiveReportCB cb = new ErReceiveReportCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ErReceiveReportCQ cq = cb.query(); query().xsetUnionQuery(cq);
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
    public void unionAll(UnionQuery<ErReceiveReportCB> unionCBLambda) {
        final ErReceiveReportCB cb = new ErReceiveReportCB(); cb.xsetupForUnion(this); xsyncUQ(cb);
        try { lock(); unionCBLambda.query(cb); } finally { unlock(); } xsaveUCB(cb);
        final ErReceiveReportCQ cq = cb.query(); query().xsetUnionAllQuery(cq);
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

    public static class HpSpecification extends HpAbstractSpecification<ErReceiveReportCQ> {
        public HpSpecification(ConditionBean baseCB, HpSpQyCall<ErReceiveReportCQ> qyCall
                             , HpCBPurpose purpose, DBMetaProvider dbmetaProvider
                             , HpSDRFunctionFactory sdrFuncFactory)
        { super(baseCB, qyCall, purpose, dbmetaProvider, sdrFuncFactory); }
        /**
         * RECEIVE_REPORT_ID: {PK, NotNull, BIGINT(19)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveReportId() { return doColumn("RECEIVE_REPORT_ID"); }
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
         * ERROR_FLG: {NotNull, CHAR(1)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorFlg() { return doColumn("ERROR_FLG"); }
        /**
         * ERROR_MESSAGE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnErrorMessageCd() { return doColumn("ERROR_MESSAGE_CD"); }
        /**
         * STORE_SLIP_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreSlipNo() { return doColumn("STORE_SLIP_NO"); }
        /**
         * STORE_SLIP_ROW_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreSlipRowNo() { return doColumn("STORE_SLIP_ROW_NO"); }
        /**
         * SLIP_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSlipTypeCd() { return doColumn("SLIP_TYPE_CD"); }
        /**
         * SN: {BIGINT(19), default=[0]}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSn() { return doColumn("SN"); }
        /**
         * IF_ID: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIfId() { return doColumn("IF_ID"); }
        /**
         * IF_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnIfNo() { return doColumn("IF_NO"); }
        /**
         * HINMOKU_CD: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnHinmokuCd() { return doColumn("HINMOKU_CD"); }
        /**
         * JAN_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnJanCd() { return doColumn("JAN_CD"); }
        /**
         * STORE_REASON_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreReasonCd() { return doColumn("STORE_REASON_CD"); }
        /**
         * STORE_DT: {VARCHAR(8)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreDt() { return doColumn("STORE_DT"); }
        /**
         * NUM: {DECIMAL(14, 4)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnNum() { return doColumn("NUM"); }
        /**
         * LOT_MANAG_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLotManagTypeCd() { return doColumn("LOT_MANAG_TYPE_CD"); }
        /**
         * LOT: {VARCHAR(100)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnLot() { return doColumn("LOT"); }
        /**
         * RECEIVE_NO: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnReceiveNo() { return doColumn("RECEIVE_NO"); }
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
         * STORE_PLANT_CD: {NotNull, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStorePlantCd() { return doColumn("STORE_PLANT_CD"); }
        /**
         * STORE_STORAGE_SPACE_CD: {NotNull, VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnStoreStorageSpaceCd() { return doColumn("STORE_STORAGE_SPACE_CD"); }
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
         * SANSHA_DELIVERY_SLIP_NO1: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnSanshaDeliverySlipNo1() { return doColumn("SANSHA_DELIVERY_SLIP_NO1"); }
        /**
         * DATA_TYPE_CD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTypeCd() { return doColumn("DATA_TYPE_CD"); }
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
         * WMS_ADD_YYYY: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddYyyy() { return doColumn("WMS_ADD_YYYY"); }
        /**
         * WMS_ADD_MM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddMm() { return doColumn("WMS_ADD_MM"); }
        /**
         * WMS_ADD_DD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddDd() { return doColumn("WMS_ADD_DD"); }
        /**
         * WMS_ADD_HH: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddHh() { return doColumn("WMS_ADD_HH"); }
        /**
         * WMS_ADD_MI: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddMi() { return doColumn("WMS_ADD_MI"); }
        /**
         * WMS_ADD_SS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddSs() { return doColumn("WMS_ADD_SS"); }
        /**
         * WMS_ADD_USER_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsAddUserNm() { return doColumn("WMS_ADD_USER_NM"); }
        /**
         * WMS_UPD_YYYY: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdYyyy() { return doColumn("WMS_UPD_YYYY"); }
        /**
         * WMS_UPD_MM: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdMm() { return doColumn("WMS_UPD_MM"); }
        /**
         * WMS_UPD_DD: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdDd() { return doColumn("WMS_UPD_DD"); }
        /**
         * WMS_UPD_HH: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdHh() { return doColumn("WMS_UPD_HH"); }
        /**
         * WMS_UPD_MI: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdMi() { return doColumn("WMS_UPD_MI"); }
        /**
         * WMS_UPD_SS: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdSs() { return doColumn("WMS_UPD_SS"); }
        /**
         * WMS_UPD_USER_NM: {VARCHAR(60)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnWmsUpdUserNm() { return doColumn("WMS_UPD_USER_NM"); }
        /**
         * DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)}
         * @return The information object of specified column. (NotNull)
         */
        public SpecifiedColumn columnDataTransferOnlyStr01() { return doColumn("DATA_TRANSFER_ONLY_STR01"); }
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
            columnReceiveReportId(); // PK
        }
        @Override
        protected String getTableDbName() { return "er_receive_report"; }
        /**
         * Prepare for (Specify)MyselfDerived (SubQuery).
         * @return The object to set up a function for myself table. (NotNull)
         */
        public HpSDRFunction<ErReceiveReportCB, ErReceiveReportCQ> myselfDerived() {
            assertDerived("myselfDerived"); if (xhasSyncQyCall()) { xsyncQyCall().qy(); } // for sync (for example, this in ColumnQuery)
            return cHSDRF(_baseCB, _qyCall.qy(), (String fn, SubQuery<ErReceiveReportCB> sq, ErReceiveReportCQ cq, String al, DerivedReferrerOption op)
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
    public ErReceiveReportCB dreamCruiseCB() {
        ErReceiveReportCB cb = new ErReceiveReportCB();
        cb.xsetupForDreamCruise((ErReceiveReportCB) this);
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
    public HpColQyOperand<ErReceiveReportCB> columnQuery(final SpecifyQuery<ErReceiveReportCB> colCBLambda) {
        return xcreateColQyOperand((rightSp, operand) -> {
            return xcolqy(xcreateColumnQueryCB(), xcreateColumnQueryCB(), colCBLambda, rightSp, operand);
        });
    }

    protected ErReceiveReportCB xcreateColumnQueryCB() {
        ErReceiveReportCB cb = new ErReceiveReportCB();
        cb.xsetupForColumnQuery((ErReceiveReportCB)this);
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
    public void orScopeQuery(OrQuery<ErReceiveReportCB> orCBLambda) {
        xorSQ((ErReceiveReportCB)this, orCBLambda);
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
    public void orScopeQueryAndPart(AndQuery<ErReceiveReportCB> andCBLambda) {
        xorSQAP((ErReceiveReportCB)this, andCBLambda);
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
        final ErReceiveReportCB cb;
        if (mainCB != null) {
            cb = (ErReceiveReportCB)mainCB;
        } else {
            cb = new ErReceiveReportCB();
        }
        specify().xsetSyncQyCall(xcreateSpQyCall(() -> true, () -> cb.query()));
    }

    // ===================================================================================
    //                                                                            Internal
    //                                                                            ========
    // very internal (for suppressing warn about 'Not Use Import')
    protected String xgetConditionBeanClassNameInternally() { return ErReceiveReportCB.class.getName(); }
    protected String xgetConditionQueryClassNameInternally() { return ErReceiveReportCQ.class.getName(); }
    protected String xgetSubQueryClassNameInternally() { return SubQuery.class.getName(); }
    protected String xgetConditionOptionClassNameInternally() { return ConditionOption.class.getName(); }
}
