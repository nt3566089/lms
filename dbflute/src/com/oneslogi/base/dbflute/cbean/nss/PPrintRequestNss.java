package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrintRequestCQ;

/**
 * The nest select set-upper of p_print_request.
 * @author DBFlute(AutoGenerator)
 */
public class PPrintRequestNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrintRequestCQ _query;
    public PPrintRequestNss(PPrintRequestCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PRINT_STATUS, named 'BClassDtlByPrintStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintStatus());
        return new BClassDtlNss(_query.queryBClassDtlByPrintStatus());
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
     * b_class_dtl by my PRINTED_FLG, named 'BClassDtlByPrintedFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintedFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintedFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPrintedFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PRINT_DATA_TYPE, named 'BClassDtlByPrintDataType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPrintDataType() {
        _query.xdoNss(() -> _query.queryBClassDtlByPrintDataType());
        return new BClassDtlNss(_query.queryBClassDtlByPrintDataType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_print_request_data by PRINT_REQUEST_ID, named 'PPrintRequestDataAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrintRequestDataNss withPPrintRequestDataAsOne() {
        _query.xdoNss(() -> _query.queryPPrintRequestDataAsOne());
        return new PPrintRequestDataNss(_query.queryPPrintRequestDataAsOne());
    }
}
