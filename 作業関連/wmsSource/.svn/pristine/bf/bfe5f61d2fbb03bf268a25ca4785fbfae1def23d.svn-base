package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_inst_h_print as TABLE. <br>
 * 出荷指示ヘッダ印刷データ
 * <pre>
 * [primary-key]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [column]
 *     SHIPPING_INST_H_PRINT_ID, SHIPPING_INST_H_ID, SALES_ORDER_NO, SALES_ORDER_SLIP_TYPE_CD, SALES_ORDER_SLIP_NO, SHIPPING_REASON, LOGI_ATTENTION_TYPE_CD, LOGI_SPECIAL_TYPE_CD, KOGUCHI_DELIVERY_FLG, SHIPPING_DT, SPECIFY_DELIVERY_DT, SPECIFY_DELIVERY_TIME, TENHANSHA_ID, TENHANSHA_ORDER_NO, CONTRACTOR_NM, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, DEAL_TYPE_CD, CUSTOMER_CD, CUSTOMER_NM, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_INST_H_PRINT_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_inst_h
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingInstH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingInstHPrintDto implements Serializable {

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
    /** SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingInstHPrintId;

    /** SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} */
    @JsonKey
    protected Long _shippingInstHId;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderNo;

    /** SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipTypeCd;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipNo;

    /** SHIPPING_REASON: {VARCHAR(60)} */
    @JsonKey
    protected String _shippingReason;

    /** LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiAttentionTypeCd;

    /** LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _logiSpecialTypeCd;

    /** KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} */
    @JsonKey
    protected String _koguchiDeliveryFlg;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** SPECIFY_DELIVERY_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _specifyDeliveryDt;

    /** SPECIFY_DELIVERY_TIME: {VARCHAR(6)} */
    @JsonKey
    protected String _specifyDeliveryTime;

    /** TENHANSHA_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _tenhanshaId;

    /** TENHANSHA_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaOrderNo;

    /** CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _contractorNm;

    /** DESTINATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationCd;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm2;

    /** DESTINATION_ZIP_CD: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationAddress2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    @JsonKey
    protected String _destinationTel;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** DEAL_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _dealTypeCd;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _customerNm;

    /** SPARE_STR: {VARCHAR(255)} */
    @JsonKey
    protected String _spareStr;

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
    public BsTShippingInstHPrintDto() {
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
    protected TShippingInstHDto _tShippingInstH;

    public TShippingInstHDto getTShippingInstH() {
        return _tShippingInstH;
    }

    public void setTShippingInstH(TShippingInstHDto tShippingInstH) {
        this._tShippingInstH = tShippingInstH;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingInstHPrintDto)) { return false; }
        final BsTShippingInstHPrintDto otherEntity = (BsTShippingInstHPrintDto)other;
        if (!helpComparingValue(getShippingInstHPrintId(), otherEntity.getShippingInstHPrintId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_inst_h_print");
        result = xCH(result, getShippingInstHPrintId());
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
        sb.append(c).append(getShippingInstHPrintId());
        sb.append(c).append(getShippingInstHId());
        sb.append(c).append(getSalesOrderNo());
        sb.append(c).append(getSalesOrderSlipTypeCd());
        sb.append(c).append(getSalesOrderSlipNo());
        sb.append(c).append(getShippingReason());
        sb.append(c).append(getLogiAttentionTypeCd());
        sb.append(c).append(getLogiSpecialTypeCd());
        sb.append(c).append(getKoguchiDeliveryFlg());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getSpecifyDeliveryDt());
        sb.append(c).append(getSpecifyDeliveryTime());
        sb.append(c).append(getTenhanshaId());
        sb.append(c).append(getTenhanshaOrderNo());
        sb.append(c).append(getContractorNm());
        sb.append(c).append(getDestinationCd());
        sb.append(c).append(getDestinationNm1());
        sb.append(c).append(getDestinationNm2());
        sb.append(c).append(getDestinationZipCd());
        sb.append(c).append(getDestinationAddress1());
        sb.append(c).append(getDestinationAddress2());
        sb.append(c).append(getDestinationTel());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getDealTypeCd());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getCustomerNm());
        sb.append(c).append(getSpareStr());
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
     * [get] SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダ帳票ID
     * @return The value of the column 'SHIPPING_INST_H_PRINT_ID'. (NullAllowed)
     */
    public Long getShippingInstHPrintId() {
        return _shippingInstHPrintId;
    }

    /**
     * [set] SHIPPING_INST_H_PRINT_ID: {PK, ID, IX, NotNull, BIGINT(19)} <br>
     * 出荷指示ヘッダ帳票ID
     * @param shippingInstHPrintId The value of the column 'SHIPPING_INST_H_PRINT_ID'. (NullAllowed)
     */
    public void setShippingInstHPrintId(Long shippingInstHPrintId) {
        __modifiedProperties.add("shippingInstHPrintId");
        this._shippingInstHPrintId = shippingInstHPrintId;
    }

    /**
     * [get] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @return The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public Long getShippingInstHId() {
        return _shippingInstHId;
    }

    /**
     * [set] SHIPPING_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_shipping_inst_h} <br>
     * 出荷指示ヘッダID
     * @param shippingInstHId The value of the column 'SHIPPING_INST_H_ID'. (NullAllowed)
     */
    public void setShippingInstHId(Long shippingInstHId) {
        __modifiedProperties.add("shippingInstHId");
        this._shippingInstHId = shippingInstHId;
    }

    /**
     * [get] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @return The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public String getSalesOrderNo() {
        return _salesOrderNo;
    }

    /**
     * [set] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @param salesOrderNo The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public void setSalesOrderNo(String salesOrderNo) {
        __modifiedProperties.add("salesOrderNo");
        this._salesOrderNo = salesOrderNo;
    }

    /**
     * [get] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @return The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public String getSalesOrderSlipTypeCd() {
        return _salesOrderSlipTypeCd;
    }

    /**
     * [set] SALES_ORDER_SLIP_TYPE_CD: {VARCHAR(30)} <br>
     * 受注伝票タイプ
     * @param salesOrderSlipTypeCd The value of the column 'SALES_ORDER_SLIP_TYPE_CD'. (NullAllowed)
     */
    public void setSalesOrderSlipTypeCd(String salesOrderSlipTypeCd) {
        __modifiedProperties.add("salesOrderSlipTypeCd");
        this._salesOrderSlipTypeCd = salesOrderSlipTypeCd;
    }

    /**
     * [get] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @return The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed)
     */
    public String getSalesOrderSlipNo() {
        return _salesOrderSlipNo;
    }

    /**
     * [set] SALES_ORDER_SLIP_NO: {VARCHAR(30)} <br>
     * 受注伝票番号
     * @param salesOrderSlipNo The value of the column 'SALES_ORDER_SLIP_NO'. (NullAllowed)
     */
    public void setSalesOrderSlipNo(String salesOrderSlipNo) {
        __modifiedProperties.add("salesOrderSlipNo");
        this._salesOrderSlipNo = salesOrderSlipNo;
    }

    /**
     * [get] SHIPPING_REASON: {VARCHAR(60)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON'. (NullAllowed)
     */
    public String getShippingReason() {
        return _shippingReason;
    }

    /**
     * [set] SHIPPING_REASON: {VARCHAR(60)} <br>
     * 出荷発生事由
     * @param shippingReason The value of the column 'SHIPPING_REASON'. (NullAllowed)
     */
    public void setShippingReason(String shippingReason) {
        __modifiedProperties.add("shippingReason");
        this._shippingReason = shippingReason;
    }

    /**
     * [get] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @return The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public String getLogiAttentionTypeCd() {
        return _logiAttentionTypeCd;
    }

    /**
     * [set] LOGI_ATTENTION_TYPE_CD: {VARCHAR(30)} <br>
     * 物流注意区分
     * @param logiAttentionTypeCd The value of the column 'LOGI_ATTENTION_TYPE_CD'. (NullAllowed)
     */
    public void setLogiAttentionTypeCd(String logiAttentionTypeCd) {
        __modifiedProperties.add("logiAttentionTypeCd");
        this._logiAttentionTypeCd = logiAttentionTypeCd;
    }

    /**
     * [get] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @return The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public String getLogiSpecialTypeCd() {
        return _logiSpecialTypeCd;
    }

    /**
     * [set] LOGI_SPECIAL_TYPE_CD: {VARCHAR(30)} <br>
     * 物流特殊区分
     * @param logiSpecialTypeCd The value of the column 'LOGI_SPECIAL_TYPE_CD'. (NullAllowed)
     */
    public void setLogiSpecialTypeCd(String logiSpecialTypeCd) {
        __modifiedProperties.add("logiSpecialTypeCd");
        this._logiSpecialTypeCd = logiSpecialTypeCd;
    }

    /**
     * [get] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @return The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public String getKoguchiDeliveryFlg() {
        return _koguchiDeliveryFlg;
    }

    /**
     * [set] KOGUCHI_DELIVERY_FLG: {VARCHAR(30)} <br>
     * 戸口配送フラグ
     * @param koguchiDeliveryFlg The value of the column 'KOGUCHI_DELIVERY_FLG'. (NullAllowed)
     */
    public void setKoguchiDeliveryFlg(String koguchiDeliveryFlg) {
        __modifiedProperties.add("koguchiDeliveryFlg");
        this._koguchiDeliveryFlg = koguchiDeliveryFlg;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @return The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public String getSpecifyDeliveryDt() {
        return _specifyDeliveryDt;
    }

    /**
     * [set] SPECIFY_DELIVERY_DT: {VARCHAR(8)} <br>
     * 配達指定日
     * @param specifyDeliveryDt The value of the column 'SPECIFY_DELIVERY_DT'. (NullAllowed)
     */
    public void setSpecifyDeliveryDt(String specifyDeliveryDt) {
        __modifiedProperties.add("specifyDeliveryDt");
        this._specifyDeliveryDt = specifyDeliveryDt;
    }

    /**
     * [get] SPECIFY_DELIVERY_TIME: {VARCHAR(6)} <br>
     * 配達指定時間
     * @return The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public String getSpecifyDeliveryTime() {
        return _specifyDeliveryTime;
    }

    /**
     * [set] SPECIFY_DELIVERY_TIME: {VARCHAR(6)} <br>
     * 配達指定時間
     * @param specifyDeliveryTime The value of the column 'SPECIFY_DELIVERY_TIME'. (NullAllowed)
     */
    public void setSpecifyDeliveryTime(String specifyDeliveryTime) {
        __modifiedProperties.add("specifyDeliveryTime");
        this._specifyDeliveryTime = specifyDeliveryTime;
    }

    /**
     * [get] TENHANSHA_ID: {BIGINT(19)} <br>
     * 店販社ID
     * @return The value of the column 'TENHANSHA_ID'. (NullAllowed)
     */
    public Long getTenhanshaId() {
        return _tenhanshaId;
    }

    /**
     * [set] TENHANSHA_ID: {BIGINT(19)} <br>
     * 店販社ID
     * @param tenhanshaId The value of the column 'TENHANSHA_ID'. (NullAllowed)
     */
    public void setTenhanshaId(Long tenhanshaId) {
        __modifiedProperties.add("tenhanshaId");
        this._tenhanshaId = tenhanshaId;
    }

    /**
     * [get] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @return The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed)
     */
    public String getTenhanshaOrderNo() {
        return _tenhanshaOrderNo;
    }

    /**
     * [set] TENHANSHA_ORDER_NO: {VARCHAR(30)} <br>
     * 店販社発注番号
     * @param tenhanshaOrderNo The value of the column 'TENHANSHA_ORDER_NO'. (NullAllowed)
     */
    public void setTenhanshaOrderNo(String tenhanshaOrderNo) {
        __modifiedProperties.add("tenhanshaOrderNo");
        this._tenhanshaOrderNo = tenhanshaOrderNo;
    }

    /**
     * [get] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public String getContractorNm() {
        return _contractorNm;
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸配契約先名称
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public void setContractorNm(String contractorNm) {
        __modifiedProperties.add("contractorNm");
        this._contractorNm = contractorNm;
    }

    /**
     * [get] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public String getDestinationCd() {
        return _destinationCd;
    }

    /**
     * [set] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed)
     */
    public void setDestinationCd(String destinationCd) {
        __modifiedProperties.add("destinationCd");
        this._destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public String getDestinationNm1() {
        return _destinationNm1;
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public void setDestinationNm1(String destinationNm1) {
        __modifiedProperties.add("destinationNm1");
        this._destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public String getDestinationNm2() {
        return _destinationNm2;
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public void setDestinationNm2(String destinationNm2) {
        __modifiedProperties.add("destinationNm2");
        this._destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public String getDestinationZipCd() {
        return _destinationZipCd;
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        __modifiedProperties.add("destinationZipCd");
        this._destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public String getDestinationAddress1() {
        return _destinationAddress1;
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        __modifiedProperties.add("destinationAddress1");
        this._destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public String getDestinationAddress2() {
        return _destinationAddress2;
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        __modifiedProperties.add("destinationAddress2");
        this._destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public String getDestinationTel() {
        return _destinationTel;
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed)
     */
    public void setDestinationTel(String destinationTel) {
        __modifiedProperties.add("destinationTel");
        this._destinationTel = destinationTel;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public String getShippingPlantCd() {
        return _shippingPlantCd;
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        __modifiedProperties.add("shippingPlantCd");
        this._shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getShippingStorageSpaceCd() {
        return _shippingStorageSpaceCd;
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        __modifiedProperties.add("shippingStorageSpaceCd");
        this._shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @return The value of the column 'DEAL_TYPE_CD'. (NullAllowed)
     */
    public String getDealTypeCd() {
        return _dealTypeCd;
    }

    /**
     * [set] DEAL_TYPE_CD: {VARCHAR(30)} <br>
     * 取引区分
     * @param dealTypeCd The value of the column 'DEAL_TYPE_CD'. (NullAllowed)
     */
    public void setDealTypeCd(String dealTypeCd) {
        __modifiedProperties.add("dealTypeCd");
        this._dealTypeCd = dealTypeCd;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * 取引先名称
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public String getSpareStr() {
        return _spareStr;
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed)
     */
    public void setSpareStr(String spareStr) {
        __modifiedProperties.add("spareStr");
        this._spareStr = spareStr;
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
