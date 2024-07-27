package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MCarrierDecisionCQ;

/**
 * The nest select set-upper of m_carrier_decision.
 * @author DBFlute(AutoGenerator)
 */
public class MCarrierDecisionNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MCarrierDecisionCQ _query;
    public MCarrierDecisionNss(MCarrierDecisionCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID2, named 'MCarrierByCarrierId2'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrierByCarrierId2() {
        _query.xdoNss(() -> _query.queryMCarrierByCarrierId2());
        return new MCarrierNss(_query.queryMCarrierByCarrierId2());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID1, named 'MCarrierByCarrierId1'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrierByCarrierId1() {
        _query.xdoNss(() -> _query.queryMCarrierByCarrierId1());
        return new MCarrierNss(_query.queryMCarrierByCarrierId1());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID3, named 'MCarrierByCarrierId3'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrierByCarrierId3() {
        _query.xdoNss(() -> _query.queryMCarrierByCarrierId3());
        return new MCarrierNss(_query.queryMCarrierByCarrierId3());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrierByCarrierId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrierByCarrierId() {
        _query.xdoNss(() -> _query.queryMCarrierByCarrierId());
        return new MCarrierNss(_query.queryMCarrierByCarrierId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     */
    public void withMSalesOrg() {
        _query.xdoNss(() -> _query.queryMSalesOrg());
    }
}
