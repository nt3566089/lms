package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCenterClassDtlCQ;

/**
 * The nest select set-upper of m_center_class_dtl.
 * @author DBFlute(AutoGenerator)
 */
public class MCenterClassDtlNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCenterClassDtlCQ _query;
    public MCenterClassDtlNss(MCenterClassDtlCQ query) { _query = query; }
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
    /**
     * With nested relation columns to select clause. <br>
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
}
