package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_distribution as TABLE. <br>
 * <pre>
 * [primary key]
 *     DISTRIBUTION_ID
 *
 * [column]
 *     DISTRIBUTION_ID, RECEIVE_CD, RECEIVE_ROW_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, STORE_SLIP_NO, STORE_SLIP_ROW_NO, STORE_REASON_CD, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_REASON_CD, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, HINMOKU_CD, HINMOKU_TEXT, JAN_CD, NUM, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfErDistribution {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErDistribution> _selectedList;
    protected BehaviorSelector _selector;
    protected ErDistributionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErDistribution ready(List<ErDistribution> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErDistributionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErDistributionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErDistribution> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}