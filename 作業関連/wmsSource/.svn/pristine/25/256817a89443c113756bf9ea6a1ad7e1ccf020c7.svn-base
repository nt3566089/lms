package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_inventory_inst_sum as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, INVENTORY_SLIP_NO, FISCAL_YEAR, INVENTORY_SLIP_ROW_NO, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, LP_SEND_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfErInventoryInstSum {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErInventoryInstSum> _selectedList;
    protected BehaviorSelector _selector;
    protected ErInventoryInstSumBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErInventoryInstSum ready(List<ErInventoryInstSum> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErInventoryInstSumBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErInventoryInstSumBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErInventoryInstSum> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
