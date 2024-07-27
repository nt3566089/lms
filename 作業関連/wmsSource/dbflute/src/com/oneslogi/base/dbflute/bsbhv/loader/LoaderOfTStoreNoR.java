package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_store_no_r as TABLE. <br>
 * <pre>
 * [primary key]
 *     STORE_NO_ID
 *
 * [column]
 *     STORE_NO_ID, TWL_OUT_FLG, TWL_OUT_USER_ID, TWL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_user, t_store_no, b_class_dtl(ByTwlOutFlg)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bUser, tStoreNo, bClassDtlByTwlOutFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStoreNoR {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStoreNoR> _selectedList;
    protected BehaviorSelector _selector;
    protected TStoreNoRBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStoreNoR ready(List<TStoreNoR> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStoreNoRBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStoreNoRBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBUser _foreignBUserLoader;
    public LoaderOfBUser pulloutBUser() {
        if (_foreignBUserLoader == null)
        { _foreignBUserLoader = new LoaderOfBUser().ready(myBhv().pulloutBUser(_selectedList), _selector); }
        return _foreignBUserLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByTwlOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByTwlOutFlg() {
        if (_foreignBClassDtlByTwlOutFlgLoader == null)
        { _foreignBClassDtlByTwlOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByTwlOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByTwlOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStoreNoR> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
