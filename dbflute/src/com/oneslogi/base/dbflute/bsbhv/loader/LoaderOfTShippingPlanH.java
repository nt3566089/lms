package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_shipping_plan_h as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_PLAN_H_ID
 *
 * [column]
 *     SHIPPING_PLAN_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, SLIP_TYPE_CD, SALES_ORDER_SLIP_TYPE_CD, DIRECT_DELIVERY_TYPE_CD, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, SALES_ORG_CD, KOGUCHI_DELIVERY_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_REASON_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TENHANSHA_CD, TENHANSHA_ORDER_NO, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_FAX, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_PLAN_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     t_shipping_plan_b
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     tShippingPlanBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingPlanH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingPlanH> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingPlanHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingPlanH ready(List<TShippingPlanH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingPlanHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingPlanHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TShippingPlanB> _referrerTShippingPlanBList;

    /**
     * Load referrer of TShippingPlanBList by the set-upper of referrer. <br>
     * t_shipping_plan_b by SHIPPING_PLAN_H_ID, named 'TShippingPlanBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingPlanHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingPlanHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingPlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingPlanH tShippingPlanH : <span style="color: #553000">tShippingPlanHList</span>) {
     *     ... = tShippingPlanH.<span style="color: #CC4747">getTShippingPlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingPlanHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingPlanHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingPlanB> loadTShippingPlanBList(ConditionBeanSetupper<TShippingPlanBCB> refCBLambda) {
        myBhv().loadTShippingPlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingPlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingPlanB().ready(_referrerTShippingPlanBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingPlanH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
