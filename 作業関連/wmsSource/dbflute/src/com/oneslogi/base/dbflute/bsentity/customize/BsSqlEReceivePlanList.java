package com.oneslogi.base.dbflute.bsentity.customize;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.CustomizeEntity;
import com.oneslogi.base.dbflute.exentity.customize.*;

/**
 * The entity of SqlEReceivePlanList. <br>
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
 * [foreign table]
 *     
 *
 * [referrer table]
 *     
 *
 * [foreign property]
 *     
 *
 * [referrer property]
 *     
 *
 * [get/set template]
 * /= = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
 * String receiveCd = entity.getReceiveCd();
 * Long receivePlanId = entity.getReceivePlanId();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * entity.setReceiveCd(receiveCd);
 * entity.setReceivePlanId(receivePlanId);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsSqlEReceivePlanList extends AbstractEntity implements CustomizeEntity {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} */
    protected String _receiveCd;

    /** RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} */
    protected Long _receivePlanId;

    /** RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} */
    protected String _importFlg;

    /** ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} */
    protected String _errorMessageCd;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return com.oneslogi.base.dbflute.bsentity.customize.dbmeta.SqlEReceivePlanListDbm.getInstance();
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "SqlEReceivePlanList";
    }

    // ===================================================================================
    //                                                                        Key Handling
    //                                                                        ============

    private boolean sequenceToPrimaryKey = true;

    public boolean needsSequenceToPrimaryKey() {
        return sequenceToPrimaryKey;
    }

    /**
     * Sequenceオブジェクトによる採番を制御する。
     * falseを指定した場合、空の場合のみ自動採番する。
     * turueを指定した場合、空以外でも自動採番する。
     */
    public void setSequenceToPrimaryKey(boolean value) {
        sequenceToPrimaryKey = value;
    }

    /** {@inheritDoc} */
    public boolean hasPrimaryKeyValue() {
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return false;
    }

    // ===================================================================================
    //                                                                    Foreign Property
    //                                                                    ================
    // ===================================================================================
    //                                                                   Referrer Property
    //                                                                   =================
    protected <ELEMENT> List<ELEMENT> newReferrerList() { // overriding to import
        return new ArrayList<ELEMENT>();
    }

    // ===================================================================================
    //                                                                      Basic Override
    //                                                                      ==============
    @Override
    protected boolean doEquals(Object obj) {
        if (obj instanceof BsSqlEReceivePlanList) {
            BsSqlEReceivePlanList other = (BsSqlEReceivePlanList)obj;
            if (!xSV(_receiveCd, other._receiveCd)) { return false; }
            if (!xSV(_receivePlanId, other._receivePlanId)) { return false; }
            if (!xSV(_receiveRowId, other._receiveRowId)) { return false; }
            if (!xSV(_importFlg, other._importFlg)) { return false; }
            if (!xSV(_errorFlg, other._errorFlg)) { return false; }
            if (!xSV(_errorMessageCd, other._errorMessageCd)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _receiveCd);
        hs = xCH(hs, _receivePlanId);
        hs = xCH(hs, _receiveRowId);
        hs = xCH(hs, _importFlg);
        hs = xCH(hs, _errorFlg);
        hs = xCH(hs, _errorMessageCd);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receivePlanId));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        if (sb.length() > dm.length()) {
            sb.delete(0, dm.length());
        }
        sb.insert(0, "{").append("}");
        return sb.toString();
    }

    @Override
    protected String doBuildRelationString(String dm) {
        return "";
    }

    @Override
    public SqlEReceivePlanList clone() {
        return (SqlEReceivePlanList)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {VARCHAR(30), refers to e_receive_plan.RECEIVE_CD} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} <br>
     * 入荷予定受信ID
     * @return The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceivePlanId() {
        checkSpecifiedProperty("receivePlanId");
        return _receivePlanId;
    }

    /**
     * [set] RECEIVE_PLAN_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_PLAN_ID} <br>
     * 入荷予定受信ID
     * @param receivePlanId The value of the column 'RECEIVE_PLAN_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceivePlanId(Long receivePlanId) {
        registerModifiedProperty("receivePlanId");
        _receivePlanId = receivePlanId;
    }

    /**
     * [get] RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (NullAllowed even if selected: for no constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {BIGINT(20), refers to e_receive_plan.RECEIVE_ROW_ID} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (NullAllowed: null update allowed for no constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {CHAR(1), refers to e_receive_plan.IMPORT_FLG} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {CHAR(1), refers to e_receive_plan.ERROR_FLG} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100), refers to e_receive_plan.ERROR_MESSAGE_CD} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }
}
