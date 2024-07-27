package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TScmLabelCQ;

/**
 * The nest select set-upper of t_scm_label.
 * @author DBFlute(AutoGenerator)
 */
public class TScmLabelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TScmLabelCQ _query;
    public TScmLabelNss(TScmLabelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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