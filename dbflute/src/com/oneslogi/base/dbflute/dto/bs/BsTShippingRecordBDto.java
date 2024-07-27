package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_record_b as TABLE. <br>
 * 出荷実績ボディ
 * <pre>
 * [primary-key]
 *     SHIPPING_RECORD_B_ID
 *
 * [column]
 *     SHIPPING_RECORD_B_ID, SHIPPING_RECORD_H_ID, SHIPPING_SLIP_ROW_NO, SN, PRODUCT_CD, JAN_CD, NUM, LOT_MANAG_TYPE_CD, LOT, CONFIRMED_PACKING_NUM, SR_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_shipping_record_h
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tShippingRecordH
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingRecordBDto implements Serializable {

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
    /** SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingRecordBId;

    /** SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h} */
    @JsonKey
    protected Long _shippingRecordHId;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipRowNo;

    /** SN: {BIGINT(19), default=[0]} */
    @JsonKey
    protected Long _sn;

    /** PRODUCT_CD: {NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _num;

    /** LOT_MANAG_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _lotManagTypeCd;

    /** LOT: {VARCHAR(100)} */
    @JsonKey
    protected String _lot;

    /** CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _confirmedPackingNum;

    /** SR_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _srSendFlg;

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
    public BsTShippingRecordBDto() {
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
    protected TShippingRecordHDto _tShippingRecordH;

    public TShippingRecordHDto getTShippingRecordH() {
        return _tShippingRecordH;
    }

    public void setTShippingRecordH(TShippingRecordHDto tShippingRecordH) {
        this._tShippingRecordH = tShippingRecordH;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingRecordBDto)) { return false; }
        final BsTShippingRecordBDto otherEntity = (BsTShippingRecordBDto)other;
        if (!helpComparingValue(getShippingRecordBId(), otherEntity.getShippingRecordBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_record_b");
        result = xCH(result, getShippingRecordBId());
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
        sb.append(c).append(getShippingRecordBId());
        sb.append(c).append(getShippingRecordHId());
        sb.append(c).append(getShippingSlipRowNo());
        sb.append(c).append(getSn());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getNum());
        sb.append(c).append(getLotManagTypeCd());
        sb.append(c).append(getLot());
        sb.append(c).append(getConfirmedPackingNum());
        sb.append(c).append(getSrSendFlg());
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
     * [get] SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ボディID
     * @return The value of the column 'SHIPPING_RECORD_B_ID'. (NullAllowed)
     */
    public Long getShippingRecordBId() {
        return _shippingRecordBId;
    }

    /**
     * [set] SHIPPING_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ボディID
     * @param shippingRecordBId The value of the column 'SHIPPING_RECORD_B_ID'. (NullAllowed)
     */
    public void setShippingRecordBId(Long shippingRecordBId) {
        __modifiedProperties.add("shippingRecordBId");
        this._shippingRecordBId = shippingRecordBId;
    }

    /**
     * [get] SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h} <br>
     * 出荷実績ヘッダID
     * @return The value of the column 'SHIPPING_RECORD_H_ID'. (NullAllowed)
     */
    public Long getShippingRecordHId() {
        return _shippingRecordHId;
    }

    /**
     * [set] SHIPPING_RECORD_H_ID: {IX, BIGINT(19), FK to t_shipping_record_h} <br>
     * 出荷実績ヘッダID
     * @param shippingRecordHId The value of the column 'SHIPPING_RECORD_H_ID'. (NullAllowed)
     */
    public void setShippingRecordHId(Long shippingRecordHId) {
        __modifiedProperties.add("shippingRecordHId");
        this._shippingRecordHId = shippingRecordHId;
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
     * [get] SN: {BIGINT(19), default=[0]} <br>
     * 連番
     * @return The value of the column 'SN'. (NullAllowed)
     */
    public Long getSn() {
        return _sn;
    }

    /**
     * [set] SN: {BIGINT(19), default=[0]} <br>
     * 連番
     * @param sn The value of the column 'SN'. (NullAllowed)
     */
    public void setSn(Long sn) {
        __modifiedProperties.add("sn");
        this._sn = sn;
    }

    /**
     * [get] PRODUCT_CD: {NotNull, VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {NotNull, VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
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
     * [get] NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getNum() {
        return _num;
    }

    /**
     * [set] NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(java.math.BigDecimal num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @return The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public String getLotManagTypeCd() {
        return _lotManagTypeCd;
    }

    /**
     * [set] LOT_MANAG_TYPE_CD: {VARCHAR(30)} <br>
     * ロット管理区分
     * @param lotManagTypeCd The value of the column 'LOT_MANAG_TYPE_CD'. (NullAllowed)
     */
    public void setLotManagTypeCd(String lotManagTypeCd) {
        __modifiedProperties.add("lotManagTypeCd");
        this._lotManagTypeCd = lotManagTypeCd;
    }

    /**
     * [get] LOT: {VARCHAR(100)} <br>
     * ロット番号
     * @return The value of the column 'LOT'. (NullAllowed)
     */
    public String getLot() {
        return _lot;
    }

    /**
     * [set] LOT: {VARCHAR(100)} <br>
     * ロット番号
     * @param lot The value of the column 'LOT'. (NullAllowed)
     */
    public void setLot(String lot) {
        __modifiedProperties.add("lot");
        this._lot = lot;
    }

    /**
     * [get] CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)} <br>
     * 確定梱包数
     * @return The value of the column 'CONFIRMED_PACKING_NUM'. (NullAllowed)
     */
    public Long getConfirmedPackingNum() {
        return _confirmedPackingNum;
    }

    /**
     * [set] CONFIRMED_PACKING_NUM: {NotNull, BIGINT(19)} <br>
     * 確定梱包数
     * @param confirmedPackingNum The value of the column 'CONFIRMED_PACKING_NUM'. (NullAllowed)
     */
    public void setConfirmedPackingNum(Long confirmedPackingNum) {
        __modifiedProperties.add("confirmedPackingNum");
        this._confirmedPackingNum = confirmedPackingNum;
    }

    /**
     * [get] SR_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 出荷実績送信済フラグ
     * @return The value of the column 'SR_SEND_FLG'. (NullAllowed)
     */
    public String getSrSendFlg() {
        return _srSendFlg;
    }

    /**
     * [set] SR_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 出荷実績送信済フラグ
     * @param srSendFlg The value of the column 'SR_SEND_FLG'. (NullAllowed)
     */
    public void setSrSendFlg(String srSendFlg) {
        __modifiedProperties.add("srSendFlg");
        this._srSendFlg = srSendFlg;
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
