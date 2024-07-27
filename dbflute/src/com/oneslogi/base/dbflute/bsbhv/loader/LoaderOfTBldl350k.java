package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl350k as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL350K_ID
 *
 * [column]
 *     BLDL350K_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, SHIPPING_DT, DESTINATION_NM, SHIPPING_NUM, SHIPPING_FEE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL350K_ID
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
public class LoaderOfTBldl350k {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl350k> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl350kBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl350k ready(List<TBldl350k> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl350kBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl350kBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl350k> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
