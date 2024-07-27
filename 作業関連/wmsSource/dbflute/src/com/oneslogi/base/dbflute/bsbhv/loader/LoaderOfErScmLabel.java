package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of er_scm_label as TABLE. <br>
 * <pre>
 * [primary key]
 *     SCM_LABEL_ID
 *
 * [column]
 *     SCM_LABEL_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_SLIP_NO, PACKING_NO, CARTON_ID_NO, SN, MANAG_TYPE_CD, HINMOKU_CD, HINMOKU_GROUP, HINMOKU_TEXT, JAN_CD, NUM, SERIAL_NO, LOT_MANAG_TYPE_CD, LOT, LIMIT_DT, PROD_DT, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfErScmLabel {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ErScmLabel> _selectedList;
    protected BehaviorSelector _selector;
    protected ErScmLabelBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfErScmLabel ready(List<ErScmLabel> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ErScmLabelBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ErScmLabelBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ErScmLabel> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
