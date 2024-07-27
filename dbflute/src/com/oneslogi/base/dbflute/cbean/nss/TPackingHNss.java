package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.TPackingHCQ;

/**
 * The nest select set-upper of t_packing_h.
 * @author DBFlute(AutoGenerator)
 */
public class TPackingHNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final TPackingHCQ _query;
    public TPackingHNss(TPackingHCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
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
     * t_picking_h by my PICKING_H_ID, named 'TPickingH'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPickingHNss withTPickingH() {
        _query.xdoNss(() -> _query.queryTPickingH());
        return new TPickingHNss(_query.queryTPickingH());
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
     * m_box by my BOX_ID, named 'MBox'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public MBoxNss withMBox() {
        _query.xdoNss(() -> _query.queryMBox());
        return new MBoxNss(_query.queryMBox());
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
     * b_user by my UPD_USER, named 'BUserByUpdUser'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BUserNss withBUserByUpdUser() {
        _query.xdoNss(() -> _query.queryBUserByUpdUser());
        return new BUserNss(_query.queryBUserByUpdUser());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my LOADING_FLG, named 'BClassDtlByLoadingFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByLoadingFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByLoadingFlg());
        return new BClassDtlNss(_query.queryBClassDtlByLoadingFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my MIXED_FLG, named 'BClassDtlByMixedFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMixedFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByMixedFlg());
        return new BClassDtlNss(_query.queryBClassDtlByMixedFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my MULTI_PIC_FLG, named 'BClassDtlByMultiPicFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByMultiPicFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByMultiPicFlg());
        return new BClassDtlNss(_query.queryBClassDtlByMultiPicFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my PACKING_STATUS, named 'BClassDtlByPackingStatus'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByPackingStatus() {
        _query.xdoNss(() -> _query.queryBClassDtlByPackingStatus());
        return new BClassDtlNss(_query.queryBClassDtlByPackingStatus());
    }
    /**
     * With nested relation columns to select clause. <br>
     * t_packing_r by PACKING_H_ID, named 'TPackingRAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public TPackingRNss withTPackingRAsOne() {
        _query.xdoNss(() -> _query.queryTPackingRAsOne());
        return new TPackingRNss(_query.queryTPackingRAsOne());
    }
}
