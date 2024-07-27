package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_receive_plan_h as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_H_ID
 *
 * [column]
 *     RECEIVE_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, STOCK_TYPE_ID, RECEIVE_PLAN_DT, PLAN_CLIENT_RECEIVE_NO, RECEIVE_SLIP_NO, PLAN_SUPPLIER_ID, PLAN_SUPPLIER_CD, PLAN_DEPOSIT_ID, PLAN_DEPOSIT_CD, RECEIVE_STATUS, INPUT_TYPE, RECEIVE_DELIVERY_STATUS, OLD_RECEIVE_PLAN_H_ID, ERROR_FLG, ERROR_MESSAGE_CD, CENTER_TRANSIT_FLG, PICKING_H_ID, SAP_RECEIVE_SLIP_NO, SLIP_TYPE_ID, SLIP_TYPE_CD, PURCHASE_ORDER_NO, RECEIVE_REASON_CD, ORDER_DATE, ORDER_TIME, CONFIRMED_DELIVERY_DT, PLANT_CD, STORAGE_SPACE_CD, TENHANSHA_CD, SALES_ORG_ID, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, CUSTOMER_ORDER_NO, SAP_VENDER_CD, SAP_SUPPLIER_CD, TODAY_FLG, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, SANSHA_TYPE_CD, RECEIVE_REASON_NM, MOD_TYPE_CD, IF_ID, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_customer, m_client, m_process_type, t_picking_h, t_receive_plan_h, m_stock_type, b_class_dtl(ByCenterTransitFlg), t_receive_plan_r(AsOne)
 *
 * [referrer table]
 *     t_receive_plan_b, t_receive_plan_h, t_store_record_h, t_receive_plan_r
 *
 * [foreign property]
 *     mCenter, mCustomerByPlanSupplierId, mClient, mProcessType, tPickingH, tReceivePlanHSelf, mStockType, mCustomerByPlanDepositId, bClassDtlByCenterTransitFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByReceiveDeliveryStatus, bClassDtlByReceiveStatus, tReceivePlanRAsOne
 *
 * [referrer property]
 *     tReceivePlanBList, tReceivePlanHSelfList, tStoreRecordHList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanH> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanH ready(List<TReceivePlanH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReceivePlanB> _referrerTReceivePlanBList;

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * t_receive_plan_b by RECEIVE_PLAN_H_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanB> loadTReceivePlanBList(ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        myBhv().loadTReceivePlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanB().ready(_referrerTReceivePlanBList, _selector));
    }

    protected List<TReceivePlanH> _referrerTReceivePlanHSelfList;

    /**
     * Load referrer of TReceivePlanHSelfList by the set-upper of referrer. <br>
     * t_receive_plan_h by OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelfList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTReceivePlanHSelfList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTReceivePlanHSelfList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOldReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_OldReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanH> loadTReceivePlanHSelfList(ConditionBeanSetupper<TReceivePlanHCB> refCBLambda) {
        myBhv().loadTReceivePlanHSelfList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanHSelfList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanH().ready(_referrerTReceivePlanHSelfList, _selector));
    }

    protected List<TStoreRecordH> _referrerTStoreRecordHList;

    /**
     * Load referrer of TStoreRecordHList by the set-upper of referrer. <br>
     * t_store_record_h by RECEIVE_PLAN_H_ID, named 'TStoreRecordHList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTStoreRecordHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanH tReceivePlanH : <span style="color: #553000">tReceivePlanHList</span>) {
     *     ... = tReceivePlanH.<span style="color: #CC4747">getTStoreRecordHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanHId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordH> loadTStoreRecordHList(ConditionBeanSetupper<TStoreRecordHCB> refCBLambda) {
        myBhv().loadTStoreRecordHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordHList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordH().ready(_referrerTStoreRecordHList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByPlanSupplierIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByPlanSupplierId() {
        if (_foreignMCustomerByPlanSupplierIdLoader == null)
        { _foreignMCustomerByPlanSupplierIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByPlanSupplierId(_selectedList), _selector); }
        return _foreignMCustomerByPlanSupplierIdLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfTPickingH _foreignTPickingHLoader;
    public LoaderOfTPickingH pulloutTPickingH() {
        if (_foreignTPickingHLoader == null)
        { _foreignTPickingHLoader = new LoaderOfTPickingH().ready(myBhv().pulloutTPickingH(_selectedList), _selector); }
        return _foreignTPickingHLoader;
    }

    protected LoaderOfTReceivePlanH _foreignTReceivePlanHSelfLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanHSelf() {
        if (_foreignTReceivePlanHSelfLoader == null)
        { _foreignTReceivePlanHSelfLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanHSelf(_selectedList), _selector); }
        return _foreignTReceivePlanHSelfLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByPlanDepositIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByPlanDepositId() {
        if (_foreignMCustomerByPlanDepositIdLoader == null)
        { _foreignMCustomerByPlanDepositIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByPlanDepositId(_selectedList), _selector); }
        return _foreignMCustomerByPlanDepositIdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByCenterTransitFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByCenterTransitFlg() {
        if (_foreignBClassDtlByCenterTransitFlgLoader == null)
        { _foreignBClassDtlByCenterTransitFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByCenterTransitFlg(_selectedList), _selector); }
        return _foreignBClassDtlByCenterTransitFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveDeliveryStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveDeliveryStatus() {
        if (_foreignBClassDtlByReceiveDeliveryStatusLoader == null)
        { _foreignBClassDtlByReceiveDeliveryStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveDeliveryStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveDeliveryStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveStatus() {
        if (_foreignBClassDtlByReceiveStatusLoader == null)
        { _foreignBClassDtlByReceiveStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveStatusLoader;
    }

    protected LoaderOfTReceivePlanR _foreignTReceivePlanRAsOneLoader;
    public LoaderOfTReceivePlanR pulloutTReceivePlanRAsOne() {
        if (_foreignTReceivePlanRAsOneLoader == null)
        { _foreignTReceivePlanRAsOneLoader = new LoaderOfTReceivePlanR().ready(myBhv().pulloutTReceivePlanRAsOne(_selectedList), _selector); }
        return _foreignTReceivePlanRAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
