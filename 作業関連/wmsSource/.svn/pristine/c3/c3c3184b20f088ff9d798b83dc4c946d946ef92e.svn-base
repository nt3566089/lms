package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_picking_r as TABLE. <br>
 * 出庫帳票
 * <pre>
 * [primary-key]
 *     PICKING_H_ID
 *
 * [column]
 *     PICKING_H_ID, OPL_OUT_FLG, TPL_OUT_FLG, MLT_OUT_FLG, SPL_OUT_FLG, PL1_OUT_FLG, PL1_OUT_USER_ID, PL1_OUT_DT, PL_OUT_FLG, PL_OUT_USER_ID, PL_OUT_DT, SL_OUT_FLG, PL2_OUT_FLG, PL2_OUT_USER_ID, PL2_OUT_DT, CASE_OUT_FLG, CASE_OUT_USER_ID, CASE_OUT_DT, PACKING_OUT_FLG, PACKING_OUT_USER_ID, PACKING_OUT_DT, SLIP_OUT_FLG, SLIP_OUT_USER_ID, SLIP_OUT_DT, INVOICE_CREATE_FLG, INVOICE_CREATE_DT, INVOICE_ISSUE_NUM, SHIPPING_RECORD_OUT_FLG, SHIPPING_RECORD_OUT_USER_ID, SHIPPING_RECORD_OUT_DT, BOL_OUT_FLG, BOL_OUT_USER_ID, BOL_OUT_DT, TAG_OUT_FLG, TAG_OUT_USER_ID, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_USER_ID, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_USER_ID, PLL_OUT_DT, NIZOROE_OUT_FLG, NIZOROE_OUT_USER_ID, NIZOROE_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_USER_ID, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_USER_ID, INDV_LABEL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_picking_h, b_user, b_class_dtl(ByInvoiceCreateFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tPickingH, bUserByCaseOutUserId, bUserByBolOutUserId, bUserByPl1OutUserId, bUserByTagOutUserId, bUserByShippingRecordOutUserId, bUserByDelivOutUserId, bUserByIndvSupplyOutUserId, bUserByPackingOutUserId, bUserByPlOutUserId, bUserByIndvLabelOutUserId, bUserByPl2OutUserId, bUserBySlipOutUserId, bUserByNizoroeOutUserId, bUserByPllOutUserId, bClassDtlByInvoiceCreateFlg, bClassDtlByOplOutFlg, bClassDtlByTplOutFlg, bClassDtlByCaseOutFlg, bClassDtlByMltOutFlg, bClassDtlBySplOutFlg, bClassDtlByPlOutFlg, bClassDtlBySlOutFlg, bClassDtlByPl1OutFlg, bClassDtlByPl2OutFlg, bClassDtlByPackingOutFlg, bClassDtlBySlipOutFlg, bClassDtlByShippingRecordOutFlg, bClassDtlByBolOutFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPickingRDto implements Serializable {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Column
    //                                                ------
    /** PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h} */
    @JsonKey
    protected Long _pickingHId;

    /** OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _oplOutFlg;

    /** TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _tplOutFlg;

    /** MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _mltOutFlg;

    /** SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _splOutFlg;

    /** PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _pl1OutFlg;

    /** PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _pl1OutUserId;

    /** PL1_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _pl1OutDt;

    /** PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _plOutFlg;

    /** PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _plOutUserId;

    /** PL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _plOutDt;

    /** SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _slOutFlg;

    /** PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _pl2OutFlg;

    /** PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _pl2OutUserId;

    /** PL2_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _pl2OutDt;

    /** CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _caseOutFlg;

    /** CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _caseOutUserId;

    /** CASE_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _caseOutDt;

    /** PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _packingOutFlg;

    /** PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _packingOutUserId;

    /** PACKING_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _packingOutDt;

    /** SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _slipOutFlg;

    /** SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _slipOutUserId;

    /** SLIP_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _slipOutDt;

    /** INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} */
    @JsonKey
    protected String _invoiceCreateFlg;

    /** INVOICE_CREATE_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _invoiceCreateDt;

    /** INVOICE_ISSUE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _invoiceIssueNum;

    /** SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} */
    @JsonKey
    protected String _shippingRecordOutFlg;

    /** SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _shippingRecordOutUserId;

    /** SHIPPING_RECORD_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _shippingRecordOutDt;

    /** BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} */
    @JsonKey
    protected String _bolOutFlg;

    /** BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _bolOutUserId;

    /** BOL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _bolOutDt;

    /** TAG_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _tagOutFlg;

    /** TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _tagOutUserId;

    /** TAG_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _tagOutDt;

    /** DELIV_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _delivOutFlg;

    /** DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _delivOutUserId;

    /** DELIV_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _delivOutDt;

    /** PLL_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _pllOutFlg;

    /** PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _pllOutUserId;

    /** PLL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _pllOutDt;

    /** NIZOROE_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _nizoroeOutFlg;

    /** NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _nizoroeOutUserId;

    /** NIZOROE_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _nizoroeOutDt;

    /** INDV_SUPPLY_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _indvSupplyOutFlg;

    /** INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _indvSupplyOutUserId;

    /** INDV_SUPPLY_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _indvSupplyOutDt;

    /** INDV_LABEL_OUT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _indvLabelOutFlg;

    /** INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _indvLabelOutUserId;

    /** INDV_LABEL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _indvLabelOutDt;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    @JsonKey
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    @JsonKey
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    @JsonKey
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    @JsonKey
    protected String _updProcess;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsTPickingRDto() {
    }

    // ===================================================================================
    //                                                                 Modified Properties
    //                                                                 ===================
    public Set<String> mymodifiedProperties() {
        return __modifiedProperties;
    }

    public void clearModifiedInfo() {
        __modifiedProperties.clear();
    }

    public boolean hasModification() {
        return !__modifiedProperties.isEmpty();
    }

    // ===================================================================================
    //                                                                       Foreign Table
    //                                                                       =============
    protected TPickingHDto _tPickingH;

    public TPickingHDto getTPickingH() {
        return _tPickingH;
    }

    public void setTPickingH(TPickingHDto tPickingH) {
        this._tPickingH = tPickingH;
    }

    protected BUserDto _bUserByCaseOutUserId;

    public BUserDto getBUserByCaseOutUserId() {
        return _bUserByCaseOutUserId;
    }

    public void setBUserByCaseOutUserId(BUserDto bUserByCaseOutUserId) {
        this._bUserByCaseOutUserId = bUserByCaseOutUserId;
    }

    protected BUserDto _bUserByBolOutUserId;

    public BUserDto getBUserByBolOutUserId() {
        return _bUserByBolOutUserId;
    }

    public void setBUserByBolOutUserId(BUserDto bUserByBolOutUserId) {
        this._bUserByBolOutUserId = bUserByBolOutUserId;
    }

    protected BUserDto _bUserByPl1OutUserId;

    public BUserDto getBUserByPl1OutUserId() {
        return _bUserByPl1OutUserId;
    }

    public void setBUserByPl1OutUserId(BUserDto bUserByPl1OutUserId) {
        this._bUserByPl1OutUserId = bUserByPl1OutUserId;
    }

    protected BUserDto _bUserByTagOutUserId;

    public BUserDto getBUserByTagOutUserId() {
        return _bUserByTagOutUserId;
    }

    public void setBUserByTagOutUserId(BUserDto bUserByTagOutUserId) {
        this._bUserByTagOutUserId = bUserByTagOutUserId;
    }

    protected BUserDto _bUserByShippingRecordOutUserId;

    public BUserDto getBUserByShippingRecordOutUserId() {
        return _bUserByShippingRecordOutUserId;
    }

    public void setBUserByShippingRecordOutUserId(BUserDto bUserByShippingRecordOutUserId) {
        this._bUserByShippingRecordOutUserId = bUserByShippingRecordOutUserId;
    }

    protected BUserDto _bUserByDelivOutUserId;

    public BUserDto getBUserByDelivOutUserId() {
        return _bUserByDelivOutUserId;
    }

    public void setBUserByDelivOutUserId(BUserDto bUserByDelivOutUserId) {
        this._bUserByDelivOutUserId = bUserByDelivOutUserId;
    }

    protected BUserDto _bUserByIndvSupplyOutUserId;

    public BUserDto getBUserByIndvSupplyOutUserId() {
        return _bUserByIndvSupplyOutUserId;
    }

    public void setBUserByIndvSupplyOutUserId(BUserDto bUserByIndvSupplyOutUserId) {
        this._bUserByIndvSupplyOutUserId = bUserByIndvSupplyOutUserId;
    }

    protected BUserDto _bUserByPackingOutUserId;

    public BUserDto getBUserByPackingOutUserId() {
        return _bUserByPackingOutUserId;
    }

    public void setBUserByPackingOutUserId(BUserDto bUserByPackingOutUserId) {
        this._bUserByPackingOutUserId = bUserByPackingOutUserId;
    }

    protected BUserDto _bUserByPlOutUserId;

    public BUserDto getBUserByPlOutUserId() {
        return _bUserByPlOutUserId;
    }

    public void setBUserByPlOutUserId(BUserDto bUserByPlOutUserId) {
        this._bUserByPlOutUserId = bUserByPlOutUserId;
    }

    protected BUserDto _bUserByIndvLabelOutUserId;

    public BUserDto getBUserByIndvLabelOutUserId() {
        return _bUserByIndvLabelOutUserId;
    }

    public void setBUserByIndvLabelOutUserId(BUserDto bUserByIndvLabelOutUserId) {
        this._bUserByIndvLabelOutUserId = bUserByIndvLabelOutUserId;
    }

    protected BUserDto _bUserByPl2OutUserId;

    public BUserDto getBUserByPl2OutUserId() {
        return _bUserByPl2OutUserId;
    }

    public void setBUserByPl2OutUserId(BUserDto bUserByPl2OutUserId) {
        this._bUserByPl2OutUserId = bUserByPl2OutUserId;
    }

    protected BUserDto _bUserBySlipOutUserId;

    public BUserDto getBUserBySlipOutUserId() {
        return _bUserBySlipOutUserId;
    }

    public void setBUserBySlipOutUserId(BUserDto bUserBySlipOutUserId) {
        this._bUserBySlipOutUserId = bUserBySlipOutUserId;
    }

    protected BUserDto _bUserByNizoroeOutUserId;

    public BUserDto getBUserByNizoroeOutUserId() {
        return _bUserByNizoroeOutUserId;
    }

    public void setBUserByNizoroeOutUserId(BUserDto bUserByNizoroeOutUserId) {
        this._bUserByNizoroeOutUserId = bUserByNizoroeOutUserId;
    }

    protected BUserDto _bUserByPllOutUserId;

    public BUserDto getBUserByPllOutUserId() {
        return _bUserByPllOutUserId;
    }

    public void setBUserByPllOutUserId(BUserDto bUserByPllOutUserId) {
        this._bUserByPllOutUserId = bUserByPllOutUserId;
    }

    protected BClassDtlDto _bClassDtlByInvoiceCreateFlg;

    public BClassDtlDto getBClassDtlByInvoiceCreateFlg() {
        return _bClassDtlByInvoiceCreateFlg;
    }

    public void setBClassDtlByInvoiceCreateFlg(BClassDtlDto bClassDtlByInvoiceCreateFlg) {
        this._bClassDtlByInvoiceCreateFlg = bClassDtlByInvoiceCreateFlg;
    }

    protected BClassDtlDto _bClassDtlByOplOutFlg;

    public BClassDtlDto getBClassDtlByOplOutFlg() {
        return _bClassDtlByOplOutFlg;
    }

    public void setBClassDtlByOplOutFlg(BClassDtlDto bClassDtlByOplOutFlg) {
        this._bClassDtlByOplOutFlg = bClassDtlByOplOutFlg;
    }

    protected BClassDtlDto _bClassDtlByTplOutFlg;

    public BClassDtlDto getBClassDtlByTplOutFlg() {
        return _bClassDtlByTplOutFlg;
    }

    public void setBClassDtlByTplOutFlg(BClassDtlDto bClassDtlByTplOutFlg) {
        this._bClassDtlByTplOutFlg = bClassDtlByTplOutFlg;
    }

    protected BClassDtlDto _bClassDtlByCaseOutFlg;

    public BClassDtlDto getBClassDtlByCaseOutFlg() {
        return _bClassDtlByCaseOutFlg;
    }

    public void setBClassDtlByCaseOutFlg(BClassDtlDto bClassDtlByCaseOutFlg) {
        this._bClassDtlByCaseOutFlg = bClassDtlByCaseOutFlg;
    }

    protected BClassDtlDto _bClassDtlByMltOutFlg;

    public BClassDtlDto getBClassDtlByMltOutFlg() {
        return _bClassDtlByMltOutFlg;
    }

    public void setBClassDtlByMltOutFlg(BClassDtlDto bClassDtlByMltOutFlg) {
        this._bClassDtlByMltOutFlg = bClassDtlByMltOutFlg;
    }

    protected BClassDtlDto _bClassDtlBySplOutFlg;

    public BClassDtlDto getBClassDtlBySplOutFlg() {
        return _bClassDtlBySplOutFlg;
    }

    public void setBClassDtlBySplOutFlg(BClassDtlDto bClassDtlBySplOutFlg) {
        this._bClassDtlBySplOutFlg = bClassDtlBySplOutFlg;
    }

    protected BClassDtlDto _bClassDtlByPlOutFlg;

    public BClassDtlDto getBClassDtlByPlOutFlg() {
        return _bClassDtlByPlOutFlg;
    }

    public void setBClassDtlByPlOutFlg(BClassDtlDto bClassDtlByPlOutFlg) {
        this._bClassDtlByPlOutFlg = bClassDtlByPlOutFlg;
    }

    protected BClassDtlDto _bClassDtlBySlOutFlg;

    public BClassDtlDto getBClassDtlBySlOutFlg() {
        return _bClassDtlBySlOutFlg;
    }

    public void setBClassDtlBySlOutFlg(BClassDtlDto bClassDtlBySlOutFlg) {
        this._bClassDtlBySlOutFlg = bClassDtlBySlOutFlg;
    }

    protected BClassDtlDto _bClassDtlByPl1OutFlg;

    public BClassDtlDto getBClassDtlByPl1OutFlg() {
        return _bClassDtlByPl1OutFlg;
    }

    public void setBClassDtlByPl1OutFlg(BClassDtlDto bClassDtlByPl1OutFlg) {
        this._bClassDtlByPl1OutFlg = bClassDtlByPl1OutFlg;
    }

    protected BClassDtlDto _bClassDtlByPl2OutFlg;

    public BClassDtlDto getBClassDtlByPl2OutFlg() {
        return _bClassDtlByPl2OutFlg;
    }

    public void setBClassDtlByPl2OutFlg(BClassDtlDto bClassDtlByPl2OutFlg) {
        this._bClassDtlByPl2OutFlg = bClassDtlByPl2OutFlg;
    }

    protected BClassDtlDto _bClassDtlByPackingOutFlg;

    public BClassDtlDto getBClassDtlByPackingOutFlg() {
        return _bClassDtlByPackingOutFlg;
    }

    public void setBClassDtlByPackingOutFlg(BClassDtlDto bClassDtlByPackingOutFlg) {
        this._bClassDtlByPackingOutFlg = bClassDtlByPackingOutFlg;
    }

    protected BClassDtlDto _bClassDtlBySlipOutFlg;

    public BClassDtlDto getBClassDtlBySlipOutFlg() {
        return _bClassDtlBySlipOutFlg;
    }

    public void setBClassDtlBySlipOutFlg(BClassDtlDto bClassDtlBySlipOutFlg) {
        this._bClassDtlBySlipOutFlg = bClassDtlBySlipOutFlg;
    }

    protected BClassDtlDto _bClassDtlByShippingRecordOutFlg;

    public BClassDtlDto getBClassDtlByShippingRecordOutFlg() {
        return _bClassDtlByShippingRecordOutFlg;
    }

    public void setBClassDtlByShippingRecordOutFlg(BClassDtlDto bClassDtlByShippingRecordOutFlg) {
        this._bClassDtlByShippingRecordOutFlg = bClassDtlByShippingRecordOutFlg;
    }

    protected BClassDtlDto _bClassDtlByBolOutFlg;

    public BClassDtlDto getBClassDtlByBolOutFlg() {
        return _bClassDtlByBolOutFlg;
    }

    public void setBClassDtlByBolOutFlg(BClassDtlDto bClassDtlByBolOutFlg) {
        this._bClassDtlByBolOutFlg = bClassDtlByBolOutFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPickingRDto)) { return false; }
        final BsTPickingRDto otherEntity = (BsTPickingRDto)other;
        if (!helpComparingValue(getPickingHId(), otherEntity.getPickingHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_picking_r");
        result = xCH(result, getPickingHId());
        return result;
    }
    protected int xCH(int result, Object value) { // calculateHashcode()
        if (value == null) {
            return result;
        }
        return (31 * result) + (value instanceof byte[] ? ((byte[]) value).length : value.hashCode());
    }

    public int instanceHash() {
        return super.hashCode();
    }

    public String toString() {
        String c = ", ";
        StringBuilder sb = new StringBuilder();
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getOplOutFlg());
        sb.append(c).append(getTplOutFlg());
        sb.append(c).append(getMltOutFlg());
        sb.append(c).append(getSplOutFlg());
        sb.append(c).append(getPl1OutFlg());
        sb.append(c).append(getPl1OutUserId());
        sb.append(c).append(getPl1OutDt());
        sb.append(c).append(getPlOutFlg());
        sb.append(c).append(getPlOutUserId());
        sb.append(c).append(getPlOutDt());
        sb.append(c).append(getSlOutFlg());
        sb.append(c).append(getPl2OutFlg());
        sb.append(c).append(getPl2OutUserId());
        sb.append(c).append(getPl2OutDt());
        sb.append(c).append(getCaseOutFlg());
        sb.append(c).append(getCaseOutUserId());
        sb.append(c).append(getCaseOutDt());
        sb.append(c).append(getPackingOutFlg());
        sb.append(c).append(getPackingOutUserId());
        sb.append(c).append(getPackingOutDt());
        sb.append(c).append(getSlipOutFlg());
        sb.append(c).append(getSlipOutUserId());
        sb.append(c).append(getSlipOutDt());
        sb.append(c).append(getInvoiceCreateFlg());
        sb.append(c).append(getInvoiceCreateDt());
        sb.append(c).append(getInvoiceIssueNum());
        sb.append(c).append(getShippingRecordOutFlg());
        sb.append(c).append(getShippingRecordOutUserId());
        sb.append(c).append(getShippingRecordOutDt());
        sb.append(c).append(getBolOutFlg());
        sb.append(c).append(getBolOutUserId());
        sb.append(c).append(getBolOutDt());
        sb.append(c).append(getTagOutFlg());
        sb.append(c).append(getTagOutUserId());
        sb.append(c).append(getTagOutDt());
        sb.append(c).append(getDelivOutFlg());
        sb.append(c).append(getDelivOutUserId());
        sb.append(c).append(getDelivOutDt());
        sb.append(c).append(getPllOutFlg());
        sb.append(c).append(getPllOutUserId());
        sb.append(c).append(getPllOutDt());
        sb.append(c).append(getNizoroeOutFlg());
        sb.append(c).append(getNizoroeOutUserId());
        sb.append(c).append(getNizoroeOutDt());
        sb.append(c).append(getIndvSupplyOutFlg());
        sb.append(c).append(getIndvSupplyOutUserId());
        sb.append(c).append(getIndvSupplyOutDt());
        sb.append(c).append(getIndvLabelOutFlg());
        sb.append(c).append(getIndvLabelOutUserId());
        sb.append(c).append(getIndvLabelOutDt());
        sb.append(c).append(getDelFlg());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getControlNo());
        sb.append(c).append(getAddDt());
        sb.append(c).append(getAddUser());
        sb.append(c).append(getAddProcess());
        sb.append(c).append(getUpdDt());
        sb.append(c).append(getUpdUser());
        sb.append(c).append(getUpdProcess());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {PK, NotNull, BIGINT(19), FK to t_picking_h} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ
     * @return The value of the column 'OPL_OUT_FLG'. (NullAllowed)
     */
    public String getOplOutFlg() {
        return _oplOutFlg;
    }

    /**
     * [set] OPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * オーダーピッキングリスト出力フラグ
     * @param oplOutFlg The value of the column 'OPL_OUT_FLG'. (NullAllowed)
     */
    public void setOplOutFlg(String oplOutFlg) {
        __modifiedProperties.add("oplOutFlg");
        this._oplOutFlg = oplOutFlg;
    }

    /**
     * [get] TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * トータルピッキングリスト出力フラグ
     * @return The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public String getTplOutFlg() {
        return _tplOutFlg;
    }

    /**
     * [set] TPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * トータルピッキングリスト出力フラグ
     * @param tplOutFlg The value of the column 'TPL_OUT_FLG'. (NullAllowed)
     */
    public void setTplOutFlg(String tplOutFlg) {
        __modifiedProperties.add("tplOutFlg");
        this._tplOutFlg = tplOutFlg;
    }

    /**
     * [get] MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * マルチピッキングリスト出力フラグ
     * @return The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public String getMltOutFlg() {
        return _mltOutFlg;
    }

    /**
     * [set] MLT_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * マルチピッキングリスト出力フラグ
     * @param mltOutFlg The value of the column 'MLT_OUT_FLG'. (NullAllowed)
     */
    public void setMltOutFlg(String mltOutFlg) {
        __modifiedProperties.add("mltOutFlg");
        this._mltOutFlg = mltOutFlg;
    }

    /**
     * [get] SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 単行ピッキングリスト出力フラグ
     * @return The value of the column 'SPL_OUT_FLG'. (NullAllowed)
     */
    public String getSplOutFlg() {
        return _splOutFlg;
    }

    /**
     * [set] SPL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 単行ピッキングリスト出力フラグ
     * @param splOutFlg The value of the column 'SPL_OUT_FLG'. (NullAllowed)
     */
    public void setSplOutFlg(String splOutFlg) {
        __modifiedProperties.add("splOutFlg");
        this._splOutFlg = splOutFlg;
    }

    /**
     * [get] PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 1次ピッキングリスト出力フラグ
     * @return The value of the column 'PL1_OUT_FLG'. (NullAllowed)
     */
    public String getPl1OutFlg() {
        return _pl1OutFlg;
    }

    /**
     * [set] PL1_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 1次ピッキングリスト出力フラグ
     * @param pl1OutFlg The value of the column 'PL1_OUT_FLG'. (NullAllowed)
     */
    public void setPl1OutFlg(String pl1OutFlg) {
        __modifiedProperties.add("pl1OutFlg");
        this._pl1OutFlg = pl1OutFlg;
    }

    /**
     * [get] PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 1次ピッキングリスト出力者ID
     * @return The value of the column 'PL1_OUT_USER_ID'. (NullAllowed)
     */
    public Long getPl1OutUserId() {
        return _pl1OutUserId;
    }

    /**
     * [set] PL1_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 1次ピッキングリスト出力者ID
     * @param pl1OutUserId The value of the column 'PL1_OUT_USER_ID'. (NullAllowed)
     */
    public void setPl1OutUserId(Long pl1OutUserId) {
        __modifiedProperties.add("pl1OutUserId");
        this._pl1OutUserId = pl1OutUserId;
    }

    /**
     * [get] PL1_OUT_DT: {DATETIME(19)} <br>
     * 1次ピッキングリスト出力日時
     * @return The value of the column 'PL1_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPl1OutDt() {
        return _pl1OutDt;
    }

    /**
     * [set] PL1_OUT_DT: {DATETIME(19)} <br>
     * 1次ピッキングリスト出力日時
     * @param pl1OutDt The value of the column 'PL1_OUT_DT'. (NullAllowed)
     */
    public void setPl1OutDt(java.sql.Timestamp pl1OutDt) {
        __modifiedProperties.add("pl1OutDt");
        this._pl1OutDt = pl1OutDt;
    }

    /**
     * [get] PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ
     * @return The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public String getPlOutFlg() {
        return _plOutFlg;
    }

    /**
     * [set] PL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 摘み取りリスト出力フラグ
     * @param plOutFlg The value of the column 'PL_OUT_FLG'. (NullAllowed)
     */
    public void setPlOutFlg(String plOutFlg) {
        __modifiedProperties.add("plOutFlg");
        this._plOutFlg = plOutFlg;
    }

    /**
     * [get] PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 摘み取りリスト出力者
     * @return The value of the column 'PL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getPlOutUserId() {
        return _plOutUserId;
    }

    /**
     * [set] PL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 摘み取りリスト出力者
     * @param plOutUserId The value of the column 'PL_OUT_USER_ID'. (NullAllowed)
     */
    public void setPlOutUserId(Long plOutUserId) {
        __modifiedProperties.add("plOutUserId");
        this._plOutUserId = plOutUserId;
    }

    /**
     * [get] PL_OUT_DT: {DATETIME(19)} <br>
     * 摘み取りリスト出力日時
     * @return The value of the column 'PL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPlOutDt() {
        return _plOutDt;
    }

    /**
     * [set] PL_OUT_DT: {DATETIME(19)} <br>
     * 摘み取りリスト出力日時
     * @param plOutDt The value of the column 'PL_OUT_DT'. (NullAllowed)
     */
    public void setPlOutDt(java.sql.Timestamp plOutDt) {
        __modifiedProperties.add("plOutDt");
        this._plOutDt = plOutDt;
    }

    /**
     * [get] SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 種蒔きリスト出力フラグ
     * @return The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public String getSlOutFlg() {
        return _slOutFlg;
    }

    /**
     * [set] SL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 種蒔きリスト出力フラグ
     * @param slOutFlg The value of the column 'SL_OUT_FLG'. (NullAllowed)
     */
    public void setSlOutFlg(String slOutFlg) {
        __modifiedProperties.add("slOutFlg");
        this._slOutFlg = slOutFlg;
    }

    /**
     * [get] PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 2次ピッキングリスト出力フラグ
     * @return The value of the column 'PL2_OUT_FLG'. (NullAllowed)
     */
    public String getPl2OutFlg() {
        return _pl2OutFlg;
    }

    /**
     * [set] PL2_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 2次ピッキングリスト出力フラグ
     * @param pl2OutFlg The value of the column 'PL2_OUT_FLG'. (NullAllowed)
     */
    public void setPl2OutFlg(String pl2OutFlg) {
        __modifiedProperties.add("pl2OutFlg");
        this._pl2OutFlg = pl2OutFlg;
    }

    /**
     * [get] PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 2次ピッキングリスト出力者ID
     * @return The value of the column 'PL2_OUT_USER_ID'. (NullAllowed)
     */
    public Long getPl2OutUserId() {
        return _pl2OutUserId;
    }

    /**
     * [set] PL2_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 2次ピッキングリスト出力者ID
     * @param pl2OutUserId The value of the column 'PL2_OUT_USER_ID'. (NullAllowed)
     */
    public void setPl2OutUserId(Long pl2OutUserId) {
        __modifiedProperties.add("pl2OutUserId");
        this._pl2OutUserId = pl2OutUserId;
    }

    /**
     * [get] PL2_OUT_DT: {DATETIME(19)} <br>
     * 2次ピッキングリスト出力日時
     * @return The value of the column 'PL2_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPl2OutDt() {
        return _pl2OutDt;
    }

    /**
     * [set] PL2_OUT_DT: {DATETIME(19)} <br>
     * 2次ピッキングリスト出力日時
     * @param pl2OutDt The value of the column 'PL2_OUT_DT'. (NullAllowed)
     */
    public void setPl2OutDt(java.sql.Timestamp pl2OutDt) {
        __modifiedProperties.add("pl2OutDt");
        this._pl2OutDt = pl2OutDt;
    }

    /**
     * [get] CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * ケースピッキングリスト出力フラグ
     * @return The value of the column 'CASE_OUT_FLG'. (NullAllowed)
     */
    public String getCaseOutFlg() {
        return _caseOutFlg;
    }

    /**
     * [set] CASE_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * ケースピッキングリスト出力フラグ
     * @param caseOutFlg The value of the column 'CASE_OUT_FLG'. (NullAllowed)
     */
    public void setCaseOutFlg(String caseOutFlg) {
        __modifiedProperties.add("caseOutFlg");
        this._caseOutFlg = caseOutFlg;
    }

    /**
     * [get] CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * ケースピッキングリスト出力者ID
     * @return The value of the column 'CASE_OUT_USER_ID'. (NullAllowed)
     */
    public Long getCaseOutUserId() {
        return _caseOutUserId;
    }

    /**
     * [set] CASE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * ケースピッキングリスト出力者ID
     * @param caseOutUserId The value of the column 'CASE_OUT_USER_ID'. (NullAllowed)
     */
    public void setCaseOutUserId(Long caseOutUserId) {
        __modifiedProperties.add("caseOutUserId");
        this._caseOutUserId = caseOutUserId;
    }

    /**
     * [get] CASE_OUT_DT: {DATETIME(19)} <br>
     * ケースピッキングリスト出力日時
     * @return The value of the column 'CASE_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getCaseOutDt() {
        return _caseOutDt;
    }

    /**
     * [set] CASE_OUT_DT: {DATETIME(19)} <br>
     * ケースピッキングリスト出力日時
     * @param caseOutDt The value of the column 'CASE_OUT_DT'. (NullAllowed)
     */
    public void setCaseOutDt(java.sql.Timestamp caseOutDt) {
        __modifiedProperties.add("caseOutDt");
        this._caseOutDt = caseOutDt;
    }

    /**
     * [get] PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ
     * @return The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public String getPackingOutFlg() {
        return _packingOutFlg;
    }

    /**
     * [set] PACKING_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 納品明細書出力フラグ
     * @param packingOutFlg The value of the column 'PACKING_OUT_FLG'. (NullAllowed)
     */
    public void setPackingOutFlg(String packingOutFlg) {
        __modifiedProperties.add("packingOutFlg");
        this._packingOutFlg = packingOutFlg;
    }

    /**
     * [get] PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 納品明細書出力者ID
     * @return The value of the column 'PACKING_OUT_USER_ID'. (NullAllowed)
     */
    public Long getPackingOutUserId() {
        return _packingOutUserId;
    }

    /**
     * [set] PACKING_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 納品明細書出力者ID
     * @param packingOutUserId The value of the column 'PACKING_OUT_USER_ID'. (NullAllowed)
     */
    public void setPackingOutUserId(Long packingOutUserId) {
        __modifiedProperties.add("packingOutUserId");
        this._packingOutUserId = packingOutUserId;
    }

    /**
     * [get] PACKING_OUT_DT: {DATETIME(19)} <br>
     * 納品明細書出力日時
     * @return The value of the column 'PACKING_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPackingOutDt() {
        return _packingOutDt;
    }

    /**
     * [set] PACKING_OUT_DT: {DATETIME(19)} <br>
     * 納品明細書出力日時
     * @param packingOutDt The value of the column 'PACKING_OUT_DT'. (NullAllowed)
     */
    public void setPackingOutDt(java.sql.Timestamp packingOutDt) {
        __modifiedProperties.add("packingOutDt");
        this._packingOutDt = packingOutDt;
    }

    /**
     * [get] SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 送り状出力フラグ
     * @return The value of the column 'SLIP_OUT_FLG'. (NullAllowed)
     */
    public String getSlipOutFlg() {
        return _slipOutFlg;
    }

    /**
     * [set] SLIP_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 送り状出力フラグ
     * @param slipOutFlg The value of the column 'SLIP_OUT_FLG'. (NullAllowed)
     */
    public void setSlipOutFlg(String slipOutFlg) {
        __modifiedProperties.add("slipOutFlg");
        this._slipOutFlg = slipOutFlg;
    }

    /**
     * [get] SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 送り状出力者ID
     * @return The value of the column 'SLIP_OUT_USER_ID'. (NullAllowed)
     */
    public Long getSlipOutUserId() {
        return _slipOutUserId;
    }

    /**
     * [set] SLIP_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 送り状出力者ID
     * @param slipOutUserId The value of the column 'SLIP_OUT_USER_ID'. (NullAllowed)
     */
    public void setSlipOutUserId(Long slipOutUserId) {
        __modifiedProperties.add("slipOutUserId");
        this._slipOutUserId = slipOutUserId;
    }

    /**
     * [get] SLIP_OUT_DT: {DATETIME(19)} <br>
     * 送り状出力日時
     * @return The value of the column 'SLIP_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getSlipOutDt() {
        return _slipOutDt;
    }

    /**
     * [set] SLIP_OUT_DT: {DATETIME(19)} <br>
     * 送り状出力日時
     * @param slipOutDt The value of the column 'SLIP_OUT_DT'. (NullAllowed)
     */
    public void setSlipOutDt(java.sql.Timestamp slipOutDt) {
        __modifiedProperties.add("slipOutDt");
        this._slipOutDt = slipOutDt;
    }

    /**
     * [get] INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @return The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public String getInvoiceCreateFlg() {
        return _invoiceCreateFlg;
    }

    /**
     * [set] INVOICE_CREATE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=InvoiceCreateFlg} <br>
     * 送り状データ作成フラグ
     * @param invoiceCreateFlg The value of the column 'INVOICE_CREATE_FLG'. (NullAllowed)
     */
    public void setInvoiceCreateFlg(String invoiceCreateFlg) {
        __modifiedProperties.add("invoiceCreateFlg");
        this._invoiceCreateFlg = invoiceCreateFlg;
    }

    /**
     * [get] INVOICE_CREATE_DT: {DATETIME(19)} <br>
     * 送り状データ作成日時
     * @return The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInvoiceCreateDt() {
        return _invoiceCreateDt;
    }

    /**
     * [set] INVOICE_CREATE_DT: {DATETIME(19)} <br>
     * 送り状データ作成日時
     * @param invoiceCreateDt The value of the column 'INVOICE_CREATE_DT'. (NullAllowed)
     */
    public void setInvoiceCreateDt(java.sql.Timestamp invoiceCreateDt) {
        __modifiedProperties.add("invoiceCreateDt");
        this._invoiceCreateDt = invoiceCreateDt;
    }

    /**
     * [get] INVOICE_ISSUE_NUM: {BIGINT(19)} <br>
     * 送り状発行枚数
     * @return The value of the column 'INVOICE_ISSUE_NUM'. (NullAllowed)
     */
    public Long getInvoiceIssueNum() {
        return _invoiceIssueNum;
    }

    /**
     * [set] INVOICE_ISSUE_NUM: {BIGINT(19)} <br>
     * 送り状発行枚数
     * @param invoiceIssueNum The value of the column 'INVOICE_ISSUE_NUM'. (NullAllowed)
     */
    public void setInvoiceIssueNum(Long invoiceIssueNum) {
        __modifiedProperties.add("invoiceIssueNum");
        this._invoiceIssueNum = invoiceIssueNum;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 出荷実績出力フラグ
     * @return The value of the column 'SHIPPING_RECORD_OUT_FLG'. (NullAllowed)
     */
    public String getShippingRecordOutFlg() {
        return _shippingRecordOutFlg;
    }

    /**
     * [set] SHIPPING_RECORD_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=ListOutFlg} <br>
     * 出荷実績出力フラグ
     * @param shippingRecordOutFlg The value of the column 'SHIPPING_RECORD_OUT_FLG'. (NullAllowed)
     */
    public void setShippingRecordOutFlg(String shippingRecordOutFlg) {
        __modifiedProperties.add("shippingRecordOutFlg");
        this._shippingRecordOutFlg = shippingRecordOutFlg;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出荷実績出力者ID
     * @return The value of the column 'SHIPPING_RECORD_OUT_USER_ID'. (NullAllowed)
     */
    public Long getShippingRecordOutUserId() {
        return _shippingRecordOutUserId;
    }

    /**
     * [set] SHIPPING_RECORD_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出荷実績出力者ID
     * @param shippingRecordOutUserId The value of the column 'SHIPPING_RECORD_OUT_USER_ID'. (NullAllowed)
     */
    public void setShippingRecordOutUserId(Long shippingRecordOutUserId) {
        __modifiedProperties.add("shippingRecordOutUserId");
        this._shippingRecordOutUserId = shippingRecordOutUserId;
    }

    /**
     * [get] SHIPPING_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 出荷実績出力日時
     * @return The value of the column 'SHIPPING_RECORD_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getShippingRecordOutDt() {
        return _shippingRecordOutDt;
    }

    /**
     * [set] SHIPPING_RECORD_OUT_DT: {DATETIME(19)} <br>
     * 出荷実績出力日時
     * @param shippingRecordOutDt The value of the column 'SHIPPING_RECORD_OUT_DT'. (NullAllowed)
     */
    public void setShippingRecordOutDt(java.sql.Timestamp shippingRecordOutDt) {
        __modifiedProperties.add("shippingRecordOutDt");
        this._shippingRecordOutDt = shippingRecordOutDt;
    }

    /**
     * [get] BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @return The value of the column 'BOL_OUT_FLG'. (NullAllowed)
     */
    public String getBolOutFlg() {
        return _bolOutFlg;
    }

    /**
     * [set] BOL_OUT_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=BolOutFlg} <br>
     * Bill of Lading出力フラグ
     * @param bolOutFlg The value of the column 'BOL_OUT_FLG'. (NullAllowed)
     */
    public void setBolOutFlg(String bolOutFlg) {
        __modifiedProperties.add("bolOutFlg");
        this._bolOutFlg = bolOutFlg;
    }

    /**
     * [get] BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * Bill of Lading出力者ID
     * @return The value of the column 'BOL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getBolOutUserId() {
        return _bolOutUserId;
    }

    /**
     * [set] BOL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * Bill of Lading出力者ID
     * @param bolOutUserId The value of the column 'BOL_OUT_USER_ID'. (NullAllowed)
     */
    public void setBolOutUserId(Long bolOutUserId) {
        __modifiedProperties.add("bolOutUserId");
        this._bolOutUserId = bolOutUserId;
    }

    /**
     * [get] BOL_OUT_DT: {DATETIME(19)} <br>
     * Bill of Lading出力日時
     * @return The value of the column 'BOL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getBolOutDt() {
        return _bolOutDt;
    }

    /**
     * [set] BOL_OUT_DT: {DATETIME(19)} <br>
     * Bill of Lading出力日時
     * @param bolOutDt The value of the column 'BOL_OUT_DT'. (NullAllowed)
     */
    public void setBolOutDt(java.sql.Timestamp bolOutDt) {
        __modifiedProperties.add("bolOutDt");
        this._bolOutDt = bolOutDt;
    }

    /**
     * [get] TAG_OUT_FLG: {CHAR(1)} <br>
     * 荷札出力フラグ
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public String getTagOutFlg() {
        return _tagOutFlg;
    }

    /**
     * [set] TAG_OUT_FLG: {CHAR(1)} <br>
     * 荷札出力フラグ
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public void setTagOutFlg(String tagOutFlg) {
        __modifiedProperties.add("tagOutFlg");
        this._tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 荷札出力者ID
     * @return The value of the column 'TAG_OUT_USER_ID'. (NullAllowed)
     */
    public Long getTagOutUserId() {
        return _tagOutUserId;
    }

    /**
     * [set] TAG_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 荷札出力者ID
     * @param tagOutUserId The value of the column 'TAG_OUT_USER_ID'. (NullAllowed)
     */
    public void setTagOutUserId(Long tagOutUserId) {
        __modifiedProperties.add("tagOutUserId");
        this._tagOutUserId = tagOutUserId;
    }

    /**
     * [get] TAG_OUT_DT: {DATETIME(19)} <br>
     * 荷札出力日時
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTagOutDt() {
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {DATETIME(19)} <br>
     * 荷札出力日時
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        __modifiedProperties.add("tagOutDt");
        this._tagOutDt = tagOutDt;
    }

    /**
     * [get] DELIV_OUT_FLG: {CHAR(1)} <br>
     * 納品書出力フラグ
     * @return The value of the column 'DELIV_OUT_FLG'. (NullAllowed)
     */
    public String getDelivOutFlg() {
        return _delivOutFlg;
    }

    /**
     * [set] DELIV_OUT_FLG: {CHAR(1)} <br>
     * 納品書出力フラグ
     * @param delivOutFlg The value of the column 'DELIV_OUT_FLG'. (NullAllowed)
     */
    public void setDelivOutFlg(String delivOutFlg) {
        __modifiedProperties.add("delivOutFlg");
        this._delivOutFlg = delivOutFlg;
    }

    /**
     * [get] DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 納品書出力者ID
     * @return The value of the column 'DELIV_OUT_USER_ID'. (NullAllowed)
     */
    public Long getDelivOutUserId() {
        return _delivOutUserId;
    }

    /**
     * [set] DELIV_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 納品書出力者ID
     * @param delivOutUserId The value of the column 'DELIV_OUT_USER_ID'. (NullAllowed)
     */
    public void setDelivOutUserId(Long delivOutUserId) {
        __modifiedProperties.add("delivOutUserId");
        this._delivOutUserId = delivOutUserId;
    }

    /**
     * [get] DELIV_OUT_DT: {DATETIME(19)} <br>
     * 納品書出力日時
     * @return The value of the column 'DELIV_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getDelivOutDt() {
        return _delivOutDt;
    }

    /**
     * [set] DELIV_OUT_DT: {DATETIME(19)} <br>
     * 納品書出力日時
     * @param delivOutDt The value of the column 'DELIV_OUT_DT'. (NullAllowed)
     */
    public void setDelivOutDt(java.sql.Timestamp delivOutDt) {
        __modifiedProperties.add("delivOutDt");
        this._delivOutDt = delivOutDt;
    }

    /**
     * [get] PLL_OUT_FLG: {CHAR(1)} <br>
     * 梱包明細出力フラグ
     * @return The value of the column 'PLL_OUT_FLG'. (NullAllowed)
     */
    public String getPllOutFlg() {
        return _pllOutFlg;
    }

    /**
     * [set] PLL_OUT_FLG: {CHAR(1)} <br>
     * 梱包明細出力フラグ
     * @param pllOutFlg The value of the column 'PLL_OUT_FLG'. (NullAllowed)
     */
    public void setPllOutFlg(String pllOutFlg) {
        __modifiedProperties.add("pllOutFlg");
        this._pllOutFlg = pllOutFlg;
    }

    /**
     * [get] PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 梱包明細出力者ID
     * @return The value of the column 'PLL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getPllOutUserId() {
        return _pllOutUserId;
    }

    /**
     * [set] PLL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 梱包明細出力者ID
     * @param pllOutUserId The value of the column 'PLL_OUT_USER_ID'. (NullAllowed)
     */
    public void setPllOutUserId(Long pllOutUserId) {
        __modifiedProperties.add("pllOutUserId");
        this._pllOutUserId = pllOutUserId;
    }

    /**
     * [get] PLL_OUT_DT: {DATETIME(19)} <br>
     * 梱包明細出力日時
     * @return The value of the column 'PLL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPllOutDt() {
        return _pllOutDt;
    }

    /**
     * [set] PLL_OUT_DT: {DATETIME(19)} <br>
     * 梱包明細出力日時
     * @param pllOutDt The value of the column 'PLL_OUT_DT'. (NullAllowed)
     */
    public void setPllOutDt(java.sql.Timestamp pllOutDt) {
        __modifiedProperties.add("pllOutDt");
        this._pllOutDt = pllOutDt;
    }

    /**
     * [get] NIZOROE_OUT_FLG: {CHAR(1)} <br>
     * 荷揃表出力フラグ
     * @return The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed)
     */
    public String getNizoroeOutFlg() {
        return _nizoroeOutFlg;
    }

    /**
     * [set] NIZOROE_OUT_FLG: {CHAR(1)} <br>
     * 荷揃表出力フラグ
     * @param nizoroeOutFlg The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed)
     */
    public void setNizoroeOutFlg(String nizoroeOutFlg) {
        __modifiedProperties.add("nizoroeOutFlg");
        this._nizoroeOutFlg = nizoroeOutFlg;
    }

    /**
     * [get] NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 荷揃表出力者ID
     * @return The value of the column 'NIZOROE_OUT_USER_ID'. (NullAllowed)
     */
    public Long getNizoroeOutUserId() {
        return _nizoroeOutUserId;
    }

    /**
     * [set] NIZOROE_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 荷揃表出力者ID
     * @param nizoroeOutUserId The value of the column 'NIZOROE_OUT_USER_ID'. (NullAllowed)
     */
    public void setNizoroeOutUserId(Long nizoroeOutUserId) {
        __modifiedProperties.add("nizoroeOutUserId");
        this._nizoroeOutUserId = nizoroeOutUserId;
    }

    /**
     * [get] NIZOROE_OUT_DT: {DATETIME(19)} <br>
     * 荷揃表出力日時
     * @return The value of the column 'NIZOROE_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getNizoroeOutDt() {
        return _nizoroeOutDt;
    }

    /**
     * [set] NIZOROE_OUT_DT: {DATETIME(19)} <br>
     * 荷揃表出力日時
     * @param nizoroeOutDt The value of the column 'NIZOROE_OUT_DT'. (NullAllowed)
     */
    public void setNizoroeOutDt(java.sql.Timestamp nizoroeOutDt) {
        __modifiedProperties.add("nizoroeOutDt");
        this._nizoroeOutDt = nizoroeOutDt;
    }

    /**
     * [get] INDV_SUPPLY_OUT_FLG: {CHAR(1)} <br>
     * 個人別支給明細出力フラグ
     * @return The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed)
     */
    public String getIndvSupplyOutFlg() {
        return _indvSupplyOutFlg;
    }

    /**
     * [set] INDV_SUPPLY_OUT_FLG: {CHAR(1)} <br>
     * 個人別支給明細出力フラグ
     * @param indvSupplyOutFlg The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed)
     */
    public void setIndvSupplyOutFlg(String indvSupplyOutFlg) {
        __modifiedProperties.add("indvSupplyOutFlg");
        this._indvSupplyOutFlg = indvSupplyOutFlg;
    }

    /**
     * [get] INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 個人別支給明細出力者ID
     * @return The value of the column 'INDV_SUPPLY_OUT_USER_ID'. (NullAllowed)
     */
    public Long getIndvSupplyOutUserId() {
        return _indvSupplyOutUserId;
    }

    /**
     * [set] INDV_SUPPLY_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 個人別支給明細出力者ID
     * @param indvSupplyOutUserId The value of the column 'INDV_SUPPLY_OUT_USER_ID'. (NullAllowed)
     */
    public void setIndvSupplyOutUserId(Long indvSupplyOutUserId) {
        __modifiedProperties.add("indvSupplyOutUserId");
        this._indvSupplyOutUserId = indvSupplyOutUserId;
    }

    /**
     * [get] INDV_SUPPLY_OUT_DT: {DATETIME(19)} <br>
     * 個人別支給明細出力日時
     * @return The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getIndvSupplyOutDt() {
        return _indvSupplyOutDt;
    }

    /**
     * [set] INDV_SUPPLY_OUT_DT: {DATETIME(19)} <br>
     * 個人別支給明細出力日時
     * @param indvSupplyOutDt The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed)
     */
    public void setIndvSupplyOutDt(java.sql.Timestamp indvSupplyOutDt) {
        __modifiedProperties.add("indvSupplyOutDt");
        this._indvSupplyOutDt = indvSupplyOutDt;
    }

    /**
     * [get] INDV_LABEL_OUT_FLG: {CHAR(1)} <br>
     * 個別貼り付けラベル出力フラグ
     * @return The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed)
     */
    public String getIndvLabelOutFlg() {
        return _indvLabelOutFlg;
    }

    /**
     * [set] INDV_LABEL_OUT_FLG: {CHAR(1)} <br>
     * 個別貼り付けラベル出力フラグ
     * @param indvLabelOutFlg The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed)
     */
    public void setIndvLabelOutFlg(String indvLabelOutFlg) {
        __modifiedProperties.add("indvLabelOutFlg");
        this._indvLabelOutFlg = indvLabelOutFlg;
    }

    /**
     * [get] INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 個別貼り付けラベル出力者ID
     * @return The value of the column 'INDV_LABEL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getIndvLabelOutUserId() {
        return _indvLabelOutUserId;
    }

    /**
     * [set] INDV_LABEL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 個別貼り付けラベル出力者ID
     * @param indvLabelOutUserId The value of the column 'INDV_LABEL_OUT_USER_ID'. (NullAllowed)
     */
    public void setIndvLabelOutUserId(Long indvLabelOutUserId) {
        __modifiedProperties.add("indvLabelOutUserId");
        this._indvLabelOutUserId = indvLabelOutUserId;
    }

    /**
     * [get] INDV_LABEL_OUT_DT: {DATETIME(19)} <br>
     * 個別貼り付けラベル出力日時
     * @return The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getIndvLabelOutDt() {
        return _indvLabelOutDt;
    }

    /**
     * [set] INDV_LABEL_OUT_DT: {DATETIME(19)} <br>
     * 個別貼り付けラベル出力日時
     * @param indvLabelOutDt The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed)
     */
    public void setIndvLabelOutDt(java.sql.Timestamp indvLabelOutDt) {
        __modifiedProperties.add("indvLabelOutDt");
        this._indvLabelOutDt = indvLabelOutDt;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public String getDelFlg() {
        return _delFlg;
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (NullAllowed)
     */
    public void setDelFlg(String delFlg) {
        __modifiedProperties.add("delFlg");
        this._delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public Long getControlNo() {
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed)
     */
    public void setControlNo(Long controlNo) {
        __modifiedProperties.add("controlNo");
        this._controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getAddDt() {
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        __modifiedProperties.add("addDt");
        this._addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed)
     */
    public String getAddUser() {
        return _addUser;
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed)
     */
    public void setAddUser(String addUser) {
        __modifiedProperties.add("addUser");
        this._addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public String getAddProcess() {
        return _addProcess;
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed)
     */
    public void setAddProcess(String addProcess) {
        __modifiedProperties.add("addProcess");
        this._addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getUpdDt() {
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        __modifiedProperties.add("updDt");
        this._updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed)
     */
    public String getUpdUser() {
        return _updUser;
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed)
     */
    public void setUpdUser(String updUser) {
        __modifiedProperties.add("updUser");
        this._updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public String getUpdProcess() {
        return _updProcess;
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed)
     */
    public void setUpdProcess(String updProcess) {
        __modifiedProperties.add("updProcess");
        this._updProcess = updProcess;
    }

}
