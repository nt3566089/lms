package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryReceiveLabelCQ;

/**
 * The nest select set-upper of t_inventory_receive_label.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryReceiveLabelNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryReceiveLabelCQ _query;
    public TInventoryReceiveLabelNss(TInventoryReceiveLabelCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryBNss withTInventoryB() {
        _query.xdoNss(() -> _query.queryTInventoryB());
        return new TInventoryBNss(_query.queryTInventoryB());
    }
}
