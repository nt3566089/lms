package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BArgCQ;

/**
 * The nest select set-upper of b_arg.
 * @author DBFlute(AutoGenerator)
 */
public class BArgNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BArgCQ _query;
    public BArgNss(BArgCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_dict by my DICT_ID, named 'BDict'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BDictNss withBDict() {
        _query.xdoNss(() -> _query.queryBDict());
        return new BDictNss(_query.queryBDict());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_func by my FUNC_ID, named 'BFunc'.
     */
    public void withBFunc() {
        _query.xdoNss(() -> _query.queryBFunc());
    }
    /**
     * With nested relation columns to select clause. <br>
     * v_ht_dict by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVHtDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVHtDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_arg_valid by ARG_ID, named 'BArgValidAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BArgValidNss withBArgValidAsOne() {
        _query.xdoNss(() -> _query.queryBArgValidAsOne());
        return new BArgValidNss(_query.queryBArgValidAsOne());
    }
}
