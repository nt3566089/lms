package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TStoreRecordHCQ;

/**
 * The nest select set-upper of t_store_record_h.
 * @author DBFlute(AutoGenerator)
 */
public class TStoreRecordHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TStoreRecordHCQ _query;
    public TStoreRecordHNss(TStoreRecordHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_stock_type by my STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my SUPPLIER_ID, named 'MCustomerBySupplierId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerBySupplierId() {
        _query.xdoNss(() -> _query.queryMCustomerBySupplierId());
        return new MCustomerNss(_query.queryMCustomerBySupplierId());
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
     * m_customer by my DEPOSIT_ID, named 'MCustomerByDepositId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByDepositId() {
        _query.xdoNss(() -> _query.queryMCustomerByDepositId());
        return new MCustomerNss(_query.queryMCustomerByDepositId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
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
    /**
     * With nested relation columns to select clause. <br>
     * t_receive_plan_h by my RECEIVE_PLAN_H_ID, named 'TReceivePlanH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanHNss withTReceivePlanH() {
        _query.xdoNss(() -> _query.queryTReceivePlanH());
        return new TReceivePlanHNss(_query.queryTReceivePlanH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_store_record_r by STORE_RECORD_H_ID, named 'TStoreRecordRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreRecordRNss withTStoreRecordRAsOne() {
        _query.xdoNss(() -> _query.queryTStoreRecordRAsOne());
        return new TStoreRecordRNss(_query.queryTStoreRecordRAsOne());
    }
}
