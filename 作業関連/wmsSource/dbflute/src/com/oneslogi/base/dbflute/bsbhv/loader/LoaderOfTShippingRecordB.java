package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_shipping_record_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_RECORD_B_ID
 *
 * [column]
 *     SHIPPING_RECORD_B_ID, SHIPPING_RECORD_H_ID, SHIPPING_SLIP_ROW_NO, SN, PRODUCT_CD, JAN_CD, NUM, LOT_MANAG_TYPE_CD, LOT, CONFIRMED_PACKING_NUM, SR_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_record_h
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingRecordH
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingRecordB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingRecordB> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingRecordBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingRecordB ready(List<TShippingRecordB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingRecordBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingRecordBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingRecordH _foreignTShippingRecordHLoader;
    public LoaderOfTShippingRecordH pulloutTShippingRecordH() {
        if (_foreignTShippingRecordHLoader == null)
        { _foreignTShippingRecordHLoader = new LoaderOfTShippingRecordH().ready(myBhv().pulloutTShippingRecordH(_selectedList), _selector); }
        return _foreignTShippingRecordHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingRecordB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
