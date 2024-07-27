package com.oneslogi.base.dbflute.bsentity;

import java.util.List;
import java.util.ArrayList;

import org.dbflute.dbmeta.DBMeta;
import org.dbflute.dbmeta.AbstractEntity;
import org.dbflute.dbmeta.accessory.DomainEntity;
import com.oneslogi.base.dbflute.allcommon.EntityDefinedCommonColumn;
import com.oneslogi.base.dbflute.allcommon.DBMetaInstanceHandler;
import com.oneslogi.base.dbflute.allcommon.CDef;
import com.oneslogi.base.dbflute.exentity.*;

/**
 * The entity of er_serial_no as TABLE. <br>
 * シリアル番号情報受信テーブル
 * <pre>
 * [primary-key]
 *     SERIAL_NO_ID
 *
 * [column]
 *     SERIAL_NO_ID, RECEIVE_CD, RECEIVE_ROW_ID, IMPORT_FLG, ERROR_FLG, ERROR_MESSAGE_CD, SHIPPING_SLIP_NO, SHIPPING_SLIP_ROW_NO, SERIAL_NO, HINMOKU_CD, HINMOKU_GROUP, HINMOKU_TEXT, JAN_CD, UNIT_NM, SALES_ORG_CD, SHIPPING_DT, CUSTOMER_CD, DESTINATION_CD, DESTINATION_NM1, DESTINATION_NM2, DESTINATION_NM_KANA, DESTINATION_ZIP_CD, DESTINATION_ADDRESS1, DESTINATION_ADDRESS2, DESTINATION_TEL, SHIPPING_PLANT_CD, SHIPPING_STORAGE_SPACE_CD, WMS_ADD_YYYY, WMS_ADD_MM, WMS_ADD_DD, WMS_ADD_HH, WMS_ADD_MI, WMS_ADD_SS, WMS_ADD_USER_CD, WMS_UPD_YYYY, WMS_UPD_MM, WMS_UPD_DD, WMS_UPD_HH, WMS_UPD_MI, WMS_UPD_SS, WMS_UPD_USER_CD, SPARE_STR, DEL_FLG, VERSION_NO, CONTROL_NO, ADD_DT, ADD_USER, ADD_PROCESS, UPD_DT, UPD_USER, UPD_PROCESS
 *
 * [sequence]
 *     
 *
 * [identity]
 *     
 *
 * [version-no]
 *     VERSION_NO
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
 * Long serialNoId = entity.getSerialNoId();
 * String receiveCd = entity.getReceiveCd();
 * Long receiveRowId = entity.getReceiveRowId();
 * String importFlg = entity.getImportFlg();
 * String errorFlg = entity.getErrorFlg();
 * String errorMessageCd = entity.getErrorMessageCd();
 * String shippingSlipNo = entity.getShippingSlipNo();
 * String shippingSlipRowNo = entity.getShippingSlipRowNo();
 * String serialNo = entity.getSerialNo();
 * String hinmokuCd = entity.getHinmokuCd();
 * String hinmokuGroup = entity.getHinmokuGroup();
 * String hinmokuText = entity.getHinmokuText();
 * String janCd = entity.getJanCd();
 * String unitNm = entity.getUnitNm();
 * String salesOrgCd = entity.getSalesOrgCd();
 * String shippingDt = entity.getShippingDt();
 * String customerCd = entity.getCustomerCd();
 * String destinationCd = entity.getDestinationCd();
 * String destinationNm1 = entity.getDestinationNm1();
 * String destinationNm2 = entity.getDestinationNm2();
 * String destinationNmKana = entity.getDestinationNmKana();
 * String destinationZipCd = entity.getDestinationZipCd();
 * String destinationAddress1 = entity.getDestinationAddress1();
 * String destinationAddress2 = entity.getDestinationAddress2();
 * String destinationTel = entity.getDestinationTel();
 * String shippingPlantCd = entity.getShippingPlantCd();
 * String shippingStorageSpaceCd = entity.getShippingStorageSpaceCd();
 * String wmsAddYyyy = entity.getWmsAddYyyy();
 * String wmsAddMm = entity.getWmsAddMm();
 * String wmsAddDd = entity.getWmsAddDd();
 * String wmsAddHh = entity.getWmsAddHh();
 * String wmsAddMi = entity.getWmsAddMi();
 * String wmsAddSs = entity.getWmsAddSs();
 * String wmsAddUserCd = entity.getWmsAddUserCd();
 * String wmsUpdYyyy = entity.getWmsUpdYyyy();
 * String wmsUpdMm = entity.getWmsUpdMm();
 * String wmsUpdDd = entity.getWmsUpdDd();
 * String wmsUpdHh = entity.getWmsUpdHh();
 * String wmsUpdMi = entity.getWmsUpdMi();
 * String wmsUpdSs = entity.getWmsUpdSs();
 * String wmsUpdUserCd = entity.getWmsUpdUserCd();
 * String spareStr = entity.getSpareStr();
 * String delFlg = entity.getDelFlg();
 * Long versionNo = entity.getVersionNo();
 * Long controlNo = entity.getControlNo();
 * java.sql.Timestamp addDt = entity.getAddDt();
 * String addUser = entity.getAddUser();
 * String addProcess = entity.getAddProcess();
 * java.sql.Timestamp updDt = entity.getUpdDt();
 * String updUser = entity.getUpdUser();
 * String updProcess = entity.getUpdProcess();
 * entity.setSerialNoId(serialNoId);
 * entity.setReceiveCd(receiveCd);
 * entity.setReceiveRowId(receiveRowId);
 * entity.setImportFlg(importFlg);
 * entity.setErrorFlg(errorFlg);
 * entity.setErrorMessageCd(errorMessageCd);
 * entity.setShippingSlipNo(shippingSlipNo);
 * entity.setShippingSlipRowNo(shippingSlipRowNo);
 * entity.setSerialNo(serialNo);
 * entity.setHinmokuCd(hinmokuCd);
 * entity.setHinmokuGroup(hinmokuGroup);
 * entity.setHinmokuText(hinmokuText);
 * entity.setJanCd(janCd);
 * entity.setUnitNm(unitNm);
 * entity.setSalesOrgCd(salesOrgCd);
 * entity.setShippingDt(shippingDt);
 * entity.setCustomerCd(customerCd);
 * entity.setDestinationCd(destinationCd);
 * entity.setDestinationNm1(destinationNm1);
 * entity.setDestinationNm2(destinationNm2);
 * entity.setDestinationNmKana(destinationNmKana);
 * entity.setDestinationZipCd(destinationZipCd);
 * entity.setDestinationAddress1(destinationAddress1);
 * entity.setDestinationAddress2(destinationAddress2);
 * entity.setDestinationTel(destinationTel);
 * entity.setShippingPlantCd(shippingPlantCd);
 * entity.setShippingStorageSpaceCd(shippingStorageSpaceCd);
 * entity.setWmsAddYyyy(wmsAddYyyy);
 * entity.setWmsAddMm(wmsAddMm);
 * entity.setWmsAddDd(wmsAddDd);
 * entity.setWmsAddHh(wmsAddHh);
 * entity.setWmsAddMi(wmsAddMi);
 * entity.setWmsAddSs(wmsAddSs);
 * entity.setWmsAddUserCd(wmsAddUserCd);
 * entity.setWmsUpdYyyy(wmsUpdYyyy);
 * entity.setWmsUpdMm(wmsUpdMm);
 * entity.setWmsUpdDd(wmsUpdDd);
 * entity.setWmsUpdHh(wmsUpdHh);
 * entity.setWmsUpdMi(wmsUpdMi);
 * entity.setWmsUpdSs(wmsUpdSs);
 * entity.setWmsUpdUserCd(wmsUpdUserCd);
 * entity.setSpareStr(spareStr);
 * entity.setDelFlg(delFlg);
 * entity.setVersionNo(versionNo);
 * entity.setControlNo(controlNo);
 * entity.setAddDt(addDt);
 * entity.setAddUser(addUser);
 * entity.setAddProcess(addProcess);
 * entity.setUpdDt(updDt);
 * entity.setUpdUser(updUser);
 * entity.setUpdProcess(updProcess);
 * = = = = = = = = = =/
 * </pre>
 * @author DBFlute(AutoGenerator)
 */
