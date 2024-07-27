package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_nizoroe as TABLE. <br>
 * <pre>
 * [primary key]
 *     NIZOROE_ID
 *
 * [column]
 *     NIZOROE_ID, CENTER_ID, BASE_CD, NIZOROE_PATERN_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     m_center, m_nizoroe_patern
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mNizoroePatern
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMNizoroe {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MNizoroe> _selectedList;
    protected BehaviorSelector _selector;
    protected MNizoroeBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMNizoroe ready(List<MNizoroe> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MNizoroeBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MNizoroeBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMNizoroePatern _foreignMNizoroePaternLoader;
    public LoaderOfMNizoroePatern pulloutMNizoroePatern() {
        if (_foreignMNizoroePaternLoader == null)
        { _foreignMNizoroePaternLoader = new LoaderOfMNizoroePatern().ready(myBhv().pulloutMNizoroePatern(_selectedList), _selector); }
        return _foreignMNizoroePaternLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MNizoroe> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
