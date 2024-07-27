package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MKoguchiDeliveryCQ;

/**
 * The nest select set-upper of m_koguchi_delivery.
 * @author DBFlute(AutoGenerator)
 */
public class MKoguchiDeliveryNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MKoguchiDeliveryCQ _query;
    public MKoguchiDeliveryNss(MKoguchiDeliveryCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_sales_org by my SERV_SALES_ORG_ID, named 'MSalesOrg'.
     */
    public void withMSalesOrg() {
        _query.xdoNss(() -> _query.queryMSalesOrg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_carrier by my CARRIER_ID, named 'MCarrier'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCarrierNss withMCarrier() {
        _query.xdoNss(() -> _query.queryMCarrier());
        return new MCarrierNss(_query.queryMCarrier());
    }
}
