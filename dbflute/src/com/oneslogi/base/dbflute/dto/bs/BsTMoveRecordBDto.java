package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_move_record_b as TABLE. <br>
 * 在庫移動実績ボディ
 * <pre>
 * [primary-key]
 *     MOVE_RECORD_B_ID
 *
 * [column]
 *     MOVE_RECORD_B_ID, MOVE_INST_H_ID, MOVE_INST_B_ID, PROCESS_NO, LOCATION_ID, MOVE_DT, MOVE_NUM, STORE_NO_MERGE_FLG, ALL_SHIPPING_FLG, USER_ID, CM_SEND_FLG, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     MOVE_RECORD_B_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     b_user, m_location, t_move_inst_b, t_move_inst_h, b_class_dtl(ByAllShippingFlg)
 *
 * [referrer-table]
 *     t_stock_inout
 *
 * [foreign-property]
 *     bUser, mLocation, tMoveInstB, tMoveInstH, bClassDtlByAllShippingFlg, bClassDtlByStoreNoMergeFlg
 *
 * [referrer-property]
 *     tStockInoutList
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTMoveRecordBDto implements Serializable {

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
    /** MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _moveRecordBId;

    /** MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} */
    @JsonKey
    protected Long _moveInstHId;

    /** MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} */
    @JsonKey
    protected Long _moveInstBId;

    /** PROCESS_NO: {NotNull, VARCHAR(30)} */
    @JsonKey
    protected String _processNo;

    /** LOCATION_ID: {IX, BIGINT(19), FK to m_location} */
    @JsonKey
    protected Long _locationId;

    /** MOVE_DT: {NotNull, VARCHAR(8)} */
    @JsonKey
    protected String _moveDt;

    /** MOVE_NUM: {DECIMAL(14, 4)} */
    @JsonKey
    protected java.math.BigDecimal _moveNum;

    /** STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} */
    @JsonKey
    protected String _storeNoMergeFlg;

    /** ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} */
    @JsonKey
    protected String _allShippingFlg;

    /** USER_ID: {IX, BIGINT(19), FK to b_user} */
    @JsonKey
    protected Long _userId;

    /** CM_SEND_FLG: {CHAR(1), default=[0]} */
    @JsonKey
    protected String _cmSendFlg;

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
    public BsTMoveRecordBDto() {
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
    protected BUserDto _bUser;

    public BUserDto getBUser() {
        return _bUser;
    }

    public void setBUser(BUserDto bUser) {
        this._bUser = bUser;
    }

    protected MLocationDto _mLocation;

    public MLocationDto getMLocation() {
        return _mLocation;
    }

    public void setMLocation(MLocationDto mLocation) {
        this._mLocation = mLocation;
    }

    protected TMoveInstBDto _tMoveInstB;

    public TMoveInstBDto getTMoveInstB() {
        return _tMoveInstB;
    }

    public void setTMoveInstB(TMoveInstBDto tMoveInstB) {
        this._tMoveInstB = tMoveInstB;
    }

    protected TMoveInstHDto _tMoveInstH;

    public TMoveInstHDto getTMoveInstH() {
        return _tMoveInstH;
    }

    public void setTMoveInstH(TMoveInstHDto tMoveInstH) {
        this._tMoveInstH = tMoveInstH;
    }

    protected BClassDtlDto _bClassDtlByAllShippingFlg;

    public BClassDtlDto getBClassDtlByAllShippingFlg() {
        return _bClassDtlByAllShippingFlg;
    }

    public void setBClassDtlByAllShippingFlg(BClassDtlDto bClassDtlByAllShippingFlg) {
        this._bClassDtlByAllShippingFlg = bClassDtlByAllShippingFlg;
    }

    protected BClassDtlDto _bClassDtlByStoreNoMergeFlg;

    public BClassDtlDto getBClassDtlByStoreNoMergeFlg() {
        return _bClassDtlByStoreNoMergeFlg;
    }

    public void setBClassDtlByStoreNoMergeFlg(BClassDtlDto bClassDtlByStoreNoMergeFlg) {
        this._bClassDtlByStoreNoMergeFlg = bClassDtlByStoreNoMergeFlg;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    protected List<TStockInoutDto> _tStockInoutList;

    public List<TStockInoutDto> getTStockInoutList() {
        if (_tStockInoutList == null) { _tStockInoutList = new ArrayList<TStockInoutDto>(); }
        return _tStockInoutList;
    }

    public void setTStockInoutList(List<TStockInoutDto> tStockInoutList) {
        this._tStockInoutList = tStockInoutList;
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTMoveRecordBDto)) { return false; }
        final BsTMoveRecordBDto otherEntity = (BsTMoveRecordBDto)other;
        if (!helpComparingValue(getMoveRecordBId(), otherEntity.getMoveRecordBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_move_record_b");
        result = xCH(result, getMoveRecordBId());
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
        sb.append(c).append(getMoveRecordBId());
        sb.append(c).append(getMoveInstHId());
        sb.append(c).append(getMoveInstBId());
        sb.append(c).append(getProcessNo());
        sb.append(c).append(getLocationId());
        sb.append(c).append(getMoveDt());
        sb.append(c).append(getMoveNum());
        sb.append(c).append(getStoreNoMergeFlg());
        sb.append(c).append(getAllShippingFlg());
        sb.append(c).append(getUserId());
        sb.append(c).append(getCmSendFlg());
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
     * [get] MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫移動実績ボディID
     * @return The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public Long getMoveRecordBId() {
        return _moveRecordBId;
    }

    /**
     * [set] MOVE_RECORD_B_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 在庫移動実績ボディID
     * @param moveRecordBId The value of the column 'MOVE_RECORD_B_ID'. (NullAllowed)
     */
    public void setMoveRecordBId(Long moveRecordBId) {
        __modifiedProperties.add("moveRecordBId");
        this._moveRecordBId = moveRecordBId;
    }

    /**
     * [get] MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @return The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public Long getMoveInstHId() {
        return _moveInstHId;
    }

    /**
     * [set] MOVE_INST_H_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_h} <br>
     * 在庫移動指示ヘッダID
     * @param moveInstHId The value of the column 'MOVE_INST_H_ID'. (NullAllowed)
     */
    public void setMoveInstHId(Long moveInstHId) {
        __modifiedProperties.add("moveInstHId");
        this._moveInstHId = moveInstHId;
    }

    /**
     * [get] MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} <br>
     * 在庫移動指示ボディID
     * @return The value of the column 'MOVE_INST_B_ID'. (NullAllowed)
     */
    public Long getMoveInstBId() {
        return _moveInstBId;
    }

    /**
     * [set] MOVE_INST_B_ID: {IX, NotNull, BIGINT(19), FK to t_move_inst_b} <br>
     * 在庫移動指示ボディID
     * @param moveInstBId The value of the column 'MOVE_INST_B_ID'. (NullAllowed)
     */
    public void setMoveInstBId(Long moveInstBId) {
        __modifiedProperties.add("moveInstBId");
        this._moveInstBId = moveInstBId;
    }

    /**
     * [get] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @return The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public String getProcessNo() {
        return _processNo;
    }

    /**
     * [set] PROCESS_NO: {NotNull, VARCHAR(30)} <br>
     * 処理No.
     * @param processNo The value of the column 'PROCESS_NO'. (NullAllowed)
     */
    public void setProcessNo(String processNo) {
        __modifiedProperties.add("processNo");
        this._processNo = processNo;
    }

    /**
     * [get] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @return The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public Long getLocationId() {
        return _locationId;
    }

    /**
     * [set] LOCATION_ID: {IX, BIGINT(19), FK to m_location} <br>
     * ロケーションID
     * @param locationId The value of the column 'LOCATION_ID'. (NullAllowed)
     */
    public void setLocationId(Long locationId) {
        __modifiedProperties.add("locationId");
        this._locationId = locationId;
    }

    /**
     * [get] MOVE_DT: {NotNull, VARCHAR(8)} <br>
     * 移動日
     * @return The value of the column 'MOVE_DT'. (NullAllowed)
     */
    public String getMoveDt() {
        return _moveDt;
    }

    /**
     * [set] MOVE_DT: {NotNull, VARCHAR(8)} <br>
     * 移動日
     * @param moveDt The value of the column 'MOVE_DT'. (NullAllowed)
     */
    public void setMoveDt(String moveDt) {
        __modifiedProperties.add("moveDt");
        this._moveDt = moveDt;
    }

    /**
     * [get] MOVE_NUM: {DECIMAL(14, 4)} <br>
     * 在庫移動実績数
     * @return The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public java.math.BigDecimal getMoveNum() {
        return _moveNum;
    }

    /**
     * [set] MOVE_NUM: {DECIMAL(14, 4)} <br>
     * 在庫移動実績数
     * @param moveNum The value of the column 'MOVE_NUM'. (NullAllowed)
     */
    public void setMoveNum(java.math.BigDecimal moveNum) {
        __modifiedProperties.add("moveNum");
        this._moveNum = moveNum;
    }

    /**
     * [get] STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @return The value of the column 'STORE_NO_MERGE_FLG'. (NullAllowed)
     */
    public String getStoreNoMergeFlg() {
        return _storeNoMergeFlg;
    }

    /**
     * [set] STORE_NO_MERGE_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=StoreNoMergeFlg} <br>
     * 入庫No.マージフラグ
     * @param storeNoMergeFlg The value of the column 'STORE_NO_MERGE_FLG'. (NullAllowed)
     */
    public void setStoreNoMergeFlg(String storeNoMergeFlg) {
        __modifiedProperties.add("storeNoMergeFlg");
        this._storeNoMergeFlg = storeNoMergeFlg;
    }

    /**
     * [get] ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @return The value of the column 'ALL_SHIPPING_FLG'. (NullAllowed)
     */
    public String getAllShippingFlg() {
        return _allShippingFlg;
    }

    /**
     * [set] ALL_SHIPPING_FLG: {CHAR(1), FK to B_CLASS_DTL, classification=AllShippingFlg} <br>
     * 全数出庫フラグ
     * @param allShippingFlg The value of the column 'ALL_SHIPPING_FLG'. (NullAllowed)
     */
    public void setAllShippingFlg(String allShippingFlg) {
        __modifiedProperties.add("allShippingFlg");
        this._allShippingFlg = allShippingFlg;
    }

    /**
     * [get] USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 担当者ID
     * @return The value of the column 'USER_ID'. (NullAllowed)
     */
    public Long getUserId() {
        return _userId;
    }

    /**
     * [set] USER_ID: {IX, BIGINT(19), FK to b_user} <br>
     * 担当者ID
     * @param userId The value of the column 'USER_ID'. (NullAllowed)
     */
    public void setUserId(Long userId) {
        __modifiedProperties.add("userId");
        this._userId = userId;
    }

    /**
     * [get] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @return The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public String getCmSendFlg() {
        return _cmSendFlg;
    }

    /**
     * [set] CM_SEND_FLG: {CHAR(1), default=[0]} <br>
     * 共通管理送信済フラグ
     * @param cmSendFlg The value of the column 'CM_SEND_FLG'. (NullAllowed)
     */
    public void setCmSendFlg(String cmSendFlg) {
        __modifiedProperties.add("cmSendFlg");
        this._cmSendFlg = cmSendFlg;
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
