package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of m_product as TABLE. <br>
 * <pre>
 * [primary key]
 *     PRODUCT_ID
 *
 * [column]
 *     PRODUCT_ID, CLIENT_ID, PRODUCT_CD, PRODUCT_NM, PRODUCT_ABBR, JAN_CD, LOT_MANAG_FLG, LIMIT_DT_MANAG_FLG, RECEIVE_LIMIT_NUM, SHIPPING_LIMIT_NUM, MERGE_CLS, LOT_REVERSE_FLG, LIMIT_DT_REVERSE_FLG, SHIPPING_STOP_FLG, FIXED_POINT, SHAPE_GRP_ID, NMFC_CODE, FREIGHT_CLS, COUNNTRY_OF_ORIGIN, UNIT_VAL, HTS_CD, PRODUCT_CATEGORY_CLS, PROD_DT_MANAG_FLG, PROD_DT_LIMIT_DAYS_RCV, PROD_DT_LIMIT_DAYS_SHP, SERIAL_MANAG_FLG, OCR_DATE_FORMAT, INSURANCE_FLG, NO_OKINAWA_FLIGHT_FLG, HEAVY_ITEM_FLG, LARGE_ITEM_FLG, HINMOKU_GROUP_CD, CASE_TYPE_CD, EVALUATION_UNIT_PRICE, LOGI_SPECIAL_TYPE_CD, LOGI_ATTENTION_TYPE_CD, UNIT_NM, OLD_JAN_CD, RECOMEND_LOCATION_CD, RECOMEND_LOCATION_TYPE_CD, INNER_JAN_CD, CREATE_DATE, CREATE_TIME, FLOOR_REF_STOCK_NUM, WM_SEND_FLG, LP_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PRODUCT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape_grp, m_client, b_class_dtl(ByDelFlg), m_set_parent(AsOne)
 *
 * [referrer table]
 *     h_stock_book, m_deposit_product, m_location, m_location_replenish_product, m_product_shape, m_set_structure, t_alloc_inst_b, t_alloc_lot, t_inventory_b, t_keeping_lot, t_last_lot, t_lot, t_move_inst_b, t_nizoroe_alarm_log, t_operation_log, t_receive_plan_b, t_serial_no, t_shipping_inst_b, t_stock, t_stock_book, w_ht_inventory_input_prod, w_ht_picking, w_ht_receive_inspection, w_ht_receive_no_plan_insp, w_ht_receive_store, w_ht_shipping, w_ht_shipping_picking, w_ht_total_picking, w_sgl_row_ship_insp_h, w_shipping_interrupt, m_set_parent
 *
 * [foreign property]
 *     mShapeGrp, mClient, bClassDtlByDelFlg, bClassDtlByLimitDtManagFlg, bClassDtlByLimitDtReverseFlg, bClassDtlByLotManagFlg, bClassDtlByLotReverseFlg, bClassDtlByMergeCls, bClassDtlByShippingStopFlg, bClassDtlByFreightCls, bClassDtlByProdDtManagFlg, bClassDtlByLogiSpecialTypeCd, bClassDtlByOcrDateFormat, bClassDtlByInsuranceFlg, bClassDtlByNoOkinawaFlightFlg, bClassDtlByLogiAttentionTypeCd, bClassDtlByHeavyItemFlg, bClassDtlByLargeItemFlg, mSetParentAsOne
 *
 * [referrer property]
 *     hStockBookList, mDepositProductList, mLocationList, mLocationReplenishProductList, mProductShapeList, mSetStructureList, tAllocInstBList, tAllocLotList, tInventoryBList, tKeepingLotList, tLastLotList, tLotList, tMoveInstBList, tNizoroeAlarmLogList, tOperationLogList, tReceivePlanBList, tSerialNoList, tShippingInstBList, tStockList, tStockBookList, wHtInventoryInputProdList, wHtPickingList, wHtReceiveInspectionList, wHtReceiveNoPlanInspList, wHtReceiveStoreList, wHtShippingList, wHtShippingPickingList, wHtTotalPickingList, wSglRowShipInspHList, wShippingInterruptList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfMProduct {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<MProduct> _selectedList;
    protected BehaviorSelector _selector;
    protected MProductBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfMProduct ready(List<MProduct> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected MProductBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(MProductBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<HStockBook> _referrerHStockBookList;

    /**
     * Load referrer of HStockBookList by the set-upper of referrer. <br>
     * h_stock_book by PRODUCT_ID, named 'HStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadHStockBookList</span>(<span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bookCB</span>.setupSelect...
     *         <span style="color: #553000">bookCB</span>.query().set...
     *         <span style="color: #553000">bookCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bookLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bookLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getHStockBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfHStockBook> loadHStockBookList(ConditionBeanSetupper<HStockBookCB> refCBLambda) {
        myBhv().loadHStockBookList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerHStockBookList = refLs);
        return hd -> hd.handle(new LoaderOfHStockBook().ready(_referrerHStockBookList, _selector));
    }

    protected List<MDepositProduct> _referrerMDepositProductList;

    /**
     * Load referrer of MDepositProductList by the set-upper of referrer. <br>
     * m_deposit_product by PRODUCT_ID, named 'MDepositProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMDepositProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMDepositProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMDepositProduct> loadMDepositProductList(ConditionBeanSetupper<MDepositProductCB> refCBLambda) {
        myBhv().loadMDepositProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMDepositProductList = refLs);
        return hd -> hd.handle(new LoaderOfMDepositProduct().ready(_referrerMDepositProductList, _selector));
    }

    protected List<MLocation> _referrerMLocationList;

    /**
     * Load referrer of MLocationList by the set-upper of referrer. <br>
     * m_location by REPLENISH_PRODUCT_ID, named 'MLocationList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMLocationList</span>(<span style="color: #553000">locationCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">locationCB</span>.setupSelect...
     *         <span style="color: #553000">locationCB</span>.query().set...
     *         <span style="color: #553000">locationCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">locationLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    locationLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMLocationList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocation> loadMLocationList(ConditionBeanSetupper<MLocationCB> refCBLambda) {
        myBhv().loadMLocationList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationList = refLs);
        return hd -> hd.handle(new LoaderOfMLocation().ready(_referrerMLocationList, _selector));
    }

    protected List<MLocationReplenishProduct> _referrerMLocationReplenishProductList;

    /**
     * Load referrer of MLocationReplenishProductList by the set-upper of referrer. <br>
     * m_location_replenish_product by REPLENISH_PRODUCT_ID, named 'MLocationReplenishProductList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMLocationReplenishProductList</span>(<span style="color: #553000">productCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">productCB</span>.setupSelect...
     *         <span style="color: #553000">productCB</span>.query().set...
     *         <span style="color: #553000">productCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">productLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    productLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMLocationReplenishProductList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setReplenishProductId_InScope(pkList);
     * cb.query().addOrderBy_ReplenishProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMLocationReplenishProduct> loadMLocationReplenishProductList(ConditionBeanSetupper<MLocationReplenishProductCB> refCBLambda) {
        myBhv().loadMLocationReplenishProductList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMLocationReplenishProductList = refLs);
        return hd -> hd.handle(new LoaderOfMLocationReplenishProduct().ready(_referrerMLocationReplenishProductList, _selector));
    }

    protected List<MProductShape> _referrerMProductShapeList;

    /**
     * Load referrer of MProductShapeList by the set-upper of referrer. <br>
     * m_product_shape by PRODUCT_ID, named 'MProductShapeList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMProductShapeList</span>(<span style="color: #553000">shapeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shapeCB</span>.setupSelect...
     *         <span style="color: #553000">shapeCB</span>.query().set...
     *         <span style="color: #553000">shapeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shapeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shapeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMProductShapeList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMProductShape> loadMProductShapeList(ConditionBeanSetupper<MProductShapeCB> refCBLambda) {
        myBhv().loadMProductShapeList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMProductShapeList = refLs);
        return hd -> hd.handle(new LoaderOfMProductShape().ready(_referrerMProductShapeList, _selector));
    }

    protected List<MSetStructure> _referrerMSetStructureList;

    /**
     * Load referrer of MSetStructureList by the set-upper of referrer. <br>
     * m_set_structure by PRODUCT_ID, named 'MSetStructureList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadMSetStructureList</span>(<span style="color: #553000">structureCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">structureCB</span>.setupSelect...
     *         <span style="color: #553000">structureCB</span>.query().set...
     *         <span style="color: #553000">structureCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">structureLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    structureLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getMSetStructureList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfMSetStructure> loadMSetStructureList(ConditionBeanSetupper<MSetStructureCB> refCBLambda) {
        myBhv().loadMSetStructureList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerMSetStructureList = refLs);
        return hd -> hd.handle(new LoaderOfMSetStructure().ready(_referrerMSetStructureList, _selector));
    }

    protected List<TAllocInstB> _referrerTAllocInstBList;

    /**
     * Load referrer of TAllocInstBList by the set-upper of referrer. <br>
     * t_alloc_inst_b by PRODUCT_ID, named 'TAllocInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTAllocInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocInstB> loadTAllocInstBList(ConditionBeanSetupper<TAllocInstBCB> refCBLambda) {
        myBhv().loadTAllocInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocInstB().ready(_referrerTAllocInstBList, _selector));
    }

    protected List<TAllocLot> _referrerTAllocLotList;

    /**
     * Load referrer of TAllocLotList by the set-upper of referrer. <br>
     * t_alloc_lot by PRODUCT_ID, named 'TAllocLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTAllocLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTAllocLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTAllocLot> loadTAllocLotList(ConditionBeanSetupper<TAllocLotCB> refCBLambda) {
        myBhv().loadTAllocLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTAllocLotList = refLs);
        return hd -> hd.handle(new LoaderOfTAllocLot().ready(_referrerTAllocLotList, _selector));
    }

    protected List<TInventoryB> _referrerTInventoryBList;

    /**
     * Load referrer of TInventoryBList by the set-upper of referrer. <br>
     * t_inventory_b by PRODUCT_ID, named 'TInventoryBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTInventoryBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTInventoryBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTInventoryB> loadTInventoryBList(ConditionBeanSetupper<TInventoryBCB> refCBLambda) {
        myBhv().loadTInventoryBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTInventoryBList = refLs);
        return hd -> hd.handle(new LoaderOfTInventoryB().ready(_referrerTInventoryBList, _selector));
    }

    protected List<TKeepingLot> _referrerTKeepingLotList;

    /**
     * Load referrer of TKeepingLotList by the set-upper of referrer. <br>
     * t_keeping_lot by PRODUCT_ID, named 'TKeepingLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTKeepingLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTKeepingLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTKeepingLot> loadTKeepingLotList(ConditionBeanSetupper<TKeepingLotCB> refCBLambda) {
        myBhv().loadTKeepingLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTKeepingLotList = refLs);
        return hd -> hd.handle(new LoaderOfTKeepingLot().ready(_referrerTKeepingLotList, _selector));
    }

    protected List<TLastLot> _referrerTLastLotList;

    /**
     * Load referrer of TLastLotList by the set-upper of referrer. <br>
     * t_last_lot by PRODUCT_ID, named 'TLastLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTLastLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLastLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLastLot> loadTLastLotList(ConditionBeanSetupper<TLastLotCB> refCBLambda) {
        myBhv().loadTLastLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLastLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLastLot().ready(_referrerTLastLotList, _selector));
    }

    protected List<TLot> _referrerTLotList;

    /**
     * Load referrer of TLotList by the set-upper of referrer. <br>
     * t_lot by PRODUCT_ID, named 'TLotList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTLotList</span>(<span style="color: #553000">lotCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">lotCB</span>.setupSelect...
     *         <span style="color: #553000">lotCB</span>.query().set...
     *         <span style="color: #553000">lotCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">lotLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    lotLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTLotList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTLot> loadTLotList(ConditionBeanSetupper<TLotCB> refCBLambda) {
        myBhv().loadTLotList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTLotList = refLs);
        return hd -> hd.handle(new LoaderOfTLot().ready(_referrerTLotList, _selector));
    }

    protected List<TMoveInstB> _referrerTMoveInstBList;

    /**
     * Load referrer of TMoveInstBList by the set-upper of referrer. <br>
     * t_move_inst_b by PRODUCT_ID, named 'TMoveInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTMoveInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTMoveInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveInstB> loadTMoveInstBList(ConditionBeanSetupper<TMoveInstBCB> refCBLambda) {
        myBhv().loadTMoveInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveInstB().ready(_referrerTMoveInstBList, _selector));
    }

    protected List<TNizoroeAlarmLog> _referrerTNizoroeAlarmLogList;

    /**
     * Load referrer of TNizoroeAlarmLogList by the set-upper of referrer. <br>
     * t_nizoroe_alarm_log by PRODUCT_ID, named 'TNizoroeAlarmLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTNizoroeAlarmLogList</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTNizoroeAlarmLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTNizoroeAlarmLog> loadTNizoroeAlarmLogList(ConditionBeanSetupper<TNizoroeAlarmLogCB> refCBLambda) {
        myBhv().loadTNizoroeAlarmLogList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTNizoroeAlarmLogList = refLs);
        return hd -> hd.handle(new LoaderOfTNizoroeAlarmLog().ready(_referrerTNizoroeAlarmLogList, _selector));
    }

    protected List<TOperationLog> _referrerTOperationLogList;

    /**
     * Load referrer of TOperationLogList by the set-upper of referrer. <br>
     * t_operation_log by PRODUCT_ID, named 'TOperationLogList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTOperationLogList</span>(<span style="color: #553000">logCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">logCB</span>.setupSelect...
     *         <span style="color: #553000">logCB</span>.query().set...
     *         <span style="color: #553000">logCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">logLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    logLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTOperationLogList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTOperationLog> loadTOperationLogList(ConditionBeanSetupper<TOperationLogCB> refCBLambda) {
        myBhv().loadTOperationLogList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTOperationLogList = refLs);
        return hd -> hd.handle(new LoaderOfTOperationLog().ready(_referrerTOperationLogList, _selector));
    }

    protected List<TReceivePlanB> _referrerTReceivePlanBList;

    /**
     * Load referrer of TReceivePlanBList by the set-upper of referrer. <br>
     * t_receive_plan_b by PRODUCT_ID, named 'TReceivePlanBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTReceivePlanBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTReceivePlanBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTReceivePlanB> loadTReceivePlanBList(ConditionBeanSetupper<TReceivePlanBCB> refCBLambda) {
        myBhv().loadTReceivePlanBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTReceivePlanBList = refLs);
        return hd -> hd.handle(new LoaderOfTReceivePlanB().ready(_referrerTReceivePlanBList, _selector));
    }

    protected List<TSerialNo> _referrerTSerialNoList;

    /**
     * Load referrer of TSerialNoList by the set-upper of referrer. <br>
     * t_serial_no by PRODUCT_ID, named 'TSerialNoList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTSerialNoList</span>(<span style="color: #553000">noCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">noCB</span>.setupSelect...
     *         <span style="color: #553000">noCB</span>.query().set...
     *         <span style="color: #553000">noCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">noLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    noLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTSerialNoList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTSerialNo> loadTSerialNoList(ConditionBeanSetupper<TSerialNoCB> refCBLambda) {
        myBhv().loadTSerialNoList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTSerialNoList = refLs);
        return hd -> hd.handle(new LoaderOfTSerialNo().ready(_referrerTSerialNoList, _selector));
    }

    protected List<TShippingInstB> _referrerTShippingInstBList;

    /**
     * Load referrer of TShippingInstBList by the set-upper of referrer. <br>
     * t_shipping_inst_b by PRODUCT_ID, named 'TShippingInstBList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTShippingInstBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTShippingInstBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTShippingInstB> loadTShippingInstBList(ConditionBeanSetupper<TShippingInstBCB> refCBLambda) {
        myBhv().loadTShippingInstBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTShippingInstBList = refLs);
        return hd -> hd.handle(new LoaderOfTShippingInstB().ready(_referrerTShippingInstBList, _selector));
    }

    protected List<TStock> _referrerTStockList;

    /**
     * Load referrer of TStockList by the set-upper of referrer. <br>
     * t_stock by PRODUCT_ID, named 'TStockList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTStockList</span>(<span style="color: #553000">stockCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">stockCB</span>.setupSelect...
     *         <span style="color: #553000">stockCB</span>.query().set...
     *         <span style="color: #553000">stockCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">stockLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    stockLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTStockList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStock> loadTStockList(ConditionBeanSetupper<TStockCB> refCBLambda) {
        myBhv().loadTStockList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockList = refLs);
        return hd -> hd.handle(new LoaderOfTStock().ready(_referrerTStockList, _selector));
    }

    protected List<TStockBook> _referrerTStockBookList;

    /**
     * Load referrer of TStockBookList by the set-upper of referrer. <br>
     * t_stock_book by PRODUCT_ID, named 'TStockBookList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadTStockBookList</span>(<span style="color: #553000">bookCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bookCB</span>.setupSelect...
     *         <span style="color: #553000">bookCB</span>.query().set...
     *         <span style="color: #553000">bookCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bookLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bookLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getTStockBookList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTStockBook> loadTStockBookList(ConditionBeanSetupper<TStockBookCB> refCBLambda) {
        myBhv().loadTStockBookList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTStockBookList = refLs);
        return hd -> hd.handle(new LoaderOfTStockBook().ready(_referrerTStockBookList, _selector));
    }

    protected List<WHtInventoryInputProd> _referrerWHtInventoryInputProdList;

    /**
     * Load referrer of WHtInventoryInputProdList by the set-upper of referrer. <br>
     * w_ht_inventory_input_prod by PRODUCT_ID, named 'WHtInventoryInputProdList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtInventoryInputProdList</span>(<span style="color: #553000">prodCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">prodCB</span>.setupSelect...
     *         <span style="color: #553000">prodCB</span>.query().set...
     *         <span style="color: #553000">prodCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">prodLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    prodLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtInventoryInputProdList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtInventoryInputProd> loadWHtInventoryInputProdList(ConditionBeanSetupper<WHtInventoryInputProdCB> refCBLambda) {
        myBhv().loadWHtInventoryInputProdList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtInventoryInputProdList = refLs);
        return hd -> hd.handle(new LoaderOfWHtInventoryInputProd().ready(_referrerWHtInventoryInputProdList, _selector));
    }

    protected List<WHtPicking> _referrerWHtPickingList;

    /**
     * Load referrer of WHtPickingList by the set-upper of referrer. <br>
     * w_ht_picking by PRODUCT_ID, named 'WHtPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtPicking> loadWHtPickingList(ConditionBeanSetupper<WHtPickingCB> refCBLambda) {
        myBhv().loadWHtPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtPicking().ready(_referrerWHtPickingList, _selector));
    }

    protected List<WHtReceiveInspection> _referrerWHtReceiveInspectionList;

    /**
     * Load referrer of WHtReceiveInspectionList by the set-upper of referrer. <br>
     * w_ht_receive_inspection by PRODUCT_ID, named 'WHtReceiveInspectionList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveInspectionList</span>(<span style="color: #553000">inspectionCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspectionCB</span>.setupSelect...
     *         <span style="color: #553000">inspectionCB</span>.query().set...
     *         <span style="color: #553000">inspectionCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspectionLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspectionLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveInspectionList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveInspection> loadWHtReceiveInspectionList(ConditionBeanSetupper<WHtReceiveInspectionCB> refCBLambda) {
        myBhv().loadWHtReceiveInspectionList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveInspectionList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveInspection().ready(_referrerWHtReceiveInspectionList, _selector));
    }

    protected List<WHtReceiveNoPlanInsp> _referrerWHtReceiveNoPlanInspList;

    /**
     * Load referrer of WHtReceiveNoPlanInspList by the set-upper of referrer. <br>
     * w_ht_receive_no_plan_insp by PRODUCT_ID, named 'WHtReceiveNoPlanInspList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveNoPlanInspList</span>(<span style="color: #553000">inspCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">inspCB</span>.setupSelect...
     *         <span style="color: #553000">inspCB</span>.query().set...
     *         <span style="color: #553000">inspCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">inspLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    inspLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveNoPlanInspList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveNoPlanInsp> loadWHtReceiveNoPlanInspList(ConditionBeanSetupper<WHtReceiveNoPlanInspCB> refCBLambda) {
        myBhv().loadWHtReceiveNoPlanInspList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveNoPlanInspList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveNoPlanInsp().ready(_referrerWHtReceiveNoPlanInspList, _selector));
    }

    protected List<WHtReceiveStore> _referrerWHtReceiveStoreList;

    /**
     * Load referrer of WHtReceiveStoreList by the set-upper of referrer. <br>
     * w_ht_receive_store by PRODUCT_ID, named 'WHtReceiveStoreList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtReceiveStoreList</span>(<span style="color: #553000">storeCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">storeCB</span>.setupSelect...
     *         <span style="color: #553000">storeCB</span>.query().set...
     *         <span style="color: #553000">storeCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">storeLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    storeLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtReceiveStoreList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtReceiveStore> loadWHtReceiveStoreList(ConditionBeanSetupper<WHtReceiveStoreCB> refCBLambda) {
        myBhv().loadWHtReceiveStoreList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtReceiveStoreList = refLs);
        return hd -> hd.handle(new LoaderOfWHtReceiveStore().ready(_referrerWHtReceiveStoreList, _selector));
    }

    protected List<WHtShipping> _referrerWHtShippingList;

    /**
     * Load referrer of WHtShippingList by the set-upper of referrer. <br>
     * w_ht_shipping by PRODUCT_ID, named 'WHtShippingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtShippingList</span>(<span style="color: #553000">shippingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">shippingCB</span>.setupSelect...
     *         <span style="color: #553000">shippingCB</span>.query().set...
     *         <span style="color: #553000">shippingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">shippingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    shippingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShipping> loadWHtShippingList(ConditionBeanSetupper<WHtShippingCB> refCBLambda) {
        myBhv().loadWHtShippingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShipping().ready(_referrerWHtShippingList, _selector));
    }

    protected List<WHtShippingPicking> _referrerWHtShippingPickingList;

    /**
     * Load referrer of WHtShippingPickingList by the set-upper of referrer. <br>
     * w_ht_shipping_picking by PRODUCT_ID, named 'WHtShippingPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtShippingPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtShippingPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtShippingPicking> loadWHtShippingPickingList(ConditionBeanSetupper<WHtShippingPickingCB> refCBLambda) {
        myBhv().loadWHtShippingPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtShippingPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtShippingPicking().ready(_referrerWHtShippingPickingList, _selector));
    }

    protected List<WHtTotalPicking> _referrerWHtTotalPickingList;

    /**
     * Load referrer of WHtTotalPickingList by the set-upper of referrer. <br>
     * w_ht_total_picking by PRODUCT_ID, named 'WHtTotalPickingList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWHtTotalPickingList</span>(<span style="color: #553000">pickingCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">pickingCB</span>.setupSelect...
     *         <span style="color: #553000">pickingCB</span>.query().set...
     *         <span style="color: #553000">pickingCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">pickingLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    pickingLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWHtTotalPickingList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWHtTotalPicking> loadWHtTotalPickingList(ConditionBeanSetupper<WHtTotalPickingCB> refCBLambda) {
        myBhv().loadWHtTotalPickingList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWHtTotalPickingList = refLs);
        return hd -> hd.handle(new LoaderOfWHtTotalPicking().ready(_referrerWHtTotalPickingList, _selector));
    }

    protected List<WSglRowShipInspH> _referrerWSglRowShipInspHList;

    /**
     * Load referrer of WSglRowShipInspHList by the set-upper of referrer. <br>
     * w_sgl_row_ship_insp_h by PRODUCT_ID, named 'WSglRowShipInspHList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWSglRowShipInspHList</span>(<span style="color: #553000">hCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">hCB</span>.setupSelect...
     *         <span style="color: #553000">hCB</span>.query().set...
     *         <span style="color: #553000">hCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">hLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    hLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWSglRowShipInspHList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWSglRowShipInspH> loadWSglRowShipInspHList(ConditionBeanSetupper<WSglRowShipInspHCB> refCBLambda) {
        myBhv().loadWSglRowShipInspHList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWSglRowShipInspHList = refLs);
        return hd -> hd.handle(new LoaderOfWSglRowShipInspH().ready(_referrerWSglRowShipInspHList, _selector));
    }

    protected List<WShippingInterrupt> _referrerWShippingInterruptList;

    /**
     * Load referrer of WShippingInterruptList by the set-upper of referrer. <br>
     * w_shipping_interrupt by PRODUCT_ID, named 'WShippingInterruptList'.
     * <pre>
     * <span style="color: #0000C0">mProductBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">mProductList</span>, <span style="color: #553000">productLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">productLoader</span>.<span style="color: #CC4747">loadWShippingInterruptList</span>(<span style="color: #553000">interruptCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">interruptCB</span>.setupSelect...
     *         <span style="color: #553000">interruptCB</span>.query().set...
     *         <span style="color: #553000">interruptCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">interruptLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    interruptLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (MProduct mProduct : <span style="color: #553000">mProductList</span>) {
     *     ... = mProduct.<span style="color: #CC4747">getWShippingInterruptList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setProductId_InScope(pkList);
     * cb.query().addOrderBy_ProductId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfWShippingInterrupt> loadWShippingInterruptList(ConditionBeanSetupper<WShippingInterruptCB> refCBLambda) {
        myBhv().loadWShippingInterruptList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerWShippingInterruptList = refLs);
        return hd -> hd.handle(new LoaderOfWShippingInterrupt().ready(_referrerWShippingInterruptList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMShapeGrp _foreignMShapeGrpLoader;
    public LoaderOfMShapeGrp pulloutMShapeGrp() {
        if (_foreignMShapeGrpLoader == null)
        { _foreignMShapeGrpLoader = new LoaderOfMShapeGrp().ready(myBhv().pulloutMShapeGrp(_selectedList), _selector); }
        return _foreignMShapeGrpLoader;
    }

    protected LoaderOfMClient _foreignMClientLoader;
    public LoaderOfMClient pulloutMClient() {
        if (_foreignMClientLoader == null)
        { _foreignMClientLoader = new LoaderOfMClient().ready(myBhv().pulloutMClient(_selectedList), _selector); }
        return _foreignMClientLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByDelFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByDelFlg() {
        if (_foreignBClassDtlByDelFlgLoader == null)
        { _foreignBClassDtlByDelFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByDelFlg(_selectedList), _selector); }
        return _foreignBClassDtlByDelFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtManagFlg() {
        if (_foreignBClassDtlByLimitDtManagFlgLoader == null)
        { _foreignBClassDtlByLimitDtManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLimitDtReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLimitDtReverseFlg() {
        if (_foreignBClassDtlByLimitDtReverseFlgLoader == null)
        { _foreignBClassDtlByLimitDtReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLimitDtReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLimitDtReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotManagFlg() {
        if (_foreignBClassDtlByLotManagFlgLoader == null)
        { _foreignBClassDtlByLotManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLotReverseFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLotReverseFlg() {
        if (_foreignBClassDtlByLotReverseFlgLoader == null)
        { _foreignBClassDtlByLotReverseFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLotReverseFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLotReverseFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMergeClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMergeCls() {
        if (_foreignBClassDtlByMergeClsLoader == null)
        { _foreignBClassDtlByMergeClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMergeCls(_selectedList), _selector); }
        return _foreignBClassDtlByMergeClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByShippingStopFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByShippingStopFlg() {
        if (_foreignBClassDtlByShippingStopFlgLoader == null)
        { _foreignBClassDtlByShippingStopFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByShippingStopFlg(_selectedList), _selector); }
        return _foreignBClassDtlByShippingStopFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByFreightClsLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByFreightCls() {
        if (_foreignBClassDtlByFreightClsLoader == null)
        { _foreignBClassDtlByFreightClsLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByFreightCls(_selectedList), _selector); }
        return _foreignBClassDtlByFreightClsLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByProdDtManagFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByProdDtManagFlg() {
        if (_foreignBClassDtlByProdDtManagFlgLoader == null)
        { _foreignBClassDtlByProdDtManagFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByProdDtManagFlg(_selectedList), _selector); }
        return _foreignBClassDtlByProdDtManagFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLogiSpecialTypeCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLogiSpecialTypeCd() {
        if (_foreignBClassDtlByLogiSpecialTypeCdLoader == null)
        { _foreignBClassDtlByLogiSpecialTypeCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLogiSpecialTypeCd(_selectedList), _selector); }
        return _foreignBClassDtlByLogiSpecialTypeCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByOcrDateFormatLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByOcrDateFormat() {
        if (_foreignBClassDtlByOcrDateFormatLoader == null)
        { _foreignBClassDtlByOcrDateFormatLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByOcrDateFormat(_selectedList), _selector); }
        return _foreignBClassDtlByOcrDateFormatLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInsuranceFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInsuranceFlg() {
        if (_foreignBClassDtlByInsuranceFlgLoader == null)
        { _foreignBClassDtlByInsuranceFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInsuranceFlg(_selectedList), _selector); }
        return _foreignBClassDtlByInsuranceFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByNoOkinawaFlightFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByNoOkinawaFlightFlg() {
        if (_foreignBClassDtlByNoOkinawaFlightFlgLoader == null)
        { _foreignBClassDtlByNoOkinawaFlightFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByNoOkinawaFlightFlg(_selectedList), _selector); }
        return _foreignBClassDtlByNoOkinawaFlightFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLogiAttentionTypeCdLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLogiAttentionTypeCd() {
        if (_foreignBClassDtlByLogiAttentionTypeCdLoader == null)
        { _foreignBClassDtlByLogiAttentionTypeCdLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLogiAttentionTypeCd(_selectedList), _selector); }
        return _foreignBClassDtlByLogiAttentionTypeCdLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByHeavyItemFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByHeavyItemFlg() {
        if (_foreignBClassDtlByHeavyItemFlgLoader == null)
        { _foreignBClassDtlByHeavyItemFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByHeavyItemFlg(_selectedList), _selector); }
        return _foreignBClassDtlByHeavyItemFlgLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByLargeItemFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByLargeItemFlg() {
        if (_foreignBClassDtlByLargeItemFlgLoader == null)
        { _foreignBClassDtlByLargeItemFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByLargeItemFlg(_selectedList), _selector); }
        return _foreignBClassDtlByLargeItemFlgLoader;
    }

    protected LoaderOfMSetParent _foreignMSetParentAsOneLoader;
    public LoaderOfMSetParent pulloutMSetParentAsOne() {
        if (_foreignMSetParentAsOneLoader == null)
        { _foreignMSetParentAsOneLoader = new LoaderOfMSetParent().ready(myBhv().pulloutMSetParentAsOne(_selectedList), _selector); }
        return _foreignMSetParentAsOneLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<MProduct> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
