package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MImportTypeBCQ;

/**
 * The nest select set-upper of m_import_type_b.
 * @author DBFlute(AutoGenerator)
 */
public class MImportTypeBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MImportTypeBCQ _query;
    public MImportTypeBNss(MImportTypeBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_import_type by my IMPORT_TYPE_ID, named 'MImportType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MImportTypeNss withMImportType() {
        _query.xdoNss(() -> _query.queryMImportType());
        return new MImportTypeNss(_query.queryMImportType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_edi_column by my EDI_COLUMN_ID, named 'MEdiColumn'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MEdiColumnNss withMEdiColumn() {
        _query.xdoNss(() -> _query.queryMEdiColumn());
        return new MEdiColumnNss(_query.queryMEdiColumn());
    }
}
