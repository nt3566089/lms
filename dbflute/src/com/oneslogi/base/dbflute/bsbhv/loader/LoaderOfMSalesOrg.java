package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_sales_org as TABLE. <br>
 * <pre>
 * [primary key]
 *     SALES_ORG_ID
 *
 * [column]
 *     SALES_ORG_ID, SALES_ORG_CD, PURCHASE_ORG_CD, TENHANSHA_CD, TENHANSHA_NM1, TENHANSHA_NM2, TENHANSHA_ZIP_CD, TENHANSHA_PREFECTURE, TENHANSHA_ADDRESS1, TENHANSHA_ADDRESS2, TENHANSHA_TEL_NO, TENHANSHA_FAX_NO, PLANT_NORMAL, PLANT_DEPOSIT, LP_SEND_FLG, WMS_SEND_FLG, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SALES_ORG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     
 *
 * [referrer table]
 *     m_base_sales_org, m_carrier_decision, m_customer_picking, m_deposit_product, m_koguchi_delivery, t_inventory_b, t_shipping_inst_h
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     mBaseSalesOrgList, mCarrierDecisionList, mCustomerPickingList, mDepositProductList, mKoguchiDeliveryList, tInventoryBList, tShippingInstHBySalesOrgList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMSalesOrg {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MSalesOrg> _selectedList;
    protected BehaviorSelector _selector;
    protected MSalesOrgBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMSalesOrg ready(List<MSalesOrg> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MSalesOrgBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MSalesOrgBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MBaseSalesOrg> _referrerMBaseSalesOrgList;

    /**
     * Load referrer of MBaseSalesOrgList by the set-upper of referrer. <br>
     * m_base_sales_org by SALES_ORG_ID, named 'MBaseSalesOrgList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadMBaseSalesOrgList</span>(<span style="color: #553000">orgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">orgCB</span>.setupSelect...
     *         <span style="color: #553000">orgCB</span>.query().set...
     *         <span style="color: #553000">orgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">orgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    orgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMBaseSalesOrgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBaseSalesOrg> loadMBaseSalesOrgList(ConditionBeanSetupper<MBaseSalesOrgCB> refCBLambda) {
        myBhv().loadMBaseSalesOrgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBaseSalesOrgList = refLs);
        return hd -> hd.handle(new LoaderOfMBaseSalesOrg().ready(_referrerMBaseSalesOrgList, _selector));
    }

    protected List<MCarrierDecision> _referrerMCarrierDecisionList;

    /**
     * Load referrer of MCarrierDecisionList by the set-upper of referrer. <br>
     * m_carrier_decision by SALES_ORG_ID, named 'MCarrierDecisionList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionList</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMCarrierDecisionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionList(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionList, _selector));
    }

    protected List<MCustomerPicking> _referrerMCustomerPickingList;

    /**
     * Load referrer of MCustomerPickingList by the set-upper of referrer. <br>
     * m_customer_picking by SALES_ORG_ID, named 'MCustomerPickingList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadMCustomerPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMCustomerPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCustomerPicking> loadMCustomerPickingList(ConditionBeanSetupper<MCustomerPickingCB> refCBLambda) {
        myBhv().loadMCustomerPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCustomerPickingList = refLs);
        return hd -> hd.handle(new LoaderOfMCustomerPicking().ready(_referrerMCustomerPickingList, _selector));
    }

    protected List<MDepositProduct> _referrerMDepositProductList;

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by SALES_ORG_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMDepositProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDepositProduct> loadMDepositProductList(ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        myBhv().loadMDepositProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDepositProductList = refLs);
        return hd -> hd.handle(new LoaderOfMDepositProduct().ready(_referrerMDepositProductList, _selector));
    }

    protected List<MKoguchiDelivery> _referrerMKoguchiDeliveryList;

    /**
     * Load referrer of MKoguchiDeliveryList by the set-upper of referrer. <br>
     * m_koguchi_delivery by SERV_SALES_ORG_ID, named 'MKoguchiDeliveryList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadMKoguchiDeliveryList</span>(<span style="color: #553000">deliveryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">deliveryCB</span>.setupSelect...
     *         <span style="color: #553000">deliveryCB</span>.query().set...
     *         <span style="color: #553000">deliveryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">deliveryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    deliveryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getMKoguchiDeliveryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setServSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_ServSalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMKoguchiDelivery> loadMKoguchiDeliveryList(ConditionBeanSetupper<MKoguchiDeliveryCB> refCBLambda) {
        myBhv().loadMKoguchiDeliveryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMKoguchiDeliveryList = refLs);
        return hd -> hd.handle(new LoaderOfMKoguchiDelivery().ready(_referrerMKoguchiDeliveryList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by SALES_ORG_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgId_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TShippingInstH> _referrerTShippingInstHBySalesOrgList;

    /**
     * Load referrer of TShippingInstHBySalesOrgList by the set-upper of referrer. <br>
     * t_shipping_inst_h by SALES_ORG_CD, named 'TShippingInstHBySalesOrgList'.
     * <pre>
     * <span style="color: #0000C0">mSalesOrgBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mSalesOrgList</span>, <span style="color: #553000">orgLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">orgLoader</span>.<span style="color: #CC4747">loadTShippingInstHBySalesOrgList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MSalesOrg mSalesOrg : <span style="color: #553000">mSalesOrgList</span>) {
     *     ... = mSalesOrg.<span style="color: #CC4747">getTShippingInstHBySalesOrgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSalesOrgCd_InScope(pkList);
     * cb.query().addOrderBy_SalesOrgCd_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstH> loadTShippingInstHBySalesOrgList(ConditionBeanSetupper<TShippingInstHCB> refCBLambda) {
        myBhv().loadTShippingInstHBySalesOrgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstHBySalesOrgList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstH().ready(_referrerTShippingInstHBySalesOrgList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MSalesOrg> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
