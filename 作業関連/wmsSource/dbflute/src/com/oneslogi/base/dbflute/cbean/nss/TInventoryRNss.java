package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryRCQ;

/**
 * The nest select set-upper of t_inventory_r.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryRCQ _query;
    public TInventoryRNss(TInventoryRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INVENTORY_RECORD_LOC_OUT_USER_ID, named 'BUserByInventoryRecordLocOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByInventoryRecordLocOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByInventoryRecordLocOutUserId());
        return new BUserNss(_query.queryBUserByInventoryRecordLocOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my STOCK_DIFF_OUT_USER_ID, named 'BUserByStockDiffOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByStockDiffOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByStockDiffOutUserId());
        return new BUserNss(_query.queryBUserByStockDiffOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my TWL_OUT_USER_ID, named 'BUserByTwlOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByTwlOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByTwlOutUserId());
        return new BUserNss(_query.queryBUserByTwlOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INVENTORY_RECORD_OUT_USER_ID, named 'BUserByInventoryRecordOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByInventoryRecordOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByInventoryRecordOutUserId());
        return new BUserNss(_query.queryBUserByInventoryRecordOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_inventory_b by my INVENTORY_B_ID, named 'TInventoryB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryBNss withTInventoryB() {
        _query.xdoNss(() -> _query.queryTInventoryB());
        return new TInventoryBNss(_query.queryTInventoryB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INVENTORY_DIFF_OUT_USER_ID, named 'BUserByInventoryDiffOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByInventoryDiffOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByInventoryDiffOutUserId());
        return new BUserNss(_query.queryBUserByInventoryDiffOutUserId());
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
