package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of w_ht_shipping as TABLE. <br>
 * <pre>
 * [primary key]
 *     HT_SHIPPING_ID
 *
 * [column]
 *     HT_SHIPPING_ID, MAC_ADDRESS, ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, NIZOROE_NO, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, INST_NUM, SPG_QTY_ONS, SPG_QTY_REMAIN, PIECE_NO, SPG_WORK_COMMENT, BOX_ID, BOX_CD, BOX_NM, PICKING_WORK_NO, LOT, CONSUME_DT, PROD_DT, INDV_LABEL_NO, EXPECTED_SHIPMENT_NO, FORCE_COPLETE_FLG, SUSPEND_FLG, RECEIVE_LABEL_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO, DAIHYO_NIZOROE_NO2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_SHIPPING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_box, m_product, m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mBox, mProduct, mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWHtShipping {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WHtShipping> _selectedList;
    protected BehaviorSelector _selector;
    protected WHtShippingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWHtShipping ready(List<WHtShipping> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WHtShippingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WHtShippingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMBox _foreignMBoxLoader;
    public LoaderOfMBox pulloutMBox() {
        if (_foreignMBoxLoader == null)
        { _foreignMBoxLoader = new LoaderOfMBox().ready(myBhv().pulloutMBox(_selectedList), _selector); }
        return _foreignMBoxLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WHtShipping> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}