public abstract class BsErSerialNo extends AbstractEntity implements DomainEntity, EntityDefinedCommonColumn {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The serial version UID for object serialization. (Default) */
    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** SERIAL_NO_ID: {PK, NotNull, BIGINT(19)} */
    protected Long _serialNoId;

    /** RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} */
    protected String _receiveCd;

    /** RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} */
    protected Long _receiveRowId;

    /** IMPORT_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _importFlg;

    /** ERROR_FLG: {NotNull, CHAR(1), default=[0]} */
    protected String _errorFlg;

    /** ERROR_MESSAGE_CD: {VARCHAR(100)} */
    protected String _errorMessageCd;

    /** SHIPPING_SLIP_NO: {VARCHAR(30)} */
    protected String _shippingSlipNo;

    /** SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} */
    protected String _shippingSlipRowNo;

    /** SERIAL_NO: {VARCHAR(100)} */
    protected String _serialNo;

    /** HINMOKU_CD: {VARCHAR(100)} */
    protected String _hinmokuCd;

    /** HINMOKU_GROUP: {VARCHAR(30)} */
    protected String _hinmokuGroup;

    /** HINMOKU_TEXT: {VARCHAR(60)} */
    protected String _hinmokuText;

    /** JAN_CD: {VARCHAR(30)} */
    protected String _janCd;

    /** UNIT_NM: {VARCHAR(60)} */
    protected String _unitNm;

    /** SALES_ORG_CD: {VARCHAR(30)} */
    protected String _salesOrgCd;

    /** SHIPPING_DT: {VARCHAR(30)} */
    protected String _shippingDt;

    /** CUSTOMER_CD: {VARCHAR(30)} */
    protected String _customerCd;

    /** DESTINATION_CD: {VARCHAR(30)} */
    protected String _destinationCd;

    /** DESTINATION_NM1: {VARCHAR(60)} */
    protected String _destinationNm1;

    /** DESTINATION_NM2: {VARCHAR(60)} */
    protected String _destinationNm2;

    /** DESTINATION_NM_KANA: {VARCHAR(60)} */
    protected String _destinationNmKana;

    /** DESTINATION_ZIP_CD: {VARCHAR(60)} */
    protected String _destinationZipCd;

    /** DESTINATION_ADDRESS1: {VARCHAR(60)} */
    protected String _destinationAddress1;

    /** DESTINATION_ADDRESS2: {VARCHAR(60)} */
    protected String _destinationAddress2;

    /** DESTINATION_TEL: {VARCHAR(30)} */
    protected String _destinationTel;

    /** SHIPPING_PLANT_CD: {VARCHAR(30)} */
    protected String _shippingPlantCd;

    /** SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} */
    protected String _shippingStorageSpaceCd;

    /** WMS_ADD_YYYY: {VARCHAR(30)} */
    protected String _wmsAddYyyy;

    /** WMS_ADD_MM: {VARCHAR(30)} */
    protected String _wmsAddMm;

    /** WMS_ADD_DD: {VARCHAR(30)} */
    protected String _wmsAddDd;

    /** WMS_ADD_HH: {VARCHAR(30)} */
    protected String _wmsAddHh;

    /** WMS_ADD_MI: {VARCHAR(30)} */
    protected String _wmsAddMi;

    /** WMS_ADD_SS: {VARCHAR(30)} */
    protected String _wmsAddSs;

    /** WMS_ADD_USER_CD: {VARCHAR(30)} */
    protected String _wmsAddUserCd;

    /** WMS_UPD_YYYY: {VARCHAR(30)} */
    protected String _wmsUpdYyyy;

    /** WMS_UPD_MM: {VARCHAR(30)} */
    protected String _wmsUpdMm;

    /** WMS_UPD_DD: {VARCHAR(30)} */
    protected String _wmsUpdDd;

    /** WMS_UPD_HH: {VARCHAR(30)} */
    protected String _wmsUpdHh;

