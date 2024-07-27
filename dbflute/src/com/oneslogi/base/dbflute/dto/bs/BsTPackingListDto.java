package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_packing_list as TABLE. <br>
 * 梱包明細情報
 * <pre>
 * [primary-key]
 *     PACKING_LIST_ID
 *
 * [column]
 *     PACKING_LIST_ID, CLIENT_ID, SHIPPING_SLIP_NO, PACKING_NO, PACKING_ROW_NO, SHIPPING_SLIP_ROW_NO, SHIPPING_SLIP_ROW_NO_SN, PRODUCT_CD, NUM, CARRIER_SLIP_NO, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     PACKING_LIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     mClient
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTPackingListDto implements Serializable {

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
    /** PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _packingListId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipNo;

    /** PACKING_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _packingNo;

    /** PACKING_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _packingRowNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipRowNo;

    /** SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingSlipRowNoSn;

    /** PRODUCT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _productCd;

    /** NUM: {BIGINT(19)} */
    @JsonKey
    protected Long _num;

    /** CARRIER_SLIP_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _carrierSlipNo;

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
    public BsTPackingListDto() {
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
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTPackingListDto)) { return false; }
        final BsTPackingListDto otherEntity = (BsTPackingListDto)other;
        if (!helpComparingValue(getPackingListId(), otherEntity.getPackingListId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_packing_list");
        result = xCH(result, getPackingListId());
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
        sb.append(c).append(getPackingListId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getShippingSlipNo());
        sb.append(c).append(getPackingNo());
        sb.append(c).append(getPackingRowNo());
        sb.append(c).append(getShippingSlipRowNo());
        sb.append(c).append(getShippingSlipRowNoSn());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getNum());
        sb.append(c).append(getCarrierSlipNo());
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
     * [get] PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包明細ID
     * @return The value of the column 'PACKING_LIST_ID'. (NullAllowed)
     */
    public Long getPackingListId() {
        return _packingListId;
    }

    /**
     * [set] PACKING_LIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 梱包明細ID
     * @param packingListId The value of the column 'PACKING_LIST_ID'. (NullAllowed)
     */
    public void setPackingListId(Long packingListId) {
        __modifiedProperties.add("packingListId");
        this._packingListId = packingListId;
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
     * [get] PACKING_NO: {VARCHAR(30)} <br>
     * 梱包番号
     * @return The value of the column 'PACKING_NO'. (NullAllowed)
     */
    public String getPackingNo() {
        return _packingNo;
    }

    /**
     * [set] PACKING_NO: {VARCHAR(30)} <br>
     * 梱包番号
     * @param packingNo The value of the column 'PACKING_NO'. (NullAllowed)
     */
    public void setPackingNo(String packingNo) {
        __modifiedProperties.add("packingNo");
        this._packingNo = packingNo;
    }

    /**
     * [get] PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 梱包明細番号
     * @return The value of the column 'PACKING_ROW_NO'. (NullAllowed)
     */
    public String getPackingRowNo() {
        return _packingRowNo;
    }

    /**
     * [set] PACKING_ROW_NO: {VARCHAR(30)} <br>
     * 梱包明細番号
     * @param packingRowNo The value of the column 'PACKING_ROW_NO'. (NullAllowed)
     */
    public void setPackingRowNo(String packingRowNo) {
        __modifiedProperties.add("packingRowNo");
        this._packingRowNo = packingRowNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed)
     */
    public String getShippingSlipRowNo() {
        return _shippingSlipRowNo;
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @param shippingSlipRowNo The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed)
     */
    public void setShippingSlipRowNo(String shippingSlipRowNo) {
        __modifiedProperties.add("shippingSlipRowNo");
        this._shippingSlipRowNo = shippingSlipRowNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} <br>
     * 出荷伝票明細番号連番
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO_SN'. (NullAllowed)
     */
    public String getShippingSlipRowNoSn() {
        return _shippingSlipRowNoSn;
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO_SN: {VARCHAR(30)} <br>
     * 出荷伝票明細番号連番
     * @param shippingSlipRowNoSn The value of the column 'SHIPPING_SLIP_ROW_NO_SN'. (NullAllowed)
     */
    public void setShippingSlipRowNoSn(String shippingSlipRowNoSn) {
        __modifiedProperties.add("shippingSlipRowNoSn");
        this._shippingSlipRowNoSn = shippingSlipRowNoSn;
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
