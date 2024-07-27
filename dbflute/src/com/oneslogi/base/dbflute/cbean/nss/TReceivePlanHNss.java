package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TReceivePlanHCQ;

/**
 * The nest select set-upper of t_receive_plan_h.
 * @author DBFlute(AutoGenerator)
 */
public class TReceivePlanHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TReceivePlanHCQ _query;
    public TReceivePlanHNss(TReceivePlanHCQ query) { _query = query; }
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
     * m_customer by my PLAN_SUPPLIER_ID, named 'MCustomerByPlanSupplierId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByPlanSupplierId() {
        _query.xdoNss(() -> _query.queryMCustomerByPlanSupplierId());
        return new MCustomerNss(_query.queryMCustomerByPlanSupplierId());
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
     * m_process_type by my PROCESS_TYPE_ID, named 'MProcessType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MProcessTypeNss withMProcessType() {
        _query.xdoNss(() -> _query.queryMProcessType());
        return new MProcessTypeNss(_query.queryMProcessType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_receive_plan_h by my OLD_RECEIVE_PLAN_H_ID, named 'TReceivePlanHSelf'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanHNss withTReceivePlanHSelf() {
        _query.xdoNss(() -> _query.queryTReceivePlanHSelf());
        return new TReceivePlanHNss(_query.queryTReceivePlanHSelf());
    }
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
     * m_customer by my PLAN_DEPOSIT_ID, named 'MCustomerByPlanDepositId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MCustomerNss withMCustomerByPlanDepositId() {
        _query.xdoNss(() -> _query.queryMCustomerByPlanDepositId());
        return new MCustomerNss(_query.queryMCustomerByPlanDepositId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my CENTER_TRANSIT_FLG, named 'BClassDtlByCenterTransitFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCenterTransitFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCenterTransitFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCenterTransitFlg());
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
     * b_class_dtl by my INPUT_TYPE, named 'BClassDtlByInputType'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInputType() {
        _query.xdoNss(() -> _query.queryBClassDtlByInputType());
        return new BClassDtlNss(_query.queryBClassDtlByInputType());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my RECEIVE_DELIVERY_STATUS, named 'BClassDtlByReceiveDeliveryStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveDeliveryStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveDeliveryStatus());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveDeliveryStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my RECEIVE_STATUS, named 'BClassDtlByReceiveStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByReceiveStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByReceiveStatus());
        return new BClassDtlNss(_query.queryBClassDtlByReceiveStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_receive_plan_r by RECEIVE_PLAN_H_ID, named 'TReceivePlanRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TReceivePlanRNss withTReceivePlanRAsOne() {
        _query.xdoNss(() -> _query.queryTReceivePlanRAsOne());
        return new TReceivePlanRNss(_query.queryTReceivePlanRAsOne());
    }
}