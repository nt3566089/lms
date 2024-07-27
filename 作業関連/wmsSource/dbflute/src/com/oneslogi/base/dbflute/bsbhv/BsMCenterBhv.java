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
 * The behavior of m_center as TABLE. <br>
 * <pre>
 * [primary key]
 *     CENTER_ID
 *
 * [column]
 *     CENTER_ID, CENTER_CD, CENTER_NM, CENTER_ABBR, CULTURE_ID, TIME_ZONE_ID, ADDRESS, TEL_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CENTER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_time_zone, b_culture, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     h_location_attribute, m_box, m_box_grp, m_carrier, m_carrier_slip_sgw, m_carrier_slip_ymt, m_carrier_slip_yupk, m_center_class, m_center_col, m_center_customer, m_center_item, m_center_screen, m_client_center, m_customer_picking, m_delivery_course, m_general, m_location, m_nizoroe, m_numbering_center, m_user_center, m_user_login, m_warehouse, m_web_ht_info, t_alloc_inst_h, t_ec_order_h, t_inventory_h, t_move_inst_h, t_packing_h, t_pic_mthd_rcmd, t_picking_h, t_receive_plan_h, t_serial_no, t_shipping_inst_h, t_store_record_h, w_ht_inventory_input_prod, w_ht_loading, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt
 *
 * [foreign property]
 *     bTimeZone, bCulture, bClassDtlByDelFlg
 *
 * [referrer property]
 *     hLocationAttributeList, mBoxList, mBoxGrpList, mCarrierList, mCarrierSlipSgwList, mCarrierSlipYmtList, mCarrierSlipYupkList, mCenterClassList, mCenterColList, mCenterCustomerList, mCenterItemList, mCenterScreenList, mClientCenterList, mCustomerPickingList, mDeliveryCourseList, mGeneralList, mLocationList, mNizoroeList, mNumberingCenterList, mUserCenterList, mUserLoginList, mWarehouseList, mWebHtInfoList, tAllocInstHList, tEcOrderHList, tInventoryHList, tMoveInstHList, tPackingHList, tPicMthdRcmdList, tPickingHList, tReceivePlanHList, tSerialNoList, tShippingInstHList, tStoreRecordHList, wHtInventoryInputProdList, wHtLoadingList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtSerialReceiveInspList, wHtSerialShippingInspList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsMCenterBhv extends AbstractBehaviorWritable<MCenter, MCenterCB> {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /*df:beginQueryPath*/
    /*df:endQueryPath*/

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public MCenterDbm asDBMeta() { return MCenterDbm.getInstance(); }
    /** {@inheritDoc} */
    public String asTableDbName() { return "m_center"; }

    /** @return The instance of DBMeta as my table type. (NotNull) */
    public MCenterDbm getMyDBMeta() { return MCenterDbm.getInstance(); }

    // ===================================================================================
    //                                                                        New Instance
    //                                                                        ============
    /** {@inheritDoc} */
    public MCenterCB newConditionBean() { return new MCenterCB(); }

    /** @return The instance of new entity as my table type. (NotNull) */
    public MCenter newMyEntity() { return new MCenter(); }

    /** @return The instance of new condition-bean as my table type. (NotNull) */
    public MCenterCB newMyConditionBean() { return new MCenterCB(); }

    // ===================================================================================
    //                                                                        Count Select
    //                                                                        ============
    /**
     * Select the count of uniquely-selected records by the condition-bean. {IgnorePagingCondition, IgnoreSpecifyColumn}<br>
     * SpecifyColumn is ignored but you can use it only to remove text type column for union's distinct.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #70226C">int</span> count = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectCount</span>(cb);
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The count for the condition. (NotMinus)
     */
    public int selectCount(MCenterCB cb) {
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
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * MCenter mCenter = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #DD4747">selectEntity</span>(cb);
     * <span style="color: #70226C">if</span> (mCenter != <span style="color: #70226C">null</span>) { <span style="color: #3F7E5E">// null check</span>
     *     ... = mCenter.get...();
     * } <span style="color: #70226C">else</span> {
     *     ...
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The entity selected by the condition. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectEntity(MCenterCB cb) {
        return facadeSelectEntity(cb);
    }

    protected MCenter facadeSelectEntity(MCenterCB cb) {
        return doSelectEntity(cb, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectOptionalEntity(MCenterCB cb, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(cb, tp), cb);
    }

    protected Entity doReadEntity(ConditionBean cb) { return facadeSelectEntity(downcast(cb)); }

    /**
     * Select the entity by the condition-bean with deleted check. <br>
     * <span style="color: #AD4747; font-size: 120%">If the data is always present as your business rule, this method is good.</span>
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...;
     * MCenter mCenter = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectEntityWithDeletedCheck</span>(cb);
     * ... = mCenter.get...(); <span style="color: #3F7E5E">// the entity always be not null</span>
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The entity selected by the condition. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectEntityWithDeletedCheck(MCenterCB cb) {
        return facadeSelectEntityWithDeletedCheck(cb);
    }

    /**
     * Select the entity by the primary-key value.
     * @param centerId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NullAllowed: if no data, it returns null)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectByPKValue(Long centerId) {
        return facadeSelectByPKValue(centerId);
    }

    protected MCenter facadeSelectByPKValue(Long centerId) {
        return doSelectByPK(centerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> ENTITY doSelectByPK(Long centerId, Class<? extends ENTITY> tp) {
        return doSelectEntity(xprepareCBAsPK(centerId), tp);
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectOptionalByPK(Long centerId, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectByPK(centerId, tp), centerId);
    }

    /**
     * Select the entity by the primary-key value with deleted check.
     * @param centerId : PK, ID, NotNull, BIGINT(19). (NotNull)
     * @return The entity selected by the PK. (NotNull: if no data, throws exception)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public MCenter selectByPKValueWithDeletedCheck(Long centerId) {
        return doSelectByPKWithDeletedCheck(centerId, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> ENTITY doSelectByPKWithDeletedCheck(Long centerId, Class<ENTITY> tp) {
        return doSelectEntityWithDeletedCheck(xprepareCBAsPK(centerId), tp);
    }

    protected MCenterCB xprepareCBAsPK(Long centerId) {
        assertObjectNotNull("centerId", centerId);
        return newConditionBean().acceptPK(centerId);
    }

    /**
     * Select the entity by the unique-key value.
     * @param centerCd : UQ, NotNull, VARCHAR(30). (NotNull)
     * @return The optional entity selected by the unique key. (NotNull: if no data, empty entity)
     * @throws EntityAlreadyDeletedException When get(), required() of return value is called and the value is null, which means entity has already been deleted (not found).
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws SelectEntityConditionNotFoundException When the condition for selecting an entity is not found.
     */
    public OptionalEntity<MCenter> selectByUniqueOf(String centerCd) {
        return facadeSelectByUniqueOf(centerCd);
    }

    protected OptionalEntity<MCenter> facadeSelectByUniqueOf(String centerCd) {
        return doSelectByUniqueOf(centerCd, typeOfSelectedEntity());
    }

    protected <ENTITY extends MCenter> OptionalEntity<ENTITY> doSelectByUniqueOf(String centerCd, Class<? extends ENTITY> tp) {
        return createOptionalEntity(doSelectEntity(xprepareCBAsUniqueOf(centerCd), tp), centerCd);
    }

    protected MCenterCB xprepareCBAsUniqueOf(String centerCd) {
        assertObjectNotNull("centerCd", centerCd);
        return newConditionBean().acceptUniqueOf(centerCd);
    }

    // ===================================================================================
    //                                                                         List Select
    //                                                                         ===========
    /**
     * Select the list as result bean.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...;
     * cb.query().addOrderBy...;
     * ListResultBean&lt;MCenter&gt; <span style="color: #553000">mCenterList</span> = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectList</span>(cb);
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.get...;
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The result bean of selected list. (NotNull: if no data, returns empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public ListResultBean<MCenter> selectList(MCenterCB cb) {
        return facadeSelectList(cb);
    }

    // ===================================================================================
    //                                                                         Page Select
    //                                                                         ===========
    /**
     * Select the page as result bean. <br>
     * (both count-select and paging-select are executed)
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * cb.query().addOrderBy_Bar...();
     * cb.<span style="color: #CC4747">paging</span>(20, 3); <span style="color: #3F7E5E">// 20 records per a page and current page number is 3</span>
     * PagingResultBean&lt;MCenter&gt; <span style="color: #553000">page</span> = <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectPage</span>(cb);
     * <span style="color: #70226C">int</span> allRecordCount = <span style="color: #553000">page</span>.getAllRecordCount();
     * <span style="color: #70226C">int</span> allPageCount = <span style="color: #553000">page</span>.getAllPageCount();
     * <span style="color: #70226C">boolean</span> isExistPrePage = <span style="color: #553000">page</span>.isExistPrePage();
     * <span style="color: #70226C">boolean</span> isExistNextPage = <span style="color: #553000">page</span>.isExistNextPage();
     * ...
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">page</span>) {
     *     ... = mCenter.get...();
     * }
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The result bean of selected page. (NotNull: if no data, returns bean as empty list)
     * @throws DangerousResultSizeException When the result size is over the specified safety size.
     */
    public PagingResultBean<MCenter> selectPage(MCenterCB cb) {
        return facadeSelectPage(cb);
    }

    // ===================================================================================
    //                                                                       Cursor Select
    //                                                                       =============
    /**
     * Select the cursor by the condition-bean.
     * <pre>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().set...
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectCursor</span>(cb, <span style="color: #553000">member</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     ... = <span style="color: #553000">member</span>.getMemberName();
     * });
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param entityRowHandler The handler of entity row of MCenter. (NotNull)
     */
    public void selectCursor(MCenterCB cb, EntityRowHandler<MCenter> entityRowHandler) {
        facadeSelectCursor(cb, entityRowHandler);
    }

    // ===================================================================================
    //                                                                       Scalar Select
    //                                                                       =============
    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">selectScalar</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCB, RESULT> selectScalar(Class<RESULT> resultType) {
        return facadeScalarSelect(resultType);
    }

    /**
     * Select the scalar value derived by a function from uniquely-selected records. <br>
     * You should call a function method after this method called like as follows:
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">scalarSelect</span>(Date.class).max(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">column...</span>; <span style="color: #3F7E5E">// required for the function</span>
     *     <span style="color: #553000">cb</span>.query().set...
     * });
     * </pre>
     * @param <RESULT> The type of result.
     * @param resultType The type of result. (NotNull)
     * @return The scalar function object to specify function for scalar value. (NotNull)
     */
    public <RESULT> HpSLSFunction<MCenterCB, RESULT> scalarSelect(Class<RESULT> resultType) {
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
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(List<MCenter> mCenterList, ReferrerLoaderHandler<LoaderOfMCenter> loaderLambda) {
        xassLRArg(mCenterList, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenter().ready(mCenterList, _behaviorSelector));
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
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loaderLambda The callback to handle the referrer loader for actually loading referrer. (NotNull)
     */
    public void load(MCenter mCenter, ReferrerLoaderHandler<LoaderOfMCenter> loaderLambda) {
        xassLRArg(mCenter, loaderLambda);
        loaderLambda.handle(new LoaderOfMCenter().ready(xnewLRAryLs(mCenter), _behaviorSelector));
    }

    /**
     * Load referrer of HLocationAttributeList by the set-upper of referrer. <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadHLocationAttributeList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeCB</span>.setupSelect...
     *     <span style="color: #553000">attributeCB</span>.query().set...
     *     <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getHLocationAttributeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HLocationAttribute> loadHLocationAttributeList(List<MCenter> mCenterList, ConditionBeanSetupper<HLocationAttributeCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadHLocationAttributeList(mCenterList, new LoadReferrerOption<HLocationAttributeCB, HLocationAttribute>().xinit(refCBLambda));
    }

    /**
     * Load referrer of HLocationAttributeList by the set-upper of referrer. <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadHLocationAttributeList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">attributeCB</span>.setupSelect...
     *     <span style="color: #553000">attributeCB</span>.query().set...
     *     <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getHLocationAttributeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HLocationAttribute> loadHLocationAttributeList(MCenter mCenter, ConditionBeanSetupper<HLocationAttributeCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadHLocationAttributeList(xnewLRLs(mCenter), new LoadReferrerOption<HLocationAttributeCB, HLocationAttribute>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<HLocationAttribute> loadHLocationAttributeList(MCenter mCenter, LoadReferrerOption<HLocationAttributeCB, HLocationAttribute> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadHLocationAttributeList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<HLocationAttribute> loadHLocationAttributeList(List<MCenter> mCenterList, LoadReferrerOption<HLocationAttributeCB, HLocationAttribute> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<HLocationAttribute>)EMPTY_NREF_LGWAY; }
        return doLoadHLocationAttributeList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<HLocationAttribute> doLoadHLocationAttributeList(List<MCenter> mCenterList, LoadReferrerOption<HLocationAttributeCB, HLocationAttribute> option) {
        return helpLoadReferrerInternally(mCenterList, option, "hLocationAttributeList");
    }

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * m_box by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(List<MCenter> mCenterList, ConditionBeanSetupper<MBoxCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMBoxList(mCenterList, new LoadReferrerOption<MBoxCB, MBox>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * m_box by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">boxCB</span>.setupSelect...
     *     <span style="color: #553000">boxCB</span>.query().set...
     *     <span style="color: #553000">boxCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMBoxList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(MCenter mCenter, ConditionBeanSetupper<MBoxCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMBoxList(xnewLRLs(mCenter), new LoadReferrerOption<MBoxCB, MBox>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBox> loadMBoxList(MCenter mCenter, LoadReferrerOption<MBoxCB, MBox> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMBoxList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBox> loadMBoxList(List<MCenter> mCenterList, LoadReferrerOption<MBoxCB, MBox> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MBox>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBox> doLoadMBoxList(List<MCenter> mCenterList, LoadReferrerOption<MBoxCB, MBox> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mBoxList");
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MCenter> mCenterList, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMBoxGrpList(mCenterList, new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">grpCB</span>.setupSelect...
     *     <span style="color: #553000">grpCB</span>.query().set...
     *     <span style="color: #553000">grpCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MCenter mCenter, ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMBoxGrpList(xnewLRLs(mCenter), new LoadReferrerOption<MBoxGrpCB, MBoxGrp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(MCenter mCenter, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMBoxGrpList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MBoxGrp> loadMBoxGrpList(List<MCenter> mCenterList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MBoxGrp>)EMPTY_NREF_LGWAY; }
        return doLoadMBoxGrpList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MBoxGrp> doLoadMBoxGrpList(List<MCenter> mCenterList, LoadReferrerOption<MBoxGrpCB, MBoxGrp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mBoxGrpList");
    }

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * m_carrier by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierCB</span>.setupSelect...
     *     <span style="color: #553000">carrierCB</span>.query().set...
     *     <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierList(mCenterList, new LoadReferrerOption<MCarrierCB, MCarrier>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * m_carrier by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierCB</span>.setupSelect...
     *     <span style="color: #553000">carrierCB</span>.query().set...
     *     <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(MCenter mCenter, ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierCB, MCarrier>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(MCenter mCenter, LoadReferrerOption<MCarrierCB, MCarrier> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrier> loadMCarrierList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierCB, MCarrier> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrier>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrier> doLoadMCarrierList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierCB, MCarrier> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierList");
    }

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sgwCB</span>.setupSelect...
     *     <span style="color: #553000">sgwCB</span>.query().set...
     *     <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipSgwList(mCenterList, new LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">sgwCB</span>.setupSelect...
     *     <span style="color: #553000">sgwCB</span>.query().set...
     *     <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipSgwList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(MCenter mCenter, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipSgwList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipSgw> loadMCarrierSlipSgwList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipSgw>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipSgwList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipSgw> doLoadMCarrierSlipSgwList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipSgwCB, MCarrierSlipSgw> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipSgwList");
    }

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ymtCB</span>.setupSelect...
     *     <span style="color: #553000">ymtCB</span>.query().set...
     *     <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipYmtList(mCenterList, new LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">ymtCB</span>.setupSelect...
     *     <span style="color: #553000">ymtCB</span>.query().set...
     *     <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipYmtList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(MCenter mCenter, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipYmtList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipYmt> loadMCarrierSlipYmtList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipYmt>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipYmtList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipYmt> doLoadMCarrierSlipYmtList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYmtCB, MCarrierSlipYmt> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipYmtList");
    }

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">yupkCB</span>.setupSelect...
     *     <span style="color: #553000">yupkCB</span>.query().set...
     *     <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(List<MCenter> mCenterList, ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCarrierSlipYupkList(mCenterList, new LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">yupkCB</span>.setupSelect...
     *     <span style="color: #553000">yupkCB</span>.query().set...
     *     <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(MCenter mCenter, ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCarrierSlipYupkList(xnewLRLs(mCenter), new LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(MCenter mCenter, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCarrierSlipYupkList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCarrierSlipYupk> loadMCarrierSlipYupkList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCarrierSlipYupk>)EMPTY_NREF_LGWAY; }
        return doLoadMCarrierSlipYupkList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCarrierSlipYupk> doLoadMCarrierSlipYupkList(List<MCenter> mCenterList, LoadReferrerOption<MCarrierSlipYupkCB, MCarrierSlipYupk> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCarrierSlipYupkList");
    }

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * m_center_class by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classCB</span>.setupSelect...
     *     <span style="color: #553000">classCB</span>.query().set...
     *     <span style="color: #553000">classCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterClassList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterClassList(mCenterList, new LoadReferrerOption<MCenterClassCB, MCenterClass>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * m_center_class by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">classCB</span>.setupSelect...
     *     <span style="color: #553000">classCB</span>.query().set...
     *     <span style="color: #553000">classCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterClassList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(MCenter mCenter, ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterClassList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterClassCB, MCenterClass>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(MCenter mCenter, LoadReferrerOption<MCenterClassCB, MCenterClass> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterClassList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterClass> loadMCenterClassList(List<MCenter> mCenterList, LoadReferrerOption<MCenterClassCB, MCenterClass> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterClass>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterClassList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterClass> doLoadMCenterClassList(List<MCenter> mCenterList, LoadReferrerOption<MCenterClassCB, MCenterClass> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterClassList");
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * m_center_col by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterColList(mCenterList, new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * m_center_col by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">colCB</span>.setupSelect...
     *     <span style="color: #553000">colCB</span>.query().set...
     *     <span style="color: #553000">colCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterColList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(MCenter mCenter, ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterColList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterColCB, MCenterCol>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(MCenter mCenter, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterColList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCol> loadMCenterColList(List<MCenter> mCenterList, LoadReferrerOption<MCenterColCB, MCenterCol> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterCol>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterColList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCol> doLoadMCenterColList(List<MCenter> mCenterList, LoadReferrerOption<MCenterColCB, MCenterCol> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterColList");
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterCustomerList(mCenterList, new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerCB</span>.setupSelect...
     *     <span style="color: #553000">customerCB</span>.query().set...
     *     <span style="color: #553000">customerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCenter mCenter, ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterCustomerList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterCustomerCB, MCenterCustomer>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(MCenter mCenter, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterCustomerList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterCustomer> loadMCenterCustomerList(List<MCenter> mCenterList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterCustomer>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterCustomerList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterCustomer> doLoadMCenterCustomerList(List<MCenter> mCenterList, LoadReferrerOption<MCenterCustomerCB, MCenterCustomer> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterCustomerList");
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * m_center_item by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterItemList(mCenterList, new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * m_center_item by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">itemCB</span>.setupSelect...
     *     <span style="color: #553000">itemCB</span>.query().set...
     *     <span style="color: #553000">itemCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterItemList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(MCenter mCenter, ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterItemList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterItemCB, MCenterItem>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(MCenter mCenter, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterItemList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterItem> loadMCenterItemList(List<MCenter> mCenterList, LoadReferrerOption<MCenterItemCB, MCenterItem> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterItem>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterItemList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterItem> doLoadMCenterItemList(List<MCenter> mCenterList, LoadReferrerOption<MCenterItemCB, MCenterItem> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterItemList");
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<MCenter> mCenterList, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCenterScreenList(mCenterList, new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">screenCB</span>.setupSelect...
     *     <span style="color: #553000">screenCB</span>.query().set...
     *     <span style="color: #553000">screenCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(MCenter mCenter, ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCenterScreenList(xnewLRLs(mCenter), new LoadReferrerOption<MCenterScreenCB, MCenterScreen>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(MCenter mCenter, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCenterScreenList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCenterScreen> loadMCenterScreenList(List<MCenter> mCenterList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCenterScreen>)EMPTY_NREF_LGWAY; }
        return doLoadMCenterScreenList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCenterScreen> doLoadMCenterScreenList(List<MCenter> mCenterList, LoadReferrerOption<MCenterScreenCB, MCenterScreen> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCenterScreenList");
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMClientCenterList(mCenterList, new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMClientCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCenter mCenter, ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMClientCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MClientCenterCB, MClientCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(MCenter mCenter, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMClientCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MClientCenter> loadMClientCenterList(List<MCenter> mCenterList, LoadReferrerOption<MClientCenterCB, MClientCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MClientCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMClientCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MClientCenter> doLoadMClientCenterList(List<MCenter> mCenterList, LoadReferrerOption<MClientCenterCB, MClientCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mClientCenterList");
    }

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(List<MCenter> mCenterList, ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMCustomerPickingList(mCenterList, new LoadReferrerOption<MCustomerPickingCB, MCustomerPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(MCenter mCenter, ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMCustomerPickingList(xnewLRLs(mCenter), new LoadReferrerOption<MCustomerPickingCB, MCustomerPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(MCenter mCenter, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMCustomerPickingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MCustomerPicking> loadMCustomerPickingList(List<MCenter> mCenterList, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MCustomerPicking>)EMPTY_NREF_LGWAY; }
        return doLoadMCustomerPickingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MCustomerPicking> doLoadMCustomerPickingList(List<MCenter> mCenterList, LoadReferrerOption<MCustomerPickingCB, MCustomerPicking> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mCustomerPickingList");
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCenter> mCenterList, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMDeliveryCourseList(mCenterList, new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">courseCB</span>.setupSelect...
     *     <span style="color: #553000">courseCB</span>.query().set...
     *     <span style="color: #553000">courseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCenter mCenter, ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMDeliveryCourseList(xnewLRLs(mCenter), new LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(MCenter mCenter, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMDeliveryCourseList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MDeliveryCourse> loadMDeliveryCourseList(List<MCenter> mCenterList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MDeliveryCourse>)EMPTY_NREF_LGWAY; }
        return doLoadMDeliveryCourseList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MDeliveryCourse> doLoadMDeliveryCourseList(List<MCenter> mCenterList, LoadReferrerOption<MDeliveryCourseCB, MDeliveryCourse> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mDeliveryCourseList");
    }

    /**
     * Load referrer of MGeneralList by the set-upper of referrer. <br>
     * m_general by CENTER_ID, named 'MGeneralList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMGeneralList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">generalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">generalCB</span>.setupSelect...
     *     <span style="color: #553000">generalCB</span>.query().set...
     *     <span style="color: #553000">generalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMGeneralList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MGeneral> loadMGeneralList(List<MCenter> mCenterList, ConditionBeanSetupper<MGeneralCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMGeneralList(mCenterList, new LoadReferrerOption<MGeneralCB, MGeneral>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MGeneralList by the set-upper of referrer. <br>
     * m_general by CENTER_ID, named 'MGeneralList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMGeneralList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">generalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">generalCB</span>.setupSelect...
     *     <span style="color: #553000">generalCB</span>.query().set...
     *     <span style="color: #553000">generalCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMGeneralList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MGeneral> loadMGeneralList(MCenter mCenter, ConditionBeanSetupper<MGeneralCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMGeneralList(xnewLRLs(mCenter), new LoadReferrerOption<MGeneralCB, MGeneral>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MGeneral> loadMGeneralList(MCenter mCenter, LoadReferrerOption<MGeneralCB, MGeneral> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMGeneralList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MGeneral> loadMGeneralList(List<MCenter> mCenterList, LoadReferrerOption<MGeneralCB, MGeneral> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MGeneral>)EMPTY_NREF_LGWAY; }
        return doLoadMGeneralList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MGeneral> doLoadMGeneralList(List<MCenter> mCenterList, LoadReferrerOption<MGeneralCB, MGeneral> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mGeneralList");
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCenter> mCenterList, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMLocationList(mCenterList, new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">locationCB</span>.setupSelect...
     *     <span style="color: #553000">locationCB</span>.query().set...
     *     <span style="color: #553000">locationCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMLocationList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCenter mCenter, ConditionBeanSetupper<MLocationCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMLocationList(xnewLRLs(mCenter), new LoadReferrerOption<MLocationCB, MLocation>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MLocation> loadMLocationList(MCenter mCenter, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMLocationList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MLocation> loadMLocationList(List<MCenter> mCenterList, LoadReferrerOption<MLocationCB, MLocation> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MLocation>)EMPTY_NREF_LGWAY; }
        return doLoadMLocationList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MLocation> doLoadMLocationList(List<MCenter> mCenterList, LoadReferrerOption<MLocationCB, MLocation> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mLocationList");
    }

    /**
     * Load referrer of MNizoroeList by the set-upper of referrer. <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNizoroeList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">nizoroeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nizoroeCB</span>.setupSelect...
     *     <span style="color: #553000">nizoroeCB</span>.query().set...
     *     <span style="color: #553000">nizoroeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNizoroeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNizoroe> loadMNizoroeList(List<MCenter> mCenterList, ConditionBeanSetupper<MNizoroeCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMNizoroeList(mCenterList, new LoadReferrerOption<MNizoroeCB, MNizoroe>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MNizoroeList by the set-upper of referrer. <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNizoroeList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">nizoroeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">nizoroeCB</span>.setupSelect...
     *     <span style="color: #553000">nizoroeCB</span>.query().set...
     *     <span style="color: #553000">nizoroeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMNizoroeList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNizoroe> loadMNizoroeList(MCenter mCenter, ConditionBeanSetupper<MNizoroeCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMNizoroeList(xnewLRLs(mCenter), new LoadReferrerOption<MNizoroeCB, MNizoroe>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNizoroe> loadMNizoroeList(MCenter mCenter, LoadReferrerOption<MNizoroeCB, MNizoroe> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMNizoroeList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MNizoroe> loadMNizoroeList(List<MCenter> mCenterList, LoadReferrerOption<MNizoroeCB, MNizoroe> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MNizoroe>)EMPTY_NREF_LGWAY; }
        return doLoadMNizoroeList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MNizoroe> doLoadMNizoroeList(List<MCenter> mCenterList, LoadReferrerOption<MNizoroeCB, MNizoroe> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mNizoroeList");
    }

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMNumberingCenterList(mCenterList, new LoadReferrerOption<MNumberingCenterCB, MNumberingCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(MCenter mCenter, ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMNumberingCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MNumberingCenterCB, MNumberingCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(MCenter mCenter, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMNumberingCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MNumberingCenter> loadMNumberingCenterList(List<MCenter> mCenterList, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MNumberingCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMNumberingCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MNumberingCenter> doLoadMNumberingCenterList(List<MCenter> mCenterList, LoadReferrerOption<MNumberingCenterCB, MNumberingCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mNumberingCenterList");
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * m_user_center by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<MCenter> mCenterList, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMUserCenterList(mCenterList, new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * m_user_center by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerCB</span>.setupSelect...
     *     <span style="color: #553000">centerCB</span>.query().set...
     *     <span style="color: #553000">centerCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMUserCenterList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(MCenter mCenter, ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMUserCenterList(xnewLRLs(mCenter), new LoadReferrerOption<MUserCenterCB, MUserCenter>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(MCenter mCenter, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMUserCenterList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserCenter> loadMUserCenterList(List<MCenter> mCenterList, LoadReferrerOption<MUserCenterCB, MUserCenter> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MUserCenter>)EMPTY_NREF_LGWAY; }
        return doLoadMUserCenterList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserCenter> doLoadMUserCenterList(List<MCenter> mCenterList, LoadReferrerOption<MUserCenterCB, MUserCenter> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mUserCenterList");
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MCenter> mCenterList, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMUserLoginList(mCenterList, new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loginCB</span>.setupSelect...
     *     <span style="color: #553000">loginCB</span>.query().set...
     *     <span style="color: #553000">loginCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMUserLoginList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MCenter mCenter, ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMUserLoginList(xnewLRLs(mCenter), new LoadReferrerOption<MUserLoginCB, MUserLogin>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(MCenter mCenter, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMUserLoginList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MUserLogin> loadMUserLoginList(List<MCenter> mCenterList, LoadReferrerOption<MUserLoginCB, MUserLogin> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MUserLogin>)EMPTY_NREF_LGWAY; }
        return doLoadMUserLoginList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MUserLogin> doLoadMUserLoginList(List<MCenter> mCenterList, LoadReferrerOption<MUserLoginCB, MUserLogin> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mUserLoginList");
    }

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseCB</span>.setupSelect...
     *     <span style="color: #553000">warehouseCB</span>.query().set...
     *     <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWarehouseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(List<MCenter> mCenterList, ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMWarehouseList(mCenterList, new LoadReferrerOption<MWarehouseCB, MWarehouse>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">warehouseCB</span>.setupSelect...
     *     <span style="color: #553000">warehouseCB</span>.query().set...
     *     <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMWarehouseList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(MCenter mCenter, ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMWarehouseList(xnewLRLs(mCenter), new LoadReferrerOption<MWarehouseCB, MWarehouse>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(MCenter mCenter, LoadReferrerOption<MWarehouseCB, MWarehouse> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMWarehouseList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWarehouse> loadMWarehouseList(List<MCenter> mCenterList, LoadReferrerOption<MWarehouseCB, MWarehouse> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MWarehouse>)EMPTY_NREF_LGWAY; }
        return doLoadMWarehouseList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWarehouse> doLoadMWarehouseList(List<MCenter> mCenterList, LoadReferrerOption<MWarehouseCB, MWarehouse> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mWarehouseList");
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MCenter> mCenterList, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadMWebHtInfoList(mCenterList, new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">infoCB</span>.setupSelect...
     *     <span style="color: #553000">infoCB</span>.query().set...
     *     <span style="color: #553000">infoCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MCenter mCenter, ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadMWebHtInfoList(xnewLRLs(mCenter), new LoadReferrerOption<MWebHtInfoCB, MWebHtInfo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(MCenter mCenter, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadMWebHtInfoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<MWebHtInfo> loadMWebHtInfoList(List<MCenter> mCenterList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<MWebHtInfo>)EMPTY_NREF_LGWAY; }
        return doLoadMWebHtInfoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<MWebHtInfo> doLoadMWebHtInfoList(List<MCenter> mCenterList, LoadReferrerOption<MWebHtInfoCB, MWebHtInfo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "mWebHtInfoList");
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTAllocInstHList(mCenterList, new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MCenter mCenter, ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTAllocInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TAllocInstHCB, TAllocInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(MCenter mCenter, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTAllocInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TAllocInstH> loadTAllocInstHList(List<MCenter> mCenterList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TAllocInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTAllocInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TAllocInstH> doLoadTAllocInstHList(List<MCenter> mCenterList, LoadReferrerOption<TAllocInstHCB, TAllocInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tAllocInstHList");
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MCenter> mCenterList, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTEcOrderHList(mCenterList, new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MCenter mCenter, ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTEcOrderHList(xnewLRLs(mCenter), new LoadReferrerOption<TEcOrderHCB, TEcOrderH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(MCenter mCenter, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTEcOrderHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TEcOrderH> loadTEcOrderHList(List<MCenter> mCenterList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TEcOrderH>)EMPTY_NREF_LGWAY; }
        return doLoadTEcOrderHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TEcOrderH> doLoadTEcOrderHList(List<MCenter> mCenterList, LoadReferrerOption<TEcOrderHCB, TEcOrderH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tEcOrderHList");
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MCenter> mCenterList, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTInventoryHList(mCenterList, new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTInventoryHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MCenter mCenter, ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTInventoryHList(xnewLRLs(mCenter), new LoadReferrerOption<TInventoryHCB, TInventoryH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(MCenter mCenter, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTInventoryHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TInventoryH> loadTInventoryHList(List<MCenter> mCenterList, LoadReferrerOption<TInventoryHCB, TInventoryH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TInventoryH>)EMPTY_NREF_LGWAY; }
        return doLoadTInventoryHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TInventoryH> doLoadTInventoryHList(List<MCenter> mCenterList, LoadReferrerOption<TInventoryHCB, TInventoryH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tInventoryHList");
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTMoveInstHList(mCenterList, new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MCenter mCenter, ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTMoveInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TMoveInstHCB, TMoveInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(MCenter mCenter, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTMoveInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TMoveInstH> loadTMoveInstHList(List<MCenter> mCenterList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TMoveInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTMoveInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TMoveInstH> doLoadTMoveInstHList(List<MCenter> mCenterList, LoadReferrerOption<TMoveInstHCB, TMoveInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tMoveInstHList");
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * t_packing_h by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MCenter> mCenterList, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPackingHList(mCenterList, new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * t_packing_h by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPackingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MCenter mCenter, ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPackingHList(xnewLRLs(mCenter), new LoadReferrerOption<TPackingHCB, TPackingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(MCenter mCenter, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPackingHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPackingH> loadTPackingHList(List<MCenter> mCenterList, LoadReferrerOption<TPackingHCB, TPackingH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPackingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPackingHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPackingH> doLoadTPackingHList(List<MCenter> mCenterList, LoadReferrerOption<TPackingHCB, TPackingH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPackingHList");
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MCenter> mCenterList, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPicMthdRcmdList(mCenterList, new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">rcmdCB</span>.setupSelect...
     *     <span style="color: #553000">rcmdCB</span>.query().set...
     *     <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MCenter mCenter, ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPicMthdRcmdList(xnewLRLs(mCenter), new LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(MCenter mCenter, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPicMthdRcmdList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPicMthdRcmd> loadTPicMthdRcmdList(List<MCenter> mCenterList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPicMthdRcmd>)EMPTY_NREF_LGWAY; }
        return doLoadTPicMthdRcmdList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPicMthdRcmd> doLoadTPicMthdRcmdList(List<MCenter> mCenterList, LoadReferrerOption<TPicMthdRcmdCB, TPicMthdRcmd> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPicMthdRcmdList");
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * t_picking_h by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MCenter> mCenterList, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTPickingHList(mCenterList, new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * t_picking_h by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTPickingHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MCenter mCenter, ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTPickingHList(xnewLRLs(mCenter), new LoadReferrerOption<TPickingHCB, TPickingH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(MCenter mCenter, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTPickingHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TPickingH> loadTPickingHList(List<MCenter> mCenterList, LoadReferrerOption<TPickingHCB, TPickingH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TPickingH>)EMPTY_NREF_LGWAY; }
        return doLoadTPickingHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TPickingH> doLoadTPickingHList(List<MCenter> mCenterList, LoadReferrerOption<TPickingHCB, TPickingH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tPickingHList");
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MCenter> mCenterList, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTReceivePlanHList(mCenterList, new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MCenter mCenter, ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTReceivePlanHList(xnewLRLs(mCenter), new LoadReferrerOption<TReceivePlanHCB, TReceivePlanH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(MCenter mCenter, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTReceivePlanHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TReceivePlanH> loadTReceivePlanHList(List<MCenter> mCenterList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TReceivePlanH>)EMPTY_NREF_LGWAY; }
        return doLoadTReceivePlanHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TReceivePlanH> doLoadTReceivePlanHList(List<MCenter> mCenterList, LoadReferrerOption<TReceivePlanHCB, TReceivePlanH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tReceivePlanHList");
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MCenter> mCenterList, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTSerialNoList(mCenterList, new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">noCB</span>.setupSelect...
     *     <span style="color: #553000">noCB</span>.query().set...
     *     <span style="color: #553000">noCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTSerialNoList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MCenter mCenter, ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTSerialNoList(xnewLRLs(mCenter), new LoadReferrerOption<TSerialNoCB, TSerialNo>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(MCenter mCenter, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTSerialNoList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TSerialNo> loadTSerialNoList(List<MCenter> mCenterList, LoadReferrerOption<TSerialNoCB, TSerialNo> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TSerialNo>)EMPTY_NREF_LGWAY; }
        return doLoadTSerialNoList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TSerialNo> doLoadTSerialNoList(List<MCenter> mCenterList, LoadReferrerOption<TSerialNoCB, TSerialNo> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tSerialNoList");
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MCenter> mCenterList, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTShippingInstHList(mCenterList, new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MCenter mCenter, ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTShippingInstHList(xnewLRLs(mCenter), new LoadReferrerOption<TShippingInstHCB, TShippingInstH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(MCenter mCenter, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTShippingInstHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TShippingInstH> loadTShippingInstHList(List<MCenter> mCenterList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TShippingInstH>)EMPTY_NREF_LGWAY; }
        return doLoadTShippingInstHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TShippingInstH> doLoadTShippingInstHList(List<MCenter> mCenterList, LoadReferrerOption<TShippingInstHCB, TShippingInstH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tShippingInstHList");
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MCenter> mCenterList, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadTStoreRecordHList(mCenterList, new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MCenter mCenter, ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadTStoreRecordHList(xnewLRLs(mCenter), new LoadReferrerOption<TStoreRecordHCB, TStoreRecordH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(MCenter mCenter, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadTStoreRecordHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<TStoreRecordH> loadTStoreRecordHList(List<MCenter> mCenterList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<TStoreRecordH>)EMPTY_NREF_LGWAY; }
        return doLoadTStoreRecordHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<TStoreRecordH> doLoadTStoreRecordHList(List<MCenter> mCenterList, LoadReferrerOption<TStoreRecordHCB, TStoreRecordH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "tStoreRecordHList");
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtInventoryInputProdList(mCenterList, new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">prodCB</span>.setupSelect...
     *     <span style="color: #553000">prodCB</span>.query().set...
     *     <span style="color: #553000">prodCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCenter mCenter, ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtInventoryInputProdList(xnewLRLs(mCenter), new LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(MCenter mCenter, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtInventoryInputProdList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtInventoryInputProd> loadWHtInventoryInputProdList(List<MCenter> mCenterList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtInventoryInputProd>)EMPTY_NREF_LGWAY; }
        return doLoadWHtInventoryInputProdList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtInventoryInputProd> doLoadWHtInventoryInputProdList(List<MCenter> mCenterList, LoadReferrerOption<WHtInventoryInputProdCB, WHtInventoryInputProd> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtInventoryInputProdList");
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtLoadingList(mCenterList, new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">loadingCB</span>.setupSelect...
     *     <span style="color: #553000">loadingCB</span>.query().set...
     *     <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MCenter mCenter, ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtLoadingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtLoadingCB, WHtLoading>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(MCenter mCenter, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtLoadingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtLoading> loadWHtLoadingList(List<MCenter> mCenterList, LoadReferrerOption<WHtLoadingCB, WHtLoading> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtLoading>)EMPTY_NREF_LGWAY; }
        return doLoadWHtLoadingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtLoading> doLoadWHtLoadingList(List<MCenter> mCenterList, LoadReferrerOption<WHtLoadingCB, WHtLoading> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtLoadingList");
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtPickingList(mCenterList, new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MCenter mCenter, ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtPickingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtPickingCB, WHtPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(MCenter mCenter, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtPickingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtPicking> loadWHtPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtPickingCB, WHtPicking> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtPickingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtPicking> doLoadWHtPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtPickingCB, WHtPicking> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtPickingList");
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveInspectionList(mCenterList, new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspectionCB</span>.setupSelect...
     *     <span style="color: #553000">inspectionCB</span>.query().set...
     *     <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveInspectionList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(MCenter mCenter, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveInspectionList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveInspection> loadWHtReceiveInspectionList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveInspection>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveInspectionList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveInspection> doLoadWHtReceiveInspectionList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveInspectionCB, WHtReceiveInspection> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveInspectionList");
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(mCenterList, new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveNoPlanInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(MCenter mCenter, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveNoPlanInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveNoPlanInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveNoPlanInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveNoPlanInsp> doLoadWHtReceiveNoPlanInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveNoPlanInspCB, WHtReceiveNoPlanInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveNoPlanInspList");
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtReceiveStoreList(mCenterList, new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">storeCB</span>.setupSelect...
     *     <span style="color: #553000">storeCB</span>.query().set...
     *     <span style="color: #553000">storeCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MCenter mCenter, ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtReceiveStoreList(xnewLRLs(mCenter), new LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(MCenter mCenter, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtReceiveStoreList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtReceiveStore> loadWHtReceiveStoreList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtReceiveStore>)EMPTY_NREF_LGWAY; }
        return doLoadWHtReceiveStoreList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtReceiveStore> doLoadWHtReceiveStoreList(List<MCenter> mCenterList, LoadReferrerOption<WHtReceiveStoreCB, WHtReceiveStore> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtReceiveStoreList");
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtSerialReceiveInspList(mCenterList, new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCenter mCenter, ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtSerialReceiveInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(MCenter mCenter, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtSerialReceiveInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialReceiveInsp> loadWHtSerialReceiveInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialReceiveInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialReceiveInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialReceiveInsp> doLoadWHtSerialReceiveInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialReceiveInspCB, WHtSerialReceiveInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtSerialReceiveInspList");
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtSerialShippingInspList(mCenterList, new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">inspCB</span>.setupSelect...
     *     <span style="color: #553000">inspCB</span>.query().set...
     *     <span style="color: #553000">inspCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCenter mCenter, ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtSerialShippingInspList(xnewLRLs(mCenter), new LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(MCenter mCenter, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtSerialShippingInspList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtSerialShippingInsp> loadWHtSerialShippingInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtSerialShippingInsp>)EMPTY_NREF_LGWAY; }
        return doLoadWHtSerialShippingInspList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtSerialShippingInsp> doLoadWHtSerialShippingInspList(List<MCenter> mCenterList, LoadReferrerOption<WHtSerialShippingInspCB, WHtSerialShippingInsp> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtSerialShippingInspList");
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtShippingList(mCenterList, new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">shippingCB</span>.setupSelect...
     *     <span style="color: #553000">shippingCB</span>.query().set...
     *     <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtShippingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MCenter mCenter, ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtShippingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtShippingCB, WHtShipping>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(MCenter mCenter, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtShippingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShipping> loadWHtShippingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingCB, WHtShipping> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtShipping>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShipping> doLoadWHtShippingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingCB, WHtShipping> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtShippingList");
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtShippingPickingList(mCenterList, new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MCenter mCenter, ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtShippingPickingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(MCenter mCenter, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtShippingPickingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtShippingPicking> loadWHtShippingPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtShippingPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtShippingPickingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtShippingPicking> doLoadWHtShippingPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtShippingPickingCB, WHtShippingPicking> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtShippingPickingList");
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MCenter> mCenterList, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWHtTotalPickingList(mCenterList, new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">pickingCB</span>.setupSelect...
     *     <span style="color: #553000">pickingCB</span>.query().set...
     *     <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MCenter mCenter, ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWHtTotalPickingList(xnewLRLs(mCenter), new LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(MCenter mCenter, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWHtTotalPickingList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WHtTotalPicking> loadWHtTotalPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WHtTotalPicking>)EMPTY_NREF_LGWAY; }
        return doLoadWHtTotalPickingList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WHtTotalPicking> doLoadWHtTotalPickingList(List<MCenter> mCenterList, LoadReferrerOption<WHtTotalPickingCB, WHtTotalPicking> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wHtTotalPickingList");
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MCenter> mCenterList, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWSglRowShipInspHList(mCenterList, new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hCB</span>.setupSelect...
     *     <span style="color: #553000">hCB</span>.query().set...
     *     <span style="color: #553000">hCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MCenter mCenter, ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWSglRowShipInspHList(xnewLRLs(mCenter), new LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(MCenter mCenter, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWSglRowShipInspHList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WSglRowShipInspH> loadWSglRowShipInspHList(List<MCenter> mCenterList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WSglRowShipInspH>)EMPTY_NREF_LGWAY; }
        return doLoadWSglRowShipInspHList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WSglRowShipInspH> doLoadWSglRowShipInspHList(List<MCenter> mCenterList, LoadReferrerOption<WSglRowShipInspHCB, WSglRowShipInspH> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wSglRowShipInspHList");
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * <span style="color: #70226C">for</span> (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MCenter> mCenterList, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mCenterList, refCBLambda);
        return doLoadWShippingInterruptList(mCenterList, new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">mCenter</span>, <span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">interruptCB</span>.setupSelect...
     *     <span style="color: #553000">interruptCB</span>.query().set...
     *     <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     * }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     * <span style="color: #3F7E5E">//}).withNestedReferrer(referrerList -&gt; {</span>
     * <span style="color: #3F7E5E">//    ...</span>
     * <span style="color: #3F7E5E">//});</span>
     * ... = <span style="color: #553000">mCenter</span>.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param mCenter The entity of MCenter. (NotNull)
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MCenter mCenter, ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        xassLRArg(mCenter, refCBLambda);
        return doLoadWShippingInterruptList(xnewLRLs(mCenter), new LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt>().xinit(refCBLambda));
    }

    /**
     * {Refer to overload method that has an argument of the list of entity.} #beforejava8
     * @param mCenter The entity of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(MCenter mCenter, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mCenter, loadReferrerOption);
        return loadWShippingInterruptList(xnewLRLs(mCenter), loadReferrerOption);
    }

    /**
     * {Refer to overload method that has an argument of condition-bean set-upper} #beforejava8
     * @param mCenterList The entity list of MCenter. (NotNull)
     * @param loadReferrerOption The option of load-referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    @SuppressWarnings("unchecked")
    public NestedReferrerListGateway<WShippingInterrupt> loadWShippingInterruptList(List<MCenter> mCenterList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> loadReferrerOption) {
        xassLRArg(mCenterList, loadReferrerOption);
        if (mCenterList.isEmpty()) { return (NestedReferrerListGateway<WShippingInterrupt>)EMPTY_NREF_LGWAY; }
        return doLoadWShippingInterruptList(mCenterList, loadReferrerOption);
    }

    protected NestedReferrerListGateway<WShippingInterrupt> doLoadWShippingInterruptList(List<MCenter> mCenterList, LoadReferrerOption<WShippingInterruptCB, WShippingInterrupt> option) {
        return helpLoadReferrerInternally(mCenterList, option, "wShippingInterruptList");
    }

    // ===================================================================================
    //                                                                   Pull out Relation
    //                                                                   =================
    /**
     * Pull out the list of foreign table 'BTimeZone'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BTimeZone> pulloutBTimeZone(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bTimeZone"); }

    /**
     * Pull out the list of foreign table 'BCulture'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BCulture> pulloutBCulture(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bCulture"); }

    /**
     * Pull out the list of foreign table 'BClassDtl'.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of foreign table. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<BClassDtl> pulloutBClassDtlByDelFlg(List<MCenter> mCenterList)
    { return helpPulloutInternally(mCenterList, "bClassDtlByDelFlg"); }

    // ===================================================================================
    //                                                                      Extract Column
    //                                                                      ==============
    /**
     * Extract the value list of (single) primary key centerId.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<Long> extractCenterIdList(List<MCenter> mCenterList)
    { return helpExtractListInternally(mCenterList, "centerId"); }

    /**
     * Extract the value list of (single) unique key centerCd.
     * @param mCenterList The list of mCenter. (NotNull, EmptyAllowed)
     * @return The list of the column value. (NotNull, EmptyAllowed, NotNullElement)
     */
    public List<String> extractCenterCdList(List<MCenter> mCenterList)
    { return helpExtractListInternally(mCenterList, "centerCd"); }

    // ===================================================================================
    //                                                                       Entity Update
    //                                                                       =============
    /**
     * Insert the entity modified-only. (DefaultConstraintsEnabled)
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenter.setFoo...(value);
     * mCenter.setBar...(value);
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">insert</span>(mCenter);
     * ... = mCenter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * <p>While, when the entity is created by select, all columns are registered.</p>
     * @param mCenter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insert(MCenter mCenter) {
        doInsert(mCenter, null);
    }

    /**
     * Update the entity modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">update</span>(mCenter);
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void update(MCenter mCenter) {
        doUpdate(mCenter, null);
    }

    /**
     * Update the entity non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * By PK as default, and also you can update by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">updateNonstrict</span>(mCenter);
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void updateNonstrict(MCenter mCenter) {
        doUpdateNonstrict(mCenter, null);
    }

    /**
     * Insert or update the entity modified-only. (DefaultConstraintsEnabled, ExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() } <br>
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdate(MCenter mCenter) {
        doInsertOrUpdate(mCenter, null, null);
    }

    /**
     * Insert or update the entity non-strictly modified-only. (DefaultConstraintsEnabled, NonExclusiveControl) <br>
     * if (the entity has no PK) { insert() } else { update(), but no data, insert() }
     * <p><span style="color: #994747; font-size: 120%">Also you can update by unique keys using entity's uniqueOf().</span></p>
     * @param mCenter The entity of insert or update. (NotNull, ...depends on insert or update)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void insertOrUpdateNonstrict(MCenter mCenter) {
        doInsertOrUpdateNonstrict(mCenter, null, null);
    }

    /**
     * Delete the entity. (ZeroUpdateException, ExclusiveControl) <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #70226C">try</span> {
     *     <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">delete</span>(mCenter);
     * } <span style="color: #70226C">catch</span> (EntityAlreadyUpdatedException e) { <span style="color: #3F7E5E">// if concurrent update</span>
     *     ...
     * }
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void delete(MCenter mCenter) {
        doDelete(mCenter, null);
    }

    /**
     * Delete the entity non-strictly. {ZeroUpdateException, NonExclusiveControl} <br>
     * By PK as default, and also you can delete by unique keys using entity's uniqueOf().
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">deleteNonstrict</span>(mCenter);
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrict(MCenter mCenter) {
        doDeleteNonstrict(mCenter, null);
    }

    /**
     * Delete the entity non-strictly ignoring deleted. {ZeroUpdateException, NonExclusiveControl}
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">deleteNonstrictIgnoreDeleted</span>(mCenter);
     * <span style="color: #3F7E5E">// if the target entity doesn't exist, no exception</span>
     * </pre>
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void deleteNonstrictIgnoreDeleted(MCenter mCenter) {
        doDeleteNonstrictIgnoreDeleted(mCenter, null);
    }

    protected void doDeleteNonstrictIgnoreDeleted(MCenter et, final DeleteOption<MCenterCB> op) {
        assertObjectNotNull("mCenter", et); prepareDeleteOption(op); helpDeleteNonstrictIgnoreDeletedInternally(et, op);
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
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are registered</span>
     *     <span style="color: #3F7E5E">// FOO_PRICE not-called in any entities are registered as null without default value</span>
     *     <span style="color: #3F7E5E">// columns not-called in all entities are registered as null or default value</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchInsert</span>(mCenterList);
     * </pre>
     * <p>While, when the entities are created by select, all columns are registered.</p>
     * <p>And if the table has an identity, entities after the process don't have incremented values.
     * (When you use the (normal) insert(), you can get the incremented value from your entity)</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNullAllowed: when auto-increment)
     * @return The array of inserted count. (NotNull, EmptyAllowed)
     */
    public int[] batchInsert(List<MCenter> mCenterList) {
        return doBatchInsert(mCenterList, null);
    }

    /**
     * Batch-update the entity list modified-only of same-set columns. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 120%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * for (... : ...) {
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList);
     * </pre>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenter> mCenterList) {
        return doBatchUpdate(mCenterList, null);
    }

    /**
     * Batch-update the entity list specified-only. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * mCenterBhv.<span style="color: #CC4747">batchUpdate</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).
     * But if you specify every column, it has no check.</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchUpdate(List<MCenter> mCenterList, SpecifyQuery<MCenterCB> colCBLambda) {
        return doBatchUpdate(mCenterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-update the entity list non-strictly modified-only of same-set columns. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement. <br>
     * <span style="color: #CC4747; font-size: 140%">You should specify same-set columns to all entities like this:</span>
     * <pre>
     * <span style="color: #70226C">for</span> (... : ...) {
     *     MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     *     mCenter.setFooName("foo");
     *     <span style="color: #70226C">if</span> (...) {
     *         mCenter.setFooPrice(123);
     *     } <span style="color: #70226C">else</span> {
     *         mCenter.setFooPrice(null); <span style="color: #3F7E5E">// updated as null</span>
     *         <span style="color: #3F7E5E">//mCenter.setFooDate(...); // *not allowed, fragmented</span>
     *     }
     *     <span style="color: #3F7E5E">// FOO_NAME and FOO_PRICE (and record meta columns) are updated</span>
     *     <span style="color: #3F7E5E">// (others are not updated: their values are kept)</span>
     *     mCenterList.add(mCenter);
     * }
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdate</span>(mCenterList);
     * </pre>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenter> mCenterList) {
        return doBatchUpdateNonstrict(mCenterList, null);
    }

    /**
     * Batch-update the entity list non-strictly specified-only. (NonExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * <pre>
     * <span style="color: #3F7E5E">// e.g. update two columns only</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// the two only updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooStatusCode()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnBarDate()</span>; <span style="color: #3F7E5E">// should be modified in any entities</span>
     * });
     * <span style="color: #3F7E5E">// e.g. update every column in the table</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">batchUpdateNonstrict</span>(mCenterList, <span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// all columns are updated</span>
     *     <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnEveryColumn()</span>; <span style="color: #3F7E5E">// no check of modified properties</span>
     * });
     * </pre>
     * <p>You can specify update columns used on set clause of update statement.
     * However you do not need to specify common columns for update
     * and an optimistic lock column because they are specified implicitly.</p>
     * <p>And you should specify columns that are modified in any entities (at least one entity).</p>
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param colCBLambda The callback for specification of update columns. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchUpdateNonstrict(List<MCenter> mCenterList, SpecifyQuery<MCenterCB> colCBLambda) {
        return doBatchUpdateNonstrict(mCenterList, createSpecifiedUpdateOption(colCBLambda));
    }

    /**
     * Batch-delete the entity list. (ExclusiveControl) <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws BatchEntityAlreadyUpdatedException When the entity has already been updated. This exception extends EntityAlreadyUpdatedException.
     */
    public int[] batchDelete(List<MCenter> mCenterList) {
        return doBatchDelete(mCenterList, null);
    }

    /**
     * Batch-delete the entity list non-strictly. {NonExclusiveControl} <br>
     * This method uses executeBatch() of java.sql.PreparedStatement.
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     */
    public int[] batchDeleteNonstrict(List<MCenter> mCenterList) {
        return doBatchDeleteNonstrict(mCenterList, null);
    }

    // ===================================================================================
    //                                                                        Query Update
    //                                                                        ============
    /**
     * Insert the several entities by query (modified-only for fixed value).
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryInsert</span>(new QueryInsertSetupper&lt;MCenter, MCenterCB&gt;() {
     *     public ConditionBean setup(MCenter entity, MCenterCB intoCB) {
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
    public int queryInsert(QueryInsertSetupper<MCenter, MCenterCB> manyArgLambda) {
        return doQueryInsert(manyArgLambda, null);
    }

    /**
     * Update the several entities by query non-strictly modified-only. (NonExclusiveControl)
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenter.setPK...(value);</span>
     * mCenter.setFoo...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set values of common columns</span>
     * <span style="color: #3F7E5E">//mCenter.setRegisterUser(value);</span>
     * <span style="color: #3F7E5E">//mCenter.set...;</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryUpdate</span>(mCenter, cb);
     * </pre>
     * @param mCenter The entity that contains update values. (NotNull, PrimaryKeyNullAllowed)
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition.
     */
    public int queryUpdate(MCenter mCenter, MCenterCB cb) {
        return doQueryUpdate(mCenter, cb, null);
    }

    /**
     * Delete the several entities by query. (NonExclusiveControl)
     * <pre>
     * MCenterCB cb = new MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">queryDelete</span>(mCenter, cb);
     * </pre>
     * @param cb The condition-bean of MCenter. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition.
     */
    public int queryDelete(MCenterCB cb) {
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
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// if auto-increment, you don't need to set the PK value</span>
     * mCenter.setFoo...(value);
     * mCenter.setBar...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingInsert</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #3F7E5E">// you can insert by your values for common columns</span>
     *     <span style="color: #553000">op</span>.disableCommonColumnAutoSetup();
     * });
     * ... = mCenter.getPK...(); <span style="color: #3F7E5E">// if auto-increment, you can get the value after</span>
     * </pre>
     * @param mCenter The entity of insert. (NotNull, PrimaryKeyNullAllowed: when auto-increment)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsert(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        doInsert(mCenter, createInsertOption(opLambda));
    }

    /**
     * Update the entity with varying requests modified-only. (ZeroUpdateException, ExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as update(entity).
     * <pre>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// if exclusive control, the value of concurrency column is required</span>
     * mCenter.<span style="color: #CC4747">setVersionNo</span>(value);
     * <span style="color: #3F7E5E">// you can update by self calculation values</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingUpdate</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdate(MCenter mCenter, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        doUpdate(mCenter, createUpdateOption(opLambda));
    }

    /**
     * Update the entity with varying requests non-strictly modified-only. (ZeroUpdateException, NonExclusiveControl) <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification), disableCommonColumnAutoSetup(). <br>
     * Other specifications are same as updateNonstrict(entity).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * mCenter.setPK...(value); <span style="color: #3F7E5E">// required</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingUpdateNonstrict</span>(mCenter, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">cb</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">cb</span>.specify().<span style="color: #CC4747">columnXxxCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// XXX_COUNT = XXX_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity of update. (NotNull, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingUpdateNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        doUpdateNonstrict(mCenter, createUpdateOption(opLambda));
    }

    /**
     * Insert or update the entity with varying requests. (ExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdate(entity).
     * @param mCenter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdate(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> insertOpLambda, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> updateOpLambda) {
        doInsertOrUpdate(mCenter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Insert or update the entity with varying requests non-strictly. (NonExclusiveControl: when update) <br>
     * Other specifications are same as insertOrUpdateNonstrict(entity).
     * @param mCenter The entity of insert or update. (NotNull)
     * @param insertOpLambda The callback for option of insert for varying requests. (NotNull)
     * @param updateOpLambda The callback for option of update for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     * @throws EntityAlreadyExistsException When the entity already exists. (unique constraint violation)
     */
    public void varyingInsertOrUpdateNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> insertOpLambda, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> updateOpLambda) {
        doInsertOrUpdateNonstrict(mCenter, createInsertOption(insertOpLambda), createUpdateOption(updateOpLambda));
    }

    /**
     * Delete the entity with varying requests. (ZeroUpdateException, ExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as delete(entity).
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyUpdatedException When the entity has already been updated.
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDelete(MCenter mCenter, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        doDelete(mCenter, createDeleteOption(opLambda));
    }

    /**
     * Delete the entity with varying requests non-strictly. (ZeroUpdateException, NonExclusiveControl) <br>
     * Now a valid option does not exist. <br>
     * Other specifications are same as deleteNonstrict(entity).
     * @param mCenter The entity of delete. (NotNull, PrimaryKeyNotNull, ConcurrencyColumnNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @throws EntityAlreadyDeletedException When the entity has already been deleted. (not found)
     * @throws EntityDuplicatedException When the entity has been duplicated.
     */
    public void varyingDeleteNonstrict(MCenter mCenter, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        doDeleteNonstrict(mCenter, createDeleteOption(opLambda));
    }

    // -----------------------------------------------------
    //                                          Batch Update
    //                                          ------------
    /**
     * Batch-insert the list with varying requests. <br>
     * For example, disableCommonColumnAutoSetup()
     * , disablePrimaryKeyIdentity(), limitBatchInsertLogging(). <br>
     * Other specifications are same as batchInsert(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of insert for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchInsert(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        return doBatchInsert(mCenterList, createInsertOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdate(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdate(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doBatchUpdate(mCenterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-update the list with varying requests non-strictly. <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), limitBatchUpdateLogging(). <br>
     * Other specifications are same as batchUpdateNonstrict(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The array of updated count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchUpdateNonstrict(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doBatchUpdateNonstrict(mCenterList, createUpdateOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDelete(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDelete(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doBatchDelete(mCenterList, createDeleteOption(opLambda));
    }

    /**
     * Batch-delete the list with varying requests non-strictly. <br>
     * For example, limitBatchDeleteLogging(). <br>
     * Other specifications are same as batchDeleteNonstrict(entityList).
     * @param mCenterList The list of the entity. (NotNull, EmptyAllowed, PrimaryKeyNotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The array of deleted count. (NotNull, EmptyAllowed)
     */
    public int[] varyingBatchDeleteNonstrict(List<MCenter> mCenterList, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doBatchDeleteNonstrict(mCenterList, createDeleteOption(opLambda));
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
    public int varyingQueryInsert(QueryInsertSetupper<MCenter, MCenterCB> manyArgLambda, WritableOptionCall<MCenterCB, InsertOption<MCenterCB>> opLambda) {
        return doQueryInsert(manyArgLambda, createInsertOption(opLambda));
    }

    /**
     * Update the several entities by query with varying requests non-strictly modified-only. {NonExclusiveControl} <br>
     * For example, self(selfCalculationSpecification), specify(updateColumnSpecification)
     * , disableCommonColumnAutoSetup(), allowNonQueryUpdate(). <br>
     * Other specifications are same as queryUpdate(entity, cb).
     * <pre>
     * <span style="color: #3F7E5E">// ex) you can update by self calculation values</span>
     * MCenter mCenter = <span style="color: #70226C">new</span> MCenter();
     * <span style="color: #3F7E5E">// you don't need to set PK value</span>
     * <span style="color: #3F7E5E">//mCenter.setPK...(value);</span>
     * mCenter.setOther...(value); <span style="color: #3F7E5E">// you should set only modified columns</span>
     * <span style="color: #3F7E5E">// you don't need to set a value of concurrency column</span>
     * <span style="color: #3F7E5E">// (auto-increment for version number is valid though non-exclusive control)</span>
     * <span style="color: #3F7E5E">//mCenter.setVersionNo(value);</span>
     * MCenterCB cb = <span style="color: #70226C">new</span> MCenterCB();
     * cb.query().setFoo...(value);
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #CC4747">varyingQueryUpdate</span>(mCenter, cb, <span style="color: #553000">op</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">op</span>.self(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.specify().<span style="color: #CC4747">columnFooCount()</span>;
     *     }).plus(1); <span style="color: #3F7E5E">// FOO_COUNT = FOO_COUNT + 1</span>
     * });
     * </pre>
     * @param mCenter The entity that contains update values. (NotNull) {PrimaryKeyNotRequired}
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param opLambda The callback for option of update for varying requests. (NotNull)
     * @return The updated count.
     * @throws NonQueryUpdateNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryUpdate(MCenter mCenter, MCenterCB cb, WritableOptionCall<MCenterCB, UpdateOption<MCenterCB>> opLambda) {
        return doQueryUpdate(mCenter, cb, createUpdateOption(opLambda));
    }

    /**
     * Delete the several entities by query with varying requests non-strictly. <br>
     * For example, allowNonQueryDelete(). <br>
     * Other specifications are same as queryDelete(cb).
     * @param cb The condition-bean of MCenter. (NotNull)
     * @param opLambda The callback for option of delete for varying requests. (NotNull)
     * @return The deleted count.
     * @throws NonQueryDeleteNotAllowedException When the query has no condition (if not allowed).
     */
    public int varyingQueryDelete(MCenterCB cb, WritableOptionCall<MCenterCB, DeleteOption<MCenterCB>> opLambda) {
        return doQueryDelete(cb, createDeleteOption(opLambda));
    }

    // ===================================================================================
    //                                                                          OutsideSql
    //                                                                          ==========
    /**
     * Prepare the all facade executor of outside-SQL to execute it.
     * <pre>
     * <span style="color: #3F7E5E">// main style</span>
     * mCenterBhv.outideSql().selectEntity(pmb); <span style="color: #3F7E5E">// optional</span>
     * mCenterBhv.outideSql().selectList(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterBhv.outideSql().selectPage(pmb); <span style="color: #3F7E5E">// PagingResultBean</span>
     * mCenterBhv.outideSql().selectPagedListOnly(pmb); <span style="color: #3F7E5E">// ListResultBean</span>
     * mCenterBhv.outideSql().selectCursor(pmb, handler); <span style="color: #3F7E5E">// (by handler)</span>
     * mCenterBhv.outideSql().execute(pmb); <span style="color: #3F7E5E">// int (updated count)</span>
     * mCenterBhv.outideSql().call(pmb); <span style="color: #3F7E5E">// void (pmb has OUT parameters)</span>
     *
     * <span style="color: #3F7E5E">// traditional style</span>
     * mCenterBhv.outideSql().traditionalStyle().selectEntity(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectList(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectPage(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectPagedListOnly(path, pmb, entityType);
     * mCenterBhv.outideSql().traditionalStyle().selectCursor(path, pmb, handler);
     * mCenterBhv.outideSql().traditionalStyle().execute(path, pmb);
     *
     * <span style="color: #3F7E5E">// options</span>
     * mCenterBhv.outideSql().removeBlockComment().selectList()
     * mCenterBhv.outideSql().removeLineComment().selectList()
     * mCenterBhv.outideSql().formatSql().selectList()
     * </pre>
     * <p>The invoker of behavior command should be not null when you call this method.</p>
     * @return The new-created all facade executor of outside-SQL. (NotNull)
     */
    public OutsideSqlBasicExecutor<MCenterBhv> outsideSql() {
        OutsideSqlAllFacadeExecutor<MCenterBhv> facadeExecutor = doOutsideSql();
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
    protected Class<? extends MCenter> typeOfSelectedEntity() { return MCenter.class; }
    protected Class<MCenter> typeOfHandlingEntity() { return MCenter.class; }
    protected Class<MCenterCB> typeOfHandlingConditionBean() { return MCenterCB.class; }
}
