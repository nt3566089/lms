package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5660 as TABLE. <br>
 * BLDL5660
 * <pre>
 * [primary-key]
 *     BLDL5660_ID
 *
 * [column]
 *     BLDL5660_ID, YEARMONTH, BASE_NM, MONTH, ROW_NO, SHIPPING_DT, FW_SHIPPING_CNT, FW_SHIPPING_NUM, SH_SHIPPING_CNT, SH_SHIPPING_NUM, HM_SHIPPING_CNT, HM_SHIPPING_NUM, TOTAL_SHIPPING_CNT, TOTAL_SHIPPING_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5660_ID
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
public abstract class BsTBldl5660Dto implements Serializable {

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
    /** BLDL5660_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5660Id;

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

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** FW_SHIPPING_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _fwShippingCnt;

    /** FW_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _fwShippingNum;

    /** SH_SHIPPING_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _shShippingCnt;

    /** SH_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shShippingNum;

    /** HM_SHIPPING_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _hmShippingCnt;

    /** HM_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _hmShippingNum;

    /** TOTAL_SHIPPING_CNT: {BIGINT(19)} */
    @JsonKey
    protected Long _totalShippingCnt;

    /** TOTAL_SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalShippingNum;

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
    public BsTBldl5660Dto() {
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
        if (other == null || !(other instanceof BsTBldl5660Dto)) { return false; }
        final BsTBldl5660Dto otherEntity = (BsTBldl5660Dto)other;
        if (!helpComparingValue(getBldl5660Id(), otherEntity.getBldl5660Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5660");
        result = xCH(result, getBldl5660Id());
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
        sb.append(c).append(getBldl5660Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getFwShippingCnt());
        sb.append(c).append(getFwShippingNum());
        sb.append(c).append(getShShippingCnt());
        sb.append(c).append(getShShippingNum());
        sb.append(c).append(getHmShippingCnt());
        sb.append(c).append(getHmShippingNum());
        sb.append(c).append(getTotalShippingCnt());
        sb.append(c).append(getTotalShippingNum());
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
     * [get] BLDL5660_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5660ID
     * @return The value of the column 'BLDL5660_ID'. (NullAllowed)
     */
    public Long getBldl5660Id() {
        return _bldl5660Id;
    }

