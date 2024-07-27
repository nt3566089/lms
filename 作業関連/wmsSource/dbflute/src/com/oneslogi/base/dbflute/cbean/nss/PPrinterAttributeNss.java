package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PPrinterAttributeCQ;

/**
 * The nest select set-upper of p_printer_attribute.
 * @author DBFlute(AutoGenerator)
 */
public class PPrinterAttributeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PPrinterAttributeCQ _query;
    public PPrinterAttributeNss(PPrinterAttributeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_printer by my PRINTER_ID, named 'PPrinter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterNss withPPrinter() {
        _query.xdoNss(() -> _query.queryPPrinter());
        return new PPrinterNss(_query.queryPPrinter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my VISIBLE, named 'BClassDtlByVisible'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByVisible() {
        _query.xdoNss(() -> _query.queryBClassDtlByVisible());
        return new BClassDtlNss(_query.queryBClassDtlByVisible());
    }
}
