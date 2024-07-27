package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_customer_picking as TABLE. <br>
 * <pre>
 * [primary key]
 *     CUSTOMER_PICKING_ID
 *
 * [column]
 *     CUSTOMER_PICKING_ID, CENTER_ID, CENTER_CD, SALES_ORG_ID, SALES_ORG_CD, CUSTOMER_ID, CUSTOMER_CD, PICK_PATTERN_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CUSTOMER_PICKING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_sales_org, m_customer
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCenter, mSalesOrg, mCustomer
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCustomerPicking {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCustomerPicking> _selectedList;
    protected BehaviorSelector _selector;
    protected MCustomerPickingBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCustomerPicking ready(List<MCustomerPicking> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCustomerPickingBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCustomerPickingBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

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

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCustomerPicking> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