    /** WMS_UPD_MI: {VARCHAR(30)} */
    protected String _wmsUpdMi;

    /** WMS_UPD_SS: {VARCHAR(30)} */
    protected String _wmsUpdSs;

    /** WMS_UPD_USER_CD: {VARCHAR(30)} */
    protected String _wmsUpdUserCd;

    /** SPARE_STR: {VARCHAR(255)} */
    protected String _spareStr;

    /** DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} */
    protected String _delFlg;

    /** VERSION_NO: {NotNull, BIGINT(19), default=[0]} */
    protected Long _versionNo;

    /** CONTROL_NO: {IX, BIGINT(19)} */
    protected Long _controlNo;

    /** ADD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _addDt;

    /** ADD_USER: {VARCHAR(60)} */
    protected String _addUser;

    /** ADD_PROCESS: {VARCHAR(255)} */
    protected String _addProcess;

    /** UPD_DT: {DATETIME(19)} */
    protected java.sql.Timestamp _updDt;

    /** UPD_USER: {VARCHAR(60)} */
    protected String _updUser;

    /** UPD_PROCESS: {VARCHAR(255)} */
    protected String _updProcess;

    // ===================================================================================
    //                                                                             DB Meta
    //                                                                             =======
    /** {@inheritDoc} */
    public DBMeta asDBMeta() {
        return DBMetaInstanceHandler.findDBMeta(asTableDbName());
    }

    /** {@inheritDoc} */
    public String asTableDbName() {
        return "er_serial_no";
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
        if (_serialNoId == null) { return false; }
        // DBFluteの自動採番制御を、自動生成コードの改修で調整。
        // MySQLの挙動を基本に、値が空でなくても自動採番する挙動を基本とする。
        if (sequenceToPrimaryKey && asDBMeta().hasSequence() && Thread.currentThread().getStackTrace()[2].getMethodName().equals("injectSequenceToPrimaryKeyIfNeeds")) { return false; }
        return true;
    }

    /**
     * To be unique by the unique column. <br>
     * You can update the entity by the key when entity update (NOT batch update).
     * @param receiveCd : UQ+, IX, NotNull, VARCHAR(30). (NotNull)
     * @param receiveRowId : +UQ, NotNull, BIGINT(19). (NotNull)
     */
    public void uniqueBy(String receiveCd, Long receiveRowId) {
        __uniqueDrivenProperties.clear();
        __uniqueDrivenProperties.addPropertyName("receiveCd");
        __uniqueDrivenProperties.addPropertyName("receiveRowId");
        setReceiveCd(receiveCd);setReceiveRowId(receiveRowId);
    }

    // ===================================================================================
    //                                                             Classification Property
    //                                                             =======================
    /**
     * Get the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * <p>It's treated as case insensitive and if the code value is null, it returns null.</p>
     * @return The instance of classification definition (as ENUM type). (NullAllowed: when the column value is null)
     */
    public CDef.DelFlg getDelFlgAsDelFlg() {
        return CDef.DelFlg.codeOf(getDelFlg());
    }

    /**
     * Set the value of delFlg as the classification of DelFlg. <br>
     * DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param cdef The instance of classification definition (as ENUM type). (NullAllowed: if null, null value is set to the column)
     */
    public void setDelFlgAsDelFlg(CDef.DelFlg cdef) {
        setDelFlg(cdef != null ? cdef.code() : null);
    }

    // ===================================================================================
    //                                                              Classification Setting
    //                                                              ======================
    /**
     * Set the value of delFlg as $0 (0). <br>
     * $0: 未削除
     */
    public void setDelFlg_$0() {
        setDelFlgAsDelFlg(CDef.DelFlg.$0);
    }

    /**
     * Set the value of delFlg as $1 (1). <br>
     * $1: 削除済
     */
    public void setDelFlg_$1() {
        setDelFlgAsDelFlg(CDef.DelFlg.$1);
    }

