package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5150 as TABLE. <br>
 * BLDL5150
 * <pre>
 * [primary-key]
 *     BLDL5150_ID
 *
 * [column]
 *     BLDL5150_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RECEIVE_DT, FW_RCV_CNT, FW_RCV_NUM, FW_CASE_NUM, UN_RCV_CNT, UN_RCV_NUM, UN_CASE_NUM, SH_RCV_CNT, SH_RCV_NUM, SH_CASE_NUM, HM_RCV_CNT, HM_RCV_NUM, HM_CASE_NUM, TOTAL_RCV_NUM, TOTAL_CASE_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5150_ID
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
public abstract class BsTBldl5150Dto implements Serializable {

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
    /** BLDL5150_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5150Id;

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

    /** RECEIVE_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _receiveDt;

    /** FW_RCV_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _fwRcvCnt;

    /** FW_RCV_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwRcvNum;

    /** FW_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwCaseNum;

    /** UN_RCV_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _unRcvCnt;

    /** UN_RCV_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unRcvNum;

    /** UN_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unCaseNum;

    /** SH_RCV_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _shRcvCnt;

    /** SH_RCV_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shRcvNum;

    /** SH_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shCaseNum;

    /** HM_RCV_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _hmRcvCnt;

    /** HM_RCV_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmRcvNum;

    /** HM_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmCaseNum;

    /** TOTAL_RCV_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalRcvNum;

    /** TOTAL_CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalCaseNum;

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
    public BsTBldl5150Dto() {
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
        if (other == null || !(other instanceof BsTBldl5150Dto)) { return false; }
        final BsTBldl5150Dto otherEntity = (BsTBldl5150Dto)other;
        if (!helpComparingValue(getBldl5150Id(), otherEntity.getBldl5150Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5150");
        result = xCH(result, getBldl5150Id());
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
        sb.append(c).append(getBldl5150Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getReceiveDt());
        sb.append(c).append(getFwRcvCnt());
        sb.append(c).append(getFwRcvNum());
        sb.append(c).append(getFwCaseNum());
        sb.append(c).append(getUnRcvCnt());
        sb.append(c).append(getUnRcvNum());
        sb.append(c).append(getUnCaseNum());
        sb.append(c).append(getShRcvCnt());
        sb.append(c).append(getShRcvNum());
        sb.append(c).append(getShCaseNum());
        sb.append(c).append(getHmRcvCnt());
        sb.append(c).append(getHmRcvNum());
        sb.append(c).append(getHmCaseNum());
        sb.append(c).append(getTotalRcvNum());
        sb.append(c).append(getTotalCaseNum());
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
     * [get] BLDL5150_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5150ID
     * @return The value of the column 'BLDL5150_ID'. (NullAllowed)
     */
    public Long getBldl5150Id() {
        return _bldl5150Id;
    }

