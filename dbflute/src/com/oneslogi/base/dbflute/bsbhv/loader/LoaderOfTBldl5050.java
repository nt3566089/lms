package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5050 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5050_ID
 *
 * [column]
 *     BLDL5050_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_ITEM_CNT, FW_PICK_NUM, FW_RATE, UN_ITEM_CNT, UN_PICK_NUM, UN_RATE, SH_ITEM_CNT, SH_PICK_NUM, SH_RATE, HM_ITEM_CNT, HM_PICK_NUM, HM_RATE, TOTAL_ITEM_CNT, TOTAL_PICK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5050_ID
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
public class LoaderOfTBldl5050 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5050> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5050Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5050 ready(List<TBldl5050> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5050Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5050Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5050> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
