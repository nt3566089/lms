package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.BRoleCQ;

/**
 * The nest select set-upper of b_role.
 * @author DBFlute(AutoGenerator)
 */
public class BRoleNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final BRoleCQ _query;
    public BRoleNss(BRoleCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
}
