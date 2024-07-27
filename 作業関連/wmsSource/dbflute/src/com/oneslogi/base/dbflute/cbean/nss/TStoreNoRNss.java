package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreNoRCQ;

/**
 * The nest select set-upper of t_store_no_r.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreNoRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreNoRCQ _query;
    public TStoreNoRNss(TStoreNoRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my TWL_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNo() {
        _query.xdoNss(() -> _query.queryTStoreNo());
        return new TStoreNoNss(_query.queryTStoreNo());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my TWL_OUT_FLG, named 'BClassDtlByTwlOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTwlOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTwlOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTwlOutFlg());
    }
}
