package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5060 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5060_ID
 *
 * [column]
 *     BLDL5060_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RETURN_DT, FW_RETURN_CNT, FW_RETURN_NUM, UN_RETURN_CNT, UN_RETURN_NUM, SH_RETURN_CNT, SH_RETURN_NUM, HM_RETURN_CNT, HM_RETURN_NUM, TOTAL_RETURN_CNT, TOTAL_RETURN_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5060_ID
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
public class LoaderOfTBldl5060 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5060> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5060Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5060 ready(List<TBldl5060> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5060Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5060Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5060> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
