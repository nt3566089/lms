package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5353 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5353_ID
 *
 * [column]
 *     BLDL5353_ID, YEARMONTH, MONTH, SALES_ORG_CD, SALES_ORG_NM, ROW_NO, DATE, HOLIDAY, SOUKA_FW_NUM, SOUKA_UN_NUM, SOUKA_SH_NUM, SOUKA_TOTAL_NUM, KOSHIGAYA_FW_NUM, KOSHIGAYA_UN_NUM, KOSHIGAYA_SH_NUM, KOSHIGAYA_TOTAL_NUM, TOTAL_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5353_ID
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
public class LoaderOfTBldl5353 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5353> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5353Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5353 ready(List<TBldl5353> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5353Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5353Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5353> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
