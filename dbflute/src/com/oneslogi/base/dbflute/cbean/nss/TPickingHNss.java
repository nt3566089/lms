package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPickingHCQ;

/**
 * The nest select set-upper of t_picking_h.
 * @author DBFlute(AutoGenerator)
 */
public class TPickingHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPickingHCQ _query;
    public TPickingHNss(TPickingHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * m_client by my CLIENT_ID, named 'MClient'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MClientNss withMClient() {
        _query.xdoNss(() -> _query.queryMClient());
        return new MClientNss(_query.queryMClient());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_alloc_inst_h by my ALLOC_INST_H_ID, named 'TAllocInstH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TAllocInstHNss withTAllocInstH() {
        _query.xdoNss(() -> _query.queryTAllocInstH());
        return new TAllocInstHNss(_query.queryTAllocInstH());
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
     * b_class_dtl by my FORCE_FIXED_FLG, named 'BClassDtlByForceFixedFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByForceFixedFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByForceFixedFlg());
        return new BClassDtlNss(_query.queryBClassDtlByForceFixedFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PACKING_CAL_CLS, named 'BClassDtlByPackingCalCls'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingCalCls() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingCalCls());
        return new BClassDtlNss(_query.queryBClassDtlByPackingCalCls());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PICKING_STATUS, named 'BClassDtlByPickingStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPickingStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByPickingStatus());
        return new BClassDtlNss(_query.queryBClassDtlByPickingStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my SGL_ROW_PIC_FLG, named 'BClassDtlBySglRowPicFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlBySglRowPicFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlBySglRowPicFlg());
        return new BClassDtlNss(_query.queryBClassDtlBySglRowPicFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_picking_r by PICKING_H_ID, named 'TPickingRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingRNss withTPickingRAsOne() {
        _query.xdoNss(() -> _query.queryTPickingRAsOne());
        return new TPickingRNss(_query.queryTPickingRAsOne());
    }
}
