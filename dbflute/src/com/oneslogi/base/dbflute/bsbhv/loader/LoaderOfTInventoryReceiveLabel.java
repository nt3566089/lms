package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_inventory_receive_label as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_RECEIVE_LABEL_ID
 *
 * [column]
 *     INVENTORY_RECEIVE_LABEL_ID, INVENTORY_B_ID, RECEIVE_LABEL_NO, SCAN_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_RECEIVE_LABEL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_inventory_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tInventoryB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTInventoryReceiveLabel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInventoryReceiveLabel> _selectedList;
    protected BehaviorSelector _selector;
    protected TInventoryReceiveLabelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInventoryReceiveLabel ready(List<TInventoryReceiveLabel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInventoryReceiveLabelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInventoryReceiveLabelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTInventoryB _foreignTInventoryBLoader;
    public LoaderOfTInventoryB pulloutTInventoryB() {
        if (_foreignTInventoryBLoader == null)
        { _foreignTInventoryBLoader = new LoaderOfTInventoryB().ready(myBhv().pulloutTInventoryB(_selectedList), _selector); }
        return _foreignTInventoryBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInventoryReceiveLabel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
