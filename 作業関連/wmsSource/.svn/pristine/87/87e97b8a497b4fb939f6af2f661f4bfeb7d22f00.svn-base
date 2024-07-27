package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MUserDepositCQ;

/**
 * The nest select set-upper of m_user_deposit.
 * @author DBFlute(AutoGenerator)
 */
public class MUserDepositNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MUserDepositCQ _query;
    public MUserDepositNss(MUserDepositCQ query) { _query = query; }
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
     * b_user by my USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
}
