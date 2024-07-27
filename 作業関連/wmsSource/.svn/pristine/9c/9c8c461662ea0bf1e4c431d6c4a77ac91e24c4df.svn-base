package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_inventory_h as TABLE. <br>
 * 棚卸ヘッダ
 * <pre>
 * [primary-key]
 *     INVENTORY_H_ID
 *
 * [column]
 *     INVENTORY_H_ID, CLIENT_ID, CENTER_ID, BATCH_NUM, INVENTORY_DT, PLANT_CD, STORAGE_SPACE_CD, INVENTORY_INST_NO, INVENTORY_STATUS_TYPE_ID, INVENTORY_STATUS_TYPE_CD, INST_RECV_TIME, REPORT_SEND_TIME, INVENTORY_UPDATE_FLG, INVENTORY_DATA_STATUS, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_H_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     m_client, m_center
 *
 * [referrer-table]
 *     t_inventory_b, t_inventory_inst
 *
 * [foreign-property]
 *     mClient, mCenter
 *
 * [referrer-property]
 *     tInventoryBList, tInventoryInstList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryHDto implements Serializable {

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
    /** INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryHId;

    /** CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} */
    @JsonKey
    protected Long _clientId;

    /** CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} */
    @JsonKey
    protected Long _centerId;

    /** BATCH_NUM: {NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _batchNum;

    /** INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _inventoryDt;

    /** PLANT_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _plantCd;

    /** STORAGE_SPACE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _storageSpaceCd;

    /** INVENTORY_INST_NO: {VARCHAR(30)} */
    @JsonKey
    protected String _inventoryInstNo;

    /** INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} */
    @JsonKey
    protected Long _inventoryStatusTypeId;

    /** INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} */
    @JsonKey
    protected String _inventoryStatusTypeCd;

    /** INST_RECV_TIME: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _instRecvTime;

    /** REPORT_SEND_TIME: {DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _reportSendTime;

    /** INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _inventoryUpdateFlg;

    /** INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} */
    @JsonKey
    protected String _inventoryDataStatus;

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
    public BsTInventoryHDto() {
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

    protected MCenterDto _mCenter;

    public MCenterDto getMCenter() {
        return _mCenter;
    }

    public void setMCenter(MCenterDto mCenter) {
        this._mCenter = mCenter;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TInventoryBDto> _tInventoryBList;

    public List<TInventoryBDto> getTInventoryBList() {
        if (_tInventoryBList == null) { _tInventoryBList = new ArrayList<TInventoryBDto>(); }
        return _tInventoryBList;
    }

    public void setTInventoryBList(List<TInventoryBDto> tInventoryBList) {
        this._tInventoryBList = tInventoryBList;
    }

    protected List<TInventoryInstDto> _tInventoryInstList;

    public List<TInventoryInstDto> getTInventoryInstList() {
        if (_tInventoryInstList == null) { _tInventoryInstList = new ArrayList<TInventoryInstDto>(); }
        return _tInventoryInstList;
    }

    public void setTInventoryInstList(List<TInventoryInstDto> tInventoryInstList) {
        this._tInventoryInstList = tInventoryInstList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryHDto)) { return false; }
        final BsTInventoryHDto otherEntity = (BsTInventoryHDto)other;
        if (!helpComparingValue(getInventoryHId(), otherEntity.getInventoryHId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_inventory_h");
        result = xCH(result, getInventoryHId());
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
        sb.append(c).append(getInventoryHId());
        sb.append(c).append(getClientId());
        sb.append(c).append(getCenterId());
        sb.append(c).append(getBatchNum());
        sb.append(c).append(getInventoryDt());
        sb.append(c).append(getPlantCd());
        sb.append(c).append(getStorageSpaceCd());
        sb.append(c).append(getInventoryInstNo());
        sb.append(c).append(getInventoryStatusTypeId());
        sb.append(c).append(getInventoryStatusTypeCd());
        sb.append(c).append(getInstRecvTime());
        sb.append(c).append(getReportSendTime());
        sb.append(c).append(getInventoryUpdateFlg());
        sb.append(c).append(getInventoryDataStatus());
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
     * [get] INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @return The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public Long getInventoryHId() {
        return _inventoryHId;
    }

    /**
     * [set] INVENTORY_H_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸ヘッダID
     * @param inventoryHId The value of the column 'INVENTORY_H_ID'. (NullAllowed)
     */
    public void setInventoryHId(Long inventoryHId) {
        __modifiedProperties.add("inventoryHId");
        this._inventoryHId = inventoryHId;
    }

    /**
     * [get] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @return The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public Long getClientId() {
        return _clientId;
    }

    /**
     * [set] CLIENT_ID: {UQ+, NotNull, BIGINT(19), FK to m_client} <br>
     * 荷主ID
     * @param clientId The value of the column 'CLIENT_ID'. (NullAllowed)
     */
    public void setClientId(Long clientId) {
        __modifiedProperties.add("clientId");
        this._clientId = clientId;
    }

    /**
     * [get] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @return The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public Long getCenterId() {
        return _centerId;
    }

    /**
     * [set] CENTER_ID: {+UQ, IX, NotNull, BIGINT(19), FK to m_center} <br>
     * センタID
     * @param centerId The value of the column 'CENTER_ID'. (NullAllowed)
     */
    public void setCenterId(Long centerId) {
        __modifiedProperties.add("centerId");
        this._centerId = centerId;
    }

    /**
     * [get] BATCH_NUM: {NotNull, BIGINT(19)} <br>
     * バッチNo.
     * @return The value of the column 'BATCH_NUM'. (NullAllowed)
     */
    public Long getBatchNum() {
        return _batchNum;
    }

    /**
     * [set] BATCH_NUM: {NotNull, BIGINT(19)} <br>
     * バッチNo.
     * @param batchNum The value of the column 'BATCH_NUM'. (NullAllowed)
     */
    public void setBatchNum(Long batchNum) {
        __modifiedProperties.add("batchNum");
        this._batchNum = batchNum;
    }

    /**
     * [get] INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} <br>
     * 棚卸日
     * @return The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public String getInventoryDt() {
        return _inventoryDt;
    }

    /**
     * [set] INVENTORY_DT: {+UQ, IX, NotNull, VARCHAR(8)} <br>
     * 棚卸日
     * @param inventoryDt The value of the column 'INVENTORY_DT'. (NullAllowed)
     */
    public void setInventoryDt(String inventoryDt) {
        __modifiedProperties.add("inventoryDt");
        this._inventoryDt = inventoryDt;
    }

    /**
     * [get] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @return The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public String getPlantCd() {
        return _plantCd;
    }

    /**
     * [set] PLANT_CD: {VARCHAR(30)} <br>
     * プラントCD
     * @param plantCd The value of the column 'PLANT_CD'. (NullAllowed)
     */
    public void setPlantCd(String plantCd) {
        __modifiedProperties.add("plantCd");
        this._plantCd = plantCd;
    }

    /**
     * [get] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @return The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public String getStorageSpaceCd() {
        return _storageSpaceCd;
    }

    /**
     * [set] STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 保管場所CD
     * @param storageSpaceCd The value of the column 'STORAGE_SPACE_CD'. (NullAllowed)
     */
    public void setStorageSpaceCd(String storageSpaceCd) {
        __modifiedProperties.add("storageSpaceCd");
        this._storageSpaceCd = storageSpaceCd;
    }

    /**
     * [get] INVENTORY_INST_NO: {VARCHAR(30)} <br>
     * 棚卸指示No
     * @return The value of the column 'INVENTORY_INST_NO'. (NullAllowed)
     */
    public String getInventoryInstNo() {
        return _inventoryInstNo;
    }

    /**
     * [set] INVENTORY_INST_NO: {VARCHAR(30)} <br>
     * 棚卸指示No
     * @param inventoryInstNo The value of the column 'INVENTORY_INST_NO'. (NullAllowed)
     */
    public void setInventoryInstNo(String inventoryInstNo) {
        __modifiedProperties.add("inventoryInstNo");
        this._inventoryInstNo = inventoryInstNo;
    }

    /**
     * [get] INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} <br>
     * 棚卸進捗状況区分ID
     * @return The value of the column 'INVENTORY_STATUS_TYPE_ID'. (NullAllowed)
     */
    public Long getInventoryStatusTypeId() {
        return _inventoryStatusTypeId;
    }

    /**
     * [set] INVENTORY_STATUS_TYPE_ID: {BIGINT(19)} <br>
     * 棚卸進捗状況区分ID
     * @param inventoryStatusTypeId The value of the column 'INVENTORY_STATUS_TYPE_ID'. (NullAllowed)
     */
    public void setInventoryStatusTypeId(Long inventoryStatusTypeId) {
        __modifiedProperties.add("inventoryStatusTypeId");
        this._inventoryStatusTypeId = inventoryStatusTypeId;
    }

    /**
     * [get] INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} <br>
     * 棚卸進捗状況区分
     * @return The value of the column 'INVENTORY_STATUS_TYPE_CD'. (NullAllowed)
     */
    public String getInventoryStatusTypeCd() {
        return _inventoryStatusTypeCd;
    }

    /**
     * [set] INVENTORY_STATUS_TYPE_CD: {VARCHAR(30)} <br>
     * 棚卸進捗状況区分
     * @param inventoryStatusTypeCd The value of the column 'INVENTORY_STATUS_TYPE_CD'. (NullAllowed)
     */
    public void setInventoryStatusTypeCd(String inventoryStatusTypeCd) {
        __modifiedProperties.add("inventoryStatusTypeCd");
        this._inventoryStatusTypeCd = inventoryStatusTypeCd;
    }

    /**
     * [get] INST_RECV_TIME: {DATETIME(19)} <br>
     * 指示受信時刻
     * @return The value of the column 'INST_RECV_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInstRecvTime() {
        return _instRecvTime;
    }

    /**
     * [set] INST_RECV_TIME: {DATETIME(19)} <br>
     * 指示受信時刻
     * @param instRecvTime The value of the column 'INST_RECV_TIME'. (NullAllowed)
     */
    public void setInstRecvTime(java.sql.Timestamp instRecvTime) {
        __modifiedProperties.add("instRecvTime");
        this._instRecvTime = instRecvTime;
    }

    /**
     * [get] REPORT_SEND_TIME: {DATETIME(19)} <br>
     * 実績送信時刻
     * @return The value of the column 'REPORT_SEND_TIME'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getReportSendTime() {
        return _reportSendTime;
    }

    /**
     * [set] REPORT_SEND_TIME: {DATETIME(19)} <br>
     * 実績送信時刻
     * @param reportSendTime The value of the column 'REPORT_SEND_TIME'. (NullAllowed)
     */
    public void setReportSendTime(java.sql.Timestamp reportSendTime) {
        __modifiedProperties.add("reportSendTime");
        this._reportSendTime = reportSendTime;
    }

    /**
     * [get] INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} <br>
     * 棚卸一括確定フラグ
     * @return The value of the column 'INVENTORY_UPDATE_FLG'. (NullAllowed)
     */
    public String getInventoryUpdateFlg() {
        return _inventoryUpdateFlg;
    }

    /**
     * [set] INVENTORY_UPDATE_FLG: {CHAR(1), default=[0]} <br>
     * 棚卸一括確定フラグ
     * @param inventoryUpdateFlg The value of the column 'INVENTORY_UPDATE_FLG'. (NullAllowed)
     */
    public void setInventoryUpdateFlg(String inventoryUpdateFlg) {
        __modifiedProperties.add("inventoryUpdateFlg");
        this._inventoryUpdateFlg = inventoryUpdateFlg;
    }

    /**
     * [get] INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} <br>
     * 棚卸データ作成状況
     * @return The value of the column 'INVENTORY_DATA_STATUS'. (NullAllowed)
     */
    public String getInventoryDataStatus() {
        return _inventoryDataStatus;
    }

    /**
     * [set] INVENTORY_DATA_STATUS: {VARCHAR(30), default=[00]} <br>
     * 棚卸データ作成状況
     * @param inventoryDataStatus The value of the column 'INVENTORY_DATA_STATUS'. (NullAllowed)
     */
    public void setInventoryDataStatus(String inventoryDataStatus) {
        __modifiedProperties.add("inventoryDataStatus");
        this._inventoryDataStatus = inventoryDataStatus;
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
