package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl3330 as TABLE. <br>
 * BLDL3330
 * <pre>
 * [primary-key]
 *     BLDL3310_ID
 *
 * [column]
 *     BLDL3310_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, EC_USER_TYPE_CD, FW_NUM, SANSHA_FW_NUM, SANSHA_UN_NUM, SANSHA_SH_NUM, SANSHA_HM_NUM, SANSHA_TOTAL_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
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
public abstract class BsTBldl3330Dto implements Serializable {

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
    /** BLDL3310_ID: {PK, NotNull, BIGINT(19)} */
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

    /** EC_USER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _ecUserTypeCd;

    /** FW_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwNum;

    /** SANSHA_FW_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaFwNum;

    /** SANSHA_UN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaUnNum;

    /** SANSHA_SH_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaShNum;

    /** SANSHA_HM_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaHmNum;

    /** SANSHA_TOTAL_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _sanshaTotalNum;

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
    public BsTBldl3330Dto() {
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
        if (other == null || !(other instanceof BsTBldl3330Dto)) { return false; }
        final BsTBldl3330Dto otherEntity = (BsTBldl3330Dto)other;
        if (!helpComparingValue(getBldl3310Id(), otherEntity.getBldl3310Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl3330");
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
        sb.append(c).append(getEcUserTypeCd());
        sb.append(c).append(getFwNum());
        sb.append(c).append(getSanshaFwNum());
        sb.append(c).append(getSanshaUnNum());
        sb.append(c).append(getSanshaShNum());
        sb.append(c).append(getSanshaHmNum());
        sb.append(c).append(getSanshaTotalNum());
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
     * [get] BLDL3310_ID: {PK, NotNull, BIGINT(19)} <br>
     * BLDL3330ID
     * @return The value of the column 'BLDL3310_ID'. (NullAllowed)
     */
    public Long getBldl3310Id() {
        return _bldl3310Id;
    }

    /**
     * [set] BLDL3310_ID: {PK, NotNull, BIGINT(19)} <br>
     * BLDL3330ID
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
     * [get] EC_USER_TYPE_CD: {VARCHAR(30)} <br>
     * ECユーザ区分
     * @return The value of the column 'EC_USER_TYPE_CD'. (NullAllowed)
     */
    public String getEcUserTypeCd() {
        return _ecUserTypeCd;
    }

    /**
     * [set] EC_USER_TYPE_CD: {VARCHAR(30)} <br>
     * ECユーザ区分
     * @param ecUserTypeCd The value of the column 'EC_USER_TYPE_CD'. (NullAllowed)
     */
    public void setEcUserTypeCd(String ecUserTypeCd) {
        __modifiedProperties.add("ecUserTypeCd");
        this._ecUserTypeCd = ecUserTypeCd;
    }

    /**
     * [get] FW_NUM: {BIGINT(19)} <br>
     * FW単体数量
     * @return The value of the column 'FW_NUM'. (NullAllowed)
     */
    public Long getFwNum() {
        return _fwNum;
    }

    /**
     * [set] FW_NUM: {BIGINT(19)} <br>
     * FW単体数量
     * @param fwNum The value of the column 'FW_NUM'. (NullAllowed)
     */
    public void setFwNum(Long fwNum) {
        __modifiedProperties.add("fwNum");
        this._fwNum = fwNum;
    }

    /**
     * [get] SANSHA_FW_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_FW数量
     * @return The value of the column 'SANSHA_FW_NUM'. (NullAllowed)
     */
    public Long getSanshaFwNum() {
        return _sanshaFwNum;
    }

    /**
     * [set] SANSHA_FW_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_FW数量
     * @param sanshaFwNum The value of the column 'SANSHA_FW_NUM'. (NullAllowed)
     */
    public void setSanshaFwNum(Long sanshaFwNum) {
        __modifiedProperties.add("sanshaFwNum");
        this._sanshaFwNum = sanshaFwNum;
    }

    /**
     * [get] SANSHA_UN_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_UN数量
     * @return The value of the column 'SANSHA_UN_NUM'. (NullAllowed)
     */
    public Long getSanshaUnNum() {
        return _sanshaUnNum;
    }

    /**
     * [set] SANSHA_UN_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_UN数量
     * @param sanshaUnNum The value of the column 'SANSHA_UN_NUM'. (NullAllowed)
     */
    public void setSanshaUnNum(Long sanshaUnNum) {
        __modifiedProperties.add("sanshaUnNum");
        this._sanshaUnNum = sanshaUnNum;
    }

    /**
     * [get] SANSHA_SH_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_SH数量
     * @return The value of the column 'SANSHA_SH_NUM'. (NullAllowed)
     */
    public Long getSanshaShNum() {
        return _sanshaShNum;
    }

    /**
     * [set] SANSHA_SH_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_SH数量
     * @param sanshaShNum The value of the column 'SANSHA_SH_NUM'. (NullAllowed)
     */
    public void setSanshaShNum(Long sanshaShNum) {
        __modifiedProperties.add("sanshaShNum");
        this._sanshaShNum = sanshaShNum;
    }

    /**
     * [get] SANSHA_HM_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_HM数量
     * @return The value of the column 'SANSHA_HM_NUM'. (NullAllowed)
     */
    public Long getSanshaHmNum() {
        return _sanshaHmNum;
    }

    /**
     * [set] SANSHA_HM_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_HM数量
     * @param sanshaHmNum The value of the column 'SANSHA_HM_NUM'. (NullAllowed)
     */
    public void setSanshaHmNum(Long sanshaHmNum) {
        __modifiedProperties.add("sanshaHmNum");
        this._sanshaHmNum = sanshaHmNum;
    }

    /**
     * [get] SANSHA_TOTAL_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @return The value of the column 'SANSHA_TOTAL_NUM'. (NullAllowed)
     */
    public Long getSanshaTotalNum() {
        return _sanshaTotalNum;
    }

    /**
     * [set] SANSHA_TOTAL_NUM: {BIGINT(19)} <br>
     * 3社戸配対象_3社合計
     * @param sanshaTotalNum The value of the column 'SANSHA_TOTAL_NUM'. (NullAllowed)
     */
    public void setSanshaTotalNum(Long sanshaTotalNum) {
        __modifiedProperties.add("sanshaTotalNum");
        this._sanshaTotalNum = sanshaTotalNum;
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
