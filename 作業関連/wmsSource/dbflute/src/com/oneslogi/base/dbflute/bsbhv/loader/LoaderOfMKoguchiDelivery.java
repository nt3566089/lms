package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of m_koguchi_delivery as TABLE. <br>
 * <pre>
 * [primary key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, BASE_CD, SERV_SALES_ORG_ID, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, CARRIER_ID, REQ_SALES_ORG_ID, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     KOGUCHI_DELIVERY_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_sales_org, m_carrier
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mSalesOrg, mCarrier
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMKoguchiDelivery {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MKoguchiDelivery> _selectedList;
    protected BehaviorSelector _selector;
    protected MKoguchiDeliveryBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMKoguchiDelivery ready(List<MKoguchiDelivery> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MKoguchiDeliveryBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MKoguchiDeliveryBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMSalesOrg _foreignMSalesOrgLoader;
    public LoaderOfMSalesOrg pulloutMSalesOrg() {
        if (_foreignMSalesOrgLoader == null)
        { _foreignMSalesOrgLoader = new LoaderOfMSalesOrg().ready(myBhv().pulloutMSalesOrg(_selectedList), _selector); }
        return _foreignMSalesOrgLoader;
    }

    protected LoaderOfMCarrier _foreignMCarrierLoader;
    public LoaderOfMCarrier pulloutMCarrier() {
        if (_foreignMCarrierLoader == null)
        { _foreignMCarrierLoader = new LoaderOfMCarrier().ready(myBhv().pulloutMCarrier(_selectedList), _selector); }
        return _foreignMCarrierLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MKoguchiDelivery> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
