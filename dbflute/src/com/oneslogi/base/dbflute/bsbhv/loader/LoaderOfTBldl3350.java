package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl3350 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL3350_ID
 *
 * [column]
 *     BLDL3350_ID, YEARMONTH, BASE_NM, MONTH, SALES_ORG_NM, SHIPPING_DT, YAMATO_SHIPPING_NUM, YAMATO_EC_SHIPPING_NUM, SAGAWA_SHIPPING_NUM, SAGAWA_EC_SHIPPING_NUM, SAGAWA2_SHIPPING_NUM, SAGAWA2_EC_SHIPPING_NUM, OTHER_SHIPPING_NUM, OTHER_EC_SHIPPING_NUM, CANCEL_SHIPPING_NUM, CANCEL_EC_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3350_ID
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
public class LoaderOfTBldl3350 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl3350> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl3350Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl3350 ready(List<TBldl3350> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl3350Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl3350Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl3350> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
