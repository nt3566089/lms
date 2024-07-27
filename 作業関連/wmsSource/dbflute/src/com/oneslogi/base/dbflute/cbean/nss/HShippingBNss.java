package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HShippingBCQ;

/**
 * The nest select set-upper of h_shipping_b.
 * @author DBFlute(AutoGenerator)
 */
public class HShippingBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HShippingBCQ _query;
    public HShippingBNss(HShippingBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * h_shipping_h by my SHIPPING_INST_H_ID, named 'HShippingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HShippingHNss withHShippingH() {
        _query.xdoNss(() -> _query.queryHShippingH());
        return new HShippingHNss(_query.queryHShippingH());
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
     * h_shipping_spare by SHIPPING_INST_B_ID, named 'HShippingSpareAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HShippingSpareNss withHShippingSpareAsOne() {
        _query.xdoNss(() -> _query.queryHShippingSpareAsOne());
        return new HShippingSpareNss(_query.queryHShippingSpareAsOne());
    }
}
