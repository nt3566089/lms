package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPickingListPrint. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SUPPLY_CUSTOMER_NM, DELIVERY_COURSE_CD, DELIVERY_COURSE_NM, CARRIER_CD, CARRIER_NM, KOHAI_CONTRACTOR_CD, KOHAI_CONTRACTOR_NM, SHIPPING_DT, WORK_DT, SHIPPING_FIXED_DT, CLIENT_SHIPPING_NO, PROCESS_TYPE_CD, PROCESS_TYPE_NM, SHIPPING_TYPE_CD, SHIPPING_TYPE_NM, SLIP_CNT, LINE_CNT, ITEM_CNT, INST_NUM, PACKING_NUM, NIZOROE_OUT_FLG, NIZOROE_OUT_NM, NIZOROE_OUT_DT, TAG_OUT_FLG, TAG_OUT_NM, TAG_OUT_DT, DELIV_OUT_FLG, DELIV_OUT_NM, DELIV_OUT_DT, PLL_OUT_FLG, PLL_OUT_NM, PLL_OUT_DT, INDV_SUPPLY_OUT_FLG, INDV_SUPPLY_OUT_NM, INDV_SUPPLY_OUT_DT, INDV_LABEL_OUT_FLG, INDV_LABEL_OUT_NM, INDV_LABEL_OUT_DT, CENTER_CD, CENTER_NM, EMERGENCY_FLG, PICKING_STATUS_CD, ID_MANAG_PRINT_TYPE_CD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
 *
 * [foreign-table]
 *     
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsSqlPickingListPrintDto implements Serializable {

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
    /** NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

    /** SUPPLY_CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _supplyCustomerNm;

    /** DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} */
    @JsonKey
    protected String _deliveryCourseCd;

    /** DELIVERY_COURSE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _deliveryCourseNm;

    /** CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierNm;

    /** KOHAI_CONTRACTOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _kohaiContractorCd;

    /** KOHAI_CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _kohaiContractorNm;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} */
    @JsonKey
    protected String _workDt;

    /** SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} */
    @JsonKey
    protected String _shippingFixedDt;

    /** CLIENT_SHIPPING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _clientShippingNo;

    /** PROCESS_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _processTypeCd;

    /** PROCESS_TYPE_NM: {VARCHAR(100)} */
    @JsonKey
    protected String _processTypeNm;

    /** SHIPPING_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingTypeCd;

    /** SHIPPING_TYPE_NM: {NULL} */
    @JsonKey
    protected String _shippingTypeNm;

    /** SLIP_CNT: {BIGINT(21)} */
    @JsonKey
    protected Long _slipCnt;

    /** LINE_CNT: {BIGINT(21)} */
    @JsonKey
    protected Long _lineCnt;

    /** ITEM_CNT: {BIGINT(21)} */
    @JsonKey
    protected Long _itemCnt;

    /** INST_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** PACKING_NUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _packingNum;

    /** NIZOROE_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _nizoroeOutFlg;

    /** NIZOROE_OUT_NM: {NULL} */
    @JsonKey
    protected String _nizoroeOutNm;

    /** NIZOROE_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _nizoroeOutDt;

    /** TAG_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _tagOutFlg;

    /** TAG_OUT_NM: {NULL} */
    @JsonKey
    protected String _tagOutNm;

    /** TAG_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _tagOutDt;

    /** DELIV_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _delivOutFlg;

    /** DELIV_OUT_NM: {NULL} */
    @JsonKey
    protected String _delivOutNm;

    /** DELIV_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _delivOutDt;

    /** PLL_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _pllOutFlg;

    /** PLL_OUT_NM: {NULL} */
    @JsonKey
    protected String _pllOutNm;

    /** PLL_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _pllOutDt;

    /** INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _indvSupplyOutFlg;

    /** INDV_SUPPLY_OUT_NM: {NULL} */
    @JsonKey
    protected String _indvSupplyOutNm;

    /** INDV_SUPPLY_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _indvSupplyOutDt;

    /** INDV_LABEL_OUT_FLG: {VARCHAR(1)} */
    @JsonKey
    protected String _indvLabelOutFlg;

    /** INDV_LABEL_OUT_NM: {NULL} */
    @JsonKey
    protected String _indvLabelOutNm;

    /** INDV_LABEL_OUT_DT: {DATETIME(23)} */
    @JsonKey
    protected java.sql.Timestamp _indvLabelOutDt;

    /** CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _centerNm;

    /** EMERGENCY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _emergencyFlg;

    /** PICKING_STATUS_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingStatusCd;

    /** ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _idManagPrintTypeCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPickingListPrintDto() {
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
    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsSqlPickingListPrintDto)) { return false; }
        final BsSqlPickingListPrintDto otherEntity = (BsSqlPickingListPrintDto)other;
        if (!helpComparingValue(getNizoroeNo2(), otherEntity.getNizoroeNo2())) { return false; }
        if (!helpComparingValue(getDaihyoNizoroeNo2(), otherEntity.getDaihyoNizoroeNo2())) { return false; }
        if (!helpComparingValue(getSupplyCustomerNm(), otherEntity.getSupplyCustomerNm())) { return false; }
        if (!helpComparingValue(getDeliveryCourseCd(), otherEntity.getDeliveryCourseCd())) { return false; }
        if (!helpComparingValue(getDeliveryCourseNm(), otherEntity.getDeliveryCourseNm())) { return false; }
        if (!helpComparingValue(getCarrierCd(), otherEntity.getCarrierCd())) { return false; }
        if (!helpComparingValue(getCarrierNm(), otherEntity.getCarrierNm())) { return false; }
        if (!helpComparingValue(getKohaiContractorCd(), otherEntity.getKohaiContractorCd())) { return false; }
        if (!helpComparingValue(getKohaiContractorNm(), otherEntity.getKohaiContractorNm())) { return false; }
        if (!helpComparingValue(getShippingDt(), otherEntity.getShippingDt())) { return false; }
        if (!helpComparingValue(getWorkDt(), otherEntity.getWorkDt())) { return false; }
        if (!helpComparingValue(getShippingFixedDt(), otherEntity.getShippingFixedDt())) { return false; }
        if (!helpComparingValue(getClientShippingNo(), otherEntity.getClientShippingNo())) { return false; }
        if (!helpComparingValue(getProcessTypeCd(), otherEntity.getProcessTypeCd())) { return false; }
        if (!helpComparingValue(getProcessTypeNm(), otherEntity.getProcessTypeNm())) { return false; }
        if (!helpComparingValue(getShippingTypeCd(), otherEntity.getShippingTypeCd())) { return false; }
        if (!helpComparingValue(getShippingTypeNm(), otherEntity.getShippingTypeNm())) { return false; }
        if (!helpComparingValue(getSlipCnt(), otherEntity.getSlipCnt())) { return false; }
        if (!helpComparingValue(getLineCnt(), otherEntity.getLineCnt())) { return false; }
        if (!helpComparingValue(getItemCnt(), otherEntity.getItemCnt())) { return false; }
        if (!helpComparingValue(getInstNum(), otherEntity.getInstNum())) { return false; }
        if (!helpComparingValue(getPackingNum(), otherEntity.getPackingNum())) { return false; }
        if (!helpComparingValue(getNizoroeOutFlg(), otherEntity.getNizoroeOutFlg())) { return false; }
        if (!helpComparingValue(getNizoroeOutNm(), otherEntity.getNizoroeOutNm())) { return false; }
        if (!helpComparingValue(getNizoroeOutDt(), otherEntity.getNizoroeOutDt())) { return false; }
        if (!helpComparingValue(getTagOutFlg(), otherEntity.getTagOutFlg())) { return false; }
        if (!helpComparingValue(getTagOutNm(), otherEntity.getTagOutNm())) { return false; }
        if (!helpComparingValue(getTagOutDt(), otherEntity.getTagOutDt())) { return false; }
        if (!helpComparingValue(getDelivOutFlg(), otherEntity.getDelivOutFlg())) { return false; }
        if (!helpComparingValue(getDelivOutNm(), otherEntity.getDelivOutNm())) { return false; }
        if (!helpComparingValue(getDelivOutDt(), otherEntity.getDelivOutDt())) { return false; }
        if (!helpComparingValue(getPllOutFlg(), otherEntity.getPllOutFlg())) { return false; }
        if (!helpComparingValue(getPllOutNm(), otherEntity.getPllOutNm())) { return false; }
        if (!helpComparingValue(getPllOutDt(), otherEntity.getPllOutDt())) { return false; }
        if (!helpComparingValue(getIndvSupplyOutFlg(), otherEntity.getIndvSupplyOutFlg())) { return false; }
        if (!helpComparingValue(getIndvSupplyOutNm(), otherEntity.getIndvSupplyOutNm())) { return false; }
        if (!helpComparingValue(getIndvSupplyOutDt(), otherEntity.getIndvSupplyOutDt())) { return false; }
        if (!helpComparingValue(getIndvLabelOutFlg(), otherEntity.getIndvLabelOutFlg())) { return false; }
        if (!helpComparingValue(getIndvLabelOutNm(), otherEntity.getIndvLabelOutNm())) { return false; }
        if (!helpComparingValue(getIndvLabelOutDt(), otherEntity.getIndvLabelOutDt())) { return false; }
        if (!helpComparingValue(getCenterCd(), otherEntity.getCenterCd())) { return false; }
        if (!helpComparingValue(getCenterNm(), otherEntity.getCenterNm())) { return false; }
        if (!helpComparingValue(getEmergencyFlg(), otherEntity.getEmergencyFlg())) { return false; }
        if (!helpComparingValue(getPickingStatusCd(), otherEntity.getPickingStatusCd())) { return false; }
        if (!helpComparingValue(getIdManagPrintTypeCd(), otherEntity.getIdManagPrintTypeCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPickingListPrint");
        result = xCH(result, getNizoroeNo2());
        result = xCH(result, getDaihyoNizoroeNo2());
        result = xCH(result, getSupplyCustomerNm());
        result = xCH(result, getDeliveryCourseCd());
        result = xCH(result, getDeliveryCourseNm());
        result = xCH(result, getCarrierCd());
        result = xCH(result, getCarrierNm());
        result = xCH(result, getKohaiContractorCd());
        result = xCH(result, getKohaiContractorNm());
        result = xCH(result, getShippingDt());
        result = xCH(result, getWorkDt());
        result = xCH(result, getShippingFixedDt());
        result = xCH(result, getClientShippingNo());
        result = xCH(result, getProcessTypeCd());
        result = xCH(result, getProcessTypeNm());
        result = xCH(result, getShippingTypeCd());
        result = xCH(result, getShippingTypeNm());
        result = xCH(result, getSlipCnt());
        result = xCH(result, getLineCnt());
        result = xCH(result, getItemCnt());
        result = xCH(result, getInstNum());
        result = xCH(result, getPackingNum());
        result = xCH(result, getNizoroeOutFlg());
        result = xCH(result, getNizoroeOutNm());
        result = xCH(result, getNizoroeOutDt());
        result = xCH(result, getTagOutFlg());
        result = xCH(result, getTagOutNm());
        result = xCH(result, getTagOutDt());
        result = xCH(result, getDelivOutFlg());
        result = xCH(result, getDelivOutNm());
        result = xCH(result, getDelivOutDt());
        result = xCH(result, getPllOutFlg());
        result = xCH(result, getPllOutNm());
        result = xCH(result, getPllOutDt());
        result = xCH(result, getIndvSupplyOutFlg());
        result = xCH(result, getIndvSupplyOutNm());
        result = xCH(result, getIndvSupplyOutDt());
        result = xCH(result, getIndvLabelOutFlg());
        result = xCH(result, getIndvLabelOutNm());
        result = xCH(result, getIndvLabelOutDt());
        result = xCH(result, getCenterCd());
        result = xCH(result, getCenterNm());
        result = xCH(result, getEmergencyFlg());
        result = xCH(result, getPickingStatusCd());
        result = xCH(result, getIdManagPrintTypeCd());
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
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo2());
        sb.append(c).append(getSupplyCustomerNm());
        sb.append(c).append(getDeliveryCourseCd());
        sb.append(c).append(getDeliveryCourseNm());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getKohaiContractorCd());
        sb.append(c).append(getKohaiContractorNm());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getWorkDt());
        sb.append(c).append(getShippingFixedDt());
        sb.append(c).append(getClientShippingNo());
        sb.append(c).append(getProcessTypeCd());
        sb.append(c).append(getProcessTypeNm());
        sb.append(c).append(getShippingTypeCd());
        sb.append(c).append(getShippingTypeNm());
        sb.append(c).append(getSlipCnt());
        sb.append(c).append(getLineCnt());
        sb.append(c).append(getItemCnt());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getPackingNum());
        sb.append(c).append(getNizoroeOutFlg());
        sb.append(c).append(getNizoroeOutNm());
        sb.append(c).append(getNizoroeOutDt());
        sb.append(c).append(getTagOutFlg());
        sb.append(c).append(getTagOutNm());
        sb.append(c).append(getTagOutDt());
        sb.append(c).append(getDelivOutFlg());
        sb.append(c).append(getDelivOutNm());
        sb.append(c).append(getDelivOutDt());
        sb.append(c).append(getPllOutFlg());
        sb.append(c).append(getPllOutNm());
        sb.append(c).append(getPllOutDt());
        sb.append(c).append(getIndvSupplyOutFlg());
        sb.append(c).append(getIndvSupplyOutNm());
        sb.append(c).append(getIndvSupplyOutDt());
        sb.append(c).append(getIndvLabelOutFlg());
        sb.append(c).append(getIndvLabelOutNm());
        sb.append(c).append(getIndvLabelOutDt());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getEmergencyFlg());
        sb.append(c).append(getPickingStatusCd());
        sb.append(c).append(getIdManagPrintTypeCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public String getNizoroeNo2() {
        return _nizoroeNo2;
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.NIZOROE_NO2} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        __modifiedProperties.add("nizoroeNo2");
        this._nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} <br>
     * 代表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30), refers to t_alloc_inst_h.DAIHYO_NIZOROE_NO2} <br>
     * 代表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public String getSupplyCustomerNm() {
        return _supplyCustomerNm;
    }

    /**
     * [set] SUPPLY_CUSTOMER_NM: {VARCHAR(60)} <br>
     * @param supplyCustomerNm The value of the column 'SUPPLY_CUSTOMER_NM'. (NullAllowed)
     */
    public void setSupplyCustomerNm(String supplyCustomerNm) {
        __modifiedProperties.add("supplyCustomerNm");
        this._supplyCustomerNm = supplyCustomerNm;
    }

    /**
     * [get] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @return The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public String getDeliveryCourseCd() {
        return _deliveryCourseCd;
    }

    /**
     * [set] DELIVERY_COURSE_CD: {VARCHAR(30), refers to m_delivery_course.DELIVERY_COURSE_CD} <br>
     * 配送コースCD
     * @param deliveryCourseCd The value of the column 'DELIVERY_COURSE_CD'. (NullAllowed)
     */
    public void setDeliveryCourseCd(String deliveryCourseCd) {
        __modifiedProperties.add("deliveryCourseCd");
        this._deliveryCourseCd = deliveryCourseCd;
    }

    /**
     * [get] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public String getDeliveryCourseNm() {
        return _deliveryCourseNm;
    }

    /**
     * [set] DELIVERY_COURSE_NM: {VARCHAR(60)} <br>
     * @param deliveryCourseNm The value of the column 'DELIVERY_COURSE_NM'. (NullAllowed)
     */
    public void setDeliveryCourseNm(String deliveryCourseNm) {
        __modifiedProperties.add("deliveryCourseNm");
        this._deliveryCourseNm = deliveryCourseNm;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30), refers to m_carrier.CARRIER_CD} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
    }

    /**
     * [get] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public String getKohaiContractorCd() {
        return _kohaiContractorCd;
    }

    /**
     * [set] KOHAI_CONTRACTOR_CD: {VARCHAR(30)} <br>
     * @param kohaiContractorCd The value of the column 'KOHAI_CONTRACTOR_CD'. (NullAllowed)
     */
    public void setKohaiContractorCd(String kohaiContractorCd) {
        __modifiedProperties.add("kohaiContractorCd");
        this._kohaiContractorCd = kohaiContractorCd;
    }

    /**
     * [get] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public String getKohaiContractorNm() {
        return _kohaiContractorNm;
    }

    /**
     * [set] KOHAI_CONTRACTOR_NM: {VARCHAR(60)} <br>
     * @param kohaiContractorNm The value of the column 'KOHAI_CONTRACTOR_NM'. (NullAllowed)
     */
    public void setKohaiContractorNm(String kohaiContractorNm) {
        __modifiedProperties.add("kohaiContractorNm");
        this._kohaiContractorNm = kohaiContractorNm;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} <br>
     * 作業日
     * @return The value of the column 'WORK_DT'. (NullAllowed)
     */
    public String getWorkDt() {
        return _workDt;
    }

    /**
     * [set] WORK_DT: {VARCHAR(8), refers to t_shipping_inst_h.WORK_DT} <br>
     * 作業日
     * @param workDt The value of the column 'WORK_DT'. (NullAllowed)
     */
    public void setWorkDt(String workDt) {
        __modifiedProperties.add("workDt");
        this._workDt = workDt;
    }

    /**
     * [get] SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} <br>
     * 出荷確定日
     * @return The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed)
     */
    public String getShippingFixedDt() {
        return _shippingFixedDt;
    }

    /**
     * [set] SHIPPING_FIXED_DT: {VARCHAR(8), refers to t_picking_h.SHIPPING_FIXED_DT} <br>
     * 出荷確定日
     * @param shippingFixedDt The value of the column 'SHIPPING_FIXED_DT'. (NullAllowed)
     */
    public void setShippingFixedDt(String shippingFixedDt) {
        __modifiedProperties.add("shippingFixedDt");
        this._shippingFixedDt = shippingFixedDt;
    }

    /**
     * [get] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public String getClientShippingNo() {
        return _clientShippingNo;
    }

    /**
     * [set] CLIENT_SHIPPING_NO: {VARCHAR(30)} <br>
     * @param clientShippingNo The value of the column 'CLIENT_SHIPPING_NO'. (NullAllowed)
     */
    public void setClientShippingNo(String clientShippingNo) {
        __modifiedProperties.add("clientShippingNo");
        this._clientShippingNo = clientShippingNo;
    }

    /**
     * [get] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public String getProcessTypeCd() {
        return _processTypeCd;
    }

    /**
     * [set] PROCESS_TYPE_CD: {VARCHAR(30)} <br>
     * @param processTypeCd The value of the column 'PROCESS_TYPE_CD'. (NullAllowed)
     */
    public void setProcessTypeCd(String processTypeCd) {
        __modifiedProperties.add("processTypeCd");
        this._processTypeCd = processTypeCd;
    }

    /**
     * [get] PROCESS_TYPE_NM: {VARCHAR(100)} <br>
     * @return The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public String getProcessTypeNm() {
        return _processTypeNm;
    }

    /**
     * [set] PROCESS_TYPE_NM: {VARCHAR(100)} <br>
     * @param processTypeNm The value of the column 'PROCESS_TYPE_NM'. (NullAllowed)
     */
    public void setProcessTypeNm(String processTypeNm) {
        __modifiedProperties.add("processTypeNm");
        this._processTypeNm = processTypeNm;
    }

    /**
     * [get] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public String getShippingTypeCd() {
        return _shippingTypeCd;
    }

    /**
     * [set] SHIPPING_TYPE_CD: {VARCHAR(30)} <br>
     * @param shippingTypeCd The value of the column 'SHIPPING_TYPE_CD'. (NullAllowed)
     */
    public void setShippingTypeCd(String shippingTypeCd) {
        __modifiedProperties.add("shippingTypeCd");
        this._shippingTypeCd = shippingTypeCd;
    }

    /**
     * [get] SHIPPING_TYPE_NM: {NULL} <br>
     * @return The value of the column 'SHIPPING_TYPE_NM'. (NullAllowed)
     */
    public String getShippingTypeNm() {
        return _shippingTypeNm;
    }

    /**
     * [set] SHIPPING_TYPE_NM: {NULL} <br>
     * @param shippingTypeNm The value of the column 'SHIPPING_TYPE_NM'. (NullAllowed)
     */
    public void setShippingTypeNm(String shippingTypeNm) {
        __modifiedProperties.add("shippingTypeNm");
        this._shippingTypeNm = shippingTypeNm;
    }

    /**
     * [get] SLIP_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'SLIP_CNT'. (NullAllowed)
     */
    public Long getSlipCnt() {
        return _slipCnt;
    }

    /**
     * [set] SLIP_CNT: {BIGINT(21)} <br>
     * @param slipCnt The value of the column 'SLIP_CNT'. (NullAllowed)
     */
    public void setSlipCnt(Long slipCnt) {
        __modifiedProperties.add("slipCnt");
        this._slipCnt = slipCnt;
    }

    /**
     * [get] LINE_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'LINE_CNT'. (NullAllowed)
     */
    public Long getLineCnt() {
        return _lineCnt;
    }

    /**
     * [set] LINE_CNT: {BIGINT(21)} <br>
     * @param lineCnt The value of the column 'LINE_CNT'. (NullAllowed)
     */
    public void setLineCnt(Long lineCnt) {
        __modifiedProperties.add("lineCnt");
        this._lineCnt = lineCnt;
    }

    /**
     * [get] ITEM_CNT: {BIGINT(21)} <br>
     * @return The value of the column 'ITEM_CNT'. (NullAllowed)
     */
    public Long getItemCnt() {
        return _itemCnt;
    }

    /**
     * [set] ITEM_CNT: {BIGINT(21)} <br>
     * @param itemCnt The value of the column 'ITEM_CNT'. (NullAllowed)
     */
    public void setItemCnt(Long itemCnt) {
        __modifiedProperties.add("itemCnt");
        this._itemCnt = itemCnt;
    }

    /**
     * [get] INST_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {DECIMAL(36, 4)} <br>
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] PACKING_NUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNum() {
        return _packingNum;
    }

    /**
     * [set] PACKING_NUM: {DECIMAL(36, 4)} <br>
     * @param packingNum The value of the column 'PACKING_NUM'. (NullAllowed)
     */
    public void setPackingNum(java.math.BigDecimal packingNum) {
        __modifiedProperties.add("packingNum");
        this._packingNum = packingNum;
    }

    /**
     * [get] NIZOROE_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed)
     */
    public String getNizoroeOutFlg() {
        return _nizoroeOutFlg;
    }

    /**
     * [set] NIZOROE_OUT_FLG: {VARCHAR(1)} <br>
     * @param nizoroeOutFlg The value of the column 'NIZOROE_OUT_FLG'. (NullAllowed)
     */
    public void setNizoroeOutFlg(String nizoroeOutFlg) {
        __modifiedProperties.add("nizoroeOutFlg");
        this._nizoroeOutFlg = nizoroeOutFlg;
    }

    /**
     * [get] NIZOROE_OUT_NM: {NULL} <br>
     * @return The value of the column 'NIZOROE_OUT_NM'. (NullAllowed)
     */
    public String getNizoroeOutNm() {
        return _nizoroeOutNm;
    }

    /**
     * [set] NIZOROE_OUT_NM: {NULL} <br>
     * @param nizoroeOutNm The value of the column 'NIZOROE_OUT_NM'. (NullAllowed)
     */
    public void setNizoroeOutNm(String nizoroeOutNm) {
        __modifiedProperties.add("nizoroeOutNm");
        this._nizoroeOutNm = nizoroeOutNm;
    }

    /**
     * [get] NIZOROE_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'NIZOROE_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getNizoroeOutDt() {
        return _nizoroeOutDt;
    }

    /**
     * [set] NIZOROE_OUT_DT: {DATETIME(23)} <br>
     * @param nizoroeOutDt The value of the column 'NIZOROE_OUT_DT'. (NullAllowed)
     */
    public void setNizoroeOutDt(java.sql.Timestamp nizoroeOutDt) {
        __modifiedProperties.add("nizoroeOutDt");
        this._nizoroeOutDt = nizoroeOutDt;
    }

    /**
     * [get] TAG_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public String getTagOutFlg() {
        return _tagOutFlg;
    }

    /**
     * [set] TAG_OUT_FLG: {VARCHAR(1)} <br>
     * @param tagOutFlg The value of the column 'TAG_OUT_FLG'. (NullAllowed)
     */
    public void setTagOutFlg(String tagOutFlg) {
        __modifiedProperties.add("tagOutFlg");
        this._tagOutFlg = tagOutFlg;
    }

    /**
     * [get] TAG_OUT_NM: {NULL} <br>
     * @return The value of the column 'TAG_OUT_NM'. (NullAllowed)
     */
    public String getTagOutNm() {
        return _tagOutNm;
    }

    /**
     * [set] TAG_OUT_NM: {NULL} <br>
     * @param tagOutNm The value of the column 'TAG_OUT_NM'. (NullAllowed)
     */
    public void setTagOutNm(String tagOutNm) {
        __modifiedProperties.add("tagOutNm");
        this._tagOutNm = tagOutNm;
    }

    /**
     * [get] TAG_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getTagOutDt() {
        return _tagOutDt;
    }

    /**
     * [set] TAG_OUT_DT: {DATETIME(23)} <br>
     * @param tagOutDt The value of the column 'TAG_OUT_DT'. (NullAllowed)
     */
    public void setTagOutDt(java.sql.Timestamp tagOutDt) {
        __modifiedProperties.add("tagOutDt");
        this._tagOutDt = tagOutDt;
    }

    /**
     * [get] DELIV_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'DELIV_OUT_FLG'. (NullAllowed)
     */
    public String getDelivOutFlg() {
        return _delivOutFlg;
    }

    /**
     * [set] DELIV_OUT_FLG: {VARCHAR(1)} <br>
     * @param delivOutFlg The value of the column 'DELIV_OUT_FLG'. (NullAllowed)
     */
    public void setDelivOutFlg(String delivOutFlg) {
        __modifiedProperties.add("delivOutFlg");
        this._delivOutFlg = delivOutFlg;
    }

    /**
     * [get] DELIV_OUT_NM: {NULL} <br>
     * @return The value of the column 'DELIV_OUT_NM'. (NullAllowed)
     */
    public String getDelivOutNm() {
        return _delivOutNm;
    }

    /**
     * [set] DELIV_OUT_NM: {NULL} <br>
     * @param delivOutNm The value of the column 'DELIV_OUT_NM'. (NullAllowed)
     */
    public void setDelivOutNm(String delivOutNm) {
        __modifiedProperties.add("delivOutNm");
        this._delivOutNm = delivOutNm;
    }

    /**
     * [get] DELIV_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'DELIV_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getDelivOutDt() {
        return _delivOutDt;
    }

    /**
     * [set] DELIV_OUT_DT: {DATETIME(23)} <br>
     * @param delivOutDt The value of the column 'DELIV_OUT_DT'. (NullAllowed)
     */
    public void setDelivOutDt(java.sql.Timestamp delivOutDt) {
        __modifiedProperties.add("delivOutDt");
        this._delivOutDt = delivOutDt;
    }

    /**
     * [get] PLL_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'PLL_OUT_FLG'. (NullAllowed)
     */
    public String getPllOutFlg() {
        return _pllOutFlg;
    }

    /**
     * [set] PLL_OUT_FLG: {VARCHAR(1)} <br>
     * @param pllOutFlg The value of the column 'PLL_OUT_FLG'. (NullAllowed)
     */
    public void setPllOutFlg(String pllOutFlg) {
        __modifiedProperties.add("pllOutFlg");
        this._pllOutFlg = pllOutFlg;
    }

    /**
     * [get] PLL_OUT_NM: {NULL} <br>
     * @return The value of the column 'PLL_OUT_NM'. (NullAllowed)
     */
    public String getPllOutNm() {
        return _pllOutNm;
    }

    /**
     * [set] PLL_OUT_NM: {NULL} <br>
     * @param pllOutNm The value of the column 'PLL_OUT_NM'. (NullAllowed)
     */
    public void setPllOutNm(String pllOutNm) {
        __modifiedProperties.add("pllOutNm");
        this._pllOutNm = pllOutNm;
    }

    /**
     * [get] PLL_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'PLL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getPllOutDt() {
        return _pllOutDt;
    }

    /**
     * [set] PLL_OUT_DT: {DATETIME(23)} <br>
     * @param pllOutDt The value of the column 'PLL_OUT_DT'. (NullAllowed)
     */
    public void setPllOutDt(java.sql.Timestamp pllOutDt) {
        __modifiedProperties.add("pllOutDt");
        this._pllOutDt = pllOutDt;
    }

    /**
     * [get] INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed)
     */
    public String getIndvSupplyOutFlg() {
        return _indvSupplyOutFlg;
    }

    /**
     * [set] INDV_SUPPLY_OUT_FLG: {VARCHAR(1)} <br>
     * @param indvSupplyOutFlg The value of the column 'INDV_SUPPLY_OUT_FLG'. (NullAllowed)
     */
    public void setIndvSupplyOutFlg(String indvSupplyOutFlg) {
        __modifiedProperties.add("indvSupplyOutFlg");
        this._indvSupplyOutFlg = indvSupplyOutFlg;
    }

    /**
     * [get] INDV_SUPPLY_OUT_NM: {NULL} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_NM'. (NullAllowed)
     */
    public String getIndvSupplyOutNm() {
        return _indvSupplyOutNm;
    }

    /**
     * [set] INDV_SUPPLY_OUT_NM: {NULL} <br>
     * @param indvSupplyOutNm The value of the column 'INDV_SUPPLY_OUT_NM'. (NullAllowed)
     */
    public void setIndvSupplyOutNm(String indvSupplyOutNm) {
        __modifiedProperties.add("indvSupplyOutNm");
        this._indvSupplyOutNm = indvSupplyOutNm;
    }

    /**
     * [get] INDV_SUPPLY_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getIndvSupplyOutDt() {
        return _indvSupplyOutDt;
    }

    /**
     * [set] INDV_SUPPLY_OUT_DT: {DATETIME(23)} <br>
     * @param indvSupplyOutDt The value of the column 'INDV_SUPPLY_OUT_DT'. (NullAllowed)
     */
    public void setIndvSupplyOutDt(java.sql.Timestamp indvSupplyOutDt) {
        __modifiedProperties.add("indvSupplyOutDt");
        this._indvSupplyOutDt = indvSupplyOutDt;
    }

    /**
     * [get] INDV_LABEL_OUT_FLG: {VARCHAR(1)} <br>
     * @return The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed)
     */
    public String getIndvLabelOutFlg() {
        return _indvLabelOutFlg;
    }

    /**
     * [set] INDV_LABEL_OUT_FLG: {VARCHAR(1)} <br>
     * @param indvLabelOutFlg The value of the column 'INDV_LABEL_OUT_FLG'. (NullAllowed)
     */
    public void setIndvLabelOutFlg(String indvLabelOutFlg) {
        __modifiedProperties.add("indvLabelOutFlg");
        this._indvLabelOutFlg = indvLabelOutFlg;
    }

    /**
     * [get] INDV_LABEL_OUT_NM: {NULL} <br>
     * @return The value of the column 'INDV_LABEL_OUT_NM'. (NullAllowed)
     */
    public String getIndvLabelOutNm() {
        return _indvLabelOutNm;
    }

    /**
     * [set] INDV_LABEL_OUT_NM: {NULL} <br>
     * @param indvLabelOutNm The value of the column 'INDV_LABEL_OUT_NM'. (NullAllowed)
     */
    public void setIndvLabelOutNm(String indvLabelOutNm) {
        __modifiedProperties.add("indvLabelOutNm");
        this._indvLabelOutNm = indvLabelOutNm;
    }

    /**
     * [get] INDV_LABEL_OUT_DT: {DATETIME(23)} <br>
     * @return The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getIndvLabelOutDt() {
        return _indvLabelOutDt;
    }

    /**
     * [set] INDV_LABEL_OUT_DT: {DATETIME(23)} <br>
     * @param indvLabelOutDt The value of the column 'INDV_LABEL_OUT_DT'. (NullAllowed)
     */
    public void setIndvLabelOutDt(java.sql.Timestamp indvLabelOutDt) {
        __modifiedProperties.add("indvLabelOutDt");
        this._indvLabelOutDt = indvLabelOutDt;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30), refers to m_center.CENTER_CD} <br>
     * センタCD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] CENTER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public String getCenterNm() {
        return _centerNm;
    }

    /**
     * [set] CENTER_NM: {VARCHAR(60)} <br>
     * @param centerNm The value of the column 'CENTER_NM'. (NullAllowed)
     */
    public void setCenterNm(String centerNm) {
        __modifiedProperties.add("centerNm");
        this._centerNm = centerNm;
    }

    /**
     * [get] EMERGENCY_FLG: {CHAR(1)} <br>
     * @return The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public String getEmergencyFlg() {
        return _emergencyFlg;
    }

    /**
     * [set] EMERGENCY_FLG: {CHAR(1)} <br>
     * @param emergencyFlg The value of the column 'EMERGENCY_FLG'. (NullAllowed)
     */
    public void setEmergencyFlg(String emergencyFlg) {
        __modifiedProperties.add("emergencyFlg");
        this._emergencyFlg = emergencyFlg;
    }

    /**
     * [get] PICKING_STATUS_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'PICKING_STATUS_CD'. (NullAllowed)
     */
    public String getPickingStatusCd() {
        return _pickingStatusCd;
    }

    /**
     * [set] PICKING_STATUS_CD: {VARCHAR(30)} <br>
     * @param pickingStatusCd The value of the column 'PICKING_STATUS_CD'. (NullAllowed)
     */
    public void setPickingStatusCd(String pickingStatusCd) {
        __modifiedProperties.add("pickingStatusCd");
        this._pickingStatusCd = pickingStatusCd;
    }

    /**
     * [get] ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'ID_MANAG_PRINT_TYPE_CD'. (NullAllowed)
     */
    public String getIdManagPrintTypeCd() {
        return _idManagPrintTypeCd;
    }

    /**
     * [set] ID_MANAG_PRINT_TYPE_CD: {VARCHAR(30)} <br>
     * @param idManagPrintTypeCd The value of the column 'ID_MANAG_PRINT_TYPE_CD'. (NullAllowed)
     */
    public void setIdManagPrintTypeCd(String idManagPrintTypeCd) {
        __modifiedProperties.add("idManagPrintTypeCd");
        this._idManagPrintTypeCd = idManagPrintTypeCd;
    }

}
