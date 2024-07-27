package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5660 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5660_ID
 *
 * [column]
 *     BLDL5660_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_SHIPPING_CNT, FW_SHIPPING_NUM, SH_SHIPPING_CNT, SH_SHIPPING_NUM, HM_SHIPPING_CNT, HM_SHIPPING_NUM, TOTAL_SHIPPING_CNT, TOTAL_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5660_ID
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
public class LoaderOfTBldl5660 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5660> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5660Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5660 ready(List<TBldl5660> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5660Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5660Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5660> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
