package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_nizoroe_alarm_log as TABLE. <br>
 * 荷揃処理アラームログ
 * <pre>
 * [primary-key]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [column]
 *     NIZOROE_ALARM_LOG_ID, NIZOROE_TYPE_CD, NIZOROE_PROC_UNIT, PROC_DT, PRINT_FLG, BASE_CD, BASE_NM, TYPE_CD, ALARM_TYPE_CD, NIZOROE_NO, SALES_ORDER_SLIP_NO, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, PRODUCT_ID, PRODUCT_CD, PRODUCT_NM, SALES_ORG_ID, SALES_ORG_CD, SALES_ORG_NM1, SALES_ORG_NM2, DESTINATION_NM1, DESTINATION_NM2, STOCK_OUT_NUM, OUT_USER_ID, OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     NIZOROE_ALARM_LOG_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_product, b_user
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mProduct, bUser
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTNizoroeAlarmLogDto implements Serializable {

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
    /** NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _nizoroeAlarmLogId;

    /** NIZOROE_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeTypeCd;

    /** NIZOROE_PROC_UNIT: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeProcUnit;

    /** PROC_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _procDt;

    /** PRINT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _printFlg;

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _typeCd;

    /** ALARM_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _alarmTypeCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** SALES_ORDER_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderSlipNo;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipRowNo;

    /** PRODUCT_ID: {IX, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** SALES_ORG_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** SALES_ORG_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm1;

    /** SALES_ORG_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm2;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm2;

    /** STOCK_OUT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _stockOutNum;

    /** OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _outUserId;

    /** OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _outDt;

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
    public BsTNizoroeAlarmLogDto() {
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
    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTNizoroeAlarmLogDto)) { return false; }
        final BsTNizoroeAlarmLogDto otherEntity = (BsTNizoroeAlarmLogDto)other;
        if (!helpComparingValue(getNizoroeAlarmLogId(), otherEntity.getNizoroeAlarmLogId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_nizoroe_alarm_log");
        result = xCH(result, getNizoroeAlarmLogId());
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
        sb.append(c).append(getNizoroeAlarmLogId());
        sb.append(c).append(getNizoroeTypeCd());
        sb.append(c).append(getNizoroeProcUnit());
        sb.append(c).append(getProcDt());
        sb.append(c).append(getPrintFlg());
        sb.append(c).append(getBaseCd());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getTypeCd());
        sb.append(c).append(getAlarmTypeCd());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getSalesOrderSlipNo());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getShippingSlipRowNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getSalesOrgNm1());
        sb.append(c).append(getSalesOrgNm2());
        sb.append(c).append(getDestinationNm1());
        sb.append(c).append(getDestinationNm2());
        sb.append(c).append(getStockOutNum());
        sb.append(c).append(getOutUserId());
        sb.append(c).append(getOutDt());
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
     * [get] NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理アラームログID
     * @return The value of the column 'NIZOROE_ALARM_LOG_ID'. (NullAllowed)
     */
    public Long getNizoroeAlarmLogId() {
        return _nizoroeAlarmLogId;
    }

    /**
     * [set] NIZOROE_ALARM_LOG_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 荷揃処理アラームログID
     * @param nizoroeAlarmLogId The value of the column 'NIZOROE_ALARM_LOG_ID'. (NullAllowed)
     */
    public void setNizoroeAlarmLogId(Long nizoroeAlarmLogId) {
        __modifiedProperties.add("nizoroeAlarmLogId");
        this._nizoroeAlarmLogId = nizoroeAlarmLogId;
    }

    /**
     * [get] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @return The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public String getNizoroeTypeCd() {
        return _nizoroeTypeCd;
    }

    /**
     * [set] NIZOROE_TYPE_CD: {VARCHAR(30)} <br>
     * 荷揃種別
     * @param nizoroeTypeCd The value of the column 'NIZOROE_TYPE_CD'. (NullAllowed)
     */
    public void setNizoroeTypeCd(String nizoroeTypeCd) {
        __modifiedProperties.add("nizoroeTypeCd");
        this._nizoroeTypeCd = nizoroeTypeCd;
    }

    /**
     * [get] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @return The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public String getNizoroeProcUnit() {
        return _nizoroeProcUnit;
    }

    /**
     * [set] NIZOROE_PROC_UNIT: {VARCHAR(30)} <br>
     * 荷揃処理単位
     * @param nizoroeProcUnit The value of the column 'NIZOROE_PROC_UNIT'. (NullAllowed)
     */
    public void setNizoroeProcUnit(String nizoroeProcUnit) {
        __modifiedProperties.add("nizoroeProcUnit");
        this._nizoroeProcUnit = nizoroeProcUnit;
    }

    /**
     * [get] PROC_DT: {DATETIME(19)} <br>
     * 処理日時
     * @return The value of the column 'PROC_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getProcDt() {
        return _procDt;
    }

    /**
     * [set] PROC_DT: {DATETIME(19)} <br>
     * 処理日時
     * @param procDt The value of the column 'PROC_DT'. (NullAllowed)
     */
    public void setProcDt(java.sql.Timestamp procDt) {
        __modifiedProperties.add("procDt");
        this._procDt = procDt;
    }

    /**
     * [get] PRINT_FLG: {CHAR(1)} <br>
     * 発行フラグ
     * @return The value of the column 'PRINT_FLG'. (NullAllowed)
     */
    public String getPrintFlg() {
        return _printFlg;
    }

    /**
     * [set] PRINT_FLG: {CHAR(1)} <br>
     * 発行フラグ
     * @param printFlg The value of the column 'PRINT_FLG'. (NullAllowed)
     */
    public void setPrintFlg(String printFlg) {
        __modifiedProperties.add("printFlg");
        this._printFlg = printFlg;
    }

    /**
     * [get] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'BASE_CD'. (NullAllowed)
     */
    public String getBaseCd() {
        return _baseCd;
    }

    /**
     * [set] BASE_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param baseCd The value of the column 'BASE_CD'. (NullAllowed)
     */
    public void setBaseCd(String baseCd) {
        __modifiedProperties.add("baseCd");
        this._baseCd = baseCd;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @return The value of the column 'BASE_NM'. (NullAllowed)
     */
    public String getBaseNm() {
        return _baseNm;
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点名称
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed)
     */
    public void setBaseNm(String baseNm) {
        __modifiedProperties.add("baseNm");
        this._baseNm = baseNm;
    }

    /**
     * [get] TYPE_CD: {VARCHAR(30)} <br>
     * 種別区分
     * @return The value of the column 'TYPE_CD'. (NullAllowed)
     */
    public String getTypeCd() {
        return _typeCd;
    }

    /**
     * [set] TYPE_CD: {VARCHAR(30)} <br>
     * 種別区分
     * @param typeCd The value of the column 'TYPE_CD'. (NullAllowed)
     */
    public void setTypeCd(String typeCd) {
        __modifiedProperties.add("typeCd");
        this._typeCd = typeCd;
    }

    /**
     * [get] ALARM_TYPE_CD: {VARCHAR(30)} <br>
     * アラーム区分
     * @return The value of the column 'ALARM_TYPE_CD'. (NullAllowed)
     */
    public String getAlarmTypeCd() {
        return _alarmTypeCd;
    }

    /**
     * [set] ALARM_TYPE_CD: {VARCHAR(30)} <br>
     * アラーム区分
     * @param alarmTypeCd The value of the column 'ALARM_TYPE_CD'. (NullAllowed)
     */
    public void setAlarmTypeCd(String alarmTypeCd) {
        __modifiedProperties.add("alarmTypeCd");
        this._alarmTypeCd = alarmTypeCd;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
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
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed)
     */
    public String getShippingSlipRowNo() {
        return _shippingSlipRowNo;
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @param shippingSlipRowNo The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed)
     */
    public void setShippingSlipRowNo(String shippingSlipRowNo) {
        __modifiedProperties.add("shippingSlipRowNo");
        this._shippingSlipRowNo = shippingSlipRowNo;
    }

    /**
     * [get] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(60)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {BIGINT(19)} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SALES_ORG_NM1: {VARCHAR(60)} <br>
     * 販売組織名称1
     * @return The value of the column 'SALES_ORG_NM1'. (NullAllowed)
     */
    public String getSalesOrgNm1() {
        return _salesOrgNm1;
    }

    /**
     * [set] SALES_ORG_NM1: {VARCHAR(60)} <br>
     * 販売組織名称1
     * @param salesOrgNm1 The value of the column 'SALES_ORG_NM1'. (NullAllowed)
     */
    public void setSalesOrgNm1(String salesOrgNm1) {
        __modifiedProperties.add("salesOrgNm1");
        this._salesOrgNm1 = salesOrgNm1;
    }

    /**
     * [get] SALES_ORG_NM2: {VARCHAR(60)} <br>
     * 販売組織名称2
     * @return The value of the column 'SALES_ORG_NM2'. (NullAllowed)
     */
    public String getSalesOrgNm2() {
        return _salesOrgNm2;
    }

    /**
     * [set] SALES_ORG_NM2: {VARCHAR(60)} <br>
     * 販売組織名称2
     * @param salesOrgNm2 The value of the column 'SALES_ORG_NM2'. (NullAllowed)
     */
    public void setSalesOrgNm2(String salesOrgNm2) {
        __modifiedProperties.add("salesOrgNm2");
        this._salesOrgNm2 = salesOrgNm2;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public String getDestinationNm1() {
        return _destinationNm1;
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称1
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed)
     */
    public void setDestinationNm1(String destinationNm1) {
        __modifiedProperties.add("destinationNm1");
        this._destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public String getDestinationNm2() {
        return _destinationNm2;
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称2
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed)
     */
    public void setDestinationNm2(String destinationNm2) {
        __modifiedProperties.add("destinationNm2");
        this._destinationNm2 = destinationNm2;
    }

    /**
     * [get] STOCK_OUT_NUM: {BIGINT(19)} <br>
     * 欠品数
     * @return The value of the column 'STOCK_OUT_NUM'. (NullAllowed)
     */
    public Long getStockOutNum() {
        return _stockOutNum;
    }

    /**
     * [set] STOCK_OUT_NUM: {BIGINT(19)} <br>
     * 欠品数
     * @param stockOutNum The value of the column 'STOCK_OUT_NUM'. (NullAllowed)
     */
    public void setStockOutNum(Long stockOutNum) {
        __modifiedProperties.add("stockOutNum");
        this._stockOutNum = stockOutNum;
    }

    /**
     * [get] OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出力者ID
     * @return The value of the column 'OUT_USER_ID'. (NullAllowed)
     */
    public Long getOutUserId() {
        return _outUserId;
    }

    /**
     * [set] OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 出力者ID
     * @param outUserId The value of the column 'OUT_USER_ID'. (NullAllowed)
     */
    public void setOutUserId(Long outUserId) {
        __modifiedProperties.add("outUserId");
        this._outUserId = outUserId;
    }

    /**
     * [get] OUT_DT: {DATETIME(19)} <br>
     * 出力日時
     * @return The value of the column 'OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getOutDt() {
        return _outDt;
    }

    /**
     * [set] OUT_DT: {DATETIME(19)} <br>
     * 出力日時
     * @param outDt The value of the column 'OUT_DT'. (NullAllowed)
     */
    public void setOutDt(java.sql.Timestamp outDt) {
        __modifiedProperties.add("outDt");
        this._outDt = outDt;
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
