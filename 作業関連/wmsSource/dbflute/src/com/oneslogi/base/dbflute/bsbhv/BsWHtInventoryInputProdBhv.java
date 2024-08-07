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
 * The behavior of w_ht_inventory_input_prod as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [column]
 *     HT_INVENTORY_INPUT_PROD_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, WAREHOUSE_ID, INVENTORY_H_ID, RCV_LABEL_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, LOC_ID, LOC_CD, LOC_NM, JAN_CD, CONSIGNMENT_CLS_ID, CONSIGNMENT_CLS_NM, STOCK_TYPE_ID, STK_CLS_NM, LOT_ID, LOT, LIMIT_DT, QTY, INVENTORY_B_VERSION_NO, CR_DT, WORK_START_DT, WORK_END_DT, PRODUCTION_DT, UNIT_NM, AREA_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_INVENTORY_INPUT_PROD_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_location, m_stock_type, t_lot, m_warehouse, m_product, m_center, m_client, m_customer
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mLocation, mStockType, tLot, mWarehouse, mProduct, mCenter, mClient, mCustomer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsWHtInventoryInputProdBhv extends AbstractBehaviorWritable<WHtInventoryInputProd, WHtInventoryInputProdCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public WHtInventoryInputProdDbm asDBMeta() { return WHtInventoryInputProdDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "w_ht_inventory_input_prod"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public WHtInventoryInputProdDbm getMyDBMeta() { return WHtInventoryInputProdDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public WHtInventoryInputProdCB newConditionBean() { return new WHtInventoryInputProdCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public WHtInventoryInputProd newMyEntity() { return new WHtInventoryInputProd(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public WHtInventoryInputProdCB newMyConditionBean() { return new WHtInventoryInputProdCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(WHtInventoryInputProdCB cb) {
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
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (wHtInventoryInputProd != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = wHtInventoryInputProd.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtInventoryInputProd selectEntity(WHtInventoryInputProdCB cb) {
        return facadeSelectEntity(cb);
    }

    protected WHtInventoryInputProd facadeSelectEntity(WHtInventoryInputProdCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtInventoryInputProd> OptionalEntity<ENTITY> doSelectOptionalEntity(WHtInventoryInputProdCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().set...;
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = wHtInventoryInputProd.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtInventoryInputProd selectEntityWithDeletedCheck(WHtInventoryInputProdCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param htInventoryInputProdId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtInventoryInputProd selectByPKValue(Long htInventoryInputProdId) {
        return facadeSelectByPKValue(htInventoryInputProdId);
    }

    protected WHtInventoryInputProd facadeSelectByPKValue(Long htInventoryInputProdId) {
        return doSelectByPK(htInventoryInputProdId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtInventoryInputProd> ENTITY doSelectByPK(Long htInventoryInputProdId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(htInventoryInputProdId), tp);
    }

    protected <ENTITY extends WHtInventoryInputProd> OptionalEntity<ENTITY> doSelectOptionalByPK(Long htInventoryInputProdId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(htInventoryInputProdId, tp), htInventoryInputProdId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param htInventoryInputProdId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public WHtInventoryInputProd selectByPKValueWithDeletedCheck(Long htInventoryInputProdId) {
        return doSelectByPKWithDeletedCheck(htInventoryInputProdId, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtInventoryInputProd> ENTITY doSelectByPKWithDeletedCheck(Long htInventoryInputProdId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(htInventoryInputProdId), tp);
    }

    protected WHtInventoryInputProdCB xprepareCBAsPK(Long htInventoryInputProdId) {
        assertObjectNotNull("htInventoryInputProdId", htInventoryInputProdId);
        return newConditionBean().acceptPK(htInventoryInputProdId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param inventoryHId : UQ+, NotNull, BIGINT(19). (NotNull)
     * @param productId : +UQ, IX, NotNull, BIGINT(19), FK to m_product. (NotNull)
     * @param locId : +UQ, IX, BIGINT(19), FK to m_location. (NotNull)
     * @param consignmentClsId : +UQ, IX, BIGINT(19), FK to m_customer. (NotNull)
     * @param stockTypeId : +UQ, IX, BIGINT(19), FK to m_stock_type. (NotNull)
     * @param lot : +UQ, VARCHAR(30). (NotNull)
     * @param limitDt : +UQ, VARCHAR(8). (NotNull)
     * @param inventoryBVersionNo : +UQ, BIGINT(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<WHtInventoryInputProd> selectByUniqueOf(Long inventoryHId, Long productId, Long locId, Long consignmentClsId, Long stockTypeId, String lot, String limitDt, Long inventoryBVersionNo) {
        return facadeSelectByUniqueOf(inventoryHId, productId, locId, consignmentClsId, stockTypeId, lot, limitDt, inventoryBVersionNo);
    }

    protected OptionalEntity<WHtInventoryInputProd> facadeSelectByUniqueOf(Long inventoryHId, Long productId, Long locId, Long consignmentClsId, Long stockTypeId, String lot, String limitDt, Long inventoryBVersionNo) {
        return doSelectByUniqueOf(inventoryHId, productId, locId, consignmentClsId, stockTypeId, lot, limitDt, inventoryBVersionNo, typeOfSelectedEntity());
    }

    protected <ENTITY extends WHtInventoryInputProd> OptionalEntity<ENTITY> doSelectByUniqueOf(Long inventoryHId, Long productId, Long locId, Long consignmentClsId, Long stockTypeId, String lot, String limitDt, Long inventoryBVersionNo, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(inventoryHId, productId, locId, consignmentClsId, stockTypeId, lot, limitDt, inventoryBVersionNo), tp), inventoryHId, productId, locId, consignmentClsId, stockTypeId, lot, limitDt, inventoryBVersionNo);
    }

    protected WHtInventoryInputProdCB xprepareCBAsUniqueOf(Long inventoryHId, Long productId, Long locId, Long consignmentClsId, Long stockTypeId, String lot, String limitDt, Long inventoryBVersionNo) {
        assertObjectNotNull("inventoryHId", inventoryHId);assertObjectNotNull("productId", productId);assertObjectNotNull("locId", locId);assertObjectNotNull("consignmentClsId", consignmentClsId);assertObjectNotNull("stockTypeId", stockTypeId);assertObjectNotNull("lot", lot);assertObjectNotNull("limitDt", limitDt);assertObjectNotNull("inventoryBVersionNo", inventoryBVersionNo);
        return newConditionBean().acceptUniqueOf(inventoryHId, productId, locId, consignmentClsId, stockTypeId, lot, limitDt, inventoryBVersionNo);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;WHtInventoryInputProd&gt; <span style="color: #553000">wHtInventoryInputProdList</span> = <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (WHtInventoryInputProd wHtInventoryInputProd : <span style="color: #553000">wHtInventoryInputProdList</span>) {
     *     ... = wHtInventoryInputProd.get...;
     * }
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<WHtInventoryInputProd> selectList(WHtInventoryInputProdCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;WHtInventoryInputProd&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (WHtInventoryInputProd wHtInventoryInputProd : <span style="color: #553000">page</span>) {
     *     ... = wHtInventoryInputProd.get...();
     * }
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<WHtInventoryInputProd> selectPage(WHtInventoryInputProdCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().set...
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @param entityRowHandler The handler of entity row of WHtInventoryInputProd. (NotNull)
     */
    public void selectCursor(WHtInventoryInputProdCB cb, EntityRowHandler<WHtInventoryInputProd> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WHtInventoryInputProdCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<WHtInventoryInputProdCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param wHtInventoryInputProdList The entity list of WHtInventoryInputProd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<WHtInventoryInputProd> wHtInventoryInputProdList, ReferrerLoaderHandler<LoaderOfWHtInventoryInputProd> loaderLambda) {
        xassLRArg(wHtInventoryInputProdList, loaderLambda);
        loaderLambda.handle(new LoaderOfWHtInventoryInputProd().ready(wHtInventoryInputProdList, _behaviorSelector));
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
     * @param wHtInventoryInputProd The entity of WHtInventoryInputProd. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(WHtInventoryInputProd wHtInventoryInputProd, ReferrerLoaderHandler<LoaderOfWHtInventoryInputProd> loaderLambda) {
        xassLRArg(wHtInventoryInputProd, loaderLambda);
        loaderLambda.handle(new LoaderOfWHtInventoryInputProd().ready(xnewLRAryLs(wHtInventoryInputProd), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MLocation'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MLocation> pulloutMLocation(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mLocation"); }

    /**
     * Pull out the list of foreign table 'MStockType'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MStockType> pulloutMStockType(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mStockType"); }

    /**
     * Pull out the list of foreign table 'TLot'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TLot> pulloutTLot(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "tLot"); }

    /**
     * Pull out the list of foreign table 'MWarehouse'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MWarehouse> pulloutMWarehouse(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mWarehouse"); }

    /**
     * Pull out the list of foreign table 'MProduct'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MProduct> pulloutMProduct(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mProduct"); }

    /**
     * Pull out the list of foreign table 'MCenter'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCenter> pulloutMCenter(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mCenter"); }

    /**
     * Pull out the list of foreign table 'MClient'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MClient> pulloutMClient(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mClient"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpPulloutInternally(wHtInventoryInputProdList, "mCustomer"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key htInventoryInputProdId.
     * @param wHtInventoryInputProdList The list of wHtInventoryInputProd. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractHtInventoryInputProdIdList(List<WHtInventoryInputProd> wHtInventoryInputProdList)
    { return helpExtractListInternally(wHtInventoryInputProdList, "htInventoryInputProdId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wHtInventoryInputProd.setFoo...(value);
     * wHtInventoryInputProd.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.set...;</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">insert</span>(wHtInventoryInputProd);
     * ... = wHtInventoryInputProd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param wHtInventoryInputProd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(WHtInventoryInputProd wHtInventoryInputProd) {
        doInsert(wHtInventoryInputProd, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtInventoryInputProd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtInventoryInputProd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">update</span>(wHtInventoryInputProd);
     * </pre>
     * @param wHtInventoryInputProd The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(WHtInventoryInputProd wHtInventoryInputProd) {
        doUpdate(wHtInventoryInputProd, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtInventoryInputProd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(wHtInventoryInputProd);
     * </pre>
     * @param wHtInventoryInputProd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(WHtInventoryInputProd wHtInventoryInputProd) {
        doUpdateNonstrict(wHtInventoryInputProd, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wHtInventoryInputProd The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(WHtInventoryInputProd wHtInventoryInputProd) {
        doInsertOrUpdate(wHtInventoryInputProd, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param wHtInventoryInputProd The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(WHtInventoryInputProd wHtInventoryInputProd) {
        doInsertOrUpdateNonstrict(wHtInventoryInputProd, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtInventoryInputProd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">delete</span>(wHtInventoryInputProd);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param wHtInventoryInputProd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(WHtInventoryInputProd wHtInventoryInputProd) {
        doDelete(wHtInventoryInputProd, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(wHtInventoryInputProd);
     * </pre>
     * @param wHtInventoryInputProd The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(WHtInventoryInputProd wHtInventoryInputProd) {
        doDeleteNonstrict(wHtInventoryInputProd, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(wHtInventoryInputProd);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param wHtInventoryInputProd The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(WHtInventoryInputProd wHtInventoryInputProd) {
        doDeleteNonstrictIgnoreDeleted(wHtInventoryInputProd, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(WHtInventoryInputProd et, final DeleteOption<WHtInventoryInputProdCB> op) {
        assertObjectNotNull("wHtInventoryInputProd", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     *     wHtInventoryInputProd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtInventoryInputProd.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     wHtInventoryInputProdList.add(wHtInventoryInputProd);
     * }
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchInsert</span>(wHtInventoryInputProdList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        return doBatchInsert(wHtInventoryInputProdList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     *     wHtInventoryInputProd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtInventoryInputProd.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wHtInventoryInputProd.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wHtInventoryInputProd.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wHtInventoryInputProdList.add(wHtInventoryInputProd);
     * }
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtInventoryInputProdList);
     * </pre>
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        return doBatchUpdate(wHtInventoryInputProdList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * wHtInventoryInputProdBhv.<span style="color: #CC4747">batchUpdate</span>(wHtInventoryInputProdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtInventoryInputProdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<WHtInventoryInputProd> wHtInventoryInputProdList, SpecifyQuery<WHtInventoryInputProdCB> colCBLambda) {
        return doBatchUpdate(wHtInventoryInputProdList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     *     wHtInventoryInputProd.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         wHtInventoryInputProd.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         wHtInventoryInputProd.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//wHtInventoryInputProd.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     wHtInventoryInputProdList.add(wHtInventoryInputProd);
     * }
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchUpdate</span>(wHtInventoryInputProdList);
     * </pre>
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        return doBatchUpdateNonstrict(wHtInventoryInputProdList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wHtInventoryInputProdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(wHtInventoryInputProdList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<WHtInventoryInputProd> wHtInventoryInputProdList, SpecifyQuery<WHtInventoryInputProdCB> colCBLambda) {
        return doBatchUpdateNonstrict(wHtInventoryInputProdList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        return doBatchDelete(wHtInventoryInputProdList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<WHtInventoryInputProd> wHtInventoryInputProdList) {
        return doBatchDeleteNonstrict(wHtInventoryInputProdList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;WHtInventoryInputProd, WHtInventoryInputProdCB&gt;() {
     *     public ConditionBean setup(WHtInventoryInputProd entity, WHtInventoryInputProdCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<WHtInventoryInputProd, WHtInventoryInputProdCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setPK...(value);</span>
     * wHtInventoryInputProd.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">queryUpdate</span>(wHtInventoryInputProd, cb);
     * </pre>
     * @param wHtInventoryInputProd The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(WHtInventoryInputProd wHtInventoryInputProd, WHtInventoryInputProdCB cb) {
        return doQueryUpdate(wHtInventoryInputProd, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * WHtInventoryInputProdCB cb = new WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">queryDelete</span>(wHtInventoryInputProd, cb);
     * </pre>
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(WHtInventoryInputProdCB cb) {
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
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * wHtInventoryInputProd.setFoo...(value);
     * wHtInventoryInputProd.setBar...(value);
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">varyingInsert</span>(wHtInventoryInputProd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = wHtInventoryInputProd.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param wHtInventoryInputProd The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, InsertOption<WHtInventoryInputProdCB>> opLambda) {
        doInsert(wHtInventoryInputProd, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtInventoryInputProd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * wHtInventoryInputProd.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(wHtInventoryInputProd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtInventoryInputProd The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> opLambda) {
        doUpdate(wHtInventoryInputProd, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * wHtInventoryInputProd.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * wHtInventoryInputProd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(wHtInventoryInputProd, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtInventoryInputProd The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> opLambda) {
        doUpdateNonstrict(wHtInventoryInputProd, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param wHtInventoryInputProd The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, InsertOption<WHtInventoryInputProdCB>> insertOpLambda, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> updateOpLambda) {
        doInsertOrUpdate(wHtInventoryInputProd, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param wHtInventoryInputProd The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, InsertOption<WHtInventoryInputProdCB>> insertOpLambda, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(wHtInventoryInputProd, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param wHtInventoryInputProd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, DeleteOption<WHtInventoryInputProdCB>> opLambda) {
        doDelete(wHtInventoryInputProd, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param wHtInventoryInputProd The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(WHtInventoryInputProd wHtInventoryInputProd, WritableOptionCall<WHtInventoryInputProdCB, DeleteOption<WHtInventoryInputProdCB>> opLambda) {
        doDeleteNonstrict(wHtInventoryInputProd, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<WHtInventoryInputProd> wHtInventoryInputProdList, WritableOptionCall<WHtInventoryInputProdCB, InsertOption<WHtInventoryInputProdCB>> opLambda) {
        return doBatchInsert(wHtInventoryInputProdList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<WHtInventoryInputProd> wHtInventoryInputProdList, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> opLambda) {
        return doBatchUpdate(wHtInventoryInputProdList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<WHtInventoryInputProd> wHtInventoryInputProdList, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> opLambda) {
        return doBatchUpdateNonstrict(wHtInventoryInputProdList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<WHtInventoryInputProd> wHtInventoryInputProdList, WritableOptionCall<WHtInventoryInputProdCB, DeleteOption<WHtInventoryInputProdCB>> opLambda) {
        return doBatchDelete(wHtInventoryInputProdList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param wHtInventoryInputProdList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<WHtInventoryInputProd> wHtInventoryInputProdList, WritableOptionCall<WHtInventoryInputProdCB, DeleteOption<WHtInventoryInputProdCB>> opLambda) {
        return doBatchDeleteNonstrict(wHtInventoryInputProdList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<WHtInventoryInputProd, WHtInventoryInputProdCB> manyArgLambda, WritableOptionCall<WHtInventoryInputProdCB, InsertOption<WHtInventoryInputProdCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * WHtInventoryInputProd wHtInventoryInputProd = <span style="color: #70226C">new</span> WHtInventoryInputProd();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setPK...(value);</span>
     * wHtInventoryInputProd.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//wHtInventoryInputProd.setVersionNo(value);</span>
     * WHtInventoryInputProdCB cb = <span style="color: #70226C">new</span> WHtInventoryInputProdCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">wHtInventoryInputProdBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(wHtInventoryInputProd, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param wHtInventoryInputProd The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(WHtInventoryInputProd wHtInventoryInputProd, WHtInventoryInputProdCB cb, WritableOptionCall<WHtInventoryInputProdCB, UpdateOption<WHtInventoryInputProdCB>> opLambda) {
        return doQueryUpdate(wHtInventoryInputProd, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of WHtInventoryInputProd. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(WHtInventoryInputProdCB cb, WritableOptionCall<WHtInventoryInputProdCB, DeleteOption<WHtInventoryInputProdCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * wHtInventoryInputProdBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * wHtInventoryInputProdBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wHtInventoryInputProdBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * wHtInventoryInputProdBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * wHtInventoryInputProdBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * wHtInventoryInputProdBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * wHtInventoryInputProdBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * wHtInventoryInputProdBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * wHtInventoryInputProdBhv.outideSql().removeBlockComment().selectList()
     * wHtInventoryInputProdBhv.outideSql().removeLineComment().selectList()
     * wHtInventoryInputProdBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<WHtInventoryInputProdBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<WHtInventoryInputProdBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends WHtInventoryInputProd> typeOfSelectedEntity() { return WHtInventoryInputProd.class; }
    protected Class<WHtInventoryInputProd> typeOfHandlingEntity() { return WHtInventoryInputProd.class; }
    protected Class<WHtInventoryInputProdCB> typeOfHandlingConditionBean() { return WHtInventoryInputProdCB.class; }
}
