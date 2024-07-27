package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_transfer as TABLE. <br>
 * 振替情報
 * <pre>
 * [primary-key]
 *     TRANSFER_ID
 *
 * [column]
 *     TRANSFER_ID, CLIENT_ID, PRODUCT_CD, STOCK_TRANSFER_DT, RECEIVE_PLANT_CD, RECEIVE_STORAGE_SPACE_CD, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, TRANSFER_TYPE_CD, NUM, HINMOKU_GROUP, JAN_CD, PRODUCT_NM, S4_SEND_FLG, LOCATION_CD1, LOCATION_CD2, USER_CD, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     TRANSFER_ID
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
public abstract class BsTTransferDto implements Serializable {

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
    /** TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _transferId;

    /** CLIENT_ID: {IX, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** PRODUCT_CD: {VARCHAR(100)} */
    @JsonKey
    protected String _productCd;

    /** STOCK_TRANSFER_DT: {VARCHAR(30)} */
    @JsonKey
    protected String _stockTransferDt;

    /** RECEIVE_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _receivePlantCd;

    /** RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _receiveStorageSpaceCd;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _shippingStorageSpaceCd;

    /** TRANSFER_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _transferTypeCd;

    /** NUM: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _num;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    @JsonKey
    protected String _hinmokuGroup;

    /** JAN_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _janCd;

    /** PRODUCT_NM: {VARCHAR(60)} */
    @JsonKey
    protected String _productNm;

    /** S4_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _s4SendFlg;

    /** LOCATION_CD1: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd1;

    /** LOCATION_CD2: {VARCHAR(30)} */
    @JsonKey
    protected String _locationCd2;

    /** USER_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _userCd;

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
    public BsTTransferDto() {
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
        if (other == null || !(other instanceof BsTTransferDto)) { return false; }
        final BsTTransferDto otherEntity = (BsTTransferDto)other;
        if (!helpComparingValue(getTransferId(), otherEntity.getTransferId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_transfer");
        result = xCH(result, getTransferId());
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
        sb.append(c).append(getTransferId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getProductCd());
        sb.append(c).append(getStockTransferDt());
        sb.append(c).append(getReceivePlantCd());
        sb.append(c).append(getReceiveStorageSpaceCd());
        sb.append(c).append(getShippingPlantCd());
        sb.append(c).append(getShippingStorageSpaceCd());
        sb.append(c).append(getTransferTypeCd());
        sb.append(c).append(getNum());
        sb.append(c).append(getHinmokuGroup());
        sb.append(c).append(getJanCd());
        sb.append(c).append(getProductNm());
        sb.append(c).append(getS4SendFlg());
        sb.append(c).append(getLocationCd1());
        sb.append(c).append(getLocationCd2());
        sb.append(c).append(getUserCd());
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
     * [get] TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 振替ID
     * @return The value of the column 'TRANSFER_ID'. (NullAllowed)
     */
    public Long getTransferId() {
        return _transferId;
    }

