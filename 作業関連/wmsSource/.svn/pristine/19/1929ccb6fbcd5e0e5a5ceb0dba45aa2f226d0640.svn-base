package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_shipping_inst_h as TABLE. <br>
 * <pre>
 * [primary key]
 *     SHIPPING_INST_H_ID
 *
 * [column]
 *     SHIPPING_INST_H_ID, CLIENT_ID, CENTER_ID, PROCESS_TYPE_ID, INPUT_TYPE, SHIPPING_DT, WORK_DT, DELIV_PLAN_DT, DELIV_DT, DELIV_TZ, CLIENT_SHIPPING_NO, SHIPPING_SLIP_NO, SHIPPING_STATUS, SUPPLY_CUSTOMER_ID, SUPPLY_CUSTOMER_CD, SUPPLY_CUSTOMER_NM, DELIV_CUSTOMER_ID, DELIV_CUSTOMER_CD, DELIV_ZIP_CD, DELIV_ADDRESS1, DELIV_ADDRESS2, DELIV_ADDRESS3, DELIV_ADDRESS_SUPPLY, DELIV_CUSTOMER_NM, DELIV_CUSTOMER_NM1, DELIV_CUSTOMER_NM2, DELIV_TEL_NO, DELIVERY_COURSE_ID, DELIVERY_COURSE_CD, EMERGENCY_FLG, PICKING_WORK_MESSAGE, ERROR_FLG, ERROR_MESSAGE_CD, PICKING_BATCH_NO, STOCK_OUT_FLG, ALLOC_INST_H_ID, COD, COD_TAX, TOTAL_PRICE, TOTAL_TAX, NIZOROE_NO, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SHIPPING_TYPE_ID, SHIPPING_TYPE_CD, CARRIER_ID, CARRIER_CD, SALES_ORG_CD, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, ORDER_DT, KOKYAKU_CD, SHIPPING_FEE, SEPARATE_SHIPPING_FEE, COD_FEE, ORDER_NO_DELIVERY_NOTE, POINT, KOGUCHI_DELIVERY_FLG, RECORD_SEND_FLG, CARRIER_DATA_OUT_FLG, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, NIZOROE_ID, NIZOROE_PROC_UNIT, ACCOUNT_ID, ACCOUNT_CD, SHIPPING_REASON_CD, TRANSFER_FLG, TENHANSHA_SALES_ORDER_NO, DELIV_CD, SALES_ORDER_NUM, DIRECT_DELIVERY_TYPE_CD, SPLIT_DELIVERY_TYPE_CD, CARRIER_TYPE_CD, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_CD, DESTINATION_NM_KANA, DESTINATION_FAX, KANJI_MESSAGE1, KANJI_MESSAGE2, KANJI_MESSAGE3, KANJI_MESSAGE4, KANJI_MESSAGE5, KANJI_MESSAGE6, KANJI_MESSAGE7, KANJI_MESSAGE8, KANJI_MESSAGE9, KANJI_MESSAGE10, KANA_MESSAGE1, KANA_MESSAGE2, KANA_MESSAGE3, KANA_MESSAGE4, KANA_MESSAGE5, KANA_MESSAGE6, KANA_MESSAGE7, KANA_MESSAGE8, KANA_MESSAGE9, KANA_MESSAGE10, DELIVERY_NOTE_SUMMARY, INVOICE_SUMMARY, EC_ORDER_NO, PAYMENT_TYPE_CD, PRICE_HIDDEN_FLG, PAYMENT_HIDDEN_FLG, DIRECT_UPD_FLG, IF_ID, CUSTOMER_CD, CUSTOMER_NM, PSAM, FLOOR_COMP_FLG, DELIVERY_TYPE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_delivery_course, m_process_type, m_customer, m_client, t_alloc_inst_h, m_center, m_zip(ForDeliv), b_class_dtl(ByDelivTz)
 *
 * [referrer table]
 *     t_ec_order_h, t_shipping_inst_b, t_shipping_inst_h_print
 *
 * [foreign property]
 *     mDeliveryCourse, mProcessType, mCustomerByDelivCustomerId, mClient, mCustomerBySupplyCustomerId, tAllocInstH, mCenter, mZipForDeliv, bClassDtlByDelivTz, bClassDtlByEmergencyFlg, bClassDtlByErrorFlg, bClassDtlByInputType, bClassDtlByShippingStatus, bClassDtlByStockOutFlg
 *
 * [referrer property]
 *     tEcOrderHList, tShippingInstBList, tShippingInstHPrintList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTShippingInstH {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TShippingInstH> _selectedList;
    protected BehaviorSelector _selector;
    protected TShippingInstHBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTShippingInstH ready(List<TShippingInstH> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TShippingInstHBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TShippingInstHBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TEcOrderH> _referrerTEcOrderHList;

    /**
     * Load referrer of TEcOrderHList by the set-upper of referrer. <br>
     * t_ec_order_h by SHIPPING_INST_H_ID, named 'TEcOrderHList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTEcOrderHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstH tShippingInstH : <span style="color: #553000">tShippingInstHList</span>) {
     *     ... = tShippingInstH.<span style="color: #CC4747">getTEcOrderHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderH> loadTEcOrderHList(ConditionBeanSetupper<TEcOrderHCB> refCBLambda) {
        myBhv().loadTEcOrderHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderHList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderH().ready(_referrerTEcOrderHList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * t_shipping_inst_b by SHIPPING_INST_H_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstH tShippingInstH : <span style="color: #553000">tShippingInstHList</span>) {
     *     ... = tShippingInstH.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TShippingInstHPrint> _referrerTShippingInstHPrintList;

    /**
     * Load referrer of TShippingInstHPrintList by the set-upper of referrer. <br>
     * t_shipping_inst_h_print by SHIPPING_INST_H_ID, named 'TShippingInstHPrintList'.
     * <pre>
     * <span style="color: #0000C0">tShippingInstHBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tShippingInstHList</span>, <span style="color: #553000">hLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">hLoader</span>.<span style="color: #CC4747">loadTShippingInstHPrintList</span>(<span style="color: #553000">printCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">printCB</span>.setupSelect...
     *         <span style="color: #553000">printCB</span>.query().set...
     *         <span style="color: #553000">printCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">printLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    printLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TShippingInstH tShippingInstH : <span style="color: #553000">tShippingInstHList</span>) {
     *     ... = tShippingInstH.<span style="color: #CC4747">getTShippingInstHPrintList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingInstHId_InScope(pkList);
     * cb.query().addOrderBy_ShippingInstHId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstHPrint> loadTShippingInstHPrintList(ConditionBeanSetupper<TShippingInstHPrintCB> refCBLambda) {
        myBhv().loadTShippingInstHPrintList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHPrintList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstHPrint().ready(_referrerTShippingInstHPrintList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMDeliveryCourse _foreignMDeliveryCourseLoader;
    public LoaderOfMDeliveryCourse pulloutMDeliveryCourse() {
        if (_foreignMDeliveryCourseLoader == null)
        { _foreignMDeliveryCourseLoader = new LoaderOfMDeliveryCourse().ready(myBhv().pulloutMDeliveryCourse(_selectedList), _selector); }
        return _foreignMDeliveryCourseLoader;
    }

    protected LoaderOfMProcessType _foreignMProcessTypeLoader;
    public LoaderOfMProcessType pulloutMProcessType() {
        if (_foreignMProcessTypeLoader == null)
        { _foreignMProcessTypeLoader = new LoaderOfMProcessType().ready(myBhv().pulloutMProcessType(_selectedList), _selector); }
        return _foreignMProcessTypeLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByDelivCustomerIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByDelivCustomerId() {
        if (_foreignMCustomerByDelivCustomerIdLoader == null)
        { _foreignMCustomerByDelivCustomerIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByDelivCustomerId(_selectedList), _selector); }
        return _foreignMCustomerByDelivCustomerIdLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerBySupplyCustomerIdLoader;
    public LoaderOfMCustomer pulloutMCustomerBySupplyCustomerId() {
        if (_foreignMCustomerBySupplyCustomerIdLoader == null)
        { _foreignMCustomerBySupplyCustomerIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerBySupplyCustomerId(_selectedList), _selector); }
        return _foreignMCustomerBySupplyCustomerIdLoader;
    }

    protected LoaderOfTAllocInstH _foreignTAllocInstHLoader;
    public LoaderOfTAllocInstH pulloutTAllocInstH() {
        if (_foreignTAllocInstHLoader == null)
        { _foreignTAllocInstHLoader = new LoaderOfTAllocInstH().ready(myBhv().pulloutTAllocInstH(_selectedList), _selector); }
        return _foreignTAllocInstHLoader;
    }

    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMZip _foreignMZipForDelivLoader;
    public LoaderOfMZip pulloutMZipForDeliv() {
        if (_foreignMZipForDelivLoader == null)
        { _foreignMZipForDelivLoader = new LoaderOfMZip().ready(myBhv().pulloutMZipForDeliv(_selectedList), _selector); }
        return _foreignMZipForDelivLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelivTzLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelivTz() {
        if (_foreignBClassDtlByDelivTzLoader == null)
        { _foreignBClassDtlByDelivTzLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelivTz(_selectedList), _selector); }
        return _foreignBClassDtlByDelivTzLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByEmergencyFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByEmergencyFlg() {
        if (_foreignBClassDtlByEmergencyFlgLoader == null)
        { _foreignBClassDtlByEmergencyFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByEmergencyFlg(_selectedList), _selector); }
        return _foreignBClassDtlByEmergencyFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByErrorFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByErrorFlg() {
        if (_foreignBClassDtlByErrorFlgLoader == null)
        { _foreignBClassDtlByErrorFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByErrorFlg(_selectedList), _selector); }
        return _foreignBClassDtlByErrorFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingStatus() {
        if (_foreignBClassDtlByShippingStatusLoader == null)
        { _foreignBClassDtlByShippingStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingStatus(_selectedList), _selector); }
        return _foreignBClassDtlByShippingStatusLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockOutFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockOutFlg() {
        if (_foreignBClassDtlByStockOutFlgLoader == null)
        { _foreignBClassDtlByStockOutFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockOutFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockOutFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TShippingInstH> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
