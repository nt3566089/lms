package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TEcOrderBCQ;

/**
 * The nest select set-upper of t_ec_order_b.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TEcOrderBCQ _query;
    public TEcOrderBNss(TEcOrderBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_ec_order_h by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TEcOrderHNss withTEcOrderH() {
        _query.xdoNss(() -> _query.queryTEcOrderH());
        return new TEcOrderHNss(_query.queryTEcOrderH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByErrorFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByErrorFlg());
        return new BClassDtlNss(_query.queryBClassDtlByErrorFlg());
    }
}
