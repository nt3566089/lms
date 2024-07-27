package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of e_shipping_plan as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_PLAN_ID
 *
 * [column]
 *     SHIPPING_PLAN_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_PLAN_SLIP_NO, SHIPPING_PLAN_SLIP_ROW_NO, SLIP_TYPE_CD, SHIPPING_DT, HINMOKU_CD, SALES_ORDER_TYPE_CD, SHIPPING_TYPE_CD, SHIPPING_REASON_CD, HINMOKU_GROUP, SHIPPING_NUM, HINMOKU_TEXT, JAN_CD, UNIT_NM, DIRECT_DELIVERY_TYPE_CD, KOGUCHI_DELIVERY_FLG, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSACTION_TYPE_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_ORDER_NO, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, DESTINATION_FAX, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_ID
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
public class LoaderOfEShippingPlan {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EShippingPlan> _selectedList;
    protected BehaviorSelector _selector;
    protected EShippingPlanBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEShippingPlan ready(List<EShippingPlan> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EShippingPlanBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EShippingPlanBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EShippingPlan> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
