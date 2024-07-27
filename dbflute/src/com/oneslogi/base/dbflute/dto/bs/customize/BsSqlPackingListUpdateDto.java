package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlPackingListUpdate. <br>
 * <pre>
 * [primary-key]
 *     PRODUCT_ID
 *
 * [column]
 *     PICKING_NUM_SUM, PACKING_NUM_SUM, PACKING_H_ID, CENTER_ID, CLIENT_ID, PROCESS_TYPE_ID, CENTER_CD, CENTER_NM, BOX_CD, BOX_NM, PRODUCT_CD, JAN_CD, UNIT_NM, PRODUCT_NM, PRODUCT_ID, VERSION_NO, ALLOC_INST_H_ID, PICKING_H_ID, OLD_BID, PACKING_STATUS, CASE_PICKING_NO, RECEIVE_LABEL_NO, NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO, DAIHYO_NIZOROE_NO2, SHIPPING_PACKING_NO, CARRIER_TRACE_NUM, LOT, LIMIT_DT, PROD_DT, DEPOSIT_CD, CUSTOMER_NM
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
public abstract class BsSqlPackingListUpdateDto implements Serializable {

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
    /** PICKING_NUM_SUM: {DECIMAL(41)} */
    @JsonKey
    protected java.math.BigDecimal _pickingNumSum;

    /** PACKING_NUM_SUM: {DECIMAL(36, 4)} */
    @JsonKey
    protected java.math.BigDecimal _packingNumSum;

    /** PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} */
    @JsonKey
    protected Long _packingHId;

    /** CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} */
    @JsonKey
    protected Long _centerId;

    /** CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} */
    @JsonKey
    protected Long _clientId;

    /** PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} */
    @JsonKey
    protected Long _processTypeId;

    /** CENTER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** CENTER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _centerNm;

    /** BOX_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _boxNm;

    /** PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} */
    @JsonKey
    protected String _productCd;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _unitNm;

    /** PRODUCT_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} */
    @JsonKey
    protected Long _productId;

    /** VERSION_NO: {BIGINT(20)} */
    @JsonKey
    protected Long _versionNo;

    /** ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} */
    @JsonKey
    protected Long _allocInstHId;

    /** PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} */
    @JsonKey
    protected Long _pickingHId;

    /** OLD_BID: {BIGINT(20), refers to t_packing_b.PACKING_B_ID} */
    @JsonKey
    protected Long _oldBid;

    /** PACKING_STATUS: {VARCHAR(30)} */
    @JsonKey
    protected String _packingStatus;

    /** CASE_PICKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _casePickingNo;

    /** RECEIVE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveLabelNo;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

    /** SHIPPING_PACKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPackingNo;

    /** CARRIER_TRACE_NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierTraceNum;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** DEPOSIT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositCd;

    /** CUSTOMER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _customerNm;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlPackingListUpdateDto() {
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
        if (other == null || !(other instanceof BsSqlPackingListUpdateDto)) { return false; }
        final BsSqlPackingListUpdateDto otherEntity = (BsSqlPackingListUpdateDto)other;
        if (!helpComparingValue(getProductId(), otherEntity.getProductId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlPackingListUpdate");
        result = xCH(result, getProductId());
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
        sb.append(c).append(getPickingNumSum());
        sb.append(c).append(getPackingNumSum());
        sb.append(c).append(getPackingHId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getProcessTypeId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getCenterNm());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getProductId());
        sb.append(c).append(getVersionNo());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getPickingHId());
        sb.append(c).append(getOldBid());
        sb.append(c).append(getPackingStatus());
        sb.append(c).append(getCasePickingNo());
        sb.append(c).append(getReceiveLabelNo());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getDaihyoNizoroeNo2());
        sb.append(c).append(getShippingPackingNo());
        sb.append(c).append(getCarrierTraceNum());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getDepositCd());
        sb.append(c).append(getCustomerNm());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] PICKING_NUM_SUM: {DECIMAL(41)} <br>
     * @return The value of the column 'PICKING_NUM_SUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPickingNumSum() {
        return _pickingNumSum;
    }

    /**
     * [set] PICKING_NUM_SUM: {DECIMAL(41)} <br>
     * @param pickingNumSum The value of the column 'PICKING_NUM_SUM'. (NullAllowed)
     */
    public void setPickingNumSum(java.math.BigDecimal pickingNumSum) {
        __modifiedProperties.add("pickingNumSum");
        this._pickingNumSum = pickingNumSum;
    }

