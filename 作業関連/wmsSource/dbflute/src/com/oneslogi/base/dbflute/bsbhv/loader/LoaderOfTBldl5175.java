package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5175 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5175_ID
 *
 * [column]
 *     BLDL5175_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RECEIVE_DT, FW_RECEIVE_CNT, FW_RECEIVE_NUM, FW_CASE_NUM, UN_RECEIVE_CNT, UN_RECEIVE_NUM, UN_CASE_NUM, SH_RECEIVE_CNT, SH_RECEIVE_NUM, SH_CASE_NUM, TOTAL_RECEIVE_NUM, TOTAL_CASE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5175_ID
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
public class LoaderOfTBldl5175 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5175> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5175Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5175 ready(List<TBldl5175> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5175Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5175Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5175> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
