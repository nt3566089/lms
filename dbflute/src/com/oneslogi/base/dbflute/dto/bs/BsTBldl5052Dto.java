package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5052 as TABLE. <br>
 * BLDL5052
 * <pre>
 * [primary-key]
 *     BLDL5052_ID
 *
 * [column]
 *     BLDL5052_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_CASE_NUM, FW_PICK_NUM, FW_RATE, UN_CASE_NUM, UN_PICK_NUM, UN_RATE, SH_CASE_NUM, SH_PICK_NUM, SH_RATE, HM_CASE_NUM, HM_PICK_NUM, HM_RATE, TOTAL_CASE_NUM, TOTAL_PICK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5052_ID
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
public abstract class BsTBldl5052Dto implements Serializable {

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
    /** BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5052Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingDt;

    /** FW_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwCaseNum;

    /** FW_PICK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwPickNum;

    /** FW_RATE: {BIGINT(19)} */
    @JsonKey
    protected Long _fwRate;

    /** UN_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unCaseNum;

    /** UN_PICK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unPickNum;

    /** UN_RATE: {BIGINT(19)} */
    @JsonKey
    protected Long _unRate;

    /** SH_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shCaseNum;

    /** SH_PICK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shPickNum;

    /** SH_RATE: {BIGINT(19)} */
    @JsonKey
    protected Long _shRate;

    /** HM_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmCaseNum;

    /** HM_PICK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmPickNum;

    /** HM_RATE: {BIGINT(19)} */
    @JsonKey
    protected Long _hmRate;

    /** TOTAL_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalCaseNum;

    /** TOTAL_PICK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalPickNum;

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
    public BsTBldl5052Dto() {
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
        if (other == null || !(other instanceof BsTBldl5052Dto)) { return false; }
        final BsTBldl5052Dto otherEntity = (BsTBldl5052Dto)other;
        if (!helpComparingValue(getBldl5052Id(), otherEntity.getBldl5052Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5052");
        result = xCH(result, getBldl5052Id());
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
        sb.append(c).append(getBldl5052Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getFwCaseNum());
        sb.append(c).append(getFwPickNum());
        sb.append(c).append(getFwRate());
        sb.append(c).append(getUnCaseNum());
        sb.append(c).append(getUnPickNum());
        sb.append(c).append(getUnRate());
        sb.append(c).append(getShCaseNum());
        sb.append(c).append(getShPickNum());
        sb.append(c).append(getShRate());
        sb.append(c).append(getHmCaseNum());
        sb.append(c).append(getHmPickNum());
        sb.append(c).append(getHmRate());
        sb.append(c).append(getTotalCaseNum());
        sb.append(c).append(getTotalPickNum());
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
     * [get] BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5052ID
     * @return The value of the column 'BLDL5052_ID'. (NullAllowed)
     */
    public Long getBldl5052Id() {
        return _bldl5052Id;
    }

