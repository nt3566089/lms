package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of w_ht_total_picking as TABLE. <br>
 * トータルピッキングワーク
 * <pre>
 * [primary-key]
 *     HT_TOTAL_PICKING_ID
 *
 * [column]
 *     HT_TOTAL_PICKING_ID, MAC_ADDRESS, CLIENT_ID, CENTER_ID, PICKING_B_ID, NIZOROE_NO, PRODUCT_ID, JAN_CD, PRODUCT_CD, PRODUCT_NM, INST_NUM, SPG_QTY_ONS, LOCATION_ID, LOCATION_CD, LOCATION_NM, LOT, LIMIT_DT, WORK_START_DT, WORK_END_DT, STORE_LABEL_NO, LOT_ID, PICKING_FLG, SKIP_NUM, PROD_DT, FORCE_COPLETE_FLG, DAIHYO_NIZOROE_NO, NIZOROE_NO2, DAIHYO_NIZOROE_NO2, SUSPEND_FLG, WORK_GROUP_KEY, ANOTHER_PICKING_FLG, LAP_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     HT_TOTAL_PICKING_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_lot, m_client, m_product, m_location, m_center
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tLot, mClient, mProduct, mLocation, mCenter
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsWHtTotalPickingDto implements Serializable {

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
    /** HT_TOTAL_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _htTotalPickingId;

    /** MAC_ADDRESS: {IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _macAddress;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** PICKING_B_ID: {IX, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _pickingBId;

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

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** LOCATION_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _locationNm;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** WORK_START_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workStartDt;

    /** WORK_END_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _workEndDt;

    /** STORE_LABEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeLabelNo;

    /** LOT_ID: {IX, BIGINT(19), FK to t_lot} */
    @JsonKey
    protected Long _lotId;

    /** PICKING_FLG: {CHAR(1)} */
    @JsonKey
    protected String _pickingFlg;

    /** SKIP_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _skipNum;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** FORCE_COPLETE_FLG: {CHAR(1)} */
    @JsonKey
    protected String _forceCopleteFlg;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo2;

    /** DAIHYO_NIZOROE_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo2;

    /** SUSPEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _suspendFlg;

    /** WORK_GROUP_KEY: {VARCHAR(30)} */
    @JsonKey
    protected String _workGroupKey;

    /** ANOTHER_PICKING_FLG: {CHAR(1)} */
    @JsonKey
    protected String _anotherPickingFlg;

    /** LAP_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _lapNum;

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
    public BsWHtTotalPickingDto() {
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
    protected TLotDto _tLot;

    public TLotDto getTLot() {
        return _tLot;
    }

    public void setTLot(TLotDto tLot) {
        this._tLot = tLot;
    }

    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    protected MProductDto _mProduct;

    public MProductDto getMProduct() {
        return _mProduct;
    }

    public void setMProduct(MProductDto mProduct) {
        this._mProduct = mProduct;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsWHtTotalPickingDto)) { return false; }
        final BsWHtTotalPickingDto otherEntity = (BsWHtTotalPickingDto)other;
        if (!helpComparingValue(getHtTotalPickingId(), otherEntity.getHtTotalPickingId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "w_ht_total_picking");
        result = xCH(result, getHtTotalPickingId());
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
        sb.append(c).append(getHtTotalPickingId());
        sb.append(c).append(getMacAddress());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getPickingBId());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getProductId());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getInstNum());
        sb.append(c).append(getSpgQtyOns());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getLocationNm());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getWorkStartDt());
        sb.append(c).append(getWorkEndDt());
        sb.append(c).append(getStoreLabelNo());
        sb.append(c).append(getLotId());
        sb.append(c).append(getPickingFlg());
        sb.append(c).append(getSkipNum());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getForceCopleteFlg());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getNizoroeNo2());
        sb.append(c).append(getDaihyoNizoroeNo2());
        sb.append(c).append(getSuspendFlg());
        sb.append(c).append(getWorkGroupKey());
        sb.append(c).append(getAnotherPickingFlg());
        sb.append(c).append(getLapNum());
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
     * [get] HT_TOTAL_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * トータルピッキングワークID
     * @return The value of the column 'HT_TOTAL_PICKING_ID'. (NullAllowed)
     */
    public Long getHtTotalPickingId() {
        return _htTotalPickingId;
    }

    /**
     * [set] HT_TOTAL_PICKING_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * トータルピッキングワークID
     * @param htTotalPickingId The value of the column 'HT_TOTAL_PICKING_ID'. (NullAllowed)
     */
    public void setHtTotalPickingId(Long htTotalPickingId) {
        __modifiedProperties.add("htTotalPickingId");
        this._htTotalPickingId = htTotalPickingId;
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
     * [get] PICKING_B_ID: {IX, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @return The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public Long getPickingBId() {
        return _pickingBId;
    }

    /**
     * [set] PICKING_B_ID: {IX, NotNull, BIGINT(19)} <br>
     * 出庫ボディID
     * @param pickingBId The value of the column 'PICKING_B_ID'. (NullAllowed)
     */
    public void setPickingBId(Long pickingBId) {
        __modifiedProperties.add("pickingBId");
        this._pickingBId = pickingBId;
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
     * ピッキング済数
     * @return The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public java.math.BigDecimal getSpgQtyOns() {
        return _spgQtyOns;
    }

    /**
     * [set] SPG_QTY_ONS: {DECIMAL(14, 4)} <br>
     * ピッキング済数
     * @param spgQtyOns The value of the column 'SPG_QTY_ONS'. (NullAllowed)
     */
    public void setSpgQtyOns(java.math.BigDecimal spgQtyOns) {
        __modifiedProperties.add("spgQtyOns");
        this._spgQtyOns = spgQtyOns;
    }

    /**
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @return The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public String getLocationCd() {
        return _locationCd;
    }

    /**
     * [set] LOCATION_CD: {VARCHAR(30)} <br>
     * ロケーションCD
     * @param locationCd The value of the column 'LOCATION_CD'. (NullAllowed)
     */
    public void setLocationCd(String locationCd) {
        __modifiedProperties.add("locationCd");
        this._locationCd = locationCd;
    }

    /**
     * [get] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @return The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public String getLocationNm() {
        return _locationNm;
    }

    /**
     * [set] LOCATION_NM: {VARCHAR(60)} <br>
     * ロケーション名称
     * @param locationNm The value of the column 'LOCATION_NM'. (NullAllowed)
     */
    public void setLocationNm(String locationNm) {
        __modifiedProperties.add("locationNm");
        this._locationNm = locationNm;
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
     * [get] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @return The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public String getLimitDt() {
        return _limitDt;
    }

    /**
     * [set] LIMIT_DT: {VARCHAR(8)} <br>
     * 期限日
     * @param limitDt The value of the column 'LIMIT_DT'. (NullAllowed)
     */
    public void setLimitDt(String limitDt) {
        __modifiedProperties.add("limitDt");
        this._limitDt = limitDt;
    }

    /**
     * [get] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @return The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkStartDt() {
        return _workStartDt;
    }

    /**
     * [set] WORK_START_DT: {DATETIME(19)} <br>
     * 開始時間
     * @param workStartDt The value of the column 'WORK_START_DT'. (NullAllowed)
     */
    public void setWorkStartDt(java.sql.Timestamp workStartDt) {
        __modifiedProperties.add("workStartDt");
        this._workStartDt = workStartDt;
    }

    /**
     * [get] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @return The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getWorkEndDt() {
        return _workEndDt;
    }

    /**
     * [set] WORK_END_DT: {DATETIME(19)} <br>
     * 終了時間
     * @param workEndDt The value of the column 'WORK_END_DT'. (NullAllowed)
     */
    public void setWorkEndDt(java.sql.Timestamp workEndDt) {
        __modifiedProperties.add("workEndDt");
        this._workEndDt = workEndDt;
    }

    /**
     * [get] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo.
     * @return The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public String getStoreLabelNo() {
        return _storeLabelNo;
    }

    /**
     * [set] STORE_LABEL_NO: {VARCHAR(30)} <br>
     * 入荷ラベルNo.
     * @param storeLabelNo The value of the column 'STORE_LABEL_NO'. (NullAllowed)
     */
    public void setStoreLabelNo(String storeLabelNo) {
        __modifiedProperties.add("storeLabelNo");
        this._storeLabelNo = storeLabelNo;
    }

    /**
     * [get] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @return The value of the column 'LOT_ID'. (NullAllowed)
     */
    public Long getLotId() {
        return _lotId;
    }

    /**
     * [set] LOT_ID: {IX, BIGINT(19), FK to t_lot} <br>
     * ロットID
     * @param lotId The value of the column 'LOT_ID'. (NullAllowed)
     */
    public void setLotId(Long lotId) {
        __modifiedProperties.add("lotId");
        this._lotId = lotId;
    }

    /**
     * [get] PICKING_FLG: {CHAR(1)} <br>
     * 出庫フラグ
     * @return The value of the column 'PICKING_FLG'. (NullAllowed)
     */
    public String getPickingFlg() {
        return _pickingFlg;
    }

    /**
     * [set] PICKING_FLG: {CHAR(1)} <br>
     * 出庫フラグ
     * @param pickingFlg The value of the column 'PICKING_FLG'. (NullAllowed)
     */
    public void setPickingFlg(String pickingFlg) {
        __modifiedProperties.add("pickingFlg");
        this._pickingFlg = pickingFlg;
    }

    /**
     * [get] SKIP_NUM: {BIGINT(19)} <br>
     * スキップ回数
     * @return The value of the column 'SKIP_NUM'. (NullAllowed)
     */
    public Long getSkipNum() {
        return _skipNum;
    }

    /**
     * [set] SKIP_NUM: {BIGINT(19)} <br>
     * スキップ回数
     * @param skipNum The value of the column 'SKIP_NUM'. (NullAllowed)
     */
    public void setSkipNum(Long skipNum) {
        __modifiedProperties.add("skipNum");
        this._skipNum = skipNum;
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
     * [get] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフン有り
     * @return The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo2() {
        return _daihyoNizoroeNo2;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO2: {VARCHAR(30)} <br>
     * 代表荷揃番号_ハイフン有り
     * @param daihyoNizoroeNo2 The value of the column 'DAIHYO_NIZOROE_NO2'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo2(String daihyoNizoroeNo2) {
        __modifiedProperties.add("daihyoNizoroeNo2");
        this._daihyoNizoroeNo2 = daihyoNizoroeNo2;
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
     * [get] WORK_GROUP_KEY: {VARCHAR(30)} <br>
     * 業グループキー
     * @return The value of the column 'WORK_GROUP_KEY'. (NullAllowed)
     */
    public String getWorkGroupKey() {
        return _workGroupKey;
    }

    /**
     * [set] WORK_GROUP_KEY: {VARCHAR(30)} <br>
     * 業グループキー
     * @param workGroupKey The value of the column 'WORK_GROUP_KEY'. (NullAllowed)
     */
    public void setWorkGroupKey(String workGroupKey) {
        __modifiedProperties.add("workGroupKey");
        this._workGroupKey = workGroupKey;
    }

    /**
     * [get] ANOTHER_PICKING_FLG: {CHAR(1)} <br>
     * 別在庫ピッキングフラグ
     * @return The value of the column 'ANOTHER_PICKING_FLG'. (NullAllowed)
     */
    public String getAnotherPickingFlg() {
        return _anotherPickingFlg;
    }

    /**
     * [set] ANOTHER_PICKING_FLG: {CHAR(1)} <br>
     * 別在庫ピッキングフラグ
     * @param anotherPickingFlg The value of the column 'ANOTHER_PICKING_FLG'. (NullAllowed)
     */
    public void setAnotherPickingFlg(String anotherPickingFlg) {
        __modifiedProperties.add("anotherPickingFlg");
        this._anotherPickingFlg = anotherPickingFlg;
    }

    /**
     * [get] LAP_NUM: {BIGINT(19)} <br>
     * 周回数
     * @return The value of the column 'LAP_NUM'. (NullAllowed)
     */
    public Long getLapNum() {
        return _lapNum;
    }

    /**
     * [set] LAP_NUM: {BIGINT(19)} <br>
     * 周回数
     * @param lapNum The value of the column 'LAP_NUM'. (NullAllowed)
     */
    public void setLapNum(Long lapNum) {
        __modifiedProperties.add("lapNum");
        this._lapNum = lapNum;
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
