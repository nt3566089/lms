package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_packing_list as TABLE. <br>
 * <pre>
 * [primary key]
 *     PACKING_LIST_ID
 *
 * [column]
 *     PACKING_LIST_ID, CLIENT_ID, SHIPPING_SLIP_NO, PACKING_NO, PACKING_ROW_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_SLIP_ROW_NO_SN, PRODUCT_CD, NUM, CARRIER_SLIP_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_LIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPackingList {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPackingList> _selectedList;
    protected BehaviorSelector _selector;
    protected TPackingListBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPackingList ready(List<TPackingList> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPackingListBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPackingListBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPackingList> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
