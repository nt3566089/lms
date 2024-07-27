package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MClientColCQ;

/**
 * The nest select set-upper of m_client_col.
 * @author DBFlute(AutoGenerator)
 */
public class MClientColNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MClientColCQ _query;
    public MClientColNss(MClientColCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * b_col by my COL_ID, named 'BCol'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BColNss withBCol() {
        _query.xdoNss(() -> _query.queryBCol());
        return new BColNss(_query.queryBCol());
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
