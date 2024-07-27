package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of w_ht_shipping as TABLE. <br>
 * 出荷検品ワーク
 * <pre>
 * [primary-key]
 *     HT_SHIPPING_ID
 *
 * [column]
 *     HT_SHIPPING_ID, MAC_ADDRESS, ALLOC_INST_H_ID, CLIENT_ID, CENTER_ID, NIZOROE_NO, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, INST_NUM, SPG_QTY_ONS, SPG_QTY_REMAIN, PIECE_NO, SPG_WORK_COMMENT, BOX_ID, BOX_CD, BOX_NM, PICKING_WORK_NO, LOT, CONSUME_DT, PROD_DT, INDV_LABEL_NO, EXPECTED_SHIPMENT_NO, FORCE_COPLETE_FLG, SUSPEND_FLG, RECEIVE_LABEL_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO, DAIHYO_NIZOROE_NO2, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_SHIPPING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_center, m_box, m_product, m_client
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCenter, mBox, mProduct, mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWHtShippingDto implements Serializable {

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
    /** HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _htShippingId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _macAddress;

    /** ALLOC_INST_H_ID: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _allocInstHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** NIZOROE_NO: {NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} */
    @JsonKey
    protected Long _productId;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(255)} */
    @JsonKey
    protected String _productNm;

    /** INST_NUM: {NotNull, DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _instNum;

    /** SPG_QTY_ONS: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _spgQtyOns;

    /** SPG_QTY_REMAIN: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _spgQtyRemain;

    /** PIECE_NO: {BIGINT(19)} */
    @JsonKey
    protected Long _pieceNo;

    /** SPG_WORK_COMMENT: {VARCHAR(255)} */
    @JsonKey
    protected String _spgWorkComment;

    /** BOX_ID: {IX, BIGINT(19), FK to m_box} */
    @JsonKey
    protected Long _boxId;

    /** BOX_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _boxCd;

    /** BOX_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _boxNm;

    /** PICKING_WORK_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _pickingWorkNo;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** CONSUME_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _consumeDt;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** INDV_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _indvLabelNo;

    /** EXPECTED_SHIPMENT_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _expectedShipmentNo;

    /** FORCE_COPLETE_FLG: {CHAR(1)} */
    @JsonKey
    protected String _forceCopleteFlg;

    /** SUSPEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _suspendFlg;

    /** RECEIVE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveLabelNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

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
    public BsWHtShippingDto() {
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
    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    protected MBoxDto _mBox;

    public MBoxDto getMBox() {
        return _mBox;
    }

    public void setMBox(MBoxDto mBox) {
        this._mBox = mBox;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWHtShippingDto)) { return false; }
        final BsWHtShippingDto otherEntity = (BsWHtShippingDto)other;
        if (!helpComparingValue(getHtShippingId(), otherEntity.getHtShippingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "w_ht_shipping");
        result = xCH(result, getHtShippingId());
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
        sb.append(c).append(getHtShippingId());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getAllocInstHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getSpgQtyOns());
        sb.append(c).append(getSpgQtyRemain());
        sb.append(c).append(getPieceNo());
        sb.append(c).append(getSpgWorkComment());
        sb.append(c).append(getBoxId());
        sb.append(c).append(getBoxCd());
        sb.append(c).append(getBoxNm());
        sb.append(c).append(getPickingWorkNo());
        sb.append(c).append(getLot());
        sb.append(c).append(getConsumeDt());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getIndvLabelNo());
        sb.append(c).append(getExpectedShipmentNo());
        sb.append(c).append(getForceCopleteFlg());
        sb.append(c).append(getSuspendFlg());
        sb.append(c).append(getReceiveLabelNo());
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getDaihyoNizoroeNo2());
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
     * [get] HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷検品ワークID
     * @return The value of the column 'HT_SHIPPING_ID'. (NullAllowed)
     */
    public Long getHtShippingId() {
        return _htShippingId;
    }

    /**
     * [set] HT_SHIPPING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷検品ワークID
     * @param htShippingId The value of the column 'HT_SHIPPING_ID'. (NullAllowed)
     */
    public void setHtShippingId(Long htShippingId) {
        __modifiedProperties.add("htShippingId");
        this._htShippingId = htShippingId;
    }

    /**
     * [get] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @return The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public String getMacAddress() {
        return _macAddress;
    }

    /**
     * [set] MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} <br>
     * MACアドレス
     * @param macAddress The value of the column 'MAC_ADDRESS'. (NullAllowed)
     */
    public void setMacAddress(String macAddress) {
        __modifiedProperties.add("macAddress");
        this._macAddress = macAddress;
    }

    /**
     * [get] ALLOC_INST_H_ID: {NotNull, BIGINT(19)} <br>
     * 引当指示ヘッダID
     * @return The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public Long getAllocInstHId() {
        return _allocInstHId;
    }

    /**
     * [set] ALLOC_INST_H_ID: {NotNull, BIGINT(19)} <br>
     * 引当指示ヘッダID
     * @param allocInstHId The value of the column 'ALLOC_INST_H_ID'. (NullAllowed)
     */
    public void setAllocInstHId(Long allocInstHId) {
        __modifiedProperties.add("allocInstHId");
        this._allocInstHId = allocInstHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {NotNull, VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @return The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public Long getProductId() {
        return _productId;
    }

    /**
     * [set] PRODUCT_ID: {IX, NotNull, BIGINT(19), FK to m_product} <br>
     * 商品ID
     * @param productId The value of the column 'PRODUCT_ID'. (NullAllowed)
     */
    public void setProductId(Long productId) {
        __modifiedProperties.add("productId");
        this._productId = productId;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @return The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public String getProductNm() {
        return _productNm;
    }

    /**
     * [set] PRODUCT_NM: {VARCHAR(255)} <br>
     * 商品名称
     * @param productNm The value of the column 'PRODUCT_NM'. (NullAllowed)
     */
    public void setProductNm(String productNm) {
        __modifiedProperties.add("productNm");
        this._productNm = productNm;
    }

    /**
     * [get] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @return The value of the column 'INST_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInstNum() {
        return _instNum;
    }

    /**
     * [set] INST_NUM: {NotNull, DECIMAL(14, 4)} <br>
     * 指示数
     * @param instNum The value of the column 'INST_NUM'. (NullAllowed)
     */
    public void setInstNum(java.math.BigDecimal instNum) {
        __modifiedProperties.add("instNum");
        this._instNum = instNum;
    }

    /**
     * [get] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * 検品済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public java.math.BigDecimal getSpgQtyOns() {
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * 検品済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public void setSpgQtyOns(java.math.BigDecimal spgQtyOns) {
        __modifiedProperties.add("spgQtyOns");
        this._spgQtyOns = spgQtyOns;
    }

    /**
     * [get] SPG_QTY_REMAIN: {DECIMAL(14, 4)} <br>
     * 検品残数
     * @return The value of the column 'SPG_QTY_REMAIN'. (NullAllowed)
     */
    public java.math.BigDecimal getSpgQtyRemain() {
        return _spgQtyRemain;
    }

    /**
     * [set] SPG_QTY_REMAIN: {DECIMAL(14, 4)} <br>
     * 検品残数
     * @param spgQtyRemain The value of the column 'SPG_QTY_REMAIN'. (NullAllowed)
     */
    public void setSpgQtyRemain(java.math.BigDecimal spgQtyRemain) {
        __modifiedProperties.add("spgQtyRemain");
        this._spgQtyRemain = spgQtyRemain;
    }

    /**
     * [get] PIECE_NO: {BIGINT(19)} <br>
     * 個口番号
     * @return The value of the column 'PIECE_NO'. (NullAllowed)
     */
    public Long getPieceNo() {
        return _pieceNo;
    }

    /**
     * [set] PIECE_NO: {BIGINT(19)} <br>
     * 個口番号
     * @param pieceNo The value of the column 'PIECE_NO'. (NullAllowed)
     */
    public void setPieceNo(Long pieceNo) {
        __modifiedProperties.add("pieceNo");
        this._pieceNo = pieceNo;
    }

    /**
     * [get] SPG_WORK_COMMENT: {VARCHAR(255)} <br>
     * 出荷作業備考
     * @return The value of the column 'SPG_WORK_COMMENT'. (NullAllowed)
     */
    public String getSpgWorkComment() {
        return _spgWorkComment;
    }

    /**
     * [set] SPG_WORK_COMMENT: {VARCHAR(255)} <br>
     * 出荷作業備考
     * @param spgWorkComment The value of the column 'SPG_WORK_COMMENT'. (NullAllowed)
     */
    public void setSpgWorkComment(String spgWorkComment) {
        __modifiedProperties.add("spgWorkComment");
        this._spgWorkComment = spgWorkComment;
    }

    /**
     * [get] BOX_ID: {IX, BIGINT(19), FK to m_box} <br>
     * 荷材ID
     * @return The value of the column 'BOX_ID'. (NullAllowed)
     */
    public Long getBoxId() {
        return _boxId;
    }

    /**
     * [set] BOX_ID: {IX, BIGINT(19), FK to m_box} <br>
     * 荷材ID
     * @param boxId The value of the column 'BOX_ID'. (NullAllowed)
     */
    public void setBoxId(Long boxId) {
        __modifiedProperties.add("boxId");
        this._boxId = boxId;
    }

    /**
     * [get] BOX_CD: {VARCHAR(30)} <br>
     * 荷材CD
     * @return The value of the column 'BOX_CD'. (NullAllowed)
     */
    public String getBoxCd() {
        return _boxCd;
    }

    /**
     * [set] BOX_CD: {VARCHAR(30)} <br>
     * 荷材CD
     * @param boxCd The value of the column 'BOX_CD'. (NullAllowed)
     */
    public void setBoxCd(String boxCd) {
        __modifiedProperties.add("boxCd");
        this._boxCd = boxCd;
    }

    /**
     * [get] BOX_NM: {VARCHAR(60)} <br>
     * 荷材名称
     * @return The value of the column 'BOX_NM'. (NullAllowed)
     */
    public String getBoxNm() {
        return _boxNm;
    }

    /**
     * [set] BOX_NM: {VARCHAR(60)} <br>
     * 荷材名称
     * @param boxNm The value of the column 'BOX_NM'. (NullAllowed)
     */
    public void setBoxNm(String boxNm) {
        __modifiedProperties.add("boxNm");
        this._boxNm = boxNm;
    }

    /**
     * [get] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * 出庫作業No.
     * @return The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public String getPickingWorkNo() {
        return _pickingWorkNo;
    }

    /**
     * [set] PICKING_WORK_NO: {VARCHAR(30)} <br>
     * 出庫作業No.
     * @param pickingWorkNo The value of the column 'PICKING_WORK_NO'. (NullAllowed)
     */
    public void setPickingWorkNo(String pickingWorkNo) {
        __modifiedProperties.add("pickingWorkNo");
        this._pickingWorkNo = pickingWorkNo;
    }

    /**
     * [get] LOT: {VARCHAR(30)} <br>
     * ロット
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(30)} <br>
     * ロット
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] CONSUME_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'CONSUME_DT'. (NullAllowed)
     */
    public String getConsumeDt() {
        return _consumeDt;
    }

    /**
     * [set] CONSUME_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param consumeDt The value of the column 'CONSUME_DT'. (NullAllowed)
     */
    public void setConsumeDt(String consumeDt) {
        __modifiedProperties.add("consumeDt");
        this._consumeDt = consumeDt;
    }

    /**
     * [get] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @return The value of the column 'PROD_DT'. (NullAllowed)
     */
    public String getProdDt() {
        return _prodDt;
    }

    /**
     * [set] PROD_DT: {VARCHAR(8)} <br>
     * 製造日
     * @param prodDt The value of the column 'PROD_DT'. (NullAllowed)
     */
    public void setProdDt(String prodDt) {
        __modifiedProperties.add("prodDt");
        this._prodDt = prodDt;
    }

    /**
     * [get] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNo
     * @return The value of the column 'INDV_LABEL_NO'. (NullAllowed)
     */
    public String getIndvLabelNo() {
        return _indvLabelNo;
    }

    /**
     * [set] INDV_LABEL_NO: {VARCHAR(30)} <br>
     * 個別貼付ラベルNo
     * @param indvLabelNo The value of the column 'INDV_LABEL_NO'. (NullAllowed)
     */
    public void setIndvLabelNo(String indvLabelNo) {
        __modifiedProperties.add("indvLabelNo");
        this._indvLabelNo = indvLabelNo;
    }

    /**
     * [get] EXPECTED_SHIPMENT_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @return The value of the column 'EXPECTED_SHIPMENT_NO'. (NullAllowed)
     */
    public String getExpectedShipmentNo() {
        return _expectedShipmentNo;
    }

    /**
     * [set] EXPECTED_SHIPMENT_NO: {VARCHAR(30)} <br>
     * 個体管理番号
     * @param expectedShipmentNo The value of the column 'EXPECTED_SHIPMENT_NO'. (NullAllowed)
     */
    public void setExpectedShipmentNo(String expectedShipmentNo) {
        __modifiedProperties.add("expectedShipmentNo");
        this._expectedShipmentNo = expectedShipmentNo;
    }

    /**
     * [get] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @return The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed)
     */
    public String getForceCopleteFlg() {
        return _forceCopleteFlg;
    }

    /**
     * [set] FORCE_COPLETE_FLG: {CHAR(1)} <br>
     * 強制完了フラグ
     * @param forceCopleteFlg The value of the column 'FORCE_COPLETE_FLG'. (NullAllowed)
     */
    public void setForceCopleteFlg(String forceCopleteFlg) {
        __modifiedProperties.add("forceCopleteFlg");
        this._forceCopleteFlg = forceCopleteFlg;
    }

    /**
     * [get] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @return The value of the column 'SUSPEND_FLG'. (NullAllowed)
     */
    public String getSuspendFlg() {
        return _suspendFlg;
    }

    /**
     * [set] SUSPEND_FLG: {CHAR(1)} <br>
     * 中断フラグ
     * @param suspendFlg The value of the column 'SUSPEND_FLG'. (NullAllowed)
     */
    public void setSuspendFlg(String suspendFlg) {
        __modifiedProperties.add("suspendFlg");
        this._suspendFlg = suspendFlg;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public String getReceiveLabelNo() {
        return _receiveLabelNo;
    }

    /**
     * [set] RECEIVE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        __modifiedProperties.add("receiveLabelNo");
        this._receiveLabelNo = receiveLabelNo;
    }

    /**
     * [get] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @return The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public String getNizoroeNo2() {
        return _nizoroeNo2;
    }

    /**
     * [set] NIZOROE_NO2: {VARCHAR(30)} <br>
     * 荷揃番号_ハイフンあり
     * @param nizoroeNo2 The value of the column 'NIZOROE_NO2'. (NullAllowed)
     */
    public void setNizoroeNo2(String nizoroeNo2) {
        __modifiedProperties.add("nizoroeNo2");
        this._nizoroeNo2 = nizoroeNo2;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo() {
        return _daihyoNizoroeNo;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        __modifiedProperties.add("daihyoNizoroeNo");
        this._daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 表荷揃番号_ハイフンあり
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 表荷揃番号_ハイフンあり
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
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
