package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of h_id_manag_data as TABLE. <br>
 * <pre>
 * [primary key]
 *     ID_MANAG_DATA_ID
 *
 * [column]
 *     ID_MANAG_DATA_ID, ID_MANAG_NO, TENHANSHA_CD, SALES_ORG_CD, CUSTOMER_CD, PRODUCT_CD, HINMOKU_TEXT, JAN_CD, UNIT_NM, SHARED_PRODUCT_TYPE_CD, CUSTOMER_ORDER_NO, DELIV_CD, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_TEL, EMP_ID_CD, EMP_NM, STORE_DT, INVENTORY_DT, PICKING_DT, PRODUCT_RETURN_DT, WASTE_RETURN_DT, ID_MANAG_ABOLITION_TYPE_CD, SPARE_TYPE_CD, DATA_EXT_FLG_PICKING, DATA_ADD_DT_PICKING, DATA_EXT_FLG_RETURN, DATA_ADD_DT_RETURN, DATA_EXT_FLG_WASTE, DATA_ADD_DT_WASTE, WORK_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ID_MANAG_DATA_ID
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
public class LoaderOfHIdManagData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HIdManagData> _selectedList;
    protected BehaviorSelector _selector;
    protected HIdManagDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHIdManagData ready(List<HIdManagData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HIdManagDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HIdManagDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HIdManagData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
