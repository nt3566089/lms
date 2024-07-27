package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_customer as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_ID
 *
 * [column]
 *     CUSTOMER_ID, CLIENT_ID, CUSTOMER_CD, CUSTOMER_NM, CUSTOMER_ABBR, ZIP_CD, TEL_NO, ADDRESS1, ADDRESS2, ADDRESS3, VENDOR_FLG, DELIVERY_FLG, ONETIME_FLG, DEPOSIT_FLG, ALLOC_ORDER, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, DELIV_CUSTOMER_ID, ACCOUNT_FLG, CENTER_ID, SALES_ORG_ID, LOT_SPLIT_TYPE_CD, LIMIT_DT_SPLIT_TYPE_CD, PROD_DT_SPLIT_TYPE_CD, LOT_UNMATCH_TYPE_CD, LIMIT_DT_UNMATCH_TYPE_CD, PROD_DT_UNMATCH_TYPE_CD, UNI_CUSTOMER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client, m_customer, m_client_center(ByClientId), m_plant_storage_space(ByCd), b_class_dtl(ByDelFlg), m_carrier_slip_ces(AsOne)
 *
 * [referrer table]
 *     m_carrier_decision, m_center_customer, m_client, m_client_center, m_customer, m_customer_picking, m_deposit_product, m_location, m_location_replenish_product, m_user_deposit, t_alloc_inst_b, t_alloc_inst_h, t_alloc_lot, t_inventory_b, t_inventory_inst, t_keeping_lot, t_last_lot, t_move_inst_b, t_receive_plan_h, t_shipping_inst_b, t_shipping_inst_h, t_stock, t_store_no, t_store_record_h, w_ht_inventory_input_prod, w_ht_receive_no_plan_insp, w_ht_serial_receive_insp, w_ht_serial_shipping_insp, m_carrier_slip_ces
 *
 * [foreign property]
 *     mClient, mCustomerSelf, mClientCenterByClientId, mPlantStorageSpaceByCd, bClassDtlByDelFlg, bClassDtlByDeliveryFlg, bClassDtlByDepositFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotReverseFlg, bClassDtlByOnetimeFlg, bClassDtlByShippingStopFlg, bClassDtlByVendorFlg, mCarrierSlipCesAsOne
 *
 * [referrer property]
 *     mCarrierDecisionList, mCenterCustomerList, mClientList, mClientCenterList, mCustomerSelfList, mCustomerPickingList, mDepositProductList, mLocationList, mLocationReplenishProductList, mUserDepositList, tAllocInstBList, tAllocInstHBySupplyCustomerIdList, tAllocInstHByDelivCustomerIdList, tAllocLotList, tInventoryBByAccountIdList, tInventoryBByDepositIdList, tInventoryBBySupplierIdList, tInventoryInstList, tKeepingLotList, tLastLotList, tMoveInstBByDepositIdList, tMoveInstBBySupplierIdList, tMoveInstBByAccountIdList, tReceivePlanHByPlanSupplierIdList, tReceivePlanHByPlanDepositIdList, tShippingInstBList, tShippingInstHByDelivCustomerIdList, tShippingInstHBySupplyCustomerIdList, tStockList, tStoreNoList, tStoreRecordHBySupplierIdList, tStoreRecordHByDepositIdList, wHtInventoryInputProdList, wHtReceiveNoPlanInspBySupplierIdList, wHtReceiveNoPlanInspByDepositIdList, wHtSerialReceiveInspList, wHtSerialShippingInspList, tShippingInstHByAccoutIdList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCustomer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCustomer> _selectedList;
    protected BehaviorSelector _selector;
    protected MCustomerBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCustomer ready(List<MCustomer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCustomerBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCustomerBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MCarrierDecision> _referrerMCarrierDecisionList;

    /**
     * Load referrer of MCarrierDecisionList by the set-upper of referrer. <br>
     * m_carrier_decision by CUSTOMER_ID, named 'MCarrierDecisionList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionList</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCarrierDecisionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionList(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionList, _selector));
    }

    protected List<MCenterCustomer> _referrerMCenterCustomerList;

    /**
     * Load referrer of MCenterCustomerList by the set-upper of referrer. <br>
     * m_center_customer by CUSTOMER_ID, named 'MCenterCustomerList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMCenterCustomerList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCenterCustomerList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCenterCustomer> loadMCenterCustomerList(ConditionBeanSetupper<MCenterCustomerCB> refCBLambda) {
        myBhv().loadMCenterCustomerList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCenterCustomerList = refLs);
        return hd -> hd.handle(new LoaderOfMCenterCustomer().ready(_referrerMCenterCustomerList, _selector));
    }

    protected List<MClient> _referrerMClientList;

    /**
     * Load referrer of MClientList by the set-upper of referrer. <br>
     * m_client by CUSTOMER_ID, named 'MClientList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClient> loadMClientList(ConditionBeanSetupper<MClientCB> refCBLambda) {
        myBhv().loadMClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientList = refLs);
        return hd -> hd.handle(new LoaderOfMClient().ready(_referrerMClientList, _selector));
    }

    protected List<MClientCenter> _referrerMClientCenterList;

    /**
     * Load referrer of MClientCenterList by the set-upper of referrer. <br>
     * m_client_center by CUSTOMER_ID, named 'MClientCenterList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMClientCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMClientCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMClientCenter> loadMClientCenterList(ConditionBeanSetupper<MClientCenterCB> refCBLambda) {
        myBhv().loadMClientCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMClientCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMClientCenter().ready(_referrerMClientCenterList, _selector));
    }

    protected List<MCustomer> _referrerMCustomerSelfList;

    /**
     * Load referrer of MCustomerSelfList by the set-upper of referrer. <br>
     * m_customer by DELIV_CUSTOMER_ID, named 'MCustomerSelfList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMCustomerSelfList</span>(<span style="color: #553000">customerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">customerCB</span>.setupSelect...
     *         <span style="color: #553000">customerCB</span>.query().set...
     *         <span style="color: #553000">customerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">customerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    customerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCustomerSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomer> loadMCustomerSelfList(ConditionBeanSetupper<MCustomerCB> refCBLambda) {
        myBhv().loadMCustomerSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerSelfList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomer().ready(_referrerMCustomerSelfList, _selector));
    }

    protected List<MCustomerPicking> _referrerMCustomerPickingList;

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by CUSTOMER_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomerPicking> loadMCustomerPickingList(ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        myBhv().loadMCustomerPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerPickingList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomerPicking().ready(_referrerMCustomerPickingList, _selector));
    }

    protected List<MDepositProduct> _referrerMDepositProductList;

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by ACCOUNT_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMDepositProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountId_InScope(pkList);
     * cb.query().addOrderBy_AccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDepositProduct> loadMDepositProductList(ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        myBhv().loadMDepositProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDepositProductList = refLs);
        return hd -> hd.handle(new LoaderOfMDepositProduct().ready(_referrerMDepositProductList, _selector));
    }

    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by REPLENISH_DEPOSIT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishDepositId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishDepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MLocationReplenishProduct> _referrerMLocationReplenishProductList;

    /**
     * Load referrer of MLocationReplenishProductList by the set-upper of referrer. <br>
     * m_location_replenish_product by REPLENISH_DEPOSIT_ID, named 'MLocationReplenishProductList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMLocationReplenishProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMLocationReplenishProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishDepositId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishDepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocationReplenishProduct> loadMLocationReplenishProductList(ConditionBeanSetupper<MLocationReplenishProductCB> refCBLambda) {
        myBhv().loadMLocationReplenishProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationReplenishProductList = refLs);
        return hd -> hd.handle(new LoaderOfMLocationReplenishProduct().ready(_referrerMLocationReplenishProductList, _selector));
    }

    protected List<MUserDeposit> _referrerMUserDepositList;

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * m_user_deposit by CUSTOMER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">depositCB</span>.setupSelect...
     *         <span style="color: #553000">depositCB</span>.query().set...
     *         <span style="color: #553000">depositCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">depositLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    depositLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getMUserDepositList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserDeposit> loadMUserDepositList(ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        myBhv().loadMUserDepositList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserDepositList = refLs);
        return hd -> hd.handle(new LoaderOfMUserDeposit().ready(_referrerMUserDepositList, _selector));
    }

    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * t_alloc_inst_b by DEPOSIT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHBySupplyCustomerIdList;

    /**
     * Load referrer of TAllocInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * t_alloc_inst_h by SUPPLY_CUSTOMER_ID, named 'TAllocInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocInstHBySupplyCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHBySupplyCustomerIdList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHBySupplyCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHBySupplyCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHBySupplyCustomerIdList, _selector));
    }

    protected List<TAllocInstH> _referrerTAllocInstHByDelivCustomerIdList;

    /**
     * Load referrer of TAllocInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * t_alloc_inst_h by DELIV_CUSTOMER_ID, named 'TAllocInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocInstHByDelivCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstH> loadTAllocInstHByDelivCustomerIdList(ConditionBeanSetupper<TAllocInstHCB> refCBLambda) {
        myBhv().loadTAllocInstHByDelivCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstHByDelivCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstH().ready(_referrerTAllocInstHByDelivCustomerIdList, _selector));
    }

    protected List<TAllocLot> _referrerTAllocLotList;

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * t_alloc_lot by CUSTOMER_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocLot> loadTAllocLotList(ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        myBhv().loadTAllocLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocLotList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocLot().ready(_referrerTAllocLotList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBByAccountIdList;

    /**
     * Load referrer of TInventoryBByAccountIdList by the set-upper of referrer. <br>
     * t_inventory_b by ACCOUNT_ID, named 'TInventoryBByAccountIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTInventoryBByAccountIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryBByAccountIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountId_InScope(pkList);
     * cb.query().addOrderBy_AccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBByAccountIdList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBByAccountIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBByAccountIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBByAccountIdList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBByDepositIdList;

    /**
     * Load referrer of TInventoryBByDepositIdList by the set-upper of referrer. <br>
     * t_inventory_b by DEPOSIT_ID, named 'TInventoryBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTInventoryBByDepositIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryBByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBByDepositIdList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBByDepositIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBByDepositIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBByDepositIdList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBBySupplierIdList;

    /**
     * Load referrer of TInventoryBBySupplierIdList by the set-upper of referrer. <br>
     * t_inventory_b by SUPPLIER_ID, named 'TInventoryBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTInventoryBBySupplierIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryBBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBBySupplierIdList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBBySupplierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBBySupplierIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBBySupplierIdList, _selector));
    }

    protected List<TInventoryInst> _referrerTInventoryInstList;

    /**
     * Load referrer of TInventoryInstList by the set-upper of referrer. <br>
     * t_inventory_inst by DEPOSIT_ID, named 'TInventoryInstList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTInventoryInstList</span>(<span style="color: #553000">instCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">instCB</span>.setupSelect...
     *         <span style="color: #553000">instCB</span>.query().set...
     *         <span style="color: #553000">instCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">instLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    instLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTInventoryInstList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryInst> loadTInventoryInstList(ConditionBeanSetupper<TInventoryInstCB> refCBLambda) {
        myBhv().loadTInventoryInstList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryInstList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryInst().ready(_referrerTInventoryInstList, _selector));
    }

    protected List<TKeepingLot> _referrerTKeepingLotList;

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * t_keeping_lot by CUSTOMER_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTKeepingLot> loadTKeepingLotList(ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        myBhv().loadTKeepingLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTKeepingLotList = refLs);
        return hd -> hd.handle(new LoaderOfTKeepingLot().ready(_referrerTKeepingLotList, _selector));
    }

    protected List<TLastLot> _referrerTLastLotList;

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * t_last_lot by CUSTOMER_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLastLot> loadTLastLotList(ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        myBhv().loadTLastLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLastLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLastLot().ready(_referrerTLastLotList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBByDepositIdList;

    /**
     * Load referrer of TMoveInstBByDepositIdList by the set-upper of referrer. <br>
     * t_move_inst_b by DEPOSIT_ID, named 'TMoveInstBByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTMoveInstBByDepositIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTMoveInstBByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBByDepositIdList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBByDepositIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBByDepositIdList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBByDepositIdList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBBySupplierIdList;

    /**
     * Load referrer of TMoveInstBBySupplierIdList by the set-upper of referrer. <br>
     * t_move_inst_b by SUPPLIER_ID, named 'TMoveInstBBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTMoveInstBBySupplierIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTMoveInstBBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBBySupplierIdList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBBySupplierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBBySupplierIdList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBBySupplierIdList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBByAccountIdList;

    /**
     * Load referrer of TMoveInstBByAccountIdList by the set-upper of referrer. <br>
     * t_move_inst_b by ACCOUNT_ID, named 'TMoveInstBByAccountIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTMoveInstBByAccountIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTMoveInstBByAccountIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountId_InScope(pkList);
     * cb.query().addOrderBy_AccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBByAccountIdList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBByAccountIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBByAccountIdList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBByAccountIdList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHByPlanSupplierIdList;

    /**
     * Load referrer of TReceivePlanHByPlanSupplierIdList by the set-upper of referrer. <br>
     * t_receive_plan_h by PLAN_SUPPLIER_ID, named 'TReceivePlanHByPlanSupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanSupplierIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTReceivePlanHByPlanSupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanSupplierId_InScope(pkList);
     * cb.query().addOrderBy_PlanSupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHByPlanSupplierIdList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHByPlanSupplierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHByPlanSupplierIdList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHByPlanSupplierIdList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHByPlanDepositIdList;

    /**
     * Load referrer of TReceivePlanHByPlanDepositIdList by the set-upper of referrer. <br>
     * t_receive_plan_h by PLAN_DEPOSIT_ID, named 'TReceivePlanHByPlanDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTReceivePlanHByPlanDepositIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTReceivePlanHByPlanDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlanDepositId_InScope(pkList);
     * cb.query().addOrderBy_PlanDepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHByPlanDepositIdList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHByPlanDepositIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHByPlanDepositIdList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHByPlanDepositIdList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * t_shipping_inst_b by DEPOSIT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHByDelivCustomerIdList;

    /**
     * Load referrer of TShippingInstHByDelivCustomerIdList by the set-upper of referrer. <br>
     * t_shipping_inst_h by DELIV_CUSTOMER_ID, named 'TShippingInstHByDelivCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTShippingInstHByDelivCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstHByDelivCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivCustomerId_InScope(pkList);
     * cb.query().addOrderBy_DelivCustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHByDelivCustomerIdList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHByDelivCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHByDelivCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHByDelivCustomerIdList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHBySupplyCustomerIdList;

    /**
     * Load referrer of TShippingInstHBySupplyCustomerIdList by the set-upper of referrer. <br>
     * t_shipping_inst_h by SUPPLY_CUSTOMER_ID, named 'TShippingInstHBySupplyCustomerIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTShippingInstHBySupplyCustomerIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstHBySupplyCustomerIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplyCustomerId_InScope(pkList);
     * cb.query().addOrderBy_SupplyCustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHBySupplyCustomerIdList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHBySupplyCustomerIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHBySupplyCustomerIdList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHBySupplyCustomerIdList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by DEPOSIT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TStoreNo> _referrerTStoreNoList;

    /**
     * Load referrer of TStoreNoList by the set-upper of referrer. <br>
     * t_store_no by SUPPLIER_ID, named 'TStoreNoList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTStoreNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreNo> loadTStoreNoList(ConditionBeanSetupper<TStoreNoCB> refCBLambda) {
        myBhv().loadTStoreNoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreNoList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreNo().ready(_referrerTStoreNoList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHBySupplierIdList;

    /**
     * Load referrer of TStoreRecordHBySupplierIdList by the set-upper of referrer. <br>
     * t_store_record_h by SUPPLIER_ID, named 'TStoreRecordHBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTStoreRecordHBySupplierIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreRecordHBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHBySupplierIdList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHBySupplierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHBySupplierIdList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHBySupplierIdList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHByDepositIdList;

    /**
     * Load referrer of TStoreRecordHByDepositIdList by the set-upper of referrer. <br>
     * t_store_record_h by DEPOSIT_ID, named 'TStoreRecordHByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTStoreRecordHByDepositIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTStoreRecordHByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHByDepositIdList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHByDepositIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHByDepositIdList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHByDepositIdList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by CONSIGNMENT_CLS_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setConsignmentClsId_InScope(pkList);
     * cb.query().addOrderBy_ConsignmentClsId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspBySupplierIdList;

    /**
     * Load referrer of WHtReceiveNoPlanInspBySupplierIdList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by SUPPLIER_ID, named 'WHtReceiveNoPlanInspBySupplierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspBySupplierIdList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtReceiveNoPlanInspBySupplierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSupplierId_InScope(pkList);
     * cb.query().addOrderBy_SupplierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspBySupplierIdList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspBySupplierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspBySupplierIdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspBySupplierIdList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspByDepositIdList;

    /**
     * Load referrer of WHtReceiveNoPlanInspByDepositIdList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by DEPOSIT_ID, named 'WHtReceiveNoPlanInspByDepositIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspByDepositIdList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtReceiveNoPlanInspByDepositIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDepositId_InScope(pkList);
     * cb.query().addOrderBy_DepositId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspByDepositIdList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspByDepositIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspByDepositIdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspByDepositIdList, _selector));
    }

    protected List<WHtSerialReceiveInsp> _referrerWHtSerialReceiveInspList;

    /**
     * Load referrer of WHtSerialReceiveInspList by the set-upper of referrer. <br>
     * w_ht_serial_receive_insp by CUSTOMER_ID, named 'WHtSerialReceiveInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadWHtSerialReceiveInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtSerialReceiveInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
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
     * w_ht_serial_shipping_insp by CUSTOMER_ID, named 'WHtSerialShippingInspList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadWHtSerialShippingInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getWHtSerialShippingInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCustomerId_InScope(pkList);
     * cb.query().addOrderBy_CustomerId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtSerialShippingInsp> loadWHtSerialShippingInspList(ConditionBeanSetupper<WHtSerialShippingInspCB> refCBLambda) {
        myBhv().loadWHtSerialShippingInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtSerialShippingInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtSerialShippingInsp().ready(_referrerWHtSerialShippingInspList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHByAccoutIdList;

    /**
     * Load referrer of TShippingInstHByAccoutIdList by the set-upper of referrer. <br>
     * t_shipping_inst_h by ACCOUNT_ID, named 'TShippingInstHByAccoutIdList'.
     * <pre>
     * <span style="color: #0000C0">mCustomerBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCustomerList</span>, <span style="color: #553000">customerLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">customerLoader</span>.<span style="color: #CC4747">loadTShippingInstHByAccoutIdList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCustomer mCustomer : <span style="color: #553000">mCustomerList</span>) {
     *     ... = mCustomer.<span style="color: #CC4747">getTShippingInstHByAccoutIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setAccountId_InScope(pkList);
     * cb.query().addOrderBy_AccountId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHByAccoutIdList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHByAccoutIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHByAccoutIdList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHByAccoutIdList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerSelfLoader;
    public LoaderOfMCustomer pulloutMCustomerSelf() {
        if (_foreignMCustomerSelfLoader == null)
        { _foreignMCustomerSelfLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerSelf(_selectedList), _selector); }
        return _foreignMCustomerSelfLoader;
    }

    protected LoaderOfMClientCenter _foreignMClientCenterByClientIdLoader;
    public LoaderOfMClientCenter pulloutMClientCenterByClientId() {
        if (_foreignMClientCenterByClientIdLoader == null)
        { _foreignMClientCenterByClientIdLoader = new LoaderOfMClientCenter().ready(myBhv().pulloutMClientCenterByClientId(_selectedList), _selector); }
        return _foreignMClientCenterByClientIdLoader;
    }

    protected LoaderOfMPlantStorageSpace _foreignMPlantStorageSpaceByCdLoader;
    public LoaderOfMPlantStorageSpace pulloutMPlantStorageSpaceByCd() {
        if (_foreignMPlantStorageSpaceByCdLoader == null)
        { _foreignMPlantStorageSpaceByCdLoader = new LoaderOfMPlantStorageSpace().ready(myBhv().pulloutMPlantStorageSpaceByCd(_selectedList), _selector); }
        return _foreignMPlantStorageSpaceByCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDeliveryFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDeliveryFlg() {
        if (_foreignBClassDtlByDeliveryFlgLoader == null)
        { _foreignBClassDtlByDeliveryFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDeliveryFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDeliveryFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDepositFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDepositFlg() {
        if (_foreignBClassDtlByDepositFlgLoader == null)
        { _foreignBClassDtlByDepositFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDepositFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDepositFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtReverseFlg() {
        if (_foreignBClassDtlByLimitDtReverseFlgLoader == null)
        { _foreignBClassDtlByLimitDtReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotReverseFlg() {
        if (_foreignBClassDtlByLotReverseFlgLoader == null)
        { _foreignBClassDtlByLotReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByOnetimeFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByOnetimeFlg() {
        if (_foreignBClassDtlByOnetimeFlgLoader == null)
        { _foreignBClassDtlByOnetimeFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByOnetimeFlg(_selectedList), _selector); }
        return _foreignBClassDtlByOnetimeFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingStopFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingStopFlg() {
        if (_foreignBClassDtlByShippingStopFlgLoader == null)
        { _foreignBClassDtlByShippingStopFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingStopFlg(_selectedList), _selector); }
        return _foreignBClassDtlByShippingStopFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByVendorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByVendorFlg() {
        if (_foreignBClassDtlByVendorFlgLoader == null)
        { _foreignBClassDtlByVendorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByVendorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByVendorFlgLoader;
    }

    protected LoaderOfMCarrierSlipCes _foreignMCarrierSlipCesAsOneLoader;
    public LoaderOfMCarrierSlipCes pulloutMCarrierSlipCesAsOne() {
        if (_foreignMCarrierSlipCesAsOneLoader == null)
        { _foreignMCarrierSlipCesAsOneLoader = new LoaderOfMCarrierSlipCes().ready(myBhv().pulloutMCarrierSlipCesAsOne(_selectedList), _selector); }
        return _foreignMCarrierSlipCesAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCustomer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
