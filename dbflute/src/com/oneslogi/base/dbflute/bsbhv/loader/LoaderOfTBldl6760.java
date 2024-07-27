package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl6760 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL6760_ID
 *
 * [column]
 *     BLDL6760_ID, YEARMONTH, BASE_CD, BASE_NM, MONTH, SALES_ORG_NM, SHIPPING_DT, NIZOROE_NO, DESTINATION_NM, SHIPPING_NUM, SHIPPING_FEE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL6760_ID
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
public class LoaderOfTBldl6760 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl6760> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl6760Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl6760 ready(List<TBldl6760> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl6760Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl6760Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl6760> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
