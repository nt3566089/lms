package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TMoveInstHCQ;

/**
 * The nest select set-upper of t_move_inst_h.
 * @author DBFlute(AutoGenerator)
 */
public class TMoveInstHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TMoveInstHCQ _query;
    public TMoveInstHNss(TMoveInstHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
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
     * b_class_dtl by my MOVE_INST_STATUS, named 'BClassDtlByMoveInstStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMoveInstStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByMoveInstStatus());
        return new BClassDtlNss(_query.queryBClassDtlByMoveInstStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_move_inst_r by MOVE_INST_H_ID, named 'TMoveInstRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TMoveInstRNss withTMoveInstRAsOne() {
        _query.xdoNss(() -> _query.queryTMoveInstRAsOne());
        return new TMoveInstRNss(_query.queryTMoveInstRAsOne());
    }
}
