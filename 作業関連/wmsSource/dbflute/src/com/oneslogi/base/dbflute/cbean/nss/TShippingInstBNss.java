package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TShippingInstBCQ;

/**
 * The nest select set-upper of t_shipping_inst_b.
 * @author DBFlute(AutoGenerator)
 */
public class TShippingInstBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TShippingInstBCQ _query;
    public TShippingInstBNss(TShippingInstBCQ query) { _query = query; }
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
     * t_store_no by my STORE_NO_ID, named 'TStoreNo'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TStoreNoNss withTStoreNo() {
        _query.xdoNss(() -> _query.queryTStoreNo());
        return new TStoreNoNss(_query.queryTStoreNo());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_location by my LOCATION_ID, named 'MLocation'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MLocationNss withMLocation() {
        _query.xdoNss(() -> _query.queryMLocation());
        return new MLocationNss(_query.queryMLocation());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_alloc_inst_b by my ALLOC_INST_B_ID, named 'TAllocInstB'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstBNss withTAllocInstB() {
        _query.xdoNss(() -> _query.queryTAllocInstB());
        return new TAllocInstBNss(_query.queryTAllocInstB());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_shape by my SHAPE_ID, named 'MShape'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeNss withMShape() {
        _query.xdoNss(() -> _query.queryMShape());
        return new MShapeNss(_query.queryMShape());
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
    /**
     * With nested relation columns to select clause. <br>
     * t_lot by my LOT_ID, named 'TLot'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TLotNss withTLot() {
        _query.xdoNss(() -> _query.queryTLot());
        return new TLotNss(_query.queryTLot());
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
     * m_warehouse by my WAREHOUSE_ID, named 'MWarehouse'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MWarehouseNss withMWarehouse() {
        _query.xdoNss(() -> _query.queryMWarehouse());
        return new MWarehouseNss(_query.queryMWarehouse());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_inst_h by my SHIPPING_INST_H_ID, named 'TShippingInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstHNss withTShippingInstH() {
        _query.xdoNss(() -> _query.queryTShippingInstH());
        return new TShippingInstHNss(_query.queryTShippingInstH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my ERROR_FLG, named 'BClassDtlByErrorFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByErrorFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByErrorFlg());
        return new BClassDtlNss(_query.queryBClassDtlByErrorFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_shipping_inst_spare by SHIPPING_INST_B_ID, named 'TShippingInstSpareAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TShippingInstSpareNss withTShippingInstSpareAsOne() {
        _query.xdoNss(() -> _query.queryTShippingInstSpareAsOne());
        return new TShippingInstSpareNss(_query.queryTShippingInstSpareAsOne());
    }
}
