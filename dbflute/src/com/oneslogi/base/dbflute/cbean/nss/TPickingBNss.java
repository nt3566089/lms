package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPickingBCQ;

/**
 * The nest select set-upper of t_picking_b.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPickingBCQ _query;
    public TPickingBNss(TPickingBCQ query) { _query = query; }
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
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockNss withTStock() {
        _query.xdoNss(() -> _query.queryTStock());
        return new TStockNss(_query.queryTStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstBNss withTShippingInstB() {
        _query.xdoNss(() -> _query.queryTShippingInstB());
        return new TShippingInstBNss(_query.queryTShippingInstB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstBNss withTAllocInstB() {
        _query.xdoNss(() -> _query.queryTAllocInstB());
        return new TAllocInstBNss(_query.queryTAllocInstB());
    }
}