    /**
     * [set] BLDL5150_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5150ID
     * @param bldl5150Id The value of the column 'BLDL5150_ID'. (NullAllowed)
     */
    public void setBldl5150Id(Long bldl5150Id) {
        __modifiedProperties.add("bldl5150Id");
        this._bldl5150Id = bldl5150Id;
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
     * [get] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @return The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public String getReceiveDt() {
        return _receiveDt;
    }

    /**
     * [set] RECEIVE_DT: {VARCHAR(8)} <br>
     * 入荷日
     * @param receiveDt The value of the column 'RECEIVE_DT'. (NullAllowed)
     */
    public void setReceiveDt(String receiveDt) {
        __modifiedProperties.add("receiveDt");
        this._receiveDt = receiveDt;
    }

    /**
     * [get] FW_RCV_CNT: {BIGINT(19)} <br>
     * FW_入荷件数
     * @return The value of the column 'FW_RCV_CNT'. (NullAllowed)
     */
    public Long getFwRcvCnt() {
        return _fwRcvCnt;
    }

    /**
     * [set] FW_RCV_CNT: {BIGINT(19)} <br>
     * FW_入荷件数
     * @param fwRcvCnt The value of the column 'FW_RCV_CNT'. (NullAllowed)
     */
    public void setFwRcvCnt(Long fwRcvCnt) {
        __modifiedProperties.add("fwRcvCnt");
        this._fwRcvCnt = fwRcvCnt;
    }

    /**
     * [get] FW_RCV_NUM: {BIGINT(19)} <br>
     * FW_入荷数量
     * @return The value of the column 'FW_RCV_NUM'. (NullAllowed)
     */
    public Long getFwRcvNum() {
        return _fwRcvNum;
    }

    /**
     * [set] FW_RCV_NUM: {BIGINT(19)} <br>
     * FW_入荷数量
     * @param fwRcvNum The value of the column 'FW_RCV_NUM'. (NullAllowed)
     */
    public void setFwRcvNum(Long fwRcvNum) {
        __modifiedProperties.add("fwRcvNum");
        this._fwRcvNum = fwRcvNum;
    }

    /**
     * [get] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW_ケース数
     * @return The value of the column 'FW_CASE_NUM'. (NullAllowed)
     */
    public Long getFwCaseNum() {
        return _fwCaseNum;
    }

    /**
     * [set] FW_CASE_NUM: {BIGINT(19)} <br>
     * FW_ケース数
     * @param fwCaseNum The value of the column 'FW_CASE_NUM'. (NullAllowed)
     */
    public void setFwCaseNum(Long fwCaseNum) {
        __modifiedProperties.add("fwCaseNum");
        this._fwCaseNum = fwCaseNum;
    }

    /**
     * [get] UN_RCV_CNT: {BIGINT(19)} <br>
     * UN_入荷件数
     * @return The value of the column 'UN_RCV_CNT'. (NullAllowed)
     */
    public Long getUnRcvCnt() {
        return _unRcvCnt;
    }

    /**
     * [set] UN_RCV_CNT: {BIGINT(19)} <br>
     * UN_入荷件数
     * @param unRcvCnt The value of the column 'UN_RCV_CNT'. (NullAllowed)
     */
    public void setUnRcvCnt(Long unRcvCnt) {
        __modifiedProperties.add("unRcvCnt");
        this._unRcvCnt = unRcvCnt;
    }

    /**
     * [get] UN_RCV_NUM: {BIGINT(19)} <br>
     * UN_入荷数量
     * @return The value of the column 'UN_RCV_NUM'. (NullAllowed)
     */
    public Long getUnRcvNum() {
        return _unRcvNum;
    }

    /**
     * [set] UN_RCV_NUM: {BIGINT(19)} <br>
     * UN_入荷数量
     * @param unRcvNum The value of the column 'UN_RCV_NUM'. (NullAllowed)
     */
    public void setUnRcvNum(Long unRcvNum) {
        __modifiedProperties.add("unRcvNum");
        this._unRcvNum = unRcvNum;
    }

    /**
     * [get] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN_ケース数
     * @return The value of the column 'UN_CASE_NUM'. (NullAllowed)
     */
    public Long getUnCaseNum() {
        return _unCaseNum;
    }

    /**
     * [set] UN_CASE_NUM: {BIGINT(19)} <br>
     * UN_ケース数
     * @param unCaseNum The value of the column 'UN_CASE_NUM'. (NullAllowed)
     */
    public void setUnCaseNum(Long unCaseNum) {
        __modifiedProperties.add("unCaseNum");
        this._unCaseNum = unCaseNum;
    }

    /**
     * [get] SH_RCV_CNT: {BIGINT(19)} <br>
     * SH_入荷件数
     * @return The value of the column 'SH_RCV_CNT'. (NullAllowed)
     */
    public Long getShRcvCnt() {
        return _shRcvCnt;
    }

    /**
     * [set] SH_RCV_CNT: {BIGINT(19)} <br>
     * SH_入荷件数
     * @param shRcvCnt The value of the column 'SH_RCV_CNT'. (NullAllowed)
     */
    public void setShRcvCnt(Long shRcvCnt) {
        __modifiedProperties.add("shRcvCnt");
        this._shRcvCnt = shRcvCnt;
    }

    /**
     * [get] SH_RCV_NUM: {BIGINT(19)} <br>
     * SH_入荷数量
     * @return The value of the column 'SH_RCV_NUM'. (NullAllowed)
     */
    public Long getShRcvNum() {
        return _shRcvNum;
    }

    /**
     * [set] SH_RCV_NUM: {BIGINT(19)} <br>
     * SH_入荷数量
     * @param shRcvNum The value of the column 'SH_RCV_NUM'. (NullAllowed)
     */
    public void setShRcvNum(Long shRcvNum) {
        __modifiedProperties.add("shRcvNum");
        this._shRcvNum = shRcvNum;
    }

    /**
     * [get] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH_ケース数
     * @return The value of the column 'SH_CASE_NUM'. (NullAllowed)
     */
    public Long getShCaseNum() {
        return _shCaseNum;
    }

    /**
     * [set] SH_CASE_NUM: {BIGINT(19)} <br>
     * SH_ケース数
     * @param shCaseNum The value of the column 'SH_CASE_NUM'. (NullAllowed)
     */
    public void setShCaseNum(Long shCaseNum) {
        __modifiedProperties.add("shCaseNum");
        this._shCaseNum = shCaseNum;
    }

    /**
     * [get] HM_RCV_CNT: {BIGINT(19)} <br>
     * HM_入荷件数
     * @return The value of the column 'HM_RCV_CNT'. (NullAllowed)
     */
    public Long getHmRcvCnt() {
        return _hmRcvCnt;
    }

    /**
     * [set] HM_RCV_CNT: {BIGINT(19)} <br>
     * HM_入荷件数
     * @param hmRcvCnt The value of the column 'HM_RCV_CNT'. (NullAllowed)
     */
    public void setHmRcvCnt(Long hmRcvCnt) {
        __modifiedProperties.add("hmRcvCnt");
        this._hmRcvCnt = hmRcvCnt;
    }

    /**
     * [get] HM_RCV_NUM: {BIGINT(19)} <br>
     * HM_入荷数量
     * @return The value of the column 'HM_RCV_NUM'. (NullAllowed)
     */
    public Long getHmRcvNum() {
        return _hmRcvNum;
    }

    /**
     * [set] HM_RCV_NUM: {BIGINT(19)} <br>
     * HM_入荷数量
     * @param hmRcvNum The value of the column 'HM_RCV_NUM'. (NullAllowed)
     */
    public void setHmRcvNum(Long hmRcvNum) {
        __modifiedProperties.add("hmRcvNum");
        this._hmRcvNum = hmRcvNum;
    }

    /**
     * [get] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM_ケース数
     * @return The value of the column 'HM_CASE_NUM'. (NullAllowed)
     */
    public Long getHmCaseNum() {
        return _hmCaseNum;
    }

    /**
     * [set] HM_CASE_NUM: {BIGINT(19)} <br>
     * HM_ケース数
     * @param hmCaseNum The value of the column 'HM_CASE_NUM'. (NullAllowed)
     */
    public void setHmCaseNum(Long hmCaseNum) {
        __modifiedProperties.add("hmCaseNum");
        this._hmCaseNum = hmCaseNum;
    }

    /**
     * [get] TOTAL_RCV_NUM: {BIGINT(19)} <br>
     * 当日合計入荷数
     * @return The value of the column 'TOTAL_RCV_NUM'. (NullAllowed)
     */
    public Long getTotalRcvNum() {
        return _totalRcvNum;
    }

    /**
     * [set] TOTAL_RCV_NUM: {BIGINT(19)} <br>
     * 当日合計入荷数
     * @param totalRcvNum The value of the column 'TOTAL_RCV_NUM'. (NullAllowed)
     */
    public void setTotalRcvNum(Long totalRcvNum) {
        __modifiedProperties.add("totalRcvNum");
        this._totalRcvNum = totalRcvNum;
    }

    /**
     * [get] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計ケース数
     * @return The value of the column 'TOTAL_CASE_NUM'. (NullAllowed)
     */
    public Long getTotalCaseNum() {
        return _totalCaseNum;
    }

    /**
     * [set] TOTAL_CASE_NUM: {BIGINT(19)} <br>
     * 当日合計ケース数
     * @param totalCaseNum The value of the column 'TOTAL_CASE_NUM'. (NullAllowed)
     */
    public void setTotalCaseNum(Long totalCaseNum) {
        __modifiedProperties.add("totalCaseNum");
        this._totalCaseNum = totalCaseNum;
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
