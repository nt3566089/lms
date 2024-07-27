package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5052 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5052_ID
 *
 * [column]
 *     BLDL5052_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_CASE_NUM, FW_PICK_NUM, FW_RATE, UN_CASE_NUM, UN_PICK_NUM, UN_RATE, SH_CASE_NUM, SH_PICK_NUM, SH_RATE, HM_CASE_NUM, HM_PICK_NUM, HM_RATE, TOTAL_CASE_NUM, TOTAL_PICK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5052_ID
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
public class LoaderOfTBldl5052 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5052> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5052Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5052 ready(List<TBldl5052> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5052Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5052Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5052> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
