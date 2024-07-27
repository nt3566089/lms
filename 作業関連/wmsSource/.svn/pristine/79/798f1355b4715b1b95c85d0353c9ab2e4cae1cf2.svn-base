package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of t_bldl5130 as TABLE. <br>
 * BLDL5130
 * <pre>
 * [primary-key]
 *     BLDL5130_ID
 *
 * [column]
 *     BLDL5130_ID, YEARMONTH, BASE_NM, MONTH, CARRIER_CD, CARRIER_NM, ROW_NO, SHIPPING_DT, FW_STORE, FW_DIRECT, FW_TRANFER, SH_STORE, SH_DIRECT, SH_TRANFER, STORE_TOTAL, DIRECT_TOTAL, TRANSFER_TOTAL, KOGUCHI_DELIV, TOTAL_PACK_NUM, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     BLDL5130_ID
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
public abstract class BsTBldl5130Dto implements Serializable {

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
    /** BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _bldl5130Id;

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

    /** CARRIER_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierNm;

    /** ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _rowNo;

    /** SHIPPING_DT: {VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** FW_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _fwStore;

    /** FW_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _fwDirect;

    /** FW_TRANFER: {BIGINT(19)} */
    @JsonKey
    protected Long _fwTranfer;

    /** SH_STORE: {BIGINT(19)} */
    @JsonKey
    protected Long _shStore;

    /** SH_DIRECT: {BIGINT(19)} */
    @JsonKey
    protected Long _shDirect;

    /** SH_TRANFER: {BIGINT(19)} */
    @JsonKey
    protected Long _shTranfer;

    /** STORE_TOTAL: {BIGINT(19)} */
    @JsonKey
    protected Long _storeTotal;

    /** DIRECT_TOTAL: {BIGINT(19)} */
    @JsonKey
    protected Long _directTotal;

    /** TRANSFER_TOTAL: {BIGINT(19)} */
    @JsonKey
    protected Long _transferTotal;

    /** KOGUCHI_DELIV: {BIGINT(19)} */
    @JsonKey
    protected Long _koguchiDeliv;

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
    public BsTBldl5130Dto() {
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
        if (other == null || !(other instanceof BsTBldl5130Dto)) { return false; }
        final BsTBldl5130Dto otherEntity = (BsTBldl5130Dto)other;
        if (!helpComparingValue(getBldl5130Id(), otherEntity.getBldl5130Id())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_bldl5130");
        result = xCH(result, getBldl5130Id());
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
        sb.append(c).append(getBldl5130Id());
        sb.append(c).append(getYearmonth());
        sb.append(c).append(getBaseNm());
        sb.append(c).append(getMonth());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierNm());
        sb.append(c).append(getRowNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getFwStore());
        sb.append(c).append(getFwDirect());
        sb.append(c).append(getFwTranfer());
        sb.append(c).append(getShStore());
        sb.append(c).append(getShDirect());
        sb.append(c).append(getShTranfer());
        sb.append(c).append(getStoreTotal());
        sb.append(c).append(getDirectTotal());
        sb.append(c).append(getTransferTotal());
        sb.append(c).append(getKoguchiDeliv());
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
     * [get] BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5130ID
     * @return The value of the column 'BLDL5130_ID'. (NullAllowed)
     */
    public Long getBldl5130Id() {
        return _bldl5130Id;
    }

    /**
     * [set] BLDL5130_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * BLDL5130ID
     * @param bldl5130Id The value of the column 'BLDL5130_ID'. (NullAllowed)
     */
    public void setBldl5130Id(Long bldl5130Id) {
        __modifiedProperties.add("bldl5130Id");
        this._bldl5130Id = bldl5130Id;
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
     * [get] FW_TRANFER: {BIGINT(19)} <br>
     * FW転送
     * @return The value of the column 'FW_TRANFER'. (NullAllowed)
     */
    public Long getFwTranfer() {
        return _fwTranfer;
    }

    /**
     * [set] FW_TRANFER: {BIGINT(19)} <br>
     * FW転送
     * @param fwTranfer The value of the column 'FW_TRANFER'. (NullAllowed)
     */
    public void setFwTranfer(Long fwTranfer) {
        __modifiedProperties.add("fwTranfer");
        this._fwTranfer = fwTranfer;
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
     * [get] SH_TRANFER: {BIGINT(19)} <br>
     * SH転送
     * @return The value of the column 'SH_TRANFER'. (NullAllowed)
     */
    public Long getShTranfer() {
        return _shTranfer;
    }

    /**
     * [set] SH_TRANFER: {BIGINT(19)} <br>
     * SH転送
     * @param shTranfer The value of the column 'SH_TRANFER'. (NullAllowed)
     */
    public void setShTranfer(Long shTranfer) {
        __modifiedProperties.add("shTranfer");
        this._shTranfer = shTranfer;
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
     * [get] TRANSFER_TOTAL: {BIGINT(19)} <br>
     * 転送合計
     * @return The value of the column 'TRANSFER_TOTAL'. (NullAllowed)
     */
    public Long getTransferTotal() {
        return _transferTotal;
    }

    /**
     * [set] TRANSFER_TOTAL: {BIGINT(19)} <br>
     * 転送合計
     * @param transferTotal The value of the column 'TRANSFER_TOTAL'. (NullAllowed)
     */
    public void setTransferTotal(Long transferTotal) {
        __modifiedProperties.add("transferTotal");
        this._transferTotal = transferTotal;
    }

    /**
     * [get] KOGUCHI_DELIV: {BIGINT(19)} <br>
     * 戸口配送
     * @return The value of the column 'KOGUCHI_DELIV'. (NullAllowed)
     */
    public Long getKoguchiDeliv() {
        return _koguchiDeliv;
    }

    /**
     * [set] KOGUCHI_DELIV: {BIGINT(19)} <br>
     * 戸口配送
     * @param koguchiDeliv The value of the column 'KOGUCHI_DELIV'. (NullAllowed)
     */
    public void setKoguchiDeliv(Long koguchiDeliv) {
        __modifiedProperties.add("koguchiDeliv");
        this._koguchiDeliv = koguchiDeliv;
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
