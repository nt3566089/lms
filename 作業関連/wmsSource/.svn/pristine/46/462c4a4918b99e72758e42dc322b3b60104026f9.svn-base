package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_receive_label as TABLE. <br>
 * 入荷ラベル
 * <pre>
 * [primary-key]
 *     RECEIVE_LABEL_ID
 *
 * [column]
 *     RECEIVE_LABEL_ID, STOCK_ID, RECEIVE_LABEL_NO, NUM, OWNER_CD, OWNER_ABBR, RECOMMEND_LOCATION_CD, LOCATION_CD, JANCD, PRODUCT_NM, UNIT_NM, LOT, LIMIT_DT, PROD_DT, RECEIVE_DT, DEPOSIT_FLG, REPRINT_FLG, RECEIVE_UNIT_NUM, RECEIVE_PLAN_B_ID, RCV_LBL_OUT_USER_ID, RCV_LBL_OUT_DT, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_LABEL_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_receive_plan_b, t_stock, b_user
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tReceivePlanB, tStock, bUser
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceiveLabelDto implements Serializable {

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
    /** RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receiveLabelId;

    /** STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} */
    @JsonKey
    protected Long _stockId;

    /** RECEIVE_LABEL_NO: {IX, VARCHAR(255)} */
    @JsonKey
    protected String _receiveLabelNo;

    /** NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num;

    /** OWNER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _ownerCd;

    /** OWNER_ABBR: {VARCHAR(60)} */
    @JsonKey
    protected String _ownerAbbr;

    /** RECOMMEND_LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _recommendLocationCd;

    /** LOCATION_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd;

    /** JANCD: {VARCHAR(30)} */
    @JsonKey
    protected String _jancd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** UNIT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _unitNm;

    /** LOT: {VARCHAR(30)} */
    @JsonKey
    protected String _lot;

    /** LIMIT_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _limitDt;

    /** PROD_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _prodDt;

    /** RECEIVE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _receiveDt;

    /** DEPOSIT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _depositFlg;

    /** REPRINT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _reprintFlg;

    /** RECEIVE_UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _receiveUnitNum;

    /** RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} */
    @JsonKey
    protected Long _receivePlanBId;

    /** RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _rcvLblOutUserId;

    /** RCV_LBL_OUT_DT: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _rcvLblOutDt;

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
    public BsTReceiveLabelDto() {
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
    protected TReceivePlanBDto _tReceivePlanB;

    public TReceivePlanBDto getTReceivePlanB() {
        return _tReceivePlanB;
    }

    public void setTReceivePlanB(TReceivePlanBDto tReceivePlanB) {
        this._tReceivePlanB = tReceivePlanB;
    }

    protected TStockDto _tStock;

    public TStockDto getTStock() {
        return _tStock;
    }

    public void setTStock(TStockDto tStock) {
        this._tStock = tStock;
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
        if (other == null || !(other instanceof BsTReceiveLabelDto)) { return false; }
        final BsTReceiveLabelDto otherEntity = (BsTReceiveLabelDto)other;
        if (!helpComparingValue(getReceiveLabelId(), otherEntity.getReceiveLabelId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_receive_label");
        result = xCH(result, getReceiveLabelId());
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
        sb.append(c).append(getReceiveLabelId());
        sb.append(c).append(getStockId());
        sb.append(c).append(getReceiveLabelNo());
        sb.append(c).append(getNum());
        sb.append(c).append(getOwnerCd());
        sb.append(c).append(getOwnerAbbr());
        sb.append(c).append(getRecommendLocationCd());
        sb.append(c).append(getLocationCd());
        sb.append(c).append(getJancd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getUnitNm());
        sb.append(c).append(getLot());
        sb.append(c).append(getLimitDt());
        sb.append(c).append(getProdDt());
        sb.append(c).append(getReceiveDt());
        sb.append(c).append(getDepositFlg());
        sb.append(c).append(getReprintFlg());
        sb.append(c).append(getReceiveUnitNum());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getRcvLblOutUserId());
        sb.append(c).append(getRcvLblOutDt());
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
     * [get] RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷ラベルID
     * @return The value of the column 'RECEIVE_LABEL_ID'. (NullAllowed)
     */
    public Long getReceiveLabelId() {
        return _receiveLabelId;
    }

    /**
     * [set] RECEIVE_LABEL_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入荷ラベルID
     * @param receiveLabelId The value of the column 'RECEIVE_LABEL_ID'. (NullAllowed)
     */
    public void setReceiveLabelId(Long receiveLabelId) {
        __modifiedProperties.add("receiveLabelId");
        this._receiveLabelId = receiveLabelId;
    }

    /**
     * [get] STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @return The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public Long getStockId() {
        return _stockId;
    }

    /**
     * [set] STOCK_ID: {IX, NotNull, BIGINT(19), FK to t_stock} <br>
     * 在庫ID
     * @param stockId The value of the column 'STOCK_ID'. (NullAllowed)
     */
    public void setStockId(Long stockId) {
        __modifiedProperties.add("stockId");
        this._stockId = stockId;
    }

    /**
     * [get] RECEIVE_LABEL_NO: {IX, VARCHAR(255)} <br>
     * 入荷ラベルNo
     * @return The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public String getReceiveLabelNo() {
        return _receiveLabelNo;
    }

    /**
     * [set] RECEIVE_LABEL_NO: {IX, VARCHAR(255)} <br>
     * 入荷ラベルNo
     * @param receiveLabelNo The value of the column 'RECEIVE_LABEL_NO'. (NullAllowed)
     */
    public void setReceiveLabelNo(String receiveLabelNo) {
        __modifiedProperties.add("receiveLabelNo");
        this._receiveLabelNo = receiveLabelNo;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getNum() {
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(java.math.BigDecimal num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @return The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public String getOwnerCd() {
        return _ownerCd;
    }

    /**
     * [set] OWNER_CD: {VARCHAR(30)} <br>
     * 所有者CD
     * @param ownerCd The value of the column 'OWNER_CD'. (NullAllowed)
     */
    public void setOwnerCd(String ownerCd) {
        __modifiedProperties.add("ownerCd");
        this._ownerCd = ownerCd;
    }

    /**
     * [get] OWNER_ABBR: {VARCHAR(60)} <br>
     * 所有者略称
     * @return The value of the column 'OWNER_ABBR'. (NullAllowed)
     */
    public String getOwnerAbbr() {
        return _ownerAbbr;
    }

    /**
     * [set] OWNER_ABBR: {VARCHAR(60)} <br>
     * 所有者略称
     * @param ownerAbbr The value of the column 'OWNER_ABBR'. (NullAllowed)
     */
    public void setOwnerAbbr(String ownerAbbr) {
        __modifiedProperties.add("ownerAbbr");
        this._ownerAbbr = ownerAbbr;
    }

    /**
     * [get] RECOMMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケCD
     * @return The value of the column 'RECOMMEND_LOCATION_CD'. (NullAllowed)
     */
    public String getRecommendLocationCd() {
        return _recommendLocationCd;
    }

    /**
     * [set] RECOMMEND_LOCATION_CD: {VARCHAR(30)} <br>
     * 推奨ロケCD
     * @param recommendLocationCd The value of the column 'RECOMMEND_LOCATION_CD'. (NullAllowed)
     */
    public void setRecommendLocationCd(String recommendLocationCd) {
        __modifiedProperties.add("recommendLocationCd");
        this._recommendLocationCd = recommendLocationCd;
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
     * [get] JANCD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JANCD'. (NullAllowed)
     */
    public String getJancd() {
        return _jancd;
    }

    /**
     * [set] JANCD: {VARCHAR(30)} <br>
     * JANCD
     * @param jancd The value of the column 'JANCD'. (NullAllowed)
     */
    public void setJancd(String jancd) {
        __modifiedProperties.add("jancd");
        this._jancd = jancd;
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
     * [get] UNIT_NM: {VARCHAR(60)} <br>
     * 数量単位
     * @return The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public String getUnitNm() {
        return _unitNm;
    }

    /**
     * [set] UNIT_NM: {VARCHAR(60)} <br>
     * 数量単位
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed)
     */
    public void setUnitNm(String unitNm) {
        __modifiedProperties.add("unitNm");
        this._unitNm = unitNm;
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
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public String getReceiveDt() {
        return _receiveDt;
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public void setReceiveDt(String receiveDt) {
        __modifiedProperties.add("receiveDt");
        this._receiveDt = receiveDt;
    }

    /**
     * [get] DEPOSIT_FLG: {CHAR(1)} <br>
     * 預り品フラグ
     * @return The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public String getDepositFlg() {
        return _depositFlg;
    }

    /**
     * [set] DEPOSIT_FLG: {CHAR(1)} <br>
     * 預り品フラグ
     * @param depositFlg The value of the column 'DEPOSIT_FLG'. (NullAllowed)
     */
    public void setDepositFlg(String depositFlg) {
        __modifiedProperties.add("depositFlg");
        this._depositFlg = depositFlg;
    }

    /**
     * [get] REPRINT_FLG: {CHAR(1)} <br>
     * 再発行フラグ
     * @return The value of the column 'REPRINT_FLG'. (NullAllowed)
     */
    public String getReprintFlg() {
        return _reprintFlg;
    }

    /**
     * [set] REPRINT_FLG: {CHAR(1)} <br>
     * 再発行フラグ
     * @param reprintFlg The value of the column 'REPRINT_FLG'. (NullAllowed)
     */
    public void setReprintFlg(String reprintFlg) {
        __modifiedProperties.add("reprintFlg");
        this._reprintFlg = reprintFlg;
    }

    /**
     * [get] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @return The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed)
     */
    public Long getReceiveUnitNum() {
        return _receiveUnitNum;
    }

    /**
     * [set] RECEIVE_UNIT_NUM: {BIGINT(19)} <br>
     * 入荷時入数
     * @param receiveUnitNum The value of the column 'RECEIVE_UNIT_NUM'. (NullAllowed)
     */
    public void setReceiveUnitNum(Long receiveUnitNum) {
        __modifiedProperties.add("receiveUnitNum");
        this._receiveUnitNum = receiveUnitNum;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {IX, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 入荷ラベル出力者ID
     * @return The value of the column 'RCV_LBL_OUT_USER_ID'. (NullAllowed)
     */
    public Long getRcvLblOutUserId() {
        return _rcvLblOutUserId;
    }

    /**
     * [set] RCV_LBL_OUT_USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 入荷ラベル出力者ID
     * @param rcvLblOutUserId The value of the column 'RCV_LBL_OUT_USER_ID'. (NullAllowed)
     */
    public void setRcvLblOutUserId(Long rcvLblOutUserId) {
        __modifiedProperties.add("rcvLblOutUserId");
        this._rcvLblOutUserId = rcvLblOutUserId;
    }

    /**
     * [get] RCV_LBL_OUT_DT: {DATETIME(19)} <br>
     * 入荷ラベル出力日時
     * @return The value of the column 'RCV_LBL_OUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getRcvLblOutDt() {
        return _rcvLblOutDt;
    }

    /**
     * [set] RCV_LBL_OUT_DT: {DATETIME(19)} <br>
     * 入荷ラベル出力日時
     * @param rcvLblOutDt The value of the column 'RCV_LBL_OUT_DT'. (NullAllowed)
     */
    public void setRcvLblOutDt(java.sql.Timestamp rcvLblOutDt) {
        __modifiedProperties.add("rcvLblOutDt");
        this._rcvLblOutDt = rcvLblOutDt;
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
