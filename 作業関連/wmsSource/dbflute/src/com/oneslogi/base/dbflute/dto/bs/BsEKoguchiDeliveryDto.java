package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of e_koguchi_delivery as TABLE. <br>
 * 戸口配送マスタ受信テーブル
 * <pre>
 * [primary-key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, RECEIVE_CD, RECEIVE_ROW_ID, RECEIVE_FLG, ERROR_FLG, ERROR_MESSAGE_CD, BASE_CD, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, SAP_ADD_YYYY, SAP_ADD_MM, SAP_ADD_DD, SAP_ADD_HH, SAP_ADD_MI, SAP_ADD_SS, SAP_ADD_USER_CD, SAP_UPD_YYYY, SAP_UPD_MM, SAP_UPD_DD, SAP_UPD_HH, SAP_UPD_MI, SAP_UPD_SS, SAP_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     KOGUCHI_DELIVERY_ID
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
public abstract class BsEKoguchiDeliveryDto implements Serializable {

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
    /** KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _koguchiDeliveryId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receiveRowId;

    /** RECEIVE_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _receiveFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _errorMessageCd;

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

    /** SERV_SALES_ORG_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _servSalesOrgCd;

    /** SERV_SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _servSalesOrgNm;

    /** DIRECT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _directFlg;

    /** URGENT_FLG: {CHAR(1)} */
    @JsonKey
    protected String _urgentFlg;

    /** DELIVERY_FLG: {CHAR(1)} */
    @JsonKey
    protected String _deliveryFlg;

    /** KOGUCHI_DELIVERY_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _koguchiDeliveryCd;

    /** KOGUCHI_DELIVERY_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _koguchiDeliveryNm;

    /** UNI_DELIVERY_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _uniDeliveryCd;

    /** UNI_DELIVERY_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _uniDeliveryNm;

    /** FW_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _fwTypeCd;

    /** MCA_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _mcaTypeCd;

    /** YOUHIN_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _youhinTypeCd;

    /** REQ_SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _reqSalesOrgCd;

    /** REQ_SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _reqSalesOrgNm;

    /** REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _reqSalesOrgBranchNm;

    /** REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} */
    @JsonKey
    protected String _reqSalesOrgAddress1;

    /** REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} */
    @JsonKey
    protected String _reqSalesOrgAddress2;

    /** REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _reqSalesOrgZipCd;

    /** REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _reqSalesOrgTelNo;

    /** REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _reqSalesOrgFaxNo;

    /** REMARK1: {VARCHAR(255)} */
    @JsonKey
    protected String _remark1;

    /** REMARK2: {VARCHAR(255)} */
    @JsonKey
    protected String _remark2;

    /** REMARK3: {VARCHAR(255)} */
    @JsonKey
    protected String _remark3;

    /** REMARK4: {VARCHAR(255)} */
    @JsonKey
    protected String _remark4;

    /** INDV_OUT: {VARCHAR(30)} */
    @JsonKey
    protected String _indvOut;

    /** INVOICE_SUMMARY: {VARCHAR(255)} */
    @JsonKey
    protected String _invoiceSummary;

    /** PSAM: {VARCHAR(30)} */
    @JsonKey
    protected String _psam;

    /** ABOLISH_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _abolishDt;

    /** FLOOR_COMP_FLG: {CHAR(1)} */
    @JsonKey
    protected String _floorCompFlg;

    /** SAP_ADD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddYyyy;

    /** SAP_ADD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMm;

    /** SAP_ADD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddDd;

    /** SAP_ADD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddHh;

    /** SAP_ADD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddMi;

    /** SAP_ADD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddSs;

    /** SAP_ADD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapAddUserCd;

    /** SAP_UPD_YYYY: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdYyyy;

    /** SAP_UPD_MM: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMm;

    /** SAP_UPD_DD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdDd;

    /** SAP_UPD_HH: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdHh;

    /** SAP_UPD_MI: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdMi;

    /** SAP_UPD_SS: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdSs;

    /** SAP_UPD_USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _sapUpdUserCd;

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
    public BsEKoguchiDeliveryDto() {
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
        if (other == null || !(other instanceof BsEKoguchiDeliveryDto)) { return false; }
        final BsEKoguchiDeliveryDto otherEntity = (BsEKoguchiDeliveryDto)other;
        if (!helpComparingValue(getKoguchiDeliveryId(), otherEntity.getKoguchiDeliveryId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "e_koguchi_delivery");
        result = xCH(result, getKoguchiDeliveryId());
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
        sb.append(c).append(getKoguchiDeliveryId());
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getReceiveFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        sb.append(c).append(getBaseCd());
        sb.append(c).append(getServSalesOrgCd());
        sb.append(c).append(getServSalesOrgNm());
        sb.append(c).append(getDirectFlg());
        sb.append(c).append(getUrgentFlg());
        sb.append(c).append(getDeliveryFlg());
        sb.append(c).append(getKoguchiDeliveryCd());
        sb.append(c).append(getKoguchiDeliveryNm());
        sb.append(c).append(getUniDeliveryCd());
        sb.append(c).append(getUniDeliveryNm());
        sb.append(c).append(getFwTypeCd());
        sb.append(c).append(getMcaTypeCd());
        sb.append(c).append(getYouhinTypeCd());
        sb.append(c).append(getReqSalesOrgCd());
        sb.append(c).append(getReqSalesOrgNm());
        sb.append(c).append(getReqSalesOrgBranchNm());
        sb.append(c).append(getReqSalesOrgAddress1());
        sb.append(c).append(getReqSalesOrgAddress2());
        sb.append(c).append(getReqSalesOrgZipCd());
        sb.append(c).append(getReqSalesOrgTelNo());
        sb.append(c).append(getReqSalesOrgFaxNo());
        sb.append(c).append(getRemark1());
        sb.append(c).append(getRemark2());
        sb.append(c).append(getRemark3());
        sb.append(c).append(getRemark4());
        sb.append(c).append(getIndvOut());
        sb.append(c).append(getInvoiceSummary());
        sb.append(c).append(getPsam());
        sb.append(c).append(getAbolishDt());
        sb.append(c).append(getFloorCompFlg());
        sb.append(c).append(getSapAddYyyy());
        sb.append(c).append(getSapAddMm());
        sb.append(c).append(getSapAddDd());
        sb.append(c).append(getSapAddHh());
        sb.append(c).append(getSapAddMi());
        sb.append(c).append(getSapAddSs());
        sb.append(c).append(getSapAddUserCd());
        sb.append(c).append(getSapUpdYyyy());
        sb.append(c).append(getSapUpdMm());
        sb.append(c).append(getSapUpdDd());
        sb.append(c).append(getSapUpdHh());
        sb.append(c).append(getSapUpdMi());
        sb.append(c).append(getSapUpdSs());
        sb.append(c).append(getSapUpdUserCd());
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
     * [get] KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 戸口配送マスタ受信ID
     * @return The value of the column 'KOGUCHI_DELIVERY_ID'. (NullAllowed)
     */
    public Long getKoguchiDeliveryId() {
        return _koguchiDeliveryId;
    }

    /**
     * [set] KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 戸口配送マスタ受信ID
     * @param koguchiDeliveryId The value of the column 'KOGUCHI_DELIVERY_ID'. (NullAllowed)
     */
    public void setKoguchiDeliveryId(Long koguchiDeliveryId) {
        __modifiedProperties.add("koguchiDeliveryId");
        this._koguchiDeliveryId = koguchiDeliveryId;
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
     * [get] RECEIVE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'RECEIVE_FLG'. (NullAllowed)
     */
    public String getReceiveFlg() {
        return _receiveFlg;
    }

    /**
     * [set] RECEIVE_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param receiveFlg The value of the column 'RECEIVE_FLG'. (NullAllowed)
     */
    public void setReceiveFlg(String receiveFlg) {
        __modifiedProperties.add("receiveFlg");
        this._receiveFlg = receiveFlg;
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
     * [get] SERV_SALES_ORG_CD: {VARCHAR(100)} <br>
     * 取扱販売組織CD
     * @return The value of the column 'SERV_SALES_ORG_CD'. (NullAllowed)
     */
    public String getServSalesOrgCd() {
        return _servSalesOrgCd;
    }

    /**
     * [set] SERV_SALES_ORG_CD: {VARCHAR(100)} <br>
     * 取扱販売組織CD
     * @param servSalesOrgCd The value of the column 'SERV_SALES_ORG_CD'. (NullAllowed)
     */
    public void setServSalesOrgCd(String servSalesOrgCd) {
        __modifiedProperties.add("servSalesOrgCd");
        this._servSalesOrgCd = servSalesOrgCd;
    }

    /**
     * [get] SERV_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 取扱販売組織名称
     * @return The value of the column 'SERV_SALES_ORG_NM'. (NullAllowed)
     */
    public String getServSalesOrgNm() {
        return _servSalesOrgNm;
    }

    /**
     * [set] SERV_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 取扱販売組織名称
     * @param servSalesOrgNm The value of the column 'SERV_SALES_ORG_NM'. (NullAllowed)
     */
    public void setServSalesOrgNm(String servSalesOrgNm) {
        __modifiedProperties.add("servSalesOrgNm");
        this._servSalesOrgNm = servSalesOrgNm;
    }

    /**
     * [get] DIRECT_FLG: {CHAR(1)} <br>
     * 直送フラグ
     * @return The value of the column 'DIRECT_FLG'. (NullAllowed)
     */
    public String getDirectFlg() {
        return _directFlg;
    }

    /**
     * [set] DIRECT_FLG: {CHAR(1)} <br>
     * 直送フラグ
     * @param directFlg The value of the column 'DIRECT_FLG'. (NullAllowed)
     */
    public void setDirectFlg(String directFlg) {
        __modifiedProperties.add("directFlg");
        this._directFlg = directFlg;
    }

    /**
     * [get] URGENT_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @return The value of the column 'URGENT_FLG'. (NullAllowed)
     */
    public String getUrgentFlg() {
        return _urgentFlg;
    }

    /**
     * [set] URGENT_FLG: {CHAR(1)} <br>
     * 緊急フラグ
     * @param urgentFlg The value of the column 'URGENT_FLG'. (NullAllowed)
     */
    public void setUrgentFlg(String urgentFlg) {
        __modifiedProperties.add("urgentFlg");
        this._urgentFlg = urgentFlg;
    }

    /**
     * [get] DELIVERY_FLG: {CHAR(1)} <br>
     * 納品フラグ
     * @return The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public String getDeliveryFlg() {
        return _deliveryFlg;
    }

    /**
     * [set] DELIVERY_FLG: {CHAR(1)} <br>
     * 納品フラグ
     * @param deliveryFlg The value of the column 'DELIVERY_FLG'. (NullAllowed)
     */
    public void setDeliveryFlg(String deliveryFlg) {
        __modifiedProperties.add("deliveryFlg");
        this._deliveryFlg = deliveryFlg;
    }

    /**
     * [get] KOGUCHI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 戸口配送先CD
     * @return The value of the column 'KOGUCHI_DELIVERY_CD'. (NullAllowed)
     */
    public String getKoguchiDeliveryCd() {
        return _koguchiDeliveryCd;
    }

    /**
     * [set] KOGUCHI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 戸口配送先CD
     * @param koguchiDeliveryCd The value of the column 'KOGUCHI_DELIVERY_CD'. (NullAllowed)
     */
    public void setKoguchiDeliveryCd(String koguchiDeliveryCd) {
        __modifiedProperties.add("koguchiDeliveryCd");
        this._koguchiDeliveryCd = koguchiDeliveryCd;
    }

    /**
     * [get] KOGUCHI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 戸口配送先名称
     * @return The value of the column 'KOGUCHI_DELIVERY_NM'. (NullAllowed)
     */
    public String getKoguchiDeliveryNm() {
        return _koguchiDeliveryNm;
    }

    /**
     * [set] KOGUCHI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 戸口配送先名称
     * @param koguchiDeliveryNm The value of the column 'KOGUCHI_DELIVERY_NM'. (NullAllowed)
     */
    public void setKoguchiDeliveryNm(String koguchiDeliveryNm) {
        __modifiedProperties.add("koguchiDeliveryNm");
        this._koguchiDeliveryNm = koguchiDeliveryNm;
    }

    /**
     * [get] UNI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 統合配送先CD
     * @return The value of the column 'UNI_DELIVERY_CD'. (NullAllowed)
     */
    public String getUniDeliveryCd() {
        return _uniDeliveryCd;
    }

    /**
     * [set] UNI_DELIVERY_CD: {VARCHAR(30)} <br>
     * 統合配送先CD
     * @param uniDeliveryCd The value of the column 'UNI_DELIVERY_CD'. (NullAllowed)
     */
    public void setUniDeliveryCd(String uniDeliveryCd) {
        __modifiedProperties.add("uniDeliveryCd");
        this._uniDeliveryCd = uniDeliveryCd;
    }

    /**
     * [get] UNI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 統合配送先名称
     * @return The value of the column 'UNI_DELIVERY_NM'. (NullAllowed)
     */
    public String getUniDeliveryNm() {
        return _uniDeliveryNm;
    }

    /**
     * [set] UNI_DELIVERY_NM: {VARCHAR(60)} <br>
     * 統合配送先名称
     * @param uniDeliveryNm The value of the column 'UNI_DELIVERY_NM'. (NullAllowed)
     */
    public void setUniDeliveryNm(String uniDeliveryNm) {
        __modifiedProperties.add("uniDeliveryNm");
        this._uniDeliveryNm = uniDeliveryNm;
    }

    /**
     * [get] FW_TYPE_CD: {VARCHAR(30)} <br>
     * FW区分
     * @return The value of the column 'FW_TYPE_CD'. (NullAllowed)
     */
    public String getFwTypeCd() {
        return _fwTypeCd;
    }

    /**
     * [set] FW_TYPE_CD: {VARCHAR(30)} <br>
     * FW区分
     * @param fwTypeCd The value of the column 'FW_TYPE_CD'. (NullAllowed)
     */
    public void setFwTypeCd(String fwTypeCd) {
        __modifiedProperties.add("fwTypeCd");
        this._fwTypeCd = fwTypeCd;
    }

    /**
     * [get] MCA_TYPE_CD: {VARCHAR(30)} <br>
     * MCA区分
     * @return The value of the column 'MCA_TYPE_CD'. (NullAllowed)
     */
    public String getMcaTypeCd() {
        return _mcaTypeCd;
    }

    /**
     * [set] MCA_TYPE_CD: {VARCHAR(30)} <br>
     * MCA区分
     * @param mcaTypeCd The value of the column 'MCA_TYPE_CD'. (NullAllowed)
     */
    public void setMcaTypeCd(String mcaTypeCd) {
        __modifiedProperties.add("mcaTypeCd");
        this._mcaTypeCd = mcaTypeCd;
    }

    /**
     * [get] YOUHIN_TYPE_CD: {VARCHAR(30)} <br>
     * 用品区分
     * @return The value of the column 'YOUHIN_TYPE_CD'. (NullAllowed)
     */
    public String getYouhinTypeCd() {
        return _youhinTypeCd;
    }

    /**
     * [set] YOUHIN_TYPE_CD: {VARCHAR(30)} <br>
     * 用品区分
     * @param youhinTypeCd The value of the column 'YOUHIN_TYPE_CD'. (NullAllowed)
     */
    public void setYouhinTypeCd(String youhinTypeCd) {
        __modifiedProperties.add("youhinTypeCd");
        this._youhinTypeCd = youhinTypeCd;
    }

    /**
     * [get] REQ_SALES_ORG_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織CD
     * @return The value of the column 'REQ_SALES_ORG_CD'. (NullAllowed)
     */
    public String getReqSalesOrgCd() {
        return _reqSalesOrgCd;
    }

    /**
     * [set] REQ_SALES_ORG_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織CD
     * @param reqSalesOrgCd The value of the column 'REQ_SALES_ORG_CD'. (NullAllowed)
     */
    public void setReqSalesOrgCd(String reqSalesOrgCd) {
        __modifiedProperties.add("reqSalesOrgCd");
        this._reqSalesOrgCd = reqSalesOrgCd;
    }

    /**
     * [get] REQ_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織名称
     * @return The value of the column 'REQ_SALES_ORG_NM'. (NullAllowed)
     */
    public String getReqSalesOrgNm() {
        return _reqSalesOrgNm;
    }

    /**
     * [set] REQ_SALES_ORG_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織名称
     * @param reqSalesOrgNm The value of the column 'REQ_SALES_ORG_NM'. (NullAllowed)
     */
    public void setReqSalesOrgNm(String reqSalesOrgNm) {
        __modifiedProperties.add("reqSalesOrgNm");
        this._reqSalesOrgNm = reqSalesOrgNm;
    }

    /**
     * [get] REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織支店名称
     * @return The value of the column 'REQ_SALES_ORG_BRANCH_NM'. (NullAllowed)
     */
    public String getReqSalesOrgBranchNm() {
        return _reqSalesOrgBranchNm;
    }

    /**
     * [set] REQ_SALES_ORG_BRANCH_NM: {VARCHAR(60)} <br>
     * 依頼元販売組織支店名称
     * @param reqSalesOrgBranchNm The value of the column 'REQ_SALES_ORG_BRANCH_NM'. (NullAllowed)
     */
    public void setReqSalesOrgBranchNm(String reqSalesOrgBranchNm) {
        __modifiedProperties.add("reqSalesOrgBranchNm");
        this._reqSalesOrgBranchNm = reqSalesOrgBranchNm;
    }

    /**
     * [get] REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} <br>
     * 依頼元販売組織住所１
     * @return The value of the column 'REQ_SALES_ORG_ADDRESS1'. (NullAllowed)
     */
    public String getReqSalesOrgAddress1() {
        return _reqSalesOrgAddress1;
    }

    /**
     * [set] REQ_SALES_ORG_ADDRESS1: {VARCHAR(255)} <br>
     * 依頼元販売組織住所１
     * @param reqSalesOrgAddress1 The value of the column 'REQ_SALES_ORG_ADDRESS1'. (NullAllowed)
     */
    public void setReqSalesOrgAddress1(String reqSalesOrgAddress1) {
        __modifiedProperties.add("reqSalesOrgAddress1");
        this._reqSalesOrgAddress1 = reqSalesOrgAddress1;
    }

    /**
     * [get] REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} <br>
     * 依頼元販売組織住所２
     * @return The value of the column 'REQ_SALES_ORG_ADDRESS2'. (NullAllowed)
     */
    public String getReqSalesOrgAddress2() {
        return _reqSalesOrgAddress2;
    }

    /**
     * [set] REQ_SALES_ORG_ADDRESS2: {VARCHAR(255)} <br>
     * 依頼元販売組織住所２
     * @param reqSalesOrgAddress2 The value of the column 'REQ_SALES_ORG_ADDRESS2'. (NullAllowed)
     */
    public void setReqSalesOrgAddress2(String reqSalesOrgAddress2) {
        __modifiedProperties.add("reqSalesOrgAddress2");
        this._reqSalesOrgAddress2 = reqSalesOrgAddress2;
    }

    /**
     * [get] REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織郵便番号
     * @return The value of the column 'REQ_SALES_ORG_ZIP_CD'. (NullAllowed)
     */
    public String getReqSalesOrgZipCd() {
        return _reqSalesOrgZipCd;
    }

    /**
     * [set] REQ_SALES_ORG_ZIP_CD: {VARCHAR(30)} <br>
     * 依頼元販売組織郵便番号
     * @param reqSalesOrgZipCd The value of the column 'REQ_SALES_ORG_ZIP_CD'. (NullAllowed)
     */
    public void setReqSalesOrgZipCd(String reqSalesOrgZipCd) {
        __modifiedProperties.add("reqSalesOrgZipCd");
        this._reqSalesOrgZipCd = reqSalesOrgZipCd;
    }

    /**
     * [get] REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織電話番号
     * @return The value of the column 'REQ_SALES_ORG_TEL_NO'. (NullAllowed)
     */
    public String getReqSalesOrgTelNo() {
        return _reqSalesOrgTelNo;
    }

    /**
     * [set] REQ_SALES_ORG_TEL_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織電話番号
     * @param reqSalesOrgTelNo The value of the column 'REQ_SALES_ORG_TEL_NO'. (NullAllowed)
     */
    public void setReqSalesOrgTelNo(String reqSalesOrgTelNo) {
        __modifiedProperties.add("reqSalesOrgTelNo");
        this._reqSalesOrgTelNo = reqSalesOrgTelNo;
    }

    /**
     * [get] REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織FAX番号
     * @return The value of the column 'REQ_SALES_ORG_FAX_NO'. (NullAllowed)
     */
    public String getReqSalesOrgFaxNo() {
        return _reqSalesOrgFaxNo;
    }

    /**
     * [set] REQ_SALES_ORG_FAX_NO: {VARCHAR(30)} <br>
     * 依頼元販売組織FAX番号
     * @param reqSalesOrgFaxNo The value of the column 'REQ_SALES_ORG_FAX_NO'. (NullAllowed)
     */
    public void setReqSalesOrgFaxNo(String reqSalesOrgFaxNo) {
        __modifiedProperties.add("reqSalesOrgFaxNo");
        this._reqSalesOrgFaxNo = reqSalesOrgFaxNo;
    }

    /**
     * [get] REMARK1: {VARCHAR(255)} <br>
     * 物品送付下部備考項目1
     * @return The value of the column 'REMARK1'. (NullAllowed)
     */
    public String getRemark1() {
        return _remark1;
    }

    /**
     * [set] REMARK1: {VARCHAR(255)} <br>
     * 物品送付下部備考項目1
     * @param remark1 The value of the column 'REMARK1'. (NullAllowed)
     */
    public void setRemark1(String remark1) {
        __modifiedProperties.add("remark1");
        this._remark1 = remark1;
    }

    /**
     * [get] REMARK2: {VARCHAR(255)} <br>
     * 物品送付下部備考項目2
     * @return The value of the column 'REMARK2'. (NullAllowed)
     */
    public String getRemark2() {
        return _remark2;
    }

    /**
     * [set] REMARK2: {VARCHAR(255)} <br>
     * 物品送付下部備考項目2
     * @param remark2 The value of the column 'REMARK2'. (NullAllowed)
     */
    public void setRemark2(String remark2) {
        __modifiedProperties.add("remark2");
        this._remark2 = remark2;
    }

    /**
     * [get] REMARK3: {VARCHAR(255)} <br>
     * 物品送付下部備考項目3
     * @return The value of the column 'REMARK3'. (NullAllowed)
     */
    public String getRemark3() {
        return _remark3;
    }

    /**
     * [set] REMARK3: {VARCHAR(255)} <br>
     * 物品送付下部備考項目3
     * @param remark3 The value of the column 'REMARK3'. (NullAllowed)
     */
    public void setRemark3(String remark3) {
        __modifiedProperties.add("remark3");
        this._remark3 = remark3;
    }

    /**
     * [get] REMARK4: {VARCHAR(255)} <br>
     * 物品送付下部備考項目4
     * @return The value of the column 'REMARK4'. (NullAllowed)
     */
    public String getRemark4() {
        return _remark4;
    }

    /**
     * [set] REMARK4: {VARCHAR(255)} <br>
     * 物品送付下部備考項目4
     * @param remark4 The value of the column 'REMARK4'. (NullAllowed)
     */
    public void setRemark4(String remark4) {
        __modifiedProperties.add("remark4");
        this._remark4 = remark4;
    }

    /**
     * [get] INDV_OUT: {VARCHAR(30)} <br>
     * 個別出力
     * @return The value of the column 'INDV_OUT'. (NullAllowed)
     */
    public String getIndvOut() {
        return _indvOut;
    }

    /**
     * [set] INDV_OUT: {VARCHAR(30)} <br>
     * 個別出力
     * @param indvOut The value of the column 'INDV_OUT'. (NullAllowed)
     */
    public void setIndvOut(String indvOut) {
        __modifiedProperties.add("indvOut");
        this._indvOut = indvOut;
    }

    /**
     * [get] INVOICE_SUMMARY: {VARCHAR(255)} <br>
     * 送り状摘要
     * @return The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public String getInvoiceSummary() {
        return _invoiceSummary;
    }

    /**
     * [set] INVOICE_SUMMARY: {VARCHAR(255)} <br>
     * 送り状摘要
     * @param invoiceSummary The value of the column 'INVOICE_SUMMARY'. (NullAllowed)
     */
    public void setInvoiceSummary(String invoiceSummary) {
        __modifiedProperties.add("invoiceSummary");
        this._invoiceSummary = invoiceSummary;
    }

    /**
     * [get] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @return The value of the column 'PSAM'. (NullAllowed)
     */
    public String getPsam() {
        return _psam;
    }

    /**
     * [set] PSAM: {VARCHAR(30)} <br>
     * PSAM
     * @param psam The value of the column 'PSAM'. (NullAllowed)
     */
    public void setPsam(String psam) {
        __modifiedProperties.add("psam");
        this._psam = psam;
    }

    /**
     * [get] ABOLISH_DT: {VARCHAR(8)} <br>
     * 廃止日
     * @return The value of the column 'ABOLISH_DT'. (NullAllowed)
     */
    public String getAbolishDt() {
        return _abolishDt;
    }

    /**
     * [set] ABOLISH_DT: {VARCHAR(8)} <br>
     * 廃止日
     * @param abolishDt The value of the column 'ABOLISH_DT'. (NullAllowed)
     */
    public void setAbolishDt(String abolishDt) {
        __modifiedProperties.add("abolishDt");
        this._abolishDt = abolishDt;
    }

    /**
     * [get] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @return The value of the column 'FLOOR_COMP_FLG'. (NullAllowed)
     */
    public String getFloorCompFlg() {
        return _floorCompFlg;
    }

    /**
     * [set] FLOOR_COMP_FLG: {CHAR(1)} <br>
     * フロア完結フラグ
     * @param floorCompFlg The value of the column 'FLOOR_COMP_FLG'. (NullAllowed)
     */
    public void setFloorCompFlg(String floorCompFlg) {
        __modifiedProperties.add("floorCompFlg");
        this._floorCompFlg = floorCompFlg;
    }

    /**
     * [get] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @return The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public String getSapAddYyyy() {
        return _sapAddYyyy;
    }

    /**
     * [set] SAP_ADD_YYYY: {VARCHAR(30)} <br>
     * SAP作成日_年
     * @param sapAddYyyy The value of the column 'SAP_ADD_YYYY'. (NullAllowed)
     */
    public void setSapAddYyyy(String sapAddYyyy) {
        __modifiedProperties.add("sapAddYyyy");
        this._sapAddYyyy = sapAddYyyy;
    }

    /**
     * [get] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @return The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public String getSapAddMm() {
        return _sapAddMm;
    }

    /**
     * [set] SAP_ADD_MM: {VARCHAR(30)} <br>
     * SAP作成日_月
     * @param sapAddMm The value of the column 'SAP_ADD_MM'. (NullAllowed)
     */
    public void setSapAddMm(String sapAddMm) {
        __modifiedProperties.add("sapAddMm");
        this._sapAddMm = sapAddMm;
    }

    /**
     * [get] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @return The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public String getSapAddDd() {
        return _sapAddDd;
    }

    /**
     * [set] SAP_ADD_DD: {VARCHAR(30)} <br>
     * SAP作成日_日
     * @param sapAddDd The value of the column 'SAP_ADD_DD'. (NullAllowed)
     */
    public void setSapAddDd(String sapAddDd) {
        __modifiedProperties.add("sapAddDd");
        this._sapAddDd = sapAddDd;
    }

    /**
     * [get] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @return The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public String getSapAddHh() {
        return _sapAddHh;
    }

    /**
     * [set] SAP_ADD_HH: {VARCHAR(30)} <br>
     * SAP作成時間_時
     * @param sapAddHh The value of the column 'SAP_ADD_HH'. (NullAllowed)
     */
    public void setSapAddHh(String sapAddHh) {
        __modifiedProperties.add("sapAddHh");
        this._sapAddHh = sapAddHh;
    }

    /**
     * [get] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @return The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public String getSapAddMi() {
        return _sapAddMi;
    }

    /**
     * [set] SAP_ADD_MI: {VARCHAR(30)} <br>
     * SAP作成時間_分
     * @param sapAddMi The value of the column 'SAP_ADD_MI'. (NullAllowed)
     */
    public void setSapAddMi(String sapAddMi) {
        __modifiedProperties.add("sapAddMi");
        this._sapAddMi = sapAddMi;
    }

    /**
     * [get] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @return The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public String getSapAddSs() {
        return _sapAddSs;
    }

    /**
     * [set] SAP_ADD_SS: {VARCHAR(30)} <br>
     * SAP作成時間_秒
     * @param sapAddSs The value of the column 'SAP_ADD_SS'. (NullAllowed)
     */
    public void setSapAddSs(String sapAddSs) {
        __modifiedProperties.add("sapAddSs");
        this._sapAddSs = sapAddSs;
    }

    /**
     * [get] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @return The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public String getSapAddUserCd() {
        return _sapAddUserCd;
    }

    /**
     * [set] SAP_ADD_USER_CD: {VARCHAR(30)} <br>
     * SAP作成者
     * @param sapAddUserCd The value of the column 'SAP_ADD_USER_CD'. (NullAllowed)
     */
    public void setSapAddUserCd(String sapAddUserCd) {
        __modifiedProperties.add("sapAddUserCd");
        this._sapAddUserCd = sapAddUserCd;
    }

    /**
     * [get] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @return The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public String getSapUpdYyyy() {
        return _sapUpdYyyy;
    }

    /**
     * [set] SAP_UPD_YYYY: {VARCHAR(30)} <br>
     * SAP更新日_年
     * @param sapUpdYyyy The value of the column 'SAP_UPD_YYYY'. (NullAllowed)
     */
    public void setSapUpdYyyy(String sapUpdYyyy) {
        __modifiedProperties.add("sapUpdYyyy");
        this._sapUpdYyyy = sapUpdYyyy;
    }

    /**
     * [get] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @return The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public String getSapUpdMm() {
        return _sapUpdMm;
    }

    /**
     * [set] SAP_UPD_MM: {VARCHAR(30)} <br>
     * SAP更新日_月
     * @param sapUpdMm The value of the column 'SAP_UPD_MM'. (NullAllowed)
     */
    public void setSapUpdMm(String sapUpdMm) {
        __modifiedProperties.add("sapUpdMm");
        this._sapUpdMm = sapUpdMm;
    }

    /**
     * [get] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @return The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public String getSapUpdDd() {
        return _sapUpdDd;
    }

    /**
     * [set] SAP_UPD_DD: {VARCHAR(30)} <br>
     * SAP更新日_日
     * @param sapUpdDd The value of the column 'SAP_UPD_DD'. (NullAllowed)
     */
    public void setSapUpdDd(String sapUpdDd) {
        __modifiedProperties.add("sapUpdDd");
        this._sapUpdDd = sapUpdDd;
    }

    /**
     * [get] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @return The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public String getSapUpdHh() {
        return _sapUpdHh;
    }

    /**
     * [set] SAP_UPD_HH: {VARCHAR(30)} <br>
     * SAP更新時間_時
     * @param sapUpdHh The value of the column 'SAP_UPD_HH'. (NullAllowed)
     */
    public void setSapUpdHh(String sapUpdHh) {
        __modifiedProperties.add("sapUpdHh");
        this._sapUpdHh = sapUpdHh;
    }

    /**
     * [get] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @return The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public String getSapUpdMi() {
        return _sapUpdMi;
    }

    /**
     * [set] SAP_UPD_MI: {VARCHAR(30)} <br>
     * SAP更新時間_分
     * @param sapUpdMi The value of the column 'SAP_UPD_MI'. (NullAllowed)
     */
    public void setSapUpdMi(String sapUpdMi) {
        __modifiedProperties.add("sapUpdMi");
        this._sapUpdMi = sapUpdMi;
    }

    /**
     * [get] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @return The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public String getSapUpdSs() {
        return _sapUpdSs;
    }

    /**
     * [set] SAP_UPD_SS: {VARCHAR(30)} <br>
     * SAP更新時間_秒
     * @param sapUpdSs The value of the column 'SAP_UPD_SS'. (NullAllowed)
     */
    public void setSapUpdSs(String sapUpdSs) {
        __modifiedProperties.add("sapUpdSs");
        this._sapUpdSs = sapUpdSs;
    }

    /**
     * [get] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @return The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public String getSapUpdUserCd() {
        return _sapUpdUserCd;
    }

    /**
     * [set] SAP_UPD_USER_CD: {VARCHAR(30)} <br>
     * SAP更新者
     * @param sapUpdUserCd The value of the column 'SAP_UPD_USER_CD'. (NullAllowed)
     */
    public void setSapUpdUserCd(String sapUpdUserCd) {
        __modifiedProperties.add("sapUpdUserCd");
        this._sapUpdUserCd = sapUpdUserCd;
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
