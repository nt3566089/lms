package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_shipping_plan_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_PLAN_B_ID
 *
 * [column]
 *     SHIPPING_PLAN_B_ID, SHIPPING_PLAN_H_ID, LINE_NO, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, STORE_NO_ID, STORE_LABEL_NO, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, ERROR_FLG, ERROR_MESSAGE_CD, ALLOC_INST_B_ID, ALLOC_NUM, STOCK_OUT_NUM, UNIT_PRICE, PRICE, TAX, CASE_PIECE_TYPE_ID, CASE_PIECE_TYPE_CD, PROD_DT, JAN_CD, HINMOKU_GROUP, HINMOKU_TEXT, UNIT_NM, STORE_STORAGE_SPACE_CD, STORE_PLANT_CD, TRANSACTION_TYPE_CD, CM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_shipping_plan_h
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tShippingPlanH
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingPlanB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingPlanB> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingPlanBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingPlanB ready(List<TShippingPlanB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingPlanBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingPlanBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTShippingPlanH _foreignTShippingPlanHLoader;
    public LoaderOfTShippingPlanH pulloutTShippingPlanH() {
        if (_foreignTShippingPlanHLoader == null)
        { _foreignTShippingPlanHLoader = new LoaderOfTShippingPlanH().ready(myBhv().pulloutTShippingPlanH(_selectedList), _selector); }
        return _foreignTShippingPlanHLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingPlanB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
