package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of b_user as TABLE. <br>
 * <pre>
 * [primary key]
 *     USER_ID
 *
 * [column]
 *     USER_ID, USER_CD, USER_NM, CULTURE_ID, ROLE_GRP_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     USER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     b_culture, b_role_grp, b_class_dtl(ByDelFlg), b_user_auth(AsOne), m_user_login(AsOne)
 *
 * [referrer table]
 *     m_user_center, m_user_client, m_user_deposit, t_ec_order_r, t_inventory_b, t_inventory_r, t_move_inst_r, t_move_record_b, t_nizoroe_alarm_log, t_packing_r, t_picking_r, t_receive_label, t_receive_plan_r, t_store_no_r, t_store_record_r, w_sgl_row_ship_insp_b, t_packing_h, b_user_auth, m_user_login
 *
 * [foreign property]
 *     bCulture, bRoleGrp, bClassDtlByDelFlg, bUserAuthAsOne, mUserLoginAsOne
 *
 * [referrer property]
 *     mUserCenterList, mUserClientList, mUserDepositList, tEcOrderRList, tInventoryBByInventoryUpdUserIdList, tInventoryBByInventoryUserIdList, tInventoryRByInventoryRecordLocOutUserIdList, tInventoryRByStockDiffOutUserIdList, tInventoryRByTwlOutUserIdList, tInventoryRByInventoryRecordOutUserIdList, tInventoryRByInventoryDiffOutUserIdList, tMoveInstRList, tMoveRecordBList, tNizoroeAlarmLogList, tPackingRByStwOutUserIdList, tPackingRByInspectionOutUserIdList, tPackingRByTagOutUserIdList, tPickingRByCaseOutUserIdList, tPickingRByBolOutUserIdList, tPickingRByPl1OutUserIdList, tPickingRByTagOutUserIdList, tPickingRByShippingRecordOutUserIdList, tPickingRByDelivOutUserIdList, tPickingRByIndvSupplyOutUserIdList, tPickingRByPackingOutUserIdList, tPickingRByPlOutUserIdList, tPickingRByIndvLabelOutUserIdList, tPickingRByPl2OutUserIdList, tPickingRBySlipOutUserIdList, tPickingRByNizoroeOutUserIdList, tPickingRByPllOutUserIdList, tReceiveLabelList, tReceivePlanRList, tStoreNoRList, tStoreRecordRList, wSglRowShipInspBList, tPackingHByUpdUserList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfBUser {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<BUser> _selectedList;
    protected BehaviorSelector _selector;
    protected BUserBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfBUser ready(List<BUser> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected BUserBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(BUserBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<MUserCenter> _referrerMUserCenterList;

    /**
     * Load referrer of MUserCenterList by the set-upper of referrer. <br>
     * m_user_center by USER_ID, named 'MUserCenterList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserCenterList</span>(<span style="color: #553000">centerCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">centerCB</span>.setupSelect...
     *         <span style="color: #553000">centerCB</span>.query().set...
     *         <span style="color: #553000">centerCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">centerLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    centerLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserCenterList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserCenter> loadMUserCenterList(ConditionBeanSetupper<MUserCenterCB> refCBLambda) {
        myBhv().loadMUserCenterList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserCenterList = refLs);
        return hd -> hd.handle(new LoaderOfMUserCenter().ready(_referrerMUserCenterList, _selector));
    }

    protected List<MUserClient> _referrerMUserClientList;

    /**
     * Load referrer of MUserClientList by the set-upper of referrer. <br>
     * m_user_client by USER_ID, named 'MUserClientList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserClientList</span>(<span style="color: #553000">clientCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">clientCB</span>.setupSelect...
     *         <span style="color: #553000">clientCB</span>.query().set...
     *         <span style="color: #553000">clientCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">clientLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    clientLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserClientList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserClient> loadMUserClientList(ConditionBeanSetupper<MUserClientCB> refCBLambda) {
        myBhv().loadMUserClientList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserClientList = refLs);
        return hd -> hd.handle(new LoaderOfMUserClient().ready(_referrerMUserClientList, _selector));
    }

    protected List<MUserDeposit> _referrerMUserDepositList;

    /**
     * Load referrer of MUserDepositList by the set-upper of referrer. <br>
     * m_user_deposit by USER_ID, named 'MUserDepositList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadMUserDepositList</span>(<span style="color: #553000">depositCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">depositCB</span>.setupSelect...
     *         <span style="color: #553000">depositCB</span>.query().set...
     *         <span style="color: #553000">depositCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">depositLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    depositLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getMUserDepositList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMUserDeposit> loadMUserDepositList(ConditionBeanSetupper<MUserDepositCB> refCBLambda) {
        myBhv().loadMUserDepositList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMUserDepositList = refLs);
        return hd -> hd.handle(new LoaderOfMUserDeposit().ready(_referrerMUserDepositList, _selector));
    }

    protected List<TEcOrderR> _referrerTEcOrderRList;

    /**
     * Load referrer of TEcOrderRList by the set-upper of referrer. <br>
     * t_ec_order_r by STATEMENT_OUT_USER_ID, named 'TEcOrderRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTEcOrderRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTEcOrderRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStatementOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StatementOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTEcOrderR> loadTEcOrderRList(ConditionBeanSetupper<TEcOrderRCB> refCBLambda) {
        myBhv().loadTEcOrderRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTEcOrderRList = refLs);
        return hd -> hd.handle(new LoaderOfTEcOrderR().ready(_referrerTEcOrderRList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBByInventoryUpdUserIdList;

    /**
     * Load referrer of TInventoryBByInventoryUpdUserIdList by the set-upper of referrer. <br>
     * t_inventory_b by INVENTORY_UPD_USER_ID, named 'TInventoryBByInventoryUpdUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryBByInventoryUpdUserIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryBByInventoryUpdUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryUpdUserId_InScope(pkList);
     * cb.query().addOrderBy_InventoryUpdUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBByInventoryUpdUserIdList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBByInventoryUpdUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBByInventoryUpdUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBByInventoryUpdUserIdList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBByInventoryUserIdList;

    /**
     * Load referrer of TInventoryBByInventoryUserIdList by the set-upper of referrer. <br>
     * t_inventory_b by INVENTORY_USER_ID, named 'TInventoryBByInventoryUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryBByInventoryUserIdList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryBByInventoryUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryUserId_InScope(pkList);
     * cb.query().addOrderBy_InventoryUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBByInventoryUserIdList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBByInventoryUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBByInventoryUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBByInventoryUserIdList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRByInventoryRecordLocOutUserIdList;

    /**
     * Load referrer of TInventoryRByInventoryRecordLocOutUserIdList by the set-upper of referrer. <br>
     * t_inventory_r by INVENTORY_RECORD_LOC_OUT_USER_ID, named 'TInventoryRByInventoryRecordLocOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRByInventoryRecordLocOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRByInventoryRecordLocOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryRecordLocOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InventoryRecordLocOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRByInventoryRecordLocOutUserIdList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRByInventoryRecordLocOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRByInventoryRecordLocOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRByInventoryRecordLocOutUserIdList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRByStockDiffOutUserIdList;

    /**
     * Load referrer of TInventoryRByStockDiffOutUserIdList by the set-upper of referrer. <br>
     * t_inventory_r by STOCK_DIFF_OUT_USER_ID, named 'TInventoryRByStockDiffOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRByStockDiffOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRByStockDiffOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStockDiffOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StockDiffOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRByStockDiffOutUserIdList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRByStockDiffOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRByStockDiffOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRByStockDiffOutUserIdList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRByTwlOutUserIdList;

    /**
     * Load referrer of TInventoryRByTwlOutUserIdList by the set-upper of referrer. <br>
     * t_inventory_r by TWL_OUT_USER_ID, named 'TInventoryRByTwlOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRByTwlOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRByTwlOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRByTwlOutUserIdList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRByTwlOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRByTwlOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRByTwlOutUserIdList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRByInventoryRecordOutUserIdList;

    /**
     * Load referrer of TInventoryRByInventoryRecordOutUserIdList by the set-upper of referrer. <br>
     * t_inventory_r by INVENTORY_RECORD_OUT_USER_ID, named 'TInventoryRByInventoryRecordOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRByInventoryRecordOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRByInventoryRecordOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InventoryRecordOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRByInventoryRecordOutUserIdList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRByInventoryRecordOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRByInventoryRecordOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRByInventoryRecordOutUserIdList, _selector));
    }

    protected List<TInventoryR> _referrerTInventoryRByInventoryDiffOutUserIdList;

    /**
     * Load referrer of TInventoryRByInventoryDiffOutUserIdList by the set-upper of referrer. <br>
     * t_inventory_r by INVENTORY_DIFF_OUT_USER_ID, named 'TInventoryRByInventoryDiffOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTInventoryRByInventoryDiffOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTInventoryRByInventoryDiffOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInventoryDiffOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InventoryDiffOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryR> loadTInventoryRByInventoryDiffOutUserIdList(ConditionBeanSetupper<TInventoryRCB> refCBLambda) {
        myBhv().loadTInventoryRByInventoryDiffOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryRByInventoryDiffOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryR().ready(_referrerTInventoryRByInventoryDiffOutUserIdList, _selector));
    }

    protected List<TMoveInstR> _referrerTMoveInstRList;

    /**
     * Load referrer of TMoveInstRList by the set-upper of referrer. <br>
     * t_move_inst_r by INST_OUT_USER_ID, named 'TMoveInstRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTMoveInstRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTMoveInstRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInstOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InstOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstR> loadTMoveInstRList(ConditionBeanSetupper<TMoveInstRCB> refCBLambda) {
        myBhv().loadTMoveInstRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstRList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstR().ready(_referrerTMoveInstRList, _selector));
    }

    protected List<TMoveRecordB> _referrerTMoveRecordBList;

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * t_move_record_b by USER_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveRecordB> loadTMoveRecordBList(ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        myBhv().loadTMoveRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveRecordB().ready(_referrerTMoveRecordBList, _selector));
    }

    protected List<TNizoroeAlarmLog> _referrerTNizoroeAlarmLogList;

    /**
     * Load referrer of TNizoroeAlarmLogList by the set-upper of referrer. <br>
     * t_nizoroe_alarm_log by OUT_USER_ID, named 'TNizoroeAlarmLogList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTNizoroeAlarmLogList</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTNizoroeAlarmLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setOutUserId_InScope(pkList);
     * cb.query().addOrderBy_OutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTNizoroeAlarmLog> loadTNizoroeAlarmLogList(ConditionBeanSetupper<TNizoroeAlarmLogCB> refCBLambda) {
        myBhv().loadTNizoroeAlarmLogList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTNizoroeAlarmLogList = refLs);
        return hd -> hd.handle(new LoaderOfTNizoroeAlarmLog().ready(_referrerTNizoroeAlarmLogList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByStwOutUserIdList;

    /**
     * Load referrer of TPackingRByStwOutUserIdList by the set-upper of referrer. <br>
     * t_packing_r by STW_OUT_USER_ID, named 'TPackingRByStwOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByStwOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByStwOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setStwOutUserId_InScope(pkList);
     * cb.query().addOrderBy_StwOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByStwOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByStwOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByStwOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByStwOutUserIdList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByInspectionOutUserIdList;

    /**
     * Load referrer of TPackingRByInspectionOutUserIdList by the set-upper of referrer. <br>
     * t_packing_r by INSPECTION_OUT_USER_ID, named 'TPackingRByInspectionOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByInspectionOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByInspectionOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setInspectionOutUserId_InScope(pkList);
     * cb.query().addOrderBy_InspectionOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByInspectionOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByInspectionOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByInspectionOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByInspectionOutUserIdList, _selector));
    }

    protected List<TPackingR> _referrerTPackingRByTagOutUserIdList;

    /**
     * Load referrer of TPackingRByTagOutUserIdList by the set-upper of referrer. <br>
     * t_packing_r by TAG_OUT_USER_ID, named 'TPackingRByTagOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingRByTagOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingRByTagOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTagOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TagOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingR> loadTPackingRByTagOutUserIdList(ConditionBeanSetupper<TPackingRCB> refCBLambda) {
        myBhv().loadTPackingRByTagOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingRByTagOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingR().ready(_referrerTPackingRByTagOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByCaseOutUserIdList;

    /**
     * Load referrer of TPickingRByCaseOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by CASE_OUT_USER_ID, named 'TPickingRByCaseOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByCaseOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByCaseOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setCaseOutUserId_InScope(pkList);
     * cb.query().addOrderBy_CaseOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByCaseOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByCaseOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByCaseOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByCaseOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByBolOutUserIdList;

    /**
     * Load referrer of TPickingRByBolOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by BOL_OUT_USER_ID, named 'TPickingRByBolOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByBolOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByBolOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setBolOutUserId_InScope(pkList);
     * cb.query().addOrderBy_BolOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByBolOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByBolOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByBolOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByBolOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPl1OutUserIdList;

    /**
     * Load referrer of TPickingRByPl1OutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by PL1_OUT_USER_ID, named 'TPickingRByPl1OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPl1OutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl1OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl1OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl1OutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPl1OutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPl1OutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPl1OutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPl1OutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByTagOutUserIdList;

    /**
     * Load referrer of TPickingRByTagOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by TAG_OUT_USER_ID, named 'TPickingRByTagOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByTagOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByTagOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTagOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TagOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByTagOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByTagOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByTagOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByTagOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByShippingRecordOutUserIdList;

    /**
     * Load referrer of TPickingRByShippingRecordOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by SHIPPING_RECORD_OUT_USER_ID, named 'TPickingRByShippingRecordOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByShippingRecordOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByShippingRecordOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setShippingRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ShippingRecordOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByShippingRecordOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByShippingRecordOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByShippingRecordOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByShippingRecordOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByDelivOutUserIdList;

    /**
     * Load referrer of TPickingRByDelivOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by DELIV_OUT_USER_ID, named 'TPickingRByDelivOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByDelivOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByDelivOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setDelivOutUserId_InScope(pkList);
     * cb.query().addOrderBy_DelivOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByDelivOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByDelivOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByDelivOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByDelivOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByIndvSupplyOutUserIdList;

    /**
     * Load referrer of TPickingRByIndvSupplyOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by INDV_SUPPLY_OUT_USER_ID, named 'TPickingRByIndvSupplyOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByIndvSupplyOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByIndvSupplyOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setIndvSupplyOutUserId_InScope(pkList);
     * cb.query().addOrderBy_IndvSupplyOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByIndvSupplyOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByIndvSupplyOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByIndvSupplyOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByIndvSupplyOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPackingOutUserIdList;

    /**
     * Load referrer of TPickingRByPackingOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by PACKING_OUT_USER_ID, named 'TPickingRByPackingOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPackingOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPackingOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPackingOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PackingOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPackingOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPackingOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPackingOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPackingOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPlOutUserIdList;

    /**
     * Load referrer of TPickingRByPlOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by PL_OUT_USER_ID, named 'TPickingRByPlOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPlOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPlOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PlOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPlOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPlOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPlOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPlOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByIndvLabelOutUserIdList;

    /**
     * Load referrer of TPickingRByIndvLabelOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by INDV_LABEL_OUT_USER_ID, named 'TPickingRByIndvLabelOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByIndvLabelOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByIndvLabelOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setIndvLabelOutUserId_InScope(pkList);
     * cb.query().addOrderBy_IndvLabelOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByIndvLabelOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByIndvLabelOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByIndvLabelOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByIndvLabelOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPl2OutUserIdList;

    /**
     * Load referrer of TPickingRByPl2OutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by PL2_OUT_USER_ID, named 'TPickingRByPl2OutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPl2OutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPl2OutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPl2OutUserId_InScope(pkList);
     * cb.query().addOrderBy_Pl2OutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPl2OutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPl2OutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPl2OutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPl2OutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRBySlipOutUserIdList;

    /**
     * Load referrer of TPickingRBySlipOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by SLIP_OUT_USER_ID, named 'TPickingRBySlipOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRBySlipOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRBySlipOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setSlipOutUserId_InScope(pkList);
     * cb.query().addOrderBy_SlipOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRBySlipOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRBySlipOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRBySlipOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRBySlipOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByNizoroeOutUserIdList;

    /**
     * Load referrer of TPickingRByNizoroeOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by NIZOROE_OUT_USER_ID, named 'TPickingRByNizoroeOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByNizoroeOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByNizoroeOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setNizoroeOutUserId_InScope(pkList);
     * cb.query().addOrderBy_NizoroeOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByNizoroeOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByNizoroeOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByNizoroeOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByNizoroeOutUserIdList, _selector));
    }

    protected List<TPickingR> _referrerTPickingRByPllOutUserIdList;

    /**
     * Load referrer of TPickingRByPllOutUserIdList by the set-upper of referrer. <br>
     * t_picking_r by PLL_OUT_USER_ID, named 'TPickingRByPllOutUserIdList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPickingRByPllOutUserIdList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPickingRByPllOutUserIdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setPllOutUserId_InScope(pkList);
     * cb.query().addOrderBy_PllOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPickingR> loadTPickingRByPllOutUserIdList(ConditionBeanSetupper<TPickingRCB> refCBLambda) {
        myBhv().loadTPickingRByPllOutUserIdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPickingRByPllOutUserIdList = refLs);
        return hd -> hd.handle(new LoaderOfTPickingR().ready(_referrerTPickingRByPllOutUserIdList, _selector));
    }

    protected List<TReceiveLabel> _referrerTReceiveLabelList;

    /**
     * Load referrer of TReceiveLabelList by the set-upper of referrer. <br>
     * t_receive_label by RCV_LBL_OUT_USER_ID, named 'TReceiveLabelList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTReceiveLabelList</span>(<span style="color: #553000">labelCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">labelCB</span>.setupSelect...
     *         <span style="color: #553000">labelCB</span>.query().set...
     *         <span style="color: #553000">labelCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">labelLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    labelLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTReceiveLabelList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRcvLblOutUserId_InScope(pkList);
     * cb.query().addOrderBy_RcvLblOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceiveLabel> loadTReceiveLabelList(ConditionBeanSetupper<TReceiveLabelCB> refCBLambda) {
        myBhv().loadTReceiveLabelList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceiveLabelList = refLs);
        return hd -> hd.handle(new LoaderOfTReceiveLabel().ready(_referrerTReceiveLabelList, _selector));
    }

    protected List<TReceivePlanR> _referrerTReceivePlanRList;

    /**
     * Load referrer of TReceivePlanRList by the set-upper of referrer. <br>
     * t_receive_plan_r by RPL_OUT_USER_ID, named 'TReceivePlanRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTReceivePlanRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTReceivePlanRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setRplOutUserId_InScope(pkList);
     * cb.query().addOrderBy_RplOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanR> loadTReceivePlanRList(ConditionBeanSetupper<TReceivePlanRCB> refCBLambda) {
        myBhv().loadTReceivePlanRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanRList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanR().ready(_referrerTReceivePlanRList, _selector));
    }

    protected List<TStoreNoR> _referrerTStoreNoRList;

    /**
     * Load referrer of TStoreNoRList by the set-upper of referrer. <br>
     * t_store_no_r by TWL_OUT_USER_ID, named 'TStoreNoRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTStoreNoRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreNoRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setTwlOutUserId_InScope(pkList);
     * cb.query().addOrderBy_TwlOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreNoR> loadTStoreNoRList(ConditionBeanSetupper<TStoreNoRCB> refCBLambda) {
        myBhv().loadTStoreNoRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreNoRList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreNoR().ready(_referrerTStoreNoRList, _selector));
    }

    protected List<TStoreRecordR> _referrerTStoreRecordRList;

    /**
     * Load referrer of TStoreRecordRList by the set-upper of referrer. <br>
     * t_store_record_r by RECEIVE_RECORD_OUT_USER_ID, named 'TStoreRecordRList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTStoreRecordRList</span>(<span style="color: #553000">rCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">rCB</span>.setupSelect...
     *         <span style="color: #553000">rCB</span>.query().set...
     *         <span style="color: #553000">rCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">rLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    rLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTStoreRecordRList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReceiveRecordOutUserId_InScope(pkList);
     * cb.query().addOrderBy_ReceiveRecordOutUserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStoreRecordR> loadTStoreRecordRList(ConditionBeanSetupper<TStoreRecordRCB> refCBLambda) {
        myBhv().loadTStoreRecordRList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStoreRecordRList = refLs);
        return hd -> hd.handle(new LoaderOfTStoreRecordR().ready(_referrerTStoreRecordRList, _selector));
    }

    protected List<WSglRowShipInspB> _referrerWSglRowShipInspBList;

    /**
     * Load referrer of WSglRowShipInspBList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_b by USER_ID, named 'WSglRowShipInspBList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getWSglRowShipInspBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUserId_InScope(pkList);
     * cb.query().addOrderBy_UserId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspB> loadWSglRowShipInspBList(ConditionBeanSetupper<WSglRowShipInspBCB> refCBLambda) {
        myBhv().loadWSglRowShipInspBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspBList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspB().ready(_referrerWSglRowShipInspBList, _selector));
    }

    protected List<TPackingH> _referrerTPackingHByUpdUserList;

    /**
     * Load referrer of TPackingHByUpdUserList by the set-upper of referrer. <br>
     * t_packing_h by UPD_USER, named 'TPackingHByUpdUserList'.
     * <pre>
     * <span style="color: #0000C0">bUserBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">bUserList</span>, <span style="color: #553000">userLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">userLoader</span>.<span style="color: #CC4747">loadTPackingHByUpdUserList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (BUser bUser : <span style="color: #553000">bUserList</span>) {
     *     ... = bUser.<span style="color: #CC4747">getTPackingHByUpdUserList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setUpdUser_InScope(pkList);
     * cb.query().addOrderBy_UpdUser_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTPackingH> loadTPackingHByUpdUserList(ConditionBeanSetupper<TPackingHCB> refCBLambda) {
        myBhv().loadTPackingHByUpdUserList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTPackingHByUpdUserList = refLs);
        return hd -> hd.handle(new LoaderOfTPackingH().ready(_referrerTPackingHByUpdUserList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfBCulture _foreignBCultureLoader;
    public LoaderOfBCulture pulloutBCulture() {
        if (_foreignBCultureLoader == null)
        { _foreignBCultureLoader = new LoaderOfBCulture().ready(myBhv().pulloutBCulture(_selectedList), _selector); }
        return _foreignBCultureLoader;
    }

    protected LoaderOfBRoleGrp _foreignBRoleGrpLoader;
    public LoaderOfBRoleGrp pulloutBRoleGrp() {
        if (_foreignBRoleGrpLoader == null)
        { _foreignBRoleGrpLoader = new LoaderOfBRoleGrp().ready(myBhv().pulloutBRoleGrp(_selectedList), _selector); }
        return _foreignBRoleGrpLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBUserAuth _foreignBUserAuthAsOneLoader;
    public LoaderOfBUserAuth pulloutBUserAuthAsOne() {
        if (_foreignBUserAuthAsOneLoader == null)
        { _foreignBUserAuthAsOneLoader = new LoaderOfBUserAuth().ready(myBhv().pulloutBUserAuthAsOne(_selectedList), _selector); }
        return _foreignBUserAuthAsOneLoader;
    }

    protected LoaderOfMUserLogin _foreignMUserLoginAsOneLoader;
    public LoaderOfMUserLogin pulloutMUserLoginAsOne() {
        if (_foreignMUserLoginAsOneLoader == null)
        { _foreignMUserLoginAsOneLoader = new LoaderOfMUserLogin().ready(myBhv().pulloutMUserLoginAsOne(_selectedList), _selector); }
        return _foreignMUserLoginAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<BUser> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
