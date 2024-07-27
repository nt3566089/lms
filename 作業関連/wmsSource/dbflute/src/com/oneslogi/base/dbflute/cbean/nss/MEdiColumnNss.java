package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MEdiColumnCQ;

/**
 * The nest select set-upper of m_edi_column.
 * @author DBFlute(AutoGenerator)
 */
public class MEdiColumnNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MEdiColumnCQ _query;
    public MEdiColumnNss(MEdiColumnCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_edi by my EDI_ID, named 'MEdi'.
     */
    public void withMEdi() {
        _query.xdoNss(() -> _query.queryMEdi());
    }
}
