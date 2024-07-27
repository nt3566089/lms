package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BCultureCQ;

/**
 * The nest select set-upper of b_culture.
 * @author DBFlute(AutoGenerator)
 */
public class BCultureNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BCultureCQ _query;
    public BCultureNss(BCultureCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_culture by my LANG_CULTURE_ID, named 'BCultureSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureNss withBCultureSelf() {
        _query.xdoNss(() -> _query.queryBCultureSelf());
        return new BCultureNss(_query.queryBCultureSelf());
    }
    /**
     * With nested relation columns to select clause. <br>
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_culture_attribute by CULTURE_ID, named 'BCultureAttributeAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BCultureAttributeNss withBCultureAttributeAsOne() {
        _query.xdoNss(() -> _query.queryBCultureAttributeAsOne());
        return new BCultureAttributeNss(_query.queryBCultureAttributeAsOne());
    }
}
