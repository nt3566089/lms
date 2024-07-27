package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of m_carrier_decision as TABLE. <br>
 * 運送業者決定マスタ
 * <pre>
 * [primary-key]
 *     CARRIER_DECISION_ID
 *
 * [column]
 *     CARRIER_DECISION_ID, CENTER_CD, ZIP_CD, SALES_ORG_ID, SALES_ORG_CD, CUSTOMER_ID, CUSTOMER_CD, DIRECT_KOHAI_TYPE_CD, PREFECTURE, CARRIER_ID, CARRIER_CD, CARRIER_ID1, CARRIER_CD1, CARRIER_ID2, CARRIER_CD2, CARRIER_ID3, CARRIER_CD3, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     CARRIER_DECISION_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_customer, m_carrier, m_sales_org
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mCustomer, mCarrierByCarrierId2, mCarrierByCarrierId1, mCarrierByCarrierId3, mCarrierByCarrierId, mSalesOrg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsMCarrierDecisionDto implements Serializable {

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
    /** CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _carrierDecisionId;

    /** CENTER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _centerCd;

    /** ZIP_CD: {IX, VARCHAR(30)} */
    @JsonKey
    protected String _zipCd;

    /** SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} */
    @JsonKey
    protected Long _salesOrgId;

    /** SALES_ORG_CD: {IX+, VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} */
    @JsonKey
    protected Long _customerId;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _customerCd;

    /** DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} */
    @JsonKey
    protected String _directKohaiTypeCd;

    /** PREFECTURE: {VARCHAR(60)} */
    @JsonKey
    protected String _prefecture;

    /** CARRIER_ID: {IX, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId1;

    /** CARRIER_CD1: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd1;

    /** CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId2;

    /** CARRIER_CD2: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd2;

    /** CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} */
    @JsonKey
    protected Long _carrierId3;

    /** CARRIER_CD3: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd3;

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
    public BsMCarrierDecisionDto() {
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
    protected MCustomerDto _mCustomer;

    public MCustomerDto getMCustomer() {
        return _mCustomer;
    }

    public void setMCustomer(MCustomerDto mCustomer) {
        this._mCustomer = mCustomer;
    }

    protected MCarrierDto _mCarrierByCarrierId2;

    public MCarrierDto getMCarrierByCarrierId2() {
        return _mCarrierByCarrierId2;
    }

    public void setMCarrierByCarrierId2(MCarrierDto mCarrierByCarrierId2) {
        this._mCarrierByCarrierId2 = mCarrierByCarrierId2;
    }

    protected MCarrierDto _mCarrierByCarrierId1;

    public MCarrierDto getMCarrierByCarrierId1() {
        return _mCarrierByCarrierId1;
    }

    public void setMCarrierByCarrierId1(MCarrierDto mCarrierByCarrierId1) {
        this._mCarrierByCarrierId1 = mCarrierByCarrierId1;
    }

    protected MCarrierDto _mCarrierByCarrierId3;

    public MCarrierDto getMCarrierByCarrierId3() {
        return _mCarrierByCarrierId3;
    }

    public void setMCarrierByCarrierId3(MCarrierDto mCarrierByCarrierId3) {
        this._mCarrierByCarrierId3 = mCarrierByCarrierId3;
    }

    protected MCarrierDto _mCarrierByCarrierId;

    public MCarrierDto getMCarrierByCarrierId() {
        return _mCarrierByCarrierId;
    }

    public void setMCarrierByCarrierId(MCarrierDto mCarrierByCarrierId) {
        this._mCarrierByCarrierId = mCarrierByCarrierId;
    }

    protected MSalesOrgDto _mSalesOrg;

    public MSalesOrgDto getMSalesOrg() {
        return _mSalesOrg;
    }

    public void setMSalesOrg(MSalesOrgDto mSalesOrg) {
        this._mSalesOrg = mSalesOrg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsMCarrierDecisionDto)) { return false; }
        final BsMCarrierDecisionDto otherEntity = (BsMCarrierDecisionDto)other;
        if (!helpComparingValue(getCarrierDecisionId(), otherEntity.getCarrierDecisionId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "m_carrier_decision");
        result = xCH(result, getCarrierDecisionId());
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
        sb.append(c).append(getCarrierDecisionId());
        sb.append(c).append(getCenterCd());
        sb.append(c).append(getZipCd());
        sb.append(c).append(getSalesOrgId());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getCustomerId());
        sb.append(c).append(getCustomerCd());
        sb.append(c).append(getDirectKohaiTypeCd());
        sb.append(c).append(getPrefecture());
        sb.append(c).append(getCarrierId());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierId1());
        sb.append(c).append(getCarrierCd1());
        sb.append(c).append(getCarrierId2());
        sb.append(c).append(getCarrierCd2());
        sb.append(c).append(getCarrierId3());
        sb.append(c).append(getCarrierCd3());
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
     * [get] CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者決定ID
     * @return The value of the column 'CARRIER_DECISION_ID'. (NullAllowed)
     */
    public Long getCarrierDecisionId() {
        return _carrierDecisionId;
    }

    /**
     * [set] CARRIER_DECISION_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 運送業者決定ID
     * @param carrierDecisionId The value of the column 'CARRIER_DECISION_ID'. (NullAllowed)
     */
    public void setCarrierDecisionId(Long carrierDecisionId) {
        __modifiedProperties.add("carrierDecisionId");
        this._carrierDecisionId = carrierDecisionId;
    }

    /**
     * [get] CENTER_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @return The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public String getCenterCd() {
        return _centerCd;
    }

    /**
     * [set] CENTER_CD: {VARCHAR(30)} <br>
     * 拠点CD
     * @param centerCd The value of the column 'CENTER_CD'. (NullAllowed)
     */
    public void setCenterCd(String centerCd) {
        __modifiedProperties.add("centerCd");
        this._centerCd = centerCd;
    }

    /**
     * [get] ZIP_CD: {IX, VARCHAR(30)} <br>
     * 郵便番号
     * @return The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public String getZipCd() {
        return _zipCd;
    }

    /**
     * [set] ZIP_CD: {IX, VARCHAR(30)} <br>
     * 郵便番号
     * @param zipCd The value of the column 'ZIP_CD'. (NullAllowed)
     */
    public void setZipCd(String zipCd) {
        __modifiedProperties.add("zipCd");
        this._zipCd = zipCd;
    }

    /**
     * [get] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @return The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public Long getSalesOrgId() {
        return _salesOrgId;
    }

    /**
     * [set] SALES_ORG_ID: {IX, BIGINT(19), FK to m_sales_org} <br>
     * 販売組織ID
     * @param salesOrgId The value of the column 'SALES_ORG_ID'. (NullAllowed)
     */
    public void setSalesOrgId(Long salesOrgId) {
        __modifiedProperties.add("salesOrgId");
        this._salesOrgId = salesOrgId;
    }

    /**
     * [get] SALES_ORG_CD: {IX+, VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public String getSalesOrgCd() {
        return _salesOrgCd;
    }

    /**
     * [set] SALES_ORG_CD: {IX+, VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        __modifiedProperties.add("salesOrgCd");
        this._salesOrgCd = salesOrgCd;
    }

    /**
     * [get] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 取引先ID
     * @return The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public Long getCustomerId() {
        return _customerId;
    }

    /**
     * [set] CUSTOMER_ID: {IX, BIGINT(19), FK to m_customer} <br>
     * 取引先ID
     * @param customerId The value of the column 'CUSTOMER_ID'. (NullAllowed)
     */
    public void setCustomerId(Long customerId) {
        __modifiedProperties.add("customerId");
        this._customerId = customerId;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public String getCustomerCd() {
        return _customerCd;
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed)
     */
    public void setCustomerCd(String customerCd) {
        __modifiedProperties.add("customerCd");
        this._customerCd = customerCd;
    }

    /**
     * [get] DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} <br>
     * 直送・戸配区分
     * @return The value of the column 'DIRECT_KOHAI_TYPE_CD'. (NullAllowed)
     */
    public String getDirectKohaiTypeCd() {
        return _directKohaiTypeCd;
    }

    /**
     * [set] DIRECT_KOHAI_TYPE_CD: {IX+, VARCHAR(30)} <br>
     * 直送・戸配区分
     * @param directKohaiTypeCd The value of the column 'DIRECT_KOHAI_TYPE_CD'. (NullAllowed)
     */
    public void setDirectKohaiTypeCd(String directKohaiTypeCd) {
        __modifiedProperties.add("directKohaiTypeCd");
        this._directKohaiTypeCd = directKohaiTypeCd;
    }

    /**
     * [get] PREFECTURE: {VARCHAR(60)} <br>
     * 都道府県
     * @return The value of the column 'PREFECTURE'. (NullAllowed)
     */
    public String getPrefecture() {
        return _prefecture;
    }

    /**
     * [set] PREFECTURE: {VARCHAR(60)} <br>
     * 都道府県
     * @param prefecture The value of the column 'PREFECTURE'. (NullAllowed)
     */
    public void setPrefecture(String prefecture) {
        __modifiedProperties.add("prefecture");
        this._prefecture = prefecture;
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
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(UN/HM/用品)
     * @return The value of the column 'CARRIER_ID1'. (NullAllowed)
     */
    public Long getCarrierId1() {
        return _carrierId1;
    }

    /**
     * [set] CARRIER_ID1: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(UN/HM/用品)
     * @param carrierId1 The value of the column 'CARRIER_ID1'. (NullAllowed)
     */
    public void setCarrierId1(Long carrierId1) {
        __modifiedProperties.add("carrierId1");
        this._carrierId1 = carrierId1;
    }

    /**
     * [get] CARRIER_CD1: {VARCHAR(30)} <br>
     * 運送業者CD(UN/HM/用品)
     * @return The value of the column 'CARRIER_CD1'. (NullAllowed)
     */
    public String getCarrierCd1() {
        return _carrierCd1;
    }

    /**
     * [set] CARRIER_CD1: {VARCHAR(30)} <br>
     * 運送業者CD(UN/HM/用品)
     * @param carrierCd1 The value of the column 'CARRIER_CD1'. (NullAllowed)
     */
    public void setCarrierCd1(String carrierCd1) {
        __modifiedProperties.add("carrierCd1");
        this._carrierCd1 = carrierCd1;
    }

    /**
     * [get] CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数上限)
     * @return The value of the column 'CARRIER_ID2'. (NullAllowed)
     */
    public Long getCarrierId2() {
        return _carrierId2;
    }

    /**
     * [set] CARRIER_ID2: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数上限)
     * @param carrierId2 The value of the column 'CARRIER_ID2'. (NullAllowed)
     */
    public void setCarrierId2(Long carrierId2) {
        __modifiedProperties.add("carrierId2");
        this._carrierId2 = carrierId2;
    }

    /**
     * [get] CARRIER_CD2: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数上限)
     * @return The value of the column 'CARRIER_CD2'. (NullAllowed)
     */
    public String getCarrierCd2() {
        return _carrierCd2;
    }

    /**
     * [set] CARRIER_CD2: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数上限)
     * @param carrierCd2 The value of the column 'CARRIER_CD2'. (NullAllowed)
     */
    public void setCarrierCd2(String carrierCd2) {
        __modifiedProperties.add("carrierCd2");
        this._carrierCd2 = carrierCd2;
    }

    /**
     * [get] CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数以上業者)
     * @return The value of the column 'CARRIER_ID3'. (NullAllowed)
     */
    public Long getCarrierId3() {
        return _carrierId3;
    }

    /**
     * [set] CARRIER_ID3: {IX, BIGINT(19), FK to m_carrier} <br>
     * 運送業者ID(FW足数以上業者)
     * @param carrierId3 The value of the column 'CARRIER_ID3'. (NullAllowed)
     */
    public void setCarrierId3(Long carrierId3) {
        __modifiedProperties.add("carrierId3");
        this._carrierId3 = carrierId3;
    }

    /**
     * [get] CARRIER_CD3: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数以上業者)
     * @return The value of the column 'CARRIER_CD3'. (NullAllowed)
     */
    public String getCarrierCd3() {
        return _carrierCd3;
    }

    /**
     * [set] CARRIER_CD3: {VARCHAR(30)} <br>
     * 運送業者CD(FW足数以上業者)
     * @param carrierCd3 The value of the column 'CARRIER_CD3'. (NullAllowed)
     */
    public void setCarrierCd3(String carrierCd3) {
        __modifiedProperties.add("carrierCd3");
        this._carrierCd3 = carrierCd3;
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
