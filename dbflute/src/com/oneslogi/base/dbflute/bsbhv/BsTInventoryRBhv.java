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
 * The behavior of t_inventory_r as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, INVENTORY_DIFF_OUT_FLG, INVENTORY_DIFF_OUT_USER_ID, INVENTORY_DIFF_OUT_DT, INVENTORY_RECORD_OUT_FLG, INVENTORY_RECORD_OUT_USER_ID, INVENTORY_RECORD_OUT_DT, INVENTORY_RECORD_LOC_OUT_FLG, INVENTORY_RECORD_LOC_OUT_USER_ID, INVENTORY_RECORD_LOC_OUT_DT, STOCK_DIFF_OUT_FLG, STOCK_DIFF_OUT_USER_ID, STOCK_DIFF_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_user, t_inventory_b, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByInventoryRecordLocOutUserId, bUserByStockDiffOutUserId, bUserByTwlOutUserId, bUserByInventoryRecordOutUserId, tInventoryB, bUserByInventoryDiffOutUserId, bClassDtlByTwlOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsTInventoryRBhv extends AbstractBehaviorWritable<TInventoryR, TInventoryRCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public TInventoryRDbm asDBMeta() { return TInventoryRDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "t_inventory_r"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public TInventoryRDbm getMyDBMeta() { return TInventoryRDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public TInventoryRCB newConditionBean() { return new TInventoryRCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public TInventoryR newMyEntity() { return new TInventoryR(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public TInventoryRCB newMyConditionBean() { return new TInventoryRCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(TInventoryRCB cb) {
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
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().setFoo...(value);
     * TInventoryR tInventoryR = <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (tInventoryR != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = tInventoryR.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryR selectEntity(TInventoryRCB cb) {
        return facadeSelectEntity(cb);
    }

    protected TInventoryR facadeSelectEntity(TInventoryRCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryR> OptionalEntity<ENTITY> doSelectOptionalEntity(TInventoryRCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().set...;
     * TInventoryR tInventoryR = <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = tInventoryR.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryR selectEntityWithDeletedCheck(TInventoryRCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param inventoryBId : PK, NotNull, BIGINT(19), FK to t_inventory_b. (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryR selectByPKValue(Long inventoryBId) {
        return facadeSelectByPKValue(inventoryBId);
    }

    protected TInventoryR facadeSelectByPKValue(Long inventoryBId) {
        return doSelectByPK(inventoryBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryR> ENTITY doSelectByPK(Long inventoryBId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(inventoryBId), tp);
    }

    protected <ENTITY extends TInventoryR> OptionalEntity<ENTITY> doSelectOptionalByPK(Long inventoryBId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(inventoryBId, tp), inventoryBId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param inventoryBId : PK, NotNull, BIGINT(19), FK to t_inventory_b. (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public TInventoryR selectByPKValueWithDeletedCheck(Long inventoryBId) {
        return doSelectByPKWithDeletedCheck(inventoryBId, typeOfSelectedEntity());
    }

    protected <ENTITY extends TInventoryR> ENTITY doSelectByPKWithDeletedCheck(Long inventoryBId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(inventoryBId), tp);
    }

    protected TInventoryRCB xprepareCBAsPK(Long inventoryBId) {
        assertObjectNotNull("inventoryBId", inventoryBId);
        return newConditionBean().acceptPK(inventoryBId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;TInventoryR&gt; <span style="color: #553000">tInventoryRList</span> = <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (TInventoryR tInventoryR : <span style="color: #553000">tInventoryRList</span>) {
     *     ... = tInventoryR.get...;
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<TInventoryR> selectList(TInventoryRCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;TInventoryR&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (TInventoryR tInventoryR : <span style="color: #553000">page</span>) {
     *     ... = tInventoryR.get...();
     * }
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<TInventoryR> selectPage(TInventoryRCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().set...
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @param entityRowHandler The handler of entity row of TInventoryR. (NotNull)
     */
    public void selectCursor(TInventoryRCB cb, EntityRowHandler<TInventoryR> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TInventoryRCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<TInventoryRCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param tInventoryRList The entity list of TInventoryR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<TInventoryR> tInventoryRList, ReferrerLoaderHandler<LoaderOfTInventoryR> loaderLambda) {
        xassLRArg(tInventoryRList, loaderLambda);
        loaderLambda.handle(new LoaderOfTInventoryR().ready(tInventoryRList, _behaviorSelector));
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
     * @param tInventoryR The entity of TInventoryR. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(TInventoryR tInventoryR, ReferrerLoaderHandler<LoaderOfTInventoryR> loaderLambda) {
        xassLRArg(tInventoryR, loaderLambda);
        loaderLambda.handle(new LoaderOfTInventoryR().ready(xnewLRAryLs(tInventoryR), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByInventoryRecordLocOutUserId(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bUserByInventoryRecordLocOutUserId"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByStockDiffOutUserId(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bUserByStockDiffOutUserId"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByTwlOutUserId(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bUserByTwlOutUserId"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByInventoryRecordOutUserId(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bUserByInventoryRecordOutUserId"); }

    /**
     * Pull out the list of foreign table 'TInventoryB'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<TInventoryB> pulloutTInventoryB(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "tInventoryB"); }

    /**
     * Pull out the list of foreign table 'BUser'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BUser> pulloutBUserByInventoryDiffOutUserId(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bUserByInventoryDiffOutUserId"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByTwlOutFlg(List<TInventoryR> tInventoryRList)
    { return helpPulloutInternally(tInventoryRList, "bClassDtlByTwlOutFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key inventoryBId.
     * @param tInventoryRList The list of tInventoryR. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractInventoryBIdList(List<TInventoryR> tInventoryRList)
    { return helpExtractListInternally(tInventoryRList, "inventoryBId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tInventoryR.setFoo...(value);
     * tInventoryR.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryR.set...;</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">insert</span>(tInventoryR);
     * ... = tInventoryR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param tInventoryR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(TInventoryR tInventoryR) {
        doInsert(tInventoryR, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryR.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">update</span>(tInventoryR);
     * </pre>
     * @param tInventoryR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(TInventoryR tInventoryR) {
        doUpdate(tInventoryR, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(tInventoryR);
     * </pre>
     * @param tInventoryR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(TInventoryR tInventoryR) {
        doUpdateNonstrict(tInventoryR, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tInventoryR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(TInventoryR tInventoryR) {
        doInsertOrUpdate(tInventoryR, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param tInventoryR The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(TInventoryR tInventoryR) {
        doInsertOrUpdateNonstrict(tInventoryR, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">delete</span>(tInventoryR);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param tInventoryR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(TInventoryR tInventoryR) {
        doDelete(tInventoryR, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(tInventoryR);
     * </pre>
     * @param tInventoryR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(TInventoryR tInventoryR) {
        doDeleteNonstrict(tInventoryR, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(tInventoryR);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param tInventoryR The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(TInventoryR tInventoryR) {
        doDeleteNonstrictIgnoreDeleted(tInventoryR, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(TInventoryR et, final DeleteOption<TInventoryRCB> op) {
        assertObjectNotNull("tInventoryR", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     *     tInventoryR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryR.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     tInventoryRList.add(tInventoryR);
     * }
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchInsert</span>(tInventoryRList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<TInventoryR> tInventoryRList) {
        return doBatchInsert(tInventoryRList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     *     tInventoryR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tInventoryR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tInventoryR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tInventoryRList.add(tInventoryR);
     * }
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryRList);
     * </pre>
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TInventoryR> tInventoryRList) {
        return doBatchUpdate(tInventoryRList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * tInventoryRBhv.<span style="color: #CC4747">batchUpdate</span>(tInventoryRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<TInventoryR> tInventoryRList, SpecifyQuery<TInventoryRCB> colCBLambda) {
        return doBatchUpdate(tInventoryRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     *     tInventoryR.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         tInventoryR.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         tInventoryR.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//tInventoryR.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     tInventoryRList.add(tInventoryR);
     * }
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchUpdate</span>(tInventoryRList);
     * </pre>
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TInventoryR> tInventoryRList) {
        return doBatchUpdateNonstrict(tInventoryRList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tInventoryRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(tInventoryRList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<TInventoryR> tInventoryRList, SpecifyQuery<TInventoryRCB> colCBLambda) {
        return doBatchUpdateNonstrict(tInventoryRList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<TInventoryR> tInventoryRList) {
        return doBatchDelete(tInventoryRList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<TInventoryR> tInventoryRList) {
        return doBatchDeleteNonstrict(tInventoryRList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;TInventoryR, TInventoryRCB&gt;() {
     *     public ConditionBean setup(TInventoryR entity, TInventoryRCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<TInventoryR, TInventoryRCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tInventoryR.setPK...(value);</span>
     * tInventoryR.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//tInventoryR.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//tInventoryR.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">queryUpdate</span>(tInventoryR, cb);
     * </pre>
     * @param tInventoryR The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(TInventoryR tInventoryR, TInventoryRCB cb) {
        return doQueryUpdate(tInventoryR, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * TInventoryRCB cb = new TInventoryRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">queryDelete</span>(tInventoryR, cb);
     * </pre>
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(TInventoryRCB cb) {
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
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * tInventoryR.setFoo...(value);
     * tInventoryR.setBar...(value);
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">varyingInsert</span>(tInventoryR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = tInventoryR.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param tInventoryR The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, InsertOption<TInventoryRCB>> opLambda) {
        doInsert(tInventoryR, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * tInventoryR.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(tInventoryR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryR The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> opLambda) {
        doUpdate(tInventoryR, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * tInventoryR.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * tInventoryR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(tInventoryR, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryR The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> opLambda) {
        doUpdateNonstrict(tInventoryR, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param tInventoryR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, InsertOption<TInventoryRCB>> insertOpLambda, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> updateOpLambda) {
        doInsertOrUpdate(tInventoryR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param tInventoryR The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, InsertOption<TInventoryRCB>> insertOpLambda, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(tInventoryR, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param tInventoryR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, DeleteOption<TInventoryRCB>> opLambda) {
        doDelete(tInventoryR, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param tInventoryR The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(TInventoryR tInventoryR, WritableOptionCall<TInventoryRCB, DeleteOption<TInventoryRCB>> opLambda) {
        doDeleteNonstrict(tInventoryR, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<TInventoryR> tInventoryRList, WritableOptionCall<TInventoryRCB, InsertOption<TInventoryRCB>> opLambda) {
        return doBatchInsert(tInventoryRList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<TInventoryR> tInventoryRList, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> opLambda) {
        return doBatchUpdate(tInventoryRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<TInventoryR> tInventoryRList, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> opLambda) {
        return doBatchUpdateNonstrict(tInventoryRList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<TInventoryR> tInventoryRList, WritableOptionCall<TInventoryRCB, DeleteOption<TInventoryRCB>> opLambda) {
        return doBatchDelete(tInventoryRList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param tInventoryRList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<TInventoryR> tInventoryRList, WritableOptionCall<TInventoryRCB, DeleteOption<TInventoryRCB>> opLambda) {
        return doBatchDeleteNonstrict(tInventoryRList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<TInventoryR, TInventoryRCB> manyArgLambda, WritableOptionCall<TInventoryRCB, InsertOption<TInventoryRCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * TInventoryR tInventoryR = <span style="color: #70226C">new</span> TInventoryR();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//tInventoryR.setPK...(value);</span>
     * tInventoryR.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//tInventoryR.setVersionNo(value);</span>
     * TInventoryRCB cb = <span style="color: #70226C">new</span> TInventoryRCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">tInventoryRBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(tInventoryR, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param tInventoryR The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(TInventoryR tInventoryR, TInventoryRCB cb, WritableOptionCall<TInventoryRCB, UpdateOption<TInventoryRCB>> opLambda) {
        return doQueryUpdate(tInventoryR, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of TInventoryR. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(TInventoryRCB cb, WritableOptionCall<TInventoryRCB, DeleteOption<TInventoryRCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * tInventoryRBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * tInventoryRBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tInventoryRBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * tInventoryRBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * tInventoryRBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * tInventoryRBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * tInventoryRBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * tInventoryRBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * tInventoryRBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * tInventoryRBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * tInventoryRBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * tInventoryRBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * tInventoryRBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * tInventoryRBhv.outideSql().removeBlockComment().selectList()
     * tInventoryRBhv.outideSql().removeLineComment().selectList()
     * tInventoryRBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<TInventoryRBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<TInventoryRBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends TInventoryR> typeOfSelectedEntity() { return TInventoryR.class; }
    protected Class<TInventoryR> typeOfHandlingEntity() { return TInventoryR.class; }
    protected Class<TInventoryRCB> typeOfHandlingConditionBean() { return TInventoryRCB.class; }
}