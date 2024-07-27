package com.oneslogi.base.dbflute.cbean.nss;

import com.oneslogi.base.dbflute.cbean.cq.PUserAutoPrintSettingCQ;

/**
 * The nest select set-upper of p_user_auto_print_setting.
 * @author DBFlute(AutoGenerator)
 */
public class PUserAutoPrintSettingNss {

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    protected final PUserAutoPrintSettingCQ _query;
    public PUserAutoPrintSettingNss(PUserAutoPrintSettingCQ query) { _query = query; }
    public boolean hasConditionQuery() { return _query != null; }

    // ===================================================================================
    //                                                                     Nested Relation
    //                                                                     ===============
    /**
     * With nested relation columns to select clause. <br>
     * p_report_layout by my REPORT_LAYOUT_ID, named 'PReportLayoutByReportLayoutId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PReportLayoutNss withPReportLayoutByReportLayoutId() {
        _query.xdoNss(() -> _query.queryPReportLayoutByReportLayoutId());
        return new PReportLayoutNss(_query.queryPReportLayoutByReportLayoutId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_printer_group by my PRINTER_GROUP_ID, named 'PPrinterGroupByPrinterGroupId'.
     */
    public void withPPrinterGroupByPrinterGroupId() {
        _query.xdoNss(() -> _query.queryPPrinterGroupByPrinterGroupId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_printer by my PRINTER_ID, named 'PPrinterByPrinterId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterNss withPPrinterByPrinterId() {
        _query.xdoNss(() -> _query.queryPPrinterByPrinterId());
        return new PPrinterNss(_query.queryPPrinterByPrinterId());
    }
    /**
     * With nested relation columns to select clause. <br>
     * p_printer_attribute by my PRINTER_ATTRIBUTE_ID, named 'PPrinterAttributeByPrinterAttributeId'.
     * @return The set-upper of more nested relation. {...with[nested-relation].with[more-nested-relation]} (NotNull)
     */
    public PPrinterAttributeNss withPPrinterAttributeByPrinterAttributeId() {
        _query.xdoNss(() -> _query.queryPPrinterAttributeByPrinterAttributeId());
        return new PPrinterAttributeNss(_query.queryPPrinterAttributeByPrinterAttributeId());
    }
}