    /**
     * [set] BLDL5052_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5052ID
     * @param bldl5052Id The value of the column 'BLDL5052_ID'. (NullAllowed)
     */
    public void setBldl5052Id(Long bldl5052Id) {
        __modifiedProperties.add("bldl5052Id");
        this._bldl5052Id = bldl5052Id;
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
     * [get] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW関連_ケース数
     * @return The value of the column 'FW_CASE_NUM'. (NullAllowed)
     */
    public Long getFwCaseNum() {
        return _fwCaseNum;
    }

    /**
     * [set] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW関連_ケース数
     * @param fwCaseNum The value of the column 'FW_CASE_NUM'. (NullAllowed)
     */
    public void setFwCaseNum(Long fwCaseNum) {
        __modifiedProperties.add("fwCaseNum");
        this._fwCaseNum = fwCaseNum;
    }

    /**
     * [get] FW_PICK_NUM: {BIGINT(19)} <br>
     * FW関連_ピッキング数
     * @return The value of the column 'FW_PICK_NUM'. (NullAllowed)
     */
    public Long getFwPickNum() {
        return _fwPickNum;
    }

    /**
     * [set] FW_PICK_NUM: {BIGINT(19)} <br>
     * FW関連_ピッキング数
     * @param fwPickNum The value of the column 'FW_PICK_NUM'. (NullAllowed)
     */
    public void setFwPickNum(Long fwPickNum) {
        __modifiedProperties.add("fwPickNum");
        this._fwPickNum = fwPickNum;
    }

    /**
     * [get] FW_RATE: {BIGINT(19)} <br>
     * FW関連_率
     * @return The value of the column 'FW_RATE'. (NullAllowed)
     */
    public Long getFwRate() {
        return _fwRate;
    }

    /**
     * [set] FW_RATE: {BIGINT(19)} <br>
     * FW関連_率
     * @param fwRate The value of the column 'FW_RATE'. (NullAllowed)
     */
    public void setFwRate(Long fwRate) {
        __modifiedProperties.add("fwRate");
        this._fwRate = fwRate;
    }

    /**
     * [get] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN関連_ケース数
     * @return The value of the column 'UN_CASE_NUM'. (NullAllowed)
     */
    public Long getUnCaseNum() {
        return _unCaseNum;
    }

    /**
     * [set] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN関連_ケース数
     * @param unCaseNum The value of the column 'UN_CASE_NUM'. (NullAllowed)
     */
    public void setUnCaseNum(Long unCaseNum) {
        __modifiedProperties.add("unCaseNum");
        this._unCaseNum = unCaseNum;
    }

    /**
     * [get] UN_PICK_NUM: {BIGINT(19)} <br>
     * UN関連_ピッキング数
     * @return The value of the column 'UN_PICK_NUM'. (NullAllowed)
     */
    public Long getUnPickNum() {
        return _unPickNum;
    }

    /**
     * [set] UN_PICK_NUM: {BIGINT(19)} <br>
     * UN関連_ピッキング数
     * @param unPickNum The value of the column 'UN_PICK_NUM'. (NullAllowed)
     */
    public void setUnPickNum(Long unPickNum) {
        __modifiedProperties.add("unPickNum");
        this._unPickNum = unPickNum;
    }

    /**
     * [get] UN_RATE: {BIGINT(19)} <br>
     * UN関連_率
     * @return The value of the column 'UN_RATE'. (NullAllowed)
     */
    public Long getUnRate() {
        return _unRate;
    }

    /**
     * [set] UN_RATE: {BIGINT(19)} <br>
     * UN関連_率
     * @param unRate The value of the column 'UN_RATE'. (NullAllowed)
     */
    public void setUnRate(Long unRate) {
        __modifiedProperties.add("unRate");
        this._unRate = unRate;
    }

    /**
     * [get] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH関連_ケース数
     * @return The value of the column 'SH_CASE_NUM'. (NullAllowed)
     */
    public Long getShCaseNum() {
        return _shCaseNum;
    }

    /**
     * [set] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH関連_ケース数
     * @param shCaseNum The value of the column 'SH_CASE_NUM'. (NullAllowed)
     */
    public void setShCaseNum(Long shCaseNum) {
        __modifiedProperties.add("shCaseNum");
        this._shCaseNum = shCaseNum;
    }

    /**
     * [get] SH_PICK_NUM: {BIGINT(19)} <br>
     * SH関連_ピッキング数
     * @return The value of the column 'SH_PICK_NUM'. (NullAllowed)
     */
    public Long getShPickNum() {
        return _shPickNum;
    }

    /**
     * [set] SH_PICK_NUM: {BIGINT(19)} <br>
     * SH関連_ピッキング数
     * @param shPickNum The value of the column 'SH_PICK_NUM'. (NullAllowed)
     */
    public void setShPickNum(Long shPickNum) {
        __modifiedProperties.add("shPickNum");
        this._shPickNum = shPickNum;
    }

    /**
     * [get] SH_RATE: {BIGINT(19)} <br>
     * SH関連_率
     * @return The value of the column 'SH_RATE'. (NullAllowed)
     */
    public Long getShRate() {
        return _shRate;
    }

    /**
     * [set] SH_RATE: {BIGINT(19)} <br>
     * SH関連_率
     * @param shRate The value of the column 'SH_RATE'. (NullAllowed)
     */
    public void setShRate(Long shRate) {
        __modifiedProperties.add("shRate");
        this._shRate = shRate;
    }

    /**
     * [get] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM関連_ケース数
     * @return The value of the column 'HM_CASE_NUM'. (NullAllowed)
     */
    public Long getHmCaseNum() {
        return _hmCaseNum;
    }

    /**
     * [set] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM関連_ケース数
     * @param hmCaseNum The value of the column 'HM_CASE_NUM'. (NullAllowed)
     */
    public void setHmCaseNum(Long hmCaseNum) {
        __modifiedProperties.add("hmCaseNum");
        this._hmCaseNum = hmCaseNum;
    }

    /**
     * [get] HM_PICK_NUM: {BIGINT(19)} <br>
     * HM関連_ピッキング数
     * @return The value of the column 'HM_PICK_NUM'. (NullAllowed)
     */
    public Long getHmPickNum() {
        return _hmPickNum;
    }

    /**
     * [set] HM_PICK_NUM: {BIGINT(19)} <br>
     * HM関連_ピッキング数
     * @param hmPickNum The value of the column 'HM_PICK_NUM'. (NullAllowed)
     */
    public void setHmPickNum(Long hmPickNum) {
        __modifiedProperties.add("hmPickNum");
        this._hmPickNum = hmPickNum;
    }

    /**
     * [get] HM_RATE: {BIGINT(19)} <br>
     * HM関連_率
     * @return The value of the column 'HM_RATE'. (NullAllowed)
     */
    public Long getHmRate() {
        return _hmRate;
    }

    /**
     * [set] HM_RATE: {BIGINT(19)} <br>
     * HM関連_率
     * @param hmRate The value of the column 'HM_RATE'. (NullAllowed)
     */
    public void setHmRate(Long hmRate) {
        __modifiedProperties.add("hmRate");
        this._hmRate = hmRate;
    }

    /**
     * [get] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計_ケース数
     * @return The value of the column 'TOTAL_CASE_NUM'. (NullAllowed)
     */
    public Long getTotalCaseNum() {
        return _totalCaseNum;
    }

    /**
     * [set] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計_ケース数
     * @param totalCaseNum The value of the column 'TOTAL_CASE_NUM'. (NullAllowed)
     */
    public void setTotalCaseNum(Long totalCaseNum) {
        __modifiedProperties.add("totalCaseNum");
        this._totalCaseNum = totalCaseNum;
    }

    /**
     * [get] TOTAL_PICK_NUM: {BIGINT(19)} <br>
     * 当日合計_ピッキング数
     * @return The value of the column 'TOTAL_PICK_NUM'. (NullAllowed)
     */
    public Long getTotalPickNum() {
        return _totalPickNum;
    }

    /**
     * [set] TOTAL_PICK_NUM: {BIGINT(19)} <br>
     * 当日合計_ピッキング数
     * @param totalPickNum The value of the column 'TOTAL_PICK_NUM'. (NullAllowed)
     */
    public void setTotalPickNum(Long totalPickNum) {
        __modifiedProperties.add("totalPickNum");
        this._totalPickNum = totalPickNum;
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
