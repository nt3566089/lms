package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of er_transfer_report as TABLE. <br>
 * 振替受信テーブル
 * <pre>
 * [primary-key]
 *     TRANSFER_REPORT_ID
 *
 * [column]
 *     TRANSFER_REPORT_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, HINMOKU_CD, STOCK_TRANSFER_DT, RECEIVE_PLANT_CD, RECEIVE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSFER_TYPE_CD, NUM, HINMOKU_GROUP, JAN_CD, PRODUCT_NM, S4_SEND_FLG, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsErTransferReportDto implements Serializable {

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
    /** TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _transferReportId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _errorMessageCd;

    /** HINMOKU_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuCd;

    /** STOCK_TRANSFER_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _stockTransferDt;

    /** RECEIVE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _receivePlantCd;

    /** RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** TRANSFER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transferTypeCd;

    /** NUM: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _num;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** S4_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _s4SendFlg;

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

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr03;

    /** DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr04;

    /** DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr05;

    /** DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr06;

    /** DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr07;

    /** DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr08;

    /** DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr09;

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
    public BsErTransferReportDto() {
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
        if (other == null || !(other instanceof BsErTransferReportDto)) { return false; }
        final BsErTransferReportDto otherEntity = (BsErTransferReportDto)other;
        if (!helpComparingValue(getTransferReportId(), otherEntity.getTransferReportId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "er_transfer_report");
        result = xCH(result, getTransferReportId());
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
        sb.append(c).append(getTransferReportId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getStockTransferDt());
        sb.append(c).append(getReceivePlantCd());
        sb.append(c).append(getReceiveStorageSpaceCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getTransferTypeCd());
        sb.append(c).append(getNum());
        sb.append(c).append(getHinmokuGroup());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getS4SendFlg());
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
        sb.append(c).append(getDataTransferOnlyStr01());
        sb.append(c).append(getDataTransferOnlyStr02());
        sb.append(c).append(getDataTransferOnlyStr03());
        sb.append(c).append(getDataTransferOnlyStr04());
        sb.append(c).append(getDataTransferOnlyStr05());
        sb.append(c).append(getDataTransferOnlyStr06());
        sb.append(c).append(getDataTransferOnlyStr07());
        sb.append(c).append(getDataTransferOnlyStr08());
        sb.append(c).append(getDataTransferOnlyStr09());
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
     * [get] TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)} <br>
     * 振替受信ID
     * @return The value of the column 'TRANSFER_REPORT_ID'. (NullAllowed)
     */
    public Long getTransferReportId() {
        return _transferReportId;
    }

    /**
     * [set] TRANSFER_REPORT_ID: {PK, NotNull, BIGINT(19)} <br>
     * 振替受信ID
     * @param transferReportId The value of the column 'TRANSFER_REPORT_ID'. (NullAllowed)
     */
    public void setTransferReportId(Long transferReportId) {
        __modifiedProperties.add("transferReportId");
        this._transferReportId = transferReportId;
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
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
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
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public String getHinmokuCd() {
        return _hinmokuCd;
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目コード
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed)
     */
    public void setHinmokuCd(String hinmokuCd) {
        __modifiedProperties.add("hinmokuCd");
        this._hinmokuCd = hinmokuCd;
    }

    /**
     * [get] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日_年月日
     * @return The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed)
     */
    public String getStockTransferDt() {
        return _stockTransferDt;
    }

    /**
     * [set] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日_年月日
     * @param stockTransferDt The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed)
     */
    public void setStockTransferDt(String stockTransferDt) {
        __modifiedProperties.add("stockTransferDt");
        this._stockTransferDt = stockTransferDt;
    }

    /**
     * [get] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed)
     */
    public String getReceivePlantCd() {
        return _receivePlantCd;
    }

    /**
     * [set] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param receivePlantCd The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed)
     */
    public void setReceivePlantCd(String receivePlantCd) {
        __modifiedProperties.add("receivePlantCd");
        this._receivePlantCd = receivePlantCd;
    }

    /**
     * [get] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getReceiveStorageSpaceCd() {
        return _receiveStorageSpaceCd;
    }

    /**
     * [set] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param receiveStorageSpaceCd The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setReceiveStorageSpaceCd(String receiveStorageSpaceCd) {
        __modifiedProperties.add("receiveStorageSpaceCd");
        this._receiveStorageSpaceCd = receiveStorageSpaceCd;
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
     * [get] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @return The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public String getTransferTypeCd() {
        return _transferTypeCd;
    }

    /**
     * [set] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @param transferTypeCd The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public void setTransferTypeCd(String transferTypeCd) {
        __modifiedProperties.add("transferTypeCd");
        this._transferTypeCd = transferTypeCd;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getNum() {
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(java.math.BigDecimal num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public String getHinmokuGroup() {
        return _hinmokuGroup;
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        __modifiedProperties.add("hinmokuGroup");
        this._hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
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
     * [get] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public String getS4SendFlg() {
        return _s4SendFlg;
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public void setS4SendFlg(String s4SendFlg) {
        __modifiedProperties.add("s4SendFlg");
        this._s4SendFlg = s4SendFlg;
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
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 担当者
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public String getDataTransferOnlyStr01() {
        return _dataTransferOnlyStr01;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 担当者
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        __modifiedProperties.add("dataTransferOnlyStr01");
        this._dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 更新フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public String getDataTransferOnlyStr02() {
        return _dataTransferOnlyStr02;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 更新フラグ
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        __modifiedProperties.add("dataTransferOnlyStr02");
        this._dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * 入荷日
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public String getDataTransferOnlyStr03() {
        return _dataTransferOnlyStr03;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(30)} <br>
     * 入荷日
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        __modifiedProperties.add("dataTransferOnlyStr03");
        this._dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)} <br>
     * 単位コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public String getDataTransferOnlyStr04() {
        return _dataTransferOnlyStr04;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR04: {VARCHAR(30)} <br>
     * 単位コード
     * @param dataTransferOnlyStr04 The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public void setDataTransferOnlyStr04(String dataTransferOnlyStr04) {
        __modifiedProperties.add("dataTransferOnlyStr04");
        this._dataTransferOnlyStr04 = dataTransferOnlyStr04;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)} <br>
     * 単位コード名称
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public String getDataTransferOnlyStr05() {
        return _dataTransferOnlyStr05;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR05: {VARCHAR(30)} <br>
     * 単位コード名称
     * @param dataTransferOnlyStr05 The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public void setDataTransferOnlyStr05(String dataTransferOnlyStr05) {
        __modifiedProperties.add("dataTransferOnlyStr05");
        this._dataTransferOnlyStr05 = dataTransferOnlyStr05;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号1
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public String getDataTransferOnlyStr06() {
        return _dataTransferOnlyStr06;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号1
     * @param dataTransferOnlyStr06 The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public void setDataTransferOnlyStr06(String dataTransferOnlyStr06) {
        __modifiedProperties.add("dataTransferOnlyStr06");
        this._dataTransferOnlyStr06 = dataTransferOnlyStr06;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * 端末番号2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public String getDataTransferOnlyStr07() {
        return _dataTransferOnlyStr07;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * 端末番号2
     * @param dataTransferOnlyStr07 The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public void setDataTransferOnlyStr07(String dataTransferOnlyStr07) {
        __modifiedProperties.add("dataTransferOnlyStr07");
        this._dataTransferOnlyStr07 = dataTransferOnlyStr07;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * 棚卸フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public String getDataTransferOnlyStr08() {
        return _dataTransferOnlyStr08;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * 棚卸フラグ
     * @param dataTransferOnlyStr08 The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public void setDataTransferOnlyStr08(String dataTransferOnlyStr08) {
        __modifiedProperties.add("dataTransferOnlyStr08");
        this._dataTransferOnlyStr08 = dataTransferOnlyStr08;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 入出庫番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public String getDataTransferOnlyStr09() {
        return _dataTransferOnlyStr09;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 入出庫番号
     * @param dataTransferOnlyStr09 The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public void setDataTransferOnlyStr09(String dataTransferOnlyStr09) {
        __modifiedProperties.add("dataTransferOnlyStr09");
        this._dataTransferOnlyStr09 = dataTransferOnlyStr09;
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
