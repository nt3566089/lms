package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.MProductCQ;

/**
 * The nest select set-upper of m_product.
 * @author DBFlute(AutoGenerator)
 */
public class MProductNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final MProductCQ _query;
    public MProductNss(MProductCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * m_shape_grp by my SHAPE_GRP_ID, named 'MShapeGrp'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MShapeGrpNss withMShapeGrp() {
        _query.xdoNss(() -> _query.queryMShapeGrp());
        return new MShapeGrpNss(_query.queryMShapeGrp());
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
     * b_class_dtl by my DEL_FLG, named 'BClassDtlByDelFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByDelFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByDelFlg());
        return new BClassDtlNss(_query.queryBClassDtlByDelFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LIMIT_DT_MANAG_FLG, named 'BClassDtlByLimitDtManagFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitDtManagFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitDtManagFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitDtManagFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LIMIT_DT_REVERSE_FLG, named 'BClassDtlByLimitDtReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLimitDtReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLimitDtReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLimitDtReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LOT_MANAG_FLG, named 'BClassDtlByLotManagFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLotManagFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLotManagFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLotManagFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LOT_REVERSE_FLG, named 'BClassDtlByLotReverseFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLotReverseFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLotReverseFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLotReverseFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my MERGE_CLS, named 'BClassDtlByMergeCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMergeCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByMergeCls());
        return new BClassDtlNss(_query.queryBClassDtlByMergeCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SHIPPING_STOP_FLG, named 'BClassDtlByShippingStopFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByShippingStopFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByShippingStopFlg());
        return new BClassDtlNss(_query.queryBClassDtlByShippingStopFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my FREIGHT_CLS, named 'BClassDtlByFreightCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByFreightCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByFreightCls());
        return new BClassDtlNss(_query.queryBClassDtlByFreightCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PROD_DT_MANAG_FLG, named 'BClassDtlByProdDtManagFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByProdDtManagFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByProdDtManagFlg());
        return new BClassDtlNss(_query.queryBClassDtlByProdDtManagFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LOGI_SPECIAL_TYPE_CD, named 'BClassDtlByLogiSpecialTypeCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLogiSpecialTypeCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByLogiSpecialTypeCd());
        return new BClassDtlNss(_query.queryBClassDtlByLogiSpecialTypeCd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my OCR_DATE_FORMAT, named 'BClassDtlByOcrDateFormat'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByOcrDateFormat() {
        _query.xdoNss(() -> _query.queryBClassDtlByOcrDateFormat());
        return new BClassDtlNss(_query.queryBClassDtlByOcrDateFormat());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INSURANCE_FLG, named 'BClassDtlByInsuranceFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInsuranceFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInsuranceFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInsuranceFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my NO_OKINAWA_FLIGHT_FLG, named 'BClassDtlByNoOkinawaFlightFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByNoOkinawaFlightFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByNoOkinawaFlightFlg());
        return new BClassDtlNss(_query.queryBClassDtlByNoOkinawaFlightFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LOGI_ATTENTION_TYPE_CD, named 'BClassDtlByLogiAttentionTypeCd'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLogiAttentionTypeCd() {
        _query.xdoNss(() -> _query.queryBClassDtlByLogiAttentionTypeCd());
        return new BClassDtlNss(_query.queryBClassDtlByLogiAttentionTypeCd());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my HEAVY_ITEM_FLG, named 'BClassDtlByHeavyItemFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByHeavyItemFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByHeavyItemFlg());
        return new BClassDtlNss(_query.queryBClassDtlByHeavyItemFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LARGE_ITEM_FLG, named 'BClassDtlByLargeItemFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLargeItemFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLargeItemFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLargeItemFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * m_set_parent by PRODUCT_ID, named 'MSetParentAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MSetParentNss withMSetParentAsOne() {
        _query.xdoNss(() -> _query.queryMSetParentAsOne());
        return new MSetParentNss(_query.queryMSetParentAsOne());
    }
}