    /**
     * [set] TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 振替ID
     * @param transferId The value of the column 'TRANSFER_ID'. (NullAllowed)
     */
    public void setTransferId(Long transferId) {
        __modifiedProperties.add("transferId");
        this._transferId = transferId;
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
     * [get] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @return The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public String getProductCd() {
        return _productCd;
    }

    /**
     * [set] PRODUCT_CD: {VARCHAR(100)} <br>
     * 商品CD
     * @param productCd The value of the column 'PRODUCT_CD'. (NullAllowed)
     */
    public void setProductCd(String productCd) {
        __modifiedProperties.add("productCd");
        this._productCd = productCd;
    }

    /**
     * [get] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日
     * @return The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed)
     */
    public String getStockTransferDt() {
        return _stockTransferDt;
    }

    /**
     * [set] STOCK_TRANSFER_DT: {VARCHAR(30)} <br>
     * 在庫移動日
     * @param stockTransferDt The value of the column 'STOCK_TRANSFER_DT'. (NullAllowed)
     */
    public void setStockTransferDt(String stockTransferDt) {
        __modifiedProperties.add("stockTransferDt");
        this._stockTransferDt = stockTransferDt;
    }

    /**
     * [get] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @return The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed)
     */
    public String getReceivePlantCd() {
        return _receivePlantCd;
    }

    /**
     * [set] RECEIVE_PLANT_CD: {VARCHAR(30)} <br>
     * 入庫プラント
     * @param receivePlantCd The value of the column 'RECEIVE_PLANT_CD'. (NullAllowed)
     */
    public void setReceivePlantCd(String receivePlantCd) {
        __modifiedProperties.add("receivePlantCd");
        this._receivePlantCd = receivePlantCd;
    }

    /**
     * [get] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @return The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getReceiveStorageSpaceCd() {
        return _receiveStorageSpaceCd;
    }

    /**
     * [set] RECEIVE_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 入庫保管場所
     * @param receiveStorageSpaceCd The value of the column 'RECEIVE_STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setReceiveStorageSpaceCd(String receiveStorageSpaceCd) {
        __modifiedProperties.add("receiveStorageSpaceCd");
        this._receiveStorageSpaceCd = receiveStorageSpaceCd;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public String getShippingPlantCd() {
        return _shippingPlantCd;
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        __modifiedProperties.add("shippingPlantCd");
        this._shippingPlantCd = shippingPlantCd;
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
     * [get] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @return The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public String getTransferTypeCd() {
        return _transferTypeCd;
    }

    /**
     * [set] TRANSFER_TYPE_CD: {VARCHAR(30)} <br>
     * 移動タイプ
     * @param transferTypeCd The value of the column 'TRANSFER_TYPE_CD'. (NullAllowed)
     */
    public void setTransferTypeCd(String transferTypeCd) {
        __modifiedProperties.add("transferTypeCd");
        this._transferTypeCd = transferTypeCd;
    }

    /**
     * [get] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @return The value of the column 'NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getNum() {
        return _num;
    }

    /**
     * [set] NUM: {DECIMAL(14, 4)} <br>
     * 数量
     * @param num The value of the column 'NUM'. (NullAllowed)
     */
    public void setNum(java.math.BigDecimal num) {
        __modifiedProperties.add("num");
        this._num = num;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public String getHinmokuGroup() {
        return _hinmokuGroup;
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        __modifiedProperties.add("hinmokuGroup");
        this._hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @return The value of the column 'JAN_CD'. (NullAllowed)
     */
    public String getJanCd() {
        return _janCd;
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANコード
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed)
     */
    public void setJanCd(String janCd) {
        __modifiedProperties.add("janCd");
        this._janCd = janCd;
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
     * [get] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @return The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public String getS4SendFlg() {
        return _s4SendFlg;
    }

    /**
     * [set] S4_SEND_FLG: {CHAR(1), default=[0]} <br>
     * S4送信済フラグ
     * @param s4SendFlg The value of the column 'S4_SEND_FLG'. (NullAllowed)
     */
    public void setS4SendFlg(String s4SendFlg) {
        __modifiedProperties.add("s4SendFlg");
        this._s4SendFlg = s4SendFlg;
    }

    /**
     * [get] LOCATION_CD1: {VARCHAR(30)} <br>
     * 移動前ロケーション
     * @return The value of the column 'LOCATION_CD1'. (NullAllowed)
     */
    public String getLocationCd1() {
        return _locationCd1;
    }

    /**
     * [set] LOCATION_CD1: {VARCHAR(30)} <br>
     * 移動前ロケーション
     * @param locationCd1 The value of the column 'LOCATION_CD1'. (NullAllowed)
     */
    public void setLocationCd1(String locationCd1) {
        __modifiedProperties.add("locationCd1");
        this._locationCd1 = locationCd1;
    }

    /**
     * [get] LOCATION_CD2: {VARCHAR(30)} <br>
     * 移動後ロケーション
     * @return The value of the column 'LOCATION_CD2'. (NullAllowed)
     */
    public String getLocationCd2() {
        return _locationCd2;
    }

    /**
     * [set] LOCATION_CD2: {VARCHAR(30)} <br>
     * 移動後ロケーション
     * @param locationCd2 The value of the column 'LOCATION_CD2'. (NullAllowed)
     */
    public void setLocationCd2(String locationCd2) {
        __modifiedProperties.add("locationCd2");
        this._locationCd2 = locationCd2;
    }

    /**
     * [get] USER_CD: {VARCHAR(30)} <br>
     * 担当者
     * @return The value of the column 'USER_CD'. (NullAllowed)
     */
    public String getUserCd() {
        return _userCd;
    }

    /**
     * [set] USER_CD: {VARCHAR(30)} <br>
     * 担当者
     * @param userCd The value of the column 'USER_CD'. (NullAllowed)
     */
    public void setUserCd(String userCd) {
        __modifiedProperties.add("userCd");
        this._userCd = userCd;
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
