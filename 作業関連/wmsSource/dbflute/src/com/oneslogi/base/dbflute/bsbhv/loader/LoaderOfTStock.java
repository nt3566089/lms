package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_stock as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_ID
 *
 * [column]
 *     STOCK_ID, CLIENT_ID, WAREHOUSE_ID, PRODUCT_ID, STOCK_TYPE_ID, LOCATION_ID, DEPOSIT_ID, LOT_ID, SHAPE_ID, STORE_NO_ID, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, TRANSIT_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_location, m_stock_type, m_shape, t_lot, m_warehouse, t_store_no, m_product, m_customer, m_client, t_stock_report(AsOne)
 *
 * [referrer table]
 *     t_inventory_b, t_picking_b, t_picking_record_stock, t_receive_label, t_scm_label, t_stock_inout, t_stock_report
 *
 * [foreign property]
 *     mLocation, mStockType, mShape, tLot, mWarehouse, tStoreNo, mProduct, mCustomer, mClient, tStockReportAsOne
 *
 * [referrer property]
 *     tInventoryBList, tPickingBList, tPickingRecordStockList, tReceiveLabelList, tScmLabelList, tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStock> _selectedList;
    protected BehaviorSelector _selector;
    protected TStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStock ready(List<TStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by STOCK_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * t_picking_b by STOCK_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TPickingRecordStock> _referrerTPickingRecordStockList;

    /**
     * Load referrer of TPickingRecordStockList by the set-upper of referrer. <br>
     * t_picking_record_stock by STOCK_ID, named 'TPickingRecordStockList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTPickingRecordStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTPickingRecordStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingRecordStock> loadTPickingRecordStockList(ConditionBeanSetupper<TPickingRecordStockCB> refCBLambda) {
        myBhv().loadTPickingRecordStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRecordStockList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingRecordStock().ready(_referrerTPickingRecordStockList, _selector));
    }

    protected List<TReceiveLabel> _referrerTReceiveLabelList;

    /**
     * Load referrer of TReceiveLabelList by the set-upper of referrer. <br>
     * t_receive_label by STOCK_ID, named 'TReceiveLabelList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTReceiveLabelList</span>(<span style="color: #553000">labelCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">labelCB</span>.setupSelect...
     *         <span style="color: #553000">labelCB</span>.query().set...
     *         <span style="color: #553000">labelCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">labelLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    labelLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTReceiveLabelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceiveLabel> loadTReceiveLabelList(ConditionBeanSetupper<TReceiveLabelCB> refCBLambda) {
        myBhv().loadTReceiveLabelList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceiveLabelList = refLs);
        return hd -> hd.handle(new LoaderOfTReceiveLabel().ready(_referrerTReceiveLabelList, _selector));
    }

    protected List<TScmLabel> _referrerTScmLabelList;

    /**
     * Load referrer of TScmLabelList by the set-upper of referrer. <br>
     * t_scm_label by STOCK_ID, named 'TScmLabelList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTScmLabelList</span>(<span style="color: #553000">labelCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">labelCB</span>.setupSelect...
     *         <span style="color: #553000">labelCB</span>.query().set...
     *         <span style="color: #553000">labelCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">labelLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    labelLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTScmLabelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTScmLabel> loadTScmLabelList(ConditionBeanSetupper<TScmLabelCB> refCBLambda) {
        myBhv().loadTScmLabelList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTScmLabelList = refLs);
        return hd -> hd.handle(new LoaderOfTScmLabel().ready(_referrerTScmLabelList, _selector));
    }

    protected List<TStockInout> _referrerTStockInoutList;

    /**
     * Load referrer of TStockInoutList by the set-upper of referrer. <br>
     * t_stock_inout by STOCK_ID, named 'TStockInoutList'.
     * <pre>
     * <span style="color: #0000C0">tStockBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tStockList</span>, <span style="color: #553000">stockLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">stockLoader</span>.<span style="color: #CC4747">loadTStockInoutList</span>(<span style="color: #553000">inoutCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inoutCB</span>.setupSelect...
     *         <span style="color: #553000">inoutCB</span>.query().set...
     *         <span style="color: #553000">inoutCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inoutLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inoutLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TStock tStock : <span style="color: #553000">tStockList</span>) {
     *     ... = tStock.<span style="color: #CC4747">getTStockInoutList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockId_InScope(pkList);
     * cb.query().addOrderBy_StockId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockInout> loadTStockInoutList(ConditionBeanSetupper<TStockInoutCB> refCBLambda) {
        myBhv().loadTStockInoutList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockInoutList = refLs);
        return hd -> hd.handle(new LoaderOfTStockInout().ready(_referrerTStockInoutList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfTStockReport _foreignTStockReportAsOneLoader;
    public LoaderOfTStockReport pulloutTStockReportAsOne() {
        if (_foreignTStockReportAsOneLoader == null)
        { _foreignTStockReportAsOneLoader = new LoaderOfTStockReport().ready(myBhv().pulloutTStockReportAsOne(_selectedList), _selector); }
        return _foreignTStockReportAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
