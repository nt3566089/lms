package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.WSglRowShipInspBCQ;

/**
 * The nest select set-upper of w_sgl_row_ship_insp_b.
 * @author DBFlute(AutoGenerator)
 */
public class WSglRowShipInspBNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final WSglRowShipInspBCQ _query;
    public WSglRowShipInspBNss(WSglRowShipInspBCQ query) { _query = query; }
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
     * b_user by my USER_ID, named 'BUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUser() {
        _query.xdoNss(() -> _query.queryBUser());
        return new BUserNss(_query.queryBUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * w_sgl_row_ship_insp_h by my SGL_ROW_SHIP_INSP_H_ID, named 'WSglRowShipInspH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public WSglRowShipInspHNss withWSglRowShipInspH() {
        _query.xdoNss(() -> _query.queryWSglRowShipInspH());
        return new WSglRowShipInspHNss(_query.queryWSglRowShipInspH());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my INSPECTION_FLG, named 'BClassDtlByInspectionFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByInspectionFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByInspectionFlg());
        return new BClassDtlNss(_query.queryBClassDtlByInspectionFlg());
    }
}
