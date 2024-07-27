package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5353 as TABLE. <br>
 * BLDL5353
 * <pre>
 * [primary-key]
 *     BLDL5353_ID
 *
 * [column]
 *     BLDL5353_ID, YEARMONTH, MONTH, SALES_ORG_CD, SALES_ORG_NM, ROW_NO, DATE, HOLIDAY, SOUKA_FW_NUM, SOUKA_UN_NUM, SOUKA_SH_NUM, SOUKA_TOTAL_NUM, KOSHIGAYA_FW_NUM, KOSHIGAYA_UN_NUM, KOSHIGAYA_SH_NUM, KOSHIGAYA_TOTAL_NUM, TOTAL_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5353_ID
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
public abstract class BsTBldl5353Dto implements Serializable {

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
    /** BLDL5353_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5353Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrgCd;

    /** SALES_ORG_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _salesOrgNm;

    /** ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rowNo;

    /** DATE: {VARCHAR(30)} */
    @JsonKey
    protected String _date;

    /** HOLIDAY: {VARCHAR(30)} */
    @JsonKey
    protected String _holiday;

    /** SOUKA_FW_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _soukaFwNum;

    /** SOUKA_UN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _soukaUnNum;

    /** SOUKA_SH_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _soukaShNum;

    /** SOUKA_TOTAL_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _soukaTotalNum;

    /** KOSHIGAYA_FW_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _koshigayaFwNum;

    /** KOSHIGAYA_UN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _koshigayaUnNum;

    /** KOSHIGAYA_SH_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _koshigayaShNum;

    /** KOSHIGAYA_TOTAL_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _koshigayaTotalNum;

    /** TOTAL_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalNum;

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
    public BsTBldl5353Dto() {
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
        if (other == null || !(other instanceof BsTBldl5353Dto)) { return false; }
        final BsTBldl5353Dto otherEntity = (BsTBldl5353Dto)other;
        if (!helpComparingValue(getBldl5353Id(), otherEntity.getBldl5353Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5353");
        result = xCH(result, getBldl5353Id());
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
        sb.append(c).append(getBldl5353Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getMonth());
        sb.append(c).append(getSalesOrgCd());
        sb.append(c).append(getSalesOrgNm());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getDate());
        sb.append(c).append(getHoliday());
        sb.append(c).append(getSoukaFwNum());
        sb.append(c).append(getSoukaUnNum());
        sb.append(c).append(getSoukaShNum());
        sb.append(c).append(getSoukaTotalNum());
        sb.append(c).append(getKoshigayaFwNum());
        sb.append(c).append(getKoshigayaUnNum());
        sb.append(c).append(getKoshigayaShNum());
        sb.append(c).append(getKoshigayaTotalNum());
        sb.append(c).append(getTotalNum());
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
     * [get] BLDL5353_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5353ID
     * @return The value of the column 'BLDL5353_ID'. (NullAllowed)
     */
    public Long getBldl5353Id() {
        return _bldl5353Id;
    }

