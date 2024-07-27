package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_inventory_r as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, INVENTORY_DIFF_OUT_FLG, INVENTORY_DIFF_OUT_USER_ID, INVENTORY_DIFF_OUT_DT, INVENTORY_RECORD_OUT_FLG, INVENTORY_RECORD_OUT_USER_ID, INVENTORY_RECORD_OUT_DT, INVENTORY_RECORD_LOC_OUT_FLG, INVENTORY_RECORD_LOC_OUT_USER_ID, INVENTORY_RECORD_LOC_OUT_DT, STOCK_DIFF_OUT_FLG, STOCK_DIFF_OUT_USER_ID, STOCK_DIFF_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_user, t_inventory_b, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUserByInventoryRecordLocOutUserId, bUserByStockDiffOutUserId, bUserByTwlOutUserId, bUserByInventoryRecordOutUserId, tInventoryB, bUserByInventoryDiffOutUserId, bClassDtlByTwlOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryR> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryR ready(List<TInventoryR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserByInventoryRecordLocOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByInventoryRecordLocOutUserId() {
        if (_foreignBUserByInventoryRecordLocOutUserIdLoader == null)
        { _foreignBUserByInventoryRecordLocOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByInventoryRecordLocOutUserId(_selectedList), _selector); }
        return _foreignBUserByInventoryRecordLocOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByStockDiffOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByStockDiffOutUserId() {
        if (_foreignBUserByStockDiffOutUserIdLoader == null)
        { _foreignBUserByStockDiffOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByStockDiffOutUserId(_selectedList), _selector); }
        return _foreignBUserByStockDiffOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByTwlOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByTwlOutUserId() {
        if (_foreignBUserByTwlOutUserIdLoader == null)
        { _foreignBUserByTwlOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByTwlOutUserId(_selectedList), _selector); }
        return _foreignBUserByTwlOutUserIdLoader;
    }

    protected LoaderOfBUser _foreignBUserByInventoryRecordOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByInventoryRecordOutUserId() {
        if (_foreignBUserByInventoryRecordOutUserIdLoader == null)
        { _foreignBUserByInventoryRecordOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByInventoryRecordOutUserId(_selectedList), _selector); }
        return _foreignBUserByInventoryRecordOutUserIdLoader;
    }

    protected LoaderOfTInventoryB _foreignTInventoryBLoader;
    public LoaderOfTInventoryB pulloutTInventoryB() {
        if (_foreignTInventoryBLoader == null)
        { _foreignTInventoryBLoader = new LoaderOfTInventoryB().ready(myBhv().pulloutTInventoryB(_selectedList), _selector); }
        return _foreignTInventoryBLoader;
    }

    protected LoaderOfBUser _foreignBUserByInventoryDiffOutUserIdLoader;
    public LoaderOfBUser pulloutBUserByInventoryDiffOutUserId() {
        if (_foreignBUserByInventoryDiffOutUserIdLoader == null)
        { _foreignBUserByInventoryDiffOutUserIdLoader = new LoaderOfBUser().ready(myBhv().pulloutBUserByInventoryDiffOutUserId(_selectedList), _selector); }
        return _foreignBUserByInventoryDiffOutUserIdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTwlOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTwlOutFlg() {
        if (_foreignBClassDtlByTwlOutFlgLoader == null)
        { _foreignBClassDtlByTwlOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTwlOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTwlOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
