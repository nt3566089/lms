package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_carrier as TABLE. <br>
 * <pre>
 * [primary key]
 *     CARRIER_ID
 *
 * [column]
 *     CARRIER_ID, CENTER_ID, COMMON_CARRIER_ID, CARRIER_CD, CARRIER_NM, CARRIER_ABBR, LARGE_ITEM_HADLING_FLG, HEAVY_ITEM_HADLING_FLG, HOLIDAY_CARRIER_FLG, OKINAWA_FLIGHT_FLG, BASE_DEFAULT_CARRIER_FLG, INSURANCE_CARRIER_CD, SLIP_TYPE_CD, BASE_CD, PROPER_FLG, LANE_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_center, m_common_carrier, b_class_dtl(ByDelFlg)
 *
 * [referrer table]
 *     m_base_sales_org, m_carrier_box, m_carrier_decision, m_delivery_course, m_koguchi_delivery
 *
 * [foreign property]
 *     mCenter, mCommonCarrier, bClassDtlByDelFlg
 *
 * [referrer property]
 *     mBaseSalesOrgList, mCarrierBoxList, mCarrierDecisionByCarrierId2List, mCarrierDecisionByCarrierId1List, mCarrierDecisionByCarrierId3List, mCarrierDecisionByCarrierIdList, mDeliveryCourseList, mKoguchiDeliveryList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMCarrier {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MCarrier> _selectedList;
    protected BehaviorSelector _selector;
    protected MCarrierBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMCarrier ready(List<MCarrier> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MCarrierBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MCarrierBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MBaseSalesOrg> _referrerMBaseSalesOrgList;

    /**
     * Load referrer of MBaseSalesOrgList by the set-upper of referrer. <br>
     * m_base_sales_org by CARRIER_ID, named 'MBaseSalesOrgList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMBaseSalesOrgList</span>(<span style="color: #553000">orgCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">orgCB</span>.setupSelect...
     *         <span style="color: #553000">orgCB</span>.query().set...
     *         <span style="color: #553000">orgCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">orgLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    orgLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMBaseSalesOrgList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMBaseSalesOrg> loadMBaseSalesOrgList(ConditionBeanSetupper<MBaseSalesOrgCB> refCBLambda) {
        myBhv().loadMBaseSalesOrgList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMBaseSalesOrgList = refLs);
        return hd -> hd.handle(new LoaderOfMBaseSalesOrg().ready(_referrerMBaseSalesOrgList, _selector));
    }

    protected List<MCarrierBox> _referrerMCarrierBoxList;

    /**
     * Load referrer of MCarrierBoxList by the set-upper of referrer. <br>
     * m_carrier_box by CARRIER_ID, named 'MCarrierBoxList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierBoxList</span>(<span style="color: #553000">boxCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">boxCB</span>.setupSelect...
     *         <span style="color: #553000">boxCB</span>.query().set...
     *         <span style="color: #553000">boxCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">boxLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    boxLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierBoxList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierBox> loadMCarrierBoxList(ConditionBeanSetupper<MCarrierBoxCB> refCBLambda) {
        myBhv().loadMCarrierBoxList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierBoxList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierBox().ready(_referrerMCarrierBoxList, _selector));
    }

    protected List<MCarrierDecision> _referrerMCarrierDecisionByCarrierId2List;

    /**
     * Load referrer of MCarrierDecisionByCarrierId2List by the set-upper of referrer. <br>
     * m_carrier_decision by CARRIER_ID2, named 'MCarrierDecisionByCarrierId2List'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionByCarrierId2List</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierDecisionByCarrierId2List()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId2_InScope(pkList);
     * cb.query().addOrderBy_CarrierId2_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionByCarrierId2List(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionByCarrierId2List(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionByCarrierId2List = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionByCarrierId2List, _selector));
    }

    protected List<MCarrierDecision> _referrerMCarrierDecisionByCarrierId1List;

    /**
     * Load referrer of MCarrierDecisionByCarrierId1List by the set-upper of referrer. <br>
     * m_carrier_decision by CARRIER_ID1, named 'MCarrierDecisionByCarrierId1List'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionByCarrierId1List</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierDecisionByCarrierId1List()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId1_InScope(pkList);
     * cb.query().addOrderBy_CarrierId1_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionByCarrierId1List(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionByCarrierId1List(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionByCarrierId1List = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionByCarrierId1List, _selector));
    }

    protected List<MCarrierDecision> _referrerMCarrierDecisionByCarrierId3List;

    /**
     * Load referrer of MCarrierDecisionByCarrierId3List by the set-upper of referrer. <br>
     * m_carrier_decision by CARRIER_ID3, named 'MCarrierDecisionByCarrierId3List'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionByCarrierId3List</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierDecisionByCarrierId3List()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId3_InScope(pkList);
     * cb.query().addOrderBy_CarrierId3_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionByCarrierId3List(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionByCarrierId3List(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionByCarrierId3List = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionByCarrierId3List, _selector));
    }

    protected List<MCarrierDecision> _referrerMCarrierDecisionByCarrierIdList;

    /**
     * Load referrer of MCarrierDecisionByCarrierIdList by the set-upper of referrer. <br>
     * m_carrier_decision by CARRIER_ID, named 'MCarrierDecisionByCarrierIdList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMCarrierDecisionByCarrierIdList</span>(<span style="color: #553000">decisionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">decisionCB</span>.setupSelect...
     *         <span style="color: #553000">decisionCB</span>.query().set...
     *         <span style="color: #553000">decisionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">decisionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    decisionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMCarrierDecisionByCarrierIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMCarrierDecision> loadMCarrierDecisionByCarrierIdList(ConditionBeanSetupper<MCarrierDecisionCB> refCBLambda) {
        myBhv().loadMCarrierDecisionByCarrierIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMCarrierDecisionByCarrierIdList = refLs);
        return hd -> hd.handle(new LoaderOfMCarrierDecision().ready(_referrerMCarrierDecisionByCarrierIdList, _selector));
    }

    protected List<MDeliveryCourse> _referrerMDeliveryCourseList;

    /**
     * Load referrer of MDeliveryCourseList by the set-upper of referrer. <br>
     * m_delivery_course by CARRIER_ID, named 'MDeliveryCourseList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMDeliveryCourseList</span>(<span style="color: #553000">courseCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">courseCB</span>.setupSelect...
     *         <span style="color: #553000">courseCB</span>.query().set...
     *         <span style="color: #553000">courseCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">courseLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    courseLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMDeliveryCourseList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDeliveryCourse> loadMDeliveryCourseList(ConditionBeanSetupper<MDeliveryCourseCB> refCBLambda) {
        myBhv().loadMDeliveryCourseList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDeliveryCourseList = refLs);
        return hd -> hd.handle(new LoaderOfMDeliveryCourse().ready(_referrerMDeliveryCourseList, _selector));
    }

    protected List<MKoguchiDelivery> _referrerMKoguchiDeliveryList;

    /**
     * Load referrer of MKoguchiDeliveryList by the set-upper of referrer. <br>
     * m_koguchi_delivery by CARRIER_ID, named 'MKoguchiDeliveryList'.
     * <pre>
     * <span style="color: #0000C0">mCarrierBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mCarrierList</span>, <span style="color: #553000">carrierLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">carrierLoader</span>.<span style="color: #CC4747">loadMKoguchiDeliveryList</span>(<span style="color: #553000">deliveryCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">deliveryCB</span>.setupSelect...
     *         <span style="color: #553000">deliveryCB</span>.query().set...
     *         <span style="color: #553000">deliveryCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">deliveryLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    deliveryLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MCarrier mCarrier : <span style="color: #553000">mCarrierList</span>) {
     *     ... = mCarrier.<span style="color: #CC4747">getMKoguchiDeliveryList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCarrierId_InScope(pkList);
     * cb.query().addOrderBy_CarrierId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMKoguchiDelivery> loadMKoguchiDeliveryList(ConditionBeanSetupper<MKoguchiDeliveryCB> refCBLambda) {
        myBhv().loadMKoguchiDeliveryList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMKoguchiDeliveryList = refLs);
        return hd -> hd.handle(new LoaderOfMKoguchiDelivery().ready(_referrerMKoguchiDeliveryList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMCenter _foreignMCenterLoader;
    public LoaderOfMCenter pulloutMCenter() {
        if (_foreignMCenterLoader == null)
        { _foreignMCenterLoader = new LoaderOfMCenter().ready(myBhv().pulloutMCenter(_selectedList), _selector); }
        return _foreignMCenterLoader;
    }

    protected LoaderOfMCommonCarrier _foreignMCommonCarrierLoader;
    public LoaderOfMCommonCarrier pulloutMCommonCarrier() {
        if (_foreignMCommonCarrierLoader == null)
        { _foreignMCommonCarrierLoader = new LoaderOfMCommonCarrier().ready(myBhv().pulloutMCommonCarrier(_selectedList), _selector); }
        return _foreignMCommonCarrierLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MCarrier> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
