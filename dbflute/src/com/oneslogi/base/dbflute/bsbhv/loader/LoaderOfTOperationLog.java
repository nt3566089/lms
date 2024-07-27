package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_operation_log as TABLE. <br>
 * <pre>
 * [primary key]
 *     OPERATION_LOG_ID
 *
 * [column]
 *     OPERATION_LOG_ID, CLIENT_CD, CENTER_CD, WORK_CD, WORK_DT, MAC_ADDRESS, USER_CD, TRACE_ITEM, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, LOCATION_CD, LOCATION_NM, LOT, LIMIT_DT, PROD_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     OPERATION_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTOperationLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TOperationLog> _selectedList;
    protected BehaviorSelector _selector;
    protected TOperationLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTOperationLog ready(List<TOperationLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TOperationLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TOperationLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TOperationLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
