package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_location_replenish_product as TABLE. <br>
 * <pre>
 * [primary key]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [column]
 *     LOCATION_REPLENISH_PRODUCT_ID, LOCATION_ID, REPLENISH_PRODUCT_ID, REPLENISH_DEPOSIT_ID, REPLENISH_P_NUM, MAX_STORE_PRODUCT_SHAPE_ID, MAX_STORE_NUM, REPLENISH_STOCK_TYPE_ID, REPLENISH_P_PRODUCT_SHAPE_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     LOCATION_REPLENISH_PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_customer, m_product_shape, m_shape, m_product, m_location, m_stock_type
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, mProductShape, mShape, mProduct, mLocation, mStockType
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMLocationReplenishProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MLocationReplenishProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MLocationReplenishProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMLocationReplenishProduct ready(List<MLocationReplenishProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MLocationReplenishProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MLocationReplenishProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMProductShape _foreignMProductShapeLoader;
    public LoaderOfMProductShape pulloutMProductShape() {
        if (_foreignMProductShapeLoader == null)
        { _foreignMProductShapeLoader = new LoaderOfMProductShape().ready(myBhv().pulloutMProductShape(_selectedList), _selector); }
        return _foreignMProductShapeLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MLocationReplenishProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
