package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5060 as TABLE. <br>
 * BLDL5060
 * <pre>
 * [primary-key]
 *     BLDL5060_ID
 *
 * [column]
 *     BLDL5060_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, RETURN_DT, FW_RETURN_CNT, FW_RETURN_NUM, UN_RETURN_CNT, UN_RETURN_NUM, SH_RETURN_CNT, SH_RETURN_NUM, HM_RETURN_CNT, HM_RETURN_NUM, TOTAL_RETURN_CNT, TOTAL_RETURN_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5060_ID
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
public abstract class BsTBldl5060Dto implements Serializable {

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
    /** BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5060Id;

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

    /** RETURN_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _returnDt;

    /** FW_RETURN_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _fwReturnCnt;

    /** FW_RETURN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwReturnNum;

    /** UN_RETURN_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _unReturnCnt;

    /** UN_RETURN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unReturnNum;

    /** SH_RETURN_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _shReturnCnt;

    /** SH_RETURN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shReturnNum;

    /** HM_RETURN_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _hmReturnCnt;

    /** HM_RETURN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmReturnNum;

    /** TOTAL_RETURN_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _totalReturnCnt;

    /** TOTAL_RETURN_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalReturnNum;

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
    public BsTBldl5060Dto() {
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
        if (other == null || !(other instanceof BsTBldl5060Dto)) { return false; }
        final BsTBldl5060Dto otherEntity = (BsTBldl5060Dto)other;
        if (!helpComparingValue(getBldl5060Id(), otherEntity.getBldl5060Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5060");
        result = xCH(result, getBldl5060Id());
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
        sb.append(c).append(getBldl5060Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getReturnDt());
        sb.append(c).append(getFwReturnCnt());
        sb.append(c).append(getFwReturnNum());
        sb.append(c).append(getUnReturnCnt());
        sb.append(c).append(getUnReturnNum());
        sb.append(c).append(getShReturnCnt());
        sb.append(c).append(getShReturnNum());
        sb.append(c).append(getHmReturnCnt());
        sb.append(c).append(getHmReturnNum());
        sb.append(c).append(getTotalReturnCnt());
        sb.append(c).append(getTotalReturnNum());
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
     * [get] BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5060ID
     * @return The value of the column 'BLDL5060_ID'. (NullAllowed)
     */
    public Long getBldl5060Id() {
        return _bldl5060Id;
    }