    // ===================================================================================
    //                                                        Classification Determination
    //                                                        ============================
    /**
     * Is the value of delFlg $0? <br>
     * $0: 未削除
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$0() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$0) : false;
    }

    /**
     * Is the value of delFlg $1? <br>
     * $1: 削除済
     * <p>It's treated as case insensitive and if the code value is null, it returns false.</p>
     * @return The determination, true or false.
     */
    public boolean isDelFlg$1() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.equals(CDef.DelFlg.$1) : false;
    }

    // ===================================================================================
    //                                                           Classification Name/Alias
    //                                                           =========================
    /**
     * Get the value of the column 'delFlg' as classification name.
     * @return The string of classification name. (NullAllowed: when the column value is null)
     */
    public String getDelFlgName() {
        CDef.DelFlg cdef = getDelFlgAsDelFlg();
        return cdef != null ? cdef.name() : null;
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
        if (obj instanceof BsErSerialNo) {
            BsErSerialNo other = (BsErSerialNo)obj;
            if (!xSV(_serialNoId, other._serialNoId)) { return false; }
            return true;
        } else {
            return false;
        }
    }

    @Override
    protected int doHashCode(int initial) {
        int hs = initial;
        hs = xCH(hs, asTableDbName());
        hs = xCH(hs, _serialNoId);
        return hs;
    }

    @Override
    protected String doBuildStringWithRelation(String li) {
        return "";
    }

    @Override
    protected String doBuildColumnString(String dm) {
        StringBuilder sb = new StringBuilder();
        sb.append(dm).append(xfND(_serialNoId));
        sb.append(dm).append(xfND(_receiveCd));
        sb.append(dm).append(xfND(_receiveRowId));
        sb.append(dm).append(xfND(_importFlg));
        sb.append(dm).append(xfND(_errorFlg));
        sb.append(dm).append(xfND(_errorMessageCd));
        sb.append(dm).append(xfND(_shippingSlipNo));
        sb.append(dm).append(xfND(_shippingSlipRowNo));
        sb.append(dm).append(xfND(_serialNo));
        sb.append(dm).append(xfND(_hinmokuCd));
        sb.append(dm).append(xfND(_hinmokuGroup));
        sb.append(dm).append(xfND(_hinmokuText));
        sb.append(dm).append(xfND(_janCd));
        sb.append(dm).append(xfND(_unitNm));
        sb.append(dm).append(xfND(_salesOrgCd));
        sb.append(dm).append(xfND(_shippingDt));
        sb.append(dm).append(xfND(_customerCd));
        sb.append(dm).append(xfND(_destinationCd));
        sb.append(dm).append(xfND(_destinationNm1));
        sb.append(dm).append(xfND(_destinationNm2));
        sb.append(dm).append(xfND(_destinationNmKana));
        sb.append(dm).append(xfND(_destinationZipCd));
        sb.append(dm).append(xfND(_destinationAddress1));
        sb.append(dm).append(xfND(_destinationAddress2));
        sb.append(dm).append(xfND(_destinationTel));
        sb.append(dm).append(xfND(_shippingPlantCd));
        sb.append(dm).append(xfND(_shippingStorageSpaceCd));
        sb.append(dm).append(xfND(_wmsAddYyyy));
        sb.append(dm).append(xfND(_wmsAddMm));
        sb.append(dm).append(xfND(_wmsAddDd));
        sb.append(dm).append(xfND(_wmsAddHh));
        sb.append(dm).append(xfND(_wmsAddMi));
        sb.append(dm).append(xfND(_wmsAddSs));
        sb.append(dm).append(xfND(_wmsAddUserCd));
        sb.append(dm).append(xfND(_wmsUpdYyyy));
        sb.append(dm).append(xfND(_wmsUpdMm));
        sb.append(dm).append(xfND(_wmsUpdDd));
        sb.append(dm).append(xfND(_wmsUpdHh));
        sb.append(dm).append(xfND(_wmsUpdMi));
        sb.append(dm).append(xfND(_wmsUpdSs));
        sb.append(dm).append(xfND(_wmsUpdUserCd));
        sb.append(dm).append(xfND(_spareStr));
        sb.append(dm).append(xfND(_delFlg));
        sb.append(dm).append(xfND(_versionNo));
        sb.append(dm).append(xfND(_controlNo));
        sb.append(dm).append(xfND(_addDt));
        sb.append(dm).append(xfND(_addUser));
        sb.append(dm).append(xfND(_addProcess));
        sb.append(dm).append(xfND(_updDt));
        sb.append(dm).append(xfND(_updUser));
        sb.append(dm).append(xfND(_updProcess));
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
    public ErSerialNo clone() {
        return (ErSerialNo)super.clone();
    }

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    /**
     * [get] SERIAL_NO_ID: {PK, NotNull, BIGINT(19)} <br>
     * シリアル番号情報受信ID
     * @return The value of the column 'SERIAL_NO_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getSerialNoId() {
        checkSpecifiedProperty("serialNoId");
        return _serialNoId;
    }

    /**
     * [set] SERIAL_NO_ID: {PK, NotNull, BIGINT(19)} <br>
     * シリアル番号情報受信ID
     * @param serialNoId The value of the column 'SERIAL_NO_ID'. (basically NotNull if update: for the constraint)
     */
    public void setSerialNoId(Long serialNoId) {
        registerModifiedProperty("serialNoId");
        _serialNoId = serialNoId;
    }

    /**
     * [get] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @return The value of the column 'RECEIVE_CD'. (basically NotNull if selected: for the constraint)
     */
    public String getReceiveCd() {
        checkSpecifiedProperty("receiveCd");
        return convertEmptyToNull(_receiveCd);
    }

    /**
     * [set] RECEIVE_CD: {UQ+, IX, NotNull, VARCHAR(30)} <br>
     * 受信CD
     * @param receiveCd The value of the column 'RECEIVE_CD'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveCd(String receiveCd) {
        registerModifiedProperty("receiveCd");
        _receiveCd = receiveCd;
    }

    /**
     * [get] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @return The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if selected: for the constraint)
     */
    public Long getReceiveRowId() {
        checkSpecifiedProperty("receiveRowId");
        return _receiveRowId;
    }

    /**
     * [set] RECEIVE_ROW_ID: {+UQ, NotNull, BIGINT(19)} <br>
     * 受信行ID
     * @param receiveRowId The value of the column 'RECEIVE_ROW_ID'. (basically NotNull if update: for the constraint)
     */
    public void setReceiveRowId(Long receiveRowId) {
        registerModifiedProperty("receiveRowId");
        _receiveRowId = receiveRowId;
    }

    /**
     * [get] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @return The value of the column 'IMPORT_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getImportFlg() {
        checkSpecifiedProperty("importFlg");
        return convertEmptyToNull(_importFlg);
    }

    /**
     * [set] IMPORT_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * 取込みフラグ
     * @param importFlg The value of the column 'IMPORT_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setImportFlg(String importFlg) {
        registerModifiedProperty("importFlg");
        _importFlg = importFlg;
    }

    /**
     * [get] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @return The value of the column 'ERROR_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getErrorFlg() {
        checkSpecifiedProperty("errorFlg");
        return convertEmptyToNull(_errorFlg);
    }

    /**
     * [set] ERROR_FLG: {NotNull, CHAR(1), default=[0]} <br>
     * エラーフラグ
     * @param errorFlg The value of the column 'ERROR_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setErrorFlg(String errorFlg) {
        registerModifiedProperty("errorFlg");
        _errorFlg = errorFlg;
    }

    /**
     * [get] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @return The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getErrorMessageCd() {
        checkSpecifiedProperty("errorMessageCd");
        return convertEmptyToNull(_errorMessageCd);
    }

    /**
     * [set] ERROR_MESSAGE_CD: {VARCHAR(100)} <br>
     * エラーメッセージCD
     * @param errorMessageCd The value of the column 'ERROR_MESSAGE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setErrorMessageCd(String errorMessageCd) {
        registerModifiedProperty("errorMessageCd");
        _errorMessageCd = errorMessageCd;
    }

    /**
     * [get] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @return The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipNo() {
        checkSpecifiedProperty("shippingSlipNo");
        return convertEmptyToNull(_shippingSlipNo);
    }

    /**
     * [set] SHIPPING_SLIP_NO: {VARCHAR(30)} <br>
     * 出荷伝票番号
     * @param shippingSlipNo The value of the column 'SHIPPING_SLIP_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipNo(String shippingSlipNo) {
        registerModifiedProperty("shippingSlipNo");
        _shippingSlipNo = shippingSlipNo;
    }

    /**
     * [get] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @return The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingSlipRowNo() {
        checkSpecifiedProperty("shippingSlipRowNo");
        return convertEmptyToNull(_shippingSlipRowNo);
    }

    /**
     * [set] SHIPPING_SLIP_ROW_NO: {VARCHAR(30)} <br>
     * 出荷伝票明細番号
     * @param shippingSlipRowNo The value of the column 'SHIPPING_SLIP_ROW_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingSlipRowNo(String shippingSlipRowNo) {
        registerModifiedProperty("shippingSlipRowNo");
        _shippingSlipRowNo = shippingSlipRowNo;
    }

    /**
     * [get] SERIAL_NO: {VARCHAR(100)} <br>
     * シリアル番号
     * @return The value of the column 'SERIAL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public String getSerialNo() {
        checkSpecifiedProperty("serialNo");
        return convertEmptyToNull(_serialNo);
    }

    /**
     * [set] SERIAL_NO: {VARCHAR(100)} <br>
     * シリアル番号
     * @param serialNo The value of the column 'SERIAL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSerialNo(String serialNo) {
        registerModifiedProperty("serialNo");
        _serialNo = serialNo;
    }

    /**
     * [get] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @return The value of the column 'HINMOKU_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuCd() {
        checkSpecifiedProperty("hinmokuCd");
        return convertEmptyToNull(_hinmokuCd);
    }

    /**
     * [set] HINMOKU_CD: {VARCHAR(100)} <br>
     * 品目CD
     * @param hinmokuCd The value of the column 'HINMOKU_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuCd(String hinmokuCd) {
        registerModifiedProperty("hinmokuCd");
        _hinmokuCd = hinmokuCd;
    }

    /**
     * [get] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @return The value of the column 'HINMOKU_GROUP'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuGroup() {
        checkSpecifiedProperty("hinmokuGroup");
        return convertEmptyToNull(_hinmokuGroup);
    }

    /**
     * [set] HINMOKU_GROUP: {VARCHAR(30)} <br>
     * 品目グループ
     * @param hinmokuGroup The value of the column 'HINMOKU_GROUP'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuGroup(String hinmokuGroup) {
        registerModifiedProperty("hinmokuGroup");
        _hinmokuGroup = hinmokuGroup;
    }

    /**
     * [get] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @return The value of the column 'HINMOKU_TEXT'. (NullAllowed even if selected: for no constraint)
     */
    public String getHinmokuText() {
        checkSpecifiedProperty("hinmokuText");
        return convertEmptyToNull(_hinmokuText);
    }

    /**
     * [set] HINMOKU_TEXT: {VARCHAR(60)} <br>
     * 品目テキスト
     * @param hinmokuText The value of the column 'HINMOKU_TEXT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setHinmokuText(String hinmokuText) {
        registerModifiedProperty("hinmokuText");
        _hinmokuText = hinmokuText;
    }

    /**
     * [get] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @return The value of the column 'JAN_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getJanCd() {
        checkSpecifiedProperty("janCd");
        return convertEmptyToNull(_janCd);
    }

    /**
     * [set] JAN_CD: {VARCHAR(30)} <br>
     * JANCD
     * @param janCd The value of the column 'JAN_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setJanCd(String janCd) {
        registerModifiedProperty("janCd");
        _janCd = janCd;
    }

    /**
     * [get] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @return The value of the column 'UNIT_NM'. (NullAllowed even if selected: for no constraint)
     */
    public String getUnitNm() {
        checkSpecifiedProperty("unitNm");
        return convertEmptyToNull(_unitNm);
    }

    /**
     * [set] UNIT_NM: {VARCHAR(60)} <br>
     * 単位名称
     * @param unitNm The value of the column 'UNIT_NM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUnitNm(String unitNm) {
        registerModifiedProperty("unitNm");
        _unitNm = unitNm;
    }

    /**
     * [get] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @return The value of the column 'SALES_ORG_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getSalesOrgCd() {
        checkSpecifiedProperty("salesOrgCd");
        return convertEmptyToNull(_salesOrgCd);
    }

    /**
     * [set] SALES_ORG_CD: {VARCHAR(30)} <br>
     * 販売組織CD
     * @param salesOrgCd The value of the column 'SALES_ORG_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSalesOrgCd(String salesOrgCd) {
        registerModifiedProperty("salesOrgCd");
        _salesOrgCd = salesOrgCd;
    }

    /**
     * [get] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @return The value of the column 'SHIPPING_DT'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingDt() {
        checkSpecifiedProperty("shippingDt");
        return convertEmptyToNull(_shippingDt);
    }

    /**
     * [set] SHIPPING_DT: {VARCHAR(30)} <br>
     * 出荷日
     * @param shippingDt The value of the column 'SHIPPING_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingDt(String shippingDt) {
        registerModifiedProperty("shippingDt");
        _shippingDt = shippingDt;
    }

    /**
     * [get] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @return The value of the column 'CUSTOMER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getCustomerCd() {
        checkSpecifiedProperty("customerCd");
        return convertEmptyToNull(_customerCd);
    }

    /**
     * [set] CUSTOMER_CD: {VARCHAR(30)} <br>
     * 取引先CD
     * @param customerCd The value of the column 'CUSTOMER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setCustomerCd(String customerCd) {
        registerModifiedProperty("customerCd");
        _customerCd = customerCd;
    }

    /**
     * [get] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @return The value of the column 'DESTINATION_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationCd() {
        checkSpecifiedProperty("destinationCd");
        return convertEmptyToNull(_destinationCd);
    }

    /**
     * [set] DESTINATION_CD: {VARCHAR(30)} <br>
     * 送り先CD
     * @param destinationCd The value of the column 'DESTINATION_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationCd(String destinationCd) {
        registerModifiedProperty("destinationCd");
        _destinationCd = destinationCd;
    }

    /**
     * [get] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @return The value of the column 'DESTINATION_NM1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm1() {
        checkSpecifiedProperty("destinationNm1");
        return convertEmptyToNull(_destinationNm1);
    }

    /**
     * [set] DESTINATION_NM1: {VARCHAR(60)} <br>
     * 送り先名称１
     * @param destinationNm1 The value of the column 'DESTINATION_NM1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm1(String destinationNm1) {
        registerModifiedProperty("destinationNm1");
        _destinationNm1 = destinationNm1;
    }

    /**
     * [get] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @return The value of the column 'DESTINATION_NM2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNm2() {
        checkSpecifiedProperty("destinationNm2");
        return convertEmptyToNull(_destinationNm2);
    }

    /**
     * [set] DESTINATION_NM2: {VARCHAR(60)} <br>
     * 送り先名称２
     * @param destinationNm2 The value of the column 'DESTINATION_NM2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNm2(String destinationNm2) {
        registerModifiedProperty("destinationNm2");
        _destinationNm2 = destinationNm2;
    }

    /**
     * [get] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @return The value of the column 'DESTINATION_NM_KANA'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationNmKana() {
        checkSpecifiedProperty("destinationNmKana");
        return convertEmptyToNull(_destinationNmKana);
    }

    /**
     * [set] DESTINATION_NM_KANA: {VARCHAR(60)} <br>
     * 送り先名称_カナ
     * @param destinationNmKana The value of the column 'DESTINATION_NM_KANA'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationNmKana(String destinationNmKana) {
        registerModifiedProperty("destinationNmKana");
        _destinationNmKana = destinationNmKana;
    }

    /**
     * [get] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @return The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationZipCd() {
        checkSpecifiedProperty("destinationZipCd");
        return convertEmptyToNull(_destinationZipCd);
    }

    /**
     * [set] DESTINATION_ZIP_CD: {VARCHAR(60)} <br>
     * 送り先郵便番号
     * @param destinationZipCd The value of the column 'DESTINATION_ZIP_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationZipCd(String destinationZipCd) {
        registerModifiedProperty("destinationZipCd");
        _destinationZipCd = destinationZipCd;
    }

    /**
     * [get] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @return The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress1() {
        checkSpecifiedProperty("destinationAddress1");
        return convertEmptyToNull(_destinationAddress1);
    }

    /**
     * [set] DESTINATION_ADDRESS1: {VARCHAR(60)} <br>
     * 送り先住所１
     * @param destinationAddress1 The value of the column 'DESTINATION_ADDRESS1'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress1(String destinationAddress1) {
        registerModifiedProperty("destinationAddress1");
        _destinationAddress1 = destinationAddress1;
    }

    /**
     * [get] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @return The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationAddress2() {
        checkSpecifiedProperty("destinationAddress2");
        return convertEmptyToNull(_destinationAddress2);
    }

    /**
     * [set] DESTINATION_ADDRESS2: {VARCHAR(60)} <br>
     * 送り先住所２
     * @param destinationAddress2 The value of the column 'DESTINATION_ADDRESS2'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationAddress2(String destinationAddress2) {
        registerModifiedProperty("destinationAddress2");
        _destinationAddress2 = destinationAddress2;
    }

    /**
     * [get] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @return The value of the column 'DESTINATION_TEL'. (NullAllowed even if selected: for no constraint)
     */
    public String getDestinationTel() {
        checkSpecifiedProperty("destinationTel");
        return convertEmptyToNull(_destinationTel);
    }

    /**
     * [set] DESTINATION_TEL: {VARCHAR(30)} <br>
     * 送り先電話番号
     * @param destinationTel The value of the column 'DESTINATION_TEL'. (NullAllowed: null update allowed for no constraint)
     */
    public void setDestinationTel(String destinationTel) {
        registerModifiedProperty("destinationTel");
        _destinationTel = destinationTel;
    }

    /**
     * [get] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @return The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingPlantCd() {
        checkSpecifiedProperty("shippingPlantCd");
        return convertEmptyToNull(_shippingPlantCd);
    }

    /**
     * [set] SHIPPING_PLANT_CD: {VARCHAR(30)} <br>
     * 出庫プラント
     * @param shippingPlantCd The value of the column 'SHIPPING_PLANT_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingPlantCd(String shippingPlantCd) {
        registerModifiedProperty("shippingPlantCd");
        _shippingPlantCd = shippingPlantCd;
    }

    /**
     * [get] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @return The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getShippingStorageSpaceCd() {
        checkSpecifiedProperty("shippingStorageSpaceCd");
        return convertEmptyToNull(_shippingStorageSpaceCd);
    }

    /**
     * [set] SHIPPING_STORAGE_SPACE_CD: {VARCHAR(30)} <br>
     * 出庫保管場所
     * @param shippingStorageSpaceCd The value of the column 'SHIPPING_STORAGE_SPACE_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setShippingStorageSpaceCd(String shippingStorageSpaceCd) {
        registerModifiedProperty("shippingStorageSpaceCd");
        _shippingStorageSpaceCd = shippingStorageSpaceCd;
    }

    /**
     * [get] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @return The value of the column 'WMS_ADD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddYyyy() {
        checkSpecifiedProperty("wmsAddYyyy");
        return convertEmptyToNull(_wmsAddYyyy);
    }

    /**
     * [set] WMS_ADD_YYYY: {VARCHAR(30)} <br>
     * WMS作成日_年
     * @param wmsAddYyyy The value of the column 'WMS_ADD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddYyyy(String wmsAddYyyy) {
        registerModifiedProperty("wmsAddYyyy");
        _wmsAddYyyy = wmsAddYyyy;
    }

    /**
     * [get] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @return The value of the column 'WMS_ADD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMm() {
        checkSpecifiedProperty("wmsAddMm");
        return convertEmptyToNull(_wmsAddMm);
    }

    /**
     * [set] WMS_ADD_MM: {VARCHAR(30)} <br>
     * WMS作成日_月
     * @param wmsAddMm The value of the column 'WMS_ADD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMm(String wmsAddMm) {
        registerModifiedProperty("wmsAddMm");
        _wmsAddMm = wmsAddMm;
    }

    /**
     * [get] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @return The value of the column 'WMS_ADD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddDd() {
        checkSpecifiedProperty("wmsAddDd");
        return convertEmptyToNull(_wmsAddDd);
    }

    /**
     * [set] WMS_ADD_DD: {VARCHAR(30)} <br>
     * WMS作成日_日
     * @param wmsAddDd The value of the column 'WMS_ADD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddDd(String wmsAddDd) {
        registerModifiedProperty("wmsAddDd");
        _wmsAddDd = wmsAddDd;
    }

    /**
     * [get] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @return The value of the column 'WMS_ADD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddHh() {
        checkSpecifiedProperty("wmsAddHh");
        return convertEmptyToNull(_wmsAddHh);
    }

    /**
     * [set] WMS_ADD_HH: {VARCHAR(30)} <br>
     * WMS作成時間_時
     * @param wmsAddHh The value of the column 'WMS_ADD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddHh(String wmsAddHh) {
        registerModifiedProperty("wmsAddHh");
        _wmsAddHh = wmsAddHh;
    }

    /**
     * [get] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @return The value of the column 'WMS_ADD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddMi() {
        checkSpecifiedProperty("wmsAddMi");
        return convertEmptyToNull(_wmsAddMi);
    }

    /**
     * [set] WMS_ADD_MI: {VARCHAR(30)} <br>
     * WMS作成時間_分
     * @param wmsAddMi The value of the column 'WMS_ADD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddMi(String wmsAddMi) {
        registerModifiedProperty("wmsAddMi");
        _wmsAddMi = wmsAddMi;
    }

    /**
     * [get] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @return The value of the column 'WMS_ADD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddSs() {
        checkSpecifiedProperty("wmsAddSs");
        return convertEmptyToNull(_wmsAddSs);
    }

    /**
     * [set] WMS_ADD_SS: {VARCHAR(30)} <br>
     * WMS作成時間_秒
     * @param wmsAddSs The value of the column 'WMS_ADD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddSs(String wmsAddSs) {
        registerModifiedProperty("wmsAddSs");
        _wmsAddSs = wmsAddSs;
    }

    /**
     * [get] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @return The value of the column 'WMS_ADD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsAddUserCd() {
        checkSpecifiedProperty("wmsAddUserCd");
        return convertEmptyToNull(_wmsAddUserCd);
    }

    /**
     * [set] WMS_ADD_USER_CD: {VARCHAR(30)} <br>
     * WMS作成者
     * @param wmsAddUserCd The value of the column 'WMS_ADD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsAddUserCd(String wmsAddUserCd) {
        registerModifiedProperty("wmsAddUserCd");
        _wmsAddUserCd = wmsAddUserCd;
    }

    /**
     * [get] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @return The value of the column 'WMS_UPD_YYYY'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdYyyy() {
        checkSpecifiedProperty("wmsUpdYyyy");
        return convertEmptyToNull(_wmsUpdYyyy);
    }

    /**
     * [set] WMS_UPD_YYYY: {VARCHAR(30)} <br>
     * WMS更新日_年
     * @param wmsUpdYyyy The value of the column 'WMS_UPD_YYYY'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdYyyy(String wmsUpdYyyy) {
        registerModifiedProperty("wmsUpdYyyy");
        _wmsUpdYyyy = wmsUpdYyyy;
    }

    /**
     * [get] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @return The value of the column 'WMS_UPD_MM'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMm() {
        checkSpecifiedProperty("wmsUpdMm");
        return convertEmptyToNull(_wmsUpdMm);
    }

    /**
     * [set] WMS_UPD_MM: {VARCHAR(30)} <br>
     * WMS更新日_月
     * @param wmsUpdMm The value of the column 'WMS_UPD_MM'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMm(String wmsUpdMm) {
        registerModifiedProperty("wmsUpdMm");
        _wmsUpdMm = wmsUpdMm;
    }

    /**
     * [get] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @return The value of the column 'WMS_UPD_DD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdDd() {
        checkSpecifiedProperty("wmsUpdDd");
        return convertEmptyToNull(_wmsUpdDd);
    }

    /**
     * [set] WMS_UPD_DD: {VARCHAR(30)} <br>
     * WMS更新日_日
     * @param wmsUpdDd The value of the column 'WMS_UPD_DD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdDd(String wmsUpdDd) {
        registerModifiedProperty("wmsUpdDd");
        _wmsUpdDd = wmsUpdDd;
    }

    /**
     * [get] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @return The value of the column 'WMS_UPD_HH'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdHh() {
        checkSpecifiedProperty("wmsUpdHh");
        return convertEmptyToNull(_wmsUpdHh);
    }

    /**
     * [set] WMS_UPD_HH: {VARCHAR(30)} <br>
     * WMS更新時間_時
     * @param wmsUpdHh The value of the column 'WMS_UPD_HH'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdHh(String wmsUpdHh) {
        registerModifiedProperty("wmsUpdHh");
        _wmsUpdHh = wmsUpdHh;
    }

    /**
     * [get] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @return The value of the column 'WMS_UPD_MI'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdMi() {
        checkSpecifiedProperty("wmsUpdMi");
        return convertEmptyToNull(_wmsUpdMi);
    }

    /**
     * [set] WMS_UPD_MI: {VARCHAR(30)} <br>
     * WMS更新時間_分
     * @param wmsUpdMi The value of the column 'WMS_UPD_MI'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdMi(String wmsUpdMi) {
        registerModifiedProperty("wmsUpdMi");
        _wmsUpdMi = wmsUpdMi;
    }

    /**
     * [get] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @return The value of the column 'WMS_UPD_SS'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdSs() {
        checkSpecifiedProperty("wmsUpdSs");
        return convertEmptyToNull(_wmsUpdSs);
    }

    /**
     * [set] WMS_UPD_SS: {VARCHAR(30)} <br>
     * WMS更新時間_秒
     * @param wmsUpdSs The value of the column 'WMS_UPD_SS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdSs(String wmsUpdSs) {
        registerModifiedProperty("wmsUpdSs");
        _wmsUpdSs = wmsUpdSs;
    }

    /**
     * [get] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @return The value of the column 'WMS_UPD_USER_CD'. (NullAllowed even if selected: for no constraint)
     */
    public String getWmsUpdUserCd() {
        checkSpecifiedProperty("wmsUpdUserCd");
        return convertEmptyToNull(_wmsUpdUserCd);
    }

    /**
     * [set] WMS_UPD_USER_CD: {VARCHAR(30)} <br>
     * WMS更新者
     * @param wmsUpdUserCd The value of the column 'WMS_UPD_USER_CD'. (NullAllowed: null update allowed for no constraint)
     */
    public void setWmsUpdUserCd(String wmsUpdUserCd) {
        registerModifiedProperty("wmsUpdUserCd");
        _wmsUpdUserCd = wmsUpdUserCd;
    }

    /**
     * [get] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @return The value of the column 'SPARE_STR'. (NullAllowed even if selected: for no constraint)
     */
    public String getSpareStr() {
        checkSpecifiedProperty("spareStr");
        return convertEmptyToNull(_spareStr);
    }

    /**
     * [set] SPARE_STR: {VARCHAR(255)} <br>
     * 予備
     * @param spareStr The value of the column 'SPARE_STR'. (NullAllowed: null update allowed for no constraint)
     */
    public void setSpareStr(String spareStr) {
        registerModifiedProperty("spareStr");
        _spareStr = spareStr;
    }

    /**
     * [get] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @return The value of the column 'DEL_FLG'. (basically NotNull if selected: for the constraint)
     */
    public String getDelFlg() {
        checkSpecifiedProperty("delFlg");
        return convertEmptyToNull(_delFlg);
    }

    /**
     * [set] DEL_FLG: {NotNull, CHAR(1), default=[0], classification=DelFlg} <br>
     * 削除フラグ
     * @param delFlg The value of the column 'DEL_FLG'. (basically NotNull if update: for the constraint)
     */
    public void setDelFlg(String delFlg) {
        registerModifiedProperty("delFlg");
        _delFlg = delFlg;
    }

    /**
     * [get] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @return The value of the column 'VERSION_NO'. (basically NotNull if selected: for the constraint)
     */
    public Long getVersionNo() {
        checkSpecifiedProperty("versionNo");
        return _versionNo;
    }

    /**
     * [set] VERSION_NO: {NotNull, BIGINT(19), default=[0]} <br>
     * バージョンNo.
     * @param versionNo The value of the column 'VERSION_NO'. (basically NotNull if update: for the constraint)
     */
    public void setVersionNo(Long versionNo) {
        registerModifiedProperty("versionNo");
        _versionNo = versionNo;
    }

    /**
     * [get] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @return The value of the column 'CONTROL_NO'. (NullAllowed even if selected: for no constraint)
     */
    public Long getControlNo() {
        checkSpecifiedProperty("controlNo");
        return _controlNo;
    }

    /**
     * [set] CONTROL_NO: {IX, BIGINT(19)} <br>
     * コントロールNo.
     * @param controlNo The value of the column 'CONTROL_NO'. (NullAllowed: null update allowed for no constraint)
     */
    public void setControlNo(Long controlNo) {
        registerModifiedProperty("controlNo");
        _controlNo = controlNo;
    }

    /**
     * [get] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @return The value of the column 'ADD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getAddDt() {
        checkSpecifiedProperty("addDt");
        return _addDt;
    }

    /**
     * [set] ADD_DT: {DATETIME(19)} <br>
     * 登録日時
     * @param addDt The value of the column 'ADD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddDt(java.sql.Timestamp addDt) {
        registerModifiedProperty("addDt");
        _addDt = addDt;
    }

    /**
     * [get] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @return The value of the column 'ADD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddUser() {
        checkSpecifiedProperty("addUser");
        return convertEmptyToNull(_addUser);
    }

    /**
     * [set] ADD_USER: {VARCHAR(60)} <br>
     * 登録ユーザ
     * @param addUser The value of the column 'ADD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddUser(String addUser) {
        registerModifiedProperty("addUser");
        _addUser = addUser;
    }

    /**
     * [get] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @return The value of the column 'ADD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getAddProcess() {
        checkSpecifiedProperty("addProcess");
        return convertEmptyToNull(_addProcess);
    }

    /**
     * [set] ADD_PROCESS: {VARCHAR(255)} <br>
     * 登録プロセス
     * @param addProcess The value of the column 'ADD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setAddProcess(String addProcess) {
        registerModifiedProperty("addProcess");
        _addProcess = addProcess;
    }

    /**
     * [get] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @return The value of the column 'UPD_DT'. (NullAllowed even if selected: for no constraint)
     */
    public java.sql.Timestamp getUpdDt() {
        checkSpecifiedProperty("updDt");
        return _updDt;
    }

    /**
     * [set] UPD_DT: {DATETIME(19)} <br>
     * 更新日時
     * @param updDt The value of the column 'UPD_DT'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdDt(java.sql.Timestamp updDt) {
        registerModifiedProperty("updDt");
        _updDt = updDt;
    }

    /**
     * [get] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @return The value of the column 'UPD_USER'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdUser() {
        checkSpecifiedProperty("updUser");
        return convertEmptyToNull(_updUser);
    }

    /**
     * [set] UPD_USER: {VARCHAR(60)} <br>
     * 更新ユーザ
     * @param updUser The value of the column 'UPD_USER'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdUser(String updUser) {
        registerModifiedProperty("updUser");
        _updUser = updUser;
    }

    /**
     * [get] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @return The value of the column 'UPD_PROCESS'. (NullAllowed even if selected: for no constraint)
     */
    public String getUpdProcess() {
        checkSpecifiedProperty("updProcess");
        return convertEmptyToNull(_updProcess);
    }

    /**
     * [set] UPD_PROCESS: {VARCHAR(255)} <br>
     * 更新プロセス
     * @param updProcess The value of the column 'UPD_PROCESS'. (NullAllowed: null update allowed for no constraint)
     */
    public void setUpdProcess(String updProcess) {
        registerModifiedProperty("updProcess");
        _updProcess = updProcess;
    }
}
