package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl3350 as TABLE. <br>
 * BLDL3350
 * <pre>
 * [primary-key]
 *     BLDL3350_ID
 *
 * [column]
 *     BLDL3350_ID, YEARMONTH, BASE_NM, MONTH, SALES_ORG_NM, SHIPPING_DT, YAMATO_SHIPPING_NUM, YAMATO_EC_SHIPPING_NUM, SAGAWA_SHIPPING_NUM, SAGAWA_EC_SHIPPING_NUM, SAGAWA2_SHIPPING_NUM, SAGAWA2_EC_SHIPPING_NUM, OTHER_SHIPPING_NUM, OTHER_EC_SHIPPING_NUM, CANCEL_SHIPPING_NUM, CANCEL_EC_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3350_ID
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
public abstract class BsTBldl3350Dto implements Serializable {

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
    /** BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl3350Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** YAMATO_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _yamatoShippingNum;

    /** YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _yamatoEcShippingNum;

    /** SAGAWA_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sagawaShippingNum;

    /** SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sagawaEcShippingNum;

    /** SAGAWA2_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sagawa2ShippingNum;

    /** SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sagawa2EcShippingNum;

    /** OTHER_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _otherShippingNum;

    /** OTHER_EC_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _otherEcShippingNum;

    /** CANCEL_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _cancelShippingNum;

    /** CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _cancelEcShippingNum;

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
    public BsTBldl3350Dto() {
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
        if (other == null || !(other instanceof BsTBldl3350Dto)) { return false; }
        final BsTBldl3350Dto otherEntity = (BsTBldl3350Dto)other;
        if (!helpComparingValue(getBldl3350Id(), otherEntity.getBldl3350Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl3350");
        result = xCH(result, getBldl3350Id());
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
        sb.append(c).append(getBldl3350Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getSalesOrgNm());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getYamatoShippingNum());
        sb.append(c).append(getYamatoEcShippingNum());
        sb.append(c).append(getSagawaShippingNum());
        sb.append(c).append(getSagawaEcShippingNum());
        sb.append(c).append(getSagawa2ShippingNum());
        sb.append(c).append(getSagawa2EcShippingNum());
        sb.append(c).append(getOtherShippingNum());
        sb.append(c).append(getOtherEcShippingNum());
        sb.append(c).append(getCancelShippingNum());
        sb.append(c).append(getCancelEcShippingNum());
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
     * [get] BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3350ID
     * @return The value of the column 'BLDL3350_ID'. (NullAllowed)
     */
    public Long getBldl3350Id() {
        return _bldl3350Id;
    }

    /**
     * [set] BLDL3350_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3350ID
     * @param bldl3350Id The value of the column 'BLDL3350_ID'. (NullAllowed)
     */
    public void setBldl3350Id(Long bldl3350Id) {
        __modifiedProperties.add("bldl3350Id");
        this._bldl3350Id = bldl3350Id;
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
     * [get] YAMATO_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_出荷数
     * @return The value of the column 'YAMATO_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getYamatoShippingNum() {
        return _yamatoShippingNum;
    }

    /**
     * [set] YAMATO_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_出荷数
     * @param yamatoShippingNum The value of the column 'YAMATO_SHIPPING_NUM'. (NullAllowed)
     */
    public void setYamatoShippingNum(Long yamatoShippingNum) {
        __modifiedProperties.add("yamatoShippingNum");
        this._yamatoShippingNum = yamatoShippingNum;
    }

    /**
     * [get] YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_EC出荷手数料
     * @return The value of the column 'YAMATO_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getYamatoEcShippingNum() {
        return _yamatoEcShippingNum;
    }

    /**
     * [set] YAMATO_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * ヤマト運輸_EC出荷手数料
     * @param yamatoEcShippingNum The value of the column 'YAMATO_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public void setYamatoEcShippingNum(Long yamatoEcShippingNum) {
        __modifiedProperties.add("yamatoEcShippingNum");
        this._yamatoEcShippingNum = yamatoEcShippingNum;
    }

    /**
     * [get] SAGAWA_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_出荷数
     * @return The value of the column 'SAGAWA_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getSagawaShippingNum() {
        return _sagawaShippingNum;
    }

    /**
     * [set] SAGAWA_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_出荷数
     * @param sagawaShippingNum The value of the column 'SAGAWA_SHIPPING_NUM'. (NullAllowed)
     */
    public void setSagawaShippingNum(Long sagawaShippingNum) {
        __modifiedProperties.add("sagawaShippingNum");
        this._sagawaShippingNum = sagawaShippingNum;
    }

