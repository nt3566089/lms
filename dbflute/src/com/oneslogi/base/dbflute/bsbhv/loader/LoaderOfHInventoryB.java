package com.oneslogi.base.dbflute.bsbhv.loader;

import java.util.List;

import org.dbflute.bhv.*;
import com.oneslogi.base.dbflute.exbhv.*;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The referrer loader of h_inventory_b as TABLE. <br>
 * <pre>
 * [primary key]
 *     INVENTORY_B_ID
 *
 * [column]
 *     INVENTORY_B_ID, INVENTORY_H_ID, STOCK_ID, WAREHOUSE_ID, WAREHOUSE_CD, WAREHOUSE_NM, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, STOCK_TYPE_ID, LOCATION_ID, LOCATION_CD, LOCATION_NM, DEPOSIT_ID, DEPOSIT_CD, DEPOSIT_NM, LOT_ID, LOT, LIMIT_DT, SHAPE_ID, STORE_NO_ID, STORE_LABEL_NO, SUPPLIER_ID, SUPPLIER_CD, SUPPLIER_NM, STORE_DT, UNIT_NUM, CHARGE_NUM, ALLOC_NUM, MOVE_NUM, INVENTORY_NUM, INPUT_TYPE, STOCK_ADJUST_FLG, MOVE_INST_H_ID, HT_INPUT_INVENTORY_NUM, WEB_INPUT_INVENTORY_NUM, AJIS_INPUT_INVENTORY_NUM, PROD_DT, AREA_CD, SALES_ORG_ID, ACCOUNT_ID, ALLOC_TYPE_CD, S4_SEND_FLG, CM_SEND_FLG, INVENTORY_USER_ID, INVENTORY_UPD_USER_ID, RECEIVE_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign table]
 *     m_shape, m_stock_type, h_move_h, h_stock, h_inventory_h, b_class_dtl(ByInputType)
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     mShape, mStockType, hMoveH, hStock, hInventoryH, bClassDtlByInputType, bClassDtlByStockAdjustFlg
 *
 * [referrer property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public class LoaderOfHInventoryB {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected List<HInventoryB> _selectedList;
    protected BehaviorSelector _selector;
    protected HInventoryBBhv _myBhv; // lazy-loaded

    // ===================================================================================
    //                                                                   Ready for Loading
    //                                                                   =================
    public LoaderOfHInventoryB ready(List<HInventoryB> selectedList, BehaviorSelector selector)
    { _selectedList = selectedList; _selector = selector; return this; }

    protected HInventoryBBhv myBhv()
    { if (_myBhv != null) { return _myBhv; } else { _myBhv = _selector.select(HInventoryBBhv.class); return _myBhv; } }

    // ===================================================================================
    //                                                                    Pull out Foreign
    //                                                                    ================
    protected LoaderOfMShape _foreignMShapeLoader;
    public LoaderOfMShape pulloutMShape() {
        if (_foreignMShapeLoader == null)
        { _foreignMShapeLoader = new LoaderOfMShape().ready(myBhv().pulloutMShape(_selectedList), _selector); }
        return _foreignMShapeLoader;
    }

    protected LoaderOfMStockType _foreignMStockTypeLoader;
    public LoaderOfMStockType pulloutMStockType() {
        if (_foreignMStockTypeLoader == null)
        { _foreignMStockTypeLoader = new LoaderOfMStockType().ready(myBhv().pulloutMStockType(_selectedList), _selector); }
        return _foreignMStockTypeLoader;
    }

    protected LoaderOfHMoveH _foreignHMoveHLoader;
    public LoaderOfHMoveH pulloutHMoveH() {
        if (_foreignHMoveHLoader == null)
        { _foreignHMoveHLoader = new LoaderOfHMoveH().ready(myBhv().pulloutHMoveH(_selectedList), _selector); }
        return _foreignHMoveHLoader;
    }

    protected LoaderOfHStock _foreignHStockLoader;
    public LoaderOfHStock pulloutHStock() {
        if (_foreignHStockLoader == null)
        { _foreignHStockLoader = new LoaderOfHStock().ready(myBhv().pulloutHStock(_selectedList), _selector); }
        return _foreignHStockLoader;
    }

    protected LoaderOfHInventoryH _foreignHInventoryHLoader;
    public LoaderOfHInventoryH pulloutHInventoryH() {
        if (_foreignHInventoryHLoader == null)
        { _foreignHInventoryHLoader = new LoaderOfHInventoryH().ready(myBhv().pulloutHInventoryH(_selectedList), _selector); }
        return _foreignHInventoryHLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByInputTypeLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByInputType() {
        if (_foreignBClassDtlByInputTypeLoader == null)
        { _foreignBClassDtlByInputTypeLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByInputType(_selectedList), _selector); }
        return _foreignBClassDtlByInputTypeLoader;
    }

    protected LoaderOfBClassDtl _foreignBClassDtlByStockAdjustFlgLoader;
    public LoaderOfBClassDtl pulloutBClassDtlByStockAdjustFlg() {
        if (_foreignBClassDtlByStockAdjustFlgLoader == null)
        { _foreignBClassDtlByStockAdjustFlgLoader = new LoaderOfBClassDtl().ready(myBhv().pulloutBClassDtlByStockAdjustFlg(_selectedList), _selector); }
        return _foreignBClassDtlByStockAdjustFlgLoader;
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public List<HInventoryB> getSelectedList() { return _selectedList; }
    public BehaviorSelector getSelector() { return _selector; }
}