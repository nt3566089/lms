package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MClientScreenCQ;

/**
 * The nest select set-upper of m_client_screen.
 * @author DBFlute(AutoGenerator)
 */
public class MClientScreenNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MClientScreenCQ _query;
    public MClientScreenNss(MClientScreenCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_screen by my SCREEN_ID, named 'BScreen'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BScreenNss withBScreen() {
        _query.xdoNss(() -> _query.queryBScreen());
        return new BScreenNss(_query.queryBScreen());
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
     * v_dict by my DICT_ID, named 'VDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVDict(cultureId));
    }
    /**
     * With nested relation columns to select clause. <br>
     * v_ht_dict by my DICT_ID, named 'VHtDict'.
     * @param cultureId The bind parameter of fixed condition for cultureId. (NotNull)
     */
    public void withVHtDict(final Long cultureId) {
        _query.xdoNss(() -> _query.queryVHtDict(cultureId));
    }
}
