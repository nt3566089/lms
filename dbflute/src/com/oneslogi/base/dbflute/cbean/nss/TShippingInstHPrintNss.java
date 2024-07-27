package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingInstHPrintCQ;

/**
 * The nest select set-upper of t_shipping_inst_h_print.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstHPrintNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingInstHPrintCQ _query;
    public TShippingInstHPrintNss(TShippingInstHPrintCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstHNss withTShippingInstH() {
        _query.xdoNss(() -> _query.queryTShippingInstH());
        return new TShippingInstHNss(_query.queryTShippingInstH());
    }
}
