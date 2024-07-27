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
 * The behavior of t_shipping_record_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_RECORD_B_ID
 *
 * [column]
 *     SHIPPING_RECORD_B_ID, SHIPPING_RECORD_H_ID, SHIPPING_SLIP_ROW_NO, SN, PRODUCT_CD, JAN_CD, NUM, LOT_MANAG_TYPE_CD, LOT, CONFIRMED_PACKING_NUM, SR_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_record_h
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingRecordH
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTShippingRecordBBhv extends AbstractBehaviorWritable<TShippingRecordB, TShippingRecordBCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TShippingRecordBDbm asDBMeta() { return TShippingRecordBDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "t_shipping_record_b"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TShippingRecordBDbm getMyDBMeta() { return TShippingRecordBDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TShippingRecordBCB newConditionBean() { return new TShippingRecordBCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TShippingRecordB newMyEntity() { return new TShippingRecordB(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TShippingRecordBCB newMyConditionBean() { return new TShippingRecordBCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TShippingRecordBCB cb) {
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
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * TShippingRecordB tShippingRecordB = <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tShippingRecordB != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tShippingRecordB.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingRecordB selectEntity(TShippingRecordBCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TShippingRecordB facadeSelectEntity(TShippingRecordBCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingRecordB> OptionalEntity<ENTITY> doSelectOptionalEntity(TShippingRecordBCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().set...;
     * TShippingRecordB tShippingRecordB = <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tShippingRecordB.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingRecordB selectEntityWithDeletedCheck(TShippingRecordBCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shippingRecordBId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingRecordB selectByPKValue(Long shippingRecordBId) {
        return facadeSelectByPKValue(shippingRecordBId);
    }

    protected TShippingRecordB facadeSelectByPKValue(Long shippingRecordBId) {
        return doSelectByPK(shippingRecordBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingRecordB> ENTITY doSelectByPK(Long shippingRecordBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shippingRecordBId), tp);
    }

    protected <ENTITY extends TShippingRecordB> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shippingRecordBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shippingRecordBId, tp), shippingRecordBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shippingRecordBId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TShippingRecordB selectByPKValueWithDeletedCheck(Long shippingRecordBId) {
        return doSelectByPKWithDeletedCheck(shippingRecordBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TShippingRecordB> ENTITY doSelectByPKWithDeletedCheck(Long shippingRecordBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shippingRecordBId), tp);
    }

    protected TShippingRecordBCB xprepareCBAsPK(Long shippingRecordBId) {
        assertObjectNotNull("shippingRecordBId", shippingRecordBId);
        return newConditionBean().acceptPK(shippingRecordBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TShippingRecordB&gt; <span style="color: #553000">tShippingRecordBList</span> = <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TShippingRecordB tShippingRecordB : <span style="color: #553000">tShippingRecordBList</span>) {
     *     ... = tShippingRecordB.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TShippingRecordB> selectList(TShippingRecordBCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TShippingRecordB&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TShippingRecordB tShippingRecordB : <span style="color: #553000">page</span>) {
     *     ... = tShippingRecordB.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TShippingRecordB> selectPage(TShippingRecordBCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().set...
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @param entityRowHandler The handler of entity row of TShippingRecordB. (NotNull)
     */
    public void selectCursor(TShippingRecordBCB cb, EntityRowHandler<TShippingRecordB> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingRecordBCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TShippingRecordBCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tShippingRecordBList The entity list of TShippingRecordB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TShippingRecordB> tShippingRecordBList, ReferrerLoaderHandler<LoaderOfTShippingRecordB> loaderLambda) {
        xassLRArg(tShippingRecordBList, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingRecordB().ready(tShippingRecordBList, _behaviorSelector));
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
     * @param tShippingRecordB The entity of TShippingRecordB. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TShippingRecordB tShippingRecordB, ReferrerLoaderHandler<LoaderOfTShippingRecordB> loaderLambda) {
        xassLRArg(tShippingRecordB, loaderLambda);
        loaderLambda.handle(new LoaderOfTShippingRecordB().ready(xnewLRAryLs(tShippingRecordB), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'TShippingRecordH'.
     * @param tShippingRecordBList The list of tShippingRecordB. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TShippingRecordH> pulloutTShippingRecordH(List<TShippingRecordB> tShippingRecordBList)
    { return helpPulloutInternally(tShippingRecordBList, "tShippingRecordH"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shippingRecordBId.
     * @param tShippingRecordBList The list of tShippingRecordB. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShippingRecordBIdList(List<TShippingRecordB> tShippingRecordBList)
    { return helpExtractListInternally(tShippingRecordBList, "shippingRecordBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingRecordB.setFoo...(value);
     * tShippingRecordB.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.set...;</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">insert</span>(tShippingRecordB);
     * ... = tShippingRecordB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tShippingRecordB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TShippingRecordB tShippingRecordB) {
        doInsert(tShippingRecordB, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">update</span>(tShippingRecordB);
     * </pre>
     * @param tShippingRecordB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TShippingRecordB tShippingRecordB) {
        doUpdate(tShippingRecordB, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tShippingRecordB);
     * </pre>
     * @param tShippingRecordB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TShippingRecordB tShippingRecordB) {
        doUpdateNonstrict(tShippingRecordB, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingRecordB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TShippingRecordB tShippingRecordB) {
        doInsertOrUpdate(tShippingRecordB, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tShippingRecordB The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TShippingRecordB tShippingRecordB) {
        doInsertOrUpdateNonstrict(tShippingRecordB, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">delete</span>(tShippingRecordB);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tShippingRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TShippingRecordB tShippingRecordB) {
        doDelete(tShippingRecordB, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tShippingRecordB);
     * </pre>
     * @param tShippingRecordB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TShippingRecordB tShippingRecordB) {
        doDeleteNonstrict(tShippingRecordB, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tShippingRecordB);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tShippingRecordB The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TShippingRecordB tShippingRecordB) {
        doDeleteNonstrictIgnoreDeleted(tShippingRecordB, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TShippingRecordB et, final DeleteOption<TShippingRecordBCB> op) {
        assertObjectNotNull("tShippingRecordB", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     *     tShippingRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingRecordB.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tShippingRecordBList.add(tShippingRecordB);
     * }
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchInsert</span>(tShippingRecordBList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TShippingRecordB> tShippingRecordBList) {
        return doBatchInsert(tShippingRecordBList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     *     tShippingRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingRecordB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingRecordB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingRecordB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingRecordBList.add(tShippingRecordB);
     * }
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingRecordBList);
     * </pre>
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingRecordB> tShippingRecordBList) {
        return doBatchUpdate(tShippingRecordBList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tShippingRecordBBhv.<span style="color: #CC4747">batchUpdate</span>(tShippingRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TShippingRecordB> tShippingRecordBList, SpecifyQuery<TShippingRecordBCB> colCBLambda) {
        return doBatchUpdate(tShippingRecordBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     *     tShippingRecordB.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tShippingRecordB.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tShippingRecordB.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tShippingRecordB.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tShippingRecordBList.add(tShippingRecordB);
     * }
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tShippingRecordBList);
     * </pre>
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingRecordB> tShippingRecordBList) {
        return doBatchUpdateNonstrict(tShippingRecordBList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tShippingRecordBList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TShippingRecordB> tShippingRecordBList, SpecifyQuery<TShippingRecordBCB> colCBLambda) {
        return doBatchUpdateNonstrict(tShippingRecordBList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TShippingRecordB> tShippingRecordBList) {
        return doBatchDelete(tShippingRecordBList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TShippingRecordB> tShippingRecordBList) {
        return doBatchDeleteNonstrict(tShippingRecordBList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TShippingRecordB, TShippingRecordBCB&gt;() {
     *     public ConditionBean setup(TShippingRecordB entity, TShippingRecordBCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TShippingRecordB, TShippingRecordBCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setPK...(value);</span>
     * tShippingRecordB.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tShippingRecordB, cb);
     * </pre>
     * @param tShippingRecordB The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TShippingRecordB tShippingRecordB, TShippingRecordBCB cb) {
        return doQueryUpdate(tShippingRecordB, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TShippingRecordBCB cb = new TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">queryDelete</span>(tShippingRecordB, cb);
     * </pre>
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TShippingRecordBCB cb) {
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
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tShippingRecordB.setFoo...(value);
     * tShippingRecordB.setBar...(value);
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tShippingRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tShippingRecordB.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tShippingRecordB The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, InsertOption<TShippingRecordBCB>> opLambda) {
        doInsert(tShippingRecordB, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tShippingRecordB.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tShippingRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingRecordB The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> opLambda) {
        doUpdate(tShippingRecordB, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * tShippingRecordB.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tShippingRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tShippingRecordB, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingRecordB The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> opLambda) {
        doUpdateNonstrict(tShippingRecordB, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tShippingRecordB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, InsertOption<TShippingRecordBCB>> insertOpLambda, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> updateOpLambda) {
        doInsertOrUpdate(tShippingRecordB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tShippingRecordB The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, InsertOption<TShippingRecordBCB>> insertOpLambda, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tShippingRecordB, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tShippingRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, DeleteOption<TShippingRecordBCB>> opLambda) {
        doDelete(tShippingRecordB, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tShippingRecordB The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TShippingRecordB tShippingRecordB, WritableOptionCall<TShippingRecordBCB, DeleteOption<TShippingRecordBCB>> opLambda) {
        doDeleteNonstrict(tShippingRecordB, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TShippingRecordB> tShippingRecordBList, WritableOptionCall<TShippingRecordBCB, InsertOption<TShippingRecordBCB>> opLambda) {
        return doBatchInsert(tShippingRecordBList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TShippingRecordB> tShippingRecordBList, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> opLambda) {
        return doBatchUpdate(tShippingRecordBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TShippingRecordB> tShippingRecordBList, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> opLambda) {
        return doBatchUpdateNonstrict(tShippingRecordBList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TShippingRecordB> tShippingRecordBList, WritableOptionCall<TShippingRecordBCB, DeleteOption<TShippingRecordBCB>> opLambda) {
        return doBatchDelete(tShippingRecordBList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tShippingRecordBList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TShippingRecordB> tShippingRecordBList, WritableOptionCall<TShippingRecordBCB, DeleteOption<TShippingRecordBCB>> opLambda) {
        return doBatchDeleteNonstrict(tShippingRecordBList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TShippingRecordB, TShippingRecordBCB> manyArgLambda, WritableOptionCall<TShippingRecordBCB, InsertOption<TShippingRecordBCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TShippingRecordB tShippingRecordB = <span style="color: #70226C">new</span> TShippingRecordB();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setPK...(value);</span>
     * tShippingRecordB.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tShippingRecordB.setVersionNo(value);</span>
     * TShippingRecordBCB cb = <span style="color: #70226C">new</span> TShippingRecordBCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tShippingRecordBBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tShippingRecordB, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tShippingRecordB The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TShippingRecordB tShippingRecordB, TShippingRecordBCB cb, WritableOptionCall<TShippingRecordBCB, UpdateOption<TShippingRecordBCB>> opLambda) {
        return doQueryUpdate(tShippingRecordB, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TShippingRecordB. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TShippingRecordBCB cb, WritableOptionCall<TShippingRecordBCB, DeleteOption<TShippingRecordBCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tShippingRecordBBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tShippingRecordBBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingRecordBBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tShippingRecordBBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tShippingRecordBBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tShippingRecordBBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tShippingRecordBBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tShippingRecordBBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tShippingRecordBBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tShippingRecordBBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tShippingRecordBBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tShippingRecordBBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tShippingRecordBBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tShippingRecordBBhv.outideSql().removeBlockComment().selectList()
     * tShippingRecordBBhv.outideSql().removeLineComment().selectList()
     * tShippingRecordBBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TShippingRecordBBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TShippingRecordBBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TShippingRecordB> typeOfSelectedEntity() { return TShippingRecordB.class; }
    protected Class<TShippingRecordB> typeOfHandlingEntity() { return TShippingRecordB.class; }
    protected Class<TShippingRecordBCB> typeOfHandlingConditionBean() { return TShippingRecordBCB.class; }
}
