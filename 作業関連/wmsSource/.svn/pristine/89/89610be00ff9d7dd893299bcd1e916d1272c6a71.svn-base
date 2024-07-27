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
 * The behavior of m_sales_org as TABLE. <br>
 * <pre>
 * [primary key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, LP_SEND_FLG, WMS_SEND_FLG, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     m_base_sales_org, m_carrier_decision, m_customer_picking, m_deposit_product, m_koguchi_delivery, t_inventory_b
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mBaseSalesOrgList, mCarrierDecisionList, mCustomerPickingList, mDepositProductList, mKoguchiDeliveryList, tInventoryBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMSalesOrgBhv extends AbstractBehaviorWritable<MSalesOrg, MSalesOrgCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MSalesOrgDbm asDBMeta() { return MSalesOrgDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_sales_org"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MSalesOrgDbm getMyDBMeta() { return MSalesOrgDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MSalesOrgCB newConditionBean() { return new MSalesOrgCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MSalesOrg newMyEntity() { return new MSalesOrg(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MSalesOrgCB newMyConditionBean() { return new MSalesOrgCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MSalesOrgCB cb) {
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
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().setFoo...(value);
     * MSalesOrg mSalesOrg = <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mSalesOrg != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mSalesOrg.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MSalesOrg selectEntity(MSalesOrgCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MSalesOrg facadeSelectEntity(MSalesOrgCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MSalesOrg> OptionalEntity<ENTITY> doSelectOptionalEntity(MSalesOrgCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().set...;
     * MSalesOrg mSalesOrg = <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mSalesOrg.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MSalesOrg selectEntityWithDeletedCheck(MSalesOrgCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param salesOrgId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MSalesOrg selectByPKValue(Long salesOrgId) {
        return facadeSelectByPKValue(salesOrgId);
    }

    protected MSalesOrg facadeSelectByPKValue(Long salesOrgId) {
        return doSelectByPK(salesOrgId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MSalesOrg> ENTITY doSelectByPK(Long salesOrgId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(salesOrgId), tp);
    }

    protected <ENTITY extends MSalesOrg> OptionalEntity<ENTITY> doSelectOptionalByPK(Long salesOrgId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(salesOrgId, tp), salesOrgId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param salesOrgId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MSalesOrg selectByPKValueWithDeletedCheck(Long salesOrgId) {
        return doSelectByPKWithDeletedCheck(salesOrgId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MSalesOrg> ENTITY doSelectByPKWithDeletedCheck(Long salesOrgId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(salesOrgId), tp);
    }

    protected MSalesOrgCB xprepareCBAsPK(Long salesOrgId) {
        assertObjectNotNull("salesOrgId", salesOrgId);
        return newConditionBean().acceptPK(salesOrgId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param salesOrgCd : UQ, VARCHAR(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MSalesOrg> selectByUniqueOf(String salesOrgCd) {
        return facadeSelectByUniqueOf(salesOrgCd);
    }

    protected OptionalEntity<MSalesOrg> facadeSelectByUniqueOf(String salesOrgCd) {
        return doSelectByUniqueOf(salesOrgCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MSalesOrg> OptionalEntity<ENTITY> doSelectByUniqueOf(String salesOrgCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(salesOrgCd), tp), salesOrgCd);
    }

    protected MSalesOrgCB xprepareCBAsUniqueOf(String salesOrgCd) {
        assertObjectNotNull("salesOrgCd", salesOrgCd);
        return newConditionBean().acceptUniqueOf(salesOrgCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MSalesOrg&gt; <span style="color: #553000">mSalesOrgList</span> = <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MSalesOrg> selectList(MSalesOrgCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MSalesOrg&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">page</span>) {
     *     ... = mSalesOrg.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MSalesOrg> selectPage(MSalesOrgCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().set...
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @param entityRowHandler The handler of entity row of MSalesOrg. (NotNull)
     */
    public void selectCursor(MSalesOrgCB cb, EntityRowHandler<MSalesOrg> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MSalesOrgCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MSalesOrgCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MSalesOrg> mSalesOrgList, ReferrerLoaderHandler<LoaderOfMSalesOrg> loaderLambda) {
        xassLRArg(mSalesOrgList, loaderLambda);
        loaderLambda.handle(new LoaderOfMSalesOrg().ready(mSalesOrgList, _behaviorSelector));
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
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MSalesOrg mSalesOrg, ReferrerLoaderHandler<LoaderOfMSalesOrg> loaderLambda) {
        xassLRArg(mSalesOrg, loaderLambda);
        loaderLambda.handle(new LoaderOfMSalesOrg().ready(xnewLRAryLs(mSalesOrg), _behaviorSelector));
    }

    /**
     * Load referrer of MBaseSalesOrgList by the set-upper of referrer. <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMBaseSalesOrgList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgCB</span>.setupSelect...
     *     <span style="color: #553000">orgCB</span>.query().set...
     *     <span style="color: #553000">orgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMBaseSalesOrgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBaseSalesOrg> loadMBaseSalesOrgList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<MBaseSalesOrgCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadMBaseSalesOrgList(mSalesOrgList, new LoadReferrerOption<MBaseSalesOrgCB, MBaseSalesOrg>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBaseSalesOrgList by the set-upper of referrer. <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMBaseSalesOrgList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">orgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgCB</span>.setupSelect...
     *     <span style="color: #553000">orgCB</span>.query().set...
     *     <span style="color: #553000">orgCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getMBaseSalesOrgList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBaseSalesOrg> loadMBaseSalesOrgList(MSalesOrg mSalesOrg, ConditionBeanSetupper<MBaseSalesOrgCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadMBaseSalesOrgList(xnewLRLs(mSalesOrg), new LoadReferrerOption<MBaseSalesOrgCB, MBaseSalesOrg>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBaseSalesOrg> loadMBaseSalesOrgList(MSalesOrg mSalesOrg, LoadReferrerOption<MBaseSalesOrgCB, MBaseSalesOrg> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadMBaseSalesOrgList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBaseSalesOrg> loadMBaseSalesOrgList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MBaseSalesOrgCB, MBaseSalesOrg> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<MBaseSalesOrg>)EMPTY_NREF_LGWAY; }
        return doLoadMBaseSalesOrgList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBaseSalesOrg> doLoadMBaseSalesOrgList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MBaseSalesOrgCB, MBaseSalesOrg> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "mBaseSalesOrgList");
    }

    /**
     * Load referrer of MCarrierDecisionList by the set-upper of referrer. <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMCarrierDecisionList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">decisionCB</span>.setupSelect...
     *     <span style="color: #553000">decisionCB</span>.query().set...
     *     <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMCarrierDecisionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierDecision> loadMCarrierDecisionList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadMCarrierDecisionList(mSalesOrgList, new LoadReferrerOption<MCarrierDecisionCB, MCarrierDecision>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierDecisionList by the set-upper of referrer. <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMCarrierDecisionList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">decisionCB</span>.setupSelect...
     *     <span style="color: #553000">decisionCB</span>.query().set...
     *     <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getMCarrierDecisionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierDecision> loadMCarrierDecisionList(MSalesOrg mSalesOrg, ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadMCarrierDecisionList(xnewLRLs(mSalesOrg), new LoadReferrerOption<MCarrierDecisionCB, MCarrierDecision>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierDecision> loadMCarrierDecisionList(MSalesOrg mSalesOrg, LoadReferrerOption<MCarrierDecisionCB, MCarrierDecision> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadMCarrierDecisionList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierDecision> loadMCarrierDecisionList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MCarrierDecisionCB, MCarrierDecision> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<MCarrierDecision>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierDecisionList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierDecision> doLoadMCarrierDecisionList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MCarrierDecisionCB, MCarrierDecision> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "mCarrierDecisionList");
    }

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadMCustomerPickingList(mSalesOrgList, new LoadReferrerOption<MCustomerPickingCB, MCustomerPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(MSalesOrg mSalesOrg, ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadMCustomerPickingList(xnewLRLs(mSalesOrg), new LoadReferrerOption<MCustomerPickingCB, MCustomerPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(MSalesOrg mSalesOrg, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadMCustomerPickingList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<MCustomerPicking>)EMPTY_NREF_LGWAY; }
        return doLoadMCustomerPickingList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCustomerPicking> doLoadMCustomerPickingList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "mCustomerPickingList");
    }

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMDepositProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadMDepositProductList(mSalesOrgList, new LoadReferrerOption<MDepositProductCB, MDepositProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getMDepositProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(MSalesOrg mSalesOrg, ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadMDepositProductList(xnewLRLs(mSalesOrg), new LoadReferrerOption<MDepositProductCB, MDepositProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(MSalesOrg mSalesOrg, LoadReferrerOption<MDepositProductCB, MDepositProduct> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadMDepositProductList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDepositProduct> loadMDepositProductList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MDepositProductCB, MDepositProduct> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<MDepositProduct>)EMPTY_NREF_LGWAY; }
        return doLoadMDepositProductList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDepositProduct> doLoadMDepositProductList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MDepositProductCB, MDepositProduct> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "mDepositProductList");
    }

    /**
     * Load referrer of MKoguchiDeliveryList by the set-upper of referrer. <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMKoguchiDeliveryList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">deliveryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deliveryCB</span>.setupSelect...
     *     <span style="color: #553000">deliveryCB</span>.query().set...
     *     <span style="color: #553000">deliveryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMKoguchiDeliveryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_ServSalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MKoguchiDelivery> loadMKoguchiDeliveryList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<MKoguchiDeliveryCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadMKoguchiDeliveryList(mSalesOrgList, new LoadReferrerOption<MKoguchiDeliveryCB, MKoguchiDelivery>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MKoguchiDeliveryList by the set-upper of referrer. <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadMKoguchiDeliveryList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">deliveryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">deliveryCB</span>.setupSelect...
     *     <span style="color: #553000">deliveryCB</span>.query().set...
     *     <span style="color: #553000">deliveryCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getMKoguchiDeliveryList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_ServSalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MKoguchiDelivery> loadMKoguchiDeliveryList(MSalesOrg mSalesOrg, ConditionBeanSetupper<MKoguchiDeliveryCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadMKoguchiDeliveryList(xnewLRLs(mSalesOrg), new LoadReferrerOption<MKoguchiDeliveryCB, MKoguchiDelivery>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MKoguchiDelivery> loadMKoguchiDeliveryList(MSalesOrg mSalesOrg, LoadReferrerOption<MKoguchiDeliveryCB, MKoguchiDelivery> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadMKoguchiDeliveryList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MKoguchiDelivery> loadMKoguchiDeliveryList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MKoguchiDeliveryCB, MKoguchiDelivery> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<MKoguchiDelivery>)EMPTY_NREF_LGWAY; }
        return doLoadMKoguchiDeliveryList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MKoguchiDelivery> doLoadMKoguchiDeliveryList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<MKoguchiDeliveryCB, MKoguchiDelivery> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "mKoguchiDeliveryList");
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MSalesOrg> mSalesOrgList, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mSalesOrgList, refCBLambda);
        return doLoadTInventoryBList(mSalesOrgList, new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">mSalesOrg</span>, <span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bCB</span>.setupSelect...
     *     <span style="color: #553000">bCB</span>.query().set...
     *     <span style="color: #553000">bCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mSalesOrg</span>.<span style="color: #CC4747">getTInventoryBList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MSalesOrg mSalesOrg, ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        xassLRArg(mSalesOrg, refCBLambda);
        return doLoadTInventoryBList(xnewLRLs(mSalesOrg), new LoadReferrerOption<TInventoryBCB, TInventoryB>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mSalesOrg The entity of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(MSalesOrg mSalesOrg, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mSalesOrg, loadReferrerOption);
        return loadTInventoryBList(xnewLRLs(mSalesOrg), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mSalesOrgList The entity list of MSalesOrg. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryB> loadTInventoryBList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<TInventoryBCB, TInventoryB> loadReferrerOption) {
        xassLRArg(mSalesOrgList, loadReferrerOption);
        if (mSalesOrgList.isEmpty()) { return (NestedReferrerListGateway<TInventoryB>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryBList(mSalesOrgList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryB> doLoadTInventoryBList(List<MSalesOrg> mSalesOrgList, LoadReferrerOption<TInventoryBCB, TInventoryB> option) {
        return helpLoadReferrerInternally(mSalesOrgList, option, "tInventoryBList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key salesOrgId.
     * @param mSalesOrgList The list of mSalesOrg. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractSalesOrgIdList(List<MSalesOrg> mSalesOrgList)
    { return helpExtractListInternally(mSalesOrgList, "salesOrgId"); }

    /**
     * Extract the value list of (single) unique key salesOrgCd.
     * @param mSalesOrgList The list of mSalesOrg. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractSalesOrgCdList(List<MSalesOrg> mSalesOrgList)
    { return helpExtractListInternally(mSalesOrgList, "salesOrgCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mSalesOrg.setFoo...(value);
     * mSalesOrg.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mSalesOrg.set...;</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">insert</span>(mSalesOrg);
     * ... = mSalesOrg.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mSalesOrg The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MSalesOrg mSalesOrg) {
        doInsert(mSalesOrg, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mSalesOrg.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mSalesOrg.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mSalesOrg.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">update</span>(mSalesOrg);
     * </pre>
     * @param mSalesOrg The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MSalesOrg mSalesOrg) {
        doUpdate(mSalesOrg, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mSalesOrg.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mSalesOrg.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mSalesOrg);
     * </pre>
     * @param mSalesOrg The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MSalesOrg mSalesOrg) {
        doUpdateNonstrict(mSalesOrg, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mSalesOrg The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MSalesOrg mSalesOrg) {
        doInsertOrUpdate(mSalesOrg, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mSalesOrg The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MSalesOrg mSalesOrg) {
        doInsertOrUpdateNonstrict(mSalesOrg, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mSalesOrg.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">delete</span>(mSalesOrg);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mSalesOrg The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MSalesOrg mSalesOrg) {
        doDelete(mSalesOrg, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mSalesOrg);
     * </pre>
     * @param mSalesOrg The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MSalesOrg mSalesOrg) {
        doDeleteNonstrict(mSalesOrg, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mSalesOrg);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mSalesOrg The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MSalesOrg mSalesOrg) {
        doDeleteNonstrictIgnoreDeleted(mSalesOrg, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MSalesOrg et, final DeleteOption<MSalesOrgCB> op) {
        assertObjectNotNull("mSalesOrg", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     *     mSalesOrg.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mSalesOrg.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mSalesOrgList.add(mSalesOrg);
     * }
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchInsert</span>(mSalesOrgList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MSalesOrg> mSalesOrgList) {
        return doBatchInsert(mSalesOrgList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     *     mSalesOrg.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mSalesOrg.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mSalesOrg.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mSalesOrg.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mSalesOrgList.add(mSalesOrg);
     * }
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mSalesOrgList);
     * </pre>
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MSalesOrg> mSalesOrgList) {
        return doBatchUpdate(mSalesOrgList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mSalesOrgBhv.<span style="color: #CC4747">batchUpdate</span>(mSalesOrgList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mSalesOrgList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MSalesOrg> mSalesOrgList, SpecifyQuery<MSalesOrgCB> colCBLambda) {
        return doBatchUpdate(mSalesOrgList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     *     mSalesOrg.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mSalesOrg.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mSalesOrg.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mSalesOrg.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mSalesOrgList.add(mSalesOrg);
     * }
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mSalesOrgList);
     * </pre>
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MSalesOrg> mSalesOrgList) {
        return doBatchUpdateNonstrict(mSalesOrgList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mSalesOrgList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mSalesOrgList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MSalesOrg> mSalesOrgList, SpecifyQuery<MSalesOrgCB> colCBLambda) {
        return doBatchUpdateNonstrict(mSalesOrgList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MSalesOrg> mSalesOrgList) {
        return doBatchDelete(mSalesOrgList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MSalesOrg> mSalesOrgList) {
        return doBatchDeleteNonstrict(mSalesOrgList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MSalesOrg, MSalesOrgCB&gt;() {
     *     public ConditionBean setup(MSalesOrg entity, MSalesOrgCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MSalesOrg, MSalesOrgCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setPK...(value);</span>
     * mSalesOrg.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mSalesOrg.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mSalesOrg, cb);
     * </pre>
     * @param mSalesOrg The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MSalesOrg mSalesOrg, MSalesOrgCB cb) {
        return doQueryUpdate(mSalesOrg, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MSalesOrgCB cb = new MSalesOrgCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">queryDelete</span>(mSalesOrg, cb);
     * </pre>
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MSalesOrgCB cb) {
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
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mSalesOrg.setFoo...(value);
     * mSalesOrg.setBar...(value);
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mSalesOrg, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mSalesOrg.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mSalesOrg The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, InsertOption<MSalesOrgCB>> opLambda) {
        doInsert(mSalesOrg, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mSalesOrg.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mSalesOrg.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mSalesOrg, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mSalesOrg The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> opLambda) {
        doUpdate(mSalesOrg, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * mSalesOrg.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mSalesOrg.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mSalesOrg, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mSalesOrg The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> opLambda) {
        doUpdateNonstrict(mSalesOrg, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mSalesOrg The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, InsertOption<MSalesOrgCB>> insertOpLambda, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> updateOpLambda) {
        doInsertOrUpdate(mSalesOrg, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mSalesOrg The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, InsertOption<MSalesOrgCB>> insertOpLambda, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mSalesOrg, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mSalesOrg The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, DeleteOption<MSalesOrgCB>> opLambda) {
        doDelete(mSalesOrg, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mSalesOrg The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MSalesOrg mSalesOrg, WritableOptionCall<MSalesOrgCB, DeleteOption<MSalesOrgCB>> opLambda) {
        doDeleteNonstrict(mSalesOrg, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MSalesOrg> mSalesOrgList, WritableOptionCall<MSalesOrgCB, InsertOption<MSalesOrgCB>> opLambda) {
        return doBatchInsert(mSalesOrgList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MSalesOrg> mSalesOrgList, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> opLambda) {
        return doBatchUpdate(mSalesOrgList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MSalesOrg> mSalesOrgList, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> opLambda) {
        return doBatchUpdateNonstrict(mSalesOrgList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MSalesOrg> mSalesOrgList, WritableOptionCall<MSalesOrgCB, DeleteOption<MSalesOrgCB>> opLambda) {
        return doBatchDelete(mSalesOrgList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mSalesOrgList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MSalesOrg> mSalesOrgList, WritableOptionCall<MSalesOrgCB, DeleteOption<MSalesOrgCB>> opLambda) {
        return doBatchDeleteNonstrict(mSalesOrgList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MSalesOrg, MSalesOrgCB> manyArgLambda, WritableOptionCall<MSalesOrgCB, InsertOption<MSalesOrgCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MSalesOrg mSalesOrg = <span style="color: #70226C">new</span> MSalesOrg();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setPK...(value);</span>
     * mSalesOrg.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mSalesOrg.setVersionNo(value);</span>
     * MSalesOrgCB cb = <span style="color: #70226C">new</span> MSalesOrgCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mSalesOrg, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mSalesOrg The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MSalesOrg mSalesOrg, MSalesOrgCB cb, WritableOptionCall<MSalesOrgCB, UpdateOption<MSalesOrgCB>> opLambda) {
        return doQueryUpdate(mSalesOrg, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MSalesOrg. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MSalesOrgCB cb, WritableOptionCall<MSalesOrgCB, DeleteOption<MSalesOrgCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mSalesOrgBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mSalesOrgBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mSalesOrgBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mSalesOrgBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mSalesOrgBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mSalesOrgBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mSalesOrgBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mSalesOrgBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mSalesOrgBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mSalesOrgBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mSalesOrgBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mSalesOrgBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mSalesOrgBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mSalesOrgBhv.outideSql().removeBlockComment().selectList()
     * mSalesOrgBhv.outideSql().removeLineComment().selectList()
     * mSalesOrgBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MSalesOrgBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MSalesOrgBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MSalesOrg> typeOfSelectedEntity() { return MSalesOrg.class; }
    protected Class<MSalesOrg> typeOfHandlingEntity() { return MSalesOrg.class; }
    protected Class<MSalesOrgCB> typeOfHandlingConditionBean() { return MSalesOrgCB.class; }
}
