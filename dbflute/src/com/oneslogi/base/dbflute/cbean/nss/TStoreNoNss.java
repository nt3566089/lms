package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreNoCQ;

/**
 * The nest select set-upper of t_store_no.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNoNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreNoCQ _query;
    public TStoreNoNss(TStoreNoCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * t_store_no by my OLD_STORE_NUM_ID, named 'TStoreNoSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNoSelf() {
        _query.xdoNss(() -> _query.queryTStoreNoSelf());
        return new TStoreNoNss(_query.queryTStoreNoSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my SUPPLIER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_store_no_r by STORE_NO_ID, named 'TStoreNoRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoRNss withTStoreNoRAsOne() {
        _query.xdoNss(() -> _query.queryTStoreNoRAsOne());
        return new TStoreNoRNss(_query.queryTStoreNoRAsOne());
    }
}
