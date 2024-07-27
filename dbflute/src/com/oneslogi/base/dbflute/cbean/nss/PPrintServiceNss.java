package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrintServiceCQ;

/**
 * The nest select set-upper of p_print_service.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintServiceNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrintServiceCQ _query;
    public PPrintServiceNss(PPrintServiceCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PRINT_SERVICE_STATUS, named 'BClassDtlByPrintServiceStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintServiceStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintServiceStatus());
        return new BClassDtlNss(_query.queryBClassDtlByPrintServiceStatus());
    }
}
