package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of w_shipping_interrupt as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, USER_CD, PRODUCT_ID, INST_NUM, SPG_QTY_ONS, SPG_QTY_REMAIN, PIECE_NO, BOX_ID, PICKING_WORK_NO, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, LOT, LIMIT_DT, PROD_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_product, m_client, m_center, m_box
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, mClient, mCenter, mBox
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfWShippingInterrupt {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WShippingInterrupt> _selectedList;
    protected BehaviorSelector _selector;
    protected WShippingInterruptBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWShippingInterrupt ready(List<WShippingInterrupt> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WShippingInterruptBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WShippingInterruptBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WShippingInterrupt> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
