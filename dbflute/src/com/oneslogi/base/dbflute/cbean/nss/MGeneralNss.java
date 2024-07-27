package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MGeneralCQ;

/**
 * The nest select set-upper of m_general.
 * @author DBFlute(AutoGenerator)
 */
public class MGeneralNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MGeneralCQ _query;
    public MGeneralNss(MGeneralCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
}
