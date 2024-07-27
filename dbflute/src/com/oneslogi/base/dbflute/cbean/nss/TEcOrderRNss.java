package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TEcOrderRCQ;

/**
 * The nest select set-upper of t_ec_order_r.
 * @author DBFlute(AutoGenerator)
 */
public class TEcOrderRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TEcOrderRCQ _query;
    public TEcOrderRNss(TEcOrderRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my STATEMENT_OUT_USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_ec_order_h by my EC_ORDER_H_ID, named 'TEcOrderH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TEcOrderHNss withTEcOrderH() {
        _query.xdoNss(() -> _query.queryTEcOrderH());
        return new TEcOrderHNss(_query.queryTEcOrderH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInvoiceCreateFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInvoiceCreateFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInvoiceCreateFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my STATEMENT_OUT_FLG, named 'BClassDtlByStatementOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStatementOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStatementOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStatementOutFlg());
    }
}
