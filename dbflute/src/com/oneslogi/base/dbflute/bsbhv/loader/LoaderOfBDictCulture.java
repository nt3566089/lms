package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of b_dict_culture as TABLE. <br>
 * <pre>
 * [primary key]
 *     DICT_CULTURE_ID
 *
 * [column]
 *     DICT_CULTURE_ID, DICT_ID, CULTURE_ID, DICT_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DICT_CULTURE_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_culture, b_dict, m_ht_dict_culture(AsOne)
 *
 * [referrer table]
 *     m_ht_dict_culture
 *
 * [foreign property]
 *     bCulture, bDict, mHtDictCultureAsOne
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBDictCulture {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BDictCulture> _selectedList;
    protected BehaviorSelector _selector;
    protected BDictCultureBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBDictCulture ready(List<BDictCulture> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BDictCultureBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BDictCultureBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfMHtDictCulture _foreignMHtDictCultureAsOneLoader;
    public LoaderOfMHtDictCulture pulloutMHtDictCultureAsOne() {
        if (_foreignMHtDictCultureAsOneLoader == null)
        { _foreignMHtDictCultureAsOneLoader = new LoaderOfMHtDictCulture().ready(myBhv().pulloutMHtDictCultureAsOne(_selectedList), _selector); }
        return _foreignMHtDictCultureAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BDictCulture> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
