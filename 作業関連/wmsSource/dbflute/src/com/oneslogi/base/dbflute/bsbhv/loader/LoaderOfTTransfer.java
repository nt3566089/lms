package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_transfer as TABLE. <br>
 * <pre>
 * [primary key]
 *     TRANSFER_ID
 *
 * [column]
 *     TRANSFER_ID, CLIENT_ID, PRODUCT_CD, STOCK_TRANSFER_DT, RECEIVE_PLANT_CD, RECEIVE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSFER_TYPE_CD, NUM, HINMOKU_GROUP, JAN_CD, PRODUCT_NM, S4_SEND_FLG, LOCATION_CD1, LOCATION_CD2, USER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTTransfer {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TTransfer> _selectedList;
    protected BehaviorSelector _selector;
    protected TTransferBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTTransfer ready(List<TTransfer> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TTransferBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TTransferBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TTransfer> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
