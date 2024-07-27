package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BSystemCQ;

/**
 * The nest select set-upper of b_system.
 * @author DBFlute(AutoGenerator)
 */
public class BSystemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BSystemCQ _query;
    public BSystemNss(BSystemCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_time_zone by my TIME_ZONE_ID, named 'BTimeZone'.
     */
    public void withBTimeZone() {
        _query.xdoNss(() -> _query.queryBTimeZone());
    }
}
