package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl350k as TABLE. <br>
 * BLDL350K
 * <pre>
 * [primary-key]
 *     BLDL350K_ID
 *
 * [column]
 *     BLDL350K_ID, YEARMONTH, BASE_NM, MONTH, CONTRACTOR_NM, SHIPPING_DT, DESTINATION_NM, SHIPPING_NUM, SHIPPING_FEE, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL350K_ID
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
public abstract class BsTBldl350kDto implements Serializable {

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
    /** BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl350kId;

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

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** DESTINATION_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _destinationNm;

    /** SHIPPING_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingNum;

    /** SHIPPING_FEE: {BIGINT(19)} */
    @JsonKey
    protected Long _shippingFee;

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
    public BsTBldl350kDto() {
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
        if (other == null || !(other instanceof BsTBldl350kDto)) { return false; }
        final BsTBldl350kDto otherEntity = (BsTBldl350kDto)other;
        if (!helpComparingValue(getBldl350kId(), otherEntity.getBldl350kId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl350k");
        result = xCH(result, getBldl350kId());
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
        sb.append(c).append(getBldl350kId());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getContractorNm());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getDestinationNm());
        sb.append(c).append(getShippingNum());
        sb.append(c).append(getShippingFee());
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
     * [get] BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL350KID
     * @return The value of the column 'BLDL350K_ID'. (NullAllowed)
     */
    public Long getBldl350kId() {
        return _bldl350kId;
    }

    /**
     * [set] BLDL350K_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL350KID
     * @param bldl350kId The value of the column 'BLDL350K_ID'. (NullAllowed)
     */
    public void setBldl350kId(Long bldl350kId) {
        __modifiedProperties.add("bldl350kId");
        this._bldl350kId = bldl350kId;
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
     * 戸口契約先名
     * @return The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public String getContractorNm() {
        return _contractorNm;
    }

    /**
     * [set] CONTRACTOR_NM: {VARCHAR(60)} <br>
     * 戸口契約先名
     * @param contractorNm The value of the column 'CONTRACTOR_NM'. (NullAllowed)
     */
    public void setContractorNm(String contractorNm) {
        __modifiedProperties.add("contractorNm");
        this._contractorNm = contractorNm;
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
     * [get] DESTINATION_NM: {VARCHAR(60)} <br>
     * 送り先名
     * @return The value of the column 'DESTINATION_NM'. (NullAllowed)
     */
    public String getDestinationNm() {
        return _destinationNm;
    }

    /**
     * [set] DESTINATION_NM: {VARCHAR(60)} <br>
     * 送り先名
     * @param destinationNm The value of the column 'DESTINATION_NM'. (NullAllowed)
     */
    public void setDestinationNm(String destinationNm) {
        __modifiedProperties.add("destinationNm");
        this._destinationNm = destinationNm;
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
     * [get] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @return The value of the column 'SHIPPING_FEE'. (NullAllowed)
     */
    public Long getShippingFee() {
        return _shippingFee;
    }

    /**
     * [set] SHIPPING_FEE: {BIGINT(19)} <br>
     * 送料
     * @param shippingFee The value of the column 'SHIPPING_FEE'. (NullAllowed)
     */
    public void setShippingFee(Long shippingFee) {
        __modifiedProperties.add("shippingFee");
        this._shippingFee = shippingFee;
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
