package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStockRecordCQ;

/**
 * The nest select set-upper of t_stock_record.
 * @author DBFlute(AutoGenerator)
 */
public class TStockRecordNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStockRecordCQ _query;
    public TStockRecordNss(TStockRecordCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
}
