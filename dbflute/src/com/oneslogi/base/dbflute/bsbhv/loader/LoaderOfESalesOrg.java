package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of e_sales_org as TABLE. <br>
 * <pre>
 * [primary key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SALES_ORG_ID
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
public class LoaderOfESalesOrg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<ESalesOrg> _selectedList;
    protected BehaviorSelector _selector;
    protected ESalesOrgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfESalesOrg ready(List<ESalesOrg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected ESalesOrgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(ESalesOrgBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<ESalesOrg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
