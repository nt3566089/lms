package com.oneslogi.base.dbflute.dto.bs.customize;

import java.io.Serializable;
import java.util.*;

import net.vvakame.util.jsonpullparser.annotation.*;

/**
 * The simple DTO of SqlEReceivePlanList. <br>
 * <pre>
 * [primary-key]
 *     
 *
 * [column]
 *     RECEIVE_CD, RECEIVE_PLAN_ID, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     
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
public abstract class BsSqlEReceivePlanListDto implements Serializable {

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
    /** RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} */
    @JsonKey
    protected String _receiveCd;

    /** RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} */
    @JsonKey
    protected Long _receivePlanId;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} */
    @JsonKey
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} */
    @JsonKey
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} */
    @JsonKey
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} */
    @JsonKey
    protected String _errorMessageCd;

    // -----------------------------------------------------
    //                                              Internal
    //                                              --------
    /** The modified properties for this DTO. */
    protected final Set<String> __modifiedProperties = new LinkedHashSet<String>();

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    public BsSqlEReceivePlanListDto() {
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
        if (other == null || !(other instanceof BsSqlEReceivePlanListDto)) { return false; }
        final BsSqlEReceivePlanListDto otherEntity = (BsSqlEReceivePlanListDto)other;
        if (!helpComparingValue(getReceiveCd(), otherEntity.getReceiveCd())) { return false; }
        if (!helpComparingValue(getReceivePlanId(), otherEntity.getReceivePlanId())) { return false; }
        if (!helpComparingValue(getReceiveRowId(), otherEntity.getReceiveRowId())) { return false; }
        if (!helpComparingValue(getImportFlg(), otherEntity.getImportFlg())) { return false; }
        if (!helpComparingValue(getErrorFlg(), otherEntity.getErrorFlg())) { return false; }
        if (!helpComparingValue(getErrorMessageCd(), otherEntity.getErrorMessageCd())) { return false; }
        return true;
    }

    protected boolean helpComparingValue(Object value1, Object value2) {
        if (value1 == null && value2 == null) { return true; }
        return value1 != null && value2 != null && value1.equals(value2);
    }

    public int hashCode() {
        int result = 17;
        result = xCH(result, "SqlEReceivePlanList");
        result = xCH(result, getReceiveCd());
        result = xCH(result, getReceivePlanId());
        result = xCH(result, getReceiveRowId());
        result = xCH(result, getImportFlg());
        result = xCH(result, getErrorFlg());
        result = xCH(result, getErrorMessageCd());
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
        sb.append(c).append(getReceiveCd());
        sb.append(c).append(getReceivePlanId());
        sb.append(c).append(getReceiveRowId());
        sb.append(c).append(getImportFlg());
        sb.append(c).append(getErrorFlg());
        sb.append(c).append(getErrorMessageCd());
        if (sb.length() > 0) { sb.delete(0, c.length()); }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public String getReceiveCd() {
        return _receiveCd;
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed)
     */
    public void setReceiveCd(String receiveCd) {
        __modifiedProperties.add("receiveCd");
        this._receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} <br>
     * 入荷予定受信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public Long getReceivePlanId() {
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} <br>
     * 入荷予定受信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed)
     */
    public void setReceivePlanId(Long receivePlanId) {
        __modifiedProperties.add("receivePlanId");
        this._receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public Long getReceiveRowId() {
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed)
     */
    public void setReceiveRowId(Long receiveRowId) {
        __modifiedProperties.add("receiveRowId");
        this._receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public String getImportFlg() {
        return _importFlg;
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed)
     */
    public void setImportFlg(String importFlg) {
        __modifiedProperties.add("importFlg");
        this._importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public String getErrorFlg() {
        return _errorFlg;
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed)
     */
    public void setErrorFlg(String errorFlg) {
        __modifiedProperties.add("errorFlg");
        this._errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public String getErrorMessageCd() {
        return _errorMessageCd;
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        __modifiedProperties.add("errorMessageCd");
        this._errorMessageCd = errorMessageCd;
    }

}
