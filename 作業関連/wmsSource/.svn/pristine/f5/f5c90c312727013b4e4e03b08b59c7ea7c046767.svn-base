package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingRecordBCQ;

/**
 * The nest select set-upper of t_shipping_record_b.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingRecordBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingRecordBCQ _query;
    public TShippingRecordBNss(TShippingRecordBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_record_h by my SHIPPING_RECORD_H_ID, named 'TShippingRecordH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingRecordHNss withTShippingRecordH() {
        _query.xdoNss(() -> _query.queryTShippingRecordH());
        return new TShippingRecordHNss(_query.queryTShippingRecordH());
    }
}
