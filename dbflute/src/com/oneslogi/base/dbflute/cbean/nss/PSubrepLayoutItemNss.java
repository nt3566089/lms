package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PSubrepLayoutItemCQ;

/**
 * The nest select set-upper of p_subrep_layout_item.
 * @author DBFlute(AutoGenerator)
 */
public class PSubrepLayoutItemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PSubrepLayoutItemCQ _query;
    public PSubrepLayoutItemNss(PSubrepLayoutItemCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_subrep_layout by my SUBREP_LAYOUT_ID, named 'PSubrepLayout'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PSubrepLayoutNss withPSubrepLayout() {
        _query.xdoNss(() -> _query.queryPSubrepLayout());
        return new PSubrepLayoutNss(_query.queryPSubrepLayout());
    }
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
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
}