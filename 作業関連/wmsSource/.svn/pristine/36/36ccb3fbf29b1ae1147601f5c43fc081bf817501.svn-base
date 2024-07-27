package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreRecordRCQ;

/**
 * The nest select set-upper of t_store_record_r.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreRecordRCQ _query;
    public TStoreRecordRNss(TStoreRecordRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my RECEIVE_RECORD_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_store_record_h by my STORE_RECORD_H_ID, named 'TStoreRecordH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreRecordHNss withTStoreRecordH() {
        _query.xdoNss(() -> _query.queryTStoreRecordH());
        return new TStoreRecordHNss(_query.queryTStoreRecordH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my RECEIVE_RECORD_OUT_FLG, named 'BClassDtlByReceiveRecordOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveRecordOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveRecordOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveRecordOutFlg());
    }
}
