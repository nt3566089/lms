package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_client_col as TABLE. <br>
 * <pre>
 * [primary key]
 *     CLIENT_COL_ID
 *
 * [column]
 *     CLIENT_COL_ID, CLIENT_ID, COL_ID, DICT_ID, VISIBLE, EDITABLE, NECESSARY, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CLIENT_COL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_dict, m_client, b_col, v_dict
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     bDict, mClient, bCol, vDict
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMClientCol {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MClientCol> _selectedList;
    protected BehaviorSelector _selector;
    protected MClientColBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMClientCol ready(List<MClientCol> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MClientColBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MClientColBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBDict _foreignBDictLoader;
    public LoaderOfBDict pulloutBDict() {
        if (_foreignBDictLoader == null)
        { _foreignBDictLoader = new LoaderOfBDict().ready(myBhv().pulloutBDict(_selectedList), _selector); }
        return _foreignBDictLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfBCol _foreignBColLoader;
    public LoaderOfBCol pulloutBCol() {
        if (_foreignBColLoader == null)
        { _foreignBColLoader = new LoaderOfBCol().ready(myBhv().pulloutBCol(_selectedList), _selector); }
        return _foreignBColLoader;
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
    public List<MClientCol> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
