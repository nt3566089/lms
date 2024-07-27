package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_invoice_tracking as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVOICE_TRACKING_ID
 *
 * [column]
 *     INVOICE_TRACKING_ID, CARRIER_SLIP_NO, NIZOROE_NO, SHIPPING_SLIP_NO, SHIPPING_DT, PACKING_NO, CARRIER_CD, CARRIER_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVOICE_TRACKING_ID
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
public class LoaderOfTInvoiceTracking {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TInvoiceTracking> _selectedList;
    protected BehaviorSelector _selector;
    protected TInvoiceTrackingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTInvoiceTracking ready(List<TInvoiceTracking> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TInvoiceTrackingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TInvoiceTrackingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TInvoiceTracking> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
