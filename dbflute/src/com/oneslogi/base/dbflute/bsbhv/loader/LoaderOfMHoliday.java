package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_holiday as TABLE. <br>
 * <pre>
 * [primary key]
 *     HOLIDAY_ID
 *
 * [column]
 *     HOLIDAY_ID, BASE_CD, CALENDER_DT, HOLIDAY_FLG, NATIONAL_HOLIDAY_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HOLIDAY_ID
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
public class LoaderOfMHoliday {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MHoliday> _selectedList;
    protected BehaviorSelector _selector;
    protected MHolidayBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMHoliday ready(List<MHoliday> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MHolidayBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MHolidayBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MHoliday> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
