package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_client as TABLE. <br>
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
public class LoaderOfMClient {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClient> _selectedList;
    protected BehaviorSelector _selector;
    protected MClientBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClient ready(List<MClient> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClientBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClientBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MClientCenter> _referrerMClientCenterList;

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CLIENT_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCenter> loadMClientCenterList(ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        myBhv().loadMClientCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCenter().ready(_referrerMClientCenterList, _selector));
    }

    protected List<MClientCol> _referrerMClientColList;

    /**
     * Load referrer of MClientColList by the set-upper of referrer. <br>
     * m_client_col by CLIENT_ID, named 'MClientColList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientColList</span>(<span style="color: #553000">colCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">colCB</span>.setupSelect...
     *         <span style="color: #553000">colCB</span>.query().set...
     *         <span style="color: #553000">colCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">colLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    colLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientColList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCol> loadMClientColList(ConditionBeanSetupper<MClientColCB> refCBLambda) {
        myBhv().loadMClientColList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientColList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCol().ready(_referrerMClientColList, _selector));
    }

    protected List<MClientItem> _referrerMClientItemList;

    /**
     * Load referrer of MClientItemList by the set-upper of referrer. <br>
     * m_client_item by CLIENT_ID, named 'MClientItemList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientItemList</span>(<span style="color: #553000">itemCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">itemCB</span>.setupSelect...
     *         <span style="color: #553000">itemCB</span>.query().set...
     *         <span style="color: #553000">itemCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">itemLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    itemLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientItemList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientItem> loadMClientItemList(ConditionBeanSetupper<MClientItemCB> refCBLambda) {
        myBhv().loadMClientItemList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientItemList = refLs);
        return hd -> hd.handle(new LoaderOfMClientItem().ready(_referrerMClientItemList, _selector));
    }

    protected List<MClientScreen> _referrerMClientScreenList;

    /**
     * Load referrer of MClientScreenList by the set-upper of referrer. <br>
     * m_client_screen by CLIENT_ID, named 'MClientScreenList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMClientScreenList</span>(<span style="color: #553000">screenCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">screenCB</span>.setupSelect...
     *         <span style="color: #553000">screenCB</span>.query().set...
     *         <span style="color: #553000">screenCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">screenLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    screenLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMClientScreenList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientScreen> loadMClientScreenList(ConditionBeanSetupper<MClientScreenCB> refCBLambda) {
        myBhv().loadMClientScreenList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientScreenList = refLs);
        return hd -> hd.handle(new LoaderOfMClientScreen().ready(_referrerMClientScreenList, _selector));
    }

    protected List<MCustomer> _referrerMCustomerList;

    /**
     * Load referrer of MCustomerList by the set-upper of referrer. <br>
     * m_customer by CLIENT_ID, named 'MCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomer> loadMCustomerList(ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        myBhv().loadMCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomer().ready(_referrerMCustomerList, _selector));
    }

    protected List<MImportType> _referrerMImportTypeList;

    /**
     * Load referrer of MImportTypeList by the set-upper of referrer. <br>
     * m_import_type by CLIENT_ID, named 'MImportTypeList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMImportTypeList</span>(<span style="color: #553000">typeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">typeCB</span>.setupSelect...
     *         <span style="color: #553000">typeCB</span>.query().set...
     *         <span style="color: #553000">typeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">typeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    typeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMImportTypeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMImportType> loadMImportTypeList(ConditionBeanSetupper<MImportTypeCB> refCBLambda) {
        myBhv().loadMImportTypeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMImportTypeList = refLs);
        return hd -> hd.handle(new LoaderOfMImportType().ready(_referrerMImportTypeList, _selector));
    }

    protected List<MProduct> _referrerMProductList;

    /**
     * Load referrer of MProductList by the set-upper of referrer. <br>
     * m_product by CLIENT_ID, named 'MProductList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProduct> loadMProductList(ConditionBeanSetupper<MProductCB> refCBLambda) {
        myBhv().loadMProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductList = refLs);
        return hd -> hd.handle(new LoaderOfMProduct().ready(_referrerMProductList, _selector));
    }

    protected List<MShapeGrp> _referrerMShapeGrpList;

    /**
     * Load referrer of MShapeGrpList by the set-upper of referrer. <br>
     * m_shape_grp by CLIENT_ID, named 'MShapeGrpList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMShapeGrpList</span>(<span style="color: #553000">grpCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">grpCB</span>.setupSelect...
     *         <span style="color: #553000">grpCB</span>.query().set...
     *         <span style="color: #553000">grpCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">grpLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    grpLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMShapeGrpList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMShapeGrp> loadMShapeGrpList(ConditionBeanSetupper<MShapeGrpCB> refCBLambda) {
        myBhv().loadMShapeGrpList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMShapeGrpList = refLs);
        return hd -> hd.handle(new LoaderOfMShapeGrp().ready(_referrerMShapeGrpList, _selector));
    }

    protected List<MUserClient> _referrerMUserClientList;

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * m_user_client by CLIENT_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserClient> loadMUserClientList(ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        myBhv().loadMUserClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserClientList = refLs);
        return hd -> hd.handle(new LoaderOfMUserClient().ready(_referrerMUserClientList, _selector));
    }

    protected List<MUserLogin> _referrerMUserLoginList;

    /**
     * Load referrer of MUserLoginList by the set-upper of referrer. <br>
     * m_user_login by CLIENT_ID, named 'MUserLoginList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMUserLoginList</span>(<span style="color: #553000">loginCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loginCB</span>.setupSelect...
     *         <span style="color: #553000">loginCB</span>.query().set...
     *         <span style="color: #553000">loginCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loginLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loginLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMUserLoginList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserLogin> loadMUserLoginList(ConditionBeanSetupper<MUserLoginCB> refCBLambda) {
        myBhv().loadMUserLoginList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserLoginList = refLs);
        return hd -> hd.handle(new LoaderOfMUserLogin().ready(_referrerMUserLoginList, _selector));
    }

    protected List<MWebHtInfo> _referrerMWebHtInfoList;

    /**
     * Load referrer of MWebHtInfoList by the set-upper of referrer. <br>
     * m_web_ht_info by CLIENT_ID, named 'MWebHtInfoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadMWebHtInfoList</span>(<span style="color: #553000">infoCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">infoCB</span>.setupSelect...
     *         <span style="color: #553000">infoCB</span>.query().set...
     *         <span style="color: #553000">infoCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">infoLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    infoLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getMWebHtInfoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_alloc_inst_h by CLIENT_ID, named 'TAllocInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTAllocInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTAllocInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_ec_order_h by CLIENT_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_inventory_h by CLIENT_ID, named 'TInventoryHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTInventoryHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTInventoryHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_move_inst_h by CLIENT_ID, named 'TMoveInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTMoveInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTMoveInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_packing_h by CLIENT_ID, named 'TPackingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPackingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPackingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHList, _selector));
    }

    protected List<TPackingList> _referrerTPackingListList;

    /**
     * Load referrer of TPackingListList by the set-upper of referrer. <br>
     * t_packing_list by CLIENT_ID, named 'TPackingListList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPackingListList</span>(<span style="color: #553000">listCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">listCB</span>.setupSelect...
     *         <span style="color: #553000">listCB</span>.query().set...
     *         <span style="color: #553000">listCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">listLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    listLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPackingListList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingList> loadTPackingListList(ConditionBeanSetupper<TPackingListCB> refCBLambda) {
        myBhv().loadTPackingListList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingListList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingList().ready(_referrerTPackingListList, _selector));
    }

    protected List<TPicMthdRcmd> _referrerTPicMthdRcmdList;

    /**
     * Load referrer of TPicMthdRcmdList by the set-upper of referrer. <br>
     * t_pic_mthd_rcmd by CLIENT_ID, named 'TPicMthdRcmdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPicMthdRcmdList</span>(<span style="color: #553000">rcmdCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rcmdCB</span>.setupSelect...
     *         <span style="color: #553000">rcmdCB</span>.query().set...
     *         <span style="color: #553000">rcmdCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rcmdLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rcmdLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPicMthdRcmdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_picking_h by CLIENT_ID, named 'TPickingHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTPickingHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTPickingHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_receive_plan_h by CLIENT_ID, named 'TReceivePlanHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTReceivePlanHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTReceivePlanHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_serial_no by CLIENT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * t_shipping_inst_h by CLIENT_ID, named 'TShippingInstHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTShippingInstHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTShippingInstHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHList, _selector));
    }

    protected List<TShippingRecordH> _referrerTShippingRecordHList;

    /**
     * Load referrer of TShippingRecordHList by the set-upper of referrer. <br>
     * t_shipping_record_h by CLIENT_ID, named 'TShippingRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTShippingRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTShippingRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingRecordH> loadTShippingRecordHList(ConditionBeanSetupper<TShippingRecordHCB> refCBLambda) {
        myBhv().loadTShippingRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingRecordH().ready(_referrerTShippingRecordHList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by CLIENT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TStockRecord> _referrerTStockRecordList;

    /**
     * Load referrer of TStockRecordList by the set-upper of referrer. <br>
     * t_stock_record by CLIENT_ID, named 'TStockRecordList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTStockRecordList</span>(<span style="color: #553000">recordCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">recordCB</span>.setupSelect...
     *         <span style="color: #553000">recordCB</span>.query().set...
     *         <span style="color: #553000">recordCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">recordLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    recordLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStockRecordList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockRecord> loadTStockRecordList(ConditionBeanSetupper<TStockRecordCB> refCBLambda) {
        myBhv().loadTStockRecordList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockRecordList = refLs);
        return hd -> hd.handle(new LoaderOfTStockRecord().ready(_referrerTStockRecordList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by CLIENT_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHList, _selector));
    }

    protected List<TTransfer> _referrerTTransferList;

    /**
     * Load referrer of TTransferList by the set-upper of referrer. <br>
     * t_transfer by CLIENT_ID, named 'TTransferList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadTTransferList</span>(<span style="color: #553000">transferCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">transferCB</span>.setupSelect...
     *         <span style="color: #553000">transferCB</span>.query().set...
     *         <span style="color: #553000">transferCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">transferLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    transferLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getTTransferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTTransfer> loadTTransferList(ConditionBeanSetupper<TTransferCB> refCBLambda) {
        myBhv().loadTTransferList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTTransferList = refLs);
        return hd -> hd.handle(new LoaderOfTTransfer().ready(_referrerTTransferList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CLIENT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_loading by CLIENT_ID, named 'WHtLoadingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtLoadingList</span>(<span style="color: #553000">loadingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">loadingCB</span>.setupSelect...
     *         <span style="color: #553000">loadingCB</span>.query().set...
     *         <span style="color: #553000">loadingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">loadingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    loadingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtLoadingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_picking by CLIENT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_receive_inspection by CLIENT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_receive_no_plan_insp by CLIENT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_receive_store by CLIENT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_serial_receive_insp by CLIENT_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_serial_shipping_insp by CLIENT_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_shipping by CLIENT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_shipping_picking by CLIENT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_ht_total_picking by CLIENT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_sgl_row_ship_insp_h by CLIENT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
     * w_shipping_interrupt by CLIENT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mClientBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mClientList</span>, <span style="color: #553000">clientLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">clientLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MClient mClient : <span style="color: #553000">mClientList</span>) {
     *     ... = mClient.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setClientId_InScope(pkList);
     * cb.query().addOrderBy_ClientId_Asc();
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
    protected LoaderOfMShapeGrp _foreignMShapeGrpLoader;
    public LoaderOfMShapeGrp pulloutMShapeGrp() {
        if (_foreignMShapeGrpLoader == null)
        { _foreignMShapeGrpLoader = new LoaderOfMShapeGrp().ready(myBhv().pulloutMShapeGrp(_selectedList), _selector); }
        return _foreignMShapeGrpLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
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
    public List<MClient> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
