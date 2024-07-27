package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryInpHistCQ;

/**
 * The nest select set-upper of t_inventory_inp_hist.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInpHistNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryInpHistCQ _query;
    public TInventoryInpHistNss(TInventoryInpHistCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LAST_FLG, named 'BClassDtlByLastFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLastFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLastFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLastFlg());
    }
}
