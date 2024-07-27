package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_deposit_product as TABLE. <br>
 * <pre>
 * [primary key]
 *     DEPOSIT_PRODUCT_ID
 *
 * [column]
 *     DEPOSIT_PRODUCT_ID, SALES_ORG_ID, ACCOUNT_ID, ACCOUNT_CD, PRODUCT_ID, DEPOSIT_JAN_CD, ID_MANAG_TYPE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     DEPOSIT_PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_sales_org, m_customer, m_product
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mSalesOrg, mCustomer, mProduct
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMDepositProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MDepositProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MDepositProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMDepositProduct ready(List<MDepositProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MDepositProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MDepositProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMSalesOrg _foreignMSalesOrgLoader;
    public LoaderOfMSalesOrg pulloutMSalesOrg() {
        if (_foreignMSalesOrgLoader == null)
        { _foreignMSalesOrgLoader = new LoaderOfMSalesOrg().ready(myBhv().pulloutMSalesOrg(_selectedList), _selector); }
        return _foreignMSalesOrgLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MDepositProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
