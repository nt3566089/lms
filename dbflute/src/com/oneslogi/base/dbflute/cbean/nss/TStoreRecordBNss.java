package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreRecordBCQ;

/**
 * The nest select set-upper of t_store_record_b.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreRecordBCQ _query;
    public TStoreRecordBNss(TStoreRecordBCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * t_receive_plan_b by my RECEIVE_PLAN_B_ID, named 'TReceivePlanB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanBNss withTReceivePlanB() {
        _query.xdoNss(() -> _query.queryTReceivePlanB());
        return new TReceivePlanBNss(_query.queryTReceivePlanB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_location by my STORE_LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInputType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInputType());
        return new BClassDtlNss(_query.queryBClassDtlByInputType());
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
}