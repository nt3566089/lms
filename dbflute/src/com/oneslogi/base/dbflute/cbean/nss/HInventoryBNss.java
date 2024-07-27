package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HInventoryBCQ;

/**
 * The nest select set-upper of h_inventory_b.
 * @author DBFlute(AutoGenerator)
 */
public class HInventoryBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HInventoryBCQ _query;
    public HInventoryBNss(HInventoryBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeNss withMShape() {
        _query.xdoNss(() -> _query.queryMShape());
        return new MShapeNss(_query.queryMShape());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * h_move_h by my MOVE_INST_H_ID, named 'HMoveH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HMoveHNss withHMoveH() {
        _query.xdoNss(() -> _query.queryHMoveH());
        return new HMoveHNss(_query.queryHMoveH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * h_stock by my STOCK_ID, named 'HStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HStockNss withHStock() {
        _query.xdoNss(() -> _query.queryHStock());
        return new HStockNss(_query.queryHStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * h_inventory_h by my INVENTORY_H_ID, named 'HInventoryH'.
     */
    public void withHInventoryH() {
        _query.xdoNss(() -> _query.queryHInventoryH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInputType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInputType());
        return new BClassDtlNss(_query.queryBClassDtlByInputType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my STOCK_ADJUST_FLG, named 'BClassDtlByStockAdjustFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockAdjustFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockAdjustFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockAdjustFlg());
    }
}
