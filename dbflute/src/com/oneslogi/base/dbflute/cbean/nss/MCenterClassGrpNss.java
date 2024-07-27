package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassGrpCQ;

/**
 * The nest select set-upper of m_center_class_grp.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassGrpNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassGrpCQ _query;
    public MCenterClassGrpNss(MCenterClassGrpCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_center_class by my CENTER_CLASS_ID, named 'MCenterClass'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterClassNss withMCenterClass() {
        _query.xdoNss(() -> _query.queryMCenterClass());
        return new MCenterClassNss(_query.queryMCenterClass());
    }
}