    /**
     * [set] BLDL5353_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5353ID
     * @param bldl5353Id The value of the column 'BLDL5353_ID'. (NullAllowed)
     */
    public void setBldl5353Id(Long bldl5353Id) {
        __modifiedProperties.add("bldl5353Id");
        this._bldl5353Id = bldl5353Id;
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
     * [get] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @return The value of the column 'ROW_NO'. (NullAllowed)
     */
    public String getRowNo() {
        return _rowNo;
    }

    /**
     * [set] ROW_NO: {VARCHAR(30)} <br>
     * 項番
     * @param rowNo The value of the column 'ROW_NO'. (NullAllowed)
     */
    public void setRowNo(String rowNo) {
        __modifiedProperties.add("rowNo");
        this._rowNo = rowNo;
    }

    /**
     * [get] DATE: {VARCHAR(30)} <br>
     * 日付
     * @return The value of the column 'DATE'. (NullAllowed)
     */
    public String getDate() {
        return _date;
    }

    /**
     * [set] DATE: {VARCHAR(30)} <br>
     * 日付
     * @param date The value of the column 'DATE'. (NullAllowed)
     */
    public void setDate(String date) {
        __modifiedProperties.add("date");
        this._date = date;
    }

    /**
     * [get] HOLIDAY: {VARCHAR(30)} <br>
     * 休日
     * @return The value of the column 'HOLIDAY'. (NullAllowed)
     */
    public String getHoliday() {
        return _holiday;
    }

    /**
     * [set] HOLIDAY: {VARCHAR(30)} <br>
     * 休日
     * @param holiday The value of the column 'HOLIDAY'. (NullAllowed)
     */
    public void setHoliday(String holiday) {
        __modifiedProperties.add("holiday");
        this._holiday = holiday;
    }

    /**
     * [get] SOUKA_FW_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_FW関連
     * @return The value of the column 'SOUKA_FW_NUM'. (NullAllowed)
     */
    public Long getSoukaFwNum() {
        return _soukaFwNum;
    }

    /**
     * [set] SOUKA_FW_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_FW関連
     * @param soukaFwNum The value of the column 'SOUKA_FW_NUM'. (NullAllowed)
     */
    public void setSoukaFwNum(Long soukaFwNum) {
        __modifiedProperties.add("soukaFwNum");
        this._soukaFwNum = soukaFwNum;
    }

    /**
     * [get] SOUKA_UN_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_UN関連
     * @return The value of the column 'SOUKA_UN_NUM'. (NullAllowed)
     */
    public Long getSoukaUnNum() {
        return _soukaUnNum;
    }

    /**
     * [set] SOUKA_UN_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_UN関連
     * @param soukaUnNum The value of the column 'SOUKA_UN_NUM'. (NullAllowed)
     */
    public void setSoukaUnNum(Long soukaUnNum) {
        __modifiedProperties.add("soukaUnNum");
        this._soukaUnNum = soukaUnNum;
    }

    /**
     * [get] SOUKA_SH_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_SH関連
     * @return The value of the column 'SOUKA_SH_NUM'. (NullAllowed)
     */
    public Long getSoukaShNum() {
        return _soukaShNum;
    }

    /**
     * [set] SOUKA_SH_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_SH関連
     * @param soukaShNum The value of the column 'SOUKA_SH_NUM'. (NullAllowed)
     */
    public void setSoukaShNum(Long soukaShNum) {
        __modifiedProperties.add("soukaShNum");
        this._soukaShNum = soukaShNum;
    }

    /**
     * [get] SOUKA_TOTAL_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_合計数量
     * @return The value of the column 'SOUKA_TOTAL_NUM'. (NullAllowed)
     */
    public Long getSoukaTotalNum() {
        return _soukaTotalNum;
    }

    /**
     * [set] SOUKA_TOTAL_NUM: {BIGINT(19)} <br>
     * 草加C在庫分_合計数量
     * @param soukaTotalNum The value of the column 'SOUKA_TOTAL_NUM'. (NullAllowed)
     */
    public void setSoukaTotalNum(Long soukaTotalNum) {
        __modifiedProperties.add("soukaTotalNum");
        this._soukaTotalNum = soukaTotalNum;
    }

    /**
     * [get] KOSHIGAYA_FW_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_FW関連
     * @return The value of the column 'KOSHIGAYA_FW_NUM'. (NullAllowed)
     */
    public Long getKoshigayaFwNum() {
        return _koshigayaFwNum;
    }

    /**
     * [set] KOSHIGAYA_FW_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_FW関連
     * @param koshigayaFwNum The value of the column 'KOSHIGAYA_FW_NUM'. (NullAllowed)
     */
    public void setKoshigayaFwNum(Long koshigayaFwNum) {
        __modifiedProperties.add("koshigayaFwNum");
        this._koshigayaFwNum = koshigayaFwNum;
    }

    /**
     * [get] KOSHIGAYA_UN_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_UN関連
     * @return The value of the column 'KOSHIGAYA_UN_NUM'. (NullAllowed)
     */
    public Long getKoshigayaUnNum() {
        return _koshigayaUnNum;
    }

    /**
     * [set] KOSHIGAYA_UN_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_UN関連
     * @param koshigayaUnNum The value of the column 'KOSHIGAYA_UN_NUM'. (NullAllowed)
     */
    public void setKoshigayaUnNum(Long koshigayaUnNum) {
        __modifiedProperties.add("koshigayaUnNum");
        this._koshigayaUnNum = koshigayaUnNum;
    }

    /**
     * [get] KOSHIGAYA_SH_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_SH関連
     * @return The value of the column 'KOSHIGAYA_SH_NUM'. (NullAllowed)
     */
    public Long getKoshigayaShNum() {
        return _koshigayaShNum;
    }

    /**
     * [set] KOSHIGAYA_SH_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_SH関連
     * @param koshigayaShNum The value of the column 'KOSHIGAYA_SH_NUM'. (NullAllowed)
     */
    public void setKoshigayaShNum(Long koshigayaShNum) {
        __modifiedProperties.add("koshigayaShNum");
        this._koshigayaShNum = koshigayaShNum;
    }

    /**
     * [get] KOSHIGAYA_TOTAL_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_合計数量
     * @return The value of the column 'KOSHIGAYA_TOTAL_NUM'. (NullAllowed)
     */
    public Long getKoshigayaTotalNum() {
        return _koshigayaTotalNum;
    }

    /**
     * [set] KOSHIGAYA_TOTAL_NUM: {BIGINT(19)} <br>
     * SG柏在庫分_合計数量
     * @param koshigayaTotalNum The value of the column 'KOSHIGAYA_TOTAL_NUM'. (NullAllowed)
     */
    public void setKoshigayaTotalNum(Long koshigayaTotalNum) {
        __modifiedProperties.add("koshigayaTotalNum");
        this._koshigayaTotalNum = koshigayaTotalNum;
    }

    /**
     * [get] TOTAL_NUM: {BIGINT(19)} <br>
     * 当日合計数量
     * @return The value of the column 'TOTAL_NUM'. (NullAllowed)
     */
    public Long getTotalNum() {
        return _totalNum;
    }

    /**
     * [set] TOTAL_NUM: {BIGINT(19)} <br>
     * 当日合計数量
     * @param totalNum The value of the column 'TOTAL_NUM'. (NullAllowed)
     */
    public void setTotalNum(Long totalNum) {
        __modifiedProperties.add("totalNum");
        this._totalNum = totalNum;
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
