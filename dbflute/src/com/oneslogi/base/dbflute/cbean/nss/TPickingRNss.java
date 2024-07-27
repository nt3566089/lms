package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPickingRCQ;

/**
 * The nest select set-upper of t_picking_r.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingRNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPickingRCQ _query;
    public TPickingRNss(TPickingRCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * b_user by my CASE_OUT_USER_ID, named 'BUserByCaseOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByCaseOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByCaseOutUserId());
        return new BUserNss(_query.queryBUserByCaseOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my BOL_OUT_USER_ID, named 'BUserByBolOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByBolOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByBolOutUserId());
        return new BUserNss(_query.queryBUserByBolOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my PL1_OUT_USER_ID, named 'BUserByPl1OutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByPl1OutUserId() {
        _query.xdoNss(() -> _query.queryBUserByPl1OutUserId());
        return new BUserNss(_query.queryBUserByPl1OutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my TAG_OUT_USER_ID, named 'BUserByTagOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByTagOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByTagOutUserId());
        return new BUserNss(_query.queryBUserByTagOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my SHIPPING_RECORD_OUT_USER_ID, named 'BUserByShippingRecordOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByShippingRecordOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByShippingRecordOutUserId());
        return new BUserNss(_query.queryBUserByShippingRecordOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my DELIV_OUT_USER_ID, named 'BUserByDelivOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByDelivOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByDelivOutUserId());
        return new BUserNss(_query.queryBUserByDelivOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INDV_SUPPLY_OUT_USER_ID, named 'BUserByIndvSupplyOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByIndvSupplyOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByIndvSupplyOutUserId());
        return new BUserNss(_query.queryBUserByIndvSupplyOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my PACKING_OUT_USER_ID, named 'BUserByPackingOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByPackingOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByPackingOutUserId());
        return new BUserNss(_query.queryBUserByPackingOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my PL_OUT_USER_ID, named 'BUserByPlOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByPlOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByPlOutUserId());
        return new BUserNss(_query.queryBUserByPlOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my INDV_LABEL_OUT_USER_ID, named 'BUserByIndvLabelOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByIndvLabelOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByIndvLabelOutUserId());
        return new BUserNss(_query.queryBUserByIndvLabelOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my PL2_OUT_USER_ID, named 'BUserByPl2OutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByPl2OutUserId() {
        _query.xdoNss(() -> _query.queryBUserByPl2OutUserId());
        return new BUserNss(_query.queryBUserByPl2OutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my SLIP_OUT_USER_ID, named 'BUserBySlipOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserBySlipOutUserId() {
        _query.xdoNss(() -> _query.queryBUserBySlipOutUserId());
        return new BUserNss(_query.queryBUserBySlipOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my NIZOROE_OUT_USER_ID, named 'BUserByNizoroeOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByNizoroeOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByNizoroeOutUserId());
        return new BUserNss(_query.queryBUserByNizoroeOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_user by my PLL_OUT_USER_ID, named 'BUserByPllOutUserId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByPllOutUserId() {
        _query.xdoNss(() -> _query.queryBUserByPllOutUserId());
        return new BUserNss(_query.queryBUserByPllOutUserId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INVOICE_CREATE_FLG, named 'BClassDtlByInvoiceCreateFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInvoiceCreateFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInvoiceCreateFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInvoiceCreateFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my OPL_OUT_FLG, named 'BClassDtlByOplOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByOplOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByOplOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByOplOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my TPL_OUT_FLG, named 'BClassDtlByTplOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByTplOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByTplOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByTplOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my CASE_OUT_FLG, named 'BClassDtlByCaseOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByCaseOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByCaseOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByCaseOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my MLT_OUT_FLG, named 'BClassDtlByMltOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMltOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByMltOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByMltOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SPL_OUT_FLG, named 'BClassDtlBySplOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySplOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySplOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySplOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PL_OUT_FLG, named 'BClassDtlByPlOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPlOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPlOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPlOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SL_OUT_FLG, named 'BClassDtlBySlOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySlOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySlOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySlOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PL1_OUT_FLG, named 'BClassDtlByPl1OutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPl1OutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPl1OutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPl1OutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PL2_OUT_FLG, named 'BClassDtlByPl2OutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPl2OutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPl2OutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPl2OutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PACKING_OUT_FLG, named 'BClassDtlByPackingOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByPackingOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SLIP_OUT_FLG, named 'BClassDtlBySlipOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySlipOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySlipOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySlipOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SHIPPING_RECORD_OUT_FLG, named 'BClassDtlByShippingRecordOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingRecordOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingRecordOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByShippingRecordOutFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my BOL_OUT_FLG, named 'BClassDtlByBolOutFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByBolOutFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByBolOutFlg());
        return new BClassDtlNss(_query.queryBClassDtlByBolOutFlg());
    }
}
