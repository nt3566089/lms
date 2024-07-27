package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5110 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5110_ID
 *
 * [column]
 *     BLDL5110_ID, YEARMONTH, BASE_NM, MONTH, CARRIER_CD, CARRIER_NM, SHIPPING_DT, FW_STORE, FW_DIRECT, UN_STORE, UN_DIRECT, SH_STORE, SH_DIRECT, HM_STORE, HM_DIRECT, TOTAL_STORE, TOTAL_DIRECT, KOGUCHI_INCLUDE, KOGUCHI_CONST, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5110_ID
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
public class LoaderOfTBldl5110 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5110> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5110Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5110 ready(List<TBldl5110> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5110Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5110Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5110> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
