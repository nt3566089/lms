package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BCultureAttributeCQ;

/**
 * The nest select set-upper of b_culture_attribute.
 * @author DBFlute(AutoGenerator)
 */
public class BCultureAttributeNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BCultureAttributeCQ _query;
    public BCultureAttributeNss(BCultureAttributeCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_culture by my CULTURE_ID, named 'BCulture'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCulture() {
        _query.xdoNss(() -> _query.queryBCulture());
        return new BCultureNss(_query.queryBCulture());
    }
}
