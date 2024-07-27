package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PSubrepLayoutCQ;

/**
 * The nest select set-upper of p_subrep_layout.
 * @author DBFlute(AutoGenerator)
 */
public class PSubrepLayoutNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PSubrepLayoutCQ _query;
    public PSubrepLayoutNss(PSubrepLayoutCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayout'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PReportLayoutNss withPReportLayout() {
        _query.xdoNss(() -> _query.queryPReportLayout());
        return new PReportLayoutNss(_query.queryPReportLayout());
    }
}
