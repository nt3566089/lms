package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of t_stock_book as TABLE. <br>
 * <pre>
 * [primary key]
 *     STOCK_BOOK_ID
 *
 * [column]
 *     STOCK_BOOK_ID, BASE_CD, BASE_TYPE_CD, VARIETY_TYPE_CD, PRODUCT_ID, CHARGE_NUM, ALLOC_NUM, SALES_ORG_CD, SALES_ORG_NM, USER_CD, USER_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     STOCK_BOOK_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTStockBook {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TStockBook> _selectedList;
    protected BehaviorSelector _selector;
    protected TStockBookBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTStockBook ready(List<TStockBook> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TStockBookBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TStockBookBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TStockBook> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
