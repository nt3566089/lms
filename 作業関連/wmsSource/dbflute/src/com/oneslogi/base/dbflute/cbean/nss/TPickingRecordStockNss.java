package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPickingRecordStockCQ;

/**
 * The nest select set-upper of t_picking_record_stock.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingRecordStockNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPickingRecordStockCQ _query;
    public TPickingRecordStockNss(TPickingRecordStockCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_picking_b by my PICKING_B_ID, named 'TPickingB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingBNss withTPickingB() {
        _query.xdoNss(() -> _query.queryTPickingB());
        return new TPickingBNss(_query.queryTPickingB());
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
}
