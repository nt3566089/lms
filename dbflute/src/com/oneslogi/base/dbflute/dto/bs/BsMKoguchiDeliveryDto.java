package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_koguchi_delivery as TABLE. <br>
 * 戸口配送マスタ
 * <pre>
 * [primary-key]
 *     KOGUCHI_DELIVERY_ID
 *
 * [column]
 *     KOGUCHI_DELIVERY_ID, BASE_CD, SERV_SALES_ORG_ID, SERV_SALES_ORG_CD, SERV_SALES_ORG_NM, DIRECT_FLG, URGENT_FLG, DELIVERY_FLG, KOGUCHI_DELIVERY_CD, KOGUCHI_DELIVERY_NM, UNI_DELIVERY_CD, UNI_DELIVERY_NM, FW_TYPE_CD, MCA_TYPE_CD, YOUHIN_TYPE_CD, CARRIER_ID, REQ_SALES_ORG_ID, REQ_SALES_ORG_CD, REQ_SALES_ORG_NM, REQ_SALES_ORG_BRANCH_NM, REQ_SALES_ORG_ADDRESS1, REQ_SALES_ORG_ADDRESS2, REQ_SALES_ORG_ZIP_CD, REQ_SALES_ORG_TEL_NO, REQ_SALES_ORG_FAX_NO, REMARK1, REMARK2, REMARK3, REMARK4, INDV_OUT, INVOICE_SUMMARY, PSAM, ABOLISH_DT, FLOOR_COMP_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
 *     m_sales_org, m_carrier
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mSalesOrg, mCarrier
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMKoguchiDeliveryDto implements Serializable {

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

    /** BASE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _baseCd;

    /** SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} */
    @JsonKey
    protected Long _servSalesOrgId;

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

    /** CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId;

    /** REQ_SALES_ORG_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _reqSalesOrgId;

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
    public BsMKoguchiDeliveryDto() {
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
    protected MSalesOrgDto _mSalesOrg;

    public MSalesOrgDto getMSalesOrg() {
        return _mSalesOrg;
    }

    public void setMSalesOrg(MSalesOrgDto mSalesOrg) {
        this._mSalesOrg = mSalesOrg;
    }

    protected MCarrierDto _mCarrier;

    public MCarrierDto getMCarrier() {
        return _mCarrier;
    }

    public void setMCarrier(MCarrierDto mCarrier) {
        this._mCarrier = mCarrier;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMKoguchiDeliveryDto)) { return false; }
        final BsMKoguchiDeliveryDto otherEntity = (BsMKoguchiDeliveryDto)other;
        if (!helpComparingValue(getKoguchiDeliveryId(), otherEntity.getKoguchiDeliveryId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_koguchi_delivery");
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
        sb.append(c).append(getBaseCd());
        sb.append(c).append(getServSalesOrgId());
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
        sb.append(c).append(getCarrierId());
        sb.append(c).append(getReqSalesOrgId());
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
     * 戸口配送ID
     * @return The value of the column 'KOGUCHI_DELIVERY_ID'. (NullAllowed)
     */
    public Long getKoguchiDeliveryId() {
        return _koguchiDeliveryId;
    }

    /**
     * [set] KOGUCHI_DELIVERY_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 戸口配送ID
     * @param koguchiDeliveryId The value of the column 'KOGUCHI_DELIVERY_ID'. (NullAllowed)
     */
    public void setKoguchiDeliveryId(Long koguchiDeliveryId) {
        __modifiedProperties.add("koguchiDeliveryId");
        this._koguchiDeliveryId = koguchiDeliveryId;
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
     * [get] SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 取扱販売組織ID
     * @return The value of the column 'SERV_SALES_ORG_ID'. (NullAllowed)
     */
    public Long getServSalesOrgId() {
        return _servSalesOrgId;
    }

    /**
     * [set] SERV_SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 取扱販売組織ID
     * @param servSalesOrgId The value of the column 'SERV_SALES_ORG_ID'. (NullAllowed)
     */
    public void setServSalesOrgId(Long servSalesOrgId) {
        __modifiedProperties.add("servSalesOrgId");
        this._servSalesOrgId = servSalesOrgId;
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
     * [get] CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @return The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public Long getCarrierId() {
        return _carrierId;
    }

    /**
     * [set] CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID
     * @param carrierId The value of the column 'CARRIER_ID'. (NullAllowed)
     */
    public void setCarrierId(Long carrierId) {
        __modifiedProperties.add("carrierId");
        this._carrierId = carrierId;
    }

    /**
     * [get] REQ_SALES_ORG_ID: {BIGINT(19)} <br>
     * 依頼元販売組織ID
     * @return The value of the column 'REQ_SALES_ORG_ID'. (NullAllowed)
     */
    public Long getReqSalesOrgId() {
        return _reqSalesOrgId;
    }

    /**
     * [set] REQ_SALES_ORG_ID: {BIGINT(19)} <br>
     * 依頼元販売組織ID
     * @param reqSalesOrgId The value of the column 'REQ_SALES_ORG_ID'. (NullAllowed)
     */
    public void setReqSalesOrgId(Long reqSalesOrgId) {
        __modifiedProperties.add("reqSalesOrgId");
        this._reqSalesOrgId = reqSalesOrgId;
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
