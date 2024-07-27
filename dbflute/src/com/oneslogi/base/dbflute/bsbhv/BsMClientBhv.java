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
 * The behavior of m_client as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_ID
 *
 * [column]
 *     CLIENT_ID, CLIENT_CD, CLIENT_NM, CLIENT_ABBR, CUSTOMER_ID, SHAPE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape_grp, m_customer, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     m_client_center, m_client_col, m_client_item, m_client_screen, m_customer, m_import_type, m_product, m_shape_grp, m_user_client, m_user_login, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_packing_list, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_shipping_record_h, t_stock, t_stock_record, t_store_record_h, t_transfer, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign property]
 *     mShapeGrp, mCustomer, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mClientCenterList, mClientColList, mClientItemList, mClientScreenList, mCustomerList, mImportTypeList, mProductList, mShapeGrpList, mUserClientList, mUserLoginList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPackingListList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tShippingRecordHList, tStockList, tStockRecordList, tStoreRecordHList, tTransferList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMClientBhv extends AbstractBehaviorWritable<MClient, MClientCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MClientDbm asDBMeta() { return MClientDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_client"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MClientDbm getMyDBMeta() { return MClientDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MClientCB newConditionBean() { return new MClientCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MClient newMyEntity() { return new MClient(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MClientCB newMyConditionBean() { return new MClientCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MClientCB cb) {
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
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().setFoo...(value);
     * MClient mClient = <span style="color: #0000C0">mClientBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mClient != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mClient.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MClient selectEntity(MClientCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MClient facadeSelectEntity(MClientCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MClient> OptionalEntity<ENTITY> doSelectOptionalEntity(MClientCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().set...;
     * MClient mClient = <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mClient.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MClient selectEntityWithDeletedCheck(MClientCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param clientId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MClient selectByPKValue(Long clientId) {
        return facadeSelectByPKValue(clientId);
    }

    protected MClient facadeSelectByPKValue(Long clientId) {
        return doSelectByPK(clientId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MClient> ENTITY doSelectByPK(Long clientId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(clientId), tp);
    }

    protected <ENTITY extends MClient> OptionalEntity<ENTITY> doSelectOptionalByPK(Long clientId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(clientId, tp), clientId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param clientId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MClient selectByPKValueWithDeletedCheck(Long clientId) {
        return doSelectByPKWithDeletedCheck(clientId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MClient> ENTITY doSelectByPKWithDeletedCheck(Long clientId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(clientId), tp);
    }

    protected MClientCB xprepareCBAsPK(Long clientId) {
        assertObjectNotNull("clientId", clientId);
        return newConditionBean().acceptPK(clientId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param clientCd : UQ, NotNull, VARCHAR(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MClient> selectByUniqueOf(String clientCd) {
        return facadeSelectByUniqueOf(clientCd);
    }

    protected OptionalEntity<MClient> facadeSelectByUniqueOf(String clientCd) {
        return doSelectByUniqueOf(clientCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MClient> OptionalEntity<ENTITY> doSelectByUniqueOf(String clientCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(clientCd), tp), clientCd);
    }

    protected MClientCB xprepareCBAsUniqueOf(String clientCd) {
        assertObjectNotNull("clientCd", clientCd);
        return newConditionBean().acceptUniqueOf(clientCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MClient&gt; <span style="color: #553000">mClientList</span> = <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MClient> selectList(MClientCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MClient&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">page</span>) {
     *     ... = mClient.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MClient> selectPage(MClientCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().set...
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @param entityRowHandler The handler of entity row of MClient. (NotNull)
     */
    public void selectCursor(MClientCB cb, EntityRowHandler<MClient> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MClientCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MClientCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MClient> mClientList, ReferrerLoaderHandler<LoaderOfMClient> loaderLambda) {
        xassLRArg(mClientList, loaderLambda);
        loaderLambda.handle(new LoaderOfMClient().ready(mClientList, _behaviorSelector));
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
     * @param mClient The entity of MClient. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MClient mClient, ReferrerLoaderHandler<LoaderOfMClient> loaderLambda) {
        xassLRArg(mClient, loaderLambda);
        loaderLambda.handle(new LoaderOfMClient().ready(xnewLRAryLs(mClient), _behaviorSelector));
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MClient> mClientList, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMClientCenterList(mClientList, new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMClientCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MClient mClient, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMClientCenterList(xnewLRLs(mClient), new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MClient mClient, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMClientCenterList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MClient> mClientList, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MClientCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMClientCenterList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCenter> doLoadMClientCenterList(List<MClient> mClientList, LoadReferrerOption<MClientCenterCB, MClientCenter> option) {
        return helpLoadReferrerInternally(mClientList, option, "mClientCenterList");
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * m_client_col by CLIENT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<MClient> mClientList, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMClientColList(mClientList, new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * m_client_col by CLIENT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMClientColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(MClient mClient, ConditionBeanSetupper<MClientColCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMClientColList(xnewLRLs(mClient), new LoadReferrerOption<MClientColCB, MClientCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCol> loadMClientColList(MClient mClient, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMClientColList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCol> loadMClientColList(List<MClient> mClientList, LoadReferrerOption<MClientColCB, MClientCol> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MClientCol>)EMPTY_NREF_LGWAY; }
        return doLoadMClientColList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCol> doLoadMClientColList(List<MClient> mClientList, LoadReferrerOption<MClientColCB, MClientCol> option) {
        return helpLoadReferrerInternally(mClientList, option, "mClientColList");
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * m_client_item by CLIENT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<MClient> mClientList, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMClientItemList(mClientList, new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * m_client_item by CLIENT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMClientItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(MClient mClient, ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMClientItemList(xnewLRLs(mClient), new LoadReferrerOption<MClientItemCB, MClientItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(MClient mClient, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMClientItemList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientItem> loadMClientItemList(List<MClient> mClientList, LoadReferrerOption<MClientItemCB, MClientItem> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MClientItem>)EMPTY_NREF_LGWAY; }
        return doLoadMClientItemList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientItem> doLoadMClientItemList(List<MClient> mClientList, LoadReferrerOption<MClientItemCB, MClientItem> option) {
        return helpLoadReferrerInternally(mClientList, option, "mClientItemList");
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<MClient> mClientList, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMClientScreenList(mClientList, new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMClientScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(MClient mClient, ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMClientScreenList(xnewLRLs(mClient), new LoadReferrerOption<MClientScreenCB, MClientScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(MClient mClient, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMClientScreenList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientScreen> loadMClientScreenList(List<MClient> mClientList, LoadReferrerOption<MClientScreenCB, MClientScreen> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MClientScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMClientScreenList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientScreen> doLoadMClientScreenList(List<MClient> mClientList, LoadReferrerOption<MClientScreenCB, MClientScreen> option) {
        return helpLoadReferrerInternally(mClientList, option, "mClientScreenList");
    }

    /**
     * Load referrer of MCustomerList by the set-upper of referrer. <br>
     * m_customer by CLIENT_ID, named 'MCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMCustomerList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerList(List<MClient> mClientList, ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMCustomerList(mClientList, new LoadReferrerOption<MCustomerCB, MCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCustomerList by the set-upper of referrer. <br>
     * m_customer by CLIENT_ID, named 'MCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMCustomerList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMCustomerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerList(MClient mClient, ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMCustomerList(xnewLRLs(mClient), new LoadReferrerOption<MCustomerCB, MCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomer> loadMCustomerList(MClient mClient, LoadReferrerOption<MCustomerCB, MCustomer> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMCustomerList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCustomer> loadMCustomerList(List<MClient> mClientList, LoadReferrerOption<MCustomerCB, MCustomer> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCustomerList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCustomer> doLoadMCustomerList(List<MClient> mClientList, LoadReferrerOption<MCustomerCB, MCustomer> option) {
        return helpLoadReferrerInternally(mClientList, option, "mCustomerList");
    }

    /**
     * Load referrer of MImportTypeList by the set-upper of referrer. <br>
     * m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMImportTypeList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMImportTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportType> loadMImportTypeList(List<MClient> mClientList, ConditionBeanSetupper<MImportTypeCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMImportTypeList(mClientList, new LoadReferrerOption<MImportTypeCB, MImportType>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MImportTypeList by the set-upper of referrer. <br>
     * m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMImportTypeList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">typeCB</span>.setupSelect...
     *     <span style="color: #553000">typeCB</span>.query().set...
     *     <span style="color: #553000">typeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMImportTypeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportType> loadMImportTypeList(MClient mClient, ConditionBeanSetupper<MImportTypeCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMImportTypeList(xnewLRLs(mClient), new LoadReferrerOption<MImportTypeCB, MImportType>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MImportType> loadMImportTypeList(MClient mClient, LoadReferrerOption<MImportTypeCB, MImportType> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMImportTypeList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MImportType> loadMImportTypeList(List<MClient> mClientList, LoadReferrerOption<MImportTypeCB, MImportType> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MImportType>)EMPTY_NREF_LGWAY; }
        return doLoadMImportTypeList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MImportType> doLoadMImportTypeList(List<MClient> mClientList, LoadReferrerOption<MImportTypeCB, MImportType> option) {
        return helpLoadReferrerInternally(mClientList, option, "mImportTypeList");
    }

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * m_product by CLIENT_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(List<MClient> mClientList, ConditionBeanSetupper<MProductCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMProductList(mClientList, new LoadReferrerOption<MProductCB, MProduct>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * m_product by CLIENT_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productCB</span>.setupSelect...
     *     <span style="color: #553000">productCB</span>.query().set...
     *     <span style="color: #553000">productCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMProductList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(MClient mClient, ConditionBeanSetupper<MProductCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMProductList(xnewLRLs(mClient), new LoadReferrerOption<MProductCB, MProduct>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MProduct> loadMProductList(MClient mClient, LoadReferrerOption<MProductCB, MProduct> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMProductList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MProduct> loadMProductList(List<MClient> mClientList, LoadReferrerOption<MProductCB, MProduct> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MProduct>)EMPTY_NREF_LGWAY; }
        return doLoadMProductList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MProduct> doLoadMProductList(List<MClient> mClientList, LoadReferrerOption<MProductCB, MProduct> option) {
        return helpLoadReferrerInternally(mClientList, option, "mProductList");
    }

    /**
     * Load referrer of MShapeGrpList by the set-upper of referrer. <br>
     * m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMShapeGrpList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMShapeGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrp> loadMShapeGrpList(List<MClient> mClientList, ConditionBeanSetupper<MShapeGrpCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMShapeGrpList(mClientList, new LoadReferrerOption<MShapeGrpCB, MShapeGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MShapeGrpList by the set-upper of referrer. <br>
     * m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMShapeGrpList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMShapeGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrp> loadMShapeGrpList(MClient mClient, ConditionBeanSetupper<MShapeGrpCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMShapeGrpList(xnewLRLs(mClient), new LoadReferrerOption<MShapeGrpCB, MShapeGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MShapeGrp> loadMShapeGrpList(MClient mClient, LoadReferrerOption<MShapeGrpCB, MShapeGrp> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMShapeGrpList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MShapeGrp> loadMShapeGrpList(List<MClient> mClientList, LoadReferrerOption<MShapeGrpCB, MShapeGrp> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MShapeGrp>)EMPTY_NREF_LGWAY; }
        return doLoadMShapeGrpList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MShapeGrp> doLoadMShapeGrpList(List<MClient> mClientList, LoadReferrerOption<MShapeGrpCB, MShapeGrp> option) {
        return helpLoadReferrerInternally(mClientList, option, "mShapeGrpList");
    }

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * m_user_client by CLIENT_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(List<MClient> mClientList, ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMUserClientList(mClientList, new LoadReferrerOption<MUserClientCB, MUserClient>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * m_user_client by CLIENT_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientCB</span>.setupSelect...
     *     <span style="color: #553000">clientCB</span>.query().set...
     *     <span style="color: #553000">clientCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMUserClientList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(MClient mClient, ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMUserClientList(xnewLRLs(mClient), new LoadReferrerOption<MUserClientCB, MUserClient>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(MClient mClient, LoadReferrerOption<MUserClientCB, MUserClient> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMUserClientList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserClient> loadMUserClientList(List<MClient> mClientList, LoadReferrerOption<MUserClientCB, MUserClient> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MUserClient>)EMPTY_NREF_LGWAY; }
        return doLoadMUserClientList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserClient> doLoadMUserClientList(List<MClient> mClientList, LoadReferrerOption<MUserClientCB, MUserClient> option) {
        return helpLoadReferrerInternally(mClientList, option, "mUserClientList");
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MClient> mClientList, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMUserLoginList(mClientList, new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMUserLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MClient mClient, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMUserLoginList(xnewLRLs(mClient), new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MClient mClient, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMUserLoginList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MClient> mClientList, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MUserLogin>)EMPTY_NREF_LGWAY; }
        return doLoadMUserLoginList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserLogin> doLoadMUserLoginList(List<MClient> mClientList, LoadReferrerOption<MUserLoginCB, MUserLogin> option) {
        return helpLoadReferrerInternally(mClientList, option, "mUserLoginList");
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MClient> mClientList, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadMWebHtInfoList(mClientList, new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MClient mClient, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadMWebHtInfoList(xnewLRLs(mClient), new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MClient mClient, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadMWebHtInfoList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MClient> mClientList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<MWebHtInfo>)EMPTY_NREF_LGWAY; }
        return doLoadMWebHtInfoList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWebHtInfo> doLoadMWebHtInfoList(List<MClient> mClientList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> option) {
        return helpLoadReferrerInternally(mClientList, option, "mWebHtInfoList");
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MClient> mClientList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTAllocInstHList(mClientList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MClient mClient, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTAllocInstHList(xnewLRLs(mClient), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MClient mClient, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTAllocInstHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MClient> mClientList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHList(List<MClient> mClientList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tAllocInstHList");
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MClient> mClientList, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTEcOrderHList(mClientList, new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MClient mClient, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTEcOrderHList(xnewLRLs(mClient), new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MClient mClient, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTEcOrderHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MClient> mClientList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderH>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderH> doLoadTEcOrderHList(List<MClient> mClientList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tEcOrderHList");
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MClient> mClientList, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTInventoryHList(mClientList, new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTInventoryHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MClient mClient, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTInventoryHList(xnewLRLs(mClient), new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MClient mClient, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTInventoryHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MClient> mClientList, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TInventoryH>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryH> doLoadTInventoryHList(List<MClient> mClientList, LoadReferrerOption<TInventoryHCB, TInventoryH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tInventoryHList");
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MClient> mClientList, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTMoveInstHList(mClientList, new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MClient mClient, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTMoveInstHList(xnewLRLs(mClient), new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MClient mClient, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTMoveInstHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MClient> mClientList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstH> doLoadTMoveInstHList(List<MClient> mClientList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tMoveInstHList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MClient> mClientList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTPackingHList(mClientList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MClient mClient, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(mClient), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MClient mClient, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MClient> mClientList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<MClient> mClientList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPackingListList by the set-upper of referrer. <br>
     * t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPackingListList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">listCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">listCB</span>.setupSelect...
     *     <span style="color: #553000">listCB</span>.query().set...
     *     <span style="color: #553000">listCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPackingListList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingList> loadTPackingListList(List<MClient> mClientList, ConditionBeanSetupper<TPackingListCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTPackingListList(mClientList, new LoadReferrerOption<TPackingListCB, TPackingList>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingListList by the set-upper of referrer. <br>
     * t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPackingListList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">listCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">listCB</span>.setupSelect...
     *     <span style="color: #553000">listCB</span>.query().set...
     *     <span style="color: #553000">listCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTPackingListList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingList> loadTPackingListList(MClient mClient, ConditionBeanSetupper<TPackingListCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTPackingListList(xnewLRLs(mClient), new LoadReferrerOption<TPackingListCB, TPackingList>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingList> loadTPackingListList(MClient mClient, LoadReferrerOption<TPackingListCB, TPackingList> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTPackingListList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingList> loadTPackingListList(List<MClient> mClientList, LoadReferrerOption<TPackingListCB, TPackingList> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TPackingList>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingListList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingList> doLoadTPackingListList(List<MClient> mClientList, LoadReferrerOption<TPackingListCB, TPackingList> option) {
        return helpLoadReferrerInternally(mClientList, option, "tPackingListList");
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MClient> mClientList, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTPicMthdRcmdList(mClientList, new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MClient mClient, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTPicMthdRcmdList(xnewLRLs(mClient), new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MClient mClient, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTPicMthdRcmdList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MClient> mClientList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmd>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmd> doLoadTPicMthdRcmdList(List<MClient> mClientList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> option) {
        return helpLoadReferrerInternally(mClientList, option, "tPicMthdRcmdList");
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MClient> mClientList, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTPickingHList(mClientList, new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTPickingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MClient mClient, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTPickingHList(xnewLRLs(mClient), new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MClient mClient, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTPickingHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MClient> mClientList, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TPickingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingH> doLoadTPickingHList(List<MClient> mClientList, LoadReferrerOption<TPickingHCB, TPickingH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tPickingHList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MClient> mClientList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTReceivePlanHList(mClientList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MClient mClient, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(mClient), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MClient mClient, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MClient> mClientList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<MClient> mClientList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MClient> mClientList, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTSerialNoList(mClientList, new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTSerialNoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MClient mClient, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTSerialNoList(xnewLRLs(mClient), new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MClient mClient, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTSerialNoList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MClient> mClientList, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TSerialNo>)EMPTY_NREF_LGWAY; }
        return doLoadTSerialNoList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TSerialNo> doLoadTSerialNoList(List<MClient> mClientList, LoadReferrerOption<TSerialNoCB, TSerialNo> option) {
        return helpLoadReferrerInternally(mClientList, option, "tSerialNoList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MClient> mClientList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTShippingInstHList(mClientList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MClient mClient, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(mClient), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MClient mClient, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MClient> mClientList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<MClient> mClientList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tShippingInstHList");
    }

    /**
     * Load referrer of TShippingRecordHList by the set-upper of referrer. <br>
     * t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTShippingRecordHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTShippingRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingRecordH> loadTShippingRecordHList(List<MClient> mClientList, ConditionBeanSetupper<TShippingRecordHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTShippingRecordHList(mClientList, new LoadReferrerOption<TShippingRecordHCB, TShippingRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingRecordHList by the set-upper of referrer. <br>
     * t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTShippingRecordHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTShippingRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingRecordH> loadTShippingRecordHList(MClient mClient, ConditionBeanSetupper<TShippingRecordHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTShippingRecordHList(xnewLRLs(mClient), new LoadReferrerOption<TShippingRecordHCB, TShippingRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingRecordH> loadTShippingRecordHList(MClient mClient, LoadReferrerOption<TShippingRecordHCB, TShippingRecordH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTShippingRecordHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingRecordH> loadTShippingRecordHList(List<MClient> mClientList, LoadReferrerOption<TShippingRecordHCB, TShippingRecordH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TShippingRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingRecordHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingRecordH> doLoadTShippingRecordHList(List<MClient> mClientList, LoadReferrerOption<TShippingRecordHCB, TShippingRecordH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tShippingRecordHList");
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by CLIENT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(List<MClient> mClientList, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTStockList(mClientList, new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by CLIENT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockCB</span>.setupSelect...
     *     <span style="color: #553000">stockCB</span>.query().set...
     *     <span style="color: #553000">stockCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTStockList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MClient mClient, ConditionBeanSetupper<TStockCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTStockList(xnewLRLs(mClient), new LoadReferrerOption<TStockCB, TStock>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStock> loadTStockList(MClient mClient, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTStockList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStock> loadTStockList(List<MClient> mClientList, LoadReferrerOption<TStockCB, TStock> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TStock>)EMPTY_NREF_LGWAY; }
        return doLoadTStockList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStock> doLoadTStockList(List<MClient> mClientList, LoadReferrerOption<TStockCB, TStock> option) {
        return helpLoadReferrerInternally(mClientList, option, "tStockList");
    }

    /**
     * Load referrer of TStockRecordList by the set-upper of referrer. <br>
     * t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStockRecordList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">recordCB</span>.setupSelect...
     *     <span style="color: #553000">recordCB</span>.query().set...
     *     <span style="color: #553000">recordCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStockRecordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockRecord> loadTStockRecordList(List<MClient> mClientList, ConditionBeanSetupper<TStockRecordCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTStockRecordList(mClientList, new LoadReferrerOption<TStockRecordCB, TStockRecord>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStockRecordList by the set-upper of referrer. <br>
     * t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStockRecordList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">recordCB</span>.setupSelect...
     *     <span style="color: #553000">recordCB</span>.query().set...
     *     <span style="color: #553000">recordCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTStockRecordList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockRecord> loadTStockRecordList(MClient mClient, ConditionBeanSetupper<TStockRecordCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTStockRecordList(xnewLRLs(mClient), new LoadReferrerOption<TStockRecordCB, TStockRecord>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStockRecord> loadTStockRecordList(MClient mClient, LoadReferrerOption<TStockRecordCB, TStockRecord> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTStockRecordList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStockRecord> loadTStockRecordList(List<MClient> mClientList, LoadReferrerOption<TStockRecordCB, TStockRecord> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TStockRecord>)EMPTY_NREF_LGWAY; }
        return doLoadTStockRecordList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStockRecord> doLoadTStockRecordList(List<MClient> mClientList, LoadReferrerOption<TStockRecordCB, TStockRecord> option) {
        return helpLoadReferrerInternally(mClientList, option, "tStockRecordList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MClient> mClientList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTStoreRecordHList(mClientList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MClient mClient, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(mClient), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MClient mClient, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MClient> mClientList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<MClient> mClientList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mClientList, option, "tStoreRecordHList");
    }

    /**
     * Load referrer of TTransferList by the set-upper of referrer. <br>
     * t_transfer by CLIENT_ID, named 'TTransferList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTTransferList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">transferCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">transferCB</span>.setupSelect...
     *     <span style="color: #553000">transferCB</span>.query().set...
     *     <span style="color: #553000">transferCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTransferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTransfer> loadTTransferList(List<MClient> mClientList, ConditionBeanSetupper<TTransferCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadTTransferList(mClientList, new LoadReferrerOption<TTransferCB, TTransfer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TTransferList by the set-upper of referrer. <br>
     * t_transfer by CLIENT_ID, named 'TTransferList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadTTransferList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">transferCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">transferCB</span>.setupSelect...
     *     <span style="color: #553000">transferCB</span>.query().set...
     *     <span style="color: #553000">transferCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getTTransferList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTransfer> loadTTransferList(MClient mClient, ConditionBeanSetupper<TTransferCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadTTransferList(xnewLRLs(mClient), new LoadReferrerOption<TTransferCB, TTransfer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TTransfer> loadTTransferList(MClient mClient, LoadReferrerOption<TTransferCB, TTransfer> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadTTransferList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TTransfer> loadTTransferList(List<MClient> mClientList, LoadReferrerOption<TTransferCB, TTransfer> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<TTransfer>)EMPTY_NREF_LGWAY; }
        return doLoadTTransferList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TTransfer> doLoadTTransferList(List<MClient> mClientList, LoadReferrerOption<TTransferCB, TTransfer> option) {
        return helpLoadReferrerInternally(mClientList, option, "tTransferList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MClient> mClientList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mClientList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MClient mClient, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mClient), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MClient mClient, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MClient> mClientList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MClient> mClientList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MClient> mClientList, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtLoadingList(mClientList, new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MClient mClient, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtLoadingList(xnewLRLs(mClient), new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MClient mClient, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtLoadingList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MClient> mClientList, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtLoading>)EMPTY_NREF_LGWAY; }
        return doLoadWHtLoadingList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtLoading> doLoadWHtLoadingList(List<MClient> mClientList, LoadReferrerOption<WHtLoadingCB, WHtLoading> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtLoadingList");
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MClient> mClientList, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtPickingList(mClientList, new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MClient mClient, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtPickingList(xnewLRLs(mClient), new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MClient mClient, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtPickingList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MClient> mClientList, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtPickingList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtPicking> doLoadWHtPickingList(List<MClient> mClientList, LoadReferrerOption<WHtPickingCB, WHtPicking> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtPickingList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MClient> mClientList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mClientList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MClient mClient, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mClient), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MClient mClient, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MClient> mClientList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mClientList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MClient mClient, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mClient), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MClient mClient, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MClient> mClientList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtReceiveStoreList(mClientList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MClient mClient, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mClient), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MClient mClient, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MClient> mClientList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtReceiveStoreList");
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MClient> mClientList, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtSerialReceiveInspList(mClientList, new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MClient mClient, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtSerialReceiveInspList(xnewLRLs(mClient), new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MClient mClient, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtSerialReceiveInspList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MClient> mClientList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialReceiveInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialReceiveInspList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialReceiveInsp> doLoadWHtSerialReceiveInspList(List<MClient> mClientList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtSerialReceiveInspList");
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MClient> mClientList, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtSerialShippingInspList(mClientList, new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MClient mClient, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtSerialShippingInspList(xnewLRLs(mClient), new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MClient mClient, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtSerialShippingInspList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MClient> mClientList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialShippingInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialShippingInspList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialShippingInsp> doLoadWHtSerialShippingInspList(List<MClient> mClientList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtSerialShippingInspList");
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MClient> mClientList, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtShippingList(mClientList, new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtShippingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MClient mClient, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtShippingList(xnewLRLs(mClient), new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MClient mClient, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtShippingList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MClient> mClientList, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtShipping>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShipping> doLoadWHtShippingList(List<MClient> mClientList, LoadReferrerOption<WHtShippingCB, WHtShipping> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtShippingList");
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MClient> mClientList, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtShippingPickingList(mClientList, new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MClient mClient, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtShippingPickingList(xnewLRLs(mClient), new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MClient mClient, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtShippingPickingList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MClient> mClientList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtShippingPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingPickingList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShippingPicking> doLoadWHtShippingPickingList(List<MClient> mClientList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtShippingPickingList");
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MClient> mClientList, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWHtTotalPickingList(mClientList, new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MClient mClient, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWHtTotalPickingList(xnewLRLs(mClient), new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MClient mClient, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWHtTotalPickingList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MClient> mClientList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WHtTotalPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtTotalPickingList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtTotalPicking> doLoadWHtTotalPickingList(List<MClient> mClientList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> option) {
        return helpLoadReferrerInternally(mClientList, option, "wHtTotalPickingList");
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MClient> mClientList, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWSglRowShipInspHList(mClientList, new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MClient mClient, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWSglRowShipInspHList(xnewLRLs(mClient), new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MClient mClient, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWSglRowShipInspHList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MClient> mClientList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspH>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspHList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspH> doLoadWSglRowShipInspHList(List<MClient> mClientList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> option) {
        return helpLoadReferrerInternally(mClientList, option, "wSglRowShipInspHList");
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClientList The entity list of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MClient> mClientList, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mClientList, refCBLambda);
        return doLoadWShippingInterruptList(mClientList, new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mClient</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mClient</span>.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param mClient The entity of MClient. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MClient mClient, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mClient, refCBLambda);
        return doLoadWShippingInterruptList(xnewLRLs(mClient), new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mClient The entity of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MClient mClient, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mClient, loadReferrerOption);
        return loadWShippingInterruptList(xnewLRLs(mClient), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mClientList The entity list of MClient. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MClient> mClientList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mClientList, loadReferrerOption);
        if (mClientList.isEmpty()) { return (NestedReferrerListGateway<WShippingInterrupt>)EMPTY_NREF_LGWAY; }
        return doLoadWShippingInterruptList(mClientList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WShippingInterrupt> doLoadWShippingInterruptList(List<MClient> mClientList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> option) {
        return helpLoadReferrerInternally(mClientList, option, "wShippingInterruptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'MShapeGrp'.
     * @param mClientList The list of mClient. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MShapeGrp> pulloutMShapeGrp(List<MClient> mClientList)
    { return helpPulloutInternally(mClientList, "mShapeGrp"); }

    /**
     * Pull out the list of foreign table 'MCustomer'.
     * @param mClientList The list of mClient. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<MCustomer> pulloutMCustomer(List<MClient> mClientList)
    { return helpPulloutInternally(mClientList, "mCustomer"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mClientList The list of mClient. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MClient> mClientList)
    { return helpPulloutInternally(mClientList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key clientId.
     * @param mClientList The list of mClient. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractClientIdList(List<MClient> mClientList)
    { return helpExtractListInternally(mClientList, "clientId"); }

    /**
     * Extract the value list of (single) unique key clientCd.
     * @param mClientList The list of mClient. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractClientCdList(List<MClient> mClientList)
    { return helpExtractListInternally(mClientList, "clientCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mClient.setFoo...(value);
     * mClient.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mClient.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mClient.set...;</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">insert</span>(mClient);
     * ... = mClient.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mClient The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MClient mClient) {
        doInsert(mClient, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mClient.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mClient.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mClient.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mClient.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">update</span>(mClient);
     * </pre>
     * @param mClient The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MClient mClient) {
        doUpdate(mClient, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mClient.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mClient.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mClient.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mClient);
     * </pre>
     * @param mClient The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MClient mClient) {
        doUpdateNonstrict(mClient, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mClient The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MClient mClient) {
        doInsertOrUpdate(mClient, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mClient The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MClient mClient) {
        doInsertOrUpdateNonstrict(mClient, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mClient.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">delete</span>(mClient);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mClient The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MClient mClient) {
        doDelete(mClient, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mClient);
     * </pre>
     * @param mClient The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MClient mClient) {
        doDeleteNonstrict(mClient, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mClient);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mClient The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MClient mClient) {
        doDeleteNonstrictIgnoreDeleted(mClient, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MClient et, final DeleteOption<MClientCB> op) {
        assertObjectNotNull("mClient", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MClient mClient = <span style="color: #70226C">new</span> MClient();
     *     mClient.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mClient.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mClientList.add(mClient);
     * }
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchInsert</span>(mClientList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MClient> mClientList) {
        return doBatchInsert(mClientList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MClient mClient = <span style="color: #70226C">new</span> MClient();
     *     mClient.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mClient.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mClient.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mClient.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mClientList.add(mClient);
     * }
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mClientList);
     * </pre>
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MClient> mClientList) {
        return doBatchUpdate(mClientList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mClientBhv.<span style="color: #CC4747">batchUpdate</span>(mClientList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mClientList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MClient> mClientList, SpecifyQuery<MClientCB> colCBLambda) {
        return doBatchUpdate(mClientList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MClient mClient = <span style="color: #70226C">new</span> MClient();
     *     mClient.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mClient.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mClient.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mClient.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mClientList.add(mClient);
     * }
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mClientList);
     * </pre>
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MClient> mClientList) {
        return doBatchUpdateNonstrict(mClientList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mClientList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mClientList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MClient> mClientList, SpecifyQuery<MClientCB> colCBLambda) {
        return doBatchUpdateNonstrict(mClientList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MClient> mClientList) {
        return doBatchDelete(mClientList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MClient> mClientList) {
        return doBatchDeleteNonstrict(mClientList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MClient, MClientCB&gt;() {
     *     public ConditionBean setup(MClient entity, MClientCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MClient, MClientCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mClient.setPK...(value);</span>
     * mClient.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mClient.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mClient.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mClient, cb);
     * </pre>
     * @param mClient The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MClient mClient, MClientCB cb) {
        return doQueryUpdate(mClient, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MClientCB cb = new MClientCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">queryDelete</span>(mClient, cb);
     * </pre>
     * @param cb The condition-bean of MClient. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MClientCB cb) {
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
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mClient.setFoo...(value);
     * mClient.setBar...(value);
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mClient, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mClient.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mClient The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MClient mClient, WritableOptionCall<MClientCB, InsertOption<MClientCB>> opLambda) {
        doInsert(mClient, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mClient.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mClient.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mClient, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mClient The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MClient mClient, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> opLambda) {
        doUpdate(mClient, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * mClient.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mClient.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mClient, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mClient The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MClient mClient, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> opLambda) {
        doUpdateNonstrict(mClient, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mClient The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MClient mClient, WritableOptionCall<MClientCB, InsertOption<MClientCB>> insertOpLambda, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> updateOpLambda) {
        doInsertOrUpdate(mClient, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mClient The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MClient mClient, WritableOptionCall<MClientCB, InsertOption<MClientCB>> insertOpLambda, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mClient, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mClient The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MClient mClient, WritableOptionCall<MClientCB, DeleteOption<MClientCB>> opLambda) {
        doDelete(mClient, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mClient The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MClient mClient, WritableOptionCall<MClientCB, DeleteOption<MClientCB>> opLambda) {
        doDeleteNonstrict(mClient, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MClient> mClientList, WritableOptionCall<MClientCB, InsertOption<MClientCB>> opLambda) {
        return doBatchInsert(mClientList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MClient> mClientList, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> opLambda) {
        return doBatchUpdate(mClientList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MClient> mClientList, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> opLambda) {
        return doBatchUpdateNonstrict(mClientList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MClient> mClientList, WritableOptionCall<MClientCB, DeleteOption<MClientCB>> opLambda) {
        return doBatchDelete(mClientList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mClientList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MClient> mClientList, WritableOptionCall<MClientCB, DeleteOption<MClientCB>> opLambda) {
        return doBatchDeleteNonstrict(mClientList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MClient, MClientCB> manyArgLambda, WritableOptionCall<MClientCB, InsertOption<MClientCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MClient mClient = <span style="color: #70226C">new</span> MClient();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mClient.setPK...(value);</span>
     * mClient.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mClient.setVersionNo(value);</span>
     * MClientCB cb = <span style="color: #70226C">new</span> MClientCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mClient, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mClient The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MClient. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MClient mClient, MClientCB cb, WritableOptionCall<MClientCB, UpdateOption<MClientCB>> opLambda) {
        return doQueryUpdate(mClient, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MClient. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MClientCB cb, WritableOptionCall<MClientCB, DeleteOption<MClientCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mClientBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mClientBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mClientBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mClientBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mClientBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mClientBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mClientBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mClientBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mClientBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mClientBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mClientBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mClientBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mClientBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mClientBhv.outideSql().removeBlockComment().selectList()
     * mClientBhv.outideSql().removeLineComment().selectList()
     * mClientBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MClientBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MClientBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MClient> typeOfSelectedEntity() { return MClient.class; }
    protected Class<MClient> typeOfHandlingEntity() { return MClient.class; }
    protected Class<MClientCB> typeOfHandlingConditionBean() { return MClientCB.class; }
}