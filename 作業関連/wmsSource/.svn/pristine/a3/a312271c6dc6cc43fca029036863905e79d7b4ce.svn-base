package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of es_inventory_inst as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_INST_ID
 *
 * [column]
 *     INVENTORY_INST_ID, SEND_FLG, INVENTORY_SLIP_NO, INVENTORY_SLIP_ROW_NO, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, UNIT_NM, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, PRODUCT_TYPE, ALLOC_TYPE_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfEsInventoryInst {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EsInventoryInst> _selectedList;
    protected BehaviorSelector _selector;
    protected EsInventoryInstBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEsInventoryInst ready(List<EsInventoryInst> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EsInventoryInstBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EsInventoryInstBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EsInventoryInst> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
