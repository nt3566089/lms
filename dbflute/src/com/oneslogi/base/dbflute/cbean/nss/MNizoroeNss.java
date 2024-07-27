package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MNizoroeCQ;

/**
 * The nest select set-upper of m_nizoroe.
 * @author DBFlute(AutoGenerator)
 */
public class MNizoroeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MNizoroeCQ _query;
    public MNizoroeNss(MNizoroeCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * m_nizoroe_patern by my NIZOROE_PATERN_ID, named 'MNizoroePatern'.
     */
    public void withMNizoroePatern() {
        _query.xdoNss(() -> _query.queryMNizoroePatern());
    }
}
