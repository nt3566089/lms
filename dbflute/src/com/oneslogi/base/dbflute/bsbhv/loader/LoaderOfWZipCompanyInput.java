package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of w_zip_company_input as TABLE. <br>
 * <pre>
 * [primary key]
 *     ZIP_COMPANY_INPUT_ID
 *
 * [column]
 *     ZIP_COMPANY_INPUT_ID, PUBLIC_CD, COMPANY_KN, COMPANY_NM, ADDRESS1, ADDRESS2, ADDRESS3, ADDRESS4, ZIP_CD, ZIP_CD_5, HANDLING_ADDRESS, FLG5, FLG6, UPD_CD, COMPANY_FLG, LINE_NO, WORK_FLG, ERROR_FLG, ERROR_MSG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     ZIP_COMPANY_INPUT_ID
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
public class LoaderOfWZipCompanyInput {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<WZipCompanyInput> _selectedList;
    protected BehaviorSelector _selector;
    protected WZipCompanyInputBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfWZipCompanyInput ready(List<WZipCompanyInput> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected WZipCompanyInputBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(WZipCompanyInputBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<WZipCompanyInput> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}