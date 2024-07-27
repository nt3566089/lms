package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HStockCQ;

/**
 * The nest select set-upper of h_stock.
 * @author DBFlute(AutoGenerator)
 */
public class HStockNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HStockCQ _query;
    public HStockNss(HStockCQ query) { _query = query; }
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
}
