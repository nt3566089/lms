package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_shipping_record_h as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_RECORD_H_ID
 *
 * [column]
 *     SHIPPING_RECORD_H_ID, CLIENT_ID, SHIPPING_SLIP_NO, SALES_ORDER_NO, SHIPPING_DT, SHIPPING_STORAGE_SPACE_CD, NIZOROE_NO, DAIHYO_NIZOROE_NO, CARRIER_SLIP_NO, CARRIER_CD, CARRIER_RNM, SALES_NO2, DELIVERY_SLIP_NO, D_STR, I_STR, S4_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_client
 *
 * [referrer table]
 *     t_shipping_record_b
 *
 * [foreign property]
 *     mClient
 *
 * [referrer property]
 *     tShippingRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingRecordH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingRecordH> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingRecordHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingRecordH ready(List<TShippingRecordH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingRecordHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingRecordHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TShippingRecordB> _referrerTShippingRecordBList;

    /**
     * Load referrer of TShippingRecordBList by the set-upper of referrer. <br>
     * t_shipping_record_b by SHIPPING_RECORD_H_ID, named 'TShippingRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingRecordHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingRecordHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingRecordH tShippingRecordH : <span style="color: #553000">tShippingRecordHList</span>) {
     *     ... = tShippingRecordH.<span style="color: #CC4747">getTShippingRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingRecordHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingRecordHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingRecordB> loadTShippingRecordBList(ConditionBeanSetupper<TShippingRecordBCB> refCBLambda) {
        myBhv().loadTShippingRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingRecordB().ready(_referrerTShippingRecordBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingRecordH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
