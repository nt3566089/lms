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
 * The behavior of e_shipping_plan as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_PLAN_ID
 *
 * [column]
 *     SHIPPING_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_PLAN_SLIP_NO, SHIPPING_PLAN_SLIP_ROW_NO, SLIP_TYPE_CD, SHIPPING_DT, HINMOKU_CD, SALES_ORDER_TYPE_CD, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSACTION_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsEShippingPlanBhv extends AbstractBehaviorWritable<EShippingPlan, EShippingPlanCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public EShippingPlanDbm asDBMeta() { return EShippingPlanDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "e_shipping_plan"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public EShippingPlanDbm getMyDBMeta() { return EShippingPlanDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public EShippingPlanCB newConditionBean() { return new EShippingPlanCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public EShippingPlan newMyEntity() { return new EShippingPlan(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public EShippingPlanCB newMyConditionBean() { return new EShippingPlanCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(EShippingPlanCB cb) {
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
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().setFoo...(value);
     * EShippingPlan eShippingPlan = <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (eShippingPlan != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = eShippingPlan.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EShippingPlan selectEntity(EShippingPlanCB cb) {
        return facadeSelectEntity(cb);
    }

    protected EShippingPlan facadeSelectEntity(EShippingPlanCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends EShippingPlan> OptionalEntity<ENTITY> doSelectOptionalEntity(EShippingPlanCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().set...;
     * EShippingPlan eShippingPlan = <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = eShippingPlan.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EShippingPlan selectEntityWithDeletedCheck(EShippingPlanCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param shippingPlanId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EShippingPlan selectByPKValue(Long shippingPlanId) {
        return facadeSelectByPKValue(shippingPlanId);
    }

    protected EShippingPlan facadeSelectByPKValue(Long shippingPlanId) {
        return doSelectByPK(shippingPlanId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EShippingPlan> ENTITY doSelectByPK(Long shippingPlanId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(shippingPlanId), tp);
    }

    protected <ENTITY extends EShippingPlan> OptionalEntity<ENTITY> doSelectOptionalByPK(Long shippingPlanId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(shippingPlanId, tp), shippingPlanId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param shippingPlanId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public EShippingPlan selectByPKValueWithDeletedCheck(Long shippingPlanId) {
        return doSelectByPKWithDeletedCheck(shippingPlanId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EShippingPlan> ENTITY doSelectByPKWithDeletedCheck(Long shippingPlanId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(shippingPlanId), tp);
    }

    protected EShippingPlanCB xprepareCBAsPK(Long shippingPlanId) {
        assertObjectNotNull("shippingPlanId", shippingPlanId);
        return newConditionBean().acceptPK(shippingPlanId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<EShippingPlan> selectByUniqueOf(String receiveCd, Long receiveRowId) {
        return facadeSelectByUniqueOf(receiveCd, receiveRowId);
    }

    protected OptionalEntity<EShippingPlan> facadeSelectByUniqueOf(String receiveCd, Long receiveRowId) {
        return doSelectByUniqueOf(receiveCd, receiveRowId, typeOfSelectedEntity());
    }

    protected <ENTITY extends EShippingPlan> OptionalEntity<ENTITY> doSelectByUniqueOf(String receiveCd, Long receiveRowId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(receiveCd, receiveRowId), tp), receiveCd, receiveRowId);
    }

    protected EShippingPlanCB xprepareCBAsUniqueOf(String receiveCd, Long receiveRowId) {
        assertObjectNotNull("receiveCd", receiveCd);assertObjectNotNull("receiveRowId", receiveRowId);
        return newConditionBean().acceptUniqueOf(receiveCd, receiveRowId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;EShippingPlan&gt; <span style="color: #553000">eShippingPlanList</span> = <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (EShippingPlan eShippingPlan : <span style="color: #553000">eShippingPlanList</span>) {
     *     ... = eShippingPlan.get...;
     * }
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<EShippingPlan> selectList(EShippingPlanCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;EShippingPlan&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (EShippingPlan eShippingPlan : <span style="color: #553000">page</span>) {
     *     ... = eShippingPlan.get...();
     * }
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<EShippingPlan> selectPage(EShippingPlanCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().set...
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @param entityRowHandler The handler of entity row of EShippingPlan. (NotNull)
     */
    public void selectCursor(EShippingPlanCB cb, EntityRowHandler<EShippingPlan> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EShippingPlanCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<EShippingPlanCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param eShippingPlanList The entity list of EShippingPlan. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<EShippingPlan> eShippingPlanList, ReferrerLoaderHandler<LoaderOfEShippingPlan> loaderLambda) {
        xassLRArg(eShippingPlanList, loaderLambda);
        loaderLambda.handle(new LoaderOfEShippingPlan().ready(eShippingPlanList, _behaviorSelector));
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
     * @param eShippingPlan The entity of EShippingPlan. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(EShippingPlan eShippingPlan, ReferrerLoaderHandler<LoaderOfEShippingPlan> loaderLambda) {
        xassLRArg(eShippingPlan, loaderLambda);
        loaderLambda.handle(new LoaderOfEShippingPlan().ready(xnewLRAryLs(eShippingPlan), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key shippingPlanId.
     * @param eShippingPlanList The list of eShippingPlan. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractShippingPlanIdList(List<EShippingPlan> eShippingPlanList)
    { return helpExtractListInternally(eShippingPlanList, "shippingPlanId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eShippingPlan.setFoo...(value);
     * eShippingPlan.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eShippingPlan.set...;</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">insert</span>(eShippingPlan);
     * ... = eShippingPlan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param eShippingPlan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(EShippingPlan eShippingPlan) {
        doInsert(eShippingPlan, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eShippingPlan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eShippingPlan.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eShippingPlan.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">update</span>(eShippingPlan);
     * </pre>
     * @param eShippingPlan The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(EShippingPlan eShippingPlan) {
        doUpdate(eShippingPlan, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eShippingPlan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eShippingPlan.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(eShippingPlan);
     * </pre>
     * @param eShippingPlan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(EShippingPlan eShippingPlan) {
        doUpdateNonstrict(eShippingPlan, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eShippingPlan The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(EShippingPlan eShippingPlan) {
        doInsertOrUpdate(eShippingPlan, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param eShippingPlan The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(EShippingPlan eShippingPlan) {
        doInsertOrUpdateNonstrict(eShippingPlan, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eShippingPlan.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">delete</span>(eShippingPlan);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param eShippingPlan The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(EShippingPlan eShippingPlan) {
        doDelete(eShippingPlan, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(eShippingPlan);
     * </pre>
     * @param eShippingPlan The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(EShippingPlan eShippingPlan) {
        doDeleteNonstrict(eShippingPlan, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(eShippingPlan);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param eShippingPlan The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(EShippingPlan eShippingPlan) {
        doDeleteNonstrictIgnoreDeleted(eShippingPlan, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(EShippingPlan et, final DeleteOption<EShippingPlanCB> op) {
        assertObjectNotNull("eShippingPlan", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     *     eShippingPlan.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eShippingPlan.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     eShippingPlanList.add(eShippingPlan);
     * }
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchInsert</span>(eShippingPlanList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<EShippingPlan> eShippingPlanList) {
        return doBatchInsert(eShippingPlanList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     *     eShippingPlan.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eShippingPlan.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eShippingPlan.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eShippingPlan.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eShippingPlanList.add(eShippingPlan);
     * }
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eShippingPlanList);
     * </pre>
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EShippingPlan> eShippingPlanList) {
        return doBatchUpdate(eShippingPlanList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * eShippingPlanBhv.<span style="color: #CC4747">batchUpdate</span>(eShippingPlanList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eShippingPlanList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<EShippingPlan> eShippingPlanList, SpecifyQuery<EShippingPlanCB> colCBLambda) {
        return doBatchUpdate(eShippingPlanList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     *     eShippingPlan.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         eShippingPlan.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         eShippingPlan.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//eShippingPlan.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     eShippingPlanList.add(eShippingPlan);
     * }
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchUpdate</span>(eShippingPlanList);
     * </pre>
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EShippingPlan> eShippingPlanList) {
        return doBatchUpdateNonstrict(eShippingPlanList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eShippingPlanList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(eShippingPlanList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<EShippingPlan> eShippingPlanList, SpecifyQuery<EShippingPlanCB> colCBLambda) {
        return doBatchUpdateNonstrict(eShippingPlanList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<EShippingPlan> eShippingPlanList) {
        return doBatchDelete(eShippingPlanList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<EShippingPlan> eShippingPlanList) {
        return doBatchDeleteNonstrict(eShippingPlanList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;EShippingPlan, EShippingPlanCB&gt;() {
     *     public ConditionBean setup(EShippingPlan entity, EShippingPlanCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<EShippingPlan, EShippingPlanCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setPK...(value);</span>
     * eShippingPlan.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//eShippingPlan.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">queryUpdate</span>(eShippingPlan, cb);
     * </pre>
     * @param eShippingPlan The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(EShippingPlan eShippingPlan, EShippingPlanCB cb) {
        return doQueryUpdate(eShippingPlan, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * EShippingPlanCB cb = new EShippingPlanCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">queryDelete</span>(eShippingPlan, cb);
     * </pre>
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(EShippingPlanCB cb) {
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
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * eShippingPlan.setFoo...(value);
     * eShippingPlan.setBar...(value);
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">varyingInsert</span>(eShippingPlan, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = eShippingPlan.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param eShippingPlan The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, InsertOption<EShippingPlanCB>> opLambda) {
        doInsert(eShippingPlan, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eShippingPlan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * eShippingPlan.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(eShippingPlan, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eShippingPlan The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> opLambda) {
        doUpdate(eShippingPlan, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * eShippingPlan.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * eShippingPlan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(eShippingPlan, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param eShippingPlan The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> opLambda) {
        doUpdateNonstrict(eShippingPlan, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param eShippingPlan The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, InsertOption<EShippingPlanCB>> insertOpLambda, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> updateOpLambda) {
        doInsertOrUpdate(eShippingPlan, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param eShippingPlan The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, InsertOption<EShippingPlanCB>> insertOpLambda, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(eShippingPlan, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param eShippingPlan The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, DeleteOption<EShippingPlanCB>> opLambda) {
        doDelete(eShippingPlan, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param eShippingPlan The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(EShippingPlan eShippingPlan, WritableOptionCall<EShippingPlanCB, DeleteOption<EShippingPlanCB>> opLambda) {
        doDeleteNonstrict(eShippingPlan, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<EShippingPlan> eShippingPlanList, WritableOptionCall<EShippingPlanCB, InsertOption<EShippingPlanCB>> opLambda) {
        return doBatchInsert(eShippingPlanList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<EShippingPlan> eShippingPlanList, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> opLambda) {
        return doBatchUpdate(eShippingPlanList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<EShippingPlan> eShippingPlanList, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> opLambda) {
        return doBatchUpdateNonstrict(eShippingPlanList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<EShippingPlan> eShippingPlanList, WritableOptionCall<EShippingPlanCB, DeleteOption<EShippingPlanCB>> opLambda) {
        return doBatchDelete(eShippingPlanList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param eShippingPlanList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<EShippingPlan> eShippingPlanList, WritableOptionCall<EShippingPlanCB, DeleteOption<EShippingPlanCB>> opLambda) {
        return doBatchDeleteNonstrict(eShippingPlanList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<EShippingPlan, EShippingPlanCB> manyArgLambda, WritableOptionCall<EShippingPlanCB, InsertOption<EShippingPlanCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * EShippingPlan eShippingPlan = <span style="color: #70226C">new</span> EShippingPlan();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setPK...(value);</span>
     * eShippingPlan.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//eShippingPlan.setVersionNo(value);</span>
     * EShippingPlanCB cb = <span style="color: #70226C">new</span> EShippingPlanCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">eShippingPlanBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(eShippingPlan, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param eShippingPlan The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(EShippingPlan eShippingPlan, EShippingPlanCB cb, WritableOptionCall<EShippingPlanCB, UpdateOption<EShippingPlanCB>> opLambda) {
        return doQueryUpdate(eShippingPlan, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of EShippingPlan. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(EShippingPlanCB cb, WritableOptionCall<EShippingPlanCB, DeleteOption<EShippingPlanCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * eShippingPlanBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * eShippingPlanBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eShippingPlanBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * eShippingPlanBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * eShippingPlanBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * eShippingPlanBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * eShippingPlanBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * eShippingPlanBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * eShippingPlanBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * eShippingPlanBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * eShippingPlanBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * eShippingPlanBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * eShippingPlanBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * eShippingPlanBhv.outideSql().removeBlockComment().selectList()
     * eShippingPlanBhv.outideSql().removeLineComment().selectList()
     * eShippingPlanBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<EShippingPlanBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<EShippingPlanBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends EShippingPlan> typeOfSelectedEntity() { return EShippingPlan.class; }
    protected Class<EShippingPlan> typeOfHandlingEntity() { return EShippingPlan.class; }
    protected Class<EShippingPlanCB> typeOfHandlingConditionBean() { return EShippingPlanCB.class; }
}
