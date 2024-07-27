package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_receive_plan_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_B_ID, RECEIVE_PLAN_H_ID, LINE_NO, RECEIVE_STATUS, PLAN_CLIENT_ORDER_NO, PLAN_WAREHOUSE_ID, PLAN_WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, PLAN_LOT, PLAN_LIMIT_DT, PLAN_LOCATION_ID, PLAN_LOCATION_CD, PLAN_STORE_LABEL_NO, PLAN_NUM, ERROR_FLG, ERROR_MESSAGE_CD, STORE_ROW_NO, PLAN_PROD_DT, HINMOKU_GROUP, HINMOKU_TEXT, JAN_CD, UNIT_NM, REMAINING_RECEIVE_NUM, LOT_MANAG_TYPE_ID, LOT_MANAG_TYPE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, REMAIN_FLG, WM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_h, m_location, m_warehouse, m_product, b_class_dtl(ByErrorFlg), t_receive_plan_spare(AsOne)
 *
 * [referrer table]
 *     t_receive_label, t_receive_plan_data_transfer, t_store_record_b, t_receive_plan_spare
 *
 * [foreign property]
 *     tReceivePlanH, mLocation, mWarehouse, mProduct, bClassDtlByErrorFlg, bClassDtlByReceiveStatus, tReceivePlanSpareAsOne
 *
 * [referrer property]
 *     tReceiveLabelList, tReceivePlanDataTransferList, tStoreRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanB> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanB ready(List<TReceivePlanB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TReceiveLabel> _referrerTReceiveLabelList;

    /**
     * Load referrer of TReceiveLabelList by the set-upper of referrer. <br>
     * t_receive_label by RECEIVE_PLAN_B_ID, named 'TReceiveLabelList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTReceiveLabelList</span>(<span style="color: #553000">labelCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">labelCB</span>.setupSelect...
     *         <span style="color: #553000">labelCB</span>.query().set...
     *         <span style="color: #553000">labelCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">labelLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    labelLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.<span style="color: #CC4747">getTReceiveLabelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceiveLabel> loadTReceiveLabelList(ConditionBeanSetupper<TReceiveLabelCB> refCBLambda) {
        myBhv().loadTReceiveLabelList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceiveLabelList = refLs);
        return hd -> hd.handle(new LoaderOfTReceiveLabel().ready(_referrerTReceiveLabelList, _selector));
    }

    protected List<TReceivePlanDataTransfer> _referrerTReceivePlanDataTransferList;

    /**
     * Load referrer of TReceivePlanDataTransferList by the set-upper of referrer. <br>
     * t_receive_plan_data_transfer by RECEIVE_PLAN_B_ID, named 'TReceivePlanDataTransferList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTReceivePlanDataTransferList</span>(<span style="color: #553000">transferCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">transferCB</span>.setupSelect...
     *         <span style="color: #553000">transferCB</span>.query().set...
     *         <span style="color: #553000">transferCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">transferLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    transferLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.<span style="color: #CC4747">getTReceivePlanDataTransferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanDataTransfer> loadTReceivePlanDataTransferList(ConditionBeanSetupper<TReceivePlanDataTransferCB> refCBLambda) {
        myBhv().loadTReceivePlanDataTransferList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanDataTransferList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanDataTransfer().ready(_referrerTReceivePlanDataTransferList, _selector));
    }

    protected List<TStoreRecordB> _referrerTStoreRecordBList;

    /**
     * Load referrer of TStoreRecordBList by the set-upper of referrer. <br>
     * t_store_record_b by RECEIVE_PLAN_B_ID, named 'TStoreRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tReceivePlanBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tReceivePlanBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTStoreRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TReceivePlanB tReceivePlanB : <span style="color: #553000">tReceivePlanBList</span>) {
     *     ... = tReceivePlanB.<span style="color: #CC4747">getTStoreRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceivePlanBId_InScope(pkList);
     * cb.query().addOrderBy_ReceivePlanBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordB> loadTStoreRecordBList(ConditionBeanSetupper<TStoreRecordBCB> refCBLambda) {
        myBhv().loadTStoreRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordB().ready(_referrerTStoreRecordBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanH _foreignTReceivePlanHLoader;
    public LoaderOfTReceivePlanH pulloutTReceivePlanH() {
        if (_foreignTReceivePlanHLoader == null)
        { _foreignTReceivePlanHLoader = new LoaderOfTReceivePlanH().ready(myBhv().pulloutTReceivePlanH(_selectedList), _selector); }
        return _foreignTReceivePlanHLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByReceiveStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByReceiveStatus() {
        if (_foreignBClassDtlByReceiveStatusLoader == null)
        { _foreignBClassDtlByReceiveStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByReceiveStatus(_selectedList), _selector); }
        return _foreignBClassDtlByReceiveStatusLoader;
    }

    protected LoaderOfTReceivePlanSpare _foreignTReceivePlanSpareAsOneLoader;
    public LoaderOfTReceivePlanSpare pulloutTReceivePlanSpareAsOne() {
        if (_foreignTReceivePlanSpareAsOneLoader == null)
        { _foreignTReceivePlanSpareAsOneLoader = new LoaderOfTReceivePlanSpare().ready(myBhv().pulloutTReceivePlanSpareAsOne(_selectedList), _selector); }
        return _foreignTReceivePlanSpareAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
