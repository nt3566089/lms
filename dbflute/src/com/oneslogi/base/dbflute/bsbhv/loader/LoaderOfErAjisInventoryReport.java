package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_ajis_inventory_report as TABLE. <br>
 * <pre>
 * [primary key]
 *     AJIS_INVENTORY_REPORT_ID
 *
 * [column]
 *     AJIS_INVENTORY_REPORT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INVENTORY_DT, LOCATION_CD, JAN_CD, LOT, LIMIT_DT, PROD_DT, INVENTORY_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     AJIS_INVENTORY_REPORT_ID
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
public class LoaderOfErAjisInventoryReport {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErAjisInventoryReport> _selectedList;
    protected BehaviorSelector _selector;
    protected ErAjisInventoryReportBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErAjisInventoryReport ready(List<ErAjisInventoryReport> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErAjisInventoryReportBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErAjisInventoryReportBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErAjisInventoryReport> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
