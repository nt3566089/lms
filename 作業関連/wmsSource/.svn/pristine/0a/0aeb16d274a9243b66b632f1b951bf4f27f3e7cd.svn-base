package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HStockBookCQ;

/**
 * The nest select set-upper of h_stock_book.
 * @author DBFlute(AutoGenerator)
 */
public class HStockBookNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HStockBookCQ _query;
    public HStockBookNss(HStockBookCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
}
