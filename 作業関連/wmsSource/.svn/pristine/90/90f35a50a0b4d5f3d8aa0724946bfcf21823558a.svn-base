package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TReceivePlanRCQ;

/**
 * The nest select set-upper of t_receive_plan_r.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReceivePlanRCQ _query;
    public TReceivePlanRNss(TReceivePlanRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanHNss withTReceivePlanH() {
        _query.xdoNss(() -> _query.queryTReceivePlanH());
        return new TReceivePlanHNss(_query.queryTReceivePlanH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my RPL_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my RPL_OUT_FLG, named 'BClassDtlByRplOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByRplOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByRplOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByRplOutFlg());
    }
}
