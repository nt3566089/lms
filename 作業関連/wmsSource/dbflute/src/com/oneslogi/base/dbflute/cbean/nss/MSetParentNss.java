package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MSetParentCQ;

/**
 * The nest select set-upper of m_set_parent.
 * @author DBFlute(AutoGenerator)
 */
public class MSetParentNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MSetParentCQ _query;
    public MSetParentNss(MSetParentCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
}
