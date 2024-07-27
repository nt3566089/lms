package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MDepositProductCQ;

/**
 * The nest select set-upper of m_deposit_product.
 * @author DBFlute(AutoGenerator)
 */
public class MDepositProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MDepositProductCQ _query;
    public MDepositProductNss(MDepositProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_sales_org by my SALES_ORG_ID, named 'MSalesOrg'.
     */
    public void withMSalesOrg() {
        _query.xdoNss(() -> _query.queryMSalesOrg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my ACCOUNT_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_product by my PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
    }
}
