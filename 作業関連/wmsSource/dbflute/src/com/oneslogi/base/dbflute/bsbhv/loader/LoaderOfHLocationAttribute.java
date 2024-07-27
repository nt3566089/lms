package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of h_location_attribute as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOCATION_ATTRIBUTE_ID
 *
 * [column]
 *     LOCATION_ATTRIBUTE_ID, CENTER_ID, LOCATION_ID, HIST_NO, PREV_LOCATION_HIST, CURT_LOCATION_HIST, HIST_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_ATTRIBUTE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_location
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mLocation
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHLocationAttribute {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HLocationAttribute> _selectedList;
    protected BehaviorSelector _selector;
    protected HLocationAttributeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHLocationAttribute ready(List<HLocationAttribute> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HLocationAttributeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HLocationAttributeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HLocationAttribute> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
