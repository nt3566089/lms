package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TInventoryInstCQ;

/**
 * The nest select set-upper of t_inventory_inst.
 * @author DBFlute(AutoGenerator)
 */
public class TInventoryInstNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TInventoryInstCQ _query;
    public TInventoryInstNss(TInventoryInstCQ query) { _query = query; }
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
     * m_zone by my ZONE_ID, named 'MZone'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MZoneNss withMZone() {
        _query.xdoNss(() -> _query.queryMZone());
        return new MZoneNss(_query.queryMZone());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my DEPOSIT_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_inventory_h by my INVENTORY_H_ID, named 'TInventoryH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TInventoryHNss withTInventoryH() {
        _query.xdoNss(() -> _query.queryTInventoryH());
        return new TInventoryHNss(_query.queryTInventoryH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my STOCK_EXIST_ONLY_FLG, named 'BClassDtlByStockExistOnlyFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByStockExistOnlyFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByStockExistOnlyFlg());
        return new BClassDtlNss(_query.queryBClassDtlByStockExistOnlyFlg());
    }
}
