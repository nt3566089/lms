package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCustomerPickingCQ;

/**
 * The nest select set-upper of m_customer_picking.
 * @author DBFlute(AutoGenerator)
 */
public class MCustomerPickingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCustomerPickingCQ _query;
    public MCustomerPickingNss(MCustomerPickingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     */
    public void withMSalesOrg() {
        _query.xdoNss(() -> _query.queryMSalesOrg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
}
