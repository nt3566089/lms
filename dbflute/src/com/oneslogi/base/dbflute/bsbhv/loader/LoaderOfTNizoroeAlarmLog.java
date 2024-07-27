package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_nizoroe_alarm_log as TABLE. <br>
 * <pre>
 * [primary key]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [column]
 *     NIZOROE_ALARM_LOG_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_UNIT, PROC_DT, PRINT_FLG, BASE_CD, BASE_NM, TYPE_CD, ALARM_TYPE_CD, NIZOROE_NO, SALES_ORDER_SLIP_NO, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, SALES_ORG_ID, SALES_ORG_CD, SALES_ORG_NM1, SALES_ORG_NM2, DESTINATION_NM1, DESTINATION_NM2, STOCK_OUT_NUM, OUT_USER_ID, OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_product, b_user
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct, bUser
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTNizoroeAlarmLog {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TNizoroeAlarmLog> _selectedList;
    protected BehaviorSelector _selector;
    protected TNizoroeAlarmLogBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTNizoroeAlarmLog ready(List<TNizoroeAlarmLog> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TNizoroeAlarmLogBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TNizoroeAlarmLogBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
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
    public List<TNizoroeAlarmLog> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