    /**
     * [set] BLDL5060_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5060ID
     * @param bldl5060Id The value of the column 'BLDL5060_ID'. (NullAllowed)
     */
    public void setBldl5060Id(Long bldl5060Id) {
        __modifiedProperties.add("bldl5060Id");
        this._bldl5060Id = bldl5060Id;
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
     * [get] RETURN_DT: {VARCHAR(30)} <br>
     * 返品受入日
     * @return The value of the column 'RETURN_DT'. (NullAllowed)
     */
    public String getReturnDt() {
        return _returnDt;
    }

    /**
     * [set] RETURN_DT: {VARCHAR(30)} <br>
     * 返品受入日
     * @param returnDt The value of the column 'RETURN_DT'. (NullAllowed)
     */
    public void setReturnDt(String returnDt) {
        __modifiedProperties.add("returnDt");
        this._returnDt = returnDt;
    }

    /**
     * [get] FW_RETURN_CNT: {BIGINT(19)} <br>
     * FW_返品件数
     * @return The value of the column 'FW_RETURN_CNT'. (NullAllowed)
     */
    public Long getFwReturnCnt() {
        return _fwReturnCnt;
    }

    /**
     * [set] FW_RETURN_CNT: {BIGINT(19)} <br>
     * FW_返品件数
     * @param fwReturnCnt The value of the column 'FW_RETURN_CNT'. (NullAllowed)
     */
    public void setFwReturnCnt(Long fwReturnCnt) {
        __modifiedProperties.add("fwReturnCnt");
        this._fwReturnCnt = fwReturnCnt;
    }

    /**
     * [get] FW_RETURN_NUM: {BIGINT(19)} <br>
     * FW_返品数量
     * @return The value of the column 'FW_RETURN_NUM'. (NullAllowed)
     */
    public Long getFwReturnNum() {
        return _fwReturnNum;
    }

    /**
     * [set] FW_RETURN_NUM: {BIGINT(19)} <br>
     * FW_返品数量
     * @param fwReturnNum The value of the column 'FW_RETURN_NUM'. (NullAllowed)
     */
    public void setFwReturnNum(Long fwReturnNum) {
        __modifiedProperties.add("fwReturnNum");
        this._fwReturnNum = fwReturnNum;
    }

    /**
     * [get] UN_RETURN_CNT: {BIGINT(19)} <br>
     * UN_返品件数
     * @return The value of the column 'UN_RETURN_CNT'. (NullAllowed)
     */
    public Long getUnReturnCnt() {
        return _unReturnCnt;
    }

    /**
     * [set] UN_RETURN_CNT: {BIGINT(19)} <br>
     * UN_返品件数
     * @param unReturnCnt The value of the column 'UN_RETURN_CNT'. (NullAllowed)
     */
    public void setUnReturnCnt(Long unReturnCnt) {
        __modifiedProperties.add("unReturnCnt");
        this._unReturnCnt = unReturnCnt;
    }

    /**
     * [get] UN_RETURN_NUM: {BIGINT(19)} <br>
     * UN_返品数量
     * @return The value of the column 'UN_RETURN_NUM'. (NullAllowed)
     */
    public Long getUnReturnNum() {
        return _unReturnNum;
    }

    /**
     * [set] UN_RETURN_NUM: {BIGINT(19)} <br>
     * UN_返品数量
     * @param unReturnNum The value of the column 'UN_RETURN_NUM'. (NullAllowed)
     */
    public void setUnReturnNum(Long unReturnNum) {
        __modifiedProperties.add("unReturnNum");
        this._unReturnNum = unReturnNum;
    }

    /**
     * [get] SH_RETURN_CNT: {BIGINT(19)} <br>
     * SH_返品件数
     * @return The value of the column 'SH_RETURN_CNT'. (NullAllowed)
     */
    public Long getShReturnCnt() {
        return _shReturnCnt;
    }

    /**
     * [set] SH_RETURN_CNT: {BIGINT(19)} <br>
     * SH_返品件数
     * @param shReturnCnt The value of the column 'SH_RETURN_CNT'. (NullAllowed)
     */
    public void setShReturnCnt(Long shReturnCnt) {
        __modifiedProperties.add("shReturnCnt");
        this._shReturnCnt = shReturnCnt;
    }

    /**
     * [get] SH_RETURN_NUM: {BIGINT(19)} <br>
     * SH_返品数量
     * @return The value of the column 'SH_RETURN_NUM'. (NullAllowed)
     */
    public Long getShReturnNum() {
        return _shReturnNum;
    }

    /**
     * [set] SH_RETURN_NUM: {BIGINT(19)} <br>
     * SH_返品数量
     * @param shReturnNum The value of the column 'SH_RETURN_NUM'. (NullAllowed)
     */
    public void setShReturnNum(Long shReturnNum) {
        __modifiedProperties.add("shReturnNum");
        this._shReturnNum = shReturnNum;
    }

    /**
     * [get] HM_RETURN_CNT: {BIGINT(19)} <br>
     * HM関連_返品件数
     * @return The value of the column 'HM_RETURN_CNT'. (NullAllowed)
     */
    public Long getHmReturnCnt() {
        return _hmReturnCnt;
    }

    /**
     * [set] HM_RETURN_CNT: {BIGINT(19)} <br>
     * HM関連_返品件数
     * @param hmReturnCnt The value of the column 'HM_RETURN_CNT'. (NullAllowed)
     */
    public void setHmReturnCnt(Long hmReturnCnt) {
        __modifiedProperties.add("hmReturnCnt");
        this._hmReturnCnt = hmReturnCnt;
    }

    /**
     * [get] HM_RETURN_NUM: {BIGINT(19)} <br>
     * HM関連_返品数量
     * @return The value of the column 'HM_RETURN_NUM'. (NullAllowed)
     */
    public Long getHmReturnNum() {
        return _hmReturnNum;
    }

    /**
     * [set] HM_RETURN_NUM: {BIGINT(19)} <br>
     * HM関連_返品数量
     * @param hmReturnNum The value of the column 'HM_RETURN_NUM'. (NullAllowed)
     */
    public void setHmReturnNum(Long hmReturnNum) {
        __modifiedProperties.add("hmReturnNum");
        this._hmReturnNum = hmReturnNum;
    }

    /**
     * [get] TOTAL_RETURN_CNT: {BIGINT(19)} <br>
     * 合計返品件数
     * @return The value of the column 'TOTAL_RETURN_CNT'. (NullAllowed)
     */
    public Long getTotalReturnCnt() {
        return _totalReturnCnt;
    }

    /**
     * [set] TOTAL_RETURN_CNT: {BIGINT(19)} <br>
     * 合計返品件数
     * @param totalReturnCnt The value of the column 'TOTAL_RETURN_CNT'. (NullAllowed)
     */
    public void setTotalReturnCnt(Long totalReturnCnt) {
        __modifiedProperties.add("totalReturnCnt");
        this._totalReturnCnt = totalReturnCnt;
    }

    /**
     * [get] TOTAL_RETURN_NUM: {BIGINT(19)} <br>
     * 合計返品数量
     * @return The value of the column 'TOTAL_RETURN_NUM'. (NullAllowed)
     */
    public Long getTotalReturnNum() {
        return _totalReturnNum;
    }

    /**
     * [set] TOTAL_RETURN_NUM: {BIGINT(19)} <br>
     * 合計返品数量
     * @param totalReturnNum The value of the column 'TOTAL_RETURN_NUM'. (NullAllowed)
     */
    public void setTotalReturnNum(Long totalReturnNum) {
        __modifiedProperties.add("totalReturnNum");
        this._totalReturnNum = totalReturnNum;
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
