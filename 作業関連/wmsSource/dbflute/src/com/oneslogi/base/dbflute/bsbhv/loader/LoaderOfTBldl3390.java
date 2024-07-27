package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl3390 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL3390_ID
 *
 * [column]
 *     BLDL3390_ID, YEARMONTH, BASE_NM, MONTH, SHIPPING_DT, CONTRACTOR_CD, CONTRACTOR_NM, PRODUCT_NM, SALES_ORG_NM, SHIPPING_NUM, KOHAI_FEE, TAX, TAX_RATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3390_ID
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
public class LoaderOfTBldl3390 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl3390> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl3390Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl3390 ready(List<TBldl3390> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl3390Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl3390Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl3390> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
