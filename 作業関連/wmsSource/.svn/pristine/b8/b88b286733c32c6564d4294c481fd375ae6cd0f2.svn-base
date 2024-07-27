package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_picking_record_stock as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_RECORD_STOCK_ID
 *
 * [column]
 *     PICKING_RECORD_STOCK_ID, PICKING_B_ID, STOCK_ID, PICKING_NUM, 在庫調整済フラグ, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_RECORD_STOCK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_picking_b, t_stock
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tPickingB, tStock
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPickingRecordStock {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPickingRecordStock> _selectedList;
    protected BehaviorSelector _selector;
    protected TPickingRecordStockBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPickingRecordStock ready(List<TPickingRecordStock> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPickingRecordStockBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPickingRecordStockBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTPickingB _foreignTPickingBLoader;
    public LoaderOfTPickingB pulloutTPickingB() {
        if (_foreignTPickingBLoader == null)
        { _foreignTPickingBLoader = new LoaderOfTPickingB().ready(myBhv().pulloutTPickingB(_selectedList), _selector); }
        return _foreignTPickingBLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPickingRecordStock> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
