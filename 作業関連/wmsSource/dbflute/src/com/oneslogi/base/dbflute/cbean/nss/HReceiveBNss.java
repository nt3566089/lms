package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.HReceiveBCQ;

/**
 * The nest select set-upper of h_receive_b.
 * @author DBFlute(AutoGenerator)
 */
public class HReceiveBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final HReceiveBCQ _query;
    public HReceiveBNss(HReceiveBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * h_receive_h by my STORE_RECORD_H_ID, named 'HReceiveH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HReceiveHNss withHReceiveH() {
        _query.xdoNss(() -> _query.queryHReceiveH());
        return new HReceiveHNss(_query.queryHReceiveH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * h_stock by my STOCK_ID, named 'HStock'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HStockNss withHStock() {
        _query.xdoNss(() -> _query.queryHStock());
        return new HStockNss(_query.queryHStock());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my STORE_FLG, named 'BClassDtlByStoreFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStoreFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStoreFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStoreFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * h_receive_spare by STORE_RECORD_B_ID, named 'HReceiveSpareAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public HReceiveSpareNss withHReceiveSpareAsOne() {
        _query.xdoNss(() -> _query.queryHReceiveSpareAsOne());
        return new HReceiveSpareNss(_query.queryHReceiveSpareAsOne());
    }
}
