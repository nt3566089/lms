package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_receive_plan_data_transfer as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceivePlanDataTransfer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceivePlanDataTransfer> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceivePlanDataTransferBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceivePlanDataTransfer ready(List<TReceivePlanDataTransfer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceivePlanDataTransferBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceivePlanDataTransferBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanB _foreignTReceivePlanBLoader;
    public LoaderOfTReceivePlanB pulloutTReceivePlanB() {
        if (_foreignTReceivePlanBLoader == null)
        { _foreignTReceivePlanBLoader = new LoaderOfTReceivePlanB().ready(myBhv().pulloutTReceivePlanB(_selectedList), _selector); }
        return _foreignTReceivePlanBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceivePlanDataTransfer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
