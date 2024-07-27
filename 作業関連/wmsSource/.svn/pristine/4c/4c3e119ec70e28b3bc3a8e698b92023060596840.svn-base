package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MLocationReplenishProductCQ;

/**
 * The nest select set-upper of m_location_replenish_product.
 * @author DBFlute(AutoGenerator)
 */
public class MLocationReplenishProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MLocationReplenishProductCQ _query;
    public MLocationReplenishProductNss(MLocationReplenishProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_customer by my REPLENISH_DEPOSIT_ID, named 'MCustomer'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomer() {
        _query.xdoNss(() -> _query.queryMCustomer());
        return new MCustomerNss(_query.queryMCustomer());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_product_shape by my MAX_STORE_PRODUCT_SHAPE_ID, named 'MProductShape'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductShapeNss withMProductShape() {
        _query.xdoNss(() -> _query.queryMProductShape());
        return new MProductShapeNss(_query.queryMProductShape());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_shape by my REPLENISH_P_PRODUCT_SHAPE_ID, named 'MShape'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeNss withMShape() {
        _query.xdoNss(() -> _query.queryMShape());
        return new MShapeNss(_query.queryMShape());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_product by my REPLENISH_PRODUCT_ID, named 'MProduct'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProductNss withMProduct() {
        _query.xdoNss(() -> _query.queryMProduct());
        return new MProductNss(_query.queryMProduct());
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
     * m_stock_type by my REPLENISH_STOCK_TYPE_ID, named 'MStockType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MStockTypeNss withMStockType() {
        _query.xdoNss(() -> _query.queryMStockType());
        return new MStockTypeNss(_query.queryMStockType());
    }
}
