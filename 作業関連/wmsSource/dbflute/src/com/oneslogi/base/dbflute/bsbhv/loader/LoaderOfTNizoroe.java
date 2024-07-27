package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_nizoroe as TABLE. <br>
 * <pre>
 * [primary key]
 *     NIZOROE_ID
 *
 * [column]
 *     NIZOROE_ID, BASE_CD, NIZOROE_PROC_UNIT, NIZOROE_TYPE_CD, STATUS, PROC_DT, PROC_START_TIME, PROC_END_TIME, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ID
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
public class LoaderOfTNizoroe {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TNizoroe> _selectedList;
    protected BehaviorSelector _selector;
    protected TNizoroeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTNizoroe ready(List<TNizoroe> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TNizoroeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TNizoroeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TNizoroe> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
