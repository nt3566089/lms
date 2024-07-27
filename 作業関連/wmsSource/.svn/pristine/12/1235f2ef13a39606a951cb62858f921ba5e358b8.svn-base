package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.WHtSerialShippingInspCQ;

/**
 * The nest select set-upper of w_ht_serial_shipping_insp.
 * @author DBFlute(AutoGenerator)
 */
public class WHtSerialShippingInspNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WHtSerialShippingInspCQ _query;
    public WHtSerialShippingInspNss(WHtSerialShippingInspCQ query) { _query = query; }
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
     * m_customer by my CUSTOMER_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_center by my CENTER_ID, named 'MCenter'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCenterNss withMCenter() {
        _query.xdoNss(() -> _query.queryMCenter());
        return new MCenterNss(_query.queryMCenter());
    }
}