    /**
     * [get] SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_EC出荷手数料
     * @return The value of the column 'SAGAWA_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getSagawaEcShippingNum() {
        return _sagawaEcShippingNum;
    }

    /**
     * [set] SAGAWA_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川急便_EC出荷手数料
     * @param sagawaEcShippingNum The value of the column 'SAGAWA_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public void setSagawaEcShippingNum(Long sagawaEcShippingNum) {
        __modifiedProperties.add("sagawaEcShippingNum");
        this._sagawaEcShippingNum = sagawaEcShippingNum;
    }

    /**
     * [get] SAGAWA2_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_出荷数
     * @return The value of the column 'SAGAWA2_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getSagawa2ShippingNum() {
        return _sagawa2ShippingNum;
    }

    /**
     * [set] SAGAWA2_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_出荷数
     * @param sagawa2ShippingNum The value of the column 'SAGAWA2_SHIPPING_NUM'. (NullAllowed)
     */
    public void setSagawa2ShippingNum(Long sagawa2ShippingNum) {
        __modifiedProperties.add("sagawa2ShippingNum");
        this._sagawa2ShippingNum = sagawa2ShippingNum;
    }

    /**
     * [get] SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_EC出荷手数料
     * @return The value of the column 'SAGAWA2_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getSagawa2EcShippingNum() {
        return _sagawa2EcShippingNum;
    }

    /**
     * [set] SAGAWA2_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 佐川代引_EC出荷手数料
     * @param sagawa2EcShippingNum The value of the column 'SAGAWA2_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public void setSagawa2EcShippingNum(Long sagawa2EcShippingNum) {
        __modifiedProperties.add("sagawa2EcShippingNum");
        this._sagawa2EcShippingNum = sagawa2EcShippingNum;
    }

    /**
     * [get] OTHER_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_出荷数
     * @return The value of the column 'OTHER_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getOtherShippingNum() {
        return _otherShippingNum;
    }

    /**
     * [set] OTHER_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_出荷数
     * @param otherShippingNum The value of the column 'OTHER_SHIPPING_NUM'. (NullAllowed)
     */
    public void setOtherShippingNum(Long otherShippingNum) {
        __modifiedProperties.add("otherShippingNum");
        this._otherShippingNum = otherShippingNum;
    }

    /**
     * [get] OTHER_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_EC出荷手数料
     * @return The value of the column 'OTHER_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getOtherEcShippingNum() {
        return _otherEcShippingNum;
    }

    /**
     * [set] OTHER_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * その他_EC出荷手数料
     * @param otherEcShippingNum The value of the column 'OTHER_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public void setOtherEcShippingNum(Long otherEcShippingNum) {
        __modifiedProperties.add("otherEcShippingNum");
        this._otherEcShippingNum = otherEcShippingNum;
    }

    /**
     * [get] CANCEL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_出荷数
     * @return The value of the column 'CANCEL_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getCancelShippingNum() {
        return _cancelShippingNum;
    }

    /**
     * [set] CANCEL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_出荷数
     * @param cancelShippingNum The value of the column 'CANCEL_SHIPPING_NUM'. (NullAllowed)
     */
    public void setCancelShippingNum(Long cancelShippingNum) {
        __modifiedProperties.add("cancelShippingNum");
        this._cancelShippingNum = cancelShippingNum;
    }

    /**
     * [get] CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_EC出荷手数料
     * @return The value of the column 'CANCEL_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getCancelEcShippingNum() {
        return _cancelEcShippingNum;
    }

    /**
     * [set] CANCEL_EC_SHIPPING_NUM: {BIGINT(19)} <br>
     * 取り消し_EC出荷手数料
     * @param cancelEcShippingNum The value of the column 'CANCEL_EC_SHIPPING_NUM'. (NullAllowed)
     */
    public void setCancelEcShippingNum(Long cancelEcShippingNum) {
        __modifiedProperties.add("cancelEcShippingNum");
        this._cancelEcShippingNum = cancelEcShippingNum;
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
