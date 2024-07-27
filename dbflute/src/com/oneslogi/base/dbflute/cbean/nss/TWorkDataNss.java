package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TWorkDataCQ;

/**
 * The nest select set-upper of t_work_data.
 * @author DBFlute(AutoGenerator)
 */
public class TWorkDataNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TWorkDataCQ _query;
    public TWorkDataNss(TWorkDataCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_work_log by my WORK_LOG_ID, named 'TWorkLog'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TWorkLogNss withTWorkLog() {
        _query.xdoNss(() -> _query.queryTWorkLog());
        return new TWorkLogNss(_query.queryTWorkLog());
    }
}