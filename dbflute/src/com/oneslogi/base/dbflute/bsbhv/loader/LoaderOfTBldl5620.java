package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5620 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5620_ID
 *
 * [column]
 *     BLDL5620_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_SHIPPING_CNT, FW_SHIPPING_NUM, UN_SHIPPING_CNT, UN_SHIPPING_NUM, SH_SHIPPING_CNT, SH_SHIPPING_NUM, TOTAL_SHIPPING_CNT, TOTAL_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5620_ID
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
public class LoaderOfTBldl5620 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5620> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5620Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5620 ready(List<TBldl5620> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5620Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5620Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5620> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
