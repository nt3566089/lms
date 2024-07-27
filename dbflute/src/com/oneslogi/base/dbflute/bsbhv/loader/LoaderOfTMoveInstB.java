package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import org.dbflute.bhv.referrer.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;
import com.oneslogi.base.dbflute.cbean.*;

/**
 * The referrer loader of t_move_inst_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     MOVE_INST_B_ID
 *
 * [column]
 *     MOVE_INST_B_ID, MOVE_INST_H_ID, MOVE_INST_STATUS, INOUT_TYPE, WAREHOUSE_ID, WAREHOUSE_CD, PRODUCT_ID, PRODUCT_CD, STOCK_TYPE_ID, STOCK_TYPE_CD, LOCATION_ID, LOCATION_CD, DEPOSIT_ID, DEPOSIT_CD, LOT_ID, LOT, LIMIT_DT, PROD_DT, STORE_NO_ID, STORE_LABEL_NO, STORE_DT, SUPPLIER_ID, SUPPLIER_CD, SHAPE_ID, SHAPE_CD, UNIT_NUM, INST_NUM, PLANT_CD, STORAGE_SPACE_CD, TRANSFER_TYPE_CD, TRANSFER_SEND_FLG, SALES_ORG_ID, ACCOUNT_ID, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_INST_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     t_move_inst_h, m_customer, m_warehouse, t_store_no, m_shape, m_product, m_location, t_lot, m_stock_type, b_class_dtl(ByInoutType)
 *
 * [referrer table]
 *     t_move_record_b
 *
 * [foreign property]
 *     tMoveInstH, mCustomerByDepositId, mCustomerBySupplierId, mCustomerByAccountId, mWarehouse, tStoreNo, mShape, mProduct, mLocation, tLot, mStockType, bClassDtlByInoutType, bClassDtlByMoveInstStatus
 *
 * [referrer property]
 *     tMoveRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfTMoveInstB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<TMoveInstB> _selectedList;
    protected BehaviorSelector _selector;
    protected TMoveInstBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfTMoveInstB ready(List<TMoveInstB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected TMoveInstBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(TMoveInstBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                       Load Referrer
    //                                                                       =============
    protected List<TMoveRecordB> _referrerTMoveRecordBList;

    /**
     * Load referrer of TMoveRecordBList by the set-upper of referrer. <br>
     * t_move_record_b by MOVE_INST_B_ID, named 'TMoveRecordBList'.
     * <pre>
     * <span style="color: #0000C0">tMoveInstBBhv</span>.<span style="color: #994747">load</span>(<span style="color: #553000">tMoveInstBList</span>, <span style="color: #553000">bLoader</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *     <span style="color: #553000">bLoader</span>.<span style="color: #CC4747">loadTMoveRecordBList</span>(<span style="color: #553000">bCB</span> <span style="color: #90226C; font-weight: bold"><span style="font-size: 120%">-</span>&gt;</span> {
     *         <span style="color: #553000">bCB</span>.setupSelect...
     *         <span style="color: #553000">bCB</span>.query().set...
     *         <span style="color: #553000">bCB</span>.query().addOrderBy...
     *     }); <span style="color: #3F7E5E">// you can load nested referrer from here</span>
     *     <span style="color: #3F7E5E">//}).withNestedReferrer(<span style="color: #553000">bLoader</span> -&gt; {</span>
     *     <span style="color: #3F7E5E">//    bLoader.load...</span>
     *     <span style="color: #3F7E5E">//});</span>
     * });
     * for (TMoveInstB tMoveInstB : <span style="color: #553000">tMoveInstBList</span>) {
     *     ... = tMoveInstB.<span style="color: #CC4747">getTMoveRecordBList()</span>;
     * }
     * </pre>
     * About internal policy, the value of primary key (and others too) is treated as case-insensitive. <br>
     * The condition-bean, which the set-upper provides, has settings before callback as follows:
     * <pre>
     * cb.query().setMoveInstBId_InScope(pkList);
     * cb.query().addOrderBy_MoveInstBId_Asc();
     * </pre>
     * @param refCBLambda The callback to set up referrer condition-bean for loading referrer. (NotNull)
     * @return The callback interface which you can load nested referrer by calling withNestedReferrer(). (NotNull)
     */
    public NestedReferrerLoaderGateway<LoaderOfTMoveRecordB> loadTMoveRecordBList(ConditionBeanSetupper<TMoveRecordBCB> refCBLambda) {
        myBhv().loadTMoveRecordBList(_selectedList, refCBLambda).withNestedReferrer(refLs -> _referrerTMoveRecordBList = refLs);
        return hd -> hd.handle(new LoaderOfTMoveRecordB().ready(_referrerTMoveRecordBList, _selector));
    }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfTMoveInstH _foreignTMoveInstHLoader;
    public LoaderOfTMoveInstH pulloutTMoveInstH() {
        if (_foreignTMoveInstHLoader == null)
        { _foreignTMoveInstHLoader = new LoaderOfTMoveInstH().ready(myBhv().pulloutTMoveInstH(_selectedList), _selector); }
        return _foreignTMoveInstHLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByDepositIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByDepositId() {
        if (_foreignMCustomerByDepositIdLoader == null)
        { _foreignMCustomerByDepositIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByDepositId(_selectedList), _selector); }
        return _foreignMCustomerByDepositIdLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerBySupplierIdLoader;
    public LoaderOfMCustomer pulloutMCustomerBySupplierId() {
        if (_foreignMCustomerBySupplierIdLoader == null)
        { _foreignMCustomerBySupplierIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerBySupplierId(_selectedList), _selector); }
        return _foreignMCustomerBySupplierIdLoader;
    }

    protected LoaderOfMCustomer _foreignMCustomerByAccountIdLoader;
    public LoaderOfMCustomer pulloutMCustomerByAccountId() {
        if (_foreignMCustomerByAccountIdLoader == null)
        { _foreignMCustomerByAccountIdLoader = new LoaderOfMCustomer().ready(myBhv().pulloutMCustomerByAccountId(_selectedList), _selector); }
        return _foreignMCustomerByAccountIdLoader;
    }

    protected LoaderOfMWarehouse _foreignMWarehouseLoader;
    public LoaderOfMWarehouse pulloutMWarehouse() {
        if (_foreignMWarehouseLoader == null)
        { _foreignMWarehouseLoader = new LoaderOfMWarehouse().ready(myBhv().pulloutMWarehouse(_selectedList), _selector); }
        return _foreignMWarehouseLoader;
    }

    protected LoaderOfTStoreNo _foreignTStoreNoLoader;
    public LoaderOfTStoreNo pulloutTStoreNo() {
        if (_foreignTStoreNoLoader == null)
        { _foreignTStoreNoLoader = new LoaderOfTStoreNo().ready(myBhv().pulloutTStoreNo(_selectedList), _selector); }
        return _foreignTStoreNoLoader;
    }

    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMProduct _foreignMProductLoader;
    public LoaderOfMProduct pulloutMProduct() {
        if (_foreignMProductLoader == null)
        { _foreignMProductLoader = new LoaderOfMProduct().ready(myBhv().pulloutMProduct(_selectedList), _selector); }
        return _foreignMProductLoader;
    }

    protected LoaderOfMLocation _foreignMLocationLoader;
    public LoaderOfMLocation pulloutMLocation() {
        if (_foreignMLocationLoader == null)
        { _foreignMLocationLoader = new LoaderOfMLocation().ready(myBhv().pulloutMLocation(_selectedList), _selector); }
        return _foreignMLocationLoader;
    }

    protected LoaderOfTLot _foreignTLotLoader;
    public LoaderOfTLot pulloutTLot() {
        if (_foreignTLotLoader == null)
        { _foreignTLotLoader = new LoaderOfTLot().ready(myBhv().pulloutTLot(_selectedList), _selector); }
        return _foreignTLotLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInoutTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInoutType() {
        if (_foreignBClassDtlByInoutTypeLoader == null)
        { _foreignBClassDtlByInoutTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInoutType(_selectedList), _selector); }
        return _foreignBClassDtlByInoutTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByMoveInstStatusLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByMoveInstStatus() {
        if (_foreignBClassDtlByMoveInstStatusLoader == null)
        { _foreignBClassDtlByMoveInstStatusLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByMoveInstStatus(_selectedList), _selector); }
        return _foreignBClassDtlByMoveInstStatusLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<TMoveInstB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}
