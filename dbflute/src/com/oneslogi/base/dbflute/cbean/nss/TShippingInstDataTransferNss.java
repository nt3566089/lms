package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingInstDataTransferCQ;

/**
 * The nest select set-upper of t_shipping_inst_data_transfer.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstDataTransferNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingInstDataTransferCQ _query;
    public TShippingInstDataTransferNss(TShippingInstDataTransferCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_inst_b by my SHIPPING_INST_B_ID, named 'TShippingInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstBNss withTShippingInstB() {
        _query.xdoNss(() -> _query.queryTShippingInstB());
        return new TShippingInstBNss(_query.queryTShippingInstB());
    }
}
