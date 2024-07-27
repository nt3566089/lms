package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HPackingBCQ;

/**
 * The nest select set-upper of h_packing_b.
 * @author DBFlute(AutoGenerator)
 */
public class HPackingBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HPackingBCQ _query;
    public HPackingBNss(HPackingBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * h_packing_h by my PACKING_H_ID, named 'HPackingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HPackingHNss withHPackingH() {
        _query.xdoNss(() -> _query.queryHPackingH());
        return new HPackingHNss(_query.queryHPackingH());
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
     * h_shipping_b by my SHIPPING_INST_B_ID, named 'HShippingB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HShippingBNss withHShippingB() {
        _query.xdoNss(() -> _query.queryHShippingB());
        return new HShippingBNss(_query.queryHShippingB());
    }
}
