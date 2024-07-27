package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TYahooOrderCQ;

/**
 * The nest select set-upper of t_yahoo_order.
 * @author DBFlute(AutoGenerator)
 */
public class TYahooOrderNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TYahooOrderCQ _query;
    public TYahooOrderNss(TYahooOrderCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_ec_order_b by my EC_ORDER_B_ID, named 'TEcOrderB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TEcOrderBNss withTEcOrderB() {
        _query.xdoNss(() -> _query.queryTEcOrderB());
        return new TEcOrderBNss(_query.queryTEcOrderB());
    }
}
