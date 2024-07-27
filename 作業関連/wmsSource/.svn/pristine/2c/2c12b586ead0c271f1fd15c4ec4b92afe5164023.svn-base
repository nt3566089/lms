package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_stock_record as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_RECORD_ID
 *
 * [column]
 *     STOCK_RECORD_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, HINMOKU_CD, STOCK_NUM, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, ALLOC_TYPE_CD, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfErStockRecord {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErStockRecord> _selectedList;
    protected BehaviorSelector _selector;
    protected ErStockRecordBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErStockRecord ready(List<ErStockRecord> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErStockRecordBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErStockRecordBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErStockRecord> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
