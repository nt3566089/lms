package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TReceiveLabelCQ;

/**
 * The nest select set-upper of t_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public class TReceiveLabelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReceiveLabelCQ _query;
    public TReceiveLabelNss(TReceiveLabelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanBNss withTReceivePlanB() {
        _query.xdoNss(() -> _query.queryTReceivePlanB());
        return new TReceivePlanBNss(_query.queryTReceivePlanB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_stock by my STOCK_ID, named 'TStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStockNss withTStock() {
        _query.xdoNss(() -> _query.queryTStock());
        return new TStockNss(_query.queryTStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my RCV_LBL_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
}
