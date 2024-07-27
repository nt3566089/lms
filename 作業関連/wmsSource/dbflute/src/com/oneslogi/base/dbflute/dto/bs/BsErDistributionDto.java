package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of er_distribution as TABLE. <br>
 * 流通加工情報受信テーブル
 * <pre>
 * [primary-key]
 *     DISTRIBUTION_ID
 *
 * [column]
 *     DISTRIBUTION_ID, RECEIVE_CD, RECEIVE_ROW_ID, ERROR_FLG, ERROR_MESSAGE_CD, IMPORT_FLG, STORE_SLIP_NO, STORE_SLIP_ROW_NO, STORE_REASON_CD, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_REASON_CD, STORE_PLANT_CD, STORE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, HINMOKU_CD, HINMOKU_TEXT, JAN_CD, NUM, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsErDistributionDto implements Serializable {

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
    /** DISTRIBUTION_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _distributionId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _errorMessageCd;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** STORE_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeSlipNo;

    /** STORE_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _storeSlipRowNo;

    /** STORE_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storeReasonCd;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipRowNo;

    /** SHIPPING_REASON_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingReasonCd;

    /** STORE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storePlantCd;

    /** STORE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storeStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** HINMOKU_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuCd;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    @JsonKey
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** NUM: {VARCHAR(30)} */
    @JsonKey
    protected String _num;

    /** WMS_ADD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddYyyy;

    /** WMS_ADD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddMm;

    /** WMS_ADD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddDd;

    /** WMS_ADD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddHh;

    /** WMS_ADD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddMi;

    /** WMS_ADD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddSs;

    /** WMS_ADD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsAddUserCd;

    /** WMS_UPD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdYyyy;

    /** WMS_UPD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdMm;

    /** WMS_UPD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdDd;

    /** WMS_UPD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdHh;

    /** WMS_UPD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdMi;

    /** WMS_UPD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdSs;

    /** WMS_UPD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _wmsUpdUserCd;

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
    public BsErDistributionDto() {
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
        if (other == null || !(other instanceof BsErDistributionDto)) { return false; }
        final BsErDistributionDto otherEntity = (BsErDistributionDto)other;
        if (!helpComparingValue(getDistributionId(), otherEntity.getDistributionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "er_distribution");
        result = xCH(result, getDistributionId());
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
        sb.append(c).append(getDistributionId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getStoreSlipNo());
        sb.append(c).append(getStoreSlipRowNo());
        sb.append(c).append(getStoreReasonCd());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getShippingSlipRowNo());
        sb.append(c).append(getShippingReasonCd());
        sb.append(c).append(getStorePlantCd());
        sb.append(c).append(getStoreStorageSpaceCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getHinmokuText());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getNum());
        sb.append(c).append(getWmsAddYyyy());
        sb.append(c).append(getWmsAddMm());
        sb.append(c).append(getWmsAddDd());
        sb.append(c).append(getWmsAddHh());
        sb.append(c).append(getWmsAddMi());
        sb.append(c).append(getWmsAddSs());
        sb.append(c).append(getWmsAddUserCd());
        sb.append(c).append(getWmsUpdYyyy());
        sb.append(c).append(getWmsUpdMm());
        sb.append(c).append(getWmsUpdDd());
        sb.append(c).append(getWmsUpdHh());
        sb.append(c).append(getWmsUpdMi());
        sb.append(c).append(getWmsUpdSs());
        sb.append(c).append(getWmsUpdUserCd());
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
     * [get] DISTRIBUTION_ID: {PK, NotNull, BIGINT(19)} <br>
     * 受信ID
     * @return The value of the column 'DISTRIBUTION_ID'. (NullAllowed)
     */
    public Long getDistributionId() {
        return _distributionId;
    }

    /**
     * [set] DISTRIBUTION_ID: {PK, NotNull, BIGINT(19)} <br>
     * 受信ID
     * @param distributionId The value of the column 'DISTRIBUTION_ID'. (NullAllowed)
     */
    public void setDistributionId(Long distributionId) {
        __modifiedProperties.add("distributionId");
        this._distributionId = distributionId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(30)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 送信済フラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @return The value of the column 'STORE_SLIP_NO'. (NullAllowed)
     */
    public String getStoreSlipNo() {
        return _storeSlipNo;
    }

    /**
     * [set] STORE_SLIP_NO: {VARCHAR(30)} <br>
     * 入庫伝票番号
     * @param storeSlipNo The value of the column 'STORE_SLIP_NO'. (NullAllowed)
     */
    public void setStoreSlipNo(String storeSlipNo) {
        __modifiedProperties.add("storeSlipNo");
        this._storeSlipNo = storeSlipNo;
    }

    /**
     * [get] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @return The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed)
     */
    public String getStoreSlipRowNo() {
        return _storeSlipRowNo;
    }

    /**
     * [set] STORE_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 入庫明細番号
     * @param storeSlipRowNo The value of the column 'STORE_SLIP_ROW_NO'. (NullAllowed)
     */
    public void setStoreSlipRowNo(String storeSlipRowNo) {
        __modifiedProperties.add("storeSlipRowNo");
        this._storeSlipRowNo = storeSlipRowNo;
    }

    /**
     * [get] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由
     * @return The value of the column 'STORE_REASON_CD'. (NullAllowed)
     */
    public String getStoreReasonCd() {
        return _storeReasonCd;
    }

    /**
     * [set] STORE_REASON_CD: {VARCHAR(30)} <br>
     * 入庫発生事由
     * @param storeReasonCd The value of the column 'STORE_REASON_CD'. (NullAllowed)
     */
    public void setStoreReasonCd(String storeReasonCd) {
        __modifiedProperties.add("storeReasonCd");
        this._storeReasonCd = storeReasonCd;
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
     * [get] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @return The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public String getShippingReasonCd() {
        return _shippingReasonCd;
    }

    /**
     * [set] SHIPPING_REASON_CD: {VARCHAR(30)} <br>
     * 出荷発生事由
     * @param shippingReasonCd The value of the column 'SHIPPING_REASON_CD'. (NullAllowed)
     */
    public void setShippingReasonCd(String shippingReasonCd) {
        __modifiedProperties.add("shippingReasonCd");
        this._shippingReasonCd = shippingReasonCd;
    }

    /**
     * [get] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public String getStorePlantCd() {
        return _storePlantCd;
    }

    /**
     * [set] STORE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param storePlantCd The value of the column 'STORE_PLANT_CD'. (NullAllowed)
     */
    public void setStorePlantCd(String storePlantCd) {
        __modifiedProperties.add("storePlantCd");
        this._storePlantCd = storePlantCd;
    }

    /**
     * [get] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStoreStorageSpaceCd() {
        return _storeStorageSpaceCd;
    }

    /**
     * [set] STORE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param storeStorageSpaceCd The value of the column 'STORE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStoreStorageSpaceCd(String storeStorageSpaceCd) {
        __modifiedProperties.add("storeStorageSpaceCd");
        this._storeStorageSpaceCd = storeStorageSpaceCd;
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
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public String getHinmokuCd() {
        return _hinmokuCd;
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public void setHinmokuCd(String hinmokuCd) {
        __modifiedProperties.add("hinmokuCd");
        this._hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public String getHinmokuText() {
        return _hinmokuText;
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed)
     */
    public void setHinmokuText(String hinmokuText) {
        __modifiedProperties.add("hinmokuText");
        this._hinmokuText = hinmokuText;
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
     * [get] NUM: {VARCHAR(30)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public String getNum() {
        return _num;
    }

    /**
     * [set] NUM: {VARCHAR(30)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(String num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @return The value of the column 'WMS_ADD_YYYY'. (NullAllowed)
     */
    public String getWmsAddYyyy() {
        return _wmsAddYyyy;
    }

    /**
     * [set] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @param wmsAddYyyy The value of the column 'WMS_ADD_YYYY'. (NullAllowed)
     */
    public void setWmsAddYyyy(String wmsAddYyyy) {
        __modifiedProperties.add("wmsAddYyyy");
        this._wmsAddYyyy = wmsAddYyyy;
    }

    /**
     * [get] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @return The value of the column 'WMS_ADD_MM'. (NullAllowed)
     */
    public String getWmsAddMm() {
        return _wmsAddMm;
    }

    /**
     * [set] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @param wmsAddMm The value of the column 'WMS_ADD_MM'. (NullAllowed)
     */
    public void setWmsAddMm(String wmsAddMm) {
        __modifiedProperties.add("wmsAddMm");
        this._wmsAddMm = wmsAddMm;
    }

    /**
     * [get] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @return The value of the column 'WMS_ADD_DD'. (NullAllowed)
     */
    public String getWmsAddDd() {
        return _wmsAddDd;
    }

    /**
     * [set] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @param wmsAddDd The value of the column 'WMS_ADD_DD'. (NullAllowed)
     */
    public void setWmsAddDd(String wmsAddDd) {
        __modifiedProperties.add("wmsAddDd");
        this._wmsAddDd = wmsAddDd;
    }

    /**
     * [get] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @return The value of the column 'WMS_ADD_HH'. (NullAllowed)
     */
    public String getWmsAddHh() {
        return _wmsAddHh;
    }

    /**
     * [set] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @param wmsAddHh The value of the column 'WMS_ADD_HH'. (NullAllowed)
     */
    public void setWmsAddHh(String wmsAddHh) {
        __modifiedProperties.add("wmsAddHh");
        this._wmsAddHh = wmsAddHh;
    }

    /**
     * [get] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @return The value of the column 'WMS_ADD_MI'. (NullAllowed)
     */
    public String getWmsAddMi() {
        return _wmsAddMi;
    }

    /**
     * [set] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @param wmsAddMi The value of the column 'WMS_ADD_MI'. (NullAllowed)
     */
    public void setWmsAddMi(String wmsAddMi) {
        __modifiedProperties.add("wmsAddMi");
        this._wmsAddMi = wmsAddMi;
    }

    /**
     * [get] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @return The value of the column 'WMS_ADD_SS'. (NullAllowed)
     */
    public String getWmsAddSs() {
        return _wmsAddSs;
    }

    /**
     * [set] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @param wmsAddSs The value of the column 'WMS_ADD_SS'. (NullAllowed)
     */
    public void setWmsAddSs(String wmsAddSs) {
        __modifiedProperties.add("wmsAddSs");
        this._wmsAddSs = wmsAddSs;
    }

    /**
     * [get] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @return The value of the column 'WMS_ADD_USER_CD'. (NullAllowed)
     */
    public String getWmsAddUserCd() {
        return _wmsAddUserCd;
    }

    /**
     * [set] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @param wmsAddUserCd The value of the column 'WMS_ADD_USER_CD'. (NullAllowed)
     */
    public void setWmsAddUserCd(String wmsAddUserCd) {
        __modifiedProperties.add("wmsAddUserCd");
        this._wmsAddUserCd = wmsAddUserCd;
    }

    /**
     * [get] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @return The value of the column 'WMS_UPD_YYYY'. (NullAllowed)
     */
    public String getWmsUpdYyyy() {
        return _wmsUpdYyyy;
    }

    /**
     * [set] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @param wmsUpdYyyy The value of the column 'WMS_UPD_YYYY'. (NullAllowed)
     */
    public void setWmsUpdYyyy(String wmsUpdYyyy) {
        __modifiedProperties.add("wmsUpdYyyy");
        this._wmsUpdYyyy = wmsUpdYyyy;
    }

    /**
     * [get] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @return The value of the column 'WMS_UPD_MM'. (NullAllowed)
     */
    public String getWmsUpdMm() {
        return _wmsUpdMm;
    }

    /**
     * [set] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @param wmsUpdMm The value of the column 'WMS_UPD_MM'. (NullAllowed)
     */
    public void setWmsUpdMm(String wmsUpdMm) {
        __modifiedProperties.add("wmsUpdMm");
        this._wmsUpdMm = wmsUpdMm;
    }

    /**
     * [get] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @return The value of the column 'WMS_UPD_DD'. (NullAllowed)
     */
    public String getWmsUpdDd() {
        return _wmsUpdDd;
    }

    /**
     * [set] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @param wmsUpdDd The value of the column 'WMS_UPD_DD'. (NullAllowed)
     */
    public void setWmsUpdDd(String wmsUpdDd) {
        __modifiedProperties.add("wmsUpdDd");
        this._wmsUpdDd = wmsUpdDd;
    }

    /**
     * [get] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @return The value of the column 'WMS_UPD_HH'. (NullAllowed)
     */
    public String getWmsUpdHh() {
        return _wmsUpdHh;
    }

    /**
     * [set] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @param wmsUpdHh The value of the column 'WMS_UPD_HH'. (NullAllowed)
     */
    public void setWmsUpdHh(String wmsUpdHh) {
        __modifiedProperties.add("wmsUpdHh");
        this._wmsUpdHh = wmsUpdHh;
    }

    /**
     * [get] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @return The value of the column 'WMS_UPD_MI'. (NullAllowed)
     */
    public String getWmsUpdMi() {
        return _wmsUpdMi;
    }

    /**
     * [set] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @param wmsUpdMi The value of the column 'WMS_UPD_MI'. (NullAllowed)
     */
    public void setWmsUpdMi(String wmsUpdMi) {
        __modifiedProperties.add("wmsUpdMi");
        this._wmsUpdMi = wmsUpdMi;
    }

    /**
     * [get] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @return The value of the column 'WMS_UPD_SS'. (NullAllowed)
     */
    public String getWmsUpdSs() {
        return _wmsUpdSs;
    }

    /**
     * [set] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @param wmsUpdSs The value of the column 'WMS_UPD_SS'. (NullAllowed)
     */
    public void setWmsUpdSs(String wmsUpdSs) {
        __modifiedProperties.add("wmsUpdSs");
        this._wmsUpdSs = wmsUpdSs;
    }

    /**
     * [get] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @return The value of the column 'WMS_UPD_USER_CD'. (NullAllowed)
     */
    public String getWmsUpdUserCd() {
        return _wmsUpdUserCd;
    }

    /**
     * [set] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @param wmsUpdUserCd The value of the column 'WMS_UPD_USER_CD'. (NullAllowed)
     */
    public void setWmsUpdUserCd(String wmsUpdUserCd) {
        __modifiedProperties.add("wmsUpdUserCd");
        this._wmsUpdUserCd = wmsUpdUserCd;
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
