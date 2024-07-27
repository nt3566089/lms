package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PReportLayoutItemCQ;

/**
 * The nest select set-upper of p_report_layout_item.
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayoutItemNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PReportLayoutItemCQ _query;
    public PReportLayoutItemNss(PReportLayoutItemCQ query) { _query = query; }
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