package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_bldl5313 as TABLE. <br>
 * <pre>
 * [primary key]
 *     BLDL5313_ID
 *
 * [column]
 *     BLDL5313_ID, YEARMONTH, BASE_NM, MONTH, SALES_ORG_CD, SALES_ORG_NM, PRODUCT_CD, PRODUCT_NM, SHIPPING_DT, SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5313_ID
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
public class LoaderOfTBldl5313 {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TBldl5313> _selectedList;
    protected BehaviorSelector _selector;
    protected TBldl5313Bhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTBldl5313 ready(List<TBldl5313> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TBldl5313Bhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TBldl5313Bhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TBldl5313> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
