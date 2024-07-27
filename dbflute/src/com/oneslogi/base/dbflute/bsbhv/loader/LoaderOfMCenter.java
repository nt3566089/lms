package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_center as TABLE. <br>
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
public class LoaderOfMCenter {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCenter> _selectedList;
    protected BehaviorSelector _selector;
    protected MCenterBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCenter ready(List<MCenter> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCenterBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCenterBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HLocationAttribute> _referrerHLocationAttributeList;

    /**
     * Load referrer of HLocationAttributeList by the set-upper of referrer. <br>
     * h_location_attribute by CENTER_ID, named 'HLocationAttributeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadHLocationAttributeList</span>(<span style="color: #553000">attributeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">attributeCB</span>.setupSelect...
     *         <span style="color: #553000">attributeCB</span>.query().set...
     *         <span style="color: #553000">attributeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">attributeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    attributeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getHLocationAttributeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHLocationAttribute> loadHLocationAttributeList(ConditionBeanSetupper<HLocationAttributeCB> refCBLambda) {
        myBhv().loadHLocationAttributeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHLocationAttributeList = refLs);
        return hd -> hd.handle(new LoaderOfHLocationAttribute().ready(_referrerHLocationAttributeList, _selector));
    }

    protected List<MBox> _referrerMBoxList;

    /**
     * Load referrer of MBoxList by the set-upper of referrer. <br>
     * m_box by CENTER_ID, named 'MBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMBoxList</span>(<span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">boxCB</span>.setupSelect...
     *         <span style="color: #553000">boxCB</span>.query().set...
     *         <span style="color: #553000">boxCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">boxLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    boxLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBox> loadMBoxList(ConditionBeanSetupper<MBoxCB> refCBLambda) {
        myBhv().loadMBoxList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxList = refLs);
        return hd -> hd.handle(new LoaderOfMBox().ready(_referrerMBoxList, _selector));
    }

    protected List<MBoxGrp> _referrerMBoxGrpList;

    /**
     * Load referrer of MBoxGrpList by the set-upper of referrer. <br>
     * m_box_grp by CENTER_ID, named 'MBoxGrpList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMBoxGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMBoxGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBoxGrp> loadMBoxGrpList(ConditionBeanSetupper<MBoxGrpCB> refCBLambda) {
        myBhv().loadMBoxGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBoxGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMBoxGrp().ready(_referrerMBoxGrpList, _selector));
    }

    protected List<MCarrier> _referrerMCarrierList;

    /**
     * Load referrer of MCarrierList by the set-upper of referrer. <br>
     * m_carrier by CENTER_ID, named 'MCarrierList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierList</span>(<span style="color: #553000">carrierCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">carrierCB</span>.setupSelect...
     *         <span style="color: #553000">carrierCB</span>.query().set...
     *         <span style="color: #553000">carrierCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">carrierLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    carrierLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrier> loadMCarrierList(ConditionBeanSetupper<MCarrierCB> refCBLambda) {
        myBhv().loadMCarrierList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrier().ready(_referrerMCarrierList, _selector));
    }

    protected List<MCarrierSlipSgw> _referrerMCarrierSlipSgwList;

    /**
     * Load referrer of MCarrierSlipSgwList by the set-upper of referrer. <br>
     * m_carrier_slip_sgw by CENTER_ID, named 'MCarrierSlipSgwList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipSgwList</span>(<span style="color: #553000">sgwCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">sgwCB</span>.setupSelect...
     *         <span style="color: #553000">sgwCB</span>.query().set...
     *         <span style="color: #553000">sgwCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">sgwLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    sgwLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipSgwList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipSgw> loadMCarrierSlipSgwList(ConditionBeanSetupper<MCarrierSlipSgwCB> refCBLambda) {
        myBhv().loadMCarrierSlipSgwList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipSgwList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipSgw().ready(_referrerMCarrierSlipSgwList, _selector));
    }

    protected List<MCarrierSlipYmt> _referrerMCarrierSlipYmtList;

    /**
     * Load referrer of MCarrierSlipYmtList by the set-upper of referrer. <br>
     * m_carrier_slip_ymt by CENTER_ID, named 'MCarrierSlipYmtList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipYmtList</span>(<span style="color: #553000">ymtCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">ymtCB</span>.setupSelect...
     *         <span style="color: #553000">ymtCB</span>.query().set...
     *         <span style="color: #553000">ymtCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">ymtLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    ymtLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYmtList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipYmt> loadMCarrierSlipYmtList(ConditionBeanSetupper<MCarrierSlipYmtCB> refCBLambda) {
        myBhv().loadMCarrierSlipYmtList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipYmtList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipYmt().ready(_referrerMCarrierSlipYmtList, _selector));
    }

    protected List<MCarrierSlipYupk> _referrerMCarrierSlipYupkList;

    /**
     * Load referrer of MCarrierSlipYupkList by the set-upper of referrer. <br>
     * m_carrier_slip_yupk by CENTER_ID, named 'MCarrierSlipYupkList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCarrierSlipYupkList</span>(<span style="color: #553000">yupkCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">yupkCB</span>.setupSelect...
     *         <span style="color: #553000">yupkCB</span>.query().set...
     *         <span style="color: #553000">yupkCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">yupkLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    yupkLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCarrierSlipYupkList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierSlipYupk> loadMCarrierSlipYupkList(ConditionBeanSetupper<MCarrierSlipYupkCB> refCBLambda) {
        myBhv().loadMCarrierSlipYupkList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierSlipYupkList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierSlipYupk().ready(_referrerMCarrierSlipYupkList, _selector));
    }

    protected List<MCenterClass> _referrerMCenterClassList;

    /**
     * Load referrer of MCenterClassList by the set-upper of referrer. <br>
     * m_center_class by CENTER_ID, named 'MCenterClassList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterClassList</span>(<span style="color: #553000">classCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">classCB</span>.setupSelect...
     *         <span style="color: #553000">classCB</span>.query().set...
     *         <span style="color: #553000">classCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">classLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    classLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterClassList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterClass> loadMCenterClassList(ConditionBeanSetupper<MCenterClassCB> refCBLambda) {
        myBhv().loadMCenterClassList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterClassList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterClass().ready(_referrerMCenterClassList, _selector));
    }

    protected List<MCenterCol> _referrerMCenterColList;

    /**
     * Load referrer of MCenterColList by the set-upper of referrer. <br>
     * m_center_col by CENTER_ID, named 'MCenterColList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCol> loadMCenterColList(ConditionBeanSetupper<MCenterColCB> refCBLambda) {
        myBhv().loadMCenterColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterColList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCol().ready(_referrerMCenterColList, _selector));
    }

    protected List<MCenterCustomer> _referrerMCenterCustomerList;

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * m_center_customer by CENTER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCustomer> loadMCenterCustomerList(ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        myBhv().loadMCenterCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCustomer().ready(_referrerMCenterCustomerList, _selector));
    }

    protected List<MCenterItem> _referrerMCenterItemList;

    /**
     * Load referrer of MCenterItemList by the set-upper of referrer. <br>
     * m_center_item by CENTER_ID, named 'MCenterItemList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterItem> loadMCenterItemList(ConditionBeanSetupper<MCenterItemCB> refCBLambda) {
        myBhv().loadMCenterItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterItemList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterItem().ready(_referrerMCenterItemList, _selector));
    }

    protected List<MCenterScreen> _referrerMCenterScreenList;

    /**
     * Load referrer of MCenterScreenList by the set-upper of referrer. <br>
     * m_center_screen by CENTER_ID, named 'MCenterScreenList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCenterScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCenterScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterScreen> loadMCenterScreenList(ConditionBeanSetupper<MCenterScreenCB> refCBLambda) {
        myBhv().loadMCenterScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterScreen().ready(_referrerMCenterScreenList, _selector));
    }

    protected List<MClientCenter> _referrerMClientCenterList;

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CENTER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCenter> loadMClientCenterList(ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        myBhv().loadMClientCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCenter().ready(_referrerMClientCenterList, _selector));
    }

    protected List<MCustomerPicking> _referrerMCustomerPickingList;

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by CENTER_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomerPicking> loadMCustomerPickingList(ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        myBhv().loadMCustomerPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerPickingList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomerPicking().ready(_referrerMCustomerPickingList, _selector));
    }

    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * m_delivery_course by CENTER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDeliveryCourse> loadMDeliveryCourseList(ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        myBhv().loadMDeliveryCourseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDeliveryCourseList = refLs);
        return hd -> hd.handle(new LoaderOfMDeliveryCourse().ready(_referrerMDeliveryCourseList, _selector));
    }

    protected List<MGeneral> _referrerMGeneralList;

    /**
     * Load referrer of MGeneralList by the set-upper of referrer. <br>
     * m_general by CENTER_ID, named 'MGeneralList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMGeneralList</span>(<span style="color: #553000">generalCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">generalCB</span>.setupSelect...
     *         <span style="color: #553000">generalCB</span>.query().set...
     *         <span style="color: #553000">generalCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">generalLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    generalLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMGeneralList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMGeneral> loadMGeneralList(ConditionBeanSetupper<MGeneralCB> refCBLambda) {
        myBhv().loadMGeneralList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMGeneralList = refLs);
        return hd -> hd.handle(new LoaderOfMGeneral().ready(_referrerMGeneralList, _selector));
    }

    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by CENTER_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MNizoroe> _referrerMNizoroeList;

    /**
     * Load referrer of MNizoroeList by the set-upper of referrer. <br>
     * m_nizoroe by CENTER_ID, named 'MNizoroeList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMNizoroeList</span>(<span style="color: #553000">nizoroeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">nizoroeCB</span>.setupSelect...
     *         <span style="color: #553000">nizoroeCB</span>.query().set...
     *         <span style="color: #553000">nizoroeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">nizoroeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    nizoroeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNizoroeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMNizoroe> loadMNizoroeList(ConditionBeanSetupper<MNizoroeCB> refCBLambda) {
        myBhv().loadMNizoroeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMNizoroeList = refLs);
        return hd -> hd.handle(new LoaderOfMNizoroe().ready(_referrerMNizoroeList, _selector));
    }

    protected List<MNumberingCenter> _referrerMNumberingCenterList;

    /**
     * Load referrer of MNumberingCenterList by the set-upper of referrer. <br>
     * m_numbering_center by CENTER_ID, named 'MNumberingCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMNumberingCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMNumberingCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMNumberingCenter> loadMNumberingCenterList(ConditionBeanSetupper<MNumberingCenterCB> refCBLambda) {
        myBhv().loadMNumberingCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMNumberingCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMNumberingCenter().ready(_referrerMNumberingCenterList, _selector));
    }

    protected List<MUserCenter> _referrerMUserCenterList;

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * m_user_center by CENTER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserCenter> loadMUserCenterList(ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        myBhv().loadMUserCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMUserCenter().ready(_referrerMUserCenterList, _selector));
    }

    protected List<MUserLogin> _referrerMUserLoginList;

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CENTER_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserLogin> loadMUserLoginList(ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        myBhv().loadMUserLoginList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserLoginList = refLs);
        return hd -> hd.handle(new LoaderOfMUserLogin().ready(_referrerMUserLoginList, _selector));
    }

    protected List<MWarehouse> _referrerMWarehouseList;

    /**
     * Load referrer of MWarehouseList by the set-upper of referrer. <br>
     * m_warehouse by CENTER_ID, named 'MWarehouseList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMWarehouseList</span>(<span style="color: #553000">warehouseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">warehouseCB</span>.setupSelect...
     *         <span style="color: #553000">warehouseCB</span>.query().set...
     *         <span style="color: #553000">warehouseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">warehouseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    warehouseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWarehouseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWarehouse> loadMWarehouseList(ConditionBeanSetupper<MWarehouseCB> refCBLambda) {
        myBhv().loadMWarehouseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWarehouseList = refLs);
        return hd -> hd.handle(new LoaderOfMWarehouse().ready(_referrerMWarehouseList, _selector));
    }

    protected List<MWebHtInfo> _referrerMWebHtInfoList;

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CENTER_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMWebHtInfo> loadMWebHtInfoList(ConditionBeanSetupper<MWebHtInfoCB> refCBLambda) {
        myBhv().loadMWebHtInfoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMWebHtInfoList = refLs);
        return hd -> hd.handle(new LoaderOfMWebHtInfo().ready(_referrerMWebHtInfoList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHList;

    /**
     * Load referrer of TAllocInstHList by the set-upper of referrer. <br>
     * t_alloc_inst_h by CENTER_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHList, _selector));
    }

    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by CENTER_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderH> loadTEcOrderHList(ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        myBhv().loadTEcOrderHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderHList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderH().ready(_referrerTEcOrderHList, _selector));
    }

    protected List<TInventoryH> _referrerTInventoryHList;

    /**
     * Load referrer of TInventoryHList by the set-upper of referrer. <br>
     * t_inventory_h by CENTER_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryH> loadTInventoryHList(ConditionBeanSetupper<TInventoryHCB> refCBLambda) {
        myBhv().loadTInventoryHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryHList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryH().ready(_referrerTInventoryHList, _selector));
    }

    protected List<TMoveInstH> _referrerTMoveInstHList;

    /**
     * Load referrer of TMoveInstHList by the set-upper of referrer. <br>
     * t_move_inst_h by CENTER_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstH> loadTMoveInstHList(ConditionBeanSetupper<TMoveInstHCB> refCBLambda) {
        myBhv().loadTMoveInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstH().ready(_referrerTMoveInstHList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHList;

    /**
     * Load referrer of TPackingHList by the set-upper of referrer. <br>
     * t_packing_h by CENTER_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<TPicMthdRcmd> _referrerTPicMthdRcmdList;

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CENTER_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rcmdCB</span>.setupSelect...
     *         <span style="color: #553000">rcmdCB</span>.query().set...
     *         <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rcmdLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rcmdLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPicMthdRcmd> loadTPicMthdRcmdList(ConditionBeanSetupper<TPicMthdRcmdCB> refCBLambda) {
        myBhv().loadTPicMthdRcmdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPicMthdRcmdList = refLs);
        return hd -> hd.handle(new LoaderOfTPicMthdRcmd().ready(_referrerTPicMthdRcmdList, _selector));
    }

    protected List<TPickingH> _referrerTPickingHList;

    /**
     * Load referrer of TPickingHList by the set-upper of referrer. <br>
     * t_picking_h by CENTER_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingH> loadTPickingHList(ConditionBeanSetupper<TPickingHCB> refCBLambda) {
        myBhv().loadTPickingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingH().ready(_referrerTPickingHList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHList;

    /**
     * Load referrer of TReceivePlanHList by the set-upper of referrer. <br>
     * t_receive_plan_h by CENTER_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHList, _selector));
    }

    protected List<TSerialNo> _referrerTSerialNoList;

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by CENTER_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSerialNo> loadTSerialNoList(ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        myBhv().loadTSerialNoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSerialNoList = refLs);
        return hd -> hd.handle(new LoaderOfTSerialNo().ready(_referrerTSerialNoList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHList;

    /**
     * Load referrer of TShippingInstHList by the set-upper of referrer. <br>
     * t_shipping_inst_h by CENTER_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CENTER_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CENTER_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtLoading> _referrerWHtLoadingList;

    /**
     * Load referrer of WHtLoadingList by the set-upper of referrer. <br>
     * w_ht_loading by CENTER_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loadingCB</span>.setupSelect...
     *         <span style="color: #553000">loadingCB</span>.query().set...
     *         <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loadingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loadingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtLoading> loadWHtLoadingList(ConditionBeanSetupper<WHtLoadingCB> refCBLambda) {
        myBhv().loadWHtLoadingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtLoadingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtLoading().ready(_referrerWHtLoadingList, _selector));
    }

    protected List<WHtPicking> _referrerWHtPickingList;

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by CENTER_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtPicking> loadWHtPickingList(ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        myBhv().loadWHtPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtPicking().ready(_referrerWHtPickingList, _selector));
    }

    protected List<WHtReceiveInspection> _referrerWHtReceiveInspectionList;

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by CENTER_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveInspection> loadWHtReceiveInspectionList(ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        myBhv().loadWHtReceiveInspectionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveInspectionList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveInspection().ready(_referrerWHtReceiveInspectionList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspList;

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by CENTER_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspList, _selector));
    }

    protected List<WHtReceiveStore> _referrerWHtReceiveStoreList;

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by CENTER_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    protected List<WHtSerialReceiveInsp> _referrerWHtSerialReceiveInspList;

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CENTER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtSerialReceiveInsp> loadWHtSerialReceiveInspList(ConditionBeanSetupper<WHtSerialReceiveInspCB> refCBLambda) {
        myBhv().loadWHtSerialReceiveInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtSerialReceiveInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtSerialReceiveInsp().ready(_referrerWHtSerialReceiveInspList, _selector));
    }

    protected List<WHtSerialShippingInsp> _referrerWHtSerialShippingInspList;

    /**
     * Load referrer of WHtSerialShippingInspList by the set-upper of referrer. <br>
     * w_ht_serial_shipping_insp by CENTER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtSerialShippingInsp> loadWHtSerialShippingInspList(ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        myBhv().loadWHtSerialShippingInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtSerialShippingInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtSerialShippingInsp().ready(_referrerWHtSerialShippingInspList, _selector));
    }

    protected List<WHtShipping> _referrerWHtShippingList;

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by CENTER_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShipping> loadWHtShippingList(ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        myBhv().loadWHtShippingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShipping().ready(_referrerWHtShippingList, _selector));
    }

    protected List<WHtShippingPicking> _referrerWHtShippingPickingList;

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by CENTER_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShippingPicking> loadWHtShippingPickingList(ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        myBhv().loadWHtShippingPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShippingPicking().ready(_referrerWHtShippingPickingList, _selector));
    }

    protected List<WHtTotalPicking> _referrerWHtTotalPickingList;

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by CENTER_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtTotalPicking> loadWHtTotalPickingList(ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        myBhv().loadWHtTotalPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtTotalPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtTotalPicking().ready(_referrerWHtTotalPickingList, _selector));
    }

    protected List<WSglRowShipInspH> _referrerWSglRowShipInspHList;

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by CENTER_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspH> loadWSglRowShipInspHList(ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        myBhv().loadWSglRowShipInspHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspHList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspH().ready(_referrerWSglRowShipInspHList, _selector));
    }

    protected List<WShippingInterrupt> _referrerWShippingInterruptList;

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by CENTER_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mCenterBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCenterList</span>, <span style="color: #553000">centerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">centerLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCenter mCenter : <span style="color: #553000">mCenterList</span>) {
     *     ... = mCenter.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCenterId_InScope(pkList);
     * cb.query().addOrderBy_CenterId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWShippingInterrupt> loadWShippingInterruptList(ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        myBhv().loadWShippingInterruptList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWShippingInterruptList = refLs);
        return hd -> hd.handle(new LoaderOfWShippingInterrupt().ready(_referrerWShippingInterruptList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBTimeZone _foreignBTimeZoneLoader;
    public LoaderOfBTimeZone pulloutBTimeZone() {
        if (_foreignBTimeZoneLoader == null)
        { _foreignBTimeZoneLoader = new LoaderOfBTimeZone().ready(myBhv().pulloutBTimeZone(_selectedList), _selector); }
        return _foreignBTimeZoneLoader;
    }

    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCenter> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
