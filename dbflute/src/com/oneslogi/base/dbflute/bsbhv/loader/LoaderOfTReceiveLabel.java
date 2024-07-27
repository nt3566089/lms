package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_receive_label as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_LABEL_ID
 *
 * [column]
 *     RECEIVE_LABEL_ID, STOCK_ID, RECEIVE_LABEL_NO, NUM, OWNER_CD, OWNER_ABBR, RECOMMEND_LOCATION_CD, LOCATION_CD, JANCD, PRODUCT_NM, UNIT_NM, LOT, LIMIT_DT, PROD_DT, RECEIVE_DT, DEPOSIT_FLG, REPRINT_FLG, RECEIVE_UNIT_NUM, RECEIVE_PLAN_B_ID, RCV_LBL_OUT_USER_ID, RCV_LBL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_LABEL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_receive_plan_b, t_stock, b_user
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tReceivePlanB, tStock, bUser
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTReceiveLabel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TReceiveLabel> _selectedList;
    protected BehaviorSelector _selector;
    protected TReceiveLabelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTReceiveLabel ready(List<TReceiveLabel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TReceiveLabelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TReceiveLabelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTReceivePlanB _foreignTReceivePlanBLoader;
    public LoaderOfTReceivePlanB pulloutTReceivePlanB() {
        if (_foreignTReceivePlanBLoader == null)
        { _foreignTReceivePlanBLoader = new LoaderOfTReceivePlanB().ready(myBhv().pulloutTReceivePlanB(_selectedList), _selector); }
        return _foreignTReceivePlanBLoader;
    }

    protected LoaderOfTStock _foreignTStockLoader;
    public LoaderOfTStock pulloutTStock() {
        if (_foreignTStockLoader == null)
        { _foreignTStockLoader = new LoaderOfTStock().ready(myBhv().pulloutTStock(_selectedList), _selector); }
        return _foreignTStockLoader;
    }

    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TReceiveLabel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
