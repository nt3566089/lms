package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of er_stock_record as TABLE. <br>
 * 在庫実績受信テーブル
 * <pre>
 * [primary-key]
 *     STOCK_RECORD_ID
 *
 * [column]
 *     STOCK_RECORD_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, PLANT_CD, STORAGE_SPACE_CD, REFERENCE_DT, HINMOKU_CD, STOCK_NUM, PRODUCT_NM_KANJI, BARCODE, DEPOSIT_JAN_CD, TENHANSHA_CD, SALES_ORG_CD, TENHANSHA_NM1, TENHANSHA_NM2, SAP_USER_CD, SAP_USER_NM, ALLOC_TYPE_CD, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsErStockRecordDto implements Serializable {

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
    /** STOCK_RECORD_ID: {PK, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _stockRecordId;

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

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _errorMessageCd;

    /** PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storageSpaceCd;

    /** REFERENCE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _referenceDt;

    /** HINMOKU_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _hinmokuCd;

    /** STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _stockNum;

    /** PRODUCT_NM_KANJI: {VARCHAR(60)} */
    @JsonKey
    protected String _productNmKanji;

    /** BARCODE: {VARCHAR(30)} */
    @JsonKey
    protected String _barcode;

    /** DEPOSIT_JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _depositJanCd;

    /** TENHANSHA_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _tenhanshaCd;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** TENHANSHA_NM1: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm1;

    /** TENHANSHA_NM2: {VARCHAR(60)} */
    @JsonKey
    protected String _tenhanshaNm2;

    /** SAP_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUserCd;

    /** SAP_USER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _sapUserNm;

    /** ALLOC_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _allocTypeCd;

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
    public BsErStockRecordDto() {
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
        if (other == null || !(other instanceof BsErStockRecordDto)) { return false; }
        final BsErStockRecordDto otherEntity = (BsErStockRecordDto)other;
        if (!helpComparingValue(getStockRecordId(), otherEntity.getStockRecordId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "er_stock_record");
        result = xCH(result, getStockRecordId());
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
        sb.append(c).append(getStockRecordId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getPlantCd());
        sb.append(c).append(getStorageSpaceCd());
        sb.append(c).append(getReferenceDt());
        sb.append(c).append(getHinmokuCd());
        sb.append(c).append(getStockNum());
        sb.append(c).append(getProductNmKanji());
        sb.append(c).append(getBarcode());
        sb.append(c).append(getDepositJanCd());
        sb.append(c).append(getTenhanshaCd());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getTenhanshaNm1());
        sb.append(c).append(getTenhanshaNm2());
        sb.append(c).append(getSapUserCd());
        sb.append(c).append(getSapUserNm());
        sb.append(c).append(getAllocTypeCd());
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
     * [get] STOCK_RECORD_ID: {PK, NotNull, BIGINT(19)} <br>
     * 在庫実績受信ID
     * @return The value of the column 'STOCK_RECORD_ID'. (NullAllowed)
     */
    public Long getStockRecordId() {
        return _stockRecordId;
    }

    /**
     * [set] STOCK_RECORD_ID: {PK, NotNull, BIGINT(19)} <br>
     * 在庫実績受信ID
     * @param stockRecordId The value of the column 'STOCK_RECORD_ID'. (NullAllowed)
     */
    public void setStockRecordId(Long stockRecordId) {
        __modifiedProperties.add("stockRecordId");
        this._stockRecordId = stockRecordId;
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
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public String getPlantCd() {
        return _plantCd;
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public void setPlantCd(String plantCd) {
        __modifiedProperties.add("plantCd");
        this._plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStorageSpaceCd() {
        return _storageSpaceCd;
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        __modifiedProperties.add("storageSpaceCd");
        this._storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @return The value of the column 'REFERENCE_DT'. (NullAllowed)
     */
    public String getReferenceDt() {
        return _referenceDt;
    }

    /**
     * [set] REFERENCE_DT: {VARCHAR(8)} <br>
     * 基準日
     * @param referenceDt The value of the column 'REFERENCE_DT'. (NullAllowed)
     */
    public void setReferenceDt(String referenceDt) {
        __modifiedProperties.add("referenceDt");
        this._referenceDt = referenceDt;
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
     * [get] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @return The value of the column 'STOCK_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getStockNum() {
        return _stockNum;
    }

    /**
     * [set] STOCK_NUM: {DECIMAL(14, 4), default=[0.0000]} <br>
     * 在庫数量
     * @param stockNum The value of the column 'STOCK_NUM'. (NullAllowed)
     */
    public void setStockNum(java.math.BigDecimal stockNum) {
        __modifiedProperties.add("stockNum");
        this._stockNum = stockNum;
    }

    /**
     * [get] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @return The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public String getProductNmKanji() {
        return _productNmKanji;
    }

    /**
     * [set] PRODUCT_NM_KANJI: {VARCHAR(60)} <br>
     * 品名漢字
     * @param productNmKanji The value of the column 'PRODUCT_NM_KANJI'. (NullAllowed)
     */
    public void setProductNmKanji(String productNmKanji) {
        __modifiedProperties.add("productNmKanji");
        this._productNmKanji = productNmKanji;
    }

    /**
     * [get] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @return The value of the column 'BARCODE'. (NullAllowed)
     */
    public String getBarcode() {
        return _barcode;
    }

    /**
     * [set] BARCODE: {VARCHAR(30)} <br>
     * バーコード
     * @param barcode The value of the column 'BARCODE'. (NullAllowed)
     */
    public void setBarcode(String barcode) {
        __modifiedProperties.add("barcode");
        this._barcode = barcode;
    }

    /**
     * [get] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @return The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public String getDepositJanCd() {
        return _depositJanCd;
    }

    /**
     * [set] DEPOSIT_JAN_CD: {VARCHAR(30)} <br>
     * 預かりJANCD
     * @param depositJanCd The value of the column 'DEPOSIT_JAN_CD'. (NullAllowed)
     */
    public void setDepositJanCd(String depositJanCd) {
        __modifiedProperties.add("depositJanCd");
        this._depositJanCd = depositJanCd;
    }

    /**
     * [get] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @return The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public String getTenhanshaCd() {
        return _tenhanshaCd;
    }

    /**
     * [set] TENHANSHA_CD: {VARCHAR(30)} <br>
     * 店販社CD
     * @param tenhanshaCd The value of the column 'TENHANSHA_CD'. (NullAllowed)
     */
    public void setTenhanshaCd(String tenhanshaCd) {
        __modifiedProperties.add("tenhanshaCd");
        this._tenhanshaCd = tenhanshaCd;
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
     * [get] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @return The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public String getTenhanshaNm1() {
        return _tenhanshaNm1;
    }

    /**
     * [set] TENHANSHA_NM1: {VARCHAR(60)} <br>
     * 店販社名1
     * @param tenhanshaNm1 The value of the column 'TENHANSHA_NM1'. (NullAllowed)
     */
    public void setTenhanshaNm1(String tenhanshaNm1) {
        __modifiedProperties.add("tenhanshaNm1");
        this._tenhanshaNm1 = tenhanshaNm1;
    }

    /**
     * [get] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @return The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public String getTenhanshaNm2() {
        return _tenhanshaNm2;
    }

    /**
     * [set] TENHANSHA_NM2: {VARCHAR(60)} <br>
     * 店販社名2
     * @param tenhanshaNm2 The value of the column 'TENHANSHA_NM2'. (NullAllowed)
     */
    public void setTenhanshaNm2(String tenhanshaNm2) {
        __modifiedProperties.add("tenhanshaNm2");
        this._tenhanshaNm2 = tenhanshaNm2;
    }

    /**
     * [get] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @return The value of the column 'SAP_USER_CD'. (NullAllowed)
     */
    public String getSapUserCd() {
        return _sapUserCd;
    }

    /**
     * [set] SAP_USER_CD: {VARCHAR(30)} <br>
     * SAPユーザCD
     * @param sapUserCd The value of the column 'SAP_USER_CD'. (NullAllowed)
     */
    public void setSapUserCd(String sapUserCd) {
        __modifiedProperties.add("sapUserCd");
        this._sapUserCd = sapUserCd;
    }

    /**
     * [get] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @return The value of the column 'SAP_USER_NM'. (NullAllowed)
     */
    public String getSapUserNm() {
        return _sapUserNm;
    }

    /**
     * [set] SAP_USER_NM: {VARCHAR(60)} <br>
     * SAPユーザ名称
     * @param sapUserNm The value of the column 'SAP_USER_NM'. (NullAllowed)
     */
    public void setSapUserNm(String sapUserNm) {
        __modifiedProperties.add("sapUserNm");
        this._sapUserNm = sapUserNm;
    }

    /**
     * [get] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @return The value of the column 'ALLOC_TYPE_CD'. (NullAllowed)
     */
    public String getAllocTypeCd() {
        return _allocTypeCd;
    }

    /**
     * [set] ALLOC_TYPE_CD: {VARCHAR(30)} <br>
     * 引当区分
     * @param allocTypeCd The value of the column 'ALLOC_TYPE_CD'. (NullAllowed)
     */
    public void setAllocTypeCd(String allocTypeCd) {
        __modifiedProperties.add("allocTypeCd");
        this._allocTypeCd = allocTypeCd;
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
