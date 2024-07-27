package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_base_sales_org as TABLE. <br>
 * <pre>
 * [primary key]
 *     BASE_SALES_ORG_ID
 *
 * [column]
 *     BASE_SALES_ORG_ID, BASE_CD, SALES_ORG_ID, CARRIER_ID, CARRIER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BASE_SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_carrier, m_sales_org
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mCarrier, mSalesOrg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMBaseSalesOrg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MBaseSalesOrg> _selectedList;
    protected BehaviorSelector _selector;
    protected MBaseSalesOrgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMBaseSalesOrg ready(List<MBaseSalesOrg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MBaseSalesOrgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MBaseSalesOrgBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCarrier _foreignMCarrierLoader;
    public LoaderOfMCarrier pulloutMCarrier() {
        if (_foreignMCarrierLoader == null)
        { _foreignMCarrierLoader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrier(_selectedList), _selector); }
        return _foreignMCarrierLoader;
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
    public List<MBaseSalesOrg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
