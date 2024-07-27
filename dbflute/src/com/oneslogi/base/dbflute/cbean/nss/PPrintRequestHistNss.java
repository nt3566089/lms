package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrintRequestHistCQ;

/**
 * The nest select set-upper of p_print_request_hist.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestHistNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrintRequestHistCQ _query;
    public PPrintRequestHistNss(PPrintRequestHistCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_print_request by my PRINT_REQUEST_ID, named 'PPrintRequest'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrintRequestNss withPPrintRequest() {
        _query.xdoNss(() -> _query.queryPPrintRequest());
        return new PPrintRequestNss(_query.queryPPrintRequest());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SHEET_COLLATE, named 'BClassDtlBySheetCollate'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySheetCollate() {
        _query.xdoNss(() -> _query.queryBClassDtlBySheetCollate());
        return new BClassDtlNss(_query.queryBClassDtlBySheetCollate());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PRINT_RESULT_CLASS, named 'BClassDtlByPrintResultClass'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintResultClass() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintResultClass());
        return new BClassDtlNss(_query.queryBClassDtlByPrintResultClass());
    }
}
