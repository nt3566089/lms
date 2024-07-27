package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_plant_storage_space as TABLE. <br>
 * <pre>
 * [primary key]
 *     PLANT_STORAGE_SPACE_ID
 *
 * [column]
 *     PLANT_STORAGE_SPACE_ID, OWNER_CD, PLANT_CD, STORAGE_SPACE_CD, COMPANY_NM, PLANT_NM, STORAGE_SPACE_NM1, STORAGE_SPACE_NM2, COUNTRY_NM, ADDRESS1, ZIP_CD, ADDRESS2, ADDRESS3, TEL_NO, FAX_NO, LANG_NM, BASE_CD, BASE_TYPE_CD, BASE_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PLANT_STORAGE_SPACE_ID
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
public class LoaderOfMPlantStorageSpace {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MPlantStorageSpace> _selectedList;
    protected BehaviorSelector _selector;
    protected MPlantStorageSpaceBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMPlantStorageSpace ready(List<MPlantStorageSpace> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MPlantStorageSpaceBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MPlantStorageSpaceBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MPlantStorageSpace> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
