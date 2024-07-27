package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_shipping_inst_h_print as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_H_PRINT_ID, SHIPPING_INST_H_ID, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, SHIPPING_REASON, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, KOGUCHI_DELIVERY_FLG, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_ID, TENHANSHA_ORDER_NO, CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_inst_h
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstH
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstHPrint {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstHPrint> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstHPrintBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstHPrint ready(List<TShippingInstHPrint> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstHPrintBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstHPrintBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingInstH _foreignTShippingInstHLoader;
    public LoaderOfTShippingInstH pulloutTShippingInstH() {
        if (_foreignTShippingInstHLoader == null)
        { _foreignTShippingInstHLoader = new LoaderOfTShippingInstH().ready(myBhv().pulloutTShippingInstH(_selectedList), _selector); }
        return _foreignTShippingInstHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstHPrint> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
