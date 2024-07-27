package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_work_data as TABLE. <br>
 * <pre>
 * [primary key]
 *     WORK_DATA_ID
 *
 * [column]
 *     WORK_DATA_ID, USER_CD, WORK_CD, WORK_QTY, MAC_ADDRESS, CLIENT_CD, CENTER_CD, WORK_LOG_ID, WORK_QTY_CS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     WORK_DATA_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_work_log
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     tWorkLog
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTWorkData {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TWorkData> _selectedList;
    protected BehaviorSelector _selector;
    protected TWorkDataBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTWorkData ready(List<TWorkData> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TWorkDataBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TWorkDataBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTWorkLog _foreignTWorkLogLoader;
    public LoaderOfTWorkLog pulloutTWorkLog() {
        if (_foreignTWorkLogLoader == null)
        { _foreignTWorkLogLoader = new LoaderOfTWorkLog().ready(myBhv().pulloutTWorkLog(_selectedList), _selector); }
        return _foreignTWorkLogLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TWorkData> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
