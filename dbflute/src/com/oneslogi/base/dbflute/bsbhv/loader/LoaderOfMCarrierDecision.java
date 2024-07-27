package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_carrier_decision as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_DECISION_ID
 *
 * [column]
 *     CARRIER_DECISION_ID, CENTER_CD, ZIP_CD, SALES_ORG_ID, SALES_ORG_CD, CUSTOMER_ID, CUSTOMER_CD, DIRECT_KOHAI_TYPE_CD, PREFECTURE, CARRIER_ID, CARRIER_CD, CARRIER_ID1, CARRIER_CD1, CARRIER_ID2, CARRIER_CD2, CARRIER_ID3, CARRIER_CD3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_DECISION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_customer, m_carrier, m_sales_org
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCustomer, mCarrierByCarrierId2, mCarrierByCarrierId1, mCarrierByCarrierId3, mCarrierByCarrierId, mSalesOrg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrierDecision {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrierDecision> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierDecisionBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrierDecision ready(List<MCarrierDecision> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierDecisionBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierDecisionBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCustomer _foreignMCustomerLoader;
    public LoaderOfMCustomer pulloutMCustomer() {
        if (_foreignMCustomerLoader == null)
        { _foreignMCustomerLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomer(_selectedList), _selector); }
        return _foreignMCustomerLoader;
    }

    protected LoaderOfMCarrier _foreignMCarrierByCarrierId2Loader;
    public LoaderOfMCarrier pulloutMCarrierByCarrierId2() {
        if (_foreignMCarrierByCarrierId2Loader == null)
        { _foreignMCarrierByCarrierId2Loader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrierByCarrierId2(_selectedList), _selector); }
        return _foreignMCarrierByCarrierId2Loader;
    }

    protected LoaderOfMCarrier _foreignMCarrierByCarrierId1Loader;
    public LoaderOfMCarrier pulloutMCarrierByCarrierId1() {
        if (_foreignMCarrierByCarrierId1Loader == null)
        { _foreignMCarrierByCarrierId1Loader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrierByCarrierId1(_selectedList), _selector); }
        return _foreignMCarrierByCarrierId1Loader;
    }

    protected LoaderOfMCarrier _foreignMCarrierByCarrierId3Loader;
    public LoaderOfMCarrier pulloutMCarrierByCarrierId3() {
        if (_foreignMCarrierByCarrierId3Loader == null)
        { _foreignMCarrierByCarrierId3Loader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrierByCarrierId3(_selectedList), _selector); }
        return _foreignMCarrierByCarrierId3Loader;
    }

    protected LoaderOfMCarrier _foreignMCarrierByCarrierIdLoader;
    public LoaderOfMCarrier pulloutMCarrierByCarrierId() {
        if (_foreignMCarrierByCarrierIdLoader == null)
        { _foreignMCarrierByCarrierIdLoader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrierByCarrierId(_selectedList), _selector); }
        return _foreignMCarrierByCarrierIdLoader;
    }

    protected LoaderOfMSalesOrg _foreignMSalesOrgLoader;
    public LoaderOfMSalesOrg pulloutMSalesOrg() {
        if (_foreignMSalesOrgLoader == null)
        { _foreignMSalesOrgLoader = new LoaderOfMSalesOrg().ready(myBhv().pulloutMSalesOrg(_selectedList), _selector); }
        return _foreignMSalesOrgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrierDecision> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
