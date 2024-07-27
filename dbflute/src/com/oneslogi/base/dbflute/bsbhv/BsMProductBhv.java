package com.oneslogi.base.dbflute.bsbhv;

import java.util.List;

import org.dbflute.*;
import org.dbflute.bhv.*;
import org.dbflute.bhv.readable.*;
import org.dbflute.bhv.writable.*;
import org.dbflute.bhv.referrer.*;
import org.dbflute.cbean.*;
import org.dbflute.cbean.chelper.HpSLSFunction;
import org.dbflute.cbean.result.*;
import org.dbflute.cbean.scoping.SpecifyQuery;
import org.dbflute.exception.*;
import org.dbflute.optional.OptionalEntity;
import org.dbflute.outsidesql.executor.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.bsbhv.loader.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.bsentity.dbmeta.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The behavior of m_product as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, CLIENT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_ID, NMFC_CODE, FREIGHT_CLS, COUNNTRY_OF_ORIGIN, UNIT_VAL, HTS_CD, PRODUCT_CATEGORY_CLS, PROD_DT_MANAG_FLG, PROD_DT_LIMIT_DAYS_RCV, PROD_DT_LIMIT_DAYS_SHP, SERIAL_MANAG_FLG, OCR_DATE_FORMAT, INSURANCE_FLG, NO_OKINAWA_FLIGHT_FLG, HEAVY_ITEM_FLG, LARGE_ITEM_FLG, HINMOKU_GROUP_CD, CASE_TYPE_CD, EVALUATION_UNIT_PRICE, LOGI_SPECIAL_TYPE_CD, LOGI_ATTENTION_TYPE_CD, UNIT_NM, OLD_JAN_CD, RECOMEND_LOCATION_CD, RECOMEND_LOCATION_TYPE_CD, INNER_JAN_CD, CREATE_DATE, CREATE_TIME, FLOOR_REF_STOCK_NUM, WM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape_grp, m_client, b_class_dtl(ByDelFlg), m_set_parent(AsOne)
 *
 * [referrer table]
 *     h_stock_book, m_deposit_product, m_location, m_location_replenish_product, m_product_shape, m_set_structure, t_alloc_inst_b, t_alloc_lot, t_inventory_b, t_keeping_lot, t_last_lot, t_lot, t_move_inst_b, t_nizoroe_alarm_log, t_operation_log, t_receive_plan_b, t_serial_no, t_shipping_inst_b, t_stock, t_stock_book, w_ht_inventory_input_prod, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt, m_set_parent
 *
 * [foreign property]
 *     mShapeGrp, mClient, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, bClassDtlByProdDtManagFlg, bClassDtlByLogiSpecialTypeCd, bClassDtlByOcrDateFormat, bClassDtlByInsuranceFlg, bClassDtlByNoOkinawaFlightFlg, bClassDtlByLogiAttentionTypeCd, bClassDtlByHeavyItemFlg, bClassDtlByLargeItemFlg, mSetParentAsOne
 *
 * [referrer property]
 *     hStockBookList, mDepositProductList, mLocationList, mLocationReplenishProductList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tNizoroeAlarmLogList, tOperationLogList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tStockBookList, wHtInventoryInputProdList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMProductBhv extends AbstractBehaviorWritable<MProduct, MProductCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /** ケースピッキング明細データリストの取得 */
    public static final String PATH_selectSqlCasePickingDataList = "selectSqlCasePickingDataList";
    /** ケースピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlCasePickingListPrint = "selectSqlCasePickingListPrint";
    /** オーダーピッキング明細データリストの取得 */
    public static final String PATH_selectSqlOrderPickingDataList = "selectSqlOrderPickingDataList";
    /** オーダーピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlOrderPickingListPrint = "selectSqlOrderPickingListPrint";
    /** SQL title here. */
    public static final String PATH_selectSqlPackingListUpdate = "selectSqlPackingListUpdate";
    /** 摘み取りピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlPLPickingListPrint = "selectSqlPLPickingListPrint";
    /** SQL title here. */
    public static final String PATH_selectSqlShippingInspect = "selectSqlShippingInspect";
    /** 種蒔きピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlSLPickingListPrint = "selectSqlSLPickingListPrint";
    /** トータルピッキングリスト発行。出庫ヘッダ1レコード毎です。 */
    public static final String PATH_selectSqlTotalPickingListPrint = "selectSqlTotalPickingListPrint";
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MProductDbm asDBMeta() { return MProductDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_product"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MProductDbm getMyDBMeta() { return MProductDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MProductCB newConditionBean() { return new MProductCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MProduct newMyEntity() { return new MProduct(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MProductCB newMyConditionBean() { return new MProductCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MProductCB cb) {
        return facadeSelectCount(cb);
    }

    // ===================================================================================
    //                                                                       Entity Select
    //                                                                       =============
    /**
     * Select the entity by the condition-bean. #beforejava8 <br>
     * <span style="color: #AD4747; font-size: 120%">The return might be null if no data, so you should have null check.</span> <br>
     * <span style="color: #AD4747; font-size: 120%">If the data always exists as your business rule, use selectEntityWithDeletedCheck().</span>
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().setFoo...(value);
     * MProduct mProduct = <span style="color: #0000C0">mProductBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mProduct != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mProduct.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProduct selectEntity(MProductCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MProduct facadeSelectEntity(MProductCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProduct> OptionalEntity<ENTITY> doSelectOptionalEntity(MProductCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().set...;
     * MProduct mProduct = <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mProduct.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProduct selectEntityWithDeletedCheck(MProductCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param productId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProduct selectByPKValue(Long productId) {
        return facadeSelectByPKValue(productId);
    }

    protected MProduct facadeSelectByPKValue(Long productId) {
        return doSelectByPK(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProduct> ENTITY doSelectByPK(Long productId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(productId), tp);
    }

    protected <ENTITY extends MProduct> OptionalEntity<ENTITY> doSelectOptionalByPK(Long productId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(productId, tp), productId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param productId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MProduct selectByPKValueWithDeletedCheck(Long productId) {
        return doSelectByPKWithDeletedCheck(productId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProduct> ENTITY doSelectByPKWithDeletedCheck(Long productId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(productId), tp);
    }

    protected MProductCB xprepareCBAsPK(Long productId) {
        assertObjectNotNull("productId", productId);
        return newConditionBean().acceptPK(productId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param clientId : UQ+, NotNull, BIGINT(19), FK to m_client. (NotNull)
     * @param productCd : +UQ, IX, NotNull, VARCHAR(100). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MProduct> selectByUniqueOf(Long clientId, String productCd) {
        return facadeSelectByUniqueOf(clientId, productCd);
    }

    protected OptionalEntity<MProduct> facadeSelectByUniqueOf(Long clientId, String productCd) {
        return doSelectByUniqueOf(clientId, productCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MProduct> OptionalEntity<ENTITY> doSelectByUniqueOf(Long clientId, String productCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(clientId, productCd), tp), clientId, productCd);
    }

    protected MProductCB xprepareCBAsUniqueOf(Long clientId, String productCd) {
        assertObjectNotNull("clientId", clientId);assertObjectNotNull("productCd", productCd);
        return newConditionBean().acceptUniqueOf(clientId, productCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MProduct&gt; <span style="color: #553000">mProductList</span> = <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MProduct> selectList(MProductCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MProduct&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">page</span>) {
     *     ... = mProduct.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MProduct> selectPage(MProductCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().set...
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @param entityRowHandler The handler of entity row of MProduct. (NotNull)
     */
    public void selectCursor(MProductCB cb, EntityRowHandler<MProduct> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MProductCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MProductCB, RESULT> scalarSelect(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    // ===================================================================================
    //                                                                            Sequence
    //                                                                            ========
    @Override
    protected Number doReadNextVal() {
        String msg = "This table is NOT related to sequence: " + asTableDbName();
        throw new UnsupportedOperationException(msg);
    }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    /**
     * Load referrer for the list by the referrer loader.
     * <pre>
     * List&lt;Member&gt; <span style="color: #553000">memberList</span> = <span style="color: #0000C0">memberBhv</span>.selectList(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * memberBhv.<span style="color: #CC4747">load</span>(<span style="color: #553000">memberList</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * <span style="color: #70226C">for</span> (Member member : <span style="color: #553000">memberList</span>) {
     *     List&lt;Purchase&gt; purchaseList = member.<span style="color: #CC4747">getPurchaseList()</span>;
     *     <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *         ...
     *     }
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MProduct> mProductList, ReferrerLoaderHandler<LoaderOfMProduct> loaderLambda) {
        xassLRArg(mProductList, loaderLambda);
        loaderLambda.handle(new LoaderOfMProduct().ready(mProductList, _behaviorSelector));
    }

    /**
     * Load referrer for the entity by the referrer loader.
     * <pre>
     * Member <span style="color: #553000">member</span> = <span style="color: #0000C0">memberBhv</span>.selectEntityWithDeletedCheck(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> <span style="color: #553000">cb</span>.acceptPK(1));
     * <span style="color: #0000C0">memberBhv</span>.<span style="color: #CC4747">load</span>(<span style="color: #553000">member</span>, <span style="color: #553000">memberLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">memberLoader</span>.<span style="color: #CC4747">loadPurchase</span>(<span style="color: #553000">purchaseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">purchaseCB</span>.setupSelect...
     *         <span style="color: #553000">purchaseCB</span>.query().set...
     *         <span style="color: #553000">purchaseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can also load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(purchaseLoader -&gt; {</span>
     *     <span style="color: #3F7E5E">//    purchaseLoader.loadPurchasePayment(...);</span>
     *     <span style="color: #3F7E5E">//});</span>
     *
     *     <span style="color: #3F7E5E">// you can also pull out foreign table and load its referrer</span>
     *     <span style="color: #3F7E5E">// (setupSelect of the foreign table should be called)</span>
     *     <span style="color: #3F7E5E">//memberLoader.pulloutMemberStatus().loadMemberLogin(...)</span>
     * });
     * List&lt;Purchase&gt; purchaseList = <span style="color: #553000">member</span>.<span style="color: #CC4747">getPurchaseList()</span>;
     * <span style="color: #70226C">for</span> (Purchase purchase : purchaseList) {
     *     ...
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has order by FK before callback.
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MProduct mProduct, ReferrerLoaderHandler<LoaderOfMProduct> loaderLambda) {
        xassLRArg(mProduct, loaderLambda);
        loaderLambda.handle(new LoaderOfMProduct().ready(xnewLRAryLs(mProduct), _behaviorSelector));
    }

    /**
     * Load referrer of HStockBookList by the set-upper of referrer. <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadHStockBookList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getHStockBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockBook> loadHStockBookList(List<MProduct> mProductList, ConditionBeanSetupper<HStockBookCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadHStockBookList(mProductList, new LoadReferrerOption<HStockBookCB, HStockBook>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HStockBookList by the set-upper of referrer. <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadHStockBookList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getHStockBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockBook> loadHStockBookList(MProduct mProduct, ConditionBeanSetupper<HStockBookCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadHStockBookList(xnewLRLs(mProduct), new LoadReferrerOption<HStockBookCB, HStockBook>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HStockBook> loadHStockBookList(MProduct mProduct, LoadReferrerOption<HStockBookCB, HStockBook> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadHStockBookList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HStockBook> loadHStockBookList(List<MProduct> mProductList, LoadReferrerOption<HStockBookCB, HStockBook> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<HStockBook>)EMPTY_NREF_LGWAY; }
        return doLoadHStockBookList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HStockBook> doLoadHStockBookList(List<MProduct> mProductList, LoadReferrerOption<HStockBookCB, HStockBook> option) {
        return helpLoadReferrerInternally(mProductList, option, "hStockBookList");
    }

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMDepositProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(List<MProduct> mProductList, ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadMDepositProductList(mProductList, new LoadReferrerOption<MDepositProductCB, MDepositProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMDepositProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(MProduct mProduct, ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadMDepositProductList(xnewLRLs(mProduct), new LoadReferrerOption<MDepositProductCB, MDepositProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(MProduct mProduct, LoadReferrerOption<MDepositProductCB, MDepositProduct> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadMDepositProductList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(List<MProduct> mProductList, LoadReferrerOption<MDepositProductCB, MDepositProduct> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<MDepositProduct>)EMPTY_NREF_LGWAY; }
        return doLoadMDepositProductList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDepositProduct> doLoadMDepositProductList(List<MProduct> mProductList, LoadReferrerOption<MDepositProductCB, MDepositProduct> option) {
        return helpLoadReferrerInternally(mProductList, option, "mDepositProductList");
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MProduct> mProductList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadMLocationList(mProductList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MProduct mProduct, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mProduct), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MProduct mProduct, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MProduct> mProductList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MProduct> mProductList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mProductList, option, "mLocationList");
    }

    /**
     * Load referrer of MLocationReplenishProductList by the set-upper of referrer. <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMLocationReplenishProductList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMLocationReplenishProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocationReplenishProduct> loadMLocationReplenishProductList(List<MProduct> mProductList, ConditionBeanSetupper<MLocationReplenishProductCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadMLocationReplenishProductList(mProductList, new LoadReferrerOption<MLocationReplenishProductCB, MLocationReplenishProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationReplenishProductList by the set-upper of referrer. <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMLocationReplenishProductList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMLocationReplenishProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocationReplenishProduct> loadMLocationReplenishProductList(MProduct mProduct, ConditionBeanSetupper<MLocationReplenishProductCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadMLocationReplenishProductList(xnewLRLs(mProduct), new LoadReferrerOption<MLocationReplenishProductCB, MLocationReplenishProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocationReplenishProduct> loadMLocationReplenishProductList(MProduct mProduct, LoadReferrerOption<MLocationReplenishProductCB, MLocationReplenishProduct> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadMLocationReplenishProductList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocationReplenishProduct> loadMLocationReplenishProductList(List<MProduct> mProductList, LoadReferrerOption<MLocationReplenishProductCB, MLocationReplenishProduct> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<MLocationReplenishProduct>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationReplenishProductList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocationReplenishProduct> doLoadMLocationReplenishProductList(List<MProduct> mProductList, LoadReferrerOption<MLocationReplenishProductCB, MLocationReplenishProduct> option) {
        return helpLoadReferrerInternally(mProductList, option, "mLocationReplenishProductList");
    }

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMProductShapeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(List<MProduct> mProductList, ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadMProductShapeList(mProductList, new LoadReferrerOption<MProductShapeCB, MProductShape>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shapeCB</span>.setupSelect...
     *     <span style="color: #553000">shapeCB</span>.query().set...
     *     <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMProductShapeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(MProduct mProduct, ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadMProductShapeList(xnewLRLs(mProduct), new LoadReferrerOption<MProductShapeCB, MProductShape>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(MProduct mProduct, LoadReferrerOption<MProductShapeCB, MProductShape> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadMProductShapeList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProductShape> loadMProductShapeList(List<MProduct> mProductList, LoadReferrerOption<MProductShapeCB, MProductShape> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<MProductShape>)EMPTY_NREF_LGWAY; }
        return doLoadMProductShapeList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProductShape> doLoadMProductShapeList(List<MProduct> mProductList, LoadReferrerOption<MProductShapeCB, MProductShape> option) {
        return helpLoadReferrerInternally(mProductList, option, "mProductShapeList");
    }

    /**
     * Load referrer of MSetStructureList by the set-upper of referrer. <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMSetStructureList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">structureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">structureCB</span>.setupSelect...
     *     <span style="color: #553000">structureCB</span>.query().set...
     *     <span style="color: #553000">structureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMSetStructureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MSetStructure> loadMSetStructureList(List<MProduct> mProductList, ConditionBeanSetupper<MSetStructureCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadMSetStructureList(mProductList, new LoadReferrerOption<MSetStructureCB, MSetStructure>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MSetStructureList by the set-upper of referrer. <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadMSetStructureList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">structureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">structureCB</span>.setupSelect...
     *     <span style="color: #553000">structureCB</span>.query().set...
     *     <span style="color: #553000">structureCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getMSetStructureList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MSetStructure> loadMSetStructureList(MProduct mProduct, ConditionBeanSetupper<MSetStructureCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadMSetStructureList(xnewLRLs(mProduct), new LoadReferrerOption<MSetStructureCB, MSetStructure>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MSetStructure> loadMSetStructureList(MProduct mProduct, LoadReferrerOption<MSetStructureCB, MSetStructure> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadMSetStructureList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MSetStructure> loadMSetStructureList(List<MProduct> mProductList, LoadReferrerOption<MSetStructureCB, MSetStructure> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<MSetStructure>)EMPTY_NREF_LGWAY; }
        return doLoadMSetStructureList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MSetStructure> doLoadMSetStructureList(List<MProduct> mProductList, LoadReferrerOption<MSetStructureCB, MSetStructure> option) {
        return helpLoadReferrerInternally(mProductList, option, "mSetStructureList");
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MProduct> mProductList, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTAllocInstBList(mProductList, new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MProduct mProduct, ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTAllocInstBList(xnewLRLs(mProduct), new LoadReferrerOption<TAllocInstBCB, TAllocInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(MProduct mProduct, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTAllocInstBList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstB> loadTAllocInstBList(List<MProduct> mProductList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstBList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstB> doLoadTAllocInstBList(List<MProduct> mProductList, LoadReferrerOption<TAllocInstBCB, TAllocInstB> option) {
        return helpLoadReferrerInternally(mProductList, option, "tAllocInstBList");
    }

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(List<MProduct> mProductList, ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTAllocLotList(mProductList, new LoadReferrerOption<TAllocLotCB, TAllocLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTAllocLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(MProduct mProduct, ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTAllocLotList(xnewLRLs(mProduct), new LoadReferrerOption<TAllocLotCB, TAllocLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(MProduct mProduct, LoadReferrerOption<TAllocLotCB, TAllocLot> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTAllocLotList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocLot> loadTAllocLotList(List<MProduct> mProductList, LoadReferrerOption<TAllocLotCB, TAllocLot> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TAllocLot>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocLotList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocLot> doLoadTAllocLotList(List<MProduct> mProductList, LoadReferrerOption<TAllocLotCB, TAllocLot> option) {
        return helpLoadReferrerInternally(mProductList, option, "tAllocLotList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MProduct> mProductList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTInventoryBList(mProductList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MProduct mProduct, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(mProduct), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MProduct mProduct, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MProduct> mProductList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<MProduct> mProductList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mProductList, option, "tInventoryBList");
    }

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(List<MProduct> mProductList, ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTKeepingLotList(mProductList, new LoadReferrerOption<TKeepingLotCB, TKeepingLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(MProduct mProduct, ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTKeepingLotList(xnewLRLs(mProduct), new LoadReferrerOption<TKeepingLotCB, TKeepingLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(MProduct mProduct, LoadReferrerOption<TKeepingLotCB, TKeepingLot> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTKeepingLotList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TKeepingLot> loadTKeepingLotList(List<MProduct> mProductList, LoadReferrerOption<TKeepingLotCB, TKeepingLot> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TKeepingLot>)EMPTY_NREF_LGWAY; }
        return doLoadTKeepingLotList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TKeepingLot> doLoadTKeepingLotList(List<MProduct> mProductList, LoadReferrerOption<TKeepingLotCB, TKeepingLot> option) {
        return helpLoadReferrerInternally(mProductList, option, "tKeepingLotList");
    }

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(List<MProduct> mProductList, ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTLastLotList(mProductList, new LoadReferrerOption<TLastLotCB, TLastLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTLastLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(MProduct mProduct, ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTLastLotList(xnewLRLs(mProduct), new LoadReferrerOption<TLastLotCB, TLastLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(MProduct mProduct, LoadReferrerOption<TLastLotCB, TLastLot> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTLastLotList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TLastLot> loadTLastLotList(List<MProduct> mProductList, LoadReferrerOption<TLastLotCB, TLastLot> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TLastLot>)EMPTY_NREF_LGWAY; }
        return doLoadTLastLotList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TLastLot> doLoadTLastLotList(List<MProduct> mProductList, LoadReferrerOption<TLastLotCB, TLastLot> option) {
        return helpLoadReferrerInternally(mProductList, option, "tLastLotList");
    }

    /**
     * Load referrer of TLotList by the set-upper of referrer. <br>
     * t_lot by PRODUCT_ID, named 'TLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTLotList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLot> loadTLotList(List<MProduct> mProductList, ConditionBeanSetupper<TLotCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTLotList(mProductList, new LoadReferrerOption<TLotCB, TLot>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TLotList by the set-upper of referrer. <br>
     * t_lot by PRODUCT_ID, named 'TLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTLotList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">lotCB</span>.setupSelect...
     *     <span style="color: #553000">lotCB</span>.query().set...
     *     <span style="color: #553000">lotCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTLotList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLot> loadTLotList(MProduct mProduct, ConditionBeanSetupper<TLotCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTLotList(xnewLRLs(mProduct), new LoadReferrerOption<TLotCB, TLot>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TLot> loadTLotList(MProduct mProduct, LoadReferrerOption<TLotCB, TLot> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTLotList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TLot> loadTLotList(List<MProduct> mProductList, LoadReferrerOption<TLotCB, TLot> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TLot>)EMPTY_NREF_LGWAY; }
        return doLoadTLotList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TLot> doLoadTLotList(List<MProduct> mProductList, LoadReferrerOption<TLotCB, TLot> option) {
        return helpLoadReferrerInternally(mProductList, option, "tLotList");
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MProduct> mProductList, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTMoveInstBList(mProductList, new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MProduct mProduct, ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTMoveInstBList(xnewLRLs(mProduct), new LoadReferrerOption<TMoveInstBCB, TMoveInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(MProduct mProduct, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTMoveInstBList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstB> loadTMoveInstBList(List<MProduct> mProductList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstBList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstB> doLoadTMoveInstBList(List<MProduct> mProductList, LoadReferrerOption<TMoveInstBCB, TMoveInstB> option) {
        return helpLoadReferrerInternally(mProductList, option, "tMoveInstBList");
    }

    /**
     * Load referrer of TNizoroeAlarmLogList by the set-upper of referrer. <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTNizoroeAlarmLogList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logCB</span>.setupSelect...
     *     <span style="color: #553000">logCB</span>.query().set...
     *     <span style="color: #553000">logCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTNizoroeAlarmLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TNizoroeAlarmLog> loadTNizoroeAlarmLogList(List<MProduct> mProductList, ConditionBeanSetupper<TNizoroeAlarmLogCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTNizoroeAlarmLogList(mProductList, new LoadReferrerOption<TNizoroeAlarmLogCB, TNizoroeAlarmLog>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TNizoroeAlarmLogList by the set-upper of referrer. <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTNizoroeAlarmLogList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logCB</span>.setupSelect...
     *     <span style="color: #553000">logCB</span>.query().set...
     *     <span style="color: #553000">logCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTNizoroeAlarmLogList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TNizoroeAlarmLog> loadTNizoroeAlarmLogList(MProduct mProduct, ConditionBeanSetupper<TNizoroeAlarmLogCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTNizoroeAlarmLogList(xnewLRLs(mProduct), new LoadReferrerOption<TNizoroeAlarmLogCB, TNizoroeAlarmLog>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TNizoroeAlarmLog> loadTNizoroeAlarmLogList(MProduct mProduct, LoadReferrerOption<TNizoroeAlarmLogCB, TNizoroeAlarmLog> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTNizoroeAlarmLogList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TNizoroeAlarmLog> loadTNizoroeAlarmLogList(List<MProduct> mProductList, LoadReferrerOption<TNizoroeAlarmLogCB, TNizoroeAlarmLog> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TNizoroeAlarmLog>)EMPTY_NREF_LGWAY; }
        return doLoadTNizoroeAlarmLogList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TNizoroeAlarmLog> doLoadTNizoroeAlarmLogList(List<MProduct> mProductList, LoadReferrerOption<TNizoroeAlarmLogCB, TNizoroeAlarmLog> option) {
        return helpLoadReferrerInternally(mProductList, option, "tNizoroeAlarmLogList");
    }

    /**
     * Load referrer of TOperationLogList by the set-upper of referrer. <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTOperationLogList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logCB</span>.setupSelect...
     *     <span style="color: #553000">logCB</span>.query().set...
     *     <span style="color: #553000">logCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTOperationLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TOperationLog> loadTOperationLogList(List<MProduct> mProductList, ConditionBeanSetupper<TOperationLogCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTOperationLogList(mProductList, new LoadReferrerOption<TOperationLogCB, TOperationLog>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TOperationLogList by the set-upper of referrer. <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTOperationLogList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">logCB</span>.setupSelect...
     *     <span style="color: #553000">logCB</span>.query().set...
     *     <span style="color: #553000">logCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTOperationLogList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TOperationLog> loadTOperationLogList(MProduct mProduct, ConditionBeanSetupper<TOperationLogCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTOperationLogList(xnewLRLs(mProduct), new LoadReferrerOption<TOperationLogCB, TOperationLog>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TOperationLog> loadTOperationLogList(MProduct mProduct, LoadReferrerOption<TOperationLogCB, TOperationLog> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTOperationLogList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TOperationLog> loadTOperationLogList(List<MProduct> mProductList, LoadReferrerOption<TOperationLogCB, TOperationLog> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TOperationLog>)EMPTY_NREF_LGWAY; }
        return doLoadTOperationLogList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TOperationLog> doLoadTOperationLogList(List<MProduct> mProductList, LoadReferrerOption<TOperationLogCB, TOperationLog> option) {
        return helpLoadReferrerInternally(mProductList, option, "tOperationLogList");
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<MProduct> mProductList, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTReceivePlanBList(mProductList, new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(MProduct mProduct, ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTReceivePlanBList(xnewLRLs(mProduct), new LoadReferrerOption<TReceivePlanBCB, TReceivePlanB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(MProduct mProduct, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTReceivePlanBList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanB> loadTReceivePlanBList(List<MProduct> mProductList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanB>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanBList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanB> doLoadTReceivePlanBList(List<MProduct> mProductList, LoadReferrerOption<TReceivePlanBCB, TReceivePlanB> option) {
        return helpLoadReferrerInternally(mProductList, option, "tReceivePlanBList");
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MProduct> mProductList, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTSerialNoList(mProductList, new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTSerialNoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MProduct mProduct, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTSerialNoList(xnewLRLs(mProduct), new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MProduct mProduct, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTSerialNoList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MProduct> mProductList, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TSerialNo>)EMPTY_NREF_LGWAY; }
        return doLoadTSerialNoList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TSerialNo> doLoadTSerialNoList(List<MProduct> mProductList, LoadReferrerOption<TSerialNoCB, TSerialNo> option) {
        return helpLoadReferrerInternally(mProductList, option, "tSerialNoList");
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MProduct> mProductList, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTShippingInstBList(mProductList, new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MProduct mProduct, ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTShippingInstBList(xnewLRLs(mProduct), new LoadReferrerOption<TShippingInstBCB, TShippingInstB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(MProduct mProduct, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTShippingInstBList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstB> loadTShippingInstBList(List<MProduct> mProductList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstBList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstB> doLoadTShippingInstBList(List<MProduct> mProductList, LoadReferrerOption<TShippingInstBCB, TShippingInstB> option) {
        return helpLoadReferrerInternally(mProductList, option, "tShippingInstBList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by PRODUCT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MProduct> mProductList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTStockList(mProductList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by PRODUCT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MProduct mProduct, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTStockList(xnewLRLs(mProduct), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MProduct mProduct, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTStockList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MProduct> mProductList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MProduct> mProductList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mProductList, option, "tStockList");
    }

    /**
     * Load referrer of TStockBookList by the set-upper of referrer. <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTStockBookList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTStockBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockBook> loadTStockBookList(List<MProduct> mProductList, ConditionBeanSetupper<TStockBookCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadTStockBookList(mProductList, new LoadReferrerOption<TStockBookCB, TStockBook>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockBookList by the set-upper of referrer. <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadTStockBookList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bookCB</span>.setupSelect...
     *     <span style="color: #553000">bookCB</span>.query().set...
     *     <span style="color: #553000">bookCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getTStockBookList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockBook> loadTStockBookList(MProduct mProduct, ConditionBeanSetupper<TStockBookCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadTStockBookList(xnewLRLs(mProduct), new LoadReferrerOption<TStockBookCB, TStockBook>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockBook> loadTStockBookList(MProduct mProduct, LoadReferrerOption<TStockBookCB, TStockBook> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadTStockBookList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockBook> loadTStockBookList(List<MProduct> mProductList, LoadReferrerOption<TStockBookCB, TStockBook> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<TStockBook>)EMPTY_NREF_LGWAY; }
        return doLoadTStockBookList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockBook> doLoadTStockBookList(List<MProduct> mProductList, LoadReferrerOption<TStockBookCB, TStockBook> option) {
        return helpLoadReferrerInternally(mProductList, option, "tStockBookList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MProduct> mProductList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mProductList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MProduct mProduct, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mProduct), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MProduct mProduct, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MProduct> mProductList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MProduct> mProductList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MProduct> mProductList, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtPickingList(mProductList, new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MProduct mProduct, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtPickingList(xnewLRLs(mProduct), new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MProduct mProduct, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtPickingList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtPickingList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtPicking> doLoadWHtPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtPickingCB, WHtPicking> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtPickingList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MProduct> mProductList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mProductList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MProduct mProduct, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mProduct), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MProduct mProduct, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MProduct> mProductList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mProductList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MProduct mProduct, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mProduct), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MProduct mProduct, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MProduct> mProductList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtReceiveStoreList(mProductList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MProduct mProduct, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mProduct), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MProduct mProduct, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MProduct> mProductList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtReceiveStoreList");
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MProduct> mProductList, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtShippingList(mProductList, new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtShippingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MProduct mProduct, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtShippingList(xnewLRLs(mProduct), new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MProduct mProduct, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtShippingList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MProduct> mProductList, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtShipping>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShipping> doLoadWHtShippingList(List<MProduct> mProductList, LoadReferrerOption<WHtShippingCB, WHtShipping> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtShippingList");
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MProduct> mProductList, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtShippingPickingList(mProductList, new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MProduct mProduct, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtShippingPickingList(xnewLRLs(mProduct), new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MProduct mProduct, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtShippingPickingList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtShippingPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingPickingList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShippingPicking> doLoadWHtShippingPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtShippingPickingList");
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MProduct> mProductList, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWHtTotalPickingList(mProductList, new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MProduct mProduct, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWHtTotalPickingList(xnewLRLs(mProduct), new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MProduct mProduct, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWHtTotalPickingList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WHtTotalPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtTotalPickingList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtTotalPicking> doLoadWHtTotalPickingList(List<MProduct> mProductList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> option) {
        return helpLoadReferrerInternally(mProductList, option, "wHtTotalPickingList");
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MProduct> mProductList, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWSglRowShipInspHList(mProductList, new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MProduct mProduct, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWSglRowShipInspHList(xnewLRLs(mProduct), new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MProduct mProduct, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWSglRowShipInspHList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MProduct> mProductList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspH>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspHList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspH> doLoadWSglRowShipInspHList(List<MProduct> mProductList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> option) {
        return helpLoadReferrerInternally(mProductList, option, "wSglRowShipInspHList");
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MProduct> mProductList, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mProductList, refCBLambda);
        return doLoadWShippingInterruptList(mProductList, new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mProduct</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mProduct</span>.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param mProduct The entity of MProduct. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MProduct mProduct, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mProduct, refCBLambda);
        return doLoadWShippingInterruptList(xnewLRLs(mProduct), new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mProduct The entity of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MProduct mProduct, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mProduct, loadReferrerOption);
        return loadWShippingInterruptList(xnewLRLs(mProduct), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mProductList The entity list of MProduct. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MProduct> mProductList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mProductList, loadReferrerOption);
        if (mProductList.isEmpty()) { return (NestedReferrerListGateway<WShippingInterrupt>)EMPTY_NREF_LGWAY; }
        return doLoadWShippingInterruptList(mProductList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WShippingInterrupt> doLoadWShippingInterruptList(List<MProduct> mProductList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> option) {
        return helpLoadReferrerInternally(mProductList, option, "wShippingInterruptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShapeGrp'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShapeGrp> pulloutMShapeGrp(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "mShapeGrp"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "mClient"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByDelFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitDtManagFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLimitDtManagFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLimitDtReverseFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLimitDtReverseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLotManagFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLotManagFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLotReverseFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLotReverseFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByMergeCls(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByMergeCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByShippingStopFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByShippingStopFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByFreightCls(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByFreightCls"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByProdDtManagFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByProdDtManagFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLogiSpecialTypeCd(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLogiSpecialTypeCd"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByOcrDateFormat(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByOcrDateFormat"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByInsuranceFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByInsuranceFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByNoOkinawaFlightFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByNoOkinawaFlightFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLogiAttentionTypeCd(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLogiAttentionTypeCd"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByHeavyItemFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByHeavyItemFlg"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByLargeItemFlg(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "bClassDtlByLargeItemFlg"); }

    /**
     * Pull out the list of referrer-as-one table 'MSetParent'.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of referrer-as-one table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MSetParent> pulloutMSetParentAsOne(List<MProduct> mProductList)
    { return helpPulloutInternally(mProductList, "mSetParentAsOne"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key productId.
     * @param mProductList The list of mProduct. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractProductIdList(List<MProduct> mProductList)
    { return helpExtractListInternally(mProductList, "productId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mProduct.setFoo...(value);
     * mProduct.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProduct.set...;</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">insert</span>(mProduct);
     * ... = mProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MProduct mProduct) {
        doInsert(mProduct, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProduct.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">update</span>(mProduct);
     * </pre>
     * @param mProduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MProduct mProduct) {
        doUpdate(mProduct, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mProduct);
     * </pre>
     * @param mProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MProduct mProduct) {
        doUpdateNonstrict(mProduct, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mProduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MProduct mProduct) {
        doInsertOrUpdate(mProduct, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mProduct The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MProduct mProduct) {
        doInsertOrUpdateNonstrict(mProduct, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">delete</span>(mProduct);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MProduct mProduct) {
        doDelete(mProduct, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mProduct);
     * </pre>
     * @param mProduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MProduct mProduct) {
        doDeleteNonstrict(mProduct, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mProduct);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mProduct The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MProduct mProduct) {
        doDeleteNonstrictIgnoreDeleted(mProduct, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MProduct et, final DeleteOption<MProductCB> op) {
        assertObjectNotNull("mProduct", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
    }

    // ===================================================================================
    //                                                                        Batch Update
    //                                                                        ============
    /**
     * Batch-insert the entity list modified-only of same-set columns. (DefaultConstraintsEnabled) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <p><span style="color: #CC4747; font-size: 120%">The columns of least common multiple are registered like this:</span></p>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     *     mProduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProduct.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mProductList.add(mProduct);
     * }
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchInsert</span>(mProductList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MProduct> mProductList) {
        return doBatchInsert(mProductList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     *     mProduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProduct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mProductList.add(mProduct);
     * }
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProductList);
     * </pre>
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MProduct> mProductList) {
        return doBatchUpdate(mProductList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mProductBhv.<span style="color: #CC4747">batchUpdate</span>(mProductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MProduct> mProductList, SpecifyQuery<MProductCB> colCBLambda) {
        return doBatchUpdate(mProductList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     *     mProduct.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mProduct.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mProduct.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mProduct.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mProductList.add(mProduct);
     * }
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mProductList);
     * </pre>
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MProduct> mProductList) {
        return doBatchUpdateNonstrict(mProductList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mProductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mProductList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MProduct> mProductList, SpecifyQuery<MProductCB> colCBLambda) {
        return doBatchUpdateNonstrict(mProductList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MProduct> mProductList) {
        return doBatchDelete(mProductList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MProduct> mProductList) {
        return doBatchDeleteNonstrict(mProductList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MProduct, MProductCB&gt;() {
     *     public ConditionBean setup(MProduct entity, MProductCB intoCB) {
     *         FooCB cb = FooCB();
     *         cb.setupSelect_Bar();
     *
     *         <span style="color: #3F7E5E">// mapping</span>
     *         intoCB.specify().columnMyName().mappedFrom(cb.specify().columnFooName());
     *         intoCB.specify().columnMyCount().mappedFrom(cb.specify().columnFooCount());
     *         intoCB.specify().columnMyDate().mappedFrom(cb.specify().specifyBar().columnBarDate());
     *         entity.setMyFixedValue("foo"); <span style="color: #3F7E5E">// fixed value</span>
     *         <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     *         <span style="color: #3F7E5E">//entity.setRegisterUser(value);</span>
     *         <span style="color: #3F7E5E">//entity.set...;</span>
     *         <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     *         <span style="color: #3F7E5E">//entity.setVersionNo(value);</span>
     *
     *         return cb;
     *     }
     * });
     * </pre>
     * @param manyArgLambda The callback to set up query-insert. (NotNull)
     * @return The inserted count.
     */
    public int queryInsert(QueryInsertSetupper<MProduct, MProductCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mProduct.setPK...(value);</span>
     * mProduct.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mProduct.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mProduct.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mProduct, cb);
     * </pre>
     * @param mProduct The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MProduct mProduct, MProductCB cb) {
        return doQueryUpdate(mProduct, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MProductCB cb = new MProductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">queryDelete</span>(mProduct, cb);
     * </pre>
     * @param cb The condition-bean of MProduct. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MProductCB cb) {
        return doQueryDelete(cb, null);
    }

    // ===================================================================================
    //                                                                      Varying Update
    //                                                                      ==============
    // -----------------------------------------------------
    //                                         Entity Update
    //                                         -------------
    /**
     * Insert the entity with varying requests. <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as insert(entity).
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mProduct.setFoo...(value);
     * mProduct.setBar...(value);
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mProduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mProduct.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mProduct The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MProduct mProduct, WritableOptionCall<MProductCB, InsertOption<MProductCB>> opLambda) {
        doInsert(mProduct, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mProduct.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mProduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mProduct The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MProduct mProduct, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> opLambda) {
        doUpdate(mProduct, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * mProduct.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mProduct, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mProduct The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MProduct mProduct, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> opLambda) {
        doUpdateNonstrict(mProduct, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mProduct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MProduct mProduct, WritableOptionCall<MProductCB, InsertOption<MProductCB>> insertOpLambda, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> updateOpLambda) {
        doInsertOrUpdate(mProduct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mProduct The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MProduct mProduct, WritableOptionCall<MProductCB, InsertOption<MProductCB>> insertOpLambda, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mProduct, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MProduct mProduct, WritableOptionCall<MProductCB, DeleteOption<MProductCB>> opLambda) {
        doDelete(mProduct, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mProduct The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MProduct mProduct, WritableOptionCall<MProductCB, DeleteOption<MProductCB>> opLambda) {
        doDeleteNonstrict(mProduct, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MProduct> mProductList, WritableOptionCall<MProductCB, InsertOption<MProductCB>> opLambda) {
        return doBatchInsert(mProductList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MProduct> mProductList, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> opLambda) {
        return doBatchUpdate(mProductList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MProduct> mProductList, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> opLambda) {
        return doBatchUpdateNonstrict(mProductList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MProduct> mProductList, WritableOptionCall<MProductCB, DeleteOption<MProductCB>> opLambda) {
        return doBatchDelete(mProductList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mProductList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MProduct> mProductList, WritableOptionCall<MProductCB, DeleteOption<MProductCB>> opLambda) {
        return doBatchDeleteNonstrict(mProductList, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Query Update
    //                                          ------------
    /**
     * Insert the several entities by query with varying requests (modified-only for fixed value). <br>
     * For example, disableCommonColumnAutoSetup(), disablePrimaryKeyIdentity(). <br>
     * Other specifications are same as queryInsert(entity, setupper).
     * @param manyArgLambda The set-upper of query-insert. (NotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The inserted count.
     */
    public int varyingQueryInsert(QueryInsertSetupper<MProduct, MProductCB> manyArgLambda, WritableOptionCall<MProductCB, InsertOption<MProductCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MProduct mProduct = <span style="color: #70226C">new</span> MProduct();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mProduct.setPK...(value);</span>
     * mProduct.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mProduct.setVersionNo(value);</span>
     * MProductCB cb = <span style="color: #70226C">new</span> MProductCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mProduct, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mProduct The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MProduct. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MProduct mProduct, MProductCB cb, WritableOptionCall<MProductCB, UpdateOption<MProductCB>> opLambda) {
        return doQueryUpdate(mProduct, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MProduct. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MProductCB cb, WritableOptionCall<MProductCB, DeleteOption<MProductCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mProductBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mProductBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mProductBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mProductBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mProductBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mProductBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mProductBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mProductBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mProductBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mProductBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mProductBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mProductBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mProductBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mProductBhv.outideSql().removeBlockComment().selectList()
     * mProductBhv.outideSql().removeLineComment().selectList()
     * mProductBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MProductBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MProductBhv> facadeExecutor = doOutsideSql();
        return facadeExecutor.xbasicExecutor(); // variable to resolve generic type
    }

    // ===================================================================================
    //                                                                Optimistic Lock Info
    //                                                                ====================
    @Override
    protected boolean hasVersionNoValue(Entity et) { return downcast(et).getVersionNo() != null; }

    // ===================================================================================
    //                                                                         Type Helper
    //                                                                         ===========
    protected Class<? extends MProduct> typeOfSelectedEntity() { return MProduct.class; }
    protected Class<MProduct> typeOfHandlingEntity() { return MProduct.class; }
    protected Class<MProductCB> typeOfHandlingConditionBean() { return MProductCB.class; }
}
