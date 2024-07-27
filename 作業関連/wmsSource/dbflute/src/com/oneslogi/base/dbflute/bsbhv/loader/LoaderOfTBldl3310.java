package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl3310 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL3310_ID
 *
 * [column]
 *     BLDL3310_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, EC_TYPE_CD, FW_PRICE, SANSHA_FW_PRICE, SANSHA_UN_PRICE, SANSHA_SH_PRICE, SANSHA_HM_PRICE, SANSHA_TOTAL_PRICE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3310_ID
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
public class LoaderOfTBldl3310 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl3310> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl3310Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl3310 ready(List<TBldl3310> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl3310Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl3310Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl3310> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
