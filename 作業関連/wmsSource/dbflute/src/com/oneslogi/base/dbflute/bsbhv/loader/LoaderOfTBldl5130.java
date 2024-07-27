package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5130 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5130_ID
 *
 * [column]
 *     BLDL5130_ID, YEARMONTH, BASE_NM, MONTH, CARRIER_CD, CARRIER_NM, ROW_NO, SHIPPING_DT, FW_STORE, FW_DIRECT, FW_TRANFER, SH_STORE, SH_DIRECT, SH_TRANFER, STORE_TOTAL, DIRECT_TOTAL, TRANSFER_TOTAL, KOGUCHI_DELIV, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5130_ID
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
public class LoaderOfTBldl5130 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5130> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5130Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5130 ready(List<TBldl5130> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5130Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5130Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5130> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
