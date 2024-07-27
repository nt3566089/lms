package com.oneslogi.base.dbflute.dto.bs;

import java.io.Serializable;
import java.util.*;

import net.arnx.jsonic.JSONHint;
import net.vvakame.util.jsonpullparser.annotation.*;
import com.oneslogi.base.dbflute.dto.*;

/**
 * The simple DTO of t_receive_plan_data_transfer as TABLE. <br>
 * 入庫IFデータ転送テーブル
 * <pre>
 * [primary-key]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID
 *
 * [column]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID, RECEIVE_PLAN_B_ID, DATA_TRANSFER_ONLY_STR01, DATA_TRANSFER_ONLY_STR02, DATA_TRANSFER_ONLY_STR03, DATA_TRANSFER_ONLY_STR04, DATA_TRANSFER_ONLY_STR05, DATA_TRANSFER_ONLY_STR06, DATA_TRANSFER_ONLY_STR07, DATA_TRANSFER_ONLY_STR08, DATA_TRANSFER_ONLY_STR09, DATA_TRANSFER_ONLY_STR10, DATA_TRANSFER_ONLY_STR11, DATA_TRANSFER_ONLY_STR12, DATA_TRANSFER_ONLY_STR13, DATA_TRANSFER_ONLY_STR14, DATA_TRANSFER_ONLY_STR15, DATA_TRANSFER_ONLY_STR16, DATA_TRANSFER_ONLY_STR17, DATA_TRANSFER_ONLY_STR18, DATA_TRANSFER_ONLY_STR19, DATA_TRANSFER_ONLY_STR20, DATA_TRANSFER_ONLY_STR21, DATA_TRANSFER_ONLY_STR22, DATA_TRANSFER_ONLY_STR23, DATA_TRANSFER_ONLY_STR24, DATA_TRANSFER_ONLY_STR25, DATA_TRANSFER_ONLY_STR26, DATA_TRANSFER_ONLY_STR27, DATA_TRANSFER_ONLY_STR28, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     RECEIVE_PLAN_DATA_TRANSFER_ID
 *
 * [version-no]
 *     VERSION_NO
 *
 * [foreign-table]
 *     t_receive_plan_b
 *
 * [referrer-table]
 *     
 *
 * [foreign-property]
 *     tReceivePlanB
 *
 * [referrer-property]
 *     
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
@JsonModel(decamelize = false)
public abstract class BsTReceivePlanDataTransferDto implements Serializable {

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
    /** RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} */
    @JsonKey
    protected Long _receivePlanDataTransferId;

    /** RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} */
    @JsonKey
    protected Long _receivePlanBId;

    /** DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr01;

    /** DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr02;

    /** DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr03;

    /** DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr04;

    /** DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} */
    @JsonKey
    protected String _dataTransferOnlyStr05;

    /** DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr06;

    /** DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr07;

    /** DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr08;

    /** DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr09;

    /** DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr10;

    /** DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr11;

    /** DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr12;

    /** DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr13;

    /** DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr14;

    /** DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr15;

    /** DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr16;

    /** DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr17;

    /** DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr18;

    /** DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr19;

    /** DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr20;

    /** DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr21;

    /** DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr22;

    /** DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr23;

    /** DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr24;

    /** DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr25;

    /** DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} */
    @JsonKey
    protected String _dataTransferOnlyStr26;

    /** DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr27;

    /** DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} */
    @JsonKey
    protected String _dataTransferOnlyStr28;

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
    public BsTReceivePlanDataTransferDto() {
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
    protected TReceivePlanBDto _tReceivePlanB;

    public TReceivePlanBDto getTReceivePlanB() {
        return _tReceivePlanB;
    }

    public void setTReceivePlanB(TReceivePlanBDto tReceivePlanB) {
        this._tReceivePlanB = tReceivePlanB;
    }

    // ===================================================================================
    //                                                                      Referrer Table
    //                                                                      ==============
    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    public boolean equals(Object other) {
        if (other == null || !(other instanceof BsTReceivePlanDataTransferDto)) { return false; }
        final BsTReceivePlanDataTransferDto otherEntity = (BsTReceivePlanDataTransferDto)other;
        if (!helpComparingValue(getReceivePlanDataTransferId(), otherEntity.getReceivePlanDataTransferId())) { return false; }
        if (!helpComparingValue(getReceivePlanBId(), otherEntity.getReceivePlanBId())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "t_receive_plan_data_transfer");
        result = xCH(result, getReceivePlanDataTransferId());
        result = xCH(result, getReceivePlanBId());
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
        sb.append(c).append(getReceivePlanDataTransferId());
        sb.append(c).append(getReceivePlanBId());
        sb.append(c).append(getDataTransferOnlyStr01());
        sb.append(c).append(getDataTransferOnlyStr02());
        sb.append(c).append(getDataTransferOnlyStr03());
        sb.append(c).append(getDataTransferOnlyStr04());
        sb.append(c).append(getDataTransferOnlyStr05());
        sb.append(c).append(getDataTransferOnlyStr06());
        sb.append(c).append(getDataTransferOnlyStr07());
        sb.append(c).append(getDataTransferOnlyStr08());
        sb.append(c).append(getDataTransferOnlyStr09());
        sb.append(c).append(getDataTransferOnlyStr10());
        sb.append(c).append(getDataTransferOnlyStr11());
        sb.append(c).append(getDataTransferOnlyStr12());
        sb.append(c).append(getDataTransferOnlyStr13());
        sb.append(c).append(getDataTransferOnlyStr14());
        sb.append(c).append(getDataTransferOnlyStr15());
        sb.append(c).append(getDataTransferOnlyStr16());
        sb.append(c).append(getDataTransferOnlyStr17());
        sb.append(c).append(getDataTransferOnlyStr18());
        sb.append(c).append(getDataTransferOnlyStr19());
        sb.append(c).append(getDataTransferOnlyStr20());
        sb.append(c).append(getDataTransferOnlyStr21());
        sb.append(c).append(getDataTransferOnlyStr22());
        sb.append(c).append(getDataTransferOnlyStr23());
        sb.append(c).append(getDataTransferOnlyStr24());
        sb.append(c).append(getDataTransferOnlyStr25());
        sb.append(c).append(getDataTransferOnlyStr26());
        sb.append(c).append(getDataTransferOnlyStr27());
        sb.append(c).append(getDataTransferOnlyStr28());
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
     * [get] RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫IFデータ転送ID
     * @return The value of the column 'RECEIVE_PLAN_DATA_TRANSFER_ID'. (NullAllowed)
     */
    public Long getReceivePlanDataTransferId() {
        return _receivePlanDataTransferId;
    }

    /**
     * [set] RECEIVE_PLAN_DATA_TRANSFER_ID: {PK, ID, NotNull, BIGINT(19)} <br>
     * 入庫IFデータ転送ID
     * @param receivePlanDataTransferId The value of the column 'RECEIVE_PLAN_DATA_TRANSFER_ID'. (NullAllowed)
     */
    public void setReceivePlanDataTransferId(Long receivePlanDataTransferId) {
        __modifiedProperties.add("receivePlanDataTransferId");
        this._receivePlanDataTransferId = receivePlanDataTransferId;
    }

    /**
     * [get] RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @return The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public Long getReceivePlanBId() {
        return _receivePlanBId;
    }

    /**
     * [set] RECEIVE_PLAN_B_ID: {PK, IX, NotNull, BIGINT(19), FK to t_receive_plan_b} <br>
     * 入荷予定ボディID
     * @param receivePlanBId The value of the column 'RECEIVE_PLAN_B_ID'. (NullAllowed)
     */
    public void setReceivePlanBId(Long receivePlanBId) {
        __modifiedProperties.add("receivePlanBId");
        this._receivePlanBId = receivePlanBId;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public String getDataTransferOnlyStr01() {
        return _dataTransferOnlyStr01;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR01: {VARCHAR(30)} <br>
     * 赤黒区分
     * @param dataTransferOnlyStr01 The value of the column 'DATA_TRANSFER_ONLY_STR01'. (NullAllowed)
     */
    public void setDataTransferOnlyStr01(String dataTransferOnlyStr01) {
        __modifiedProperties.add("dataTransferOnlyStr01");
        this._dataTransferOnlyStr01 = dataTransferOnlyStr01;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public String getDataTransferOnlyStr02() {
        return _dataTransferOnlyStr02;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR02: {VARCHAR(30)} <br>
     * 代表ロケーション
     * @param dataTransferOnlyStr02 The value of the column 'DATA_TRANSFER_ONLY_STR02'. (NullAllowed)
     */
    public void setDataTransferOnlyStr02(String dataTransferOnlyStr02) {
        __modifiedProperties.add("dataTransferOnlyStr02");
        this._dataTransferOnlyStr02 = dataTransferOnlyStr02;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public String getDataTransferOnlyStr03() {
        return _dataTransferOnlyStr03;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR03: {VARCHAR(60)} <br>
     * 品名カナ1
     * @param dataTransferOnlyStr03 The value of the column 'DATA_TRANSFER_ONLY_STR03'. (NullAllowed)
     */
    public void setDataTransferOnlyStr03(String dataTransferOnlyStr03) {
        __modifiedProperties.add("dataTransferOnlyStr03");
        this._dataTransferOnlyStr03 = dataTransferOnlyStr03;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public String getDataTransferOnlyStr04() {
        return _dataTransferOnlyStr04;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR04: {VARCHAR(60)} <br>
     * 品名カナ2
     * @param dataTransferOnlyStr04 The value of the column 'DATA_TRANSFER_ONLY_STR04'. (NullAllowed)
     */
    public void setDataTransferOnlyStr04(String dataTransferOnlyStr04) {
        __modifiedProperties.add("dataTransferOnlyStr04");
        this._dataTransferOnlyStr04 = dataTransferOnlyStr04;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public String getDataTransferOnlyStr05() {
        return _dataTransferOnlyStr05;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR05: {VARCHAR(60)} <br>
     * 摘要
     * @param dataTransferOnlyStr05 The value of the column 'DATA_TRANSFER_ONLY_STR05'. (NullAllowed)
     */
    public void setDataTransferOnlyStr05(String dataTransferOnlyStr05) {
        __modifiedProperties.add("dataTransferOnlyStr05");
        this._dataTransferOnlyStr05 = dataTransferOnlyStr05;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public String getDataTransferOnlyStr06() {
        return _dataTransferOnlyStr06;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR06: {VARCHAR(30)} <br>
     * 端末番号
     * @param dataTransferOnlyStr06 The value of the column 'DATA_TRANSFER_ONLY_STR06'. (NullAllowed)
     */
    public void setDataTransferOnlyStr06(String dataTransferOnlyStr06) {
        __modifiedProperties.add("dataTransferOnlyStr06");
        this._dataTransferOnlyStr06 = dataTransferOnlyStr06;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public String getDataTransferOnlyStr07() {
        return _dataTransferOnlyStr07;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR07: {VARCHAR(30)} <br>
     * サーバー送信フラグ
     * @param dataTransferOnlyStr07 The value of the column 'DATA_TRANSFER_ONLY_STR07'. (NullAllowed)
     */
    public void setDataTransferOnlyStr07(String dataTransferOnlyStr07) {
        __modifiedProperties.add("dataTransferOnlyStr07");
        this._dataTransferOnlyStr07 = dataTransferOnlyStr07;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public String getDataTransferOnlyStr08() {
        return _dataTransferOnlyStr08;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR08: {VARCHAR(30)} <br>
     * サーバー宛送信時刻
     * @param dataTransferOnlyStr08 The value of the column 'DATA_TRANSFER_ONLY_STR08'. (NullAllowed)
     */
    public void setDataTransferOnlyStr08(String dataTransferOnlyStr08) {
        __modifiedProperties.add("dataTransferOnlyStr08");
        this._dataTransferOnlyStr08 = dataTransferOnlyStr08;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public String getDataTransferOnlyStr09() {
        return _dataTransferOnlyStr09;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR09: {VARCHAR(30)} <br>
     * 3社納品書番号2
     * @param dataTransferOnlyStr09 The value of the column 'DATA_TRANSFER_ONLY_STR09'. (NullAllowed)
     */
    public void setDataTransferOnlyStr09(String dataTransferOnlyStr09) {
        __modifiedProperties.add("dataTransferOnlyStr09");
        this._dataTransferOnlyStr09 = dataTransferOnlyStr09;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed)
     */
    public String getDataTransferOnlyStr10() {
        return _dataTransferOnlyStr10;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR10: {VARCHAR(30)} <br>
     * 加工品区分
     * @param dataTransferOnlyStr10 The value of the column 'DATA_TRANSFER_ONLY_STR10'. (NullAllowed)
     */
    public void setDataTransferOnlyStr10(String dataTransferOnlyStr10) {
        __modifiedProperties.add("dataTransferOnlyStr10");
        this._dataTransferOnlyStr10 = dataTransferOnlyStr10;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed)
     */
    public String getDataTransferOnlyStr11() {
        return _dataTransferOnlyStr11;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR11: {VARCHAR(30)} <br>
     * 管理区分
     * @param dataTransferOnlyStr11 The value of the column 'DATA_TRANSFER_ONLY_STR11'. (NullAllowed)
     */
    public void setDataTransferOnlyStr11(String dataTransferOnlyStr11) {
        __modifiedProperties.add("dataTransferOnlyStr11");
        this._dataTransferOnlyStr11 = dataTransferOnlyStr11;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed)
     */
    public String getDataTransferOnlyStr12() {
        return _dataTransferOnlyStr12;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR12: {VARCHAR(30)} <br>
     * 3社売上日
     * @param dataTransferOnlyStr12 The value of the column 'DATA_TRANSFER_ONLY_STR12'. (NullAllowed)
     */
    public void setDataTransferOnlyStr12(String dataTransferOnlyStr12) {
        __modifiedProperties.add("dataTransferOnlyStr12");
        this._dataTransferOnlyStr12 = dataTransferOnlyStr12;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed)
     */
    public String getDataTransferOnlyStr13() {
        return _dataTransferOnlyStr13;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR13: {VARCHAR(30)} <br>
     * 仕入単価
     * @param dataTransferOnlyStr13 The value of the column 'DATA_TRANSFER_ONLY_STR13'. (NullAllowed)
     */
    public void setDataTransferOnlyStr13(String dataTransferOnlyStr13) {
        __modifiedProperties.add("dataTransferOnlyStr13");
        this._dataTransferOnlyStr13 = dataTransferOnlyStr13;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed)
     */
    public String getDataTransferOnlyStr14() {
        return _dataTransferOnlyStr14;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR14: {VARCHAR(30)} <br>
     * 作成日_発注
     * @param dataTransferOnlyStr14 The value of the column 'DATA_TRANSFER_ONLY_STR14'. (NullAllowed)
     */
    public void setDataTransferOnlyStr14(String dataTransferOnlyStr14) {
        __modifiedProperties.add("dataTransferOnlyStr14");
        this._dataTransferOnlyStr14 = dataTransferOnlyStr14;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed)
     */
    public String getDataTransferOnlyStr15() {
        return _dataTransferOnlyStr15;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR15: {VARCHAR(30)} <br>
     * 作成時間_発注
     * @param dataTransferOnlyStr15 The value of the column 'DATA_TRANSFER_ONLY_STR15'. (NullAllowed)
     */
    public void setDataTransferOnlyStr15(String dataTransferOnlyStr15) {
        __modifiedProperties.add("dataTransferOnlyStr15");
        this._dataTransferOnlyStr15 = dataTransferOnlyStr15;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed)
     */
    public String getDataTransferOnlyStr16() {
        return _dataTransferOnlyStr16;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR16: {VARCHAR(30)} <br>
     * データ種別
     * @param dataTransferOnlyStr16 The value of the column 'DATA_TRANSFER_ONLY_STR16'. (NullAllowed)
     */
    public void setDataTransferOnlyStr16(String dataTransferOnlyStr16) {
        __modifiedProperties.add("dataTransferOnlyStr16");
        this._dataTransferOnlyStr16 = dataTransferOnlyStr16;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed)
     */
    public String getDataTransferOnlyStr17() {
        return _dataTransferOnlyStr17;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR17: {VARCHAR(30)} <br>
     * 管理番号
     * @param dataTransferOnlyStr17 The value of the column 'DATA_TRANSFER_ONLY_STR17'. (NullAllowed)
     */
    public void setDataTransferOnlyStr17(String dataTransferOnlyStr17) {
        __modifiedProperties.add("dataTransferOnlyStr17");
        this._dataTransferOnlyStr17 = dataTransferOnlyStr17;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed)
     */
    public String getDataTransferOnlyStr18() {
        return _dataTransferOnlyStr18;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR18: {VARCHAR(30)} <br>
     * 入力順
     * @param dataTransferOnlyStr18 The value of the column 'DATA_TRANSFER_ONLY_STR18'. (NullAllowed)
     */
    public void setDataTransferOnlyStr18(String dataTransferOnlyStr18) {
        __modifiedProperties.add("dataTransferOnlyStr18");
        this._dataTransferOnlyStr18 = dataTransferOnlyStr18;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed)
     */
    public String getDataTransferOnlyStr19() {
        return _dataTransferOnlyStr19;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR19: {VARCHAR(30)} <br>
     * 検品残数量
     * @param dataTransferOnlyStr19 The value of the column 'DATA_TRANSFER_ONLY_STR19'. (NullAllowed)
     */
    public void setDataTransferOnlyStr19(String dataTransferOnlyStr19) {
        __modifiedProperties.add("dataTransferOnlyStr19");
        this._dataTransferOnlyStr19 = dataTransferOnlyStr19;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed)
     */
    public String getDataTransferOnlyStr20() {
        return _dataTransferOnlyStr20;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR20: {VARCHAR(30)} <br>
     * 検品数量
     * @param dataTransferOnlyStr20 The value of the column 'DATA_TRANSFER_ONLY_STR20'. (NullAllowed)
     */
    public void setDataTransferOnlyStr20(String dataTransferOnlyStr20) {
        __modifiedProperties.add("dataTransferOnlyStr20");
        this._dataTransferOnlyStr20 = dataTransferOnlyStr20;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed)
     */
    public String getDataTransferOnlyStr21() {
        return _dataTransferOnlyStr21;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR21: {VARCHAR(30)} <br>
     * 検品確定区分
     * @param dataTransferOnlyStr21 The value of the column 'DATA_TRANSFER_ONLY_STR21'. (NullAllowed)
     */
    public void setDataTransferOnlyStr21(String dataTransferOnlyStr21) {
        __modifiedProperties.add("dataTransferOnlyStr21");
        this._dataTransferOnlyStr21 = dataTransferOnlyStr21;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed)
     */
    public String getDataTransferOnlyStr22() {
        return _dataTransferOnlyStr22;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR22: {VARCHAR(30)} <br>
     * 倉庫コード
     * @param dataTransferOnlyStr22 The value of the column 'DATA_TRANSFER_ONLY_STR22'. (NullAllowed)
     */
    public void setDataTransferOnlyStr22(String dataTransferOnlyStr22) {
        __modifiedProperties.add("dataTransferOnlyStr22");
        this._dataTransferOnlyStr22 = dataTransferOnlyStr22;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed)
     */
    public String getDataTransferOnlyStr23() {
        return _dataTransferOnlyStr23;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR23: {VARCHAR(30)} <br>
     * 完了区分
     * @param dataTransferOnlyStr23 The value of the column 'DATA_TRANSFER_ONLY_STR23'. (NullAllowed)
     */
    public void setDataTransferOnlyStr23(String dataTransferOnlyStr23) {
        __modifiedProperties.add("dataTransferOnlyStr23");
        this._dataTransferOnlyStr23 = dataTransferOnlyStr23;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed)
     */
    public String getDataTransferOnlyStr24() {
        return _dataTransferOnlyStr24;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR24: {VARCHAR(30)} <br>
     * プログラムID
     * @param dataTransferOnlyStr24 The value of the column 'DATA_TRANSFER_ONLY_STR24'. (NullAllowed)
     */
    public void setDataTransferOnlyStr24(String dataTransferOnlyStr24) {
        __modifiedProperties.add("dataTransferOnlyStr24");
        this._dataTransferOnlyStr24 = dataTransferOnlyStr24;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed)
     */
    public String getDataTransferOnlyStr25() {
        return _dataTransferOnlyStr25;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR25: {VARCHAR(30)} <br>
     * JANコード区分
     * @param dataTransferOnlyStr25 The value of the column 'DATA_TRANSFER_ONLY_STR25'. (NullAllowed)
     */
    public void setDataTransferOnlyStr25(String dataTransferOnlyStr25) {
        __modifiedProperties.add("dataTransferOnlyStr25");
        this._dataTransferOnlyStr25 = dataTransferOnlyStr25;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed)
     */
    public String getDataTransferOnlyStr26() {
        return _dataTransferOnlyStr26;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR26: {VARCHAR(255)} <br>
     * ダミー
     * @param dataTransferOnlyStr26 The value of the column 'DATA_TRANSFER_ONLY_STR26'. (NullAllowed)
     */
    public void setDataTransferOnlyStr26(String dataTransferOnlyStr26) {
        __modifiedProperties.add("dataTransferOnlyStr26");
        this._dataTransferOnlyStr26 = dataTransferOnlyStr26;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed)
     */
    public String getDataTransferOnlyStr27() {
        return _dataTransferOnlyStr27;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR27: {VARCHAR(30)} <br>
     * SAP更新担当者コード
     * @param dataTransferOnlyStr27 The value of the column 'DATA_TRANSFER_ONLY_STR27'. (NullAllowed)
     */
    public void setDataTransferOnlyStr27(String dataTransferOnlyStr27) {
        __modifiedProperties.add("dataTransferOnlyStr27");
        this._dataTransferOnlyStr27 = dataTransferOnlyStr27;
    }

    /**
     * [get] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * 削除フラグ
     * @return The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed)
     */
    public String getDataTransferOnlyStr28() {
        return _dataTransferOnlyStr28;
    }

    /**
     * [set] DATA_TRANSFER_ONLY_STR28: {VARCHAR(30)} <br>
     * 削除フラグ
     * @param dataTransferOnlyStr28 The value of the column 'DATA_TRANSFER_ONLY_STR28'. (NullAllowed)
     */
    public void setDataTransferOnlyStr28(String dataTransferOnlyStr28) {
        __modifiedProperties.add("dataTransferOnlyStr28");
        this._dataTransferOnlyStr28 = dataTransferOnlyStr28;
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
