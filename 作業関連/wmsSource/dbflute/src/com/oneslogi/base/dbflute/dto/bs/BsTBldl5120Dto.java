package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5120 as TABLE. <br>
 * BLDL5120
 * <pre>
 * [primary-key]
 *     BLDL5120_ID
 *
 * [column]
 *     BLDL5120_ID, YEARMONTH, MONTH, CARRIER_CD, CARRIER_NM, ROW_NO, SHIPPING_DT, KAMATA_STORE, KAMATA_DIRECT, KASHIWA_STORE, KASHIWA_DIRECT, STORE_TOTAL, DIRECT_TOTAL, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5120_ID
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
public abstract class BsTBldl5120Dto implements Serializable {

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
    /** BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5120Id;

    /** YEARMONTH: {VARCHAR(30)} */
    @JsonKey
    protected String _yearmonth;

    /** MONTH: {VARCHAR(60)} */
    @JsonKey
    protected String _month;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierNm;

    /** ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** KAMATA_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _kamataStore;

    /** KAMATA_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _kamataDirect;

    /** KASHIWA_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _kashiwaStore;

    /** KASHIWA_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _kashiwaDirect;

    /** STORE_TOTAL: {BIGINT(19)} */
    @JsonKey
    protected Long _storeTotal;

    /** DIRECT_TOTAL: {BIGINT(19)} */
    @JsonKey
    protected Long _directTotal;

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
    public BsTBldl5120Dto() {
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
        if (other == null || !(other instanceof BsTBldl5120Dto)) { return false; }
        final BsTBldl5120Dto otherEntity = (BsTBldl5120Dto)other;
        if (!helpComparingValue(getBldl5120Id(), otherEntity.getBldl5120Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5120");
        result = xCH(result, getBldl5120Id());
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
        sb.append(c).append(getBldl5120Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getMonth());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getKamataStore());
        sb.append(c).append(getKamataDirect());
        sb.append(c).append(getKashiwaStore());
        sb.append(c).append(getKashiwaDirect());
        sb.append(c).append(getStoreTotal());
        sb.append(c).append(getDirectTotal());
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
     * [get] BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5120ID
     * @return The value of the column 'BLDL5120_ID'. (NullAllowed)
     */
    public Long getBldl5120Id() {
        return _bldl5120Id;
    }

    /**
     * [set] BLDL5120_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5120ID
     * @param bldl5120Id The value of the column 'BLDL5120_ID'. (NullAllowed)
     */
    public void setBldl5120Id(Long bldl5120Id) {
        __modifiedProperties.add("bldl5120Id");
        this._bldl5120Id = bldl5120Id;
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
     * [get] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送会社名
     * @return The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public String getCarrierNm() {
        return _carrierNm;
    }

    /**
     * [set] CARRIER_NM: {VARCHAR(60)} <br>
     * 運送会社名
     * @param carrierNm The value of the column 'CARRIER_NM'. (NullAllowed)
     */
    public void setCarrierNm(String carrierNm) {
        __modifiedProperties.add("carrierNm");
        this._carrierNm = carrierNm;
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
     * [get] KAMATA_STORE: {BIGINT(19)} <br>
     * 蓮田物流_店送り
     * @return The value of the column 'KAMATA_STORE'. (NullAllowed)
     */
    public Long getKamataStore() {
        return _kamataStore;
    }

    /**
     * [set] KAMATA_STORE: {BIGINT(19)} <br>
     * 蓮田物流_店送り
     * @param kamataStore The value of the column 'KAMATA_STORE'. (NullAllowed)
     */
    public void setKamataStore(Long kamataStore) {
        __modifiedProperties.add("kamataStore");
        this._kamataStore = kamataStore;
    }

    /**
     * [get] KAMATA_DIRECT: {BIGINT(19)} <br>
     * 蓮田物流_直送
     * @return The value of the column 'KAMATA_DIRECT'. (NullAllowed)
     */
    public Long getKamataDirect() {
        return _kamataDirect;
    }

    /**
     * [set] KAMATA_DIRECT: {BIGINT(19)} <br>
     * 蓮田物流_直送
     * @param kamataDirect The value of the column 'KAMATA_DIRECT'. (NullAllowed)
     */
    public void setKamataDirect(Long kamataDirect) {
        __modifiedProperties.add("kamataDirect");
        this._kamataDirect = kamataDirect;
    }

    /**
     * [get] KASHIWA_STORE: {BIGINT(19)} <br>
     * 柏SRC_店送り
     * @return The value of the column 'KASHIWA_STORE'. (NullAllowed)
     */
    public Long getKashiwaStore() {
        return _kashiwaStore;
    }

    /**
     * [set] KASHIWA_STORE: {BIGINT(19)} <br>
     * 柏SRC_店送り
     * @param kashiwaStore The value of the column 'KASHIWA_STORE'. (NullAllowed)
     */
    public void setKashiwaStore(Long kashiwaStore) {
        __modifiedProperties.add("kashiwaStore");
        this._kashiwaStore = kashiwaStore;
    }

    /**
     * [get] KASHIWA_DIRECT: {BIGINT(19)} <br>
     * 柏SRC_直送
     * @return The value of the column 'KASHIWA_DIRECT'. (NullAllowed)
     */
    public Long getKashiwaDirect() {
        return _kashiwaDirect;
    }

    /**
     * [set] KASHIWA_DIRECT: {BIGINT(19)} <br>
     * 柏SRC_直送
     * @param kashiwaDirect The value of the column 'KASHIWA_DIRECT'. (NullAllowed)
     */
    public void setKashiwaDirect(Long kashiwaDirect) {
        __modifiedProperties.add("kashiwaDirect");
        this._kashiwaDirect = kashiwaDirect;
    }

    /**
     * [get] STORE_TOTAL: {BIGINT(19)} <br>
     * 店送り合計
     * @return The value of the column 'STORE_TOTAL'. (NullAllowed)
     */
    public Long getStoreTotal() {
        return _storeTotal;
    }

    /**
     * [set] STORE_TOTAL: {BIGINT(19)} <br>
     * 店送り合計
     * @param storeTotal The value of the column 'STORE_TOTAL'. (NullAllowed)
     */
    public void setStoreTotal(Long storeTotal) {
        __modifiedProperties.add("storeTotal");
        this._storeTotal = storeTotal;
    }

    /**
     * [get] DIRECT_TOTAL: {BIGINT(19)} <br>
     * 直送合計
     * @return The value of the column 'DIRECT_TOTAL'. (NullAllowed)
     */
    public Long getDirectTotal() {
        return _directTotal;
    }

    /**
     * [set] DIRECT_TOTAL: {BIGINT(19)} <br>
     * 直送合計
     * @param directTotal The value of the column 'DIRECT_TOTAL'. (NullAllowed)
     */
    public void setDirectTotal(Long directTotal) {
        __modifiedProperties.add("directTotal");
        this._directTotal = directTotal;
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
