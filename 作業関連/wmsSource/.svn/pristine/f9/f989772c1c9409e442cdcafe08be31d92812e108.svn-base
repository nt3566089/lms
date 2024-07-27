package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5100 as TABLE. <br>
 * BLDL5100
 * <pre>
 * [primary-key]
 *     BLDL5100_ID
 *
 * [column]
 *     BLDL5100_ID, YEARMONTH, BASE_NM, MONTH, CARRIER_CD, CARRIER_NM, SHIPPING_DT, FW_STORE, FW_DIRECT, UN_STORE, UN_DIRECT, SH_STORE, SH_DIRECT, HM_STORE, HM_DIRECT, TOTAL_STORE, TOTAL_DIRECT, KOGUCHI_INCLUDE, KOGUCHI_CONST, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5100_ID
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
public abstract class BsTBldl5100Dto implements Serializable {

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
    /** BLDL5100_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5100Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** BASE_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _baseNm;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierNm;

    /** SHIPPING_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingDt;

    /** FW_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _fwStore;

    /** FW_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _fwDirect;

    /** UN_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _unStore;

    /** UN_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _unDirect;

    /** SH_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _shStore;

    /** SH_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _shDirect;

    /** HM_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _hmStore;

    /** HM_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _hmDirect;

    /** TOTAL_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _totalStore;

    /** TOTAL_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _totalDirect;

    /** KOGUCHI_INCLUDE: {BIGINT(19)} */
    @JsonKey
    protected Long _koguchiInclude;

    /** KOGUCHI_CONST: {BIGINT(19)} */
    @JsonKey
    protected Long _koguchiConst;

    /** TOTAL_PACK_NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _totalPackNum;

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
    public BsTBldl5100Dto() {
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
        if (other == null || !(other instanceof BsTBldl5100Dto)) { return false; }
        final BsTBldl5100Dto otherEntity = (BsTBldl5100Dto)other;
        if (!helpComparingValue(getBldl5100Id(), otherEntity.getBldl5100Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5100");
        result = xCH(result, getBldl5100Id());
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
        sb.append(c).append(getBldl5100Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getFwStore());
        sb.append(c).append(getFwDirect());
        sb.append(c).append(getUnStore());
        sb.append(c).append(getUnDirect());
        sb.append(c).append(getShStore());
        sb.append(c).append(getShDirect());
        sb.append(c).append(getHmStore());
        sb.append(c).append(getHmDirect());
        sb.append(c).append(getTotalStore());
        sb.append(c).append(getTotalDirect());
        sb.append(c).append(getKoguchiInclude());
        sb.append(c).append(getKoguchiConst());
        sb.append(c).append(getTotalPackNum());
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
     * [get] BLDL5100_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5100ID
     * @return The value of the column 'BLDL5100_ID'. (NullAllowed)
     */
    public Long getBldl5100Id() {
        return _bldl5100Id;
    }

    /**
     * [set] BLDL5100_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5100ID
     * @param bldl5100Id The value of the column 'BLDL5100_ID'. (NullAllowed)
     */
    public void setBldl5100Id(Long bldl5100Id) {
        __modifiedProperties.add("bldl5100Id");
        this._bldl5100Id = bldl5100Id;
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
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送会社CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送会社CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_NM: {VARCHAR(30)} <br>
     * 運送会社名
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(30)} <br>
     * 運送会社名
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
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
     * [get] FW_STORE: {BIGINT(19)} <br>
     * FW店送り
     * @return The value of the column 'FW_STORE'. (NullAllowed)
     */
    public Long getFwStore() {
        return _fwStore;
    }

    /**
     * [set] FW_STORE: {BIGINT(19)} <br>
     * FW店送り
     * @param fwStore The value of the column 'FW_STORE'. (NullAllowed)
     */
    public void setFwStore(Long fwStore) {
        __modifiedProperties.add("fwStore");
        this._fwStore = fwStore;
    }

    /**
     * [get] FW_DIRECT: {BIGINT(19)} <br>
     * FW直送
     * @return The value of the column 'FW_DIRECT'. (NullAllowed)
     */
    public Long getFwDirect() {
        return _fwDirect;
    }

    /**
     * [set] FW_DIRECT: {BIGINT(19)} <br>
     * FW直送
     * @param fwDirect The value of the column 'FW_DIRECT'. (NullAllowed)
     */
    public void setFwDirect(Long fwDirect) {
        __modifiedProperties.add("fwDirect");
        this._fwDirect = fwDirect;
    }

    /**
     * [get] UN_STORE: {BIGINT(19)} <br>
     * UN店送り
     * @return The value of the column 'UN_STORE'. (NullAllowed)
     */
    public Long getUnStore() {
        return _unStore;
    }

    /**
     * [set] UN_STORE: {BIGINT(19)} <br>
     * UN店送り
     * @param unStore The value of the column 'UN_STORE'. (NullAllowed)
     */
    public void setUnStore(Long unStore) {
        __modifiedProperties.add("unStore");
        this._unStore = unStore;
    }

    /**
     * [get] UN_DIRECT: {BIGINT(19)} <br>
     * UN直送
     * @return The value of the column 'UN_DIRECT'. (NullAllowed)
     */
    public Long getUnDirect() {
        return _unDirect;
    }

    /**
     * [set] UN_DIRECT: {BIGINT(19)} <br>
     * UN直送
     * @param unDirect The value of the column 'UN_DIRECT'. (NullAllowed)
     */
    public void setUnDirect(Long unDirect) {
        __modifiedProperties.add("unDirect");
        this._unDirect = unDirect;
    }

    /**
     * [get] SH_STORE: {BIGINT(19)} <br>
     * SH店送り
     * @return The value of the column 'SH_STORE'. (NullAllowed)
     */
    public Long getShStore() {
        return _shStore;
    }

    /**
     * [set] SH_STORE: {BIGINT(19)} <br>
     * SH店送り
     * @param shStore The value of the column 'SH_STORE'. (NullAllowed)
     */
    public void setShStore(Long shStore) {
        __modifiedProperties.add("shStore");
        this._shStore = shStore;
    }

    /**
     * [get] SH_DIRECT: {BIGINT(19)} <br>
     * SH直送
     * @return The value of the column 'SH_DIRECT'. (NullAllowed)
     */
    public Long getShDirect() {
        return _shDirect;
    }

    /**
     * [set] SH_DIRECT: {BIGINT(19)} <br>
     * SH直送
     * @param shDirect The value of the column 'SH_DIRECT'. (NullAllowed)
     */
    public void setShDirect(Long shDirect) {
        __modifiedProperties.add("shDirect");
        this._shDirect = shDirect;
    }

    /**
     * [get] HM_STORE: {BIGINT(19)} <br>
     * HM店送り
     * @return The value of the column 'HM_STORE'. (NullAllowed)
     */
    public Long getHmStore() {
        return _hmStore;
    }

    /**
     * [set] HM_STORE: {BIGINT(19)} <br>
     * HM店送り
     * @param hmStore The value of the column 'HM_STORE'. (NullAllowed)
     */
    public void setHmStore(Long hmStore) {
        __modifiedProperties.add("hmStore");
        this._hmStore = hmStore;
    }

    /**
     * [get] HM_DIRECT: {BIGINT(19)} <br>
     * HM直送
     * @return The value of the column 'HM_DIRECT'. (NullAllowed)
     */
    public Long getHmDirect() {
        return _hmDirect;
    }

    /**
     * [set] HM_DIRECT: {BIGINT(19)} <br>
     * HM直送
     * @param hmDirect The value of the column 'HM_DIRECT'. (NullAllowed)
     */
    public void setHmDirect(Long hmDirect) {
        __modifiedProperties.add("hmDirect");
        this._hmDirect = hmDirect;
    }

    /**
     * [get] TOTAL_STORE: {BIGINT(19)} <br>
     * 店送り合計
     * @return The value of the column 'TOTAL_STORE'. (NullAllowed)
     */
    public Long getTotalStore() {
        return _totalStore;
    }

    /**
     * [set] TOTAL_STORE: {BIGINT(19)} <br>
     * 店送り合計
     * @param totalStore The value of the column 'TOTAL_STORE'. (NullAllowed)
     */
    public void setTotalStore(Long totalStore) {
        __modifiedProperties.add("totalStore");
        this._totalStore = totalStore;
    }

    /**
     * [get] TOTAL_DIRECT: {BIGINT(19)} <br>
     * 直送合計
     * @return The value of the column 'TOTAL_DIRECT'. (NullAllowed)
     */
    public Long getTotalDirect() {
        return _totalDirect;
    }

    /**
     * [set] TOTAL_DIRECT: {BIGINT(19)} <br>
     * 直送合計
     * @param totalDirect The value of the column 'TOTAL_DIRECT'. (NullAllowed)
     */
    public void setTotalDirect(Long totalDirect) {
        __modifiedProperties.add("totalDirect");
        this._totalDirect = totalDirect;
    }

    /**
     * [get] KOGUCHI_INCLUDE: {BIGINT(19)} <br>
     * 戸口配送(建設分を含む)
     * @return The value of the column 'KOGUCHI_INCLUDE'. (NullAllowed)
     */
    public Long getKoguchiInclude() {
        return _koguchiInclude;
    }

    /**
     * [set] KOGUCHI_INCLUDE: {BIGINT(19)} <br>
     * 戸口配送(建設分を含む)
     * @param koguchiInclude The value of the column 'KOGUCHI_INCLUDE'. (NullAllowed)
     */
    public void setKoguchiInclude(Long koguchiInclude) {
        __modifiedProperties.add("koguchiInclude");
        this._koguchiInclude = koguchiInclude;
    }

    /**
     * [get] KOGUCHI_CONST: {BIGINT(19)} <br>
     * 戸口配送(建設分)
     * @return The value of the column 'KOGUCHI_CONST'. (NullAllowed)
     */
    public Long getKoguchiConst() {
        return _koguchiConst;
    }

    /**
     * [set] KOGUCHI_CONST: {BIGINT(19)} <br>
     * 戸口配送(建設分)
     * @param koguchiConst The value of the column 'KOGUCHI_CONST'. (NullAllowed)
     */
    public void setKoguchiConst(Long koguchiConst) {
        __modifiedProperties.add("koguchiConst");
        this._koguchiConst = koguchiConst;
    }

    /**
     * [get] TOTAL_PACK_NUM: {BIGINT(19)} <br>
     * 総梱包数
     * @return The value of the column 'TOTAL_PACK_NUM'. (NullAllowed)
     */
    public Long getTotalPackNum() {
        return _totalPackNum;
    }

    /**
     * [set] TOTAL_PACK_NUM: {BIGINT(19)} <br>
     * 総梱包数
     * @param totalPackNum The value of the column 'TOTAL_PACK_NUM'. (NullAllowed)
     */
    public void setTotalPackNum(Long totalPackNum) {
        __modifiedProperties.add("totalPackNum");
        this._totalPackNum = totalPackNum;
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
