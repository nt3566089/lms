package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5250 as TABLE. <br>
 * BLDL5250
 * <pre>
 * [primary-key]
 *     BLDL5250_ID
 *
 * [column]
 *     BLDL5250_ID, YEARMONTH, BASE_NM, MONTH, TRANSFER_TYPE_CD, TRANSFER_DT, BEFORE_LOC_CD, AFTER_LOC_CD, PRODUCT_CD, PRODUCT_NM, NUM, CASE_NUM, UNIT_NUM, USER_NM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5250_ID
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
public abstract class BsTBldl5250Dto implements Serializable {

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
    /** BLDL5250_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5250Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** TRANSFER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transferTypeCd;

    /** TRANSFER_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _transferDt;

    /** BEFORE_LOC_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _beforeLocCd;

    /** AFTER_LOC_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _afterLocCd;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _num;

    /** CASE_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _caseNum;

    /** UNIT_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _unitNum;

    /** USER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _userNm;

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
    public BsTBldl5250Dto() {
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
        if (other == null || !(other instanceof BsTBldl5250Dto)) { return false; }
        final BsTBldl5250Dto otherEntity = (BsTBldl5250Dto)other;
        if (!helpComparingValue(getBldl5250Id(), otherEntity.getBldl5250Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5250");
        result = xCH(result, getBldl5250Id());
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
        sb.append(c).append(getBldl5250Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getTransferTypeCd());
        sb.append(c).append(getTransferDt());
        sb.append(c).append(getBeforeLocCd());
        sb.append(c).append(getAfterLocCd());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getNum());
        sb.append(c).append(getCaseNum());
        sb.append(c).append(getUnitNum());
        sb.append(c).append(getUserNm());
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
     * [get] BLDL5250_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5250ID
     * @return The value of the column 'BLDL5250_ID'. (NullAllowed)
     */
    public Long getBldl5250Id() {
        return _bldl5250Id;
    }

    /**
     * [set] BLDL5250_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5250ID
     * @param bldl5250Id The value of the column 'BLDL5250_ID'. (NullAllowed)
     */
    public void setBldl5250Id(Long bldl5250Id) {
        __modifiedProperties.add("bldl5250Id");
        this._bldl5250Id = bldl5250Id;
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
     * [get] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動種別
     * @return The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public String getTransferTypeCd() {
        return _transferTypeCd;
    }

    /**
     * [set] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動種別
     * @param transferTypeCd The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public void setTransferTypeCd(String transferTypeCd) {
        __modifiedProperties.add("transferTypeCd");
        this._transferTypeCd = transferTypeCd;
    }

    /**
     * [get] TRANSFER_DT: {VARCHAR(8)} <br>
     * 移動日
     * @return The value of the column 'TRANSFER_DT'. (NullAllowed)
     */
    public String getTransferDt() {
        return _transferDt;
    }

    /**
     * [set] TRANSFER_DT: {VARCHAR(8)} <br>
     * 移動日
     * @param transferDt The value of the column 'TRANSFER_DT'. (NullAllowed)
     */
    public void setTransferDt(String transferDt) {
        __modifiedProperties.add("transferDt");
        this._transferDt = transferDt;
    }

    /**
     * [get] BEFORE_LOC_CD: {VARCHAR(30)} <br>
     * 移動元ロケ
     * @return The value of the column 'BEFORE_LOC_CD'. (NullAllowed)
     */
    public String getBeforeLocCd() {
        return _beforeLocCd;
    }

    /**
     * [set] BEFORE_LOC_CD: {VARCHAR(30)} <br>
     * 移動元ロケ
     * @param beforeLocCd The value of the column 'BEFORE_LOC_CD'. (NullAllowed)
     */
    public void setBeforeLocCd(String beforeLocCd) {
        __modifiedProperties.add("beforeLocCd");
        this._beforeLocCd = beforeLocCd;
    }

    /**
     * [get] AFTER_LOC_CD: {VARCHAR(30)} <br>
     * 移動先ロケ
     * @return The value of the column 'AFTER_LOC_CD'. (NullAllowed)
     */
    public String getAfterLocCd() {
        return _afterLocCd;
    }

    /**
     * [set] AFTER_LOC_CD: {VARCHAR(30)} <br>
     * 移動先ロケ
     * @param afterLocCd The value of the column 'AFTER_LOC_CD'. (NullAllowed)
     */
    public void setAfterLocCd(String afterLocCd) {
        __modifiedProperties.add("afterLocCd");
        this._afterLocCd = afterLocCd;
    }

    /**
     * [get] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(30)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
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
     * [get] NUM: {BIGINT(19)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public Long getNum() {
        return _num;
    }

    /**
     * [set] NUM: {BIGINT(19)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(Long num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] CASE_NUM: {BIGINT(19)} <br>
     * ケース数
     * @return The value of the column 'CASE_NUM'. (NullAllowed)
     */
    public Long getCaseNum() {
        return _caseNum;
    }

    /**
     * [set] CASE_NUM: {BIGINT(19)} <br>
     * ケース数
     * @param caseNum The value of the column 'CASE_NUM'. (NullAllowed)
     */
    public void setCaseNum(Long caseNum) {
        __modifiedProperties.add("caseNum");
        this._caseNum = caseNum;
    }

    /**
     * [get] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @return The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public Long getUnitNum() {
        return _unitNum;
    }

    /**
     * [set] UNIT_NUM: {BIGINT(19)} <br>
     * 入数
     * @param unitNum The value of the column 'UNIT_NUM'. (NullAllowed)
     */
    public void setUnitNum(Long unitNum) {
        __modifiedProperties.add("unitNum");
        this._unitNum = unitNum;
    }

    /**
     * [get] USER_NM: {VARCHAR(60)} <br>
     * 作業者名称
     * @return The value of the column 'USER_NM'. (NullAllowed)
     */
    public String getUserNm() {
        return _userNm;
    }

    /**
     * [set] USER_NM: {VARCHAR(60)} <br>
     * 作業者名称
     * @param userNm The value of the column 'USER_NM'. (NullAllowed)
     */
    public void setUserNm(String userNm) {
        __modifiedProperties.add("userNm");
        this._userNm = userNm;
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
