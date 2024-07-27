package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_receive_report as TABLE. <br>
 * <pre>
 * [primary key]
 *     RECEIVE_REPORT_ID
 *
 * [column]
 *     RECEIVE_REPORT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, STORE_SLIP_NO, STORE_SLIP_ROW_NO, SLIP_TYPE_CD, SN, IF_ID, IF_NO, HINMOKU_CD, JAN_CD, STORE_REASON_CD, STORE_DT, NUM, LOT_MANAG_TYPE_CD, LOT, RECEIVE_NO, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, TENHANSHA_CD, SALES_ORG_CD, SANSHA_DELIVERY_SLIP_NO1, DATA_TYPE_CD, PROCESS_TYPE_CD, SLIP_NO, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_NM, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_NM, DATA_TRANSFER_ONLY_STR01, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfErReceiveReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErReceiveReport> _selectedList;
    protected BehaviorSelector _selector;
    protected ErReceiveReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErReceiveReport ready(List<ErReceiveReport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErReceiveReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErReceiveReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErReceiveReport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
