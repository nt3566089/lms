package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_inventory_inp_hist as TABLE. <br>
 * 棚卸入力履歴
 * <pre>
 * [primary-key]
 *     INVENTORY_INP_HIST_ID
 *
 * [column]
 *     INVENTORY_INP_HIST_ID, INPUT_DT, INVENTORY_B_ID, INVENTORY_NUM, LAST_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     INVENTORY_INP_HIST_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_inventory_b, b_class_dtl(ByLastFlg)
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tInventoryB, bClassDtlByLastFlg
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTInventoryInpHistDto implements Serializable {

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
    /** INVENTORY_INP_HIST_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _inventoryInpHistId;

    /** INPUT_DT: {NotNull, DATETIME(19)} */
    @JsonKey
    protected java.sql.Timestamp _inputDt;

    /** INVENTORY_B_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_b} */
    @JsonKey
    protected Long _inventoryBId;

    /** INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} */
    @JsonKey
    protected java.math.BigDecimal _inventoryNum;

    /** LAST_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LastFlg} */
    @JsonKey
    protected String _lastFlg;

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
    public BsTInventoryInpHistDto() {
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
    protected TInventoryBDto _tInventoryB;

    public TInventoryBDto getTInventoryB() {
        return _tInventoryB;
    }

    public void setTInventoryB(TInventoryBDto tInventoryB) {
        this._tInventoryB = tInventoryB;
    }

    protected BClassDtlDto _bClassDtlByLastFlg;

    public BClassDtlDto getBClassDtlByLastFlg() {
        return _bClassDtlByLastFlg;
    }

    public void setBClassDtlByLastFlg(BClassDtlDto bClassDtlByLastFlg) {
        this._bClassDtlByLastFlg = bClassDtlByLastFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTInventoryInpHistDto)) { return false; }
        final BsTInventoryInpHistDto otherEntity = (BsTInventoryInpHistDto)other;
        if (!helpComparingValue(getInventoryInpHistId(), otherEntity.getInventoryInpHistId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_inventory_inp_hist");
        result = xCH(result, getInventoryInpHistId());
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
        sb.append(c).append(getInventoryInpHistId());
        sb.append(c).append(getInputDt());
        sb.append(c).append(getInventoryBId());
        sb.append(c).append(getInventoryNum());
        sb.append(c).append(getLastFlg());
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
     * [get] INVENTORY_INP_HIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸入力履歴ID
     * @return The value of the column 'INVENTORY_INP_HIST_ID'. (NullAllowed)
     */
    public Long getInventoryInpHistId() {
        return _inventoryInpHistId;
    }

    /**
     * [set] INVENTORY_INP_HIST_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 棚卸入力履歴ID
     * @param inventoryInpHistId The value of the column 'INVENTORY_INP_HIST_ID'. (NullAllowed)
     */
    public void setInventoryInpHistId(Long inventoryInpHistId) {
        __modifiedProperties.add("inventoryInpHistId");
        this._inventoryInpHistId = inventoryInpHistId;
    }

    /**
     * [get] INPUT_DT: {NotNull, DATETIME(19)} <br>
     * 入力日時
     * @return The value of the column 'INPUT_DT'. (NullAllowed)
     */
    @JSONHint(format="yyyy-MM-dd HH:mm:ss.SSS")
    public java.sql.Timestamp getInputDt() {
        return _inputDt;
    }

    /**
     * [set] INPUT_DT: {NotNull, DATETIME(19)} <br>
     * 入力日時
     * @param inputDt The value of the column 'INPUT_DT'. (NullAllowed)
     */
    public void setInputDt(java.sql.Timestamp inputDt) {
        __modifiedProperties.add("inputDt");
        this._inputDt = inputDt;
    }

    /**
     * [get] INVENTORY_B_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @return The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public Long getInventoryBId() {
        return _inventoryBId;
    }

    /**
     * [set] INVENTORY_B_ID: {IX, NotNull, BIGINT(19), FK to t_inventory_b} <br>
     * 棚卸ボディID
     * @param inventoryBId The value of the column 'INVENTORY_B_ID'. (NullAllowed)
     */
    public void setInventoryBId(Long inventoryBId) {
        __modifiedProperties.add("inventoryBId");
        this._inventoryBId = inventoryBId;
    }

    /**
     * [get] INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 棚卸数
     * @return The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getInventoryNum() {
        return _inventoryNum;
    }

    /**
     * [set] INVENTORY_NUM: {NotNull, DECIMAL(14, 4), default=[0.0000]} <br>
     * 棚卸数
     * @param inventoryNum The value of the column 'INVENTORY_NUM'. (NullAllowed)
     */
    public void setInventoryNum(java.math.BigDecimal inventoryNum) {
        __modifiedProperties.add("inventoryNum");
        this._inventoryNum = inventoryNum;
    }

    /**
     * [get] LAST_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @return The value of the column 'LAST_FLG'. (NullAllowed)
     */
    public String getLastFlg() {
        return _lastFlg;
    }

    /**
     * [set] LAST_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=LastFlg} <br>
     * 最新フラグ
     * @param lastFlg The value of the column 'LAST_FLG'. (NullAllowed)
     */
    public void setLastFlg(String lastFlg) {
        __modifiedProperties.add("lastFlg");
        this._lastFlg = lastFlg;
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