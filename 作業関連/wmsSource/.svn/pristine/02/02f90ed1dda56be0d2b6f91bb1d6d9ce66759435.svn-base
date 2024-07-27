package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_general as TABLE. <br>
 * <pre>
 * [primary key]
 *     GENERAL_ID
 *
 * [column]
 *     GENERAL_ID, CENTER_ID, CENTER_CD, GENERAL_MASTER_TYPE, GENERAL_MASTER_TYPE_NM, GENERAL_CD, GENERAL_NM, GENERAL_ABBR, CHARACTER1, CHARACTER2, CHARACTER3, CHARACTER4, CHARACTER5, CHARACTER6, CHARACTER7, CHARACTER8, CHARACTER9, CHARACTER10, NUM1, NUM2, NUM3, NUM4, NUM5, NUM6, NUM7, NUM8, NUM9, NUM10, COMMENT1, COMMENT2, DEFAULT_TYPE, SYSTEM_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     GENERAL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMGeneral {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MGeneral> _selectedList;
    protected BehaviorSelector _selector;
    protected MGeneralBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMGeneral ready(List<MGeneral> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MGeneralBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MGeneralBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MGeneral> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
