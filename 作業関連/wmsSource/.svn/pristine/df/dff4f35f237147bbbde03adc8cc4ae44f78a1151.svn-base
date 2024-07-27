package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveInstRCQ;

/**
 * The nest select set-upper of t_move_inst_r.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveInstRCQ _query;
    public TMoveInstRNss(TMoveInstRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INST_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstHNss withTMoveInstH() {
        _query.xdoNss(() -> _query.queryTMoveInstH());
        return new TMoveInstHNss(_query.queryTMoveInstH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INST_OUT_FLG, named 'BClassDtlByInstOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInstOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInstOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInstOutFlg());
    }
}
