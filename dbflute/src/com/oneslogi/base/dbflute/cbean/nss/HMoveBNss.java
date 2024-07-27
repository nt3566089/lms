package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HMoveBCQ;

/**
 * The nest select set-upper of h_move_b.
 * @author DBFlute(AutoGenerator)
 */
public class HMoveBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HMoveBCQ _query;
    public HMoveBNss(HMoveBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * h_move_h by my MOVE_INST_H_ID, named 'HMoveH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HMoveHNss withHMoveH() {
        _query.xdoNss(() -> _query.queryHMoveH());
        return new HMoveHNss(_query.queryHMoveH());
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
     * b_class_dtl by my INOUT_TYPE, named 'BClassDtlByInoutType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInoutType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInoutType());
        return new BClassDtlNss(_query.queryBClassDtlByInoutType());
    }
}
