package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5151 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5151_ID
 *
 * [column]
 *     BLDL5151_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RECEIVE_DT, FW_RCV_CNT, FW_RCV_NUM, FW_CASE_NUM, UN_RCV_CNT, UN_RCV_NUM, UN_CASE_NUM, SH_RCV_CNT, SH_RCV_NUM, SH_CASE_NUM, HM_RCV_CNT, HM_RCV_NUM, HM_CASE_NUM, TOTAL_RCV_NUM, TOTAL_CASE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5151_ID
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
public class LoaderOfTBldl5151 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5151> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5151Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5151 ready(List<TBldl5151> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5151Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5151Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5151> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
