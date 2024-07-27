package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_shipping_inst_b_print as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_B_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_B_PRINT_ID, SHIPPING_INST_B_ID, HINMOKU_CD, HINMOKU_GROUP_CD, SALES_ORDER_NUM, LOGI_WEIGHT_FLG, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, UNIT_PRICE, EC_ORDER_BRANCH_NO, EC_PRODUCT_NM_KANJI, DEAL_TYPE_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_B_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_inst_b
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingInstB
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstBPrint {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstBPrint> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstBPrintBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstBPrint ready(List<TShippingInstBPrint> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstBPrintBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstBPrintBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingInstB _foreignTShippingInstBLoader;
    public LoaderOfTShippingInstB pulloutTShippingInstB() {
        if (_foreignTShippingInstBLoader == null)
        { _foreignTShippingInstBLoader = new LoaderOfTShippingInstB().ready(myBhv().pulloutTShippingInstB(_selectedList), _selector); }
        return _foreignTShippingInstBLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstBPrint> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
