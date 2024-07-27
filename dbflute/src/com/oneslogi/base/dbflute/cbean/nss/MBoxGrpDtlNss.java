package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MBoxGrpDtlCQ;

/**
 * The nest select set-upper of m_box_grp_dtl.
 * @author DBFlute(AutoGenerator)
 */
public class MBoxGrpDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MBoxGrpDtlCQ _query;
    public MBoxGrpDtlNss(MBoxGrpDtlCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_box by my BOX_ID, named 'MBox'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxNss withMBox() {
        _query.xdoNss(() -> _query.queryMBox());
        return new MBoxNss(_query.queryMBox());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_box_grp by my BOX_GRP_ID, named 'MBoxGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxGrpNss withMBoxGrp() {
        _query.xdoNss(() -> _query.queryMBoxGrp());
        return new MBoxGrpNss(_query.queryMBoxGrp());
    }
}
