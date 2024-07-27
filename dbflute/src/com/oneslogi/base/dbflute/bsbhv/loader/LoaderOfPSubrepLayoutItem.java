package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of p_subrep_layout_item as TABLE. <br>
 * <pre>
 * [primary key]
 *     SUBREP_LAYOUT_ITEM_ID
 *
 * [column]
 *     SUBREP_LAYOUT_ITEM_ID, SUBREP_LAYOUT_ID, ITEM_CD, DICT_ID, ITEM_TYPE, VISIBLE, ITEM_FORMAT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SUBREP_LAYOUT_ITEM_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     p_subrep_layout, b_dict, v_dict
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     pSubrepLayout, bDict, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfPSubrepLayoutItem {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<PSubrepLayoutItem> _selectedList;
    protected BehaviorSelector _selector;
    protected PSubrepLayoutItemBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfPSubrepLayoutItem ready(List<PSubrepLayoutItem> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected PSubrepLayoutItemBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(PSubrepLayoutItemBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfPSubrepLayout _foreignPSubrepLayoutLoader;
    public LoaderOfPSubrepLayout pulloutPSubrepLayout() {
        if (_foreignPSubrepLayoutLoader == null)
        { _foreignPSubrepLayoutLoader = new LoaderOfPSubrepLayout().ready(myBhv().pulloutPSubrepLayout(_selectedList), _selector); }
        return _foreignPSubrepLayoutLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfVDict _foreignVDictLoader;
    public LoaderOfVDict pulloutVDict() {
        if (_foreignVDictLoader == null)
        { _foreignVDictLoader = new LoaderOfVDict().ready(myBhv().pulloutVDict(_selectedList), _selector); }
        return _foreignVDictLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<PSubrepLayoutItem> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
