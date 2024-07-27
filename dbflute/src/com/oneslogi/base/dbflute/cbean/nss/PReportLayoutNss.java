package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PReportLayoutCQ;

/**
 * The nest select set-upper of p_report_layout.
 * @author DBFlute(AutoGenerator)
 */
public class PReportLayoutNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PReportLayoutCQ _query;
    public PReportLayoutNss(PReportLayoutCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_report by my REPORT_ID, named 'PReport'.
     */
    public void withPReport() {
        _query.xdoNss(() -> _query.queryPReport());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my UPDATABLE, named 'BClassDtlByUpdatable'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByUpdatable() {
        _query.xdoNss(() -> _query.queryBClassDtlByUpdatable());
        return new BClassDtlNss(_query.queryBClassDtlByUpdatable());
    }
    /**
     * With nested relation columns to select clause. <br>
     * b_class_dtl by my AUTO_PRINT_TARGET_FLG, named 'BClassDtlByAutoPrintTargetFlg'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public BClassDtlNss withBClassDtlByAutoPrintTargetFlg() {
        _query.xdoNss(() -> _query.queryBClassDtlByAutoPrintTargetFlg());
        return new BClassDtlNss(_query.queryBClassDtlByAutoPrintTargetFlg());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_layout_print_setting by REPORT_LAYOUT_ID, named 'PLayoutPrintSettingAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PLayoutPrintSettingNss withPLayoutPrintSettingAsOne() {
        _query.xdoNss(() -> _query.queryPLayoutPrintSettingAsOne());
        return new PLayoutPrintSettingNss(_query.queryPLayoutPrintSettingAsOne());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_subrep_layout by REPORT_LAYOUT_ID, named 'PSubrepLayoutAsOne'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PSubrepLayoutNss withPSubrepLayoutAsOne() {
        _query.xdoNss(() -> _query.queryPSubrepLayoutAsOne());
        return new PSubrepLayoutNss(_query.queryPSubrepLayoutAsOne());
    }
}
