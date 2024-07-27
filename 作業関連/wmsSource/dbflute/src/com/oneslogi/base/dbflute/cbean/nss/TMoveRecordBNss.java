package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveRecordBCQ;

/**
 * The nest select set-upper of t_move_record_b.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveRecordBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveRecordBCQ _query;
    public TMoveRecordBNss(TMoveRecordBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_move_inst_b by my MOVE_INST_B_ID, named 'TMoveInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstBNss withTMoveInstB() {
        _query.xdoNss(() -> _query.queryTMoveInstB());
        return new TMoveInstBNss(_query.queryTMoveInstB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_move_inst_h by my MOVE_INST_H_ID, named 'TMoveInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstHNss withTMoveInstH() {
        _query.xdoNss(() -> _query.queryTMoveInstH());
        return new TMoveInstHNss(_query.queryTMoveInstH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my ALL_SHIPPING_FLG, named 'BClassDtlByAllShippingFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAllShippingFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAllShippingFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAllShippingFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my STORE_NO_MERGE_FLG, named 'BClassDtlByStoreNoMergeFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStoreNoMergeFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStoreNoMergeFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStoreNoMergeFlg());
    }
}
