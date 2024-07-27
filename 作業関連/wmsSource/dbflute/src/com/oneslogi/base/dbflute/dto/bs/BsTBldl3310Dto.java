package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl3310 as TABLE. <br>
 * BLDL3310
 * <pre>
 * [primary-key]
 *     BLDL3310_ID
 *
 * [column]
 *     BLDL3310_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, EC_TYPE_CD, FW_PRICE, SANSHA_FW_PRICE, SANSHA_UN_PRICE, SANSHA_SH_PRICE, SANSHA_HM_PRICE, SANSHA_TOTAL_PRICE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL3310_ID
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
public abstract class BsTBldl3310Dto implements Serializable {

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
    /** BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl3310Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** CONTRACTOR_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _contractorNm;

    /** EC_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _ecTypeCd;

    /** FW_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _fwPrice;

    /** SANSHA_FW_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaFwPrice;

    /** SANSHA_UN_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaUnPrice;

    /** SANSHA_SH_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaShPrice;

    /** SANSHA_HM_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaHmPrice;

    /** SANSHA_TOTAL_PRICE: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaTotalPrice;

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
    public BsTBldl3310Dto() {
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
        if (other == null || !(other instanceof BsTBldl3310Dto)) { return false; }
        final BsTBldl3310Dto otherEntity = (BsTBldl3310Dto)other;
        if (!helpComparingValue(getBldl3310Id(), otherEntity.getBldl3310Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl3310");
        result = xCH(result, getBldl3310Id());
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
        sb.append(c).append(getBldl3310Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getContractorNm());
        sb.append(c).append(getEcTypeCd());
        sb.append(c).append(getFwPrice());
        sb.append(c).append(getSanshaFwPrice());
        sb.append(c).append(getSanshaUnPrice());
        sb.append(c).append(getSanshaShPrice());
        sb.append(c).append(getSanshaHmPrice());
        sb.append(c).append(getSanshaTotalPrice());
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
     * [get] BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3310ID
     * @return The value of the column 'BLDL3310_ID'. (NullAllowed)
     */
    public Long getBldl3310Id() {
        return _bldl3310Id;
    }

    /**
     * [set] BLDL3310_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL3310ID
     * @param bldl3310Id The value of the column 'BLDL3310_ID'. (NullAllowed)
     */
    public void setBldl3310Id(Long bldl3310Id) {
        __modifiedProperties.add("bldl3310Id");
        this._bldl3310Id = bldl3310Id;
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
     * [get] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public String getContractorNm() {
        return _contractorNm;
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public void setContractorNm(String contractorNm) {
        __modifiedProperties.add("contractorNm");
        this._contractorNm = contractorNm;
    }

    /**
     * [get] EC_TYPE_CD: {VARCHAR(30)} <br>
     * EC区分
     * @return The value of the column 'EC_TYPE_CD'. (NullAllowed)
     */
    public String getEcTypeCd() {
        return _ecTypeCd;
    }

    /**
     * [set] EC_TYPE_CD: {VARCHAR(30)} <br>
     * EC区分
     * @param ecTypeCd The value of the column 'EC_TYPE_CD'. (NullAllowed)
     */
    public void setEcTypeCd(String ecTypeCd) {
        __modifiedProperties.add("ecTypeCd");
        this._ecTypeCd = ecTypeCd;
    }

    /**
     * [get] FW_PRICE: {BIGINT(19)} <br>
     * FW単体金額
     * @return The value of the column 'FW_PRICE'. (NullAllowed)
     */
    public Long getFwPrice() {
        return _fwPrice;
    }

    /**
     * [set] FW_PRICE: {BIGINT(19)} <br>
     * FW単体金額
     * @param fwPrice The value of the column 'FW_PRICE'. (NullAllowed)
     */
    public void setFwPrice(Long fwPrice) {
        __modifiedProperties.add("fwPrice");
        this._fwPrice = fwPrice;
    }

    /**
     * [get] SANSHA_FW_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_FW金額
     * @return The value of the column 'SANSHA_FW_PRICE'. (NullAllowed)
     */
    public Long getSanshaFwPrice() {
        return _sanshaFwPrice;
    }

    /**
     * [set] SANSHA_FW_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_FW金額
     * @param sanshaFwPrice The value of the column 'SANSHA_FW_PRICE'. (NullAllowed)
     */
    public void setSanshaFwPrice(Long sanshaFwPrice) {
        __modifiedProperties.add("sanshaFwPrice");
        this._sanshaFwPrice = sanshaFwPrice;
    }

    /**
     * [get] SANSHA_UN_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_UN金額
     * @return The value of the column 'SANSHA_UN_PRICE'. (NullAllowed)
     */
    public Long getSanshaUnPrice() {
        return _sanshaUnPrice;
    }

    /**
     * [set] SANSHA_UN_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_UN金額
     * @param sanshaUnPrice The value of the column 'SANSHA_UN_PRICE'. (NullAllowed)
     */
    public void setSanshaUnPrice(Long sanshaUnPrice) {
        __modifiedProperties.add("sanshaUnPrice");
        this._sanshaUnPrice = sanshaUnPrice;
    }

    /**
     * [get] SANSHA_SH_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_SH金額
     * @return The value of the column 'SANSHA_SH_PRICE'. (NullAllowed)
     */
    public Long getSanshaShPrice() {
        return _sanshaShPrice;
    }

    /**
     * [set] SANSHA_SH_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_SH金額
     * @param sanshaShPrice The value of the column 'SANSHA_SH_PRICE'. (NullAllowed)
     */
    public void setSanshaShPrice(Long sanshaShPrice) {
        __modifiedProperties.add("sanshaShPrice");
        this._sanshaShPrice = sanshaShPrice;
    }

    /**
     * [get] SANSHA_HM_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_HM金額
     * @return The value of the column 'SANSHA_HM_PRICE'. (NullAllowed)
     */
    public Long getSanshaHmPrice() {
        return _sanshaHmPrice;
    }

    /**
     * [set] SANSHA_HM_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_HM金額
     * @param sanshaHmPrice The value of the column 'SANSHA_HM_PRICE'. (NullAllowed)
     */
    public void setSanshaHmPrice(Long sanshaHmPrice) {
        __modifiedProperties.add("sanshaHmPrice");
        this._sanshaHmPrice = sanshaHmPrice;
    }

    /**
     * [get] SANSHA_TOTAL_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @return The value of the column 'SANSHA_TOTAL_PRICE'. (NullAllowed)
     */
    public Long getSanshaTotalPrice() {
        return _sanshaTotalPrice;
    }

    /**
     * [set] SANSHA_TOTAL_PRICE: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @param sanshaTotalPrice The value of the column 'SANSHA_TOTAL_PRICE'. (NullAllowed)
     */
    public void setSanshaTotalPrice(Long sanshaTotalPrice) {
        __modifiedProperties.add("sanshaTotalPrice");
        this._sanshaTotalPrice = sanshaTotalPrice;
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