    /**
     * [get] PACKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @return The value of the column 'PACKING_NUM_SUM'. (NullAllowed)
     */
    public java.math.BigDecimal getPackingNumSum() {
        return _packingNumSum;
    }

    /**
     * [set] PACKING_NUM_SUM: {DECIMAL(36, 4)} <br>
     * @param packingNumSum The value of the column 'PACKING_NUM_SUM'. (NullAllowed)
     */
    public void setPackingNumSum(java.math.BigDecimal packingNumSum) {
        __modifiedProperties.add("packingNumSum");
        this._packingNumSum = packingNumSum;
    }

    /**
     * [get] PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} <br>
     * 梱包ヘッダID
     * @return The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public Long getPackingHId() {
        return _packingHId;
    }

    /**
     * [set] PACKING_H_ID: {BIGINT(20), refers to t_packing_h.PACKING_H_ID} <br>
     * 梱包ヘッダID
     * @param packingHId The value of the column 'PACKING_H_ID'. (NullAllowed)
     */
    public void setPackingHId(Long packingHId) {
        __modifiedProperties.add("packingHId");
        this._packingHId = packingHId;
    }

    /**
     * [get] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {BIGINT(20), refers to t_packing_h.CENTER_ID} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {BIGINT(20), refers to t_packing_h.CLIENT_ID} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} <br>
     * 処理区分ID
     * @return The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public Long getProcessTypeId() {
        return _processTypeId;
    }

    /**
     * [set] PROCESS_TYPE_ID: {BIGINT(20), refers to t_packing_h.PROCESS_TYPE_ID} <br>
     * 処理区分ID
     * @param processTypeId The value of the column 'PROCESS_TYPE_ID'. (NullAllowed)
     */
    public void setProcessTypeId(Long processTypeId) {
        __modifiedProperties.add("processTypeId");
        this._processTypeId = processTypeId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
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
     * [get] BOX_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {VARCHAR(30)} <br>
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {VARCHAR(60)} <br>
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100), refers to m_product.PRODUCT_CD} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(30)} <br>
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(30)} <br>
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {PK, BIGINT(20), refers to m_product.PRODUCT_ID} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] VERSION_NO: {BIGINT(20)} <br>
     * @return The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public Long getVersionNo() {
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {BIGINT(20)} <br>
     * @param versionNo The value of the column 'VERSION_NO'. (NullAllowed)
     */
    public void setVersionNo(Long versionNo) {
        __modifiedProperties.add("versionNo");
        this._versionNo = versionNo;
    }

    /**
     * [get] ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {BIGINT(20), refers to t_packing_h.ALLOC_INST_H_ID} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} <br>
     * 出庫ヘッダID
     * @return The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public Long getPickingHId() {
        return _pickingHId;
    }

    /**
     * [set] PICKING_H_ID: {BIGINT(20), refers to t_packing_h.PICKING_H_ID} <br>
     * 出庫ヘッダID
     * @param pickingHId The value of the column 'PICKING_H_ID'. (NullAllowed)
     */
    public void setPickingHId(Long pickingHId) {
        __modifiedProperties.add("pickingHId");
        this._pickingHId = pickingHId;
    }

    /**
     * [get] OLD_BID: {BIGINT(20), refers to t_packing_b.PACKING_B_ID} <br>
     * 梱包ボディID
     * @return The value of the column 'OLD_BID'. (NullAllowed)
     */
    public Long getOldBid() {
        return _oldBid;
    }

    /**
     * [set] OLD_BID: {BIGINT(20), refers to t_packing_b.PACKING_B_ID} <br>
     * 梱包ボディID
     * @param oldBid The value of the column 'OLD_BID'. (NullAllowed)
     */
    public void setOldBid(Long oldBid) {
        __modifiedProperties.add("oldBid");
        this._oldBid = oldBid;
    }

    /**
     * [get] PACKING_STATUS: {VARCHAR(30)} <br>
     * @return The value of the column 'PACKING_STATUS'. (NullAllowed)
     */
    public String getPackingStatus() {
        return _packingStatus;
    }

    /**
     * [set] PACKING_STATUS: {VARCHAR(30)} <br>
     * @param packingStatus The value of the column 'PACKING_STATUS'. (NullAllowed)
     */
    public void setPackingStatus(String packingStatus) {
        __modifiedProperties.add("packingStatus");
        this._packingStatus = packingStatus;
    }

    /**
     * [get] CASE_PICKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'CASE_PICKING_NO'. (NullAllowed)
     */
    public String getCasePickingNo() {
        return _casePickingNo;
    }

    /**
     * [set] CASE_PICKING_NO: {VARCHAR(30)} <br>
     * @param casePickingNo The value of the column 'CASE_PICKING_NO'. (NullAllowed)
     */
    public void setCasePickingNo(String casePickingNo) {
        __modifiedProperties.add("casePickingNo");
        this._casePickingNo = casePickingNo;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public String getReceiveLabelNo() {
        return _receiveLabelNo;
    }

    /**
     * [set] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        __modifiedProperties.add("receiveLabelNo");
        this._receiveLabelNo = receiveLabelNo;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public String getNizoroeNo2() {
        return _nizoroeNo2;
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        __modifiedProperties.add("nizoroeNo2");
        this._nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo() {
        return _daihyoNizoroeNo;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        __modifiedProperties.add("daihyoNizoroeNo");
        this._daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
    }

    /**
     * [get] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @return The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public String getShippingPackingNo() {
        return _shippingPackingNo;
    }

    /**
     * [set] SHIPPING_PACKING_NO: {VARCHAR(30)} <br>
     * @param shippingPackingNo The value of the column 'SHIPPING_PACKING_NO'. (NullAllowed)
     */
    public void setShippingPackingNo(String shippingPackingNo) {
        __modifiedProperties.add("shippingPackingNo");
        this._shippingPackingNo = shippingPackingNo;
    }

    /**
     * [get] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @return The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public String getCarrierTraceNum() {
        return _carrierTraceNum;
    }

    /**
     * [set] CARRIER_TRACE_NUM: {VARCHAR(30)} <br>
     * @param carrierTraceNum The value of the column 'CARRIER_TRACE_NUM'. (NullAllowed)
     */
    public void setCarrierTraceNum(String carrierTraceNum) {
        __modifiedProperties.add("carrierTraceNum");
        this._carrierTraceNum = carrierTraceNum;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] DEPOSIT_CD: {VARCHAR(30)} <br>
     * @return The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public String getDepositCd() {
        return _depositCd;
    }

    /**
     * [set] DEPOSIT_CD: {VARCHAR(30)} <br>
     * @param depositCd The value of the column 'DEPOSIT_CD'. (NullAllowed)
     */
    public void setDepositCd(String depositCd) {
        __modifiedProperties.add("depositCd");
        this._depositCd = depositCd;
    }

    /**
     * [get] CUSTOMER_NM: {VARCHAR(60)} <br>
     * @return The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public String getCustomerNm() {
        return _customerNm;
    }

    /**
     * [set] CUSTOMER_NM: {VARCHAR(60)} <br>
     * @param customerNm The value of the column 'CUSTOMER_NM'. (NullAllowed)
     */
    public void setCustomerNm(String customerNm) {
        __modifiedProperties.add("customerNm");
        this._customerNm = customerNm;
    }

}
