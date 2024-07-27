package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_shipping_inst_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_B_ID, SHIPPING_INST_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, TAX_RATE, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, HINMOKU_TEXT, UNIT_NM, EC_UNIT_NM, SAMPLE_TYPE_CD, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, LOT_MANAG_TYPE_CD, DELIV_CD, TRANSACTION_TYPE_CD, WM_SEND_FLG, LP_SEND_FLG, CM_SEND_FLG, EMP_ID_CD, EMP_NM, US3F_TYPE_CD, HINMOKU_GROUP, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_stock_type, t_store_no, m_location, t_alloc_inst_b, m_shape, m_product, t_lot, m_customer, m_warehouse, t_shipping_inst_h, b_class_dtl(ByErrorFlg), t_shipping_inst_spare(AsOne)
 *
 * [referrer table]
 *     t_picking_b, t_shipping_inst_b_print, t_shipping_inst_data_transfer, t_shipping_inst_spare
 *
 * [foreign property]
 *     mStockType, tStoreNo, mLocation, tAllocInstB, mShape, mProduct, tLot, mCustomer, mWarehouse, tShippingInstH, bClassDtlByErrorFlg, tShippingInstSpareAsOne
 *
 * [referrer property]
 *     tPickingBList, tShippingInstBPrintList, tShippingInstDataTransferList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstB> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstB ready(List<TShippingInstB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TPickingB> _referrerTPickingBList;

    /**
     * Load referrer of TPickingBList by the set-upper of referrer. <br>
     * t_picking_b by SHIPPING_INST_B_ID, named 'TPickingBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTPickingBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstB tShippingInstB : <span style="color: #553000">tShippingInstBList</span>) {
     *     ... = tShippingInstB.<span style="color: #CC4747">getTPickingBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingB> loadTPickingBList(ConditionBeanSetupper<TPickingBCB> refCBLambda) {
        myBhv().loadTPickingBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingBList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingB().ready(_referrerTPickingBList, _selector));
    }

    protected List<TShippingInstBPrint> _referrerTShippingInstBPrintList;

    /**
     * Load referrer of TShippingInstBPrintList by the set-upper of referrer. <br>
     * t_shipping_inst_b_print by SHIPPING_INST_B_ID, named 'TShippingInstBPrintList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTShippingInstBPrintList</span>(<span style="color: #553000">printCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">printCB</span>.setupSelect...
     *         <span style="color: #553000">printCB</span>.query().set...
     *         <span style="color: #553000">printCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">printLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    printLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstB tShippingInstB : <span style="color: #553000">tShippingInstBList</span>) {
     *     ... = tShippingInstB.<span style="color: #CC4747">getTShippingInstBPrintList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstBPrint> loadTShippingInstBPrintList(ConditionBeanSetupper<TShippingInstBPrintCB> refCBLambda) {
        myBhv().loadTShippingInstBPrintList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBPrintList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstBPrint().ready(_referrerTShippingInstBPrintList, _selector));
    }

    protected List<TShippingInstDataTransfer> _referrerTShippingInstDataTransferList;

    /**
     * Load referrer of TShippingInstDataTransferList by the set-upper of referrer. <br>
     * t_shipping_inst_data_transfer by SHIPPING_INST_B_ID, named 'TShippingInstDataTransferList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTShippingInstDataTransferList</span>(<span style="color: #553000">transferCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">transferCB</span>.setupSelect...
     *         <span style="color: #553000">transferCB</span>.query().set...
     *         <span style="color: #553000">transferCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">transferLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    transferLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstB tShippingInstB : <span style="color: #553000">tShippingInstBList</span>) {
     *     ... = tShippingInstB.<span style="color: #CC4747">getTShippingInstDataTransferList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstBId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstDataTransfer> loadTShippingInstDataTransferList(ConditionBeanSetupper<TShippingInstDataTransferCB> refCBLambda) {
        myBhv().loadTShippingInstDataTransferList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstDataTransferList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstDataTransfer().ready(_referrerTShippingInstDataTransferList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfTAllocInstB _foreignTAllocInstBLoader;
    public LoaderOfTAllocInstB pulloutTAllocInstB() {
        if (_foreignTAllocInstBLoader == null)
        { _foreignTAllocInstBLoader = new LoaderOfTAllocInstB().ready(myBhv().pulloutTAllocInstB(_selectedList), _selector); }
        return _foreignTAllocInstBLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfTShippingInstH _foreignTShippingInstHLoader;
    public LoaderOfTShippingInstH pulloutTShippingInstH() {
        if (_foreignTShippingInstHLoader == null)
        { _foreignTShippingInstHLoader = new LoaderOfTShippingInstH().ready(myBhv().pulloutTShippingInstH(_selectedList), _selector); }
        return _foreignTShippingInstHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfTShippingInstSpare _foreignTShippingInstSpareAsOneLoader;
    public LoaderOfTShippingInstSpare pulloutTShippingInstSpareAsOne() {
        if (_foreignTShippingInstSpareAsOneLoader == null)
        { _foreignTShippingInstSpareAsOneLoader = new LoaderOfTShippingInstSpare().ready(myBhv().pulloutTShippingInstSpareAsOne(_selectedList), _selector); }
        return _foreignTShippingInstSpareAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
