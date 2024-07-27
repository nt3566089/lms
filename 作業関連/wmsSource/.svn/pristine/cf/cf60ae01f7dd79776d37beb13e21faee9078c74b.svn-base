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
 * The behavior of m_koguchi_delivery as TABLE. <br>
 * <pre>
 * [primary key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, BASE_CD, SERV_SALES_ORG_ID, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, CARRIER_ID, REQ_SALES_ORG_ID, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     KOGUCHI_DELIVERY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_sales_org, m_carrier
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mSalesOrg, mCarrier
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMKoguchiDeliveryBhv extends AbstractBehaviorWritable<MKoguchiDelivery, MKoguchiDeliveryCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MKoguchiDeliveryDbm asDBMeta() { return MKoguchiDeliveryDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_koguchi_delivery"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MKoguchiDeliveryDbm getMyDBMeta() { return MKoguchiDeliveryDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MKoguchiDeliveryCB newConditionBean() { return new MKoguchiDeliveryCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MKoguchiDelivery newMyEntity() { return new MKoguchiDelivery(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MKoguchiDeliveryCB newMyConditionBean() { return new MKoguchiDeliveryCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MKoguchiDeliveryCB cb) {
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
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mKoguchiDelivery != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mKoguchiDelivery.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MKoguchiDelivery selectEntity(MKoguchiDeliveryCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MKoguchiDelivery facadeSelectEntity(MKoguchiDeliveryCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MKoguchiDelivery> OptionalEntity<ENTITY> doSelectOptionalEntity(MKoguchiDeliveryCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().set...;
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mKoguchiDelivery.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MKoguchiDelivery selectEntityWithDeletedCheck(MKoguchiDeliveryCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param koguchiDeliveryId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MKoguchiDelivery selectByPKValue(Long koguchiDeliveryId) {
        return facadeSelectByPKValue(koguchiDeliveryId);
    }

    protected MKoguchiDelivery facadeSelectByPKValue(Long koguchiDeliveryId) {
        return doSelectByPK(koguchiDeliveryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MKoguchiDelivery> ENTITY doSelectByPK(Long koguchiDeliveryId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(koguchiDeliveryId), tp);
    }

    protected <ENTITY extends MKoguchiDelivery> OptionalEntity<ENTITY> doSelectOptionalByPK(Long koguchiDeliveryId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(koguchiDeliveryId, tp), koguchiDeliveryId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param koguchiDeliveryId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MKoguchiDelivery selectByPKValueWithDeletedCheck(Long koguchiDeliveryId) {
        return doSelectByPKWithDeletedCheck(koguchiDeliveryId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MKoguchiDelivery> ENTITY doSelectByPKWithDeletedCheck(Long koguchiDeliveryId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(koguchiDeliveryId), tp);
    }

    protected MKoguchiDeliveryCB xprepareCBAsPK(Long koguchiDeliveryId) {
        assertObjectNotNull("koguchiDeliveryId", koguchiDeliveryId);
        return newConditionBean().acceptPK(koguchiDeliveryId);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MKoguchiDelivery&gt; <span style="color: #553000">mKoguchiDeliveryList</span> = <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MKoguchiDelivery mKoguchiDelivery : <span style="color: #553000">mKoguchiDeliveryList</span>) {
     *     ... = mKoguchiDelivery.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MKoguchiDelivery> selectList(MKoguchiDeliveryCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MKoguchiDelivery&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MKoguchiDelivery mKoguchiDelivery : <span style="color: #553000">page</span>) {
     *     ... = mKoguchiDelivery.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MKoguchiDelivery> selectPage(MKoguchiDeliveryCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().set...
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @param entityRowHandler The handler of entity row of MKoguchiDelivery. (NotNull)
     */
    public void selectCursor(MKoguchiDeliveryCB cb, EntityRowHandler<MKoguchiDelivery> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MKoguchiDeliveryCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MKoguchiDeliveryCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mKoguchiDeliveryList The entity list of MKoguchiDelivery. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MKoguchiDelivery> mKoguchiDeliveryList, ReferrerLoaderHandler<LoaderOfMKoguchiDelivery> loaderLambda) {
        xassLRArg(mKoguchiDeliveryList, loaderLambda);
        loaderLambda.handle(new LoaderOfMKoguchiDelivery().ready(mKoguchiDeliveryList, _behaviorSelector));
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
     * @param mKoguchiDelivery The entity of MKoguchiDelivery. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MKoguchiDelivery mKoguchiDelivery, ReferrerLoaderHandler<LoaderOfMKoguchiDelivery> loaderLambda) {
        xassLRArg(mKoguchiDelivery, loaderLambda);
        loaderLambda.handle(new LoaderOfMKoguchiDelivery().ready(xnewLRAryLs(mKoguchiDelivery), _behaviorSelector));
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MSalesOrg'.
     * @param mKoguchiDeliveryList The list of mKoguchiDelivery. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MSalesOrg> pulloutMSalesOrg(List<MKoguchiDelivery> mKoguchiDeliveryList)
    { return helpPulloutInternally(mKoguchiDeliveryList, "mSalesOrg"); }

    /**
     * Pull out the list of foreign table 'MCarrier'.
     * @param mKoguchiDeliveryList The list of mKoguchiDelivery. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCarrier> pulloutMCarrier(List<MKoguchiDelivery> mKoguchiDeliveryList)
    { return helpPulloutInternally(mKoguchiDeliveryList, "mCarrier"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key koguchiDeliveryId.
     * @param mKoguchiDeliveryList The list of mKoguchiDelivery. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractKoguchiDeliveryIdList(List<MKoguchiDelivery> mKoguchiDeliveryList)
    { return helpExtractListInternally(mKoguchiDeliveryList, "koguchiDeliveryId"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mKoguchiDelivery.setFoo...(value);
     * mKoguchiDelivery.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.set...;</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">insert</span>(mKoguchiDelivery);
     * ... = mKoguchiDelivery.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mKoguchiDelivery The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MKoguchiDelivery mKoguchiDelivery) {
        doInsert(mKoguchiDelivery, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mKoguchiDelivery.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mKoguchiDelivery.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">update</span>(mKoguchiDelivery);
     * </pre>
     * @param mKoguchiDelivery The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MKoguchiDelivery mKoguchiDelivery) {
        doUpdate(mKoguchiDelivery, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mKoguchiDelivery.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mKoguchiDelivery);
     * </pre>
     * @param mKoguchiDelivery The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MKoguchiDelivery mKoguchiDelivery) {
        doUpdateNonstrict(mKoguchiDelivery, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mKoguchiDelivery The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MKoguchiDelivery mKoguchiDelivery) {
        doInsertOrUpdate(mKoguchiDelivery, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mKoguchiDelivery The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MKoguchiDelivery mKoguchiDelivery) {
        doInsertOrUpdateNonstrict(mKoguchiDelivery, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mKoguchiDelivery.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">delete</span>(mKoguchiDelivery);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mKoguchiDelivery The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MKoguchiDelivery mKoguchiDelivery) {
        doDelete(mKoguchiDelivery, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mKoguchiDelivery);
     * </pre>
     * @param mKoguchiDelivery The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MKoguchiDelivery mKoguchiDelivery) {
        doDeleteNonstrict(mKoguchiDelivery, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mKoguchiDelivery);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mKoguchiDelivery The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MKoguchiDelivery mKoguchiDelivery) {
        doDeleteNonstrictIgnoreDeleted(mKoguchiDelivery, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MKoguchiDelivery et, final DeleteOption<MKoguchiDeliveryCB> op) {
        assertObjectNotNull("mKoguchiDelivery", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     *     mKoguchiDelivery.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mKoguchiDelivery.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mKoguchiDeliveryList.add(mKoguchiDelivery);
     * }
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchInsert</span>(mKoguchiDeliveryList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        return doBatchInsert(mKoguchiDeliveryList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     *     mKoguchiDelivery.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mKoguchiDelivery.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mKoguchiDelivery.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mKoguchiDelivery.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mKoguchiDeliveryList.add(mKoguchiDelivery);
     * }
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mKoguchiDeliveryList);
     * </pre>
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        return doBatchUpdate(mKoguchiDeliveryList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mKoguchiDeliveryBhv.<span style="color: #CC4747">batchUpdate</span>(mKoguchiDeliveryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mKoguchiDeliveryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MKoguchiDelivery> mKoguchiDeliveryList, SpecifyQuery<MKoguchiDeliveryCB> colCBLambda) {
        return doBatchUpdate(mKoguchiDeliveryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     *     mKoguchiDelivery.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mKoguchiDelivery.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mKoguchiDelivery.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mKoguchiDelivery.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mKoguchiDeliveryList.add(mKoguchiDelivery);
     * }
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mKoguchiDeliveryList);
     * </pre>
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        return doBatchUpdateNonstrict(mKoguchiDeliveryList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mKoguchiDeliveryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mKoguchiDeliveryList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MKoguchiDelivery> mKoguchiDeliveryList, SpecifyQuery<MKoguchiDeliveryCB> colCBLambda) {
        return doBatchUpdateNonstrict(mKoguchiDeliveryList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        return doBatchDelete(mKoguchiDeliveryList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MKoguchiDelivery> mKoguchiDeliveryList) {
        return doBatchDeleteNonstrict(mKoguchiDeliveryList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MKoguchiDelivery, MKoguchiDeliveryCB&gt;() {
     *     public ConditionBean setup(MKoguchiDelivery entity, MKoguchiDeliveryCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MKoguchiDelivery, MKoguchiDeliveryCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setPK...(value);</span>
     * mKoguchiDelivery.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mKoguchiDelivery, cb);
     * </pre>
     * @param mKoguchiDelivery The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MKoguchiDelivery mKoguchiDelivery, MKoguchiDeliveryCB cb) {
        return doQueryUpdate(mKoguchiDelivery, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MKoguchiDeliveryCB cb = new MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">queryDelete</span>(mKoguchiDelivery, cb);
     * </pre>
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MKoguchiDeliveryCB cb) {
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
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mKoguchiDelivery.setFoo...(value);
     * mKoguchiDelivery.setBar...(value);
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mKoguchiDelivery, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mKoguchiDelivery.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mKoguchiDelivery The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, InsertOption<MKoguchiDeliveryCB>> opLambda) {
        doInsert(mKoguchiDelivery, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mKoguchiDelivery.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mKoguchiDelivery.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mKoguchiDelivery, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mKoguchiDelivery The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> opLambda) {
        doUpdate(mKoguchiDelivery, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * mKoguchiDelivery.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mKoguchiDelivery.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mKoguchiDelivery, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mKoguchiDelivery The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> opLambda) {
        doUpdateNonstrict(mKoguchiDelivery, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mKoguchiDelivery The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, InsertOption<MKoguchiDeliveryCB>> insertOpLambda, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> updateOpLambda) {
        doInsertOrUpdate(mKoguchiDelivery, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mKoguchiDelivery The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, InsertOption<MKoguchiDeliveryCB>> insertOpLambda, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mKoguchiDelivery, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mKoguchiDelivery The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, DeleteOption<MKoguchiDeliveryCB>> opLambda) {
        doDelete(mKoguchiDelivery, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mKoguchiDelivery The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MKoguchiDelivery mKoguchiDelivery, WritableOptionCall<MKoguchiDeliveryCB, DeleteOption<MKoguchiDeliveryCB>> opLambda) {
        doDeleteNonstrict(mKoguchiDelivery, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MKoguchiDelivery> mKoguchiDeliveryList, WritableOptionCall<MKoguchiDeliveryCB, InsertOption<MKoguchiDeliveryCB>> opLambda) {
        return doBatchInsert(mKoguchiDeliveryList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MKoguchiDelivery> mKoguchiDeliveryList, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> opLambda) {
        return doBatchUpdate(mKoguchiDeliveryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MKoguchiDelivery> mKoguchiDeliveryList, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> opLambda) {
        return doBatchUpdateNonstrict(mKoguchiDeliveryList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MKoguchiDelivery> mKoguchiDeliveryList, WritableOptionCall<MKoguchiDeliveryCB, DeleteOption<MKoguchiDeliveryCB>> opLambda) {
        return doBatchDelete(mKoguchiDeliveryList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mKoguchiDeliveryList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MKoguchiDelivery> mKoguchiDeliveryList, WritableOptionCall<MKoguchiDeliveryCB, DeleteOption<MKoguchiDeliveryCB>> opLambda) {
        return doBatchDeleteNonstrict(mKoguchiDeliveryList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MKoguchiDelivery, MKoguchiDeliveryCB> manyArgLambda, WritableOptionCall<MKoguchiDeliveryCB, InsertOption<MKoguchiDeliveryCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MKoguchiDelivery mKoguchiDelivery = <span style="color: #70226C">new</span> MKoguchiDelivery();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setPK...(value);</span>
     * mKoguchiDelivery.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mKoguchiDelivery.setVersionNo(value);</span>
     * MKoguchiDeliveryCB cb = <span style="color: #70226C">new</span> MKoguchiDeliveryCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mKoguchiDeliveryBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mKoguchiDelivery, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mKoguchiDelivery The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MKoguchiDelivery mKoguchiDelivery, MKoguchiDeliveryCB cb, WritableOptionCall<MKoguchiDeliveryCB, UpdateOption<MKoguchiDeliveryCB>> opLambda) {
        return doQueryUpdate(mKoguchiDelivery, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MKoguchiDelivery. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MKoguchiDeliveryCB cb, WritableOptionCall<MKoguchiDeliveryCB, DeleteOption<MKoguchiDeliveryCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mKoguchiDeliveryBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mKoguchiDeliveryBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mKoguchiDeliveryBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mKoguchiDeliveryBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mKoguchiDeliveryBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mKoguchiDeliveryBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mKoguchiDeliveryBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mKoguchiDeliveryBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mKoguchiDeliveryBhv.outideSql().removeBlockComment().selectList()
     * mKoguchiDeliveryBhv.outideSql().removeLineComment().selectList()
     * mKoguchiDeliveryBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MKoguchiDeliveryBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MKoguchiDeliveryBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MKoguchiDelivery> typeOfSelectedEntity() { return MKoguchiDelivery.class; }
    protected Class<MKoguchiDelivery> typeOfHandlingEntity() { return MKoguchiDelivery.class; }
    protected Class<MKoguchiDeliveryCB> typeOfHandlingConditionBean() { return MKoguchiDeliveryCB.class; }
}
