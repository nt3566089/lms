package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of es_plant_storage_space as TABLE. <br>
 * <pre>
 * [primary key]
 *     PLANT_STORAGE_SPACE_ID
 *
 * [column]
 *     PLANT_STORAGE_SPACE_ID, SEND_FLG, PLANT_CD, STORAGE_SPACE_CD, COMPANY_NM, PLANT_NM, STORAGE_SPACE_NM1, STORAGE_SPACE_NM2, COUNTRY_NM, ZIP_CD, ADDRESS1, ADDRESS2, ADDRESS3, TEL_NO, FAX_NO, LANG_NM, BASE_CD, BASE_TYPE_CD, BASE_NM, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public class LoaderOfEsPlantStorageSpace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<EsPlantStorageSpace> _selectedList;
    protected BehaviorSelector _selector;
    protected EsPlantStorageSpaceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfEsPlantStorageSpace ready(List<EsPlantStorageSpace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected EsPlantStorageSpaceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(EsPlantStorageSpaceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<EsPlantStorageSpace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
