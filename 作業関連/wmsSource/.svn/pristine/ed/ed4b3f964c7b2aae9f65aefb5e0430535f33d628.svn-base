package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl3390 as TABLE. <br>
 * BLDL3390
 * <pre>
 * [primary-key]
 *     BLDL3390_ID
 *
 * [column]
 *     BLDL3390_ID, YEARMONTH, BASE_NM, MONTH, SHIPPING_DT, CONTRACTOR_CD, CONTRACTOR_NM, PRODUCT_NM, SALES_ORG_NM, SHIPPING_NUM, KOHAI_FEE, TAX, TAX_RATE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3390_ID
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
public abstract class BsTBldl3390Dto implements Serializable {

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
    /** BLDL3390_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl3390Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** CONTRACTOR_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _contractorCd;

    /** CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _contractorNm;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm;

    /** SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingNum;

    /** KOHAI_FEE: {BIGINT(19)} */
    @JsonKey
    protected Long _kohaiFee;

    /** TAX: {BIGINT(19)} */
    @JsonKey
    protected Long _tax;

    /** TAX_RATE: {BIGINT(19)} */
    @JsonKey
    protected Long _taxRate;

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
    public BsTBldl3390Dto() {
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
        if (other == null || !(other instanceof BsTBldl3390Dto)) { return false; }
        final BsTBldl3390Dto otherEntity = (BsTBldl3390Dto)other;
        if (!helpComparingValue(getBldl3390Id(), otherEntity.getBldl3390Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl3390");
        result = xCH(result, getBldl3390Id());
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
        sb.append(c).append(getBldl3390Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getContractorCd());
        sb.append(c).append(getContractorNm());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getSalesOrgNm());
        sb.append(c).append(getShippingNum());
        sb.append(c).append(getKohaiFee());
        sb.append(c).append(getTax());
        sb.append(c).append(getTaxRate());
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
     * [get] BLDL3390_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3390ID
     * @return The value of the column 'BLDL3390_ID'. (NullAllowed)
     */
    public Long getBldl3390Id() {
        return _bldl3390Id;
    }

    /**
     * [set] BLDL3390_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3390ID
     * @param bldl3390Id The value of the column 'BLDL3390_ID'. (NullAllowed)
     */
    public void setBldl3390Id(Long bldl3390Id) {
        __modifiedProperties.add("bldl3390Id");
        this._bldl3390Id = bldl3390Id;
    }

    /**
     * [get] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @return The value of the column 'YEARMONTH'. (NullAllowed)
     */
    public String getYearmonth() {
        return _yearmonth;
    }

    /**
     * [set] YEARMONTH: {VARCHAR(30)} <br>
     * 年月
     * @param yearmonth The value of the column 'YEARMONTH'. (NullAllowed)
     */
    public void setYearmonth(String yearmonth) {
        __modifiedProperties.add("yearmonth");
        this._yearmonth = yearmonth;
    }

    /**
     * [get] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @return The value of the column 'BASE_NM'. (NullAllowed)
     */
    public String getBaseNm() {
        return _baseNm;
    }

    /**
     * [set] BASE_NM: {VARCHAR(60)} <br>
     * 拠点
     * @param baseNm The value of the column 'BASE_NM'. (NullAllowed)
     */
    public void setBaseNm(String baseNm) {
        __modifiedProperties.add("baseNm");
        this._baseNm = baseNm;
    }

    /**
     * [get] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @return The value of the column 'MONTH'. (NullAllowed)
     */
    public String getMonth() {
        return _month;
    }

    /**
     * [set] MONTH: {VARCHAR(60)} <br>
     * 対象月度
     * @param month The value of the column 'MONTH'. (NullAllowed)
     */
    public void setMonth(String month) {
        __modifiedProperties.add("month");
        this._month = month;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸口契約先CD
     * @return The value of the column 'CONTRACTOR_CD'. (NullAllowed)
     */
    public String getContractorCd() {
        return _contractorCd;
    }

    /**
     * [set] CONTRACTOR_CD: {VARCHAR(30)} <br>
     * 戸口契約先CD
     * @param contractorCd The value of the column 'CONTRACTOR_CD'. (NullAllowed)
     */
    public void setContractorCd(String contractorCd) {
        __modifiedProperties.add("contractorCd");
        this._contractorCd = contractorCd;
    }

    /**
     * [get] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先名称
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public String getContractorNm() {
        return _contractorNm;
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先名称
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public void setContractorNm(String contractorNm) {
        __modifiedProperties.add("contractorNm");
        this._contractorNm = contractorNm;
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
     * [get] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @return The value of the column 'SALES_ORG_NM'. (NullAllowed)
     */
    public String getSalesOrgNm() {
        return _salesOrgNm;
    }

    /**
     * [set] SALES_ORG_NM: {VARCHAR(60)} <br>
     * 販売組織名称
     * @param salesOrgNm The value of the column 'SALES_ORG_NM'. (NullAllowed)
     */
    public void setSalesOrgNm(String salesOrgNm) {
        __modifiedProperties.add("salesOrgNm");
        this._salesOrgNm = salesOrgNm;
    }

    /**
     * [get] SHIPPING_NUM: {BIGINT(19)} <br>
     * 出荷数
     * @return The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public Long getShippingNum() {
        return _shippingNum;
    }

    /**
     * [set] SHIPPING_NUM: {BIGINT(19)} <br>
     * 出荷数
     * @param shippingNum The value of the column 'SHIPPING_NUM'. (NullAllowed)
     */
    public void setShippingNum(Long shippingNum) {
        __modifiedProperties.add("shippingNum");
        this._shippingNum = shippingNum;
    }

    /**
     * [get] KOHAI_FEE: {BIGINT(19)} <br>
     * 戸配手数料
     * @return The value of the column 'KOHAI_FEE'. (NullAllowed)
     */
    public Long getKohaiFee() {
        return _kohaiFee;
    }

    /**
     * [set] KOHAI_FEE: {BIGINT(19)} <br>
     * 戸配手数料
     * @param kohaiFee The value of the column 'KOHAI_FEE'. (NullAllowed)
     */
    public void setKohaiFee(Long kohaiFee) {
        __modifiedProperties.add("kohaiFee");
        this._kohaiFee = kohaiFee;
    }

    /**
     * [get] TAX: {BIGINT(19)} <br>
     * 消費税額
     * @return The value of the column 'TAX'. (NullAllowed)
     */
    public Long getTax() {
        return _tax;
    }

    /**
     * [set] TAX: {BIGINT(19)} <br>
     * 消費税額
     * @param tax The value of the column 'TAX'. (NullAllowed)
     */
    public void setTax(Long tax) {
        __modifiedProperties.add("tax");
        this._tax = tax;
    }

    /**
     * [get] TAX_RATE: {BIGINT(19)} <br>
     * 消費税率値
     * @return The value of the column 'TAX_RATE'. (NullAllowed)
     */
    public Long getTaxRate() {
        return _taxRate;
    }

    /**
     * [set] TAX_RATE: {BIGINT(19)} <br>
     * 消費税率値
     * @param taxRate The value of the column 'TAX_RATE'. (NullAllowed)
     */
    public void setTaxRate(Long taxRate) {
        __modifiedProperties.add("taxRate");
        this._taxRate = taxRate;
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