    /**
     * [set] BLDL5660_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5660ID
     * @param bldl5660Id The value of the column 'BLDL5660_ID'. (NullAllowed)
     */
    public void setBldl5660Id(Long bldl5660Id) {
        __modifiedProperties.add("bldl5660Id");
        this._bldl5660Id = bldl5660Id;
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
     * [get] FW_SHIPPING_CNT: {BIGINT(19)} <br>
     * FW関連_出荷件数
     * @return The value of the column 'FW_SHIPPING_CNT'. (NullAllowed)
     */
    public Long getFwShippingCnt() {
        return _fwShippingCnt;
    }

    /**
     * [set] FW_SHIPPING_CNT: {BIGINT(19)} <br>
     * FW関連_出荷件数
     * @param fwShippingCnt The value of the column 'FW_SHIPPING_CNT'. (NullAllowed)
     */
    public void setFwShippingCnt(Long fwShippingCnt) {
        __modifiedProperties.add("fwShippingCnt");
        this._fwShippingCnt = fwShippingCnt;
    }

    /**
     * [get] FW_SHIPPING_NUM: {BIGINT(19)} <br>
     * FW関連_出荷数量
     * @return The value of the column 'FW_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getFwShippingNum() {
        return _fwShippingNum;
    }

    /**
     * [set] FW_SHIPPING_NUM: {BIGINT(19)} <br>
     * FW関連_出荷数量
     * @param fwShippingNum The value of the column 'FW_SHIPPING_NUM'. (NullAllowed)
     */
    public void setFwShippingNum(Long fwShippingNum) {
        __modifiedProperties.add("fwShippingNum");
        this._fwShippingNum = fwShippingNum;
    }

    /**
     * [get] SH_SHIPPING_CNT: {BIGINT(19)} <br>
     * SH関連_出荷件数
     * @return The value of the column 'SH_SHIPPING_CNT'. (NullAllowed)
     */
    public Long getShShippingCnt() {
        return _shShippingCnt;
    }

    /**
     * [set] SH_SHIPPING_CNT: {BIGINT(19)} <br>
     * SH関連_出荷件数
     * @param shShippingCnt The value of the column 'SH_SHIPPING_CNT'. (NullAllowed)
     */
    public void setShShippingCnt(Long shShippingCnt) {
        __modifiedProperties.add("shShippingCnt");
        this._shShippingCnt = shShippingCnt;
    }

    /**
     * [get] SH_SHIPPING_NUM: {BIGINT(19)} <br>
     * SH関連_出荷数量
     * @return The value of the column 'SH_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getShShippingNum() {
        return _shShippingNum;
    }

    /**
     * [set] SH_SHIPPING_NUM: {BIGINT(19)} <br>
     * SH関連_出荷数量
     * @param shShippingNum The value of the column 'SH_SHIPPING_NUM'. (NullAllowed)
     */
    public void setShShippingNum(Long shShippingNum) {
        __modifiedProperties.add("shShippingNum");
        this._shShippingNum = shShippingNum;
    }

    /**
     * [get] HM_SHIPPING_CNT: {BIGINT(19)} <br>
     * HM関連_出荷件数
     * @return The value of the column 'HM_SHIPPING_CNT'. (NullAllowed)
     */
    public Long getHmShippingCnt() {
        return _hmShippingCnt;
    }

    /**
     * [set] HM_SHIPPING_CNT: {BIGINT(19)} <br>
     * HM関連_出荷件数
     * @param hmShippingCnt The value of the column 'HM_SHIPPING_CNT'. (NullAllowed)
     */
    public void setHmShippingCnt(Long hmShippingCnt) {
        __modifiedProperties.add("hmShippingCnt");
        this._hmShippingCnt = hmShippingCnt;
    }

    /**
     * [get] HM_SHIPPING_NUM: {BIGINT(19)} <br>
     * HM関連_出荷数量
     * @return The value of the column 'HM_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getHmShippingNum() {
        return _hmShippingNum;
    }

    /**
     * [set] HM_SHIPPING_NUM: {BIGINT(19)} <br>
     * HM関連_出荷数量
     * @param hmShippingNum The value of the column 'HM_SHIPPING_NUM'. (NullAllowed)
     */
    public void setHmShippingNum(Long hmShippingNum) {
        __modifiedProperties.add("hmShippingNum");
        this._hmShippingNum = hmShippingNum;
    }

    /**
     * [get] TOTAL_SHIPPING_CNT: {BIGINT(19)} <br>
     * 当日合計_出荷件数
     * @return The value of the column 'TOTAL_SHIPPING_CNT'. (NullAllowed)
     */
    public Long getTotalShippingCnt() {
        return _totalShippingCnt;
    }

    /**
     * [set] TOTAL_SHIPPING_CNT: {BIGINT(19)} <br>
     * 当日合計_出荷件数
     * @param totalShippingCnt The value of the column 'TOTAL_SHIPPING_CNT'. (NullAllowed)
     */
    public void setTotalShippingCnt(Long totalShippingCnt) {
        __modifiedProperties.add("totalShippingCnt");
        this._totalShippingCnt = totalShippingCnt;
    }

    /**
     * [get] TOTAL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 当日合計_出荷数量
     * @return The value of the column 'TOTAL_SHIPPING_NUM'. (NullAllowed)
     */
    public Long getTotalShippingNum() {
        return _totalShippingNum;
    }

    /**
     * [set] TOTAL_SHIPPING_NUM: {BIGINT(19)} <br>
     * 当日合計_出荷数量
     * @param totalShippingNum The value of the column 'TOTAL_SHIPPING_NUM'. (NullAllowed)
     */
    public void setTotalShippingNum(Long totalShippingNum) {
        __modifiedProperties.add("totalShippingNum");
        this._totalShippingNum = totalShippingNum;
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
