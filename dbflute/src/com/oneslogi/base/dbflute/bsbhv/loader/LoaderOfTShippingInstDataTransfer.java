package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_shipping_inst_data_transfer as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID
 *
 * [column]
 *     SHIPPING_INST_DATA_TRANSFER_ID, SHIPPING_INST_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_inst_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstDataTransfer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstDataTransfer> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstDataTransferBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstDataTransfer ready(List<TShippingInstDataTransfer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstDataTransferBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstDataTransferBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingInstB _foreignTShippingInstBLoader;
    public LoaderOfTShippingInstB pulloutTShippingInstB() {
        if (_foreignTShippingInstBLoader == null)
        { _foreignTShippingInstBLoader = new LoaderOfTShippingInstB().ready(myBhv().pulloutTShippingInstB(_selectedList), _selector); }
        return _foreignTShippingInstBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstDataTransfer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
