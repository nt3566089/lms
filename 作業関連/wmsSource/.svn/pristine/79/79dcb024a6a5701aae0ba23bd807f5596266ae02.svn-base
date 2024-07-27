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
 * The behavior of t_shipping_plan_h as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_PLAN_H_ID
 *
 * [column]
 *     SHIPPING_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, SLIP_TYPE_CD, SALES_ORDER_SLIP_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, SALES_ORG_CD, KOGUCHI_DELIVERY_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_REASON_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TENHANSHA_CD, TENHANSHA_ORDER_NO, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_FAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     t_shipping_plan_b
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tShippingPlanBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingPlanHBhv extends AbstractBehaviorWritable<TShippingPlanH, TShippingPlanHCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TShippingPlanHDbm asDBMeta() { return TShippingPlanHDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "t_shipping_plan_h"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TShippingPlanHDbm getMyDBMeta() { return TShippingPlanHDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TShippingPlanHCB newConditionBean() { return new TShippingPlanHCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TShippingPlanH newMyEntity() { return new TShippingPlanH(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TShippingPlanHCB newMyConditionBean() { return new TShippingPlanHCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TShippingPlanHCB cb) {
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
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * TShippingPlanH tShippingPlanH = <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tShippingPlanH != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tShippingPlanH.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingPlanH selectEntity(TShippingPlanHCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TShippingPlanH facadeSelectEntity(TShippingPlanHCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingPlanH> OptionalEntity<ENTITY> doSelectOptionalEntity(TShippingPlanHCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().set...;
     * TShippingPlanH tShippingPlanH = <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tShippingPlanH.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingPlanH selectEntityWithDeletedCheck(TShippingPlanHCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shippingPlanHId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingPlanH selectByPKValue(Long shippingPlanHId) {
        return facadeSelectByPKValue(shippingPlanHId);
    }

    protected TShippingPlanH facadeSelectByPKValue(Long shippingPlanHId) {
        return doSelectByPK(shippingPlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingPlanH> ENTITY doSelectByPK(Long shippingPlanHId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shippingPlanHId), tp);
    }

    protected <ENTITY extends TShippingPlanH> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shippingPlanHId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shippingPlanHId, tp), shippingPlanHId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shippingPlanHId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingPlanH selectByPKValueWithDeletedCheck(Long shippingPlanHId) {
        return doSelectByPKWithDeletedCheck(shippingPlanHId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingPlanH> ENTITY doSelectByPKWithDeletedCheck(Long shippingPlanHId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shippingPlanHId), tp);
    }

    protected TShippingPlanHCB xprepareCBAsPK(Long shippingPlanHId) {
        assertObjectNotNull("shippingPlanHId", shippingPlanHId);
        return newConditionBean().acceptPK(shippingPlanHId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TShippingPlanH&gt; <span style="color: #553000">tShippingPlanHList</span> = <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TShippingPlanH tShippingPlanH : <span style="color: #553000">tShippingPlanHList</span>) {
     *     ... = tShippingPlanH.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TShippingPlanH> selectList(TShippingPlanHCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TShippingPlanH&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TShippingPlanH tShippingPlanH : <span style="color: #553000">page</span>) {
     *     ... = tShippingPlanH.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TShippingPlanH> selectPage(TShippingPlanHCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().set...
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @param entityRowHandler The handler of entity row of TShippingPlanH. (NotNull)
     */
    public void selectCursor(TShippingPlanHCB cb, EntityRowHandler<TShippingPlanH> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingPlanHCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingPlanHCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tShippingPlanHList The entity list of TShippingPlanH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TShippingPlanH> tShippingPlanHList, ReferrerLoaderHandler<LoaderOfTShippingPlanH> loaderLambda) {
        xassLRArg(tShippingPlanHList, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingPlanH().ready(tShippingPlanHList, _behaviorSelector));
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
     * @param tShippingPlanH The entity of TShippingPlanH. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TShippingPlanH tShippingPlanH, ReferrerLoaderHandler<LoaderOfTShippingPlanH> loaderLambda) {
        xassLRArg(tShippingPlanH, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingPlanH().ready(xnewLRAryLs(tShippingPlanH), _behaviorSelector));
    }

    /**
     * Load referrer of TShippingPlanBList by the set-upper of referrer. <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">loadTShippingPlanBList</span>(<span style="color: #553000">tShippingPlanHList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (TShippingPlanH tShippingPlanH : <span style="color: #553000">tShippingPlanHList</span>) {
     *     ... = tShippingPlanH.<span style="color: #CC4747">getTShippingPlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingPlanHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingPlanHId_Asc();
     * </pre>
     * @param tShippingPlanHList The entity list of TShippingPlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingPlanB> loadTShippingPlanBList(List<TShippingPlanH> tShippingPlanHList, ConditionBeanSetupper<TShippingPlanBCB> refCBLambda) {
        xassLRArg(tShippingPlanHList, refCBLambda);
        return doLoadTShippingPlanBList(tShippingPlanHList, new LoadReferrerOption<TShippingPlanBCB, TShippingPlanB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingPlanBList by the set-upper of referrer. <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">loadTShippingPlanBList</span>(<span style="color: #553000">tShippingPlanH</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">tShippingPlanH</span>.<span style="color: #CC4747">getTShippingPlanBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingPlanHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingPlanHId_Asc();
     * </pre>
     * @param tShippingPlanH The entity of TShippingPlanH. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingPlanB> loadTShippingPlanBList(TShippingPlanH tShippingPlanH, ConditionBeanSetupper<TShippingPlanBCB> refCBLambda) {
        xassLRArg(tShippingPlanH, refCBLambda);
        return doLoadTShippingPlanBList(xnewLRLs(tShippingPlanH), new LoadReferrerOption<TShippingPlanBCB, TShippingPlanB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param tShippingPlanH The entity of TShippingPlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingPlanB> loadTShippingPlanBList(TShippingPlanH tShippingPlanH, LoadReferrerOption<TShippingPlanBCB, TShippingPlanB> loadReferrerOption) {
        xassLRArg(tShippingPlanH, loadReferrerOption);
        return loadTShippingPlanBList(xnewLRLs(tShippingPlanH), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param tShippingPlanHList The entity list of TShippingPlanH. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingPlanB> loadTShippingPlanBList(List<TShippingPlanH> tShippingPlanHList, LoadReferrerOption<TShippingPlanBCB, TShippingPlanB> loadReferrerOption) {
        xassLRArg(tShippingPlanHList, loadReferrerOption);
        if (tShippingPlanHList.isEmpty()) { return (NestedReferrerListGateway<TShippingPlanB>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingPlanBList(tShippingPlanHList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingPlanB> doLoadTShippingPlanBList(List<TShippingPlanH> tShippingPlanHList, LoadReferrerOption<TShippingPlanBCB, TShippingPlanB> option) {
        return helpLoadReferrerInternally(tShippingPlanHList, option, "tShippingPlanBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shippingPlanHId.
     * @param tShippingPlanHList The list of tShippingPlanH. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShippingPlanHIdList(List<TShippingPlanH> tShippingPlanHList)
    { return helpExtractListInternally(tShippingPlanHList, "shippingPlanHId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingPlanH.setFoo...(value);
     * tShippingPlanH.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.set...;</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">insert</span>(tShippingPlanH);
     * ... = tShippingPlanH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tShippingPlanH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TShippingPlanH tShippingPlanH) {
        doInsert(tShippingPlanH, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingPlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingPlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">update</span>(tShippingPlanH);
     * </pre>
     * @param tShippingPlanH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TShippingPlanH tShippingPlanH) {
        doUpdate(tShippingPlanH, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingPlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tShippingPlanH);
     * </pre>
     * @param tShippingPlanH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TShippingPlanH tShippingPlanH) {
        doUpdateNonstrict(tShippingPlanH, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingPlanH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TShippingPlanH tShippingPlanH) {
        doInsertOrUpdate(tShippingPlanH, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingPlanH The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TShippingPlanH tShippingPlanH) {
        doInsertOrUpdateNonstrict(tShippingPlanH, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingPlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">delete</span>(tShippingPlanH);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tShippingPlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TShippingPlanH tShippingPlanH) {
        doDelete(tShippingPlanH, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tShippingPlanH);
     * </pre>
     * @param tShippingPlanH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TShippingPlanH tShippingPlanH) {
        doDeleteNonstrict(tShippingPlanH, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tShippingPlanH);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tShippingPlanH The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TShippingPlanH tShippingPlanH) {
        doDeleteNonstrictIgnoreDeleted(tShippingPlanH, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TShippingPlanH et, final DeleteOption<TShippingPlanHCB> op) {
        assertObjectNotNull("tShippingPlanH", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     *     tShippingPlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingPlanH.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tShippingPlanHList.add(tShippingPlanH);
     * }
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchInsert</span>(tShippingPlanHList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TShippingPlanH> tShippingPlanHList) {
        return doBatchInsert(tShippingPlanHList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     *     tShippingPlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingPlanH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingPlanH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingPlanH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingPlanHList.add(tShippingPlanH);
     * }
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingPlanHList);
     * </pre>
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingPlanH> tShippingPlanHList) {
        return doBatchUpdate(tShippingPlanHList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tShippingPlanHBhv.<span style="color: #CC4747">batchUpdate</span>(tShippingPlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingPlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingPlanH> tShippingPlanHList, SpecifyQuery<TShippingPlanHCB> colCBLambda) {
        return doBatchUpdate(tShippingPlanHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     *     tShippingPlanH.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingPlanH.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingPlanH.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingPlanH.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingPlanHList.add(tShippingPlanH);
     * }
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingPlanHList);
     * </pre>
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingPlanH> tShippingPlanHList) {
        return doBatchUpdateNonstrict(tShippingPlanHList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingPlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingPlanHList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingPlanH> tShippingPlanHList, SpecifyQuery<TShippingPlanHCB> colCBLambda) {
        return doBatchUpdateNonstrict(tShippingPlanHList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TShippingPlanH> tShippingPlanHList) {
        return doBatchDelete(tShippingPlanHList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TShippingPlanH> tShippingPlanHList) {
        return doBatchDeleteNonstrict(tShippingPlanHList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TShippingPlanH, TShippingPlanHCB&gt;() {
     *     public ConditionBean setup(TShippingPlanH entity, TShippingPlanHCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TShippingPlanH, TShippingPlanHCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setPK...(value);</span>
     * tShippingPlanH.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tShippingPlanH, cb);
     * </pre>
     * @param tShippingPlanH The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TShippingPlanH tShippingPlanH, TShippingPlanHCB cb) {
        return doQueryUpdate(tShippingPlanH, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TShippingPlanHCB cb = new TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">queryDelete</span>(tShippingPlanH, cb);
     * </pre>
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TShippingPlanHCB cb) {
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
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingPlanH.setFoo...(value);
     * tShippingPlanH.setBar...(value);
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tShippingPlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tShippingPlanH.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tShippingPlanH The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, InsertOption<TShippingPlanHCB>> opLambda) {
        doInsert(tShippingPlanH, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingPlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingPlanH.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tShippingPlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingPlanH The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> opLambda) {
        doUpdate(tShippingPlanH, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * tShippingPlanH.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingPlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tShippingPlanH, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingPlanH The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> opLambda) {
        doUpdateNonstrict(tShippingPlanH, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tShippingPlanH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, InsertOption<TShippingPlanHCB>> insertOpLambda, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> updateOpLambda) {
        doInsertOrUpdate(tShippingPlanH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tShippingPlanH The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, InsertOption<TShippingPlanHCB>> insertOpLambda, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tShippingPlanH, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tShippingPlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, DeleteOption<TShippingPlanHCB>> opLambda) {
        doDelete(tShippingPlanH, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tShippingPlanH The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TShippingPlanH tShippingPlanH, WritableOptionCall<TShippingPlanHCB, DeleteOption<TShippingPlanHCB>> opLambda) {
        doDeleteNonstrict(tShippingPlanH, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TShippingPlanH> tShippingPlanHList, WritableOptionCall<TShippingPlanHCB, InsertOption<TShippingPlanHCB>> opLambda) {
        return doBatchInsert(tShippingPlanHList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TShippingPlanH> tShippingPlanHList, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> opLambda) {
        return doBatchUpdate(tShippingPlanHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TShippingPlanH> tShippingPlanHList, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> opLambda) {
        return doBatchUpdateNonstrict(tShippingPlanHList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TShippingPlanH> tShippingPlanHList, WritableOptionCall<TShippingPlanHCB, DeleteOption<TShippingPlanHCB>> opLambda) {
        return doBatchDelete(tShippingPlanHList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tShippingPlanHList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TShippingPlanH> tShippingPlanHList, WritableOptionCall<TShippingPlanHCB, DeleteOption<TShippingPlanHCB>> opLambda) {
        return doBatchDeleteNonstrict(tShippingPlanHList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TShippingPlanH, TShippingPlanHCB> manyArgLambda, WritableOptionCall<TShippingPlanHCB, InsertOption<TShippingPlanHCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingPlanH tShippingPlanH = <span style="color: #70226C">new</span> TShippingPlanH();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setPK...(value);</span>
     * tShippingPlanH.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingPlanH.setVersionNo(value);</span>
     * TShippingPlanHCB cb = <span style="color: #70226C">new</span> TShippingPlanHCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tShippingPlanH, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingPlanH The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TShippingPlanH tShippingPlanH, TShippingPlanHCB cb, WritableOptionCall<TShippingPlanHCB, UpdateOption<TShippingPlanHCB>> opLambda) {
        return doQueryUpdate(tShippingPlanH, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TShippingPlanH. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TShippingPlanHCB cb, WritableOptionCall<TShippingPlanHCB, DeleteOption<TShippingPlanHCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tShippingPlanHBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tShippingPlanHBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingPlanHBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tShippingPlanHBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingPlanHBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tShippingPlanHBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tShippingPlanHBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tShippingPlanHBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tShippingPlanHBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tShippingPlanHBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tShippingPlanHBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tShippingPlanHBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tShippingPlanHBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tShippingPlanHBhv.outideSql().removeBlockComment().selectList()
     * tShippingPlanHBhv.outideSql().removeLineComment().selectList()
     * tShippingPlanHBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TShippingPlanHBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TShippingPlanHBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TShippingPlanH> typeOfSelectedEntity() { return TShippingPlanH.class; }
    protected Class<TShippingPlanH> typeOfHandlingEntity() { return TShippingPlanH.class; }
    protected Class<TShippingPlanHCB> typeOfHandlingConditionBean() { return TShippingPlanHCB.class; }
}
