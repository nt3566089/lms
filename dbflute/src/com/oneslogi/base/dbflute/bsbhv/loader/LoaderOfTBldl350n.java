package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl350n as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL350N_ID
 *
 * [column]
 *     BLDL350N_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, SHIPPING_DT, DESTINATION_NM, SHIPPING_NUM, SHIPPING_FEE, FW_SHIPPING_NUM, UN_SHIPPING_NUM, SH_SHIPPING_NUM, HM_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL350N_ID
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
public class LoaderOfTBldl350n {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl350n> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl350nBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl350n ready(List<TBldl350n> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl350nBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl350nBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl350n> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
