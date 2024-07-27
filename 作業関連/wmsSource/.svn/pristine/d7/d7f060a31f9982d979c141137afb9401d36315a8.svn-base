package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_shipping_record_h as TABLE. <br>
 * 出荷実績ヘッダ
 * <pre>
 * [primary-key]
 *     SHIPPING_RECORD_H_ID
 *
 * [column]
 *     SHIPPING_RECORD_H_ID, CLIENT_ID, SHIPPING_SLIP_NO, SALES_ORDER_NO, SHIPPING_DT, SHIPPING_STORAGE_SPACE_CD, NIZOROE_NO, DAIHYO_NIZOROE_NO, CARRIER_SLIP_NO, CARRIER_CD, CARRIER_RNM, SALES_NO2, DELIVERY_SLIP_NO, D_STR, I_STR, S4_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     SHIPPING_RECORD_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client
 *
 * [referrer-table]
 *     t_shipping_record_b
 *
 * [foreign-property]
 *     mClient
 *
 * [referrer-property]
 *     tShippingRecordBList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTShippingRecordHDto implements Serializable {

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
    /** SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _shippingRecordHId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** SALES_ORDER_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _salesOrderNo;

    /** SHIPPING_DT: {NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _shippingDt;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _nizoroeNo;

    /** DAIHYO_NIZOROE_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _daihyoNizoroeNo;

    /** CARRIER_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierSlipNo;

    /** CARRIER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierCd;

    /** CARRIER_RNM: {VARCHAR(60)} */
    @JsonKey
    protected String _carrierRnm;

    /** SALES_NO2: {VARCHAR(30)} */
    @JsonKey
    protected String _salesNo2;

    /** DELIVERY_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _deliverySlipNo;

    /** D_STR: {VARCHAR(60)} */
    @JsonKey
    protected String _dStr;

    /** I_STR: {VARCHAR(60)} */
    @JsonKey
    protected String _iStr;

    /** S4_SEND_FLG: {CHAR(1)} */
    @JsonKey
    protected String _s4SendFlg;

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
    public BsTShippingRecordHDto() {
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
    protected MClientDto _mClient;

    public MClientDto getMClient() {
        return _mClient;
    }

    public void setMClient(MClientDto mClient) {
        this._mClient = mClient;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TShippingRecordBDto> _tShippingRecordBList;

    public List<TShippingRecordBDto> getTShippingRecordBList() {
        if (_tShippingRecordBList == null) { _tShippingRecordBList = new ArrayList<TShippingRecordBDto>(); }
        return _tShippingRecordBList;
    }

    public void setTShippingRecordBList(List<TShippingRecordBDto> tShippingRecordBList) {
        this._tShippingRecordBList = tShippingRecordBList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTShippingRecordHDto)) { return false; }
        final BsTShippingRecordHDto otherEntity = (BsTShippingRecordHDto)other;
        if (!helpComparingValue(getShippingRecordHId(), otherEntity.getShippingRecordHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_shipping_record_h");
        result = xCH(result, getShippingRecordHId());
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
        sb.append(c).append(getShippingRecordHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getSalesOrderNo());
        sb.append(c).append(getShippingDt());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getNizoroeNo());
        sb.append(c).append(getDaihyoNizoroeNo());
        sb.append(c).append(getCarrierSlipNo());
        sb.append(c).append(getCarrierCd());
        sb.append(c).append(getCarrierRnm());
        sb.append(c).append(getSalesNo2());
        sb.append(c).append(getDeliverySlipNo());
        sb.append(c).append(getDStr());
        sb.append(c).append(getIStr());
        sb.append(c).append(getS4SendFlg());
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
     * [get] SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ヘッダID
     * @return The value of the column 'SHIPPING_RECORD_H_ID'. (NullAllowed)
     */
    public Long getShippingRecordHId() {
        return _shippingRecordHId;
    }

    /**
     * [set] SHIPPING_RECORD_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 出荷実績ヘッダID
     * @param shippingRecordHId The value of the column 'SHIPPING_RECORD_H_ID'. (NullAllowed)
     */
    public void setShippingRecordHId(Long shippingRecordHId) {
        __modifiedProperties.add("shippingRecordHId");
        this._shippingRecordHId = shippingRecordHId;
    }

    /**
     * [get] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public String getShippingSlipNo() {
        return _shippingSlipNo;
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        __modifiedProperties.add("shippingSlipNo");
        this._shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @return The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public String getSalesOrderNo() {
        return _salesOrderNo;
    }

    /**
     * [set] SALES_ORDER_NO: {VARCHAR(30)} <br>
     * 受注番号
     * @param salesOrderNo The value of the column 'SALES_ORDER_NO'. (NullAllowed)
     */
    public void setSalesOrderNo(String salesOrderNo) {
        __modifiedProperties.add("salesOrderNo");
        this._salesOrderNo = salesOrderNo;
    }

    /**
     * [get] SHIPPING_DT: {NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public String getShippingDt() {
        return _shippingDt;
    }

    /**
     * [set] SHIPPING_DT: {NotNull, VARCHAR(8)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed)
     */
    public void setShippingDt(String shippingDt) {
        __modifiedProperties.add("shippingDt");
        this._shippingDt = shippingDt;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getShippingStorageSpaceCd() {
        return _shippingStorageSpaceCd;
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        __modifiedProperties.add("shippingStorageSpaceCd");
        this._shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @return The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public String getNizoroeNo() {
        return _nizoroeNo;
    }

    /**
     * [set] NIZOROE_NO: {VARCHAR(30)} <br>
     * 荷揃番号
     * @param nizoroeNo The value of the column 'NIZOROE_NO'. (NullAllowed)
     */
    public void setNizoroeNo(String nizoroeNo) {
        __modifiedProperties.add("nizoroeNo");
        this._nizoroeNo = nizoroeNo;
    }

    /**
     * [get] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @return The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public String getDaihyoNizoroeNo() {
        return _daihyoNizoroeNo;
    }

    /**
     * [set] DAIHYO_NIZOROE_NO: {VARCHAR(30)} <br>
     * 代表荷揃番号
     * @param daihyoNizoroeNo The value of the column 'DAIHYO_NIZOROE_NO'. (NullAllowed)
     */
    public void setDaihyoNizoroeNo(String daihyoNizoroeNo) {
        __modifiedProperties.add("daihyoNizoroeNo");
        this._daihyoNizoroeNo = daihyoNizoroeNo;
    }

    /**
     * [get] CARRIER_SLIP_NO: {VARCHAR(30)} <br>
     * 運送便伝票番号
     * @return The value of the column 'CARRIER_SLIP_NO'. (NullAllowed)
     */
    public String getCarrierSlipNo() {
        return _carrierSlipNo;
    }

    /**
     * [set] CARRIER_SLIP_NO: {VARCHAR(30)} <br>
     * 運送便伝票番号
     * @param carrierSlipNo The value of the column 'CARRIER_SLIP_NO'. (NullAllowed)
     */
    public void setCarrierSlipNo(String carrierSlipNo) {
        __modifiedProperties.add("carrierSlipNo");
        this._carrierSlipNo = carrierSlipNo;
    }

    /**
     * [get] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @return The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public String getCarrierCd() {
        return _carrierCd;
    }

    /**
     * [set] CARRIER_CD: {VARCHAR(30)} <br>
     * 運送業者CD
     * @param carrierCd The value of the column 'CARRIER_CD'. (NullAllowed)
     */
    public void setCarrierCd(String carrierCd) {
        __modifiedProperties.add("carrierCd");
        this._carrierCd = carrierCd;
    }

    /**
     * [get] CARRIER_RNM: {VARCHAR(60)} <br>
     * 運送業者略称
     * @return The value of the column 'CARRIER_RNM'. (NullAllowed)
     */
    public String getCarrierRnm() {
        return _carrierRnm;
    }

    /**
     * [set] CARRIER_RNM: {VARCHAR(60)} <br>
     * 運送業者略称
     * @param carrierRnm The value of the column 'CARRIER_RNM'. (NullAllowed)
     */
    public void setCarrierRnm(String carrierRnm) {
        __modifiedProperties.add("carrierRnm");
        this._carrierRnm = carrierRnm;
    }

    /**
     * [get] SALES_NO2: {VARCHAR(30)} <br>
     * 売上番号２
     * @return The value of the column 'SALES_NO2'. (NullAllowed)
     */
    public String getSalesNo2() {
        return _salesNo2;
    }

    /**
     * [set] SALES_NO2: {VARCHAR(30)} <br>
     * 売上番号２
     * @param salesNo2 The value of the column 'SALES_NO2'. (NullAllowed)
     */
    public void setSalesNo2(String salesNo2) {
        __modifiedProperties.add("salesNo2");
        this._salesNo2 = salesNo2;
    }

    /**
     * [get] DELIVERY_SLIP_NO: {VARCHAR(30)} <br>
     * 納品書番号
     * @return The value of the column 'DELIVERY_SLIP_NO'. (NullAllowed)
     */
    public String getDeliverySlipNo() {
        return _deliverySlipNo;
    }

    /**
     * [set] DELIVERY_SLIP_NO: {VARCHAR(30)} <br>
     * 納品書番号
     * @param deliverySlipNo The value of the column 'DELIVERY_SLIP_NO'. (NullAllowed)
     */
    public void setDeliverySlipNo(String deliverySlipNo) {
        __modifiedProperties.add("deliverySlipNo");
        this._deliverySlipNo = deliverySlipNo;
    }

    /**
     * [get] D_STR: {VARCHAR(60)} <br>
     * D
     * @return The value of the column 'D_STR'. (NullAllowed)
     */
    public String getDStr() {
        return _dStr;
    }

    /**
     * [set] D_STR: {VARCHAR(60)} <br>
     * D
     * @param dStr The value of the column 'D_STR'. (NullAllowed)
     */
    public void setDStr(String dStr) {
        __modifiedProperties.add("DStr");
        this._dStr = dStr;
    }

    /**
     * [get] I_STR: {VARCHAR(60)} <br>
     * I
     * @return The value of the column 'I_STR'. (NullAllowed)
     */
    public String getIStr() {
        return _iStr;
    }

    /**
     * [set] I_STR: {VARCHAR(60)} <br>
     * I
     * @param iStr The value of the column 'I_STR'. (NullAllowed)
     */
    public void setIStr(String iStr) {
        __modifiedProperties.add("IStr");
        this._iStr = iStr;
    }

    /**
     * [get] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public String getS4SendFlg() {
        return _s4SendFlg;
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1)} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public void setS4SendFlg(String s4SendFlg) {
        __modifiedProperties.add("s4SendFlg");
        this._s4SendFlg = s4SendFlg;
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
