package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_picking_receive_label as TABLE. <br>
 * <pre>
 * [primary key]
 *     PICKING_RECEIVE_LABEL_ID
 *
 * [column]
 *     PICKING_RECEIVE_LABEL_ID, PICKING_B_ID, RECEIVE_LABEL_NO, RECEIVE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PICKING_RECEIVE_LABEL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTPickingReceiveLabel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TPickingReceiveLabel> _selectedList;
    protected BehaviorSelector _selector;
    protected TPickingReceiveLabelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTPickingReceiveLabel ready(List<TPickingReceiveLabel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TPickingReceiveLabelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TPickingReceiveLabelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TPickingReceiveLabel